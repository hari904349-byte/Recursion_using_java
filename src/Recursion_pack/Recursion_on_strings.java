package Recursion_pack;

public class Recursion_on_strings {
    public static void main(String[] args) {
        subseq("","abc");
    }


   public static String removeCharacter(String s){
        if(s.isEmpty()){
            return "";
        }

        char ch=s.charAt(0);
        if(ch=='a'){
            return removeCharacter(s.substring(1));
        }
        else{
            return ch+ removeCharacter(s.substring(1));
        }
   }

   // remove String from the original String

    public static String removeString(String s){
        if(s.isEmpty()){
            return " ";
        }
        char ch=s.charAt(0);
        if(s.startsWith("apple")){
            return removeString(s.substring(5));
        }else{
            return ch+ removeString(s.substring(1));
        }
    }

    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

}
