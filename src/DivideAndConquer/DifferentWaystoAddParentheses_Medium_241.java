package DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/17 17:17
 */
public class DifferentWaystoAddParentheses_Medium_241 {
    public static List<Integer> diffWaysToCompute(String expression) {
        if (expression.length() == 1){
            ArrayList<Integer> out = new ArrayList<>();
            out.add(Integer.parseInt(expression));
            return out;
        }
        ArrayList<Integer> output = new ArrayList<>();

        for (int firstPartTail = 0; firstPartTail < expression.length()-2; firstPartTail += 2){
            String left = expression.substring(0, firstPartTail + 1);
            String right = expression.substring(firstPartTail + 2, expression.length());
            System.out.println(left);
            System.out.println(right);
            List<Integer> firstPart = diffWaysToCompute(left);
            List<Integer> secondPart = diffWaysToCompute(right);

            char op = expression.charAt(firstPartTail + 1);
            output.addAll(merge(firstPart, secondPart, op));
            System.out.println(output);
        }
        return output;
    }

    public static List<Integer> merge(List<Integer> l1, List<Integer> l2,char op){
        ArrayList<Integer> output = new ArrayList<>();
        switch (op){
            case '+':
                for (int i = 0; i < l1.size(); i++){
                    for (int j = 0; j < l2.size(); j++){
                        output.add(l1.get(i) + l2.get(j));
                        }
                    }
                break;
            case '-':
                for (int i = 0; i < l1.size(); i++){
                    for (int j = 0; j < l2.size(); j++){
                        output.add(l1.get(i) - l2.get(j));
                    }
                }
                break;
            case '*':
                for (int i = 0; i < l1.size(); i++){
                    for (int j = 0; j < l2.size(); j++){
                        output.add(l1.get(i) * l2.get(j));
                    }
                }
                break;
            default:
                break;
        }
        return output;

    }

    public static void main(String[] args) {
        System.out.println(diffWaysToCompute("1-3+3"));
    }
}
