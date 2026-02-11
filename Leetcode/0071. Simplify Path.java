import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        for (int i = 0; i < dirs.length; i++) {
            System.out.println("'" + dirs[i] + "'");
        }
        Stack<String> stack = new Stack<>();
        for (String s : dirs) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (s.length() != 0 && !s.equals(".")) {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        String out = "";
        while (!stack.isEmpty()) {
            out = "/" + stack.pop() + out;
        }
        return out;
    }
}