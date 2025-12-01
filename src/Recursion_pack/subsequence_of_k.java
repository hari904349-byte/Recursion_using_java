package Recursion_pack;

public class subsequence_of_k {
    public static void main(String[] args) {
        subseq("","123456" +
                "");
    }

    public static void subseq(String p, String up){
        if(p.length()==2){
            System.out.println(p);
            return;
        }
        if(up.isEmpty()){
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p,up.substring(1));
    }
}
