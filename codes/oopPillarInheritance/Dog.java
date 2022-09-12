package oopPillarInheritance;



public class Dog extends Animal{

    int x =4;
            public void speak(){
                System.out.println("super "+super.x);
                System.out.println("this "+this.x);
                System.out.println("dont use "+x);

            }

}
