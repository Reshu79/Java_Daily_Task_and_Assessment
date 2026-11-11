package my_trial.demo.DSA;

public class Equilibruim_sum {
    public void equil_sum(){
        int[] arr={2,2,5,3,1};
        for(int i=0;i<arr.length;i++){
            int left=0;
            int right=0;
            for(int j=0;j<i;j++){
                left +=arr[j];
            }
            for(int k=arr.length-1;k>i;k--){
                right +=arr[k];
            }

            if(left==right){
                System.out.println("Equilibrium is:"+i);
                System.out.println("left sum:"+left);
                System.out.println("right sum:"+right);
            }
        }
    }

    public static void main(String args[]){
        Equilibruim_sum es=new Equilibruim_sum();
        es.equil_sum();
    }

}
