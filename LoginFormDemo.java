

 
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;  
  
//create CreateLoginForm class to create login form  
//class extends JFrame to create a window where our component add  
//class implements ActionListener to perform an action on button click  
class CreateLoginForm extends JFrame implements ActionListener  
{  
    
	
	//initialize button, panel, label, and text field  
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
      
    //calling constructor  
    CreateLoginForm()  
    {     
          
        //create label for username   
        userLabel = new JLabel();  
        userLabel.setText("Username");      //set label value for textField1  
          
        //create text field to get username from the user  
        textField1 = new JTextField(15);    //set length of the text  
  
        //create label for password  
        passLabel = new JLabel();  
        passLabel.setText("Password");      //set label value for textField2  
          
        //create text field to get password from the user  
        textField2 = new JPasswordField(15);    //set length for the password  
          
        //create submit button  
        b1 = new JButton("SUBMIT"); //set label to button  
          
        //create panel to put form elements  
        newPanel = new JPanel(new GridLayout(3,1));  
        newPanel.add(userLabel);    //set username label to panel  
        newPanel.add(textField1);   //set text field to panel  
        newPanel.add(passLabel);    //set password label to panel  
        newPanel.add(textField2);   //set text field to panel  
        newPanel.add(b1);           //set button to panel  
          
        //set border to panel   
        add(newPanel, BorderLayout.CENTER);  
          
        //perform action on button click   
        b1.addActionListener(this);     //add action listener to button  
        setTitle("LOGIN FORM");         //set title to the login form  
    }  
      
    //define abstract method actionPerformed() which will be called on button click   
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
        String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2  
        CreateLoginForm ld= new CreateLoginForm();
        System.out.println(passValue);
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select User_pass from Employees ");
			while(rs.next()) {
				String a =rs.getString("User_pass");
	 		 System.out.println(a);
	 		 System.out.println(passValue);
			if ( passValue.equals(a)) {  //if authentic, navigate user to a new page  
	            System.out.println("done");
			}
	            else{  
	                //show error message  
	                System.out.println("Please enter valid username and password");  
	            }
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
         }
//        try {
//			ld.act();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        //check whether the credentials are authentic or not  
//        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {  //if authentic, navigate user to a new page  
//              
//            //create instance of the NewPage  
//            NewPage page = new NewPage();  
//              
//            //make page visible to the user  
//            page.setVisible(true);  
//              
//            //create a welcome label and set it to the new page  
//            JLabel wel_label = new JLabel("Welcome: "+userValue);  
//            page.getContentPane().add(wel_label);  
//        }  
//        else{  
//            //show error message  
//            System.out.println("Please enter valid username and password");  
//        }  
    
    public void act() throws ClassNotFoundException, SQLException {
    	String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2
    	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select User_pass from Employees ");
		while(rs.next()) {
			String a =rs.getString("User_pass");
 		 System.out.println(a);
 		 System.out.println(passValue);
		if ( passValue.equals(a)) {  //if authentic, navigate user to a new page  
            System.out.println("done");
//          //create instance of the NewPage  
//          NewPage page = new NewPage();  
//            
//          //make page visible to the user  
//          page.setVisible(true);  
//            
//          //create a welcome label and set it to the new page  
//          JLabel wel_label = new JLabel("Welcome: "+userValue);  
//          page.getContentPane().add(wel_label);  
      }  
      else{  
          //show error message  
          System.out.println("Please enter valid username and password");  
      }
		}
    }
}  
//create the main class  
class LoginFormDemo  
{  
    //main() method start  
    public static void main(String arg[])  
    {  
        try  
        {  
            //create instance of the CreateLoginForm  
            CreateLoginForm form = new CreateLoginForm();  
            form.setSize(300,100);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {     
            //handle exception   
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
}
  



//create NewPage class to create a new page on which user will navigate  
//class NewPage extends JFrame  
//{  
//	//constructor  
//    NewPage()  
//    {  
//        setDefaultCloseOperation(javax.swing.  
//        WindowConstants.DISPOSE_ON_CLOSE);  
//        setTitle("Welcome");  
//        setSize(400, 200);  
//    }  
//}  