package sys.View;

import java.awt.BorderLayout;

public class Janela extends javax.swing.JFrame {
    
    //static Janela j;
    static Janela_Login p1;
    static Janela_Vendas p2;
    static Janela_Opcoes p3;
    static Janela_GestaoUsuarios p4;
    static Janela_Entradas p5;
    static Janela_Estoque p6;
    static Janela_GestaoPrecos p7;
    static Janela_NFe p8;
    static Janela_Tax p9;
    static Janela_Empresa p10;
    
    public Janela() {
        initComponents();
        
        this.setLayout(new BorderLayout());
        
        p1 = new Janela_Login();
        
        this.add(p1, BorderLayout.CENTER);
        this.pack();
//
//        p4 = new Janela_GestaoUsuarios();
//        
//        this.add(p4, BorderLayout.CENTER);
//        this.pack();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public static void main(String[] args) {
//        j = new Janela();
//        j.setLocationRelativeTo(null);
//        j.setVisible(true);
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
