public class Main {
    public static void main(String[] args) {
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(7919);
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(7919);
        optimizedPrimeFactorization.start();
        lazyPrimeFactorization.start();
    }
}