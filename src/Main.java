public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        calculateSumAndProduct(myArray);

        int[] myArray2 = {0, 1, 2, 3, 4, 5};
        calculateSumOfSquares(myArray2);

        fibonacciElement(19);
    }

    public static void calculateSumAndProduct(int[] arr) {
        int sum = 0;
        int product = 1;

        for (int number : arr) {
            sum += number;
            product *= number;
        }

        System.out.println("Sum " + sum);
        System.out.println("Product " + product);
    }

    public static void calculateSumOfSquares(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += Math.pow(number, 2);
        }
        System.out.println("Sum of squares: " + sum);
    }

    public static void fibonacciElement(int index) {

        if (index == 0) {
            System.out.println("Fibbonacci: " + 0);
        }
        else if (index == 1) {
            System.out.println("Fibbonacci: " + 1);
        }

        else {
            int element = 1;
            int previousElement = 0;
            int result = 0;

            for (int i = 2; i <= index; i++) {

                result = element + previousElement;
                previousElement = element;
                element = result;
            }
            System.out.println("Fibbonacci: " + result);
        }
    }
}