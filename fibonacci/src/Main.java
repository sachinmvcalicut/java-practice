import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            fibonacci series");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("enter how many numbers you want to print  :");
        Scanner SN=new Scanner(System.in);
        int x=0,y=1,s=0;
        int r= SN.nextInt();
        for(int i=0;i<r;i++){
            System.out.print(x+",");
            y=x+y;
            x=y-x;

        }
    }
}