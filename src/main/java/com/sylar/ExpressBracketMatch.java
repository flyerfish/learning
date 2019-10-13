package com.sylar;

import java.util.Stack;

/**
 * 表达式括号匹配
 *
 * 编写一道程序，从标准输入得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式。
 * 例如，给定输入： 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
 * 你的程序应该输出： ((1 + 2) * ((3 - 4) * (5 - 6)))
 */
public class ExpressBracketMatch {

    //操作符优先级定义
    final static String OPERATOR_PRIORITY[] = new String[]{"+-", "*/", "^"};

    //需要考虑操作符优先级
    private boolean needPriority = true;

    public ExpressBracketMatch(){
        this.needPriority = true;
    }

    public ExpressBracketMatch(boolean needPriority){
        this.needPriority = needPriority;
    }

    /**
     * 表达式匹配
     *
     * @param express 表达式参数，可以包含空白
     * @return
     */
    public String autoMatch(String express) {
        String newExpress = express.replaceAll("\\s", "");
        Stack<String> operStack = new Stack<>();
        Stack<String> dataStack = new Stack<>();

        for (int i = 0; i < newExpress.length(); i++) {
            String ss = String.valueOf( newExpress.charAt(i) );
            if (isDigit(ss.charAt(0))) {
                //处理数字的情况
                dataStack.push(ss);
            } else if ( isOperator(ss.charAt(0) ) ) {
                if(false == this.needPriority){
                    operStack.push(ss);
                    continue;
                }
                //处理操作符
                if (operStack.isEmpty()) {
                    operStack.push(ss);
                } else {
                    //操作符优先级处理
                    doMatch(dataStack, operStack, ss.charAt(0));
                }
            } else if( "(".equals(ss) ) {
                operStack.push(ss);
            } else {
                // 处理右括号的情况
                doMatch(dataStack, operStack);
            }
        }

        while (operStack.size() > 0) {
            String preOp = operStack.peek();
            if( "(".equals(preOp) ){
                operStack.pop();
                continue;
            }
            doMatch(dataStack, operStack);
        }

        return dataStack.pop();
    }

    /**
     * 匹配括号
     *
     * @param dataStack 操作数栈
     * @param operStack 操作符栈
     */
    private void doMatch(Stack<String> dataStack, Stack<String> operStack ){
        if(operStack.isEmpty()){
            return;
        }

        String right = dataStack.pop();
        String left = dataStack.pop();
        String opt = operStack.pop();
        String bracket = ")";
        if( !operStack.isEmpty() && operStack.peek().equals(")") ){
            operStack.pop();
        }
        dataStack.push("(" + left + opt + right + bracket);
    }

    /**
     * 匹配括号，处理优先级
     *
     * @param dataStack 操作数栈
     * @param operStack 操作符栈
     * @param curOper 当前操作符
     */
    private void doMatch(Stack<String> dataStack, Stack<String> operStack, char curOper ){
        if( operStack.isEmpty() ){
            operStack.push( String.valueOf(curOper) );
            return;
        }

        String preOp = operStack.peek();
        if ( preOp.equals("(") ) {
            operStack.pop();
            operStack.push( String.valueOf(curOper) );
            return;
        }

        if (getPriority(preOp.charAt(0)) >= getPriority(curOper)) {
            String right = dataStack.pop();
            String left = dataStack.pop();
            String opt = operStack.pop();
            String bracket = ")";
            if ( !operStack.isEmpty() && operStack.peek().equals(")") ) {
                operStack.pop();
            }
            dataStack.push("(" + left + opt + right + bracket);
            doMatch(dataStack, operStack, curOper);
        }else{
            operStack.push(String.valueOf(curOper));
        }
    }

    /**
     * 是否数字
     *
     * @param ch 数字参数
     * @return
     */
    private boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    /**
     * 是否操作符
     *
     * @param op 操作符
     * @return
     */
    private boolean isOperator(char op){
        for(String ops : OPERATOR_PRIORITY ){
            if( ops.indexOf(op) != -1 ) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取操作符优先级
     *
     * @param op 操作符
     * @return
     */
    private int getPriority(char op){
        for( int i = 0; i < OPERATOR_PRIORITY.length; ++i ){
            if( OPERATOR_PRIORITY[i].indexOf(op) != -1 ){
                return i;
            }
        }
        throw new RuntimeException( new Exception("don't support operator: " + op) );
    }
}