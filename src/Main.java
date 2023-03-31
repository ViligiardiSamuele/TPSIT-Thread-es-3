import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        int n,k;
        System.out.print("Inserisci k: ");
        do {
            k = s.nextInt();
            s.reset();
        } while (k < 0);
        System.out.print("Inserisci n (rispettando n > k): ");
        do {
            n = s.nextInt();
            s.reset();
        } while (n < 0 || n <= k);

        Fattoriale fn = new Fattoriale("F di n",n);
        Fattoriale fk = new Fattoriale("F di k",k);
        Fattoriale fnSubk = new Fattoriale("F di n-k",(n - k));
        fn.start();
        fk.start();
        fnSubk.start();
        fn.join();
        fk.join();
        fnSubk.join();
        System.out.println("combinazioni("+n+","+k+"): " + fn.getVal() / (fk.getVal())* fnSubk.getVal());
    }
}