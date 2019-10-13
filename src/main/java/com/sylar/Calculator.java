package com.sylar;

import java.util.Stack;


/**
 *
 */
public class Calculator {

    //函数名
    final static String MAX_FUNC_NAME = "MAX";
    final static String MIN_FUNC_NAME = "MIN";

    //负数转换的符号
    final static String NEGATIVE_OPER = "@";

    //操作符优先级定义
    final static String[] OPERATOR_PRIORITY = new String[]{"+-", "*/", "^"};

    /**
     * 计算表达式
     *
     * @param express 表达式
     * @return 计算结果
     * @throws Exception
     */
    public double calcExpress(String express)throws Exception{

        String newExpress = express.replaceAll(" ", "");
        newExpress = calcFunc(newExpress, MAX_FUNC_NAME);
        newExpress = calcFunc(newExpress, MIN_FUNC_NAME);

        int bracketPos = newExpress.lastIndexOf("(");
        if(bracketPos== -1){
            if(newExpress.charAt(0) == '-'){
                newExpress = "0" + newExpress;
            }
            return directCalc(newExpress);
        }
        int rightBracketPos = newExpress.indexOf(")", bracketPos );
        if( rightBracketPos == -1){
            throw new Exception("bracket is not match: " + newExpress );
        }
        String subExpress = newExpress.substring(bracketPos + 1, rightBracketPos );
        if(subExpress.charAt(0) == '-') {
            subExpress = "0" + subExpress;
        }
        double subResult = directCalc(subExpress);
        String subResultStr = calcNegative(subResult);
        subExpress = newExpress.substring(0, bracketPos) + subResultStr + newExpress.substring(rightBracketPos+1);
        return calcExpress( subExpress );
    }

    /**
     * 取出括号后的表达式计算
     *
     * @param express
     * @return
     * @throws Exception
     */
    private double directCalc(String express)throws Exception{
        Stack<String> operatorStack = new Stack<>();
        Stack<Double>numberStack = new Stack<>();

        for( int pos = 0; pos < express.length(); ){
            char ch = express.charAt(pos);
            if( ch >= '0' && ch <= '9' || ch == NEGATIVE_OPER.charAt(0) || ch == '.'){
                //处理操作数，包括负数的特殊处理
                boolean negative = false;
                if( ch == NEGATIVE_OPER.charAt(0) ){
                    negative = true;
                    pos++;
                    ch = express.charAt(pos);
                }
                int numberBeginPos = pos;
                while(ch >= '0' && ch <= '9' || ch == '.'){
                    pos++;
                    if( pos < express.length() ){
                        ch = express.charAt(pos);
                    }else{
                        break;
                    }
                }
                double operNumber = Double.valueOf( express.substring(numberBeginPos, pos) );
                if(negative){
                    operNumber = operNumber * (-1);
                }
                numberStack.push( operNumber );
            }else if( isOperator(ch) ){
                if(operatorStack.isEmpty()){
                    operatorStack.push(String.valueOf(ch));
                }else{
                    calc(operatorStack, numberStack, String.valueOf(ch));
                }
                pos++;
            }else{
                throw new Exception("express is invalid, operator = " + ch + " express = " + express );
            }
        }

        if( !operatorStack.isEmpty() ){
            calc(operatorStack, numberStack);
        }
        if(!numberStack.empty()){
            return numberStack.pop();
        }

        return 0;
    }

    /**
     * 已经压栈的操作符和操作数，进行计算
     * @param operList
     * @param numbList
     * @throws Exception
     */
    private void calc(Stack<String> operList, Stack<Double>numbList)throws Exception{
        double right = numbList.pop();
        double left = numbList.pop();
        String oper = operList.pop();
        double result = calc(left, right, oper);
        numbList.push(result);
        if( !operList.isEmpty() ){
            calc(operList, numbList);
        }
    }

    /**
     * 当前操作符与栈中的操作符，优先级高的计算行计算
     *
     * @param operList
     * @param numbList
     * @param oper
     * @throws Exception
     */
    private void calc(Stack<String> operList, Stack<Double>numbList, String oper)throws Exception{
        String stackOper = operList.peek();
        if( getPriority(stackOper.charAt(0)) < getPriority(oper.charAt(0)) ) {
            operList.push(oper);
            return;
        }
        double right = numbList.pop();
        double left = numbList.pop();
        stackOper = operList.pop();
        double result = calc(left, right, stackOper);
        numbList.push(result);
        if( operList.isEmpty() ){
            operList.push(oper);
        }else{
            calc(operList, numbList, oper);
        }
    }

    /**
     * 计算运算符
     *
     * @param left
     * @param right
     * @param oper
     * @return
     * @throws Exception
     */
    private double calc(double left, double right, String oper)throws Exception{
        switch(oper){
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            case "^":
                return Math.pow( left, right );
            default:
                throw new Exception("do not support operator: " + oper);
        }
    }

    /**
     * 是否是运算符
     *
     * @param op
     * @return
     */
    private boolean isOperator(char op){
        for(String ops : OPERATOR_PRIORITY){
            if( ops.indexOf(op) != -1){
                return true;
            }
        }
        return false;
    }

    /**
     * 获取运算符优先级
     *
     * @param op
     * @return
     */
    private int getPriority(char op)throws Exception{
        for(int i = 0; i < OPERATOR_PRIORITY.length; ++i ){
            if( OPERATOR_PRIORITY[i].indexOf(op) != -1 ){
                return i;
            }
        }
        throw new Exception("don't support operator: " + op);
    }

    /**
     * 计算函数
     *
     * @param express
     * @param funcName
     * @return 返回表达式
     * @throws Exception
     */
    private String calcFunc(String express, String funcName)throws Exception{
        if(funcName == null || "".equals(funcName) ){
            return express;
        }

        //不区分大小写
        int funcBeginPos = express.toUpperCase().lastIndexOf(funcName);
        if( funcBeginPos == -1 ){
            return express;
        }

        int bracketPos = express.indexOf("(", funcBeginPos + MAX_FUNC_NAME.length() );
        if( bracketPos == -1 ){
            throw new Exception("max function syntax");
        }

        int leftBracketCount = 0;
        boolean midComma = false;
        int midCommaPos = 0;
        for(int i = bracketPos; i < express.length(); ++i){
            if( express.charAt(i) == '(' ){
                leftBracketCount++;
                continue;
            }
            if( express.charAt(i) == ','){
                midComma = true;
                midCommaPos = i;
            }
            if(express.charAt(i) == ')'){
                leftBracketCount--;
            }
            if(leftBracketCount == 0){
                String leftSubExpress = express.substring(bracketPos + 1, midCommaPos);
                String rightSubExpress = express.substring(midCommaPos + 1, i);
                double funcResult = calcFunc( leftSubExpress, rightSubExpress, funcName);
                String subExpress = express.replace( express.substring(funcBeginPos, i+1), calcNegative(funcResult) );
                return calcFunc(subExpress, funcName);
            }
        }
        throw new Exception("do not support this function = " + funcName );
    }

    private double calcFunc(String leftExpress, String rightExpress, String funcName )throws Exception {
        double leftResult = calcExpress(leftExpress);
        double rightResult = calcExpress(rightExpress);
        double funcResult = 0;
        switch(funcName){
            case MAX_FUNC_NAME:
                funcResult = Math.max(leftResult, rightResult);
                break;
            case MIN_FUNC_NAME:
                funcResult = Math.min(leftResult, rightResult);
                break;
            default:
                throw new Exception("do not support this function = " + funcName );
        }

        return funcResult;
    }

    /**
     * 处理负数
     *
     * @param number
     * @return
     */
    private String calcNegative(double number){
        if (number >= 0) {
            return String.valueOf(number);
        }

        return NEGATIVE_OPER + String.valueOf(Math.abs(number) );
    }
}