
/**
 *
 * @author jrimland
 */

public class App {
    public static void main(String[] args) {
        RandomWordModel model = new RandomWordModel();
        RandomWordView view = new RandomWordView(model);
        RandomWordController controller = new RandomWordController(model, view);
        
        view.setVisible(true);
    }
}


