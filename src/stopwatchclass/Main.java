package stopwatchclass;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
//        for (int i = 0; i < 100000 ; i++) {
//            System.out.println(i);

        int []array = new int[100000];

        //cac gia tri tai "i" cua mang array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000 + 1); //vi chay tu 0 den 99999 nen phai cong them 1
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length -1; j++) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        stopWatch.end();

        double c = stopWatch.getElapsedTime();

        System.out.println(c);
    }
}
