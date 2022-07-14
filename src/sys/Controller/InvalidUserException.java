package sys.Controller;

import javax.swing.JOptionPane;

public class InvalidUserException extends RuntimeException{
    
    public InvalidUserException(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, "Erro: " + message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
}