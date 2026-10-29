package my_trial.demo.DSA;

public class Sum_target {
    public void target() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("index "+i+","+j);
                }
            }
        }
    }

    public void contains_duplicate(){
        int[] arr={1,2,3,1};
        boolean state=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    state=true;
                }
            }
        }
        System.out.println("contains-duplicate:"+state);

    }

    public static void main (String args[]){
        Sum_target st=new Sum_target();
        st.target();
        st.contains_duplicate();
    }
}
