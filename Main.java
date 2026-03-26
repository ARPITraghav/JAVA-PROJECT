class TimerThread extends Thread {
    public void run() {
        try {
            System.out.println("You have 30 seconds to answer all questions.");
            Thread.sleep(30000); 
            System.out.println("\nTime up!");
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted");
        }
    }
}