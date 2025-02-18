package Aufgaben.Woche1.Collections;


import java.util.*;

/**
 * Eine HashMap, welche als Schlüssel eine weitere HashMap hat.
 *
 *
 * 1) Vervollständigen Sie die folgenden Methoden:
 *
 * 2) Fügen sie weitere sinnvolle Methoden hinzu
 */
public class DuppelHashMap<T, U, V> implements Map<T, HashMap<U, V>> {

    HashMap<T, HashMap<U, V>> outerMap;

    public DuppelHashMap(){
        this.outerMap = new HashMap<>();
    }


    @Override
    public int size(){
        return outerMap.size();
    }

    @Override
    public boolean isEmpty(){
        return outerMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key){
        return outerMap.containsKey(key);
    }

    public boolean containsBothKeys(Object key1, Object key2){
        boolean contains = false;

        if(outerMap.containsKey(key1)){
            HashMap<U, V> innerMap = outerMap.get(key1);
            contains = innerMap.containsKey(key2);
        }

        return contains;
    }

    @Override
    public boolean containsValue(Object value){
        boolean contains = false;

        for(HashMap<U, V> innerMap: outerMap.values()){
            if(innerMap.containsValue(value)){
                contains = true;
            }
        }

        return contains;
    }

    @Override
    public HashMap<U, V> get(Object key){
        return outerMap.get(key);
    }

    public V getInner(T outerKey, U innerKey){
        V result = null;
        if(outerMap.containsKey(outerKey)){
            result = outerMap.get(outerKey).get(innerKey);
        }
        return result;
    }

    @Override
    public HashMap<U, V> put(T key, HashMap<U, V> value){
        return outerMap.put(key, value);
    }

    public HashMap<T, HashMap<U, V>> putInner(T outerKey, U innerKey, V innerValue){
        if(outerMap.containsKey(outerKey)){
            outerMap.get(outerKey).put(innerKey, innerValue);
        }
        return outerMap;
    }

    @Override
    public HashMap<U, V> remove(Object key){
        return outerMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends T, ? extends HashMap<U, V>> m){
        outerMap.putAll(m);
    }

    @Override
    public void clear(){
        outerMap.clear();
    }

    @Override
    public Set<T> keySet(){
        return outerMap.keySet();
    }

    @Override
    public Collection<HashMap<U, V>> values(){
        return outerMap.values();
    }

    @Override
    public Set<Entry<T, HashMap<U, V>>> entrySet(){
        return outerMap.entrySet();
    }

    //Extra Methoden


    public HashMap<T, HashMap<U, V>> removeInner(T outerKey, U innerKey){
        if(outerMap.containsKey(outerKey)){
            outerMap.get(outerKey).remove(innerKey);
        }
        return outerMap;
    }
}
