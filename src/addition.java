import java.util.Scanner;
class addition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The result is: "+sum);
    }
}

