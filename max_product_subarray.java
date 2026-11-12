package my_trial.demo.DSA;

public class max_product_subarray {
    public void method(){
        int[] arr={2,3,-2,4};
        int total_prod=1;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            int curr_prod=1;
            for(int j=i;j<arr.length;j++){
                curr_prod *=arr[j];
                if(curr_prod>total_prod){
                    total_prod=curr_prod;
                    start=i;
                    end =j;
                }
            }
        }
        for(int k=start;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String args[]){
        max_product_subarray mps=new max_product_subarray();
        mps.method();
    }

}
