import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] newArray = new double[]{1.57, 7.654, 9.9860};

        int[] thirdArray = {1, 3, 4, 7, 3, 5, 8};
    }

    public static void task2() {

        int[] array = new int[]{1, 2, 3};

        double[] newArray = new double[]{1.57, 7.654, 9.9860};

        int[] thirdArray = {1, 3, 4, 7, 3, 5, 8};

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i != newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i != thirdArray.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void task3() {

        System.out.println();

        int[] array = new int[]{1, 2, 3};

        double[] newArray = new double[]{1.57, 7.654, 9.9860};

        int[] thirdArray = {1, 3, 4, 7, 3, 5, 8};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = newArray.length - 1; i >= 0; i--) {
            System.out.print(newArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
    public static void task4(){

        System.out.println();

        int[] array = new int[]{1, 2, 3};

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                array[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array));


    }
}

