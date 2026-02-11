class Solution {
    public int myAtoi(String s) {
        int num = 0;
        int sign = 1;
        boolean numStart = false;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (!numStart && (c > '9' || c < '0')) {
                if (c == '-') {
                    numStart = true;
                    sign = -1;
                    continue;
                } else if (c == '+') {
                    numStart = true;
                    sign = 1;
                    continue;
                } else if (c == ' ') {
                    continue;
                } else {
                    break;
                }
            } else if (c > '9' || c < '0') {
                break;
            } else {
                numStart = true;
                System.out.println(num * sign);
                if (num * sign + 0.1 * (c - '0') > (double) Integer.MAX_VALUE / 10
                        || num * sign - 0.1 * (c - '0') < (double) Integer.MIN_VALUE / 10) {
                    if (sign == 1) {
                        return Integer.MAX_VALUE;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                }
                num = num * 10 + (c - '0');
            }
        }
        return sign * num;
    }
}