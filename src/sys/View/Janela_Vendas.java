package sys.View;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import sys.Controller.ProductController;
import sys.Model.Precos;

public class Janela_Vendas extends javax.swing.JPanel {

    private double Valor;
    
    
    public Janela_Vendas() {
        initComponents();
        
        attTabela();
    }

    public void attTabela(){
        Precos preco;
        ProductController att = new ProductController();
        preco = att.getPrecos();
        lb_pP2.setText("R$"+Double.toString(preco.getpP2()));
        lb_pP6.setText("R$"+Double.toString(preco.getpP6()));
        lb_pP8.setText("R$"+Double.toString(preco.getpP8()));
        lb_pP13.setText("R$"+Double.toString(preco.getpP13()));
        lb_pP20.setText("R$"+Double.toString(preco.getpP20()));
        lb_pP45.setText("R$"+Double.toString(preco.getpP45()));
    }
    
    public void attPreco(){
        Precos preco;
        ProductController att = new ProductController();
        preco = att.getPrecos();
        int p2 =0,p6=0,p8=0,p13=0,p20=0,p45=0;
        double pP2=0,pP6=0,pP8=0,pP13=0,pP20=0,pP45=0,total=0;
        //Pega quantidades
        p2 = (int) sp_P2.getValue();
        p6 = (int) sp_P6.getValue();
        p8 = (int) sp_P8.getValue();
        p13 = (int) sp_P13.getValue();
        p20 = (int) sp_P20.getValue();
        p45 = (int) sp_P45.getValue();
        //Multiplica pelo preço
        pP2 = p2 * preco.getpP2();
        pP6 = p6 * preco.getpP6();
        pP8 = p8 * preco.getpP8();
        pP13 = p13 * preco.getpP13();
        pP20 = p20 * preco.getpP20();
        pP45 = p45 * preco.getpP45();
        total = pP2 + pP6 + pP8 + pP13 + pP20 + pP45;
        //Exibe preço
        lb_Valor.setText(Double.toString(pP2 + pP6 + pP8 + pP13 + pP20 + pP45));
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sp_P8 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sp_P6 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        sp_P2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sp_P45 = new javax.swing.JSpinner();
        sp_P20 = new javax.swing.JSpinner();
        sp_P13 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        bt_NFe = new javax.swing.JButton();
        lb_Valor = new javax.swing.JLabel();
        bt_Logout = new javax.swing.JButton();
        bt_Sair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_pP13 = new javax.swing.JLabel();
        lb_pP45 = new javax.swing.JLabel();
        lb_pP20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_pP8 = new javax.swing.JLabel();
        lb_pP6 = new javax.swing.JLabel();
        lb_pP2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sys/Imagem/mini_logo_liquigas.png"))); // NOI18N
        jLabel1.setText("Vendas");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        sp_P8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sp_P8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_P8StateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("P08");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("P06");

        sp_P6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sp_P6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_P6StateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("P02");

        sp_P2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sp_P2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_P2StateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("P13");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("P20");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("P45");

        sp_P45.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sp_P45.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_P45StateChanged(evt);
            }
        });

        sp_P20.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sp_P20.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_P20StateChanged(evt);
            }
        });

        sp_P13.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sp_P13.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_P13StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp_P8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sp_P6)
                        .addComponent(sp_P2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sp_P45)
                    .addComponent(sp_P20)
                    .addComponent(sp_P13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sp_P13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp_P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp_P45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sp_P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sp_P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp_P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Total:");

        bt_NFe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_NFe.setText("Visualizar Nota Fiscal");
        bt_NFe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_NFeMouseClicked(evt);
            }
        });

        lb_Valor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_Valor.setText("0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_Valor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(bt_NFe)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lb_Valor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_NFe)
                .addContainerGap())
        );

        bt_Logout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_Logout.setText("Logout");
        bt_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_LogoutMouseClicked(evt);
            }
        });

        bt_Sair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_Sair.setText("Sair");
        bt_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_SairMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Tabela de Preços");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("P06");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("P08");

        lb_pP13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_pP13.setText("<preco>");

        lb_pP45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_pP45.setText("<preco>");

        lb_pP20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_pP20.setText("<preco>");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("P02");

        lb_pP8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_pP8.setText("<preco>");

        lb_pP6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_pP6.setText("<preco>");

        lb_pP2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_pP2.setText("<preco>");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("P13");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("P20");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("P45");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_pP2)
                            .addComponent(lb_pP6)
                            .addComponent(lb_pP8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_pP13)
                            .addComponent(lb_pP20)
                            .addComponent(lb_pP45))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_pP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_pP6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_pP8))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_pP13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_pP20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_pP45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_Logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Logout)
                    .addComponent(bt_Sair))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void voltar(){
        Janela.p1 = new Janela_Login();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p2);
        janela.getContentPane().remove(Janela.p2);
        janela.add(Janela.p1, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    public void gotoNFe(){
        boolean status = false;
        ProductController vende = new ProductController();
        int p2 =0,p6=0,p8=0,p13=0,p20=0,p45=0;
        //Pega quantidades
        p2 = (int) sp_P2.getValue();
        p6 = (int) sp_P6.getValue();
        p8 = (int) sp_P8.getValue();
        p13 = (int) sp_P13.getValue();
        p20 = (int) sp_P20.getValue();
        p45 = (int) sp_P45.getValue();
        status = vende.verificaEstoque(p2, p6, p8, p13, p20, p45);
        if (status) {
            Precos preco;
            ProductController att = new ProductController();
            preco = att.getPrecos();

            //Inicia janela
            Janela.p8 = new Janela_NFe(p2,preco.getpP2(),p6,preco.getpP6(),p8,preco.getpP8(),p13,preco.getpP13(),p20,preco.getpP20(),p45,preco.getpP45());
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p2);
            janela.getContentPane().remove(Janela.p2);
            janela.add(Janela.p8, BorderLayout.CENTER);
            janela.pack();
            janela.setLocationRelativeTo(null);
        }
    }
    
    private void sp_P45StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_P45StateChanged
        attPreco();
    }//GEN-LAST:event_sp_P45StateChanged

    private void sp_P20StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_P20StateChanged
        attPreco();
    }//GEN-LAST:event_sp_P20StateChanged

    private void sp_P13StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_P13StateChanged
        attPreco();
    }//GEN-LAST:event_sp_P13StateChanged

    private void sp_P2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_P2StateChanged
        attPreco();
    }//GEN-LAST:event_sp_P2StateChanged

    private void sp_P6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_P6StateChanged
        attPreco();
    }//GEN-LAST:event_sp_P6StateChanged

    private void sp_P8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_P8StateChanged
        attPreco();
    }//GEN-LAST:event_sp_P8StateChanged

    private void bt_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_SairMouseClicked

    private void bt_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_LogoutMouseClicked
        voltar();
    }//GEN-LAST:event_bt_LogoutMouseClicked

    private void bt_NFeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_NFeMouseClicked
        gotoNFe();
    }//GEN-LAST:event_bt_NFeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Logout;
    private javax.swing.JButton bt_NFe;
    private javax.swing.JButton bt_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_Valor;
    private javax.swing.JLabel lb_pP13;
    private javax.swing.JLabel lb_pP2;
    private javax.swing.JLabel lb_pP20;
    private javax.swing.JLabel lb_pP45;
    private javax.swing.JLabel lb_pP6;
    private javax.swing.JLabel lb_pP8;
    private javax.swing.JSpinner sp_P13;
    private javax.swing.JSpinner sp_P2;
    private javax.swing.JSpinner sp_P20;
    private javax.swing.JSpinner sp_P45;
    private javax.swing.JSpinner sp_P6;
    private javax.swing.JSpinner sp_P8;
    // End of variables declaration//GEN-END:variables
}
