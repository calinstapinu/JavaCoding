public class OperationenMitZahlen {
        public static int findMax(int[] numbers) {
            int max = numbers[0];
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }

        public static int findMin(int[] numbers) {
            int min = numbers[0];
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        }

        public static int findMaxSum(int[] numbers) {
            int totalSum = 0;
            int minValue = findMin(numbers);
            for (int number : numbers) {
                totalSum += number;
            }
            return totalSum - minValue;
        }


        public static int findMinSum(int[] numbers) {
            int totalSum = 0;
            int maxValue = findMax(numbers);
            for (int number : numbers) {
                totalSum += number;
            }
            return totalSum - maxValue;
        }

        public static void main(String[] args) {
            int[] numbers = {4, 8, 3, 10, 17};

            // 1
            int max = findMax(numbers);
            System.out.println("Valoarea maximă: " + max);

            // 2
            int min = findMin(numbers);
            System.out.println("Valoarea minimă: " + min);

            // 3
            int maxSum = findMaxSum(numbers);
            System.out.println("Suma maximă de n-1 elemente: " + maxSum);

            // 4
            int minSum = findMinSum(numbers);
            System.out.println("Suma minimă de n-1 elemente: " + minSum);
        }
}
