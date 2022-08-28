import  java.util.Scanner;

public class LuckyTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //введите 6ти значное число
        int ticket = scan.nextInt();

        int a = ticket / 100000;
        int b = ticket / 10000;
        b = b % 10;
        int c = ticket / 1000;
        c = c % 10;

        int sum1 = a + b + c;

        int x = ticket / 100;
        x = x % 10;
        int y = ticket / 10;
        y = y % 10;
        int z = ticket % 10;

        int sum2 = x + z + y;

        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
