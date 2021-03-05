package FinalActivity;

public class FibonacciMaker300 {
    public static void fibMaker300() {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;
        int count = 20;

        for (i = 1; i < count; ++i)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
