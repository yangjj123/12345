

import static org.junit.Assert.*;

import java.util.Scanner;

import javax.naming.InitialContext;

import org.junit.Test;



public class CompoundingTest {
	
	@Test
    public void testCompoundYear() {
        int compoundYear = Compounding.compoundYear(1000000, 0.1, 2000000);
        assertEquals(7, compoundYear);
    }

}
