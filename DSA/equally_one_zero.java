package my_trial.demo.DSA;

import java.util.HashMap;

public class equally_one_zero {
    public void method1(){
        int[] arr={1,0,1,0,0,1,1,0,1,0,1,0,1,0,1,0,0,1,1,0,0,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        int length=0;
        int max_length=0;
        int start=0;
        int end=0;
        int sum=0;
        map.put(0,-1);//first ye map la podu vaikkurom sum=0,index=-1
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                sum-=1;
            }
            else{
                sum+=1;
            }
            if(map.containsKey(sum)){
                length=i-map.get(sum);
                if(length>max_length){
                    max_length=length;
                    start=map.get(sum)+1;
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
        System.out.println();
        System.out.println(max_length);
    }
    public static void main(String args[]){
        equally_one_zero eoz=new equally_one_zero();
        eoz.method1();
    }
}
