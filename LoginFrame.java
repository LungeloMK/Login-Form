
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class LoginFrame extends JFrame {
    
    //Panels
    private JPanel mainPnl;
    private JPanel headingsPnl;
    private JPanel loginDetailsPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel buttonsPnl;
    // labels
    private JLabel headingsLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    //text field
    private JTextField usernameTxtFld;
    private JPasswordField passwordTxtFld;
    //narmal buttons
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public LoginFrame() {
    setTitle("Login page");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setDefaultLookAndFeelDecorated(true);
    setResizable(true);
    setSize(300, 200); // increased a bit to fit fields properly
    
    // main panel (initialize it first!)
    mainPnl = new JPanel(new BorderLayout());
    
    //headings panel
    headingsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
    headingsLbl = new JLabel("Login");
    headingsLbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD+Font.ITALIC,30));
    headingsLbl.setBorder(new BevelBorder(BevelBorder.RAISED));
    headingsLbl.setForeground(Color.red);
    headingsPnl.add(headingsLbl);
    
    //Panel of login details
    loginDetailsPnl = new JPanel(new GridLayout(2,1));
    loginDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Login details"));
    
    //name row
    usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    usernameLbl = new JLabel("Username: ");
    usernameTxtFld = new JTextField(12); // give it a column width
    usernamePnl.add(usernameLbl);
    usernamePnl.add(usernameTxtFld);
    
    //password row
    passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    passwordLbl = new JLabel("Password: ");
    passwordTxtFld = new JPasswordField(12); // give it a column width
    passwordPnl.add(passwordLbl);
    passwordPnl.add(passwordTxtFld);
    
    // add username and password rows to loginDetails
    loginDetailsPnl.add(usernamePnl);
    loginDetailsPnl.add(passwordPnl);
    
    //buttons panel
    buttonsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
    submitBtn = new JButton("Submit");
    clearBtn = new JButton("Clear");
    exitBtn = new JButton("Exit");
    buttonsPnl.add(submitBtn);
    buttonsPnl.add(clearBtn);
    buttonsPnl.add(exitBtn);
    
    // assemble main panel
    mainPnl.add(headingsPnl, BorderLayout.NORTH);
    mainPnl.add(loginDetailsPnl, BorderLayout.CENTER);
    mainPnl.add(buttonsPnl, BorderLayout.SOUTH);
    
    // add main panel to frame
    add(mainPnl);
    
    setVisible(true);
}
    
    
    
}
