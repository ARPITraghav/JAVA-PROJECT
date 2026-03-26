class TimerThread extends Thread {
    public void run() {
        try {
            System.out.println("You have 30 seconds to answer all questions.");
            System.out.print("Seconds left: 30");
            for (int i = 29; i >= 0; i--) {
                Thread.sleep(1000);
                System.out.print("\rSeconds left: " + i + "   ");
            }
            System.out.println("\nTime up!");
        } catch (InterruptedException e) {
        }
    }
}