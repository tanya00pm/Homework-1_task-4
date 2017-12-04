package ru.levelup.tatiana_nesterova.qa.homework1.task4;
import static org.junit.Assert.*;

public class RTriangleProviderTest {
    // class for unit test

    private RTriangleProvider triangle;

    //BeforeClass
    public static void beforeClass() {
        System.out.println("Test for RTriangleProvider.class has started..");
    }

    //AfterClass
    public  static void afterClass() {
        System.out.println("Test for RTriangleProvider.class has finished.");
    }

    //Before
    public void initTest(int x1, int y1, int x2, int y2, int x3, int y3) {
        triangle = new RTriangleProvider(x1, y1, x2, y2, x3, y3);
    }

    //After
    public void afterTest() {
        triangle = null;
    }

    public void test_Triangle_is_Rectangular() {
        //Test if triangle is rectangular and print the results

        assertNotNull("\nTriangle with coordinates (" +
                            triangle.getApexX1() + ", " + triangle.getApexY1() + ", " +
                            triangle.getApexX2() + ", " + triangle.getApexY2() + ", " +
                            triangle.getApexX3() + ", " + triangle.getApexY3() +
                            ") is NOT rectangular !!",
                    RTriangleProvider.getRTriangle(triangle.getApexX1(), triangle.getApexY1(),
                            triangle.getApexX2(), triangle.getApexY2(), triangle.getApexX3(), triangle.getApexY3()));


        System.out.println("Triangle with coordinates ("+
                triangle.getApexX1() + ", " + triangle.getApexY1() + ", " +
                triangle.getApexX2() + ", " + triangle.getApexY2() + ", " +
                triangle.getApexX3() + ", " + triangle.getApexY3() +
                ") is rectangular.");
    }
}
