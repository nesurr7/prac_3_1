package classes;

import java.util.Arrays;

public class Circle {
    private double radius;//радиус
    private double lenOfArc;//Длина дуги
    private double areaInCircle;//Площадь фигуры внутри окружности
    private String colorOfArc;//Цвет точек дуги окружности
    public Circle(double radius , String colorOfArc)
    {
        this.radius=radius;
        this.lenOfArc=2*Math.PI*radius;
        this.areaInCircle=Math.PI*radius*radius;
        this.colorOfArc=colorOfArc;
    }

    //Сеттеры

    public void setRadius(double radius) {
        this.radius = radius;
        this.lenOfArc=2*Math.PI*radius;
        this.areaInCircle=Math.PI*radius*radius;
    }

    public void setColorOfArc(String colorOfArc) {
        this.colorOfArc = colorOfArc;
    }

    //Геттеры

    public double getAreaInCircle() {
        return areaInCircle;
    }

    public double getLenOfArc() {
        return lenOfArc;
    }

    public double getRadius() {
        return radius;
    }

    public String getColorOfArc() {
        return colorOfArc;
    }

    //toString

    public void printCircletoString() {
        System.out.printf("%s\n %s %.4f\n %s %s %.4f\n %s %.4f",
                //Ограничился 4 знаками для вывода
                "\nПараметры окружности:" ,
                "Радиус:" , radius ,
                "Цвет дуги окружности:" + colorOfArc + "\n",
                "Площадь поверхности внутри окружности:" , getAreaInCircle() ,
                "Длина дуги окружности:" , getLenOfArc());
    }
}
