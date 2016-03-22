package training.editor.eduUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by karashevich on 30/06/15.
 */
public class LessonMessage {

    private ArrayList<Message> myMessages;
    private int start;
    private int end;
    private boolean passed;

    LessonMessage(String text, int start, int end){
        if (myMessages == null) myMessages = new ArrayList<Message>();
        myMessages.add(new Message(text, Message.MessageType.TEXT_REGULAR));
        this.start = start;
        this.end = end;
        passed = false;
    }

    LessonMessage(Message[] messages, int start, int end){
        if (myMessages == null) myMessages = new ArrayList<Message>();
        myMessages.addAll(Arrays.asList(messages));
        this.start = start;
        this.end = end;
        passed = false;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public boolean isPassed() {
        return passed;
    }
}
