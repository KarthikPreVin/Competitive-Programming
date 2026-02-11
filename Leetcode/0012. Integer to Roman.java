import java.util.*;

class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> priority = new HashMap<>();
        priority.put(0, "I");
        priority.put(1, "V");
        priority.put(2, "X");
        priority.put(3, "L");
        priority.put(4, "C");
        priority.put(5, "D");
        priority.put(6, "M");
        String out = "";
        int digit, offset = 0;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            if (digit == 1) {
                out = priority.get(offset) + out;
            } else if (digit == 1) {
                out = priority.get(offset) + out;
            } else if (digit == 2) {
                out = priority.get(offset).repeat(2) + out;
            } else if (digit == 3) {
                out = priority.get(offset).repeat(3) + out;
            } else if (digit == 4) {
                out = priority.get(offset) + priority.get(offset + 1) + out;
            } else if (digit == 5) {
                out = priority.get(offset + 1) + out;
            } else if (digit == 6) {
                out = priority.get(offset + 1) + priority.get(offset) + out;
            } else if (digit == 7) {
                out = priority.get(offset + 1) + priority.get(offset).repeat(2) + out;
            } else if (digit == 8) {
                out = priority.get(offset + 1) + priority.get(offset).repeat(3) + out;
            } else if (digit == 9) {
                out = priority.get(offset) + priority.get(offset + 2) + out;
            }
            offset += 2;
        }
        return out;
    }
}