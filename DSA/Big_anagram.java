package my_trial.demo.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Big_anagram {
    public void method1(){
        HashMap<String, ArrayList<String>>map=new HashMap<>();
        String[] str={"eat","tea","tan","ate","nat","bat","tab"};
        for(int i=0;i<str.length;i++){
            char[] ch=str[i].toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(map.containsKey(key)){
                map.get(key).add(str[i]);//it return tha list name and add it that list
            }
            else{
                ArrayList<String>list=new ArrayList<>();
                list.add(str[i]);
                map.put(key,list);
            }

        }
        for(ArrayList<String> values:map.values()){
            System.out.println(values+" ");

        }
    }
    public static void main(String args[]){
        Big_anagram ba=new Big_anagram();
        ba.method1();
    }
}
