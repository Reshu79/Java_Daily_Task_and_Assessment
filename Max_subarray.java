package my_trial.demo.DSA;

public class Max_subarray
{
    public void method(){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int total_count=0;
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            int curr_count=0;
            for(int j=i;j<n;j++){
                curr_count=curr_count+arr[j];
                if(curr_count>total_count){
                    total_count=curr_count;
                    start=i;
                    end=j;
                }
            }

        }
        for(int k=start;k<=end;k++){
            System.out.print(arr[k]+" ");
            
        }
    }

    public static void main(String args[]){
        Max_subarray ms=new Max_subarray();
        ms.method();
    }
}
