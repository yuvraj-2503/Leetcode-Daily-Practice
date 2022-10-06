class TimeMap {
    
    HashMap<String, Timestamp> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Timestamp obj = new Timestamp();
        
        if (map.containsKey(key)) {
            obj = map.get(key);
        }
        
        obj.updateMaxMin(timestamp);
        obj.setValue(timestamp, value);
        map.put(key, obj);
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        
        Timestamp obj = map.get(key);
        
        return obj.getValue(timestamp);
    }
}

class Timestamp {
    
    HashMap<Integer, String> map;
    int min;
    int max;
    
    public Timestamp() {
        map = new HashMap<>();
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }
    
    void updateMaxMin(int key) {
        max = Math.max(max, key);
        min = Math.min(min, key);
    }
    
    void setValue(int key, String val) {
        map.put(key, val);
    }
    
    String getValue(int key) {
        if (map.containsKey(key)) return map.get(key);
        
        return search(key, min);
    }
    
    String search(int l, int r) {
        int val = binary(l, r);
        
        if (val == -1)
            return "";
        else
            return map.get(val);
    }
    
    int binary(int l, int r) {
        if (l >= max) return max;
        
        if (l < min || r > max || l == r) return -1;
        
        int mid = (l-r)/2 + r;
        
        if (map.containsKey(mid)) 
            return mid;
        else
            return Math.max(binary(l, mid+1), binary(mid-1, r));
    }
}