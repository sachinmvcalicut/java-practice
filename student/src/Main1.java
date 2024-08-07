
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Student S = new Student();
        Scanner lim = new Scanner(System.in);
        System.out.println("ENTER HOW MANY STUDENT DETAILS YOU WANT TO STORE :");
        int r = lim.nextInt();
        S.j = r;
        S.GetDetails();
        S.PrintDetails();
    }
}
