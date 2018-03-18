import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cadastro
{
	private JFrame _frame;
    private List<JComponent> _components = new ArrayList<JComponent>();

    private String[] _fields;
    private Map<String, ActionListener> _actions;

    public Cadastro()
    {
        initializeFields();
        initializeActions();
        initializeComponents();
        initializeFrame();
    }


    public void showFrame()
    {
        this._frame.setVisible(true);
    }

    private void initializeFields()
    {
        this._fields = new String[]{ "Modelo", "Ano", "Placa" };
    }

    private void initializeActions()
    {
        Map<String, ActionListener> actions = new HashMap<String, ActionListener>();
        actions.put("Limpar", new ClearAction(this._components));
        actions.put("Adicionar", new SimpleAction("Carro Adicionado!"));
        actions.put("Alterar", new SimpleAction("Carro Alterado!"));
        actions.put("Excluir", new DeleteAction(this._components));
        actions.put("Buscar", new SimpleAction("Busca realizada!"));
        this._actions = actions;
    }

    private void initializeComponents()
    {
        initializeInputFields();
        initializeActionButtons();
    }


	private void initializeActionButtons() {
		for (Map.Entry<String, ActionListener> action : _actions.entrySet())
        {
            JButton button = new JButton(action.getKey());
            button.addActionListener(action.getValue());
            this._components.add(button);
        }
	}


    private void initializeInputFields()
    {
		for(String field : _fields)
        {
            JTextField textField = new JTextField();
            JLabel label = new JLabel(field);
            label.setLabelFor(textField);
            this._components.add(label);
            this._components.add(textField);
        }
	}


    private void initializeFrame() {
		this._frame = new JFrame("Cadastro de Carro");
        this._frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this._frame.setSize(400, 300);
        this._frame.setLayout(new GridLayout(0,2));
        for(JComponent component : this._components)
            this._frame.add(component);

	}

}