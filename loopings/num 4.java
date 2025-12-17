import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num; 
        int sum=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0){
            num=num/10;
            sum++;
        }
        System.out.println(sum);
    }
}
