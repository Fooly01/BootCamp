package UploadedTests.Woche1.Collections;

import Aufgaben.Woche1.Collections.NullTreeSet;

import static org.junit.Assert.*;

import org.junit.Test;

public class NullTreeSetTest {

    private NullTreeSet<String> nullTreeSet;

    @Test
    public void testSize_EmptySet() {
        assertEquals(0, nullTreeSet.size());
    }

    @Test
    public void testSize_WithNullElement() {
        nullTreeSet.add(null);
        assertEquals(1, nullTreeSet.size());
    }

    @Test
    public void testSize_WithNormalElements() {
        nullTreeSet.add("A");
        nullTreeSet.add("B");
        assertEquals(2, nullTreeSet.size());
    }

    @Test
    public void testSize_WithNullAndNormalElements() {
        nullTreeSet.add(null);
        nullTreeSet.add("A");
        assertEquals(2, nullTreeSet.size());
    }

    @Test
    public void testIsEmpty_EmptySet() {
        assertTrue(nullTreeSet.isEmpty());
    }

    @Test
    public void testIsEmpty_WithElements() {
        nullTreeSet.add("A");
        assertFalse(nullTreeSet.isEmpty());
    }

    @Test
    public void testIsEmpty_WithNullElement() {
        nullTreeSet.add(null);
        assertFalse(nullTreeSet.isEmpty());
    }

    @Test
    public void testClear() {
        nullTreeSet.add(null);
        nullTreeSet.add("A");
        nullTreeSet.clear();
        assertTrue(nullTreeSet.isEmpty());
    }

    @Test
    public void testContains_Null() {
        assertFalse(nullTreeSet.contains(null));
        nullTreeSet.add(null);
        assertTrue(nullTreeSet.contains(null));
    }

    @Test
    public void testContains_NormalElement() {
        nullTreeSet.add("A");
        assertTrue(nullTreeSet.contains("A"));
        assertFalse(nullTreeSet.contains("B"));
    }

    @Test
    public void testAdd_Null() {
        assertTrue(nullTreeSet.add(null));
        assertFalse(nullTreeSet.add(null)); // Null darf nur einmal hinzugefügt werden
    }

    @Test
    public void testAdd_NormalElement() {
        assertTrue(nullTreeSet.add("A"));
        assertFalse(nullTreeSet.add("A")); // TreeSet erlaubt kein Duplikat
    }

    @Test
    public void testRemove_Null() {
        nullTreeSet.add(null);
        assertTrue(nullTreeSet.remove(null));
        assertFalse(nullTreeSet.remove(null));
    }

    @Test
    public void testRemove_NormalElement() {
        nullTreeSet.add("A");
        assertTrue(nullTreeSet.remove("A"));
        assertFalse(nullTreeSet.remove("A"));
    }

    @Test
    public void testRemove_NonExistentElement() {
        assertFalse(nullTreeSet.remove("B"));
    }
}


