import java.awt.*;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
	    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Stopwatch();
            }
        });
        
        //SwingUtilities.invokeLater(() -> new Stopwatch());
	}
}


