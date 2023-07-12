package Heaps;

import java.util.ArrayList;

// https://leetcode.com/problems/find-median-from-data-stream/description/
public class MedianDataStream {
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(10);
        mf.addNum(20);
        mf.addNum(30);
        mf.addNum(40);
        mf.addNum(50);
        System.out.println(mf.findMedian());
    }
}

class MedianFinder {
    ArrayList<Integer> list;
    public MedianFinder() {
        this.list = new ArrayList<>();
    }

    public void addNum(int num) {
        if(list.size() == 0){
            list.add(0, num);
        }else{
            int i = 0;
            while(i < list.size()-1 && list.get(i) <= num) i++;

            if(list.get(i) <= num){
                list.add(i+1, num);
            }else{
                list.add(i , num);
            }
        }
    }

    public double findMedian() {
        int n = list.size();
        if(n == 0) return 0;
        if(n%2 == 1) return list.get(n/2);
        return (double)(list.get(n/2) + list.get(n/2 - 1))/2;
    }
}
