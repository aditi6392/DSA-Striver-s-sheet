package StackAndQueue;

import java.util.Stack;

public class Question1 {
    public static boolean isBalanced(String s){

        Stack<Character> st=new Stack();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            //OPeing bracket push
            if (ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            //if closing brackin , check top of stack
            else if (ch==')' || ch==']' || ch=='}') {
                if (st.isEmpty()) return false;

                char top=st.pop();
                //check matching pairs
                if ((ch==')' && top !='(') || (ch==']' && top!='[') || (ch=='}' && top!='{')) return false;


            }
        }
        return st.isEmpty();
    }

  public  static void main() {
        String expression = "{[)]}";
        if (isBalanced(expression)) {
            System.out.println(expression + " is balanced");
        } else {
            System.out.println(expression + " is not balanced");
        }
    }
}

