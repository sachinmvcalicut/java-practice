import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("reverse of a number");
        System.out.println("enter which number you want to reverse");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y=0,rev=0;

        while(x>0){
        y=x%10;
        rev=rev*10+y;
        x=x/10;

        }
        System.out.println("reverse :"+rev);

    }
}