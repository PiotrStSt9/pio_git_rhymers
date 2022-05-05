package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int startNumber = -1;
    private static final int finalNumber = 11;
    private static final int counter = 12;
    private final int[] numbers = new int[counter];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == startNumber;
    }

    public boolean isFull() {
        return total == finalNumber;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
