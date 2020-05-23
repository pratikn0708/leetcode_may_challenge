class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
	    PriorityQueue<Character> queue = new PriorityQueue<>((x,y)->map.get(y) - map.get(x));
	    for(char ch:s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
	    for(char ch: map.keySet()) queue.offer(ch);
	    StringBuffer sb = new StringBuffer();
	    while(!queue.isEmpty()) {
		    char ch =queue.poll();
		    for(int i=0;i<map.get(ch);i++)
			    sb.append(ch);
	    }
	    return sb.toString();
        
    }
}