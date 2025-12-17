import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n; 
        int rev=0;
        int digit;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(org==rev){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}
