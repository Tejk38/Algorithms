package String;
// https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParser {
    static String interpreter(String command){

        StringBuilder s = new StringBuilder();



        for (int i = 0; i < command.length() ; i++) {

            if (s.charAt(i) == 'G'){
                s.append("G");

            }
            if (s.charAt(i) == '('){
                if (s.charAt(i+1) == ')'){
                    s.append("o");

                }
            }
            else {
                s.append("al");
            }

        }
        return s.toString();

    }

    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(command.length());
        System.out.println(interpreter(command));

    }
}
