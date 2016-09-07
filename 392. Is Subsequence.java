public class Solution {
    public boolean isSubsequence(String s, String t) {
        int pos = 0;
        for (int i=0;i<s.length();i++){
            boolean flag = false;
            char temp = s.charAt(i);
            while (!flag){
                if (pos == t.length())return false;
                if (temp == t.charAt(pos) && pos<t.length())
                    flag = true;
                pos++;
            }
            if (!flag) return false;
        }

        return true;
    }
}
