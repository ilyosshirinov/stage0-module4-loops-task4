package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        System.out.println((1 + lastInRow / numberToSkip) * (lastInRow / numberToSkip) / 2 * numberToSkip);
        System.out.println((1 + lastInRow) * lastInRow / 2 - ((1 + lastInRow / numberToSkip) * (lastInRow / numberToSkip) /2* numberToSkip));
    }

    public static void main(String[] args) {
        TwoRangesSum rangesSum = new TwoRangesSum();
        rangesSum.printSumOfTwoRanges(5, 10);
    }
}
