import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class SimpleAction implements ActionListener
{
    private String _message;

    public SimpleAction(String message)
    {
        this._message = message;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(null, this._message);
    }
}