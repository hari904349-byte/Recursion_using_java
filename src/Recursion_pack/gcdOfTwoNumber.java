package Recursion_pack;

public class gcdOfTwoNumber {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int x=gcd(72, 5);
        System.out.println(x);
    }
}
