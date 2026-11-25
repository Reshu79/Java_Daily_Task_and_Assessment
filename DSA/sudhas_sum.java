package my_trial.demo.DSA;

public class sudhas_sum {
    public void method1(){
        int[] arr={3,2,8,-7,-5,-4,4,-7};
        int sum=0;
        int max_sum=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max_sum){
                    max_sum=sum;
                    start=i;
                    end=j;
                }
            }
        }
        for(int k=start;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("max_sum:"+max_sum);
    }
    public static void main(String args[]){
        sudhas_sum ss=new sudhas_sum();
        ss.method1();
    }
}
