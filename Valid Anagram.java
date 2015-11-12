/*public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        boolean flag;
        for(int i = 0;i < t.length();i++){
        flag = false;
            for(int j = 0;j < s.length();j++)
            if(t.charAt(i) == s.charAt(j)){
                flag = true;
                s = s.substring(0,i) + 'A' + s.substring(i + 1);
                break;
            }
        if(!flag) return false;
        }
        return true;
    }
} */

public class Solution{
    public boolean isAnagram(String s,String t){
        if(s.length() != t.length())return false;
        
        char tlist[] = t.toCharArray();
        char slist[] = s.toCharArray();
        //int length = tlist.length;
        
        Arrays.sort(tlist);
        Arrays.sort(slist);
        
        if(new String(slist).equals(new String(tlist)))return true;
        return false;
    }
}
