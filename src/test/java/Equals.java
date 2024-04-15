import org.junit.Test;

public class Equals {
    public class CircleTest {
        @Test
        public void testIntersection(){
            Circle c1 = new Circle(0, new Point(-3, 4));
            Circle c2 = new Circle(10, new Point(0, 4));
            Assertions.assertEquals(false, c1.intersectsWith(c2));
            Assertions.assertEquals(false, c2.intersectsWith(c1));
            Assertions.assertEquals(true, c3.intersectsWith(c1));
            Assertions.assertEquals(true, c1.intersectsWith(c3));
            Assertions.assertEquals(true, c1.intersectsWith(c4));
            Assertions.assertEquals(true, c4.intersectsWith(c1));
            Assertions.assertEquals(false, c1.intersectsWith(c5));
            Assertions.assertEquals(false, c5.intersectsWith(c1));
            Assertions.assertEquals(true, c1.intersectsWith(c6));
            Assertions.assertEquals(true, c6.intersectsWith(c1));
        }
    }
}
