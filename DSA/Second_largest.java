package my_trial.demo.DSA;

public class Second_largest {

    public void toFind() {
        int second_largest=0, largest=0;
        int[] arr = {10, 25, 5, 40, 30, 40};

        if (arr[0] < arr[1]) {
            second_largest = arr[0];
            largest = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }
        System.out.println("largest:"+largest);
        System.out.println("second_largest:"+second_largest);
    }

    public static void main(String args[]){
        Second_largest sl=new Second_largest();
        sl.toFind();
    }
}
