class Solution {
    public String reverseWords(String s) {
        String[] text = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = text.length-1; i >= 0; i--) {
            ans.append(text[i]);
            if(i > 0) {
                ans.append(" ");
            }
        }
        return ans.toString(); //Convert to String
    }
}