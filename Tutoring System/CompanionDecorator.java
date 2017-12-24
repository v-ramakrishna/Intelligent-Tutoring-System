

package p4;


import javax.swing.JComponent;
public class CompanionDecorator implements Companion {
    protected Companion c;
        public void add(Companion c){
        this.c=c;
    }
    @Override
    public void doSomething(JComponent panel) {
        this.c.doSomething(panel);
    }
}