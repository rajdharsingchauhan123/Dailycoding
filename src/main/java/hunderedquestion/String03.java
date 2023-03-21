package hunderedquestion;

import java.util.HashMap;
import java.util.Map;

public class String03 {
    public int lengthOfLongestSubstring(String s){
        int maxLength=0;
        for (int i=0;i<s.length();i++){
            StringBuilder currentSubstring=new StringBuilder();
            for(int j=i;j<s.length();j++){

                if(currentSubstring.indexOf(String.valueOf(s.charAt(j)))!=-1){
                    break;
                }
                currentSubstring.append(j);
                maxLength=Math.max(maxLength,currentSubstring.length());

            }
        }
        return maxLength;
    }
    public int lengthOfLongestSubString(String s){
        int maxLength=0;
        Map<Character,Integer>VisitedCharacters=new HashMap<>();

        for(int right=0,left=0;right<s.length();right++){
            if(VisitedCharacters.containsKey(s.charAt(right))&& VisitedCharacters.get(s.charAt(right))>=left){
                left=VisitedCharacters.get(s.charAt(right))+1;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;

    }
}
