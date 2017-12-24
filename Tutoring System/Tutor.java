

package p4;

import java.util.Observable;
public class Tutor extends Observable {
    private String theLesson;
    private String [] lessons = { "resources/lesson_01.html",
"resources/lesson_02.html",
"resources/lesson_03.html",
"resources/lesson_04.html"
};
    int i = 0;
    
    public void nextLesson(int n) {
        theLesson = lessons[i];
        setChanged();
        notifyObservers();
        
        if( n == 1){
            i++;
            if (i >= 3){
                i = 3;
            }
        }else if(n == 0){
            i--;
            if (i <= 0){
                i = 0;
            }
        }
        
    }
    public void prevLesson() {
        theLesson = lessons[i];
        setChanged();
        notifyObservers();
        i++;
        if(i > 3){
            i = 0;
        }
    }
    
    public void askQuestion(String s) {
        theLesson = s;
        setChanged();
        notifyObservers();
    }
    public String getQuestion() {
        return theLesson;
    }
}