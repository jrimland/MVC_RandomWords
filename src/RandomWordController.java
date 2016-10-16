
/**
 *
 * @author jrimland
 */
import java.awt.event.*;

public class RandomWordController {
    private RandomWordModel model;
    private RandomWordView view;

    RandomWordController(RandomWordModel model, RandomWordView view) {
        this.model = model;
        this.view = view;
                
        class ButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e)
            {
                view.setCurrentWord(model.getWord());
            }
        }
        
        view.addWordButtonListener(new ButtonListener());                        
    }        
}
