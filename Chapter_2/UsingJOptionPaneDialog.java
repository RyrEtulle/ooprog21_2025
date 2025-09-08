
import javax.swing.JOptionPane;

public class UsingJOptionPaneDialog {
    public static void main(String[] a) {
        String name;
        int choice;

        do {
            // Input dialog box for user's name
            name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);

            // If user pressed Cancel or closed the dialog, exit program
            if (name == null) {
                break;
            }

            // Confirmation dialog
            choice = JOptionPane.showConfirmDialog(null,
                    "Do you want your name to be shown?",
                    "Confirmation",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                // Show name in a message dialog
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break; // End program after showing name
            }

        } while (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION);
    }
}
