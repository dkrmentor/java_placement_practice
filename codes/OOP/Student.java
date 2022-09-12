package OOP;

public class Student {


    //data:data members :instance variable
    int studentId;
    String studentName;
    String studentCity;

        //non parameterized constructor
        public Student(){

            System.out.println("creating object with non parameterized constructor");
        }
    // constructor overloading
        //parameterized constructor
        public Student(String b, int a){
            this(2,3);
            System.out.println("creating object with  parameterized constructor string and int");
        }

        //constructor overloading
        public Student(int a , int b){
            System.out.println("creating object with  parameterized constructor double int");


        }


        //proper-way of using constructor

        public Student(int id , String studentName , String city){
            studentId=id;
            this.studentName=studentName;
            studentCity=city;
            System.out.println("without this"+ studentName);

            System.out.println("this keyword "+ this.studentName);

        }


    //Behavior : method members : method :functions

    public void study(){

            System.out.println(studentName+" is studying");

    }


    //method overloading
    public void study(String gender){
        System.out.println(studentName+ " ( "+ gender + " ) " + "is studying");
    }




    public void showFullDetails(){
        System.out.println("My name is "+studentName);
        System.out.println("My id is "+studentId);
        System.out.println("My city is "+studentCity);
    }


}
