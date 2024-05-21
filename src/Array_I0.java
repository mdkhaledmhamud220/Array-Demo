public class Array_I0 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < 10; ++i){
            array[i] = i*3;
        }
        for(int i = 9; i >= 0; --i){
            System.out.print(array[i] + " ");
        }
    }
}
