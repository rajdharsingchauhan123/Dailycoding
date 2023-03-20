package hunderedquestion;

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
}
