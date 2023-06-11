package Seminar.sem_002;

public class task008 {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2, 3);
        // vector.setX(0);
        // vector.setY(1);
        // vector.setZ(2);
        System.out.println("Первый вектор = " + vector);
        System.out.println("Длина вектора: " + vector.vectorLength());
        Vector vector2 = new Vector(1, 1, 1);
        System.out.println("Второй вектор = " + vector2);
        System.out.println("Скалярное произведение: " + vector.scalar(vector2));
        System.out.println("Векторное произведение: " + vector.vectorMulti(vector2));
        System.out.println("Угол между векторами: " + vector.kosVector(vector2));
        System.out.println("Сложение векторов: " + vector.sumVector(vector2));
        System.out.println("Вычитание векторов: " + vector.diffVector(vector2));

    }

}
