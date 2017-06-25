package task6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Вениамин on 6/25/2017.
 */
public class NotebookactionsTest {

    @Test
    public void addNote() throws Exception {
        Notebookactions notebookactions = new Notebookactions();
        Notebook notebook = new Notebook("1","2","3");
        notebookactions.addNote(notebook,"4");
        final String actual = notebook.getList().getLast();
        final String expected ="4";
        assertEquals(expected,actual);

    }

    @Test
    public void addNote1() throws Exception {
        Notebookactions notebookactions = new Notebookactions();
        Notebook notebook = new Notebook("1","2","3");
        notebookactions.addNote(notebook,"new2",1);
        final String actual = notebook.getList().get(1);
        final String expected ="new2";
        assertEquals(expected,actual);
    }

    @Test
    public void removeNote() throws Exception {
        Notebookactions notebookactions = new Notebookactions();
        Notebook notebook = new Notebook("1","2","3");
        boolean b = false;
        notebookactions.removeNote(notebook,1);
        if (!notebook.getList().get(1).equals("2")) b = true;
        assertEquals(b,true);
    }

    @Test
    public void editNote() throws Exception {
        Notebookactions notebookactions = new Notebookactions();
        Notebook notebook = new Notebook("1","2","3");
        boolean b = false;
        notebookactions.editNote(notebook,1,"new note");
        if (notebook.getList().get(1).equals("new note")) b = true;
        assertEquals(b,true);
    }


}