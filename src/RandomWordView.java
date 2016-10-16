/**
 *
 * @author jrimland
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RandomWordView extends JFrame{
    private JTextField currentWordField;
    private JButton getWordButton;
    
    private RandomWordModel model;
    
    RandomWordView(RandomWordModel model){
        this.model = model;
        
        currentWordField = new JTextField(20);
        getWordButton = new JButton("Get new word");
        
        JPanel content = new JPanel();
        content.add(currentWordField);
        content.add(getWordButton);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Random Word MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  
    }
  
    public void addWordButtonListener(ActionListener al) 
    {    
        getWordButton.addActionListener(al);
    }
    
    public void setCurrentWord(String newWord)
    {
        currentWordField.setText(newWord);
    }
}
