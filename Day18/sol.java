class Solution {
    public boolean checkInclusion(String s1, String s2) {
         ArrayList<Integer> rst = new ArrayList<>();
        if (s1 == null || s1.length() == 0 || s1.length() > s2.length()) {
            return false;
        }

        int[] map_s1 = new int[26];
        int[] map_s2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            map_s1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            map_s2[s2.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (isMatch(map_s1, map_s2)) {
                return true;
            }
            map_s2[s2.charAt(i+s1.length()) - 'a']++;
            map_s2[s2.charAt(i) - 'a']--;
        }
        if (isMatch(map_s1, map_s2)) {
            return true;
        }
        return false;
    }

    private boolean isMatch(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}