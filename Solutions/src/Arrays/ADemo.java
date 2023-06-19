package Arrays;

import java.util.*;

public class ADemo {
    public static void main(String[] args) {
        System.out.println(distributeTicket(25,1));
    }

    public static int distributeTicket(int N,int K)
    {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i<= N; i++){
            list.add(i);
        }
        int flag = 0;
        while(!list.isEmpty()){
            if(flag == 0){
                for(int i = 0; i< K; i++){
                    list.remove(i);
                    if(list.size() == 1){
                        return list.get(0);
                    }

                }
                flag = 1;
            }else{
                for(int i = 0; i< K; i++){
                    list.remove(list.size()-i-1);
                    if(list.size() == 1){
                        return list.get(0);
                    }
                }
                flag = 0;
            }
        }

        return -1;
    }
}
