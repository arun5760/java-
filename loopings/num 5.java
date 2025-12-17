import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n; 
        int rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            int l=n%10;
            rev=rev*10+l;
            n=n/10;
        }
        System.out.println(rev);
    }
}
