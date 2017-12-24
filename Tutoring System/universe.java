package p4;

import java.awt.GridLayout;
import java.util.Observer;
import javax.swing.JFrame;



public class Universe extends JFrame {
    
    public Universe() {
        //Create classes
        Student student = new Student ();
        Tutor tutor = new Tutor();
        Assessor a = new Assessor();
        CompanionPanel cp = new CompanionPanel();
        AssessorJpanel aJpanel = new AssessorJpanel();
        
        //add to frame panels
        tutor.addObserver(student);
        a.addObserver(aJpanel);
        setLayout(new GridLayout(2,2));
        add(cp);
        add(student);
        add(new TutorPanel(tutor, a));
        //add(new TutorPanel(a));
        add(aJpanel);
        
    }
    
    public static void main(String[] args) {
        JFrame window = new Universe();
        window.setSize(1500, 1500);
        window.setVisible(true);
    }
        /*
	JPanel p1 = new Companion();
	JPanel p2 = new Tutor();
	JPanel p3 = new AssessorPanel();
	Assessor assessor;
	
	
	public Universe()
	{
        this.assessor = Assessor.getInstance();
		add(p2);
		add(p1);
		add(p3);
	}

	
	public static void main(String[] args) {
		// trying to change the look and feel of the UI
		try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		ControlCenter s1 = ControlCenter.getInstance();
		ControlCenter s2 = ControlCenter.getInstance();
		
		if (s1 == s2)
		{
			//Do something
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame universe = new Universe();
				universe.setSize(1000, 750);
				universe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				universe.setVisible(true);
			}
		});
		
	}*/

}
