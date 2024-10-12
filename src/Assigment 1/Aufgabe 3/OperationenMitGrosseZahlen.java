import java.util.Arrays;

public class OperationenMitGrosseZahlen {

    public static int[] add(int[] num1, int[] num2) {
       int  n = num1.length;
       int[] result = new int[n];
       int carry = 0;

       for (int i = n-1; i >= 0; i--) {
           int sum = num1[i] + num2[i] + carry;
           result[i] = sum % 10;
           carry = sum / 10;
       }
       return result;
    }

    public static int[] substract(int[] num1, int[] num2) {
        int  n = num1.length;
        int[] result = new int[n];
        int rest = 0;

        for (int i = n-1; i >= 0; i--) {
            int dif = num1[i] - num2[i] - rest;
            if (dif < 0) {
                dif += 10;
                rest = 1;
            }
            else
                rest = 0;

            result[i] = dif;
        }
        return result;
    }

    public static int[] multiply(int[] num1, int digit){
        int  n = num1.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = n-1; i >= 0; i--) {
            int product = num1[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }
        return result;
    }

    public static int[] divide(int[] num1, int digit){
        int  n = num1.length;
        int[] result = new int[n];
        int rest = 0;

        for(int i = 0; i<n; i++){
            int current = rest * 10 + num1[i];
            result[i] = current / digit;
            rest = current % digit;
        }
        return result;
    }

    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0, 0};
        int digit = 2;

        // 1
        int[] sumResult = add(num1, num2);
        System.out.print("Suma: ");
        printArray(sumResult);

        // 2
        int[] diffResult = substract(num2, num1);
        System.out.print("Diferența: ");
        printArray(diffResult);

        // 3
        int[] multResult = multiply(num1, digit);
        System.out.print("Înmulțirea: ");
        printArray(multResult);

        // 4
        int[] divResult = divide(num1, digit);
        System.out.print("Împărțirea: ");
        printArray(divResult);
    }
}