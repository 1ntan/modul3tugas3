package main.java.org.Modul1.Tugas;

import org.junit.Test;

import static main.java.org.Modul1.Tugas.Tugas4.findMax;
import static org.junit.Assert.assertEquals;

public class Tugas4_Test {
    @Test
    public void testFindmax1(){
        int result = findMax(1, 2, 3);
        assertEquals(3, result);
    }

    @Test
    public void testFindmax2(){
        int result = findMax(-1, -2, -3);
        assertEquals(-1, result);
    }

    @Test
    public void testFindmax3(){
        int result = findMax(0, 0, 1);
        assertEquals(1, result);
    }
}