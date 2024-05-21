public class ArrayRandonInput {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < 10; ++i){
            array[i] = (int)(Math.random()*70);
        }
        System.out.println("Every element at an even index");
        for(int i = 0; i < 10; i += 2){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nEvery even element");
        for(int i = 0; i < 10; i++){
            if((array[i]%2 == 0))
                System.out.print(array[i] + " ");
        }
        System.out.println("\nAll elements in reverse order");
        for(int i = 9; i >= 0; --i){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nOnly the first and last element");
        System.out.println(array[0] + " " + array[9]);
    }
}
