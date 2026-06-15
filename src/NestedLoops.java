public class NestedLoops {
    public static void printNumbers(int n){
        for(int i = 0; i < n; i++){
            for( int j = 0; j < n; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
