public class DeadlockExample {

        public static void main(String[] args) {
            final Object lock1 = new Object();
            final Object lock2 = new Object();

            Thread thread1 = new Thread(() -> {
                synchronized (lock1) {
                    System.out.println("Поток 1 захватил объект lock1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lock2) {
                        System.out.println("Поток 1 захватил объект lock2");
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                synchronized (lock2) {
                    System.out.println("Поток 2 захватил объект lock2");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lock1) {
                        System.out.println("Поток 2 захватил объект lock1");
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
    }


