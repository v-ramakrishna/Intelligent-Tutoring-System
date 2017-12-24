

package p4;


import java.awt.GridLayout;
import javax.swing.JLayeredPane;
public class CompanionPanel extends JLayeredPane{
    public Companion brain;
        public void setCompanion(Companion x) {
        brain = x;
    }
    public void showYourself() {
        removeAll();
        setLayout(new GridLayout(1,1));
        brain.doSomething(this);
        revalidate();
    }
}