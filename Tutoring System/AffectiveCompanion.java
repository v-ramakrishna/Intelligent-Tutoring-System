

package p4;


import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class AffectiveCompanion extends CompanionDecorator {
    @Override
    public void doSomething(JComponent panel){
        super.doSomething(panel);
        ImageIcon face = new ImageIcon("src/cheer.png");
        JLabel label = new JLabel();
        label.setIcon(face);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setText("I am here to cheer you.");
        panel.add(label);
    }
}