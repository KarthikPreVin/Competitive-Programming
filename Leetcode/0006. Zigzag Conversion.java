class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        int skip = numRows + numRows - 2;
        String out = "";
        // boolean first = true;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += skip) {
                if (i == 0 || i == numRows - 1) {
                    // one per col
                    out += s.charAt(j);
                } else {
                    // two per col
                    // System.out.println(i+" ("+j+","+(j+skip-2*i)+")")
                    out += s.charAt(j);
                    if (j + skip - 2 * i < s.length()) {
                        out += s.charAt(j + skip - 2 * i);
                    }
                }
            }
        }
        return out;
    }
}