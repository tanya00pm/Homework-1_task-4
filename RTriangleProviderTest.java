package ru.levelup.tatiana_nesterova.qa.homework1.task4;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


public class RTriangleProviderTest {
    // class for unit test

    private RTriangleProvider triangle;

    @org.junit.Before
    public void init() {
        triangle = new RTriangleProvider();
    }

    @org.junit.Before
    public void tearDown() { triangle = null; }

    @org.junit.Test
    public void testTriangleIsRectangular() {

        // this test should pass
       triangle.setCoordinates(4, 1, 1, 4, 5, 2);

       assertNotNull(RTriangleProvider.getRTriangle(triangle.getApexX1(), triangle.getApexY1(),
                       triangle.getApexX2(), triangle.getApexY2(), triangle.getApexX3(), triangle.getApexY3()));

       // this test should not pass
       triangle.setCoordinates(1, 2, 6, 2, 4, 1);

       assertNotNull(RTriangleProvider.getRTriangle(triangle.getApexX1(), triangle.getApexY1(),
               triangle.getApexX2(), triangle.getApexY2(), triangle.getApexX3(), triangle.getApexY3()));
   }

    @org.junit.Ignore
    @Test
    public void todo() {
        System.out.println("Test ignored part");
    }

    public static void main(String[] args) throws Exception {

        JUnitCore runner = new JUnitCore();
        Result result = runner.run(RTriangleProvider.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }
}