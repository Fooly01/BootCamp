package Aufgaben.Woche1.Collections;


import java.util.*;

/**
 * Eine HashMap, welche als Schlüssel eine weitere HashMap hat.
 * <p>
 * <p>
 * 1) Vervollständigen Sie die folgenden Methoden:
 * <p>
 * 2) Fügen sie weitere sinnvolle Methoden hinzu
 */
public class DuppelHashMap<T, U, V> implements Map<T, HashMap<U, V>> {
    HashMap<T, HashMap<U, V>> outerMap;

    public DuppelHashMap() {
        outerMap = new HashMap<T, HashMap<U, V>>();
    }


    //////////////////////////////////////////////////Extra Methoden//////////////////////////////////////////////////

    public boolean containsInnerKey(U innerKey) {
        return outerMap.values()
                .stream()
                .anyMatch(map -> map.containsKey(innerKey));
    }

    public boolean containsInnerKeyForOuterKey(T outerKey, U innerKey) {
        return outerMap.containsKey(outerKey) && outerMap.get(outerKey).containsKey(innerKey);
    }

    public boolean containsInnerValue(V value) {
        return outerMap.values()
                .stream()
                .anyMatch(innerMap -> innerMap.containsValue(value));
    }

    public V getInner(T outerKey, U innerKey) {
        return outerMap.containsKey(outerKey) ? outerMap.get(outerKey).get(innerKey) : null;
    }

    public V putInner(T outerKey, U innerKey, V value) {
        if (!outerMap.containsKey(outerKey)) {
            outerMap.put(outerKey, new HashMap<U, V>());
        }
        return outerMap.get(outerKey).put(innerKey, value);
    }

    public V removeInner(T outerKey, U innerKey) {
        return outerMap.containsKey(outerKey) ? outerMap.get(outerKey).remove(innerKey) : null;
    }

    public void putAllInner(T outerKey, HashMap<U, V> innerMap) {
        if (!outerMap.containsKey(outerKey)) {
            outerMap.put(outerKey, new HashMap<U, V>());
        }
        outerMap.put(outerKey, innerMap);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public int size() {
        return outerMap.size();
    }

    @Override
    public boolean isEmpty() {
        return outerMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return outerMap.containsKey(key);
    }


    @Override
    public boolean containsValue(Object value) {
        return outerMap.containsValue(value);
    }


    @Override
    public HashMap<U, V> get(Object key) {
        return outerMap.get(key);
    }


    @Override
    public HashMap<U, V> put(T key, HashMap<U, V> value) {
        return outerMap.put(key, value);
    }

    @Override
    public HashMap<U, V> remove(Object key) {
        return outerMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends T, ? extends HashMap<U, V>> m) {
        outerMap.putAll(m);
    }

    @Override
    public void clear() {
        outerMap.clear();
    }

    @Override
    public Set<T> keySet() {
        return outerMap.keySet();
    }

    @Override
    public Collection<HashMap<U, V>> values() {
        return outerMap.values();
    }

    @Override
    public Set<Entry<T, HashMap<U, V>>> entrySet() {
        return outerMap.entrySet();
    }
}
