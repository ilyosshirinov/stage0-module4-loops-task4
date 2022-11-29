package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum1 = 0;
        int sum2 = 0;
        int x = numberToSkip;
        for (int i = 1; i <= lastInRow; i++) {
            numberToSkip--;
            if (numberToSkip == 0) {
                numberToSkip = x;
                sum1 += i;
                continue;

            } else {
                sum2 += i;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static void main(String[] args) {
        TwoRangesSum rangesSum = new TwoRangesSum();
        rangesSum.printSumOfTwoRanges(5, 10);
    }
}
