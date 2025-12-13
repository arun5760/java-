1)
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int orgprice=sc.nextInt();
        int percent=sc.nextInt();
        int disc=orgprice*percent/100;
        int finalamount=orgprice-disc;
        System.out.println(disc);
        System.out.println(finalamount);
    }
}
