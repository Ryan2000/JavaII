import java.awt.*;
import javax.swing.*;


public class Stopwatch {
	
    private JLabel aJLabel;
    private long start;
    
    
	public Stopwatch() {
		JFrame jFrame = new JFrame("My Stopwatch");
		jFrame.setLayout(new FlowLayout());
		jFrame.setSize(300, 80);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(al -> stopButtonAction(jFrame));


        JButton startButton = new JButton("Start");
        startButton.addActionListener(al -> startButtonAction(jFrame));

        aJLabel = new JLabel("Press Start");
        
        jFrame.getContentPane().add(startButton);
        jFrame.getContentPane().add(stopButton);
        jFrame.getContentPane().add(aJLabel);
        
        jFrame.setVisible(true);

	}

    private void startButtonAction(JFrame jFrame){
        JOptionPane.showMessageDialog(jFrame, "Start Clicked");
    }
    
    private void stopButtonAction(JFrame jFrame){
        JOptionPane.showMessageDialog(jFrame, "Stop Clicked");
    }
    
}
