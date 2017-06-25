package task6;


import java.util.LinkedList;

/**
 * Created by Вениамин on 6/25/2017.
 */
class Notebookactions implements Actions {

    Notebookactions(){}


    public void addNote(Notebook obj, String note) {
        obj.getList().add(note);
    }

    public void addNote(Notebook obj, String note, int index) {
        obj.getList().add(index, note);
    }

    public void removeNote(Notebook obj, int index) {
        obj.getList().remove(index);
    }

    public void editNote(Notebook obj, int index, String note) {
        obj.getList().set(index, note);
    }

    public void showAllNotes(Notebook obj) {
        LinkedList<String> list = obj.getList();
        for (String s : list){
            System.out.println(s);
        }
    }
}
