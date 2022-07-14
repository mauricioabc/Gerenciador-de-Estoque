package sys.Controller;

import javax.swing.JOptionPane;

public class InvalidValuesException extends RuntimeException {
    
    public InvalidValuesException(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, "Erro: " + message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
}
