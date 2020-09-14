package stopwatchclass;

public class StopWatch {
    private double startTime, endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
