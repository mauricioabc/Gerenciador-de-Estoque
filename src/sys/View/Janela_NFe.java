package sys.View;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import sys.Controller.DetailsNFeController;
import sys.Controller.ProductController;
import sys.Model.Empresa;
import sys.Model.tax;

public class Janela_NFe extends javax.swing.JPanel {

    private boolean status_emissao = false;
    private int p2,p6,p8,p13,p20,p45;
    private double pP2,pP6,pP8,pP13,pP20,pP45, total;
    
    public Janela_NFe(int p2, double pP2,int p6, double pP6,int p8, double pP8,int p13, double pP13,int p20, double pP20,int p45, double pP45) {
        initComponents();
        
        this.p2 = p2;
        this.pP2 = pP2;
        this.p6 = p6;
        this.pP6 = pP6;
        this.p8 = p8;
        this.pP8 = pP8;
        this.p13 = p13;
        this.pP13 = pP13;
        this.p20 = p20;
        this.pP20 = pP20;
        this.p45 = p45;
        this.pP45 = pP45;
        
        preencheEmpresa();
        preencheProdutos();
        preencheImpostos();
        
    }

    public void preencheEmpresa(){
        DetailsNFeController emp = new DetailsNFeController();
        Empresa empresa;
        empresa = emp.getEmpresa();
        //Preenche dados
        lb_NomeEmpresa.setText(empresa.getNome());
        lb_Endereco.setText(empresa.getEndereco());
        lb_Bairro.setText(empresa.getBairro());
        lb_Cidade.setText(empresa.getCidade());
        lb_CEP.setText(empresa.getCep());
        lb_CNPJ.setText(formataCNPJ(empresa.getCnpj()));
        lb_IE.setText(empresa.getIe());
        lb_Telefone.setText(empresa.getTelefone());
    }
    
    public void preencheProdutos(){
        ((DefaultTableModel) tb_Produtos.getModel()).setRowCount(0);
        
        if (p2 > 0) {
            ((DefaultTableModel) tb_Produtos.getModel()).addRow(new Object[]{
                        "P02",
                        pP2,
                        p2,
                        p2 * pP2
                    });
        }
        if (p6 > 0) {
            ((DefaultTableModel) tb_Produtos.getModel()).addRow(new Object[]{
                        "P06",
                        pP6,
                        p6,
                        p6 * pP6
                    });
        }
        if (p8 > 0) {
            ((DefaultTableModel) tb_Produtos.getModel()).addRow(new Object[]{
                        "P08",
                        pP8,
                        p8,
                        p8 * pP8
                    });
        }
        if (p13 > 0) {
            ((DefaultTableModel) tb_Produtos.getModel()).addRow(new Object[]{
                        "P13",
                        pP13,
                        p13,
                        p13 * pP13
                    });
        }
        if (p20 > 0) {
            ((DefaultTableModel) tb_Produtos.getModel()).addRow(new Object[]{
                        "P20",
                        pP20,
                        p20,
                        p20 * pP20
                    });
        }
        if (p45 > 0) {
            ((DefaultTableModel) tb_Produtos.getModel()).addRow(new Object[]{
                        "P45",
                        pP45,
                        p45,
                        p45 * pP45
                    });
        }
        total = (p2*pP2) + (p6*pP6) + (p8*pP8) + (p13*pP13) + (p20*pP20) + (p45*pP45);
        String totalText = String.format("%.2f", total);
        lb_Valor.setText(totalText);
    }
    
    public void preencheImpostos(){
        DetailsNFeController imp = new DetailsNFeController();
        tax taxes;
        taxes = imp.getTaxes();
        Double totalF = total * taxes.getFederalTax();
        String resultF = String.format("%.2f", totalF);
        lb_ImpFed.setText("R$" + resultF);
        Double totalE = total * taxes.getEstadualTax();
        String resultE = String.format("%.2f", totalE);
        lb_ImpEst.setText("R$" + resultE);
        Double totalM = total * taxes.getMunicipalTax();
        String resultM = String.format("%.2f", totalM);
        lb_ImpMun.setText("R$" + resultM);
        Double total = totalF + totalE + totalM;
        String result = String.format("%.2f", total);
        lb_ImpTotal.setText("R$" + result);
    }
    
    public void emitirNFe(){
        try {
            //Decrementa estoque
            ProductController vende = new ProductController();
            vende.realizaVenda(p2, p6, p8, p13, p20, p45);
            //Emite NF-e
            status_emissao = true;

            Random rand = new Random();
            int randomNum = rand.nextInt((9999 - 0) + 1) + 0;
            lb_Numero.setText(Integer.toString(randomNum));

            Date dataHoraAtual = new Date();
            String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
            String time = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
            lb_DataEmissao.setText(data + ":" +time);

            System.out.println("NF-e " + randomNum + " emitida às " + data + ":" + time);

            bt_EmiteNFe.setEnabled(false);
            bt_Volta_Novo.setText("Retornar/Tela de Vendas");
        } catch (Exception e) {
        }
        
    }
    
    public String formataCNPJ(String CNPJ) {
        // máscara do CNPJ: 99.999.999/9999-99
        return(CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
        CNPJ.substring(5, 8) + "/" + CNPJ.substring(8, 12) + "-" +
        CNPJ.substring(12, 14));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lb_NomeEmpresa = new javax.swing.JLabel();
        lb_Endereco = new javax.swing.JLabel();
        lb_Bairro = new javax.swing.JLabel();
        lb_Cidade = new javax.swing.JLabel();
        lb_CEP = new javax.swing.JLabel();
        lb_CNPJ = new javax.swing.JLabel();
        lb_IE = new javax.swing.JLabel();
        lb_Telefone = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lb_DataEmissao = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lb_Numero = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_Produtos = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lb_ImpFed = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lb_ImpEst = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lb_ImpTotal = new javax.swing.JLabel();
        lb_ImpMun = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        lb_Valor = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        bt_Volta_Novo = new javax.swing.JButton();
        bt_EmiteNFe = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total: ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nota Fiscal Eletrônica - NF-e");

        lb_NomeEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_NomeEmpresa.setText("<Nome>");

        lb_Endereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_Endereco.setText("<Endereço>");

        lb_Bairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_Bairro.setText("<Bairro>");

        lb_Cidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_Cidade.setText("<Cidade>");

        lb_CEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_CEP.setText("<CEP>");

        lb_CNPJ.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_CNPJ.setText("<CNPJ>");

        lb_IE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_IE.setText("<IE>");

        lb_Telefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_Telefone.setText("<Telefone>");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Inscrição Estadual:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("CNPJ:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Telefone:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("CEP:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Cidade:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Bairro:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Endereço:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Razão Social:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Data de Emissão:");

        lb_DataEmissao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_DataEmissao.setText("<Data_Emissao>");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Número NF-e:");

        lb_Numero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_Numero.setText("<Numero>");

        tb_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço", "Quatidade", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tb_Produtos);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Dados da Empresa");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Impostos Federais:");

        lb_ImpFed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_ImpFed.setText("<Imp_Fed>");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("Impostos Estaduais:");

        lb_ImpEst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_ImpEst.setText("<Imp_Est>");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("Impostos Municipais:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setText("Total de impostos:");

        lb_ImpTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_ImpTotal.setText("<Imp_Total>");

        lb_ImpMun.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_ImpMun.setText("<Imp_Mun>");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Total:");

        lb_Valor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_Valor.setText("<Valor>");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Cálculo de Imposto");

        bt_Volta_Novo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_Volta_Novo.setText("Cancelar");
        bt_Volta_Novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_Volta_NovoMouseClicked(evt);
            }
        });

        bt_EmiteNFe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_EmiteNFe.setText("Emitir Nota Fiscal");
        bt_EmiteNFe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EmiteNFeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_Bairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lb_CNPJ))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lb_Telefone))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lb_IE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_Cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_CEP))
                            .addComponent(jSeparator2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(jSeparator7)
                            .addComponent(jSeparator5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_DataEmissao))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_Endereco))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_NomeEmpresa))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addComponent(jLabel23))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_ImpFed))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_ImpEst))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_ImpTotal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_ImpMun)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_Volta_Novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_EmiteNFe))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_Numero))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_Valor))))
                            .addComponent(jSeparator1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lb_NomeEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lb_Endereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lb_Cidade)
                            .addComponent(jLabel14)
                            .addComponent(lb_CEP))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lb_Bairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lb_Telefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lb_CNPJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lb_IE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lb_DataEmissao)
                    .addComponent(jLabel21)
                    .addComponent(lb_Numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(lb_Valor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lb_ImpFed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(lb_ImpEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(lb_ImpMun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(lb_ImpTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_EmiteNFe)
                    .addComponent(bt_Volta_Novo))
                .addContainerGap())
            .addComponent(jScrollBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Volta_NovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_Volta_NovoMouseClicked
        if (status_emissao == true) {
            Janela.p2 = new Janela_Vendas();
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(Janela.p8);
            janela.add(Janela.p2, BorderLayout.CENTER);
            janela.pack();
            janela.setLocationRelativeTo(null);
        } else {
            Janela.p2 = new Janela_Vendas();
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(Janela.p8);
            janela.add(Janela.p2, BorderLayout.CENTER);
            janela.pack();
            janela.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_bt_Volta_NovoMouseClicked

    private void bt_EmiteNFeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EmiteNFeMouseClicked
        if (status_emissao == false) {
            switch (JOptionPane.showConfirmDialog(this, "Confirma Emissão?")){
                    case 0: System.out.println("Selecionou: Sim;");
                            emitirNFe();
                    break;
                case 1: System.out.println("Selecionou: Não;");
                    break;
                case 2: System.out.println("Selecionou: Cancelar;");
                    break;
            }
        }
    }//GEN-LAST:event_bt_EmiteNFeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_EmiteNFe;
    private javax.swing.JButton bt_Volta_Novo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lb_Bairro;
    private javax.swing.JLabel lb_CEP;
    private javax.swing.JLabel lb_CNPJ;
    private javax.swing.JLabel lb_Cidade;
    private javax.swing.JLabel lb_DataEmissao;
    private javax.swing.JLabel lb_Endereco;
    private javax.swing.JLabel lb_IE;
    private javax.swing.JLabel lb_ImpEst;
    private javax.swing.JLabel lb_ImpFed;
    private javax.swing.JLabel lb_ImpMun;
    private javax.swing.JLabel lb_ImpTotal;
    private javax.swing.JLabel lb_NomeEmpresa;
    private javax.swing.JLabel lb_Numero;
    private javax.swing.JLabel lb_Telefone;
    private javax.swing.JLabel lb_Valor;
    private javax.swing.JTable tb_Produtos;
    // End of variables declaration//GEN-END:variables
}
