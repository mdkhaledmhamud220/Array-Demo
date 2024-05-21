public class RandomParmutation {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = i + 1;
        }

        int[] parmutationArray = new int[10];

        for(int i = 0; i < 10; ){
            int randonIndex = (int)(Math.random()*10);
            if (randonIndex < 10 - i) {
                parmutationArray[i] = array[randonIndex];
                array[randonIndex] = array[9- i];
                i++;
            }
        }
        System.out.println("Ten random permutations are:-");
        for(int i = 0; i < 10; ++i){
            System.out.print(parmutationArray[i] + " ");
        }
    }
}
