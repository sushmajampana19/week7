import java.util.Scanner;

class Add {
    void add(int d, int e) {
        System.out.println("From integer values: " + (d + e));
    }

    void add(float a, float b) {
        System.out.println("From Float type: " + (a + b));
    }
}

public class MethodOR {
    public static void main(String[] args) {
        Add x = new Add();
        Scanner in = new Scanner(System.in);
        int a, b;
        float c, d;
        System.out.print("Enter any 2 numbers of integer type: ");
        a = in.nextInt();
        b = in.nextInt();
        x.add(a, b); // Corrected method invocation
        x.add(1.1f, 2.2f);
        in.close();
    }
}

