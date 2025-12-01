package Recursion_pack;

public class Rec_sum_1_to_n {

    public static int recSum(int n){
        if(n==0){
            return n;
        }
        return n+recSum(n-1);
    }
    public static int recmul(int n){
        if(n==1){
            return n;
        }
        return n*recmul(n-1);
    }

    public static void main(String[] args) {
        int x=recSum(5);
        System.out.println(x);
    }
}
