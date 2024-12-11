package voroncalc;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class App extends JFrame {
	
	private int voron = 0;
	private JLabel countLabel;
	private JButton addCrow;
	private JButton removeCrow;
	
	private static final long serialVersionUID = 1L;

	public App() {
		
		super("Счетчик ворон");

		String path = "./images/1.png";
		ImageIcon icon = new ImageIcon(App.class.getResource(path));
		setIconImage(icon.getImage());
		
		setSize(500, 100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		countLabel = new JLabel("Вороны: " + voron);
	    addCrow = new JButton("Добавить ворону");
	    removeCrow = new JButton("Удалить ворону");

	    
	    JPanel buttonsPanel = new JPanel(new FlowLayout()); 
	
	    buttonsPanel.add(countLabel, BorderLayout.NORTH); 

	    buttonsPanel.add(addCrow);
	    buttonsPanel.add(removeCrow);

	    add(buttonsPanel, BorderLayout.SOUTH);
				
		setVisible(true);
		
		initListeners();
	
	}
	
	private void initListeners() {
	    addCrow.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		voron = voron + 1;   
	    		updateCrowCounter(); 
	    	}
	    });
	    
	     
	    removeCrow.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (voron > 0) {
	    			voron = voron - 1;
	    			updateCrowCounter(); 
	    		}
	       
	    	}
	    });
	    
	}
	
	/* Сообщаем аппликации, что количество ворон изменилось  */
	private void updateCrowCounter() {
	     countLabel.setText("Вороны: " + voron);
	}

}
