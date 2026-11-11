package my_trial.demo.DSA;

public class Move_zero {
    public void zero() {
        int[] arr = {0, 5, 0, 3, 8, 0, 2};
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        for (int k = index; k < arr.length; k++) {
            result[index] = 0;
            index++;
        }
        for (int res = 0; res < index; res++) {
            System.out.print(result[res] + " ");
        }
    }

    public static void main(String args[]){
        Move_zero mz=new Move_zero();
        mz.zero();
    }

}
