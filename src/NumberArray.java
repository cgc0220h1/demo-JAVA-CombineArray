public class NumberArray {
    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static int[] combineArray(int[] array1, int[] array2) {
        int size = array1.length + array2.length;
        int[] result = new int[size];
        for (int index = 0; index < array1.length; index++) {
            result[index] = array1[index];
        }
        for (int index = array1.length; index < result.length; index++) {
            result[index] = array2[index - array1.length];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] demoArray1 = {0, 2, 4, 6, 8, 10, 12, 14};
        int[] demoArray2 = {1, 3, 5, 7, 9, 11};
        System.out.println("We got demo array 1: ");
        displayArray(demoArray1);
        System.out.println("We got demo array 2: ");
        displayArray(demoArray2);
        System.out.println();

        System.out.println("We have the combination array of two arrays above: ");
        int[] demoArray3 = combineArray(demoArray1, demoArray2);
        displayArray(demoArray3);
    }
}
