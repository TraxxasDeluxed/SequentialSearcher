public class Main {

    public static void main(String[] args) {
        int[] array1 = { 3, 2, 1 };
        System.out.println(find(array1, 1));
        System.out.println(containsDuplicate(array1));
        System.out.println(sortOrder(array1));
    }

    static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    static boolean containsDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static int sortOrder(int[] array) {
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                counter1++;
            }
        }
        if (counter1 == array.length - 1) {
            return 1;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                counter2++;
            }
        }
        if (counter2 == array.length - 1) {
            return -1;
        }
        return 0;
    }
}