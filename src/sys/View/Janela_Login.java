package sys.View;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;
import sys.Controller.DetailsNFeController;
import sys.Controller.ProductController;
import sys.Controller.SerialController;
import sys.Controller.UsersController;

public class Janela_Login extends javax.swing.JPanel {

    public Janela_Login() {
        initComponents();
        Verifica();
    }
    
    public String getUser(){
        return tf_User.getText();
    }
    
    public String getPassword(){
        String senha = new String(pf_Senha.getPassword());
        return senha;
    }
    
    public void login(){
        UsersController login = new UsersController();
        login.Verifica_Login(getUser(), getPassword());
    }

    public void sair(){
        UsersController sair = new UsersController();
        sair.Sair();
    }
    
    public void Verifica(){
        UsersController verifica = new UsersController();
        verifica.Verifica_Admin();
        verifica.carregaDados();
        ProductController verifica2 = new ProductController();
        verifica2.carregaDados();
        verifica2.carregaDados2();
        DetailsNFeController teste = new DetailsNFeController();
        teste.carregaDados();
        teste.carregaDados2();
    }
    
    public static void gotoJanela_Vendas(){
        Janela.p2 = new Janela_Vendas();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p1);
        janela.getContentPane().remove(Janela.p1);
        janela.add(Janela.p2, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    public static void gotoJanela_Opcoes(){
        Janela.p3 = new Janela_Opcoes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p1);
        janela.getContentPane().remove(Janela.p1);
        janela.add(Janela.p3, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pf_Senha = new javax.swing.JPasswordField();
        tf_User = new javax.swing.JTextField();
        bt_Sair = new javax.swing.JButton();
        bt_Entrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuário:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Senha:");

        pf_Senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pf_Senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_SenhaKeyPressed(evt);
            }
        });

        tf_User.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bt_Sair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_Sair.setText("Sair");
        bt_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_SairMouseClicked(evt);
            }
        });

        bt_Entrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_Entrar.setText("Entrar");
        bt_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EntrarMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sys/Imagem/logo_liquigas.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Sair)
                        .addGap(250, 250, 250)
                        .addComponent(bt_Entrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pf_Senha)
                            .addComponent(tf_User, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Sair)
                    .addComponent(bt_Entrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EntrarMouseClicked
        login();
    }//GEN-LAST:event_bt_EntrarMouseClicked

    private void bt_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SairMouseClicked
        sair();
    }//GEN-LAST:event_bt_SairMouseClicked

    private void pf_SenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_SenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){  
            login();
        }
    }//GEN-LAST:event_pf_SenhaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Entrar;
    private javax.swing.JButton bt_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pf_Senha;
    private javax.swing.JTextField tf_User;
    // End of variables declaration//GEN-END:variables
}
