package stopwatchclass;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        for (int i = 0; i < 100000 ; i++) {
            System.out.println(i);
        }
        stopWatch.end();

        double c = stopWatch.getElapsedTime();

        System.out.println(c);
    }
}
