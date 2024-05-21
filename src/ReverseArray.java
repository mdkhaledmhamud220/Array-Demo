public class ReverseArray {
    private static int LENGTH = 10;

    public static void main(String[] args) {
        int[] array = new int[LENGTH];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 33);
        }

        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        int mid = array.length / 2;
        int temp;
        for (int i = 0; i < mid; ++i) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("\nReverse Array: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }
}
