package voroncalc;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

	public static void main(String[] args) {
		
		/*// Покажет все доступные LookAndFeel
		 * UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels(); for
		 * (UIManager.LookAndFeelInfo look : looks) {
		 * System.out.println(look.getClassName()); }
		 */
		       
        try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		           
		new App();

	}

}
