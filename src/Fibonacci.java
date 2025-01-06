public class Fibonacci {

    public static void main(String[] args) {



        System.out.println("Fibonacci: ");

        long cislo = fibonacci(20);

        System.out.print("Hodnota cisla na zadanej pozicii je: ");
        System.out.println(cislo);
    }

    public static long fibonacci(long n) {
        long aaa;
        if (n < 2)
            return n;
        else {
            aaa = fibonacci(n - 1) + fibonacci(n - 2);
            return aaa;
        }

    }

}
