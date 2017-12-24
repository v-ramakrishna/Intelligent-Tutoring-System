

package p4;


import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
public class BasicCompanion implements Companion {
@Override
    public void doSomething(JComponent panel) {
        ImageIcon face = new ImageIcon("src/face.png");
        JLabel label = new JLabel();
        label.setIcon(face);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setText("Hello Student, ");
        panel.add(label);
    }
}