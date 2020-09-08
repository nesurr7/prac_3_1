package classes;

public class CircleTest {

        public static void main(String[] args) {
        Circle myCircle = new Circle(10d,"blue");
        System.out.printf("%.2f\n",myCircle.getLenOfArc());//Длина окружности до изменения радиуса
        myCircle.setRadius(4d);
        System.out.printf("%.2f\n",myCircle.getLenOfArc());//После
        System.out.printf("%.2f\n",myCircle.getAreaInCircle());
        System.out.printf("%.2f\n",myCircle.getRadius());
        myCircle.printCircletoString();
        }
}
