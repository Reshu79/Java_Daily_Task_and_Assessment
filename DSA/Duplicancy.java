package my_trial.demo.DSA;

public class Duplicancy {
    public void dupliacte() {
        int[] arr = {10, 20, 30, 50, 60, 30, 10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String args[]){
        Duplicancy d=new Duplicancy();
        d.dupliacte();
    }
}
