import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num; 
        int sum=1;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0){
            sum=sum*(num%10);
            num=num/10;
        }
        System.out.println(sum);
    }
}
