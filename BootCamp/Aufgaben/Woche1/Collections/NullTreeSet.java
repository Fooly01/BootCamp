package Aufgaben.Woche1.Collections;
import java.util.TreeSet;

/**
 *
 * Ein TreeSet erlaubt kein Element null.
 * Erstellen Sie eine Klasse `NullTreeSet`, die von `TreeSet` ableitet,
 * aber auch null als Element akzeptiert. Verwenden Sie keinen Comparator.
 *
 * Vervollständigen Sie die folgenden Methoden:
 */

public class NullTreeSet<T> extends TreeSet<T> {

    @Override
    public int size() {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    @Override
    public boolean isEmpty() {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    @Override
    public void clear() {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    @Override
    public boolean contains(Object something) {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    @Override
    public boolean add(T element) {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    @Override
    public boolean remove(Object something) {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

}