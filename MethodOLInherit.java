import java.util.Scanner;

class Add {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Derived_Add extends Add {
    @Override
    int add(int a, int b) {
        return super.add(a, b);
    }
    @Override
    int add(int a, int b, int c) {
        return super.add(a, b, c);
    }

    int add(int a, int b, int c, int d) {
        return super.add(a, b, c) + d;
    }
}

public class MethodOLInherit {
    public static void main(String[] args) {
        Derived_Add x = new Derived_Add();
        int a, b, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any 2 numbers:");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Addition of 2 numbers:");
        System.out.println(x.add(a, b));

        System.out.println("Enter any 3 numbers:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("Addition of 3 numbers:");
        System.out.println(x.add(a, b, c));

        System.out.println("Enter any 4 numbers:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        System.out.println("Addition of 4 numbers:");
        System.out.println(x.add(a, b, c, d));

        in.close();
    }
}

