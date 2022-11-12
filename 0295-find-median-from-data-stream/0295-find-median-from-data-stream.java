import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MedianFinder {
    List<Integer> arr;

    public MedianFinder() {
        arr = new ArrayList<>();
    }

    public void addNum(int num) {
        int i;
        if(arr.size() > 0){
            for (i = 0; (i < arr.size()  && arr.get(i) < num); i++);
            if(i == -1){
                i = 0;
            }
            arr.add(i , num);
        }else{
            arr.add(num);
        }
    }

    public double findMedian() {
//        Collections.sort(arr);
        int n = arr.size();
        if(n % 2 == 1){
            return (double)arr.get(n/2);
        }else{
            int x = n/2;
            double y = (arr.get(x-1) + arr.get(x)) / 2.0;
            return y;
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */