import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.*;
public class HomePage extends JFrame implements ActionListener {
	
	DefaultTableModel tableModel = new DefaultTableModel();
	JLabel code = new JLabel("Book Code: ");
    JLabel title = new JLabel("Book Title: ");
    JLabel date = new JLabel("Date Added: ");
    JLabel shelf = new JLabel("Shelf No: ");
    JLabel name = new JLabel("Library Management System ");
   
    JTextField j1 = new JTextField();
    JTextField j2 = new JTextField();
    JTextField j3 = new JTextField();
    JTextField j4 = new JTextField();
  
    JButton add = new JButton("Add");
    JButton delete = new JButton("Delete");
    
     JLabel label = new JLabel("Test");
     
     static String col[]={"CODE","TITLE","DATE ADDED","SHELF NO."};
     static String row[][];
     JTable jt = new JTable(null,col);
     static DefaultTableModel model = new DefaultTableModel(null,col);
     JScrollPane sp = new JScrollPane(jt);
     


    public HomePage(){   
        
        add(code);
        add(jt);
        add(title);
        add(date);
        add(shelf);
        add(name);
        
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        
        add(add);
        add(delete);
        
        code.setBounds(400, 140, 155, 50);
        title.setBounds(400, 180, 155, 50);
        date.setBounds(400,220, 155, 50);
        shelf.setBounds(400, 260, 185, 50);
        name.setBounds(250, 30, 350, 50);
        
        Color Sbrown = new Color (139, 68, 17);
        jt.setBackground(Color.decode("#f5f5dc"));
        code.setForeground(Sbrown);
        title.setForeground(Sbrown);
        date.setForeground(Sbrown);
        shelf.setForeground(Sbrown);
        name.setForeground(Sbrown);
        
        sp = new JScrollPane(jt);
        add(sp);
        sp.setBounds(25, 105, 350, 300);
        jt.setModel(model);
        
        j1.setBounds(500, 145, 150, 30);
        j2.setBounds(500, 185, 150, 30);
        j3.setBounds(500, 225, 150, 30);
        j4.setBounds(500, 265, 150, 30);        
        
        add.setBounds(450, 320, 100, 30);
        delete.setBounds(570, 320, 100, 30);  
        
        Color LGreen = new Color (223, 240, 226);
        Color beige = new Color (245, 245, 221);
        
        add.addActionListener(this);
        delete.addActionListener(this);
   
        
        name.setFont(new Font(null,Font.BOLD,25));
        
        this.setSize(1500,1200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Library Management System");
        this.setDefaultCloseOperation(HomePage.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 500));
        this.getContentPane().setBackground(beige);
        this.pack();
        this.setVisible(true);
        
       
        
        
    }     

    @Override
    public void actionPerformed(ActionEvent e) {
 
   	 
    	 model.addRow(new Object[]{j1.getText(),j2.getText(),j3.getText(),j4.getText()});
    	 j1.setText("");
    	 j2.setText("");
    	 j3.setText("");
    	 j4.setText("");
    	 if(e.getSource()==delete) {
    		 
    		 try{

    			    DefaultTableModel dtm = (DefaultTableModel) jt.getModel();

    			    dtm.setNumRows(0); 

    			}catch(Exception s){
    			}
    	 }
    	
   
    }    
    
    public static void main(String [] args){
        HomePage obj = new HomePage();
        obj.setVisible(true);   
    }


}


