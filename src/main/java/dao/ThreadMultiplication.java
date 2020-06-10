package dao;

import view.MasterView;

public class ThreadMultiplication implements Runnable {
    private final Integer base;
    private final Integer row;
    private final MasterView masterView;

    public ThreadMultiplication(Integer base, Integer row, MasterView masterView) {
        this.base = base;
        this.row = row;
        this.masterView = masterView;
    }

    private void process() {
        for (int i = 1; i <= row; i++) {
            String line = base + " x " + i + " = " + (base * i) + "\n";
            masterView.getMultiplicationField().append(line);
        }
    }

    @Override
    public void run() {
        process();
    }
}
