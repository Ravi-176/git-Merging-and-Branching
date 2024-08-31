import java.util.Scanner;
class division {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a/b;
        System.out.println("The result is: "+res);
    }
}
