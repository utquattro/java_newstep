package ru.stqa.pfd.firsbox;

public class MyFirstProgram {
    public static void main(String[] args) {

        System.out.println("Hello");
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(2,45);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " & " + r.b + " = " + s.area());
    }


}