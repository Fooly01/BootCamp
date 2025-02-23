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
    boolean hasNull = false;

    @Override
    public int size() {
        return super.size() + (hasNull ? 1 : 0);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty() && !hasNull;
    }

    @Override
    public void clear() {
        super.clear();
        hasNull = false;
    }

    @Override
    public boolean contains(Object something) {
        return something == null ? hasNull: super.contains(something);
    }

    @Override
    public boolean add(T element) {
        boolean result;
        if (element != null) {
            result = super.add(element);
        } else {
            hasNull = true;
            result = true;
        }
        return result;
    }

    @Override
    public boolean remove(Object something) {
        boolean result;
        if (something == null) {
            result = hasNull;
            hasNull = false;
        } else {
            result = super.remove(something);
        }
        return result;
    }
}