package my_trial.demo.DSA;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_consecutive_sequence {
    public int[] method1(int[] arr){
        int start=0;
        int longest=0;
        HashSet<Integer>set=new HashSet<>();
        for(int values:arr){
            set.add(values);
        }//values ahh set uh appuren
        for(int num:set){
            //ippo set la irunthu edukkuren
            if(!set.contains(num-1)){
                int current=num;
                int count=1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                if(count>longest){
                    longest=count;
                    start=num;//num is the starting number of the sequence but it cant be accessed outside the world so assign it to the start

                }
            }

        }
        int result[]=new int[longest];
        for(int i=0;i<longest;i++){
            result[i]=start+i;//start+i thana consecutive ah eduthro
        }
        return result;
    }
    public static void main (String args[]){
        Longest_consecutive_sequence lcs=new Longest_consecutive_sequence();
        int[] arr={100,4,200,1,3,2};
        int result[]=lcs.method1(arr);
        System.out.println("longest length:"+result.length);//result array ooda length tha longest length uh kkoda
        System.out.println(Arrays.toString(result));
    }
}
