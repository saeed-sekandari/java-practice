public class RecursiveFunction {
        public static int SumNumbers(int n){
            if(n <= 0){
                return 0;
            }
            return n + SumNumbers(n-1);
        }
    }

