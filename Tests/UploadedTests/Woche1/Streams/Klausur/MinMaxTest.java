package UploadedTests.Woche1.Streams.Klausur;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import static Aufgaben.Woche1.Streams.Klausur.MinMax.find;

public class MinMaxTest {

    @Test
    public void testMinMax1() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int[] expected = {1,5};
        int[] actual = find(list.stream());

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

    @Test
    public void testMinMax2() {
        ArrayList<Integer> list = new ArrayList<>();

        int[] expected = {Integer.MAX_VALUE,Integer.MIN_VALUE};
        int[] actual = find(list.stream());

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

    @Test
    public void testMinMax() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-789708);
        list.add(15701750);
        list.add(3);
        list.add(4);
        list.add(5);
        int[] expected = {-789708,15701750};
        int[] actual = find(list.stream());

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

    @Test
    public void testMinMax4() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        int[] expected = {1,1};
        int[] actual = find(list.stream());

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }
}
