public class Solution {
    public String reverseVowels(String s) {
        if(s.equals(""))return s;
        StringBuffer sb = new StringBuffer(s);
        int i = 0;
        int j = s.length() - 1;
/*        while(i != j){
            if(s.charAt(i) != 'a' && s.charAt(i) != 'e' &&s.charAt(i) != 'i' &&s.charAt(i) != 'o' &&s.charAt(i) != 'u'){i++;continue;}
            if(s.charAt(j) != 'a' && s.charAt(j) != 'e' &&s.charAt(j) != 'i' &&s.charAt(j) != 'o' &&s.charAt(j) != 'u'){j--;continue;}
            if((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                &&
               (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u')
                ){
                    char temp = s.charAt(j);
                    sb.setCharAt(j,s.charAt(i));
                    sb.setCharAt(i,temp);
                    i++;
                    j--;
                }
        }*/
        for(;i < j;){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u' 
              && a != 'A' && a != 'E' && a != 'I' && a != 'O' && a != 'U' 
            ){i++;continue;}
            else if(b != 'a' && b != 'e' && b != 'i' && b != 'o' && b != 'u'
              && b != 'A' && b != 'E' && b != 'I' && b != 'O' && b != 'U'
            ){j--;continue;}
            else{
                char temp = s.charAt(j);
                    sb.setCharAt(j,s.charAt(i));
                    sb.setCharAt(i,temp);
                    i++;
                    j--;
            } 
        }
        
        return sb.toString();
    }
    
}

// nothing to say
