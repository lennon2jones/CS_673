import java.util.LinkedList;

public class Problem4 {
    public static LinkedList<Object> combineLists(Object[] listOne, Object[] listTwo) {
        LinkedList<Object> combined = new LinkedList<>();
        int index = 0;
        while (index < listOne.length || index < listTwo.length){
            if (index >= listOne.length) {
                combined.add(listTwo[index]);
                index++;
            }
            else if (index >= listTwo.length) {
                combined.add(listOne[index]);
                index++;
            }
            else if (combined.size() % 2 == 0) {
                combined.add(listOne[index]);
            }
            else {
                combined.add(listTwo[index]);
                index++;
            }
        }
        return combined;
    }
    public static void main(String[] args) {
        Character[] testOne = new Character[]{'A', 'B', 'C'};
        Integer[] testTwo = new Integer[]{1, 2, 3};
        System.out.println(combineLists(testOne, testTwo));
        Character[] testThree = new Character[]{'D', 'E', 'F'};
        Integer[] testFour = new Integer[]{4, 5, 6, 7, 8};
        System.out.println(combineLists(testThree, testFour));
        Character[] testFive = new Character[]{'G', 'H', 'I', 'J', 'K', 'L'};
        Integer[] testSix = new Integer[]{9, 10, 11};
        System.out.println(combineLists(testFive, testSix));
    }
}