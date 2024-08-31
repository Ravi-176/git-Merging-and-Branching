import java.util.Scanner;
class multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a * b;
        System.out.println("The result is: "+prod);
    }
}

