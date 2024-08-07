import java.util.Scanner;
import java.util.Arrays;

public class Student {
    int rollno;
    int mark;
    String Sname;
    int j;
    String[] stname = new String[10];
    int[] rollnoInts = new int[10];
    int[] mInts = new int[10];

    public void GetDetails() {
        for (int y = 0; y < j; y++) {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter Name :");
            Sname = Sc.nextLine();
            stname[y] = Sname;
            System.out.println("Enter Roll number :");
            rollno = Sc.nextInt();
            rollnoInts[y] = rollno;
            System.out.println("Enter mark ");
            mark = Sc.nextInt();
            mInts[y] = mark;
        }
    }

    public void PrintDetails() {
        for (int y = 0; y < j; y++) {
            System.out.println("Roll number" + rollnoInts[y]);
            System.out.println("name :" + stname[y]);
            System.out.println("MARK :" + mInts[y]);
        }

    }
}
