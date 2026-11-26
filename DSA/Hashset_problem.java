package my_trial.demo.DSA;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Hashset_problem {
    public void method(){
        String str="abcbcdeab";
        int left=0;
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            while (set.contains(str.charAt(i))) {//antha b irukka varaikkum remove pannide varo
                    set.remove(str.charAt(left));
                    left++;
                }
                set.add(str.charAt(i));
        }
        System.out.println(set);//collection ne string ah tha return panno
        System.out.println(set.size());

    }
    public static void main(String args[]){
        Hashset_problem hp=new Hashset_problem();
        hp.method();
    }
}
