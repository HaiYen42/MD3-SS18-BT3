public class OptimizedPrimeFactorization implements Runnable{
    private int number;
    private Thread t;

    public OptimizedPrimeFactorization(int number) {
        this.number = number;
    }

    public Thread getT() {
        return t;
    }

    @Override
    public void run() {
        System.out.println("OptimizedPrimeFactorization");
        boolean flag= true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number%i==0) {
            flag =false;
            break;
            }
        }
        if (flag) {
            System.out.println(number + " of Optimized is a Prime number ");
        }else{
            System.out.println(number + " of Optimized is not a Prime number ");
        }
    }
    public void start(){
        if (t == null) {
            t= new Thread(this);
            t.start();
        }
    }
}
