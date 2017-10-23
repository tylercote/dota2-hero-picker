import javax.swing.*;

public class PickerTest {

  private static void createAndShowUI() {

    PickerModel model = new PickerModel();
    PickerView view = new PickerView(model);
    PickerController control = new PickerController(model);
    view.setGuiControl(control);

    JFrame frame = new JFrame("Dota 2 Picker");
    frame.getContentPane().add(view.getMainPanel()); // add view
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    createAndShowUI();
  }
}
