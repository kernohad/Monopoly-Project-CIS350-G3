import java.io.IOException;
import java.util.ArrayList;
import view.NewGameDialog;

public class Monopoly {

	public static void main(String[] args)
			throws IOException, InterruptedException {
//		GameView view = new GameView();
//
//        view.getTextPanel().getTextField().setEditable(true);
//		view.getTextPanel().printToTextArea("Hello World!");
//
//        // Blocking synchronized code. Makes program wait for textField Input
//        final List<String> holder = view.getTextPanel().getHolder();
//
//        String command;
//        // Make textField Editable
//        view.getTextPanel().getTextField().setEditable(true);
//
//        // Blocking synchronized code. Makes program wait for textField Input
//        synchronized (holder) {
//
//            // wait for input from field
//            while (holder.isEmpty()) {
//                holder.wait();
//            }
//            command = holder.remove(0);
//        }
//
//        // Make textField not Editable
//        view.getTextPanel().getTextField().setEditable(false);
//
//        // Program waits until something is entered, then calls this line and prints it.
//        view.getTextPanel().printToTextArea(command);
    NewGameDialog newGameDialog = new NewGameDialog(new ArrayList<>());

    }


}
