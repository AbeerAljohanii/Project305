
package project305;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class loginClass {
        private static File file = new File("database.txt");

   boolean isValid(String enteredEmail,String enteredPassword){
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
            try {
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    if (input.next().equalsIgnoreCase("login")) {
                        String nameFile = input.next();
                        String passFile = input.next();
                        if (nameFile.equals(name) && passFile.equals(password)) {
                            return true; //retrun true to open home page and close this page 
                        }
                    } else {
                        String line = input.nextLine();
                    }
                }
                input.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Sorry we could not find your account");
        }
        return false;
    }
}
