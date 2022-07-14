package sys.Controller;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import sys.Model.*;
import sys.View.Janela;
import sys.View.Janela_Login;
import sys.View.*;

public class UsersController implements DataInterface {
    
    private static ArrayList <User> listaUsers = new ArrayList();
    
    public UsersController() {
        
    }
    
    public void Verifica_Admin(){
        boolean temadmin = false;
        
        for (int i = 0; i < listaUsers.size(); i++) {
            if (listaUsers.get(i).getUser().equals("admin") && listaUsers.get(i).getSenha().equals("1234")) {
                temadmin = true;
            }
        }
        if (temadmin == false) {
            admin admin = new admin("admin","1234");
            listaUsers.add(admin);
        }
    }

    
    public void Verifica_Login(String user, String senha){
        try {
            if (user.equals("")) {
                //campo user em branco
                throw new InvalidUserException("Campo Usuário em branco.");
            } else {
                if (senha.equals("")) {
                    throw new InvalidPasswordException("Campo Senha em branco.");
                } else {
                    boolean status = false;
                    for (int i = 0; i < listaUsers.size(); i++) {
                        if (listaUsers.get(i).getUser().equals(user)) {
                            //Usuário existe
                            status = true;
                            if (listaUsers.get(i).getSenha().equals(senha)) {
                                //login autorizado
                                System.out.println("login ok");
                                if (listaUsers.get(i) instanceof admin) {
                                    Janela_Opcoes();
                                } else {
                                    Janela_Vendas();
                                }
                            } else {
                                throw new InvalidPasswordException("Senha incorreta.");
                                }
                            }
                        }
                        if (status == false) {
                            //Usuário não existe
                            throw new InvalidUserException("Usuário não encontrado");
                            }
                    } 
                }
        } catch (InvalidUserException e) {
            System.err.println("Erro: "+e.getMessage());
        }
        catch (InvalidPasswordException e) {
            System.err.println("Erro: "+e.getMessage());
        }
    }
    
    public boolean Cadastramento(String username, String senha, boolean adm, boolean vendedor){
        try {
            
            if (username.equals("")) {
                throw new InvalidValuesException("Campo Usuário em branco.");
            } else {
                if (senha.equals("")) {
                    throw new InvalidValuesException("Campo Senha em branco.");
                } else {
                    if (adm == false && vendedor == false) {
                        throw new InvalidValuesException("É necessário escolher um Tipo.");
                    } else {
                        if (adm) {
                            boolean temadmin = false;
                            for (int i = 0; i < listaUsers.size(); i++) {
                                if (listaUsers.get(i).getUser().equals(username)) {
                                    temadmin = true;
                                }
                            }
                        if (temadmin == false) {
                            admin testeadm = new admin(username, senha);
                            listaUsers.add(testeadm); //Cadastra user admin
                            return true;
                        } else {
                            throw new InvalidValuesException("Usuário já cadastrado.");
                        }
                    } else {
                        boolean temvend = false;
                            for (int i = 0; i < listaUsers.size(); i++) {
                                if (listaUsers.get(i).getUser().equals(username)) {
                                    temvend = true;
                                }
                            }
                        if (temvend == false) {
                            vendedor testevend = new vendedor(username, senha);
                            listaUsers.add(testevend); //Cadastra user vendedor
                            return true;
                        } else {
                            throw new InvalidValuesException("Usuário já cadastrado.");
                            }
                        }
                    }
                }
            }
        } catch (InvalidValuesException e) {
            System.err.println("Erro: "+e.getMessage());
        }
        return false;
    }
    
    public boolean editaUsuario(String username, String newUser, String newSenha){
        try {
            if (username.equals("")) {
                throw new InvalidUserException("É necessário selecionar o usuário na tabela.");
            } else {
                if (newUser.equals("")) {
                throw new InvalidUserException("Campo Usuário em branco.");
            } else {
                if (newSenha.equals("")) {
                    throw new InvalidUserException("Campo Senha em branco.");
                } else {
                    boolean temuser = false;
                        if (username.equals(newUser) == false) {
                            for (int i = 0; i < listaUsers.size(); i++) {
                                if (listaUsers.get(i).getUser().equals(newUser)) {
                                    temuser = true;
                                }
                            }
                        } 
                    if (temuser == false) {
                        for (int i = 0; i < listaUsers.size(); i++) {
                        if (listaUsers.get(i).getUser().equals(username)) {
                            listaUsers.get(i).setUser(newUser);
                            listaUsers.get(i).setSenha(newSenha);
                            return true;
                            }
                        }
                    } else {
                        throw new InvalidUserException("Usuário já cadastrado.");
                    }
                }
            }
        }
        } catch (InvalidUserException e) {
            System.err.println("Erro: "+e.getMessage());
        }
        return false;
    }
    
    public boolean removeUsuario(String username){
        try {
            if (username.equals("")) {
                throw new InvalidUserException("É necessário selecionar o usuário na tabela.");
            } else {
                if (username.equals("")) {
                throw new InvalidUserException("Campo Usuário em branco.");
            } else {
                    //Verifica quantidade de adms
                    int qtdeAdm = 0;
                    for (int i = 0; i < listaUsers.size(); i++) {
                        if (listaUsers.get(i) instanceof admin) {
                            qtdeAdm++;
                        }
                    }
                    if (qtdeAdm == 1) {
                        throw new InvalidUserException("Não é possível excluir todos os Administradores.");
                    } else {
                        for (int i = 0; i < listaUsers.size(); i++) {
                        if (listaUsers.get(i).getUser().equals(username)) {
                            listaUsers.remove(i);
                            return true;
                            }
                        }
                    }
                }
            }

        } catch (InvalidUserException e) {
            System.err.println("Erro: "+e.getMessage());
        }
        return false;
    }
    
    
    public ArrayList getListaUsers(){
        return listaUsers;
    }
    
    @Override
    public void carregaDados(){
        try {
            SerialController desserializaLista = new SerialController();
            this.listaUsers = desserializaLista.desserializarUsuarios();
        } catch (InvalidUserException e) {
            System.err.println("Erro: "+e.getMessage());
        }
        
    }
    
    public void salvaDados(){
        try {
            SerialController serializaLista = new SerialController();
            ArrayList <User> lista;
            lista = null;
            lista = getListaUsers();
            serializaLista.serializarUsuarios(lista);
            System.out.println("lista " + lista.toString());
        } catch (InvalidUserException e) {
        }
    }
    
    public void Sair(){
        // salva dados
        System.exit(0);
    }
    
    public void Janela_Vendas(){
        Janela_Login.gotoJanela_Vendas();
    }
    
    public void Janela_Opcoes(){
        Janela_Login.gotoJanela_Opcoes();
    }
    
}
