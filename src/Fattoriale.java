public class Fattoriale extends Thread{
    private int val;

    public Fattoriale(String name, int val) {
        super(name);
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    public void run() {
        int out = 1;
        for (int i = val; i > 0; i--)
            out *= i;
        val = out;
    }
}
