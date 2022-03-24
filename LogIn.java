import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LogIn implements ActionListener {
	
	JFrame frame = new JFrame();
	   JButton loginButton = new JButton("Log In");
	   JButton resetButton = new JButton("Clear");
	   JTextField userIDField = new JTextField();
	   JPasswordField userPasswordField = new JPasswordField();
	   JLabel library = new JLabel("LIBRARY MANAGEMENT SYSTEM LOGIN ");
	   JLabel userIDLabel = new JLabel ("UserName:");
	   JLabel userPassLabel = new JLabel ("Password:");
	   JLabel messageLabel = new JLabel ();
	   
	    
	    HashMap<String, String> logininfo = new HashMap<String, String>();
	    LogIn(HashMap<String, String> loginInfoOriginal){
	    
	        logininfo = loginInfoOriginal;
	        
	        library.setBounds(150, 50, 300, 25);
	        userIDLabel.setBounds(125,100,75,25);
	           userPassLabel.setBounds(125,150,75,25);
	           library.setFont(new Font(null,Font.BOLD,15));
	           
	          
	           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setPreferredSize(new Dimension(550, 300));
	      frame.getContentPane().setBackground(Color.lightGray);
	      frame.pack();
	        
	        messageLabel.setBounds(200,250,250,35);
	        messageLabel.setFont(new Font(null,Font.ITALIC,25));
	        
	        userIDField.setBounds(200,100,200,25);
	        userPasswordField.setBounds(200,150,200,25);

	        
	        loginButton.setBounds(200,200,100,50);
	        loginButton.setFocusable(false);
	        loginButton.addActionListener(this);
	        
	        resetButton.setBounds(300,200,100,50);
	        resetButton.setFocusable(false);
	        resetButton.addActionListener(this);
	        
	        frame.add(library);
	          frame.add(userIDLabel);
	        frame.add(userPassLabel);
	        frame.add(messageLabel);
	        frame.add(userIDField);
	        frame.add(userPasswordField);
	        frame.add(loginButton);
	        frame.add(resetButton);
	        
	        
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(650,450);
	    frame.setLayout(null);
	    frame.setVisible(true);
	        
	    }
	    @Override
	    public void actionPerformed(ActionEvent e){
	    
	    	if(e.getSource()==resetButton) {
	    		
	    		userIDField.setText("");
	    		userPasswordField.setText("");
	    		
	    	}
	    	if(e.getSource()==loginButton) {
	    		
	    		String userID = userIDField.getText();
	    		String password = String.valueOf(userPasswordField.getPassword());
	    		
	    		if(logininfo.containsKey(userID)) {
	    			if(logininfo.get(userID).equals(password)) {
	    				messageLabel.setForeground(Color.green);
	    				messageLabel.setText("Login Successful");
	    				HomePage Home = new HomePage();
	    			}
	    			else {
	    				messageLabel.setForeground(Color.red);
	    				messageLabel.setText("Wrong Password");
	    			}
	    		}
	    		else {
    				messageLabel.setForeground(Color.red);
    				messageLabel.setText("Username not found");
    			}
	    	}
	    	
	    }
	    

}
