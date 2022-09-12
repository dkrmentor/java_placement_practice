package Interface;

public interface Shape {

    //public static final - interface variable by default
    int i = 34;

    //public abstract - interface method by default
    void calcArea(int r);
}
    //inherit child - interface keyword implements
    class Circle implements Shape{
        public void calcArea(int r){
            System.out.println("area of circle is "+(Math.PI * r * r));
        }
    }




