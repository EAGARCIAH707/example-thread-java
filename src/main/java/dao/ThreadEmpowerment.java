package dao;

import view.MasterView;

public class ThreadEmpowerment implements Runnable {
    private final Integer base;
    private final Integer row;
    private final MasterView masterView;

    public ThreadEmpowerment(Integer base, Integer row, MasterView masterView) {
        this.base = base;
        this.row = row;
        this.masterView = masterView;
    }

    private void process() {
        for (int i = 0; i < row; i++) {
            Double result = Math.pow(base, i + 1);
            String valueOf = String.format("%.0f", result);
            String line = base + " elevado a " + (i + 1) + " = " + valueOf + "\n";
            masterView.getEmpowermentField().append(line);
        }
    }

    @Override
    public void run() {
        process();
    }
}
