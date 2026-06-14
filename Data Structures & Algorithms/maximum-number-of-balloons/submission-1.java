class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> chars = new HashMap<>();
        
        String s = "balloon";
        
        for(int i = 0; i < text.length(); i++) {
            chars.put(text.charAt(i), chars.getOrDefault(text.charAt(i), 0) + 1);
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < s.length(); i++) {
            
            int need = 1;
            
            if(s.charAt(i) == 'l' || s.charAt(i) == 'o') {
                need = 2;
            }
            
            int charCount = chars.getOrDefault(s.charAt(i), 0) / need;
            
            if(charCount == 0) {
                min = 0;
                break;
            } else {
                min = Math.min(charCount, min);
            }
        }
        
        return min;
    }
}