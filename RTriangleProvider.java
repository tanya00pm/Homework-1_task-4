package ru.levelup.tatiana_nesterova.qa.homework1.task4;

public final class RTriangleProvider implements Triangle {
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;
    private int X3;
    private int Y3;

    public RTriangleProvider(int x1, int y1, int x2, int y2, int x3, int y3) {
        // constructor

        X1 = x1;
        Y1 = y1;
        X2 = x2;
        Y2 = y2;
        X3 = x3;
        Y3 = y3;
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

    public static Triangle getRTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        // method that checks if Triangle is rectangular

        RTriangleProvider tr = new RTriangleProvider(x1, y1, x2, y2, x3, y3);

        int vector_x1 = tr.X2 - tr.X1;
        int vector_y1 = tr.Y2 - tr.Y1;
        int vector_x2 = tr.X3 - tr.X1;
        int vector_y2 = tr.Y3 - tr.Y1;
        int vector_x3 = tr.X3 - tr.X2;
        int vector_y3 = tr.Y3 - tr.Y2;

        if(vector_x1*vector_x2 + vector_y1*vector_y2 == 0)
            return tr;

        if(vector_x2*vector_x3 + vector_y2*vector_y3 == 0)
            return tr;

        if(vector_x3*vector_x1 + vector_y3*vector_y1 == 0)
            return tr;

        return null;
    }

}
