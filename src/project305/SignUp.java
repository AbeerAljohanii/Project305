package project305;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SignUp {

    boolean flag;
    private DataBase database = new DataBase();
    private static int index;

    boolean isValid(String Username, String Fname, String Lname, String Email, String Phone, String password, String passConfirmField) throws SQLException, ClassNotFoundException {
        flag = false;
        if (Username.isEmpty() || Username.trim().equalsIgnoreCase("")) { // check if the user did not enter name 
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        } else if (Fname.isEmpty() || Fname.trim().equalsIgnoreCase("")) { // check if the user did not enter First Name 
            JOptionPane.showMessageDialog(null, "Please Enter First Name");
        } else if (Lname.isEmpty() || Lname.trim().equalsIgnoreCase("")) { // check if the user did not enter Last Name 
            JOptionPane.showMessageDialog(null, "Please Enter Last Name");
        } else if (Email.isEmpty() || Email.trim().equalsIgnoreCase("")) { // check if the user did not enter Email
            JOptionPane.showMessageDialog(null, "Please Enter Email");
        } else if (password.isEmpty() || password.trim().equalsIgnoreCase("")) { //check if the user did not enter password 
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        } else if (passConfirmField.isEmpty() || passConfirmField.trim().equalsIgnoreCase("")) { // check if the user did not enter password confirmation
            JOptionPane.showMessageDialog(null, "Please Enter confirmation of the Password");
//        } else if (password.equalsIgnoreCase("") && Username.equalsIgnoreCase("")) { // check if the user and password null
//            JOptionPane.showMessageDialog(null, "Please Enter Password and Username");
        } else if (!password.equals(passConfirmField)) { // check if the passwords don't match 
            JOptionPane.showMessageDialog(null, "passwords don't match");
        } else { //if all the necessrry fields are filled 

            if (!database.checkUsername(Username)) { //if the user name doesn't exists in the system 
                try {
                    if (Phone.isEmpty() || Phone.trim().equalsIgnoreCase("")) { // check if the user did not enter Phone Number
                        Phone = null;
                    }
                    index++;
                    database.insert_user(index, Username, Fname, Lname, password, Phone, Email);
                    flag = true;

                    return flag;  //retrun true to open home page and close this page 
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {//the username already taken 
                JOptionPane.showMessageDialog(null, "Username already exists ");
            }
        }
        return flag;
    }
}
