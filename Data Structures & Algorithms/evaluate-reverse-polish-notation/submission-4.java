

class Solution {
    public int evalRPN(String[] tokens) {
      Deque<Integer> stack = new ArrayDeque<>();

      for (String c: tokens) {
        if(c.equals("+") || c.equals("*") || c.equals("/") ||c.equals("-")) {
            int b = stack.pop();
            int a = stack.pop();

            switch(c) {
                case "-":
                    stack.push(a-b);
                    break;
                case "*":
                    stack.push(a*b);
                    break;
                case "/":
                    stack.push(a/b);
                    break;
                default:
                    stack.push(a+b);
                    break; }
        }


        if(!(c.equals("+") || c.equals("*") || c.equals("/") ||c.equals("-"))) stack.push(Integer.parseInt(c));
      }
    
    return stack.pop();

    }
    
    }