package my_trial.demo.DSA;

public class validPalindrome {
    public static void main (String[] args){
        String str="A mag,a Plan ,a canal: Panama";
        String str2=str.toLowerCase();
        char[] ch=str2.toCharArray();
        int left=0;
        int right=str2.length()-1;
        boolean state=false;
        while(left<right){

            if(!Character.isLetterOrDigit(ch[left])){
                left++;
            } else if (!Character.isLetterOrDigit(ch[right])) {
                right--;
            }
            else{
                if(ch[left]==ch[right]) {
                    state = true;
                    left++;
                    right--;
                }
                else{
                    state=false;
                    break;
                }
            }
        }
        if(state){
            System.out.println("palindrome");
        }
        else if(!state){
            System.out.println(" not a palindrome");
        }

    }
}
