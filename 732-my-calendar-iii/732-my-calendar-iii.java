class MyCalendarThree {
    private Map<Integer,Integer> timeScheduler;
    public MyCalendarThree() {
        timeScheduler = new TreeMap<Integer, Integer>();
    }
	
    public int book(int start, int end) {
        int s = timeScheduler.containsKey(start)? timeScheduler.get(start)+1 : 1;
        timeScheduler.put(start, s);

        int e = timeScheduler.containsKey(end)? timeScheduler.get(end)-1 : -1;
        timeScheduler.put(end, e);

        int k = 0;
        int delta = 0;
        for (int d : timeScheduler.values()){
            delta += d;
            k = Integer.max(k, delta);
        }
        return k;
    }
}