

package p4;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

///switch to lessons instead of student
public class Student extends JPanel implements Observer {
    JLabel label = new JLabel();
    JEditorPane p = new JEditorPane();
    public Student () {
        this.setBackground(Color.lightGray);

        //label.setIcon(background);
        add(label);
    }
    public String answerQuestion (String question) {
        return "I am thinking about \'" + question +"\'";
    }
    @Override
    public void update(Observable o, Object arg) {
        removeAll();
        String x = ((Tutor)o).getQuestion();
        java.net.URL lURL = p4.Universe.class.getResource(x);
        if(lURL != null){
            try{
            p.setPage(lURL);
            }catch (IOException e){
                System.out.println("Unable to access lesson.");
            }
        }
        JScrollPane scroll = new JScrollPane(p);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setPreferredSize (new Dimension(700, 500));
        scroll.setMinimumSize(new Dimension(10, 10));
        add(scroll);
        revalidate();
        repaint();
        //String y = this.answerQuestion(x);
        //label.setText(y);
    }
}
