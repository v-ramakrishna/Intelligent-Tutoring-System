

package p4;


import java.util.Observable;

public class Assessor extends Observable {
private String [] questions = { "What is the definition of calculus?", "Q2", "Q3", "Q4"};
private String [] buttonString = {"a","b","c","d"};

int i = 0;
private String theQuestion;
public void askQuestion(int n) {
    theQuestion = questions[i];
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
public void askQuestion(String s) {
        theQuestion = s;
        setChanged();
        notifyObservers();
    }
    public String getQuestion() {
        return theQuestion;
    }
}
