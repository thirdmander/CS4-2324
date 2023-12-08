package q2sa1truthlaolaureanopart2;

public abstract class Computer {
    protected int ramSize, processingSpeed, totalCalcs;

    public Computer(int r, int p, int t) {
        ramSize = r;
        processingSpeed = p;
        totalCalcs = t;
    }

    public abstract void calculate();
}
