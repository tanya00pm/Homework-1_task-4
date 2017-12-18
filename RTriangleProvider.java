package ru.levelup.tatiana_nesterova.qa.homework1.task4;


public final class RTriangleProvider implements Triangle {
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;
    private int X3;
    private int Y3;

    public RTriangleProvider() {
        // constructor

    }
    public RTriangleProvider(int x1, int y1, int x2, int y2, int x3, int y3) {
        // constructor

        this.X1 = x1;
        this.Y1 = y1;
        this.X2 = x2;
        this.Y2 = y2;
        this.X3 = x3;
        this.Y3 = y3;
    }

    public void setCoordinates(int x1, int y1, int x2, int y2, int x3, int y3) {

        this.X1 = x1;
        this.Y1 = y1;
        this.X2 = x2;
        this.Y2 = y2;
        this.X3 = x3;
        this.Y3 = y3;
    }
    @Override
    public int getApexX1() {
        return X1;
    }

    @Override
    public int getApexY1() {
        return Y1;
    }

    @Override
    public int getApexX2() {
        return X2;
    }

    @Override
    public int getApexY2() {
        return Y2;
    }

    @Override
    public int getApexX3() {
        return X3;
    }

    @Override
    public int getApexY3() {
        return Y3;
    }


    public static Boolean getRTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        // method that checks if Triangle is rectangular

        RTriangleProvider tr = new RTriangleProvider(x1, y1, x2, y2, x3, y3);

        int vectorX1 = tr.X2 - tr.X1;
        int vectorY1 = tr.Y2 - tr.Y1;
        int vectorX2 = tr.X3 - tr.X1;
        int vectorY2 = tr.Y3 - tr.Y1;
        int vectorX3 = tr.X3 - tr.X2;
        int vectorY3 = tr.Y3 - tr.Y2;

        if(vectorX1*vectorX2 + vectorY1*vectorY2 == 0)
            return true;

        if(vectorX2*vectorX3 + vectorY2*vectorY3 == 0)
            return true;

        if(vectorX3*vectorX1 + vectorY3*vectorY1 == 0)
            return true;

        System.out.println("Triangle with coordinates ("+x1+","+y1+")("+x2+","+y2+")("+x3+","+y3+") is not rectangular.");
        return false;
    }

    public static Boolean getRTrianglePythagorean(int x1, int y1, int x2, int y2, int x3, int y3) {
        // method that checks if Triangle is rectangular by Pythagorean theorem

        RTriangleProvider tr = new RTriangleProvider(x1, y1, x2, y2, x3, y3);

        double AB2 = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
        double BC2 = Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2);
        double AC2 = Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2);

        if(AB2 == (BC2 + AC2) || BC2 == (AB2 + AC2) || AC2 == (AB2 + BC2))
            return true;
        else {
            System.out.println("Triangle with coordinates ("+x1+","+y1+")("+x2+","+y2+")("+x3+","+y3+") is not rectangular.");
            return false;
        }

    }
}
