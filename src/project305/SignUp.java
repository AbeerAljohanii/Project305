package project305;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SignUp {

    boolean flag;
    private static File file = new File("database.txt");

    boolean isValid(String UsernameField, String Fname, String Lname, String Email, String Phone, String passField, String passConfirmField) {
        String Username = UsernameField;
        String password = passField;
        String password2 = passConfirmField;
        if (Username.isEmpty() || Username.trim().equalsIgnoreCase("")) {//check if the user did not enter name 
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        } else if (password.isEmpty() || password.trim().equalsIgnoreCase("")) {//check if the user did not enter password 
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        } else if (password2.isEmpty() || password2.trim().equalsIgnoreCase("")) {//check if the user did not enter password confirmation
            JOptionPane.showMessageDialog(null, "Please Enter confirmation of the Password");
        } else if (password.equalsIgnoreCase("") && Username.equalsIgnoreCase("")) { // check if the user and password null
            JOptionPane.showMessageDialog(null, "Please Enter Password and Username");
        } else if (!password.equals(password2)) { // check if the passwords don't match 
            JOptionPane.showMessageDialog(null, "passwords don't match");
        } else if (Phone.isEmpty() || Phone.trim().equalsIgnoreCase("")) {
            Phone = null;
        } else {//if all the fields are filled 
            try {
                Scanner input = new Scanner(file);
                flag = true;
                while (input.hasNext()) {
                    if (input.next().equalsIgnoreCase("login")) {
                        String nameFile = input.next();
                        String passFile = input.next();
                        if (nameFile.equals(Username)) {//check if the username already exists 
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {//if the user name doesn't exitsts in the system 
                    try {
                        FileWriter fileWritter = new FileWriter(file.getName(), true);
                        BufferedWriter bw = new BufferedWriter(fileWritter);
                        bw.write("\nlogin " + Username + " " + password);//write the new username and password to the loginGUI file 
                        bw.close();
                        return flag;  //retrun true to open home page and close this page 
                    } catch (IOException e) {
                        //exception handling left as an exercise for the reader
                    }

                } else {//the username already taken 
                    JOptionPane.showMessageDialog(null, "already existed username ");
                }

                input.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return flag;
    }
}
