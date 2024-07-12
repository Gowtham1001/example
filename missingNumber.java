import java.util.Scanner;

class missingNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum=n*(n+1)/2;

        while(sc.hasNextLong()){
            sum-=sc.nextLong();
        }
        sc.close();
        System.out.println(sum);

    }
}
