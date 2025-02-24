package Aufgaben.Woche1.Collections;

import java.util.TreeSet;

/**
 * Ein TreeSet erlaubt kein Element null.
 * Erstellen Sie eine Klasse `NullTreeSet`, die von `TreeSet` ableitet,
 * aber auch null als Element akzeptiert. Verwenden Sie keinen Comparator.
 * <p>
 * Vervollständigen Sie die folgenden Methoden:
 */

public class NullTreeSet<T> extends TreeSet<T> {

    private boolean hasNull = false;

    @Override
    public int size() {
        return hasNull ? 1 + super.size() : super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty() && !hasNull;
    }

    @Override
    public void clear() {
        hasNull = false;
        super.clear();
    }

    @Override
    public boolean contains(Object something) {
        boolean returnValue = false;
        if (something == null) {
            returnValue = hasNull;
        } else {
            returnValue = super.contains(something);
        }
        return returnValue;
    }

    @Override
    public boolean add(T element) {
        boolean added = false;
        if (element == null && !hasNull) {
            hasNull = true;
            added = true;
        } else if (element != null) {
            added = super.add(element);
        }
        return added;
    }

    @Override
    public boolean remove(Object something) {
        boolean returnValue = false;
        if (something == null) {
            if (hasNull) {
                hasNull = false;
                returnValue = true;
            } else {
                returnValue = false;
            }
        } else {
            returnValue = super.remove(something);
        }
        return returnValue;
    }

}