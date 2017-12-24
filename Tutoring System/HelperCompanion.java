

package p4;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
public class HelperCompanion extends CompanionDecorator {
    @Override
    public void doSomething(JComponent panel){
        super.doSomething(panel);
        ImageIcon face = new ImageIcon("src/bubble.png");
        JLabel label = new JLabel();
        label.setIcon(face);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setText("I am here to help you.");
        panel.add(label);
    }
}