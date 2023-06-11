package Seminar.sem_002;

import static java.lang.Math.sqrt;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector [x = " + x + ", y = " + y + ", z = " + z + "]";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * @return метод, вычисляющий длину вектора.
     */
    public double vectorLength() {
        return sqrt(x * x + y * y + z * z);
    }

    /**
     * @return скалярное произведение.
     */
    public double scalar(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @return векторное произведение.
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                z * vector2.y - y * vector2.x);
    }

    /**
     * @return метод, вычисляющий угол между векторами (или косинус угла): косинус
     *         угла
     *         между векторами равен скалярному произведению векторов, деленному на
     *         произведение модулей (длин) векторов
     */
    public double kosVector(Vector vector2) {
        return scalar(vector2) / (vectorLength() * vector2.vectorLength());
    }

    /**
     * @return сумма векторов
     */
    public Vector sumVector(Vector vector2) {
        return new Vector(
                x + vector2.x,
                y + vector2.y,
                z + vector2.z);
    }

    /**
     * @return разница векторов
     */
    public Vector diffVector(Vector vector2) {
        return new Vector(
                x - vector2.x,
                y - vector2.y,
                z - vector2.z);
    }

}
