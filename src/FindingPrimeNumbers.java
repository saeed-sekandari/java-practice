public class FindingPrimeNumbers{
    //find the first 50 prime numbers
    public static boolean isPrime(int n){

        if(n <= 1){
            return false;
        } for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printFirstNPrimes(int n){
        int count = 0;
        int number = 2;

        while (count < n){
            if(isPrime(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}