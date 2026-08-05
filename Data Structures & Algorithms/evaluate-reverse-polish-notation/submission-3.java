

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String c: tokens) {
            if(c.equals("+") || c.equals("-") ||c.equals("*") ||c.equals("/")) {
                int a  = stack.pop();
                int b = stack.pop();

                switch(c) {
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "/":
                        stack.push(b/a);
                        break;
                    default:
                      stack.push(a*b);
                      break;
                }
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.pop();


    }




    
    }