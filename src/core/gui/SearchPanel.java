package core.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchPanel extends JPanel {
    private MWindow window;
    private GridBagConstraints gbc;
    
    private JTextField vinInput;
    private JButton vinBtn;
    private JTextField partNoInput;
    private JButton partNoBtn;
    
    public SearchPanel(MWindow window) {
        this.window = window;
        gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
        
        vinInput = new JTextField(20);
        vinBtn = new JButton("Search");
        
        partNoInput = new JTextField(20);
        partNoBtn = new JButton("Search");
        
        add(vinInput, gbc);
        add(vinBtn, gbc);
//        add(partNoInput, gbc);
//        add(partNoSearch, gbc);
    }
}
