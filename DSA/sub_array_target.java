package my_trial.demo.DSA;

import java.util.Arrays;

public class sub_array_target
{
    public void mathod1(int[] arr){
        int k=3;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                count +=arr[j];
                if(count==k){
                    start=i;
                    end=j;
                    break;
                }
            }
            //i loop ah break pannno illana 1 2 3 la 3 madu ans ah vanthro
            if(count==k){//boolean vachum pannalam
                break;
            }
        }
        int[] result=new int[arr.length];
        int index=0;
        for(int g=start;g<=end;g++){
            result[index]=arr[g];
            index++;
        }
        for(int m=0;m<index;m++){
            System.out.print(result[m]+" ");
        }
    }

    public static void main(String args[]){
        int[] arr={1,2,3};
        sub_array_target sat=new sub_array_target();
        sat.mathod1(arr);

    }
}
