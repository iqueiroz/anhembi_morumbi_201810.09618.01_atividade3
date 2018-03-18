import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JTextField;
import java.util.List;


public class ClearAction implements ActionListener
{
    private static final String EMPTY = "";

    private List<JComponent> _components;
    
    public ClearAction(List<JComponent> components)
    {
        this._components = components;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        for(JComponent component : this._components)
        {
            if(component instanceof JTextField)
            {
                ((JTextField)component).setText(EMPTY);
            }
        }
    }
}