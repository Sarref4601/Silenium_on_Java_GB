package TriangleFunctions;

public class TriangleAreaFunction {
    public static int triangleArea(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw  new Exception("Сторона должна быть больше 0");
        }
        int p = (a + b + c) / 2;
        int s =(p * (p - a) + (p - b) * (p - c));
        return (int) Math.sqrt(s);
    }
}
