public class LazyPrimeFactorization implements Runnable {
    private Thread t;
    private int number;

    public LazyPrimeFactorization(int number) {
        this.number = number;
    }

    public Thread getT() {
        return t;
    }

    @Override
    public void run() {
        boolean flag= true;
        System.out.println("LazyPrimeFactorization");
        for (int i = 2; i < (number-1) ; i++) {
            if (number%i==0) {
                flag= false;
            }
        }
        if (flag) {
            System.out.println(number + " is the Prime number " );
        }else {
            System.out.println(number + " not is the Prime number ");
        }

    }
    public void start(){
        if (t == null) {
            t= new Thread(this);
            t.start();
        }
    }
}
