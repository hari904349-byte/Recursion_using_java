package Recursion_pack;

public class Recursion_basic {

    // print 1 2 3.. n
    public void printrev(int n){
        if(n!=0){
            printrev(n-1);
            System.out.println(n);

        }
        return ;

    }
    // print n...1
    public int print(int n){
        if(n==0){
            return 1;
        }else{
            System.out.println(n);
        }
        return print(n-1);

    }
    //print odd
    public void printOdd(int n){
        if(n%2==1 && n>0){
            printOdd(n-2);
            System.out.println(n);
        }else if(n>0){
            printOdd(n-1);
        }
        return;
    }

    // factorial of the number
    public int fact(int n){
        if(n==1)
            return 1;
        return n*fact(n-1);
    }
    // sum of digit

    public int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigit(n/10);
    }

    // product of digit
    public int prodOfDigit(int n){
        if(n%10==n){
            return 1;
        }
        return n%10*prodOfDigit(n/10);
    }

}
