package UchicagoPlacementExam;

import java.util.Stack;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/9/3 23:23
 */
public class ProblemE {
    private static String SYNTAX_ERROR = "SYNTAX ERROR";
    private static String TYPE_ERROR = "TYPE ERROR";

    private static String postfixCalculate(String[] input){
        Stack<String> stack = new Stack<>();
        for (String s: input){
            if (s.equals("+") || s.equals("*") || s.equals("==")){
                if (stack.size() < 2){
                    return SYNTAX_ERROR;
                }
                String s1 = stack.pop();
                String s2 = stack.pop();
                if (s1.equals("true") || s1.equals("false") || s2.equals("true") || s2.equals("false")){
                    if ((s1.equals("true") || s1.equals("true")) && (s2.equals("true") || s2.equals("true"))){
                        return TYPE_ERROR;
                    }
                    else {
                        return TYPE_ERROR;
                    }
                }
                else{
                    if (s.equals("+")){
                        stack.push(String.valueOf(Integer.parseInt(s1) + Integer.parseInt(s2)));
                    }
                    else if (s.equals("*")){
                        stack.push(String.valueOf(Integer.parseInt(s1) * Integer.parseInt(s2)));
                    }
                    else{
                        stack.push(String.valueOf(Integer.parseInt(s1) == Integer.parseInt(s2)));
                    }
                }
            }
            else if (s.equals("and") || s.equals("or")){
                if (stack.size() < 2){
                    return SYNTAX_ERROR;
                }
                String s1 = stack.pop();
                String s2 = stack.pop();
                if (!((s1.equals("true") || s1.equals("false")) && (s2.equals("true") || s2.equals("false")))){
                    return TYPE_ERROR;
                }
                else{
                    if (s.equals("and")){
                        stack.push(String.valueOf(Boolean.parseBoolean(s1) && Boolean.parseBoolean(s2)));
                    }
                    else if (s.equals("or")){
                        stack.push(String.valueOf(Boolean.parseBoolean(s1) || Boolean.parseBoolean(s2)));
                    }
                }
            }
            else{
                stack.push(s);
            }
        }
        if (stack.size() == 0 || stack.size() > 1){
            return SYNTAX_ERROR;
        }
        return stack.pop();


    }

    public static void main(String[] args){

    }


}
