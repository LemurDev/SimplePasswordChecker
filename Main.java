import javax.swing.JOptionPane; // import JOptionPane

public class Main {
    public static void main(String[] args) {

        // Variables
        String password; // var to store password

        JOptionPane.showMessageDialog(null, "Password must have a minimum of eight characters with at least one capital letter. It must also include a '.' or '-'", "REQUIREMENTS", JOptionPane.INFORMATION_MESSAGE); // Show pass requirements
        password = JOptionPane.showInputDialog("Enter Password: "); // prompt user to enter a password

        if (password.length() >= 8) { // check if password has at least eight characters
            if (password.indexOf("-") >= 0 || password.indexOf(".") >= 0) { // checks if password contains a "." or "-"
                JOptionPane.showMessageDialog(null, "Your Password: \"" + password + "\" meets the requirements!", "Password Check", JOptionPane.INFORMATION_MESSAGE); // print out password and tell user its valid
            } else { // if password does not meet the requirements
                JOptionPane.showMessageDialog(null, "Your Password: \"" + password + "\" fails to meet the requirements!", "Password Check", JOptionPane.INFORMATION_MESSAGE); // print out password and tell user it's  not valid
            }
        } else { // if password does not meet the requirements
            JOptionPane.showMessageDialog(null, "Your Password: \"" + password + "\" fails to meet the requirements!", "Password Check", JOptionPane.INFORMATION_MESSAGE); // print out password and tell user it's  not valid
        }

    }
}