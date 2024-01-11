package my.zhamri;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileChooserExample {

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("JFileChooser Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton
        JButton button = new JButton("Open File Chooser");
        frame.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a JFileChooser
                JFileChooser fileChooser = new JFileChooser();

                // Show the file chooser dialog
                int returnValue = fileChooser.showOpenDialog(null);

                // Check if a file was selected
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("File chosen: " + selectedFile.getAbsolutePath());
                }
            }
        });

        // Display the JFrame
        frame.setVisible(true);
    }
}

