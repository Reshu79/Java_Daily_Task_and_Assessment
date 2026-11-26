package my_trial.demo.DSA;



import java.util.ArrayList;
import java.util.Stack;

public class Greater_on_right {
    public void method1(){
        int[] arr={4,5,2,10,8};
        Stack<Integer>s=new Stack<>();
        int index=0;
        int[] result=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[index]=-1;
                index++;
            }
            else{
                result[index]=s.peek();
                index++;
            }
            s.push(arr[i]);
        }
        for(int i=index-1;i>=0;i--){
            System.out.print(result[i]+" ");
        }

    }
    public static void main(String args[]){
        Greater_on_right gor=new Greater_on_right();
        gor.method1();
    }
}
