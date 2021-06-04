import org.junit.Test;

import static org.junit.Assert.*;

public class PrintPrimesTest {

    @Test
    public void printPrimesQ2() {
        assertEquals(" 2",PrintPrimes.printPrimes(1));
    }
    @Test
    public void printPrimesQ3pt1(){
        assertEquals(" 2 3 5",PrintPrimes.printPrimes(3));
    }
    @Test
    public void printPrimesQ3pt2(){
        assertEquals(" 2 3 5 7 11",PrintPrimes.printPrimes(5));
    }
}