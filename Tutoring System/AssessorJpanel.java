

package p4;


import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

public class AssessorJpanel extends JPanel implements Observer {
JLabel label = new JLabel();
public AssessorJpanel() {
this.setBackground(Color.lightGray);
ImageIcon background = new ImageIcon("src/student.png");
label.setIcon(background);
add(label);
}
public String answerQuestion (String question) {
return "Question: " + question +"";
}
@Override
public void update(Observable o, Object arg) {
String x = ((Assessor)o).getQuestion();
String y = this.answerQuestion(x);
label.setText(y);
}
}