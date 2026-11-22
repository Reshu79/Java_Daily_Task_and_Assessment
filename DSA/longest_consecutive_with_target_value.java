package my_trial.demo.DSA;

import java.util.HashMap;

public class longest_consecutive_with_target_value {
    public void method1(){
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]={4,3,2,6,1};
        int sum=0;
        int target=9;
        int length=0;
        int max_length=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];

            if(sum==target){
                length=i+1;
                start=0;
                end=i;
            }

            if(map.containsKey(sum-target)){
                length=i-map.get(sum-target);
                if(length>max_length){
                    max_length=length;
                    start=map.get(sum-target)+1;
                    end=i;
                }
            }
            else{
                map.put(sum,i);
            }
        }

        for(int k=start;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println("longest length:"+max_length);
    }
    public static void main(String args[]){
        longest_consecutive_with_target_value lcwtv=new longest_consecutive_with_target_value();
        lcwtv.method1();
    }
}
