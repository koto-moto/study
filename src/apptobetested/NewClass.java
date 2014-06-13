import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewClass extends JFrame {


  NewClass() {
     super("Визульное приложения с JTabbedPane");

     try  {
       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
     }
     catch(Exception e) {
     }

    setSize(400, 200);
    Container c = getContentPane();
    JTabbedPane tp = new JTabbedPane();
    c.add(tp, BorderLayout.CENTER);
    JPanel pn1 = new JPanel();
    tp.add(pn1, "Hello");
    JPanel pn2 = new JPanel();
    tp.add(pn2, "Good-bye");

    WindowListener wndCloser = new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    };
    addWindowListener(wndCloser);

    setVisible(true);
  }

  public static void main(String[] args) {
    NewClass d = new NewClass();
  }
}