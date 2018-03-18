import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import java.util.List;


public class DeleteAction extends ClearAction
{
    public DeleteAction(List<JComponent> components) 
    {
        super(components);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(JOptionPane.showConfirmDialog(null, "Voce deseja mesmo excluir o carro?", "Confirmacao de Exclusao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            super.actionPerformed(e);
            JOptionPane.showMessageDialog(null, "Carro excluido!");
        }
    }
}