import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Character temp, top;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            top = stack.pop();
            if ((temp == ')' && top != '(') || (temp == ']' && top != '[') || (temp == '}' && top != '{')) {
                return false;
            }
        }
        return (stack.isEmpty());
    }
}