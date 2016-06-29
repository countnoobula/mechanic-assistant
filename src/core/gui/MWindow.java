package core.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;

public class MWindow extends JFrame {
    private GridBagConstraints gbc;
    
    private SearchPanel panelSearch;
    private CarInfoPanel panelCarInfo;
    
    public MWindow() {
        gbc = new GridBagConstraints();
        setLayout(new BorderLayout());
        
        // @todo
        panelSearch = new SearchPanel(this);
        
        add(panelSearch, BorderLayout.NORTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
    }
    
    public void init() {
        
    }
}
