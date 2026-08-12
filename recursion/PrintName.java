import java.util.Scanner;

public class PrintName {
    static void PrintName(String name, int count, int base) {
        if (count == base) {
            return;
        }
        count++;
        System.out.println(name);
        PrintName(name, count, base);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = s.nextLine();
        System.out.print("How many times you want to print the Name ? ");
        int n = s.nextInt();

        PrintName(name, 0, n);
    }
}
