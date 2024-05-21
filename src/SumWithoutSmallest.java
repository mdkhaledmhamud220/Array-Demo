public class SumWithoutSmallest {
    private static int LENGTH = 10;

    public static void main(String[] args) {
        int[] array = new int[LENGTH];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*70);
        }
        int sum = 0, minimum = array[0];
        for(int i = 1; i < array.length; ++i){
            if(minimum > array[i]){
                sum = sum + minimum;
                minimum = array[i];
            } else {
                sum = sum + array[i];
            }
        }
        System.out.println("Sum without smallest: " + sum + ", minimum: " + minimum);
    }
}
