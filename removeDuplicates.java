package my_trial.demo.DSA;

public class removeDuplicates {
    public void remove(){
        int[] arr={1,1,2,3,4,5,5};
        int[] result=new int[10];
        int index=0;
        for(int i=0;i<arr.length;i++){
            boolean duplicates=false;
            for(int j=0;j<index;j++){
                if(arr[i]==result[j]){
                    duplicates=true;
                    break;
                }
            }
            if(!duplicates){
                result[index]=arr[i];
                index++;
            }
        }
        for(int k=0;k<index;k++){
            System.out.print(result[k]+" ");
        }
    }
    public static void main(String args[]){
        removeDuplicates rd=new removeDuplicates();
        rd.remove();
    }
}
