public final class MinMax {
    private MinMax() {
    }

    /**
     *
     */
    static class C {

        /**
         *
         */
        private int number1;
        /**
         *
         */
        private int number2;
    }

    static C func1(final int[] arr, final int n) {
        C c = new C();
        int i;

        if (n == 1) {
            c.number1 = arr[0];
            c.number2 = arr[0];
            return c;
        }

        if (arr[0] > arr[1]) {
            c.number1 = arr[0];
            c.number2 = arr[1];
        } else {
            c.number2 = arr[1];
            c.number1 = arr[0];
        }

        for (i = 2; i < n; i++) {
            if (arr[i] > c.number2) {
                c.number2 = arr[i];
            } else if (arr[i] < c.number1) {
                c.number1 = arr[i];
            }
        }

        return c;
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int s = 6;
        C c = func1(arr, s);
        System.out.printf("\na is %d", c.number1);
        System.out.printf("\nb is %d", c.number2);
    }
}


