public class Problem2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int firstMultiple : numbers){
            for (int secondMultiple: numbers) {
                System.out.print(firstMultiple * secondMultiple + " ");
            }
            System.out.println();
        }
    }
}