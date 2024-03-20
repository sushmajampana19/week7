import java.util.Scanner;

public class Methodol {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

class test {
    public static void main(String[] args) {
        Methodol obj = new Methodol();
        Scanner in = new Scanner(System.in);
        int option, a, b, c, d, e;
        System.out.println("1. Add 1 integer\n2. Add 2 integers\n3. Add 3 integers\n4. Add 4 integers\n");
        System.out.print("Enter any option: ");
        option = in.nextInt();
        switch (option) {
            case 1:
                System.out.println("Can't add a single integer\n");
                break;
            case 2:
                System.out.print("Enter first integer: ");
                a = in.nextInt();
                System.out.print("Enter second integer: ");
                b = in.nextInt();
                c = obj.add(a, b);
                System.out.println("Sum of the 2 numbers: " + c);
                break;
            case 3:
                System.out.print("Enter first integer: ");
                a = in.nextInt();
                System.out.print("Enter second integer: ");
                b = in.nextInt();
                System.out.print("Enter third integer: ");
                c = in.nextInt();
                d = obj.add(a, b, c);
                System.out.println("Sum of the 3 numbers: " + d);
                break;
            case 4:
                System.out.print("Enter first integer: ");
                a = in.nextInt();
                System.out.print("Enter second integer: ");
                b = in.nextInt();
                System.out.print("Enter third integer: ");
                c = in.nextInt();
                System.out.print("Enter fourth integer: ");
                d = in.nextInt();
                e = obj.add(a, b, c, d);
                System.out.println("Sum of the 4 numbers: " + e);
                break;
            default:
                System.out.println("Can't add more than 4 numbers\n");
        }
        in.close();
    }
}

