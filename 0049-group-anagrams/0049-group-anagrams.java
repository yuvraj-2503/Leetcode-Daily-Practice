class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> ans= new ArrayList<>();
        Map<String, ArrayList<String>> mp= new HashMap<>();
        for (String s : str) {
            String tmp= s;
            s = sortString(s);
            if (!mp.containsKey(s)) {
                mp.put(s, new ArrayList<>());
                mp.get(s).add(tmp);
            } else
                mp.get(s).add(tmp);
        }
        for(String x: mp.keySet()){
            ans.add(mp.get(x));
        }
        return ans;
    }

    String sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}