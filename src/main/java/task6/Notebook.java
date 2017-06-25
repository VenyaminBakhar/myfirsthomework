package task6;

import java.util.LinkedList;

/**
 * Created by Вениамин on 6/25/2017.
 */
class Notebook {
    private LinkedList<String> list = new LinkedList<String>();

    Notebook(String... values) {
        for (String s : values){
            list.add(s);
        }
    }

    Notebook(){
    }

    LinkedList<String> getList() {
        return this.list;
    }
}
