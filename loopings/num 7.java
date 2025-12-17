import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int orgnum=num,digit=0,sum=0;
	    int temp=num;
    while(temp>0){
        digit++;
        temp=temp/10;
    }
    temp=num;
    while(temp>0){
        int a=temp%10;
        sum+=Math.pow(a,digit);
        temp/=10;
        }
    if(num==sum){
        System.out.println("Armstrong");
    }
    else
        System.out.println("not");
	}
}
