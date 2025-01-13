public class Program15 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        printArray(array);
        System.out.println("Minimum: " + min(array));
        System.out.println("Maximum: " + max(array));
        System.out.println("Sum: " + sum(array));
        System.out.println("Average: " + average(array));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        return sum(array) / (double) array.length;
    }
}
