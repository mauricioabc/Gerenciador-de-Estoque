package sys.Controller;

import java.util.ArrayList;
import sys.Model.Empresa;
import sys.Model.Estoque;
import sys.Model.Precos;
import sys.Model.User;
import sys.Model.tax;

public interface SerializerInterface {
    
    public void serializarUsuarios(ArrayList listaUsers);
    public ArrayList <User> desserializarUsuarios();
    
    public void serializarEstoque(Estoque estoque);
    public Estoque desserializarEstoque();
    
    public void serializarPrecos(Precos preco);
    public Precos desserializarPrecos();
    
    public void serializarTax(tax taxes);
    public tax desserializarTax();
    
    public void serializarEmpresa(Empresa empresa);
    public Empresa desserializarEmpresa();
    
}
