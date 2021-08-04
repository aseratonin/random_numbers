class Random {

    public static void main(String[] args) {
        int n = 5;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        double sum = 0;


        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            sum = array[i] + sum;

        }
        System.out.println(max + " это max");
        System.out.println(min + " это min");
        System.out.println(sum/ array.length + " это avg");

    }

}




