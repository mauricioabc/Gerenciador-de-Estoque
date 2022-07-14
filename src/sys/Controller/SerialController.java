package sys.Controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import sys.Model.Empresa;
import sys.Model.Estoque;
import sys.Model.Precos;
import sys.Model.User;
import sys.Model.tax;

public class SerialController implements SerializerInterface{

    public SerialController() {
        
    }
    
    @Override
    public void serializarUsuarios(ArrayList listaUsers){
        String nomeArquivo = "lista_Usuarios.ser";
        //Serialização
        try {
            
            FileOutputStream arquivo =  new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            
            out.writeObject(listaUsers);
            out.close();
            arquivo.close();
            
            System.out.println("Objeto serializado com sucesso!");
            
        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Erro na serialização do Objeto!");
        }
        
    }
    
    @Override
    public ArrayList <User> desserializarUsuarios(){
        String nomeArquivo = "lista_Usuarios.ser";
        ArrayList <User> listaUsers = new ArrayList();
        
        // Desserialização
        try {
            
            FileInputStream arquivo = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(arquivo);
            
            listaUsers = (ArrayList<User>) in.readObject();
            in.close();
            arquivo.close();
            
            System.out.println("Objeto desserializado com sucesso!");
            
            System.out.println("Objeto: " + listaUsers.toString());
            return listaUsers;
            
        } catch (IOException e) {
            System.out.println("Erro na desserialização.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada.");
        }
        return null;
        
    }
    
    @Override
    public void serializarEstoque(Estoque estoque){
        String nomeArquivo = "Estoque.ser";
        //Serialização
        try {
            
            FileOutputStream arquivo =  new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            
            out.writeObject(estoque);
            out.close();
            arquivo.close();
            
            System.out.println("Objeto serializado com sucesso!");
            System.out.println("item " + estoque.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Erro na serialização do Objeto!");
        }
        
    }
    
    @Override
    public Estoque desserializarEstoque(){
        String nomeArquivo = "Estoque.ser";
        Estoque est;
        // Desserialização
        try {
            
            FileInputStream arquivo = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(arquivo);
            
            est = (Estoque) in.readObject();
            in.close();
            arquivo.close();
            
            System.out.println("Objeto desserializado com sucesso!");
            
            System.out.println("Objeto: " + est.toString());
            return est;
            
        } catch (IOException e) {
            System.out.println("Erro na desserialização.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada.");
        }
        return null;
        
    }
    
    @Override
    public void serializarPrecos(Precos preco){
        String nomeArquivo = "Precos.ser";
        //Serialização
        try {
            
            FileOutputStream arquivo =  new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            
            out.writeObject(preco);
            out.close();
            arquivo.close();
            
            System.out.println("Objeto serializado com sucesso!");
            System.out.println("item " + preco.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Erro na serialização do Objeto!");
        }
        
    }
    
    @Override
    public Precos desserializarPrecos(){
        String nomeArquivo = "Precos.ser";
        Precos prec;
        // Desserialização
        try {
            
            FileInputStream arquivo = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(arquivo);
            
            prec = (Precos) in.readObject();
            in.close();
            arquivo.close();
            
            System.out.println("Objeto desserializado com sucesso!");
            
            System.out.println("Objeto: " + prec.toString());
            return prec;
            
        } catch (IOException e) {
            System.out.println("Erro na desserialização.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada.");
        }
        return null;
        
    }
    
    @Override
    public void serializarTax(tax taxes){
        String nomeArquivo = "Taxes.ser";
        //Serialização
        try {
            
            FileOutputStream arquivo =  new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            
            out.writeObject(taxes);
            out.close();
            arquivo.close();
            
            System.out.println("Objeto serializado com sucesso!");
            System.out.println("item " + taxes.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Erro na serialização do Objeto!");
        }
        
    }
    
    @Override
    public tax desserializarTax(){
        String nomeArquivo = "Taxes.ser";
        tax taxes;
        // Desserialização
        try {
            
            FileInputStream arquivo = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(arquivo);
            
            taxes = (tax) in.readObject();
            in.close();
            arquivo.close();
            
            System.out.println("Objeto desserializado com sucesso!");
            
            System.out.println("Objeto: " + taxes.toString());
            return taxes;
            
        } catch (IOException e) {
            System.out.println("Erro na desserialização.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada.");
        }
        return null;
        
    }
    
    @Override
    public void serializarEmpresa(Empresa empresa){
        String nomeArquivo = "Empresa.ser";
        //Serialização
        try {
            
            FileOutputStream arquivo =  new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            
            out.writeObject(empresa);
            out.close();
            arquivo.close();
            
            System.out.println("Objeto serializado com sucesso!");
            System.out.println("item " + empresa.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Erro na serialização do Objeto!");
        }
        
    }
    
    @Override
    public Empresa desserializarEmpresa(){
        String nomeArquivo = "Empresa.ser";
        Empresa empresa;
        // Desserialização
        try {
            
            FileInputStream arquivo = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(arquivo);
            
            empresa = (Empresa) in.readObject();
            in.close();
            arquivo.close();
            
            System.out.println("Objeto desserializado com sucesso!");
            
            System.out.println("Objeto: " + empresa.toString());
            return empresa;
            
        } catch (IOException e) {
            System.out.println("Erro na desserialização.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada.");
        }
        return null;
        
    }
    
}
