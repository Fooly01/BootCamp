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

    private boolean hasNull = false;

    @Override
    public int size() {
        //ToDo: Implement
        int result;
        if(!this.hasNull){
            result = super.size();
        }else{
            result = super.size() + 1;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        //ToDo: Implement
        boolean result;
        if(this.hasNull){
            result = false;
        }else{
            result = super.isEmpty();
        }
        return result;
    }

    @Override
    public void clear() {
        //ToDo: Implement
        this.hasNull = false;
        super.clear();
    }

    @Override
    public boolean contains(Object something) {
        //ToDo: Implement
        boolean result;
        if(something == null){
            result = this.hasNull;
        }else{
            result = super.contains(something);
        }
        return result;
    }

    @Override
    public boolean add(T element) {
        //ToDo: Implement
        boolean result;
        if(element == null){
            if(!this.hasNull) {
                this.hasNull = true;
                result = true;
            }else{
                result = false;
            }
        }else{
            result = super.add(element);
        }
        return result;
    }

    @Override
    public boolean remove(Object something) {
        //ToDo: Implement
        boolean result;
        if(something == null){
            if(this.hasNull) {
                this.hasNull = false;
                result = true;
            }else{
                result = false;
            }
        }else{
            result = super.remove(something);
        }
        return result;
    }

}