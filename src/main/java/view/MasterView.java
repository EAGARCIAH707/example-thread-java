/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MasterController;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author AndresG
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class MasterView extends javax.swing.JFrame {

    /**
     * Creates new form Converter
     */
    public MasterView() {
        initComponents();
    }

    public void addController(MasterController masterController) {
        getCleanButton().addActionListener(masterController);
        getInitButton().addActionListener(masterController);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        baseLabel = new javax.swing.JLabel();
        exponentLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        multiplicationField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        empowermentField = new javax.swing.JTextArea();
        baseField = new javax.swing.JTextField();
        rowField = new javax.swing.JTextField();
        InitButton = new javax.swing.JButton();
        CleanButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        baseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        baseLabel.setText("Base/tabla:");
        jPanel1.add(baseLabel);
        baseLabel.setBounds(20, 30, 90, 17);

        exponentLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exponentLabel.setText("Exponente/lineas:");
        jPanel1.add(exponentLabel);
        exponentLabel.setBounds(20, 60, 126, 17);

        multiplicationField.setColumns(20);
        multiplicationField.setRows(5);
        jScrollPane1.setViewportView(multiplicationField);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 120, 166, 96);

        empowermentField.setColumns(20);
        empowermentField.setRows(5);
        jScrollPane2.setViewportView(empowermentField);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 120, 166, 96);

        baseField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(baseField);
        baseField.setBounds(160, 20, 108, 23);

        rowField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(rowField);
        rowField.setBounds(160, 50, 108, 23);

        InitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InitButton.setText("Calcular");
        jPanel1.add(InitButton);
        InitButton.setBounds(97, 230, 90, 25);

        CleanButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CleanButton.setText("Limpiar");
        jPanel1.add(CleanButton);
        CleanButton.setBounds(230, 230, 90, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Potencia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 90, 70, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tabla de multiplicar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 90, 150, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CleanButton;
    private javax.swing.JButton InitButton;
    private javax.swing.JTextField baseField;
    private javax.swing.JLabel baseLabel;
    private javax.swing.JTextArea empowermentField;
    private javax.swing.JLabel exponentLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea multiplicationField;
    private javax.swing.JTextField rowField;
    // End of variables declaration//GEN-END:variables
}
