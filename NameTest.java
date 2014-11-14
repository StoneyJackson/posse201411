import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NameTest {

        protected Name name;

        @Before
        public void setUp() throws Exception {
        }


        @Test
        public void testName() {
             name = new Name("Dr", "Homer", "J.", "Simpson", "Simpson", "Bouvier", "Jr", "Dr");

             String actual = name.getFirst();
             String expected = "Homer";

             assertEquals("getFirst returned wrong value", expected, actual);

            }

}