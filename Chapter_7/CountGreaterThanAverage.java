public class CountGreaterThanAverage {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(countGreater(responseTimes));
    }

    public static int countGreater(int[] arr) {
        int count = 0;
        int sum = 0;

        
        sum += arr[0];

        for (int i = 1; i < arr.length; i++) {
            double average = (double) sum / i;

            if (arr[i] > average) {
                count++;
            }

            sum += arr[i];
        }

        return count;
    }
}

