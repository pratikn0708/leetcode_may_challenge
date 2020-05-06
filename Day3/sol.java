class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         if (ransomNote == null || ransomNote.trim().isEmpty()) 
            return true;
        
        if (magazine == null || magazine.trim().isEmpty()) 
            return false;
        
        int arr[]=new int[26];
        
        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']++;
        }
        
        int matchedCharacters=0;
        for(int i=0;i<ransomNote.length();i++){
            if(arr[ransomNote.charAt(i)-'a']>0){
                matchedCharacters++;
                arr[ransomNote.charAt(i)-'a']--;
            }
        }
        
        if(matchedCharacters==ransomNote.length())
            return true;
        else 
            return false;
    }
        
}