class Solution {
    public int maxDepth(String s) {
        int current = 0, result = 0;
        for(int i = 0; i < s.length(); i++) {
            char pointer = s.charAt(i);
            if(pointer =='(') {
                current++;
                result = Math.max(current, result);
            }
            if(pointer == ')'){
                current--;
            }
        }
        return result;
    }
}