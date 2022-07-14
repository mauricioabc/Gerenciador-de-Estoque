package sys.View;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;

public class Janela_Opcoes extends javax.swing.JPanel {

    public Janela_Opcoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_Lancamento = new javax.swing.JButton();
        bt_VerEstoque = new javax.swing.JButton();
        bt_Gestao_Usuarios = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bt_GestaoDeImpostos = new javax.swing.JButton();
        bt_DadosEmpresa = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        bt_GestaoPrecos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        bt_Sair = new javax.swing.JButton();
        bt_Logout = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sys/Imagem/mini_logo_liquigas.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Menu de Opções");

        bt_Lancamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_Lancamento.setText("<html><center>Lançar<br>Entrada</center>");
        bt_Lancamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_LancamentoMouseClicked(evt);
            }
        });

        bt_VerEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_VerEstoque.setText("<html><center>Visualizar<br>Estoque</center>");
        bt_VerEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_VerEstoqueMouseClicked(evt);
            }
        });

        bt_Gestao_Usuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_Gestao_Usuarios.setText("<html><center>Gestão <br>de<br>Usuários</center>");
        bt_Gestao_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_Gestao_UsuariosMouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("<html><center>Gestão<br>de<br>Motoristas</center>");
        jButton5.setEnabled(false);

        bt_GestaoDeImpostos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_GestaoDeImpostos.setText("<html><center>Gestão<br>de<br>Impostos</center>");
        bt_GestaoDeImpostos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_GestaoDeImpostosMouseClicked(evt);
            }
        });

        bt_DadosEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_DadosEmpresa.setText("<html><center>Dados<br>da<br>Empresa</center>");
        bt_DadosEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_DadosEmpresaMouseClicked(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setText("<html><center>Limpeza<br>de<br>Dados</center>");
        jButton8.setEnabled(false);

        bt_GestaoPrecos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_GestaoPrecos.setText("<html><center>Gestão<br>de<br>Preços</center>");
        bt_GestaoPrecos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_GestaoPrecosMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Configurações");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Funcionalidades");

        bt_Sair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_Sair.setText("Sair");
        bt_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_SairMouseClicked(evt);
            }
        });

        bt_Logout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_Logout.setText("Logout");
        bt_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_LogoutMouseClicked(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton12.setText("<html><center>Visualizar<br>Vendas</center>");
        jButton12.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_DadosEmpresa)
                            .addComponent(bt_Gestao_Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_GestaoDeImpostos)
                            .addComponent(bt_GestaoPrecos)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_Lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_VerEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_Logout)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_VerEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Gestao_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_GestaoDeImpostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_DadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_GestaoPrecos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Sair)
                    .addComponent(bt_Logout))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_LogoutMouseClicked
        Janela.p1 = new Janela_Login();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p3);
        janela.getContentPane().remove(Janela.p3);
        janela.add(Janela.p1, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_bt_LogoutMouseClicked

    public void gotoGestao_Usuarios(){
        Janela.p4 = new Janela_GestaoUsuarios();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p3);
        janela.getContentPane().remove(Janela.p3);
        janela.add(Janela.p4, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    public void gotoJanela_Lancamentos(){
        Janela.p5 = new Janela_Entradas();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p3);
        janela.getContentPane().remove(Janela.p3);
        janela.add(Janela.p5, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    public void gotoJanela_Estoque(){
        Janela.p6 = new Janela_Estoque();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p3);
        janela.getContentPane().remove(Janela.p3);
        janela.add(Janela.p6, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    public void gotoJanela_Precos(){
        Janela.p7 = new Janela_GestaoPrecos();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p3);
        janela.getContentPane().remove(Janela.p3);
        janela.add(Janela.p7, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    public void gotoJanela_Tax(){
        Janela.p9 = new Janela_Tax();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p3);
        janela.getContentPane().remove(Janela.p3);
        janela.add(Janela.p9, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    public void gotoJanela_Empresa(){
        Janela.p10 = new Janela_Empresa();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p3);
        janela.getContentPane().remove(Janela.p3);
        janela.add(Janela.p10, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    private void bt_Gestao_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_Gestao_UsuariosMouseClicked
        gotoGestao_Usuarios();
    }//GEN-LAST:event_bt_Gestao_UsuariosMouseClicked

    private void bt_LancamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_LancamentoMouseClicked
        gotoJanela_Lancamentos();
    }//GEN-LAST:event_bt_LancamentoMouseClicked

    private void bt_VerEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_VerEstoqueMouseClicked
        gotoJanela_Estoque();
    }//GEN-LAST:event_bt_VerEstoqueMouseClicked

    private void bt_GestaoPrecosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_GestaoPrecosMouseClicked
        gotoJanela_Precos();
    }//GEN-LAST:event_bt_GestaoPrecosMouseClicked

    private void bt_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_SairMouseClicked

    private void bt_GestaoDeImpostosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_GestaoDeImpostosMouseClicked
        gotoJanela_Tax();
    }//GEN-LAST:event_bt_GestaoDeImpostosMouseClicked

    private void bt_DadosEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_DadosEmpresaMouseClicked
        gotoJanela_Empresa();
    }//GEN-LAST:event_bt_DadosEmpresaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_DadosEmpresa;
    private javax.swing.JButton bt_GestaoDeImpostos;
    private javax.swing.JButton bt_GestaoPrecos;
    private javax.swing.JButton bt_Gestao_Usuarios;
    private javax.swing.JButton bt_Lancamento;
    private javax.swing.JButton bt_Logout;
    private javax.swing.JButton bt_Sair;
    private javax.swing.JButton bt_VerEstoque;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
