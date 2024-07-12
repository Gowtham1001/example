import java.util.Scanner;
class weirdAlgorithm{
public static void wAlgorithm(long n){
    while(n!=1){
        System.out.print(n+" ");
        if(n%2==0){
            n=n/2;
        }
        else{
            n=n*3;
            n+=1;
        }
    }
    System.out.print(n);
}

public static void main(String args[]){
    long n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextLong();
    wAlgorithm(n);
    sc.close();
}

}