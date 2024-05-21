public class AlternatingSum {
    private static int LENGTH = 10;

    public static void main(String[] args) {
        int[] array = new int[LENGTH];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*33);
        }
        int sum = 0;
        for(int i = 1; i < array.length; ++i){
            if(i%2 == 0){
                sum = sum - array[i];
            } else {
                sum = sum + array[i];
            }
        }
        System.out.println("Sum: " + sum );
    }
}
