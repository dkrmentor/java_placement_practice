package abstraction;

public class test {
    public static void main(String[] args) {
        myChild child = new myChild();
        child.cal();
        child.rocket();




        //polymorphis happening here we are calling reference of parent and object{implementation} of child
        myClass child2 = new myChild();
        child2.cal();
        child2.rocket();








    }
}
