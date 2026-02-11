class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        if (prefix.equals("")) {
            return "";
        }
        int temp;
        String minstr, maxstr;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].equals("")) {
                return "";
            }
            temp = Math.min(prefix.length(), strs[i].length());
            if (prefix.length() > strs[i].length()) {
                temp = strs[i].length();
                minstr = strs[i];
                maxstr = prefix;
            } else {
                temp = prefix.length();
                maxstr = strs[i];
                minstr = prefix;
            }
            for (int j = 0; j < temp; j++) {
                if (minstr.charAt(j) != maxstr.charAt(j)) {
                    prefix = minstr.substring(0, j);
                    break;
                }
                if (j == temp - 1 && temp == strs[i].length()) {
                    prefix = minstr;
                }
            }
        }
        return prefix;
    }
}