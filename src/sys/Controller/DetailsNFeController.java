package sys.Controller;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import sys.Model.Empresa;
import sys.Model.Estoque;
import sys.Model.tax;

public class DetailsNFeController implements DataInterface {

    private static tax taxes;
    private static Empresa empresa;
    
    public DetailsNFeController() {
        
    }
    
    public boolean verificaAliquotas(String mun, String est, String fed){
        double mun2, est2,fed2;
        try {
            if (mun.equals("")) {
                throw new InvalidValuesException("Campo Alíquota Municipal não preenchido.");
            } else {
                if (est.equals("")) {
                    throw new InvalidValuesException("Campo Alíquota Estadual não preenchido.");
                } else {
                    if (fed.equals("")) {
                        throw new InvalidValuesException("Campo Alíquota Federal não preenchido.");
                    } else {
                        try {
                            mun2 = Double.parseDouble(mun);
                        } catch (InvalidValuesException e) {
                            throw new InvalidValuesException("Campo Alíquota Municipal deve ser númerico.");
                        }
                        try {
                            est2 = Double.parseDouble(est);
                        } catch (InvalidValuesException e) {
                            throw new InvalidValuesException("Campo Alíquota Estadual deve ser númerico.");
                        }
                        try {
                            fed2 = Double.parseDouble(fed);
                        } catch (InvalidValuesException e) {
                            throw new InvalidValuesException("Campo Federal deve ser númerico.");
                        }
                        if (mun2 < 0 || est2 < 0 || fed2 < 0) {
                            throw new InvalidValuesException("Os valores não podem ser inferiores a zero.");
                        } else {
                            if (mun2 > 1 || est2 > 1 || fed2 > 1) {
                                throw new InvalidValuesException("Os valores não podem ser superiores a um.");
                            } else {
                                boolean status = false;
                                status = salvaDados(mun2, est2, fed2);
                                return status;
                            }
                        }
                    }
                }
            }
            
        } catch (InvalidValuesException e) {
            return false;
        }
    }
    
    public boolean salvaDados(double mun, double est, double fed){
        try {
            SerialController serializa = new SerialController();
            taxes = new tax(fed, est, mun);
            serializa.serializarTax(taxes);
            return true;
        } catch (InvalidValuesException e) {
            return false;
        }
    }
    
    @Override
    public void carregaDados(){
        try {
            SerialController desserializa = new SerialController();
            taxes = desserializa.desserializarTax();
        } catch (InvalidValuesException e) {
        }
    }
    
    public tax getTaxes(){
        return taxes;
    }
    
    public boolean verificaCNPJ(String CNPJ) {
        // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
            if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
                CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
                CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
                CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
                CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
               (CNPJ.length() != 14))
               return(false);

            char dig13, dig14;
            int sm, i, r, num, peso;

        // "try" - protege o código para eventuais erros de conversao de tipo (int)
            try {
        // Calculo do 1o. Digito Verificador
              sm = 0;
              peso = 2;
              for (i=11; i>=0; i--) {
        // converte o i-ésimo caractere do CNPJ em um número:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posição de '0' na tabela ASCII)
                num = (int)(CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                   peso = 2;
              }

              r = sm % 11;
              if ((r == 0) || (r == 1))
                 dig13 = '0';
              else dig13 = (char)((11-r) + 48);

        // Calculo do 2o. Digito Verificador
              sm = 0;
              peso = 2;
              for (i=12; i>=0; i--) {
                num = (int)(CNPJ.charAt(i)- 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                   peso = 2;
              }

              r = sm % 11;
              if ((r == 0) || (r == 1))
                 dig14 = '0';
              else dig14 = (char)((11-r) + 48);

        // Verifica se os dígitos calculados conferem com os dígitos informados.
              if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
                 return(true);
              else return(false);
            } catch (InputMismatchException erro) {
                return(false);
            }
          }

    public boolean verificaDados(String Nome, String endereco, String bairro, String cidade, String cep, String cnpj, String ie, String telefone){
        try {
            if (Nome.equals("")) {
                throw new InvalidValuesException("Campo Razão Social não preenchido.");
            } else {
                if (endereco.equals("")) {
                    throw new InvalidValuesException("Campo Endereço não preenchido.");
                } else {
                    if (bairro.equals("")) {
                        throw new InvalidValuesException("Campo Bairro não preenchido.");
                    } else {
                        if (cidade.equals("")) {
                            throw new InvalidValuesException("Campo Cidade não preenchido.");
                        } else {
                            if (cep.equals("")) {
                                throw new InvalidValuesException("Campo CEP não preenchido.");
                            } else {
                                if (cnpj.equals("")) {
                                    throw new InvalidValuesException("Campo CNPJ não preenchido.");
                                } else {
                                    if (ie.equals("")) {
                                        throw new InvalidValuesException("Campo Inscrição Estadual não preenchido.");
                                    } else {
                                        if (telefone.equals("")) {
                                            throw new InvalidValuesException("Campo Telefone não preenchido.");
                                        } else {
                                            if (verificaCNPJ(cnpj) == false) {
                                                throw new InvalidValuesException("CNPJ Inválido.");
                                            } else {
                                                boolean status = false;
                                                status = salvaDados2(Nome, endereco, bairro, cidade, cep, cnpj, ie, telefone);
                                                return status;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        } catch (InvalidValuesException e) {
            return false;
        }
    }
    
    public boolean salvaDados2(String Nome, String endereco, String bairro, String cidade, String cep, String cnpj, String ie, String telefone){
        try {
            SerialController serializa = new SerialController();
            empresa = new Empresa(Nome, endereco, bairro, cidade, cep, cnpj, ie, telefone);
            serializa.serializarEmpresa(empresa);
            return true;
        } catch (InvalidValuesException e) {
            return false;
        }
    }
    
    public void carregaDados2(){
        try {
            SerialController desserializa = new SerialController();
            empresa = desserializa.desserializarEmpresa();
        } catch (InvalidValuesException e) {
        }
    }
    
    public Empresa getEmpresa(){
        return empresa;
    }
    
}
    
