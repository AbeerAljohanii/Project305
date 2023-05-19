package project305;
import javax.swing.JOptionPane;
public class loginClass {

    private DataBase database = new DataBase();

    boolean isValid(String enteredEmail, String enteredPassword) throws ClassNotFoundException {
        boolean flag = false;
        String name = enteredEmail;
        String password = enteredPassword;
        if (name.isEmpty() || name.trim().equalsIgnoreCase("")) {//check if the user did not enter name 
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        } else if (password.isEmpty() || password.trim().equalsIgnoreCase("")) {//check if the user did not enter password 
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        } else if (password.equalsIgnoreCase("") && name.equalsIgnoreCase("")) { // check if the user and password null
            JOptionPane.showMessageDialog(null, "Please Enter Password and Username");
        } else {
            //check if the username and password valid
            if (database.checkUsername(name)) {
                if (database.checkUsername_Password(name, password)) {
                    flag = true; // login successfuly
                } else {
                    JOptionPane.showMessageDialog(null, "The password is incorrect. Try again "); // check if the user name and password do not match
                }
            } else {
                JOptionPane.showMessageDialog(null, "The username incorrect.");
            }
        }
        return flag;
    }
}
