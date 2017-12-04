package ru.levelup.tatiana_nesterova.qa.homework1.task4;

public class RTriangleTest_Application {
    public static void main(String[] args) {

        RTriangleTest_Application app = new RTriangleTest_Application();
        app.startApplication();
    }

    public void startApplication() {

        RTriangleProviderTest.beforeClass();
        RTriangleProviderTest test = new RTriangleProviderTest();

        // passed
        test.initTest(4, 1, 1, 4, 5, 2);
        test.test_Triangle_is_Rectangular();
        test.afterTest();

        // not passed
        test.initTest(1, 2, 6, 2, 4, 1);
        test.test_Triangle_is_Rectangular();
        test.afterTest();

        RTriangleProviderTest.afterClass();
    }
}
