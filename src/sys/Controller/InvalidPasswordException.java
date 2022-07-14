package sys.Controller;

import javax.swing.JOptionPane;

public class InvalidPasswordException extends RuntimeException{
   
    public InvalidPasswordException(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, "Erro: " + message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
}
