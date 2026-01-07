public class FloatArraySum {
    public static void main(String[] args) {
       
        float[] numbers = {7.9f, 2.4f, 4.5f , 5.9f, 1.2f};

        float sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }


        System.out.print("Array elements: ");
        for (float num : numbers) {
            System.out.print(num + " ");
        }


        System.out.println("\nSum of array elements: " + sum);
    }
}
