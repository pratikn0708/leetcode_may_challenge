class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++){
            String temp=s.substring(i,i+p.length());
            if(anagram(temp,p))
                al.add(i);
        }
        
        return al;
    }
    
    private boolean anagram(String string, String p){
        System.out.println(string);
        int c[]=new int[26];
        for(int i=0;i<string.length();i++){
            c[string.charAt(i)-'a']++;
        }
        
        for(int i=0;i<p.length();i++){
            c[p.charAt(i)-'a']--;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!=0)
                return false;
        }
        return true;
    }
}