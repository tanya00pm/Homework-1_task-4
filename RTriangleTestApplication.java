package ru.levelup.tatiana_nesterova.qa.homework1.task4;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RTriangleTestApplication {
   /*
   public static void main(String[] args) {

        RTriangleTestApplication app = new RTriangleTestApplication();
        app.startApplication();
    }
*/
    public void startApplication() {

        JUnitCore runner = new JUnitCore();
        Result result = runner.run(RTriangleProvider.class);
/*
        RTriangleProviderTest.beforeClass();
        RTriangleProviderTest test = new RTriangleProviderTest();

        // passed
        test.initTest(4, 1, 1, 4, 5, 2);
        test.testTriangleIsRectangular();

        test.afterTest();

        // not passed
        test.initTest(1, 2, 6, 2, 4, 1);
        test.testTriangleIsRectangular();
        test.afterTest();

        RTriangleProviderTest.afterClass();
        */
    }
}


/*
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

    @org.junit.Test
    public void testTriangleIsRectangular(){
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
    */