package my_trial.demo.DSA;

import java.util.HashMap;

public class Dulipcancy {
    public void method1(){
        HashMap<Character,Integer>map=new HashMap<>();
        String str="swiss";
        char[] ch=str.toCharArray();
        for(char value:ch){
            if (!map.containsKey(value)){
                map.put(value,1);
            }
            else{
                map.put(value,map.get(value)+1);
            }
        }
        for(char values:ch){
            if(map.get(values)==1){
                System.out.println(values);
            }
        }

    }
    public static void main(String args[]){
       Dulipcancy d=new Dulipcancy();
        d.method1();
    }
}
