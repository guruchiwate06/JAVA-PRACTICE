package divb_2526;

public class MinMaxAvgCla {
    public static void main(String[] Args) {
        int l, i, k, sum = 0, min, max;
        float avg;

        l = Args.length;   // Correct spelling: length

        try {
            // initialize min and max with the first value
            min = Integer.parseInt(Args[0]);
            max = Integer.parseInt(Args[0]);
            sum = min;

            // Corrected for-loop syntax
            for (i = 1; i < l; i++) {
                k = Integer.parseInt(Args[i]);

                if (k < min)
                    min = k;

                if (k > max)
                    max = k;

                sum += k;
            }

            System.out.println("Min = " + min);
            System.out.println("Max = " + max);

            avg = (float) sum / l;
            System.out.println("Avg = " + avg);

        } catch (Exception e) {
            System.out.println("Enter only numeric data");
        }
    }
}
