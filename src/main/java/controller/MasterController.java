package controller;

import dao.ThreadEmpowerment;
import dao.ThreadMultiplication;
import view.MasterView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MasterController implements ActionListener {
    public final MasterView masterView;

    public MasterController(MasterView masterView) {
        this.masterView = masterView;
    }


    private void clean() {
        masterView.getBaseField().setText("");
        masterView.getRowField().setText("");
        masterView.getEmpowermentField().setText("");
        masterView.getMultiplicationField().setText("");
    }

    private Integer getBase() {
        try {
            String text = masterView.getBaseField().getText().trim();
            return Integer.parseInt(text);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos Invalidos",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    private Integer getRow() {
        try {
            String text = masterView.getRowField().getText().trim();
            return Integer.parseInt(text);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos Invalidos",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    private void initThreads() {
        Integer base = getBase();
        Integer row = getRow();
        if (base != null && row != null) {
            ThreadEmpowerment threadEmpowerment = new ThreadEmpowerment(base, row, masterView);
            Thread thread1 = new Thread(threadEmpowerment);
            thread1.start();
            ThreadMultiplication threadMultiplication = new ThreadMultiplication(base, row, masterView);
            Thread thread2 = new Thread(threadMultiplication);
            thread2.start();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(masterView.getCleanButton())) {
            clean();
        }
        if (e.getSource().equals(masterView.getInitButton())) {
            initThreads();
        }
    }
}
