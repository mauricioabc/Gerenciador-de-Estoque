package sys.View;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import sys.Controller.DetailsNFeController;
import sys.Controller.InvalidValuesException;
import sys.Controller.SerialController;
import sys.Model.tax;

public class Janela_Tax extends javax.swing.JPanel {

    public Janela_Tax() {
        initComponents();
        attDados();
    }
    
    public void attDados(){
            tax taxes;
            DetailsNFeController imp = new DetailsNFeController();
            taxes = imp.getTaxes();
            tf_TaxMun.setText(Double.toString(taxes.getMunicipalTax() * 100) + "%");
            tf_TaxEst.setText(Double.toString(taxes.getEstadualTax() * 100)+ "%");
            tf_TaxFed.setText(Double.toString(taxes.getFederalTax() * 100)+ "%");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_Voltar = new javax.swing.JButton();
        bt_Lancar = new javax.swing.JButton();
        tf_nTaxMun = new javax.swing.JTextField();
        tf_nTaxEst = new javax.swing.JTextField();
        tf_nTaxFed = new javax.swing.JTextField();
        tf_TaxMun = new javax.swing.JTextField();
        tf_TaxEst = new javax.swing.JTextField();
        tf_TaxFed = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sys/Imagem/mini_logo_liquigas.png"))); // NOI18N
        jLabel1.setText("Gestão de Impostos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Alíquota Municipal:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Alíquota Estadual:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Alíquota Federal:");

        bt_Voltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_Voltar.setText("Voltar");
        bt_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_VoltarMouseClicked(evt);
            }
        });

        bt_Lancar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_Lancar.setText("Lançar");
        bt_Lancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_LancarMouseClicked(evt);
            }
        });

        tf_TaxMun.setEditable(false);

        tf_TaxEst.setEditable(false);

        tf_TaxFed.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nTaxEst)
                            .addComponent(tf_nTaxFed)
                            .addComponent(tf_nTaxMun))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_TaxMun, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(tf_TaxEst)
                            .addComponent(tf_TaxFed)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_Lancar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_nTaxMun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_nTaxEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_nTaxFed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_TaxMun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_TaxEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_TaxFed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Lancar)
                    .addComponent(bt_Voltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void voltar(){
        Janela.p3 = new Janela_Opcoes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p9);
        janela.getContentPane().remove(Janela.p9);
        janela.add(Janela.p3, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    public void lancarDados(){
        try {
            boolean status = false;
            String mun, est, fed;
            mun = tf_nTaxMun.getText();
            est = tf_nTaxEst.getText();
            fed = tf_nTaxFed.getText();
            DetailsNFeController teste = new DetailsNFeController();
            status = teste.verificaAliquotas(mun, est, fed);
            if (status) {
                attDados();
                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.err.println("Erro: erro na gravação.");
            }
        } catch (Exception e) {
        }
    }
    
    private void bt_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_VoltarMouseClicked
        voltar();
    }//GEN-LAST:event_bt_VoltarMouseClicked

    private void bt_LancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_LancarMouseClicked
        lancarDados();
    }//GEN-LAST:event_bt_LancarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Lancar;
    private javax.swing.JButton bt_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tf_TaxEst;
    private javax.swing.JTextField tf_TaxFed;
    private javax.swing.JTextField tf_TaxMun;
    private javax.swing.JTextField tf_nTaxEst;
    private javax.swing.JTextField tf_nTaxFed;
    private javax.swing.JTextField tf_nTaxMun;
    // End of variables declaration//GEN-END:variables
}
