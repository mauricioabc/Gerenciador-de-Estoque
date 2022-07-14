package sys.View;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import sys.Controller.SerialController;
import sys.Controller.UsersController;
import sys.Model.User;
import sys.Model.admin;

public class Janela_GestaoUsuarios extends javax.swing.JPanel {

    public Janela_GestaoUsuarios() {
        initComponents();
    }
    
    public void mostrartudo(){
        UsersController list = new UsersController();
        list.Verifica_Admin(); // apenas para teste
        ArrayList <User> lista;
        lista = null;
        lista = list.getListaUsers();
        System.out.println("lista " + lista.toString());
        
        ((DefaultTableModel) tb_Users.getModel()).setRowCount(0);
            for (int i = 0; i < lista.size(); i++) {
                
                if (lista.get(i) instanceof admin) {
                    ((DefaultTableModel) tb_Users.getModel()).addRow(new Object[]{
                        lista.get(i).getUser(),
                        ocultaSenha(lista.get(i).getSenha()),
                        "Administrador"
                    });
                } else {
                    ((DefaultTableModel) tb_Users.getModel()).addRow(new Object[]{
                        lista.get(i).getUser(),
                        ocultaSenha(lista.get(i).getSenha()),
                        "Vendedor"
                    });
                }
            }
    }
    
    public String ocultaSenha(String senha){
        StringBuilder sb = new StringBuilder(senha);
        char replace = '*';
        for (int i = 0; i < senha.length(); i++) {
            sb.setCharAt(i, replace);
            senha = sb.toString();
        }
        return senha;
    }
    
    public String getUser(){
        return tf_User.getText();
    }
    
    public String getSenha(){
        String senha = new String(pf_Senha.getPassword());
        return senha;
    }
    
    public void cadastrar(){
        boolean status = false;
        UsersController cadastro = new UsersController();
        status = cadastro.Cadastramento(getUser(), getSenha(), rb_Adm.isSelected(), rb_Vend.isSelected());
        
        if (status) {
           JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso. ", "Informação", JOptionPane.INFORMATION_MESSAGE);
           limpaCadastro();
           mostrartudo();
        }
    }
    
    public void limpaCadastro(){
        tf_User.setText("");
        pf_Senha.setText("");
        rb_Adm.setSelected(false);
        rb_Vend.setSelected(false);
    }
    
    public void limpaEdit(){
        tf_UserEdit.setText("");
        pf_SenhaEdit.setText("");
    }
    
    public void exibeUser(){
        tf_UserEdit.setText((String) tb_Users.getModel().getValueAt(tb_Users.getSelectedRow() ,0));
        pf_SenhaEdit.setText((String) tb_Users.getModel().getValueAt(tb_Users.getSelectedRow() ,1));
    }
    
    public void editaUser(){
        boolean status = false;
        UsersController edit = new UsersController();
        String username;
        if (tb_Users.getSelectedRow()== -1 ) {
            username = "";
        } else {
            username = (String) tb_Users.getModel().getValueAt(tb_Users.getSelectedRow() ,0);
        }
        String newSenha = new String(pf_SenhaEdit.getPassword());
        status = edit.editaUsuario(username, tf_UserEdit.getText(), newSenha);
        if (status) {
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso. ", "Informação", JOptionPane.INFORMATION_MESSAGE);
            limpaEdit();
            mostrartudo();
        }
    }
    
    public void removeUser(){
        boolean status = false;
        UsersController delete = new UsersController();
        String username;
        if (tb_Users.getSelectedRow()== -1 ) {
            username = "";
        } else {
            username = (String) tb_Users.getModel().getValueAt(tb_Users.getSelectedRow() ,0);
        }
        status = delete.removeUsuario(username);
        if (status) {
            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso. ", "Informação", JOptionPane.INFORMATION_MESSAGE);
            limpaEdit();
            mostrartudo();
        }
    }
    
    public void salvaDados(){
        try {
            UsersController salva = new UsersController();
            salva.salvaDados();
        } catch (Exception e) {
        }
    }
    
    public void voltar(){
        
        salvaDados();
        
        Janela.p3 = new Janela_Opcoes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.p4);
        janela.getContentPane().remove(Janela.p4);
        janela.add(Janela.p3, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_User = new javax.swing.JTextField();
        pf_Senha = new javax.swing.JPasswordField();
        rb_Adm = new javax.swing.JRadioButton();
        rb_Vend = new javax.swing.JRadioButton();
        bt_Cadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Users = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_UserEdit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pf_SenhaEdit = new javax.swing.JPasswordField();
        bt_Remover = new javax.swing.JButton();
        bt_Editar = new javax.swing.JButton();
        bt_Sair = new javax.swing.JButton();
        bt_Voltar = new javax.swing.JButton();
        bt_MostrarTudo = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sys/Imagem/mini_logo_liquigas.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Gestão de Usuários");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Cadastrar Novo Usuário:");

        jLabel4.setText("Usuário:");

        jLabel5.setText("Senha:");

        jLabel6.setText("Tipo:");

        rb_Adm.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rb_Adm);
        rb_Adm.setText("Administrador");

        rb_Vend.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rb_Vend);
        rb_Vend.setText("Vendedor");

        bt_Cadastrar.setText("Cadastrar");
        bt_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_CadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pf_Senha)
                            .addComponent(tf_User)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_Adm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_Vend)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_Cadastrar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Adm)
                    .addComponent(rb_Vend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_Cadastrar)
                .addContainerGap())
        );

        tb_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Senha", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Users);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setText("Usuário:");

        jLabel7.setText("Remoção e Edição de Usuários:");

        jLabel9.setText("Senha:");

        bt_Remover.setText("Remover");
        bt_Remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_RemoverMouseClicked(evt);
            }
        });

        bt_Editar.setText("Editar");
        bt_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_Remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_Editar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pf_SenhaEdit)
                            .addComponent(tf_UserEdit))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_UserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_SenhaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Remover)
                    .addComponent(bt_Editar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_Sair.setText("Sair");
        bt_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_SairMouseClicked(evt);
            }
        });

        bt_Voltar.setText("Voltar");
        bt_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_VoltarMouseClicked(evt);
            }
        });

        bt_MostrarTudo.setText("Mostrar Tudo");
        bt_MostrarTudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_MostrarTudoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(bt_Sair))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_MostrarTudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_Voltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Sair)
                    .addComponent(bt_Voltar)
                    .addComponent(bt_MostrarTudo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_MostrarTudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_MostrarTudoMouseClicked
        mostrartudo();
    }//GEN-LAST:event_bt_MostrarTudoMouseClicked

    private void bt_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CadastrarMouseClicked
        cadastrar();
    }//GEN-LAST:event_bt_CadastrarMouseClicked

    private void bt_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_SairMouseClicked

    private void tb_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_UsersMouseClicked
        exibeUser();
    }//GEN-LAST:event_tb_UsersMouseClicked

    private void bt_EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EditarMouseClicked
        editaUser();
    }//GEN-LAST:event_bt_EditarMouseClicked

    private void bt_RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_RemoverMouseClicked
        removeUser();
    }//GEN-LAST:event_bt_RemoverMouseClicked

    private void bt_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_VoltarMouseClicked
        voltar();
    }//GEN-LAST:event_bt_VoltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cadastrar;
    private javax.swing.JButton bt_Editar;
    private javax.swing.JButton bt_MostrarTudo;
    private javax.swing.JButton bt_Remover;
    private javax.swing.JButton bt_Sair;
    private javax.swing.JButton bt_Voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pf_Senha;
    private javax.swing.JPasswordField pf_SenhaEdit;
    private javax.swing.JRadioButton rb_Adm;
    private javax.swing.JRadioButton rb_Vend;
    private javax.swing.JTable tb_Users;
    private javax.swing.JTextField tf_User;
    private javax.swing.JTextField tf_UserEdit;
    // End of variables declaration//GEN-END:variables
}
