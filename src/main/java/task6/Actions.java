package task6;

/**
 * Created by Вениамин on 6/25/2017.
 */
public interface Actions {
    void addNote(Notebook obj, String note);

    void addNote(Notebook obj, String note, int index);

    void removeNote(Notebook obj, int index);

    void editNote(Notebook obj, int index, String newNote);

    void showAllNotes(Notebook obj);
}
