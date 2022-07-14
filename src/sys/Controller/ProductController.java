package sys.Controller;

import sys.Model.Estoque;
import sys.Model.Precos;

public class ProductController implements DataInterface {
    
    private static Estoque estoque;
    private static Precos preco;
    
    public ProductController() {
        
    }
    
    public boolean salvaDados(int p2, int p6, int p8, int p13, int p20, int p45){
        try {
            int qp2, qp6, qp8, qp13, qp20, qp45;
            SerialController serializa = new SerialController();
            
            qp2 = estoque.getP2() + p2;
            qp6 = estoque.getP6() + p6;
            qp8 = estoque.getP8() + p8;
            qp13 = estoque.getP13() + p13;
            qp20 = estoque.getP20() + p20;
            qp45 = estoque.getP45() + p45;
            
            estoque = new Estoque(qp2, qp6, qp8, qp13, qp20, qp45);
            serializa.serializarEstoque(estoque);
            return true;
        } catch (InvalidValuesException e) {
            return false;
        }
    }
    
    @Override
    public void carregaDados(){
        try {
            SerialController desserializa = new SerialController();
            estoque = desserializa.desserializarEstoque();
        } catch (InvalidValuesException e) {
        }
    }
    
    public Estoque getEstoque(){
        return estoque;
    }
    
    public Precos getPrecos(){
        return preco;
    }
    
    public boolean salvaPrecos(String pP2, String pP6, String pP8, String pP13, String pP20, String pP45){
        try {
            double p2, p6, p8, p13, p20, p45;
            if (pP2.equals("") || pP6.equals("") || pP8.equals("") ||
                pP13.equals("") || pP20.equals("") || pP45.equals("")  ) {
                throw new InvalidValuesException("É necessário preencher todos os campos.");
            } else {
                try {
                    p2 = Double.parseDouble(pP2);
                } catch (InvalidValuesException e) {
                    throw new InvalidValuesException("O campo P02 deve ser preenchido com valor númerico.");
                }
                try {
                    p6 = Double.parseDouble(pP6);
                } catch (InvalidValuesException e) {
                    throw new InvalidValuesException("O campo P06 deve ser preenchido com valor númerico.");
                }
                try {
                    p8 = Double.parseDouble(pP8);
                } catch (InvalidValuesException e) {
                    throw new InvalidValuesException("O campo P08 deve ser preenchido com valor númerico.");
                }
                try {
                    p13 = Double.parseDouble(pP13);
                } catch (InvalidValuesException e) {
                    throw new InvalidValuesException("O campo P013 deve ser preenchido com valor númerico.");
                }
                try {
                    p20 = Double.parseDouble(pP20);
                } catch (InvalidValuesException e) {
                    throw new InvalidValuesException("O campo P20 deve ser preenchido com valor númerico.");
                }
                try {
                    p45 = Double.parseDouble(pP45);
                } catch (InvalidValuesException e) {
                    throw new InvalidValuesException("O campo P45 deve ser preenchido com valor númerico.");
                }
                if (p2 < 0 || p6 < 0 || p8 < 0 || p13 < 0 || p20 < 0 || p45 < 0 ) {
                    throw new InvalidValuesException("Os preços não podem ser inferiores à zero.");
                } else {
                    preco = new Precos(p2,p6,p8,p13,p20,p45);
                    SerialController serializa = new SerialController();
                    serializa.serializarPrecos(preco);
                    return true;
                }
            }
        } catch (InvalidValuesException e) {
            return false;
        }
    }
    
    public void carregaDados2(){
        try {
            SerialController desserializa = new SerialController();
            preco = desserializa.desserializarPrecos();
        } catch (InvalidValuesException e) {
        }
    }
    
    public boolean verificaEstoque(int p2, int p6, int p8, int p13, int p20, int p45){
        boolean status = false;
        try {
            if ((estoque.getP2() - p2) < 0) {
                throw new InvalidValuesException("Estoque de P02 insuficiente.");
            } else {
                if ((estoque.getP6() - p6) < 0) {
                    throw new InvalidValuesException("Estoque de P06 insuficiente.");
                } else {
                    if ((estoque.getP8() - p8) < 0) {
                        throw new InvalidValuesException("Estoque de P08 insuficiente.");
                    } else {
                        if ((estoque.getP13() - p13) < 0) {
                            throw new InvalidValuesException("Estoque de P13 insuficiente.");
                        } else {
                            if ((estoque.getP20() - p20) < 0) {
                                throw new InvalidValuesException("Estoque de P20 insuficiente.");
                            } else {
                                if ((estoque.getP45() < 0)) {
                                    throw new InvalidValuesException("Estoque de P45 insuficiente.");
                                } else {
                                    if (p2 == 0 && p6 == 0 && p8 == 0 && p13 == 0 && p20 == 0 && p45 == 0) {
                                        throw new InvalidValuesException("É necessário selecionar ao menos um produto.");
                                    } else {
                                        //Venda Ok
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            } catch(InvalidValuesException e) {
                return false;
            }
    }
    
    public void realizaVenda(int p2, int p6, int p8, int p13, int p20, int p45){
        try {
            //Executa a venda
            int qp2, qp6, qp8, qp13, qp20, qp45;
            SerialController serializa = new SerialController();

            qp2 = estoque.getP2() - p2;
            qp6 = estoque.getP6() - p6;
            qp8 = estoque.getP8() - p8;
            qp13 = estoque.getP13() - p13;
            qp20 = estoque.getP20() - p20;
            qp45 = estoque.getP45() - p45;

            estoque = new Estoque(qp2, qp6, qp8, qp13, qp20, qp45);
            serializa.serializarEstoque(estoque);
        } catch (InvalidValuesException e) {
        }
        
    }
    
}
