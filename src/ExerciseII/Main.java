package ExerciseII;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {3, 1, 2, 0, 4, 5, 6, 10, 8, 9, 7};
        searchNumber(array);

    }

    public static void searchNumber(Integer[] array) {
        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Min= " + min + " minIndex= " + minIndex + "; Max= " + max + " maxIndex= " + maxIndex);
    }
}
