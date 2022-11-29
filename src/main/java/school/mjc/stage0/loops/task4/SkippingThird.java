package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int x = 3;
        for (int i = 1; i <= lastPrinted; i++) {
            x--;
            if (x == 0) {
                x = 3;
                continue;

            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SkippingThird third = new SkippingThird();
        third.printUntilButThird(12);
    }
}
