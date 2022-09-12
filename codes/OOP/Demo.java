package OOP;

public class Demo {
    public static void main(String[] args) {


        //object of student
        Student st1;
        st1 = new Student();
        st1.studentId=1;
        st1.studentName="Dhara";
        st1.studentCity="Karachi";

        st1.study();
        st1.showFullDetails();


        Student st2 = new Student("hello",23);
        st2.studentId=2;
        st2.studentName="Hamza";
        st2.studentCity="Sarghoda";

        st2.study();
        st2.showFullDetails();

        Student st3 = new Student(33,23);
        st3.studentId=3;
        st3.studentName="hina";
        st3.studentCity="hoda";

        st3.study();
        st3.showFullDetails();



        Student st4 = new Student(4,"Mubashir","hyderabad");
        st4 .study("male");
        st4.showFullDetails();

    }

}
