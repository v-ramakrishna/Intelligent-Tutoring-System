

package p4;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TutorPanel extends JPanel implements ActionListener{
    JButton ok = new JButton("Next Lesson");
    JButton prev = new JButton("Previous Lesson");
    Tutor tutor;
    Assessor assessor;
    
    public TutorPanel(Tutor tutor, Assessor assessor) {
        this.tutor = tutor;
        this.assessor = assessor;
        setBackground(Color.white);
        ImageIcon background = new ImageIcon("src/prof.png");
        JLabel label = new JLabel();
        label.setIcon(background);
        add (prev);
        add (ok);
        ok.addActionListener(this);
        prev.addActionListener(this);
        add(label);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if(input.equals("Next Lesson")){
                tutor.nextLesson(1);
                assessor.askQuestion(1);
                
            }else if(input.equals("Previous Lesson")){
                tutor.nextLesson(0);
                assessor.askQuestion(0);
            }

    }
}