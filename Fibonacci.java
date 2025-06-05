public class Fibonacci {
    public static void main(String[] args) {
        int num = 21; // You can change this number

        int a = 0, b = 1;
        System.out.println("Fibonacci series up to " + num + ":");
        while (a <= num) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

