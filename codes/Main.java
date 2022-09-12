import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  System.out.println("Hello world!");


        //variables
        String name = "DHARA";
        //   System.out.println(name);
        int a = 2, d = 1;
        //   System.out.println(a);
        //   System.out.println(d);
        float b = 22.2f;
        //   System.out.println(b);
        boolean c = false;
        //   System.out.println(c);


        //primitive data types
        byte a1 = 24;
        //    System.out.println(a1);
        short a2 = 189;
        //     System.out.println(a2);
        int a3 = 34543;
        //     System.out.println(a3);
        long a4 = 864381264;
        //    System.out.println(a4);
        float a5 = 6123876.1231f;
        //    System.out.println(a5);
        double a6 = 93629374.29834689239648;
        //    System.out.println(a6);
        boolean a7 = true;
        //  System.out.println(a7);
        char a8 = 'd';
        //   System.out.println(a8);


        //non-primitive [reference] data types == object developer make and call methods on it


        //operators in java
        //operand, operator , operand


        //arthmetic operators
        int n1 = 10, n2 = 20;
//        System.out.println("addition"+ " " +(n1+n2));
//        System.out.println("subtraction"+ " " +(n1-n2));
//        System.out.println("multiplication"+ " " +(n1*n2));
//        System.out.println("division"+ " "+(n2/n1));
//        System.out.println("mod"+" "+(n1%n2));

        int n3 = 55;
//        System.out.println(n3++);
//        System.out.println(++n3);
//        System.out.println(n3--);
//        System.out.println(--n3);

        //assignment operator
        int n4 = 5;
//        System.out.println(n4+=3);
//        System.out.println(n4-=3);
//        System.out.println(n4*=3);
//        System.out.println(n4/=3);
//        System.out.println(n4%=3);


        //logical
        // && = and , || = or , ! = not

        //comparision operators
        // == != < > <= >=


        //user input = scanner class
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter Input ");
//        String input = scan.nextLine();
//        System.out.println(input);

//        System.out.println("Enter Input 1");
//        String input1 = scan.next();
//        System.out.println(input1);

//        System.out.println("Enter Age");
//        int input2 = scan.nextInt();
//        System.out.println(input2);

        String behaviour = "simple";
//       System.out.println("Enter String to Perform functions");
//        String inputs = scan.nextLine();
//        System.out.println("Length"+" "+ inputs.length());
//        System.out.println("UpperCase"+" "+ inputs.toUpperCase());
//        System.out.println("LowerCase"+" "+ inputs.toLowerCase());
//        System.out.println(inputs+" is \""+behaviour+"\"");
//        System.out.println(inputs+" is \\"+behaviour+"\\");
//        System.out.println(inputs+" is \n"+behaviour+"\n");
//        System.out.println(inputs+" is \t"+behaviour+"\t");
//        System.out.println(inputs+ " contains dhara is  "+inputs.contains("dhara"));
//        System.out.println("4th character "+inputs.charAt(3));
//        System.out.println("Ends with rajput "+ inputs.endsWith("rajput"));
//        System.out.println("index of kumari  "+ inputs.indexOf("kumari"));


//        int num1=4, num2=3;
//        System.out.println("max "+Math.max(num1,num2));
//        System.out.println("min "+Math.min(num1,num2));
//        int num3=36;
//        System.out.println("sqrt "+Math.sqrt(num3));
//        int num4= -33;
//        System.out.println("abs "+Math.abs(num4));
//        System.out.println("random number "+Math.random());
//        System.out.println("random number b/w 4 to 8 "+(4+(8-4))*Math.random());


//        System.out.println("Enter your Age ");
//        int age = scan.nextInt();
//        System.out.println(age);

//      if-else condition
//        if(age>18){
//            System.out.println("you are an adult");
//        }
//        else if(age>5){
//            System.out.println("you are not a kid");
//        }
//        else{
//            System.out.println("you are a kid");
//        }


//        System.out.println("Enter your Age ");
//        int age = scan.nextInt();
//        System.out.println(age);
//        //switch case
//        switch (age){
//            case 18:
//                System.out.println("18 year");
//                break;
//            case 2:
//                System.out.println("2 years");
//                break;
//            case 36:
//                System.out.println("36 years");
//                break;
//            default:
//                System.out.println("dont match");
//        }


        //quick quiz
//        System.out.println("Enter day no");
//        int day = scan.nextInt();
//        System.out.println(day);
//        switch (day){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("wrong input");
//
//        }


        //Loops

        //while loop
//        int i = 0;
//        while (i < 100) {
//            System.out.println("i "+i);
//            i += 1;
//        }


        //do while
//        int j = 0;
//        do{
//            System.out.println("j "+j);
//            j +=1;
//        }while(j<100);



        //for loop
//        for(int i=0; i<10 ; i++){
//            System.out.println(i);
//        }

        //for loop with break
//        for(int i=0; i<10 ; i++){
//            if(i>2){
//                break;
//            }
//            else{
//                System.out.println(i);
//            }
//        }

//        //for loop with continue
//        for(int i=0; i<10 ; i++){
//            if(i==2){
//                continue;
//            }
//            else{
//                System.out.println(i);
//            }
//        }



        //arrays
        int [] marks = {1,2,3,5};
        marks[3]= 34;
//        System.out.println(marks[2]);
//        System.out.println("updated"+marks[3]);

//        for(int i = 0 ; i <marks.length ; i++){
//            System.out.println(marks[i]);
//        }

//        //for each loop
//        for(int value:marks){
//            System.out.println(value);
//        }


        //2d array
//        int [][]matrix ={{1,2,3}, {4,5,6}};
//        System.out.println(matrix[1][1]);
//

//        String [] cars = {"a","b","c","d","e"};
//        for (String value:cars) {
//            System.out.println(value);
//
//        }




        //try catch
//        String [] cars = {"a","b"};
//        try{
//            System.out.println(cars[3]);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//
//        System.out.println("dhara");


        //method usage
//       int addition = sum(2,3);
//        System.out.println(addition);



    //Calculator
//        System.out.println("Enter first number");
//        float num1 = scan.nextFloat();
//        System.out.println("Enter second number");
//        float num2 = scan.nextFloat();
//
//        System.out.println("first num = "+num1);
//        System.out.println("second num = "+num2);
//
//        String prompt = "Enter 0 for addition ," +
//                " 1 for subtraction" +
//                " 2 for multiplication" +
//                " 3 for division";
//        System.out.println(prompt);
//
//        int input = scan.nextInt();
//        switch (input){
//            case 0:
//                System.out.println("addition "+(num1+num2));
//                break;
//            case 1:
//                System.out.println("subtraction "+(num1-num2));
//                break;
//            case 2:
//                System.out.println("multiplication "+(num1*num2));
//                break;
//            case 3:
//                System.out.println("division "+(num1/num2));
//                break;
//            default:
//                System.out.println("invalid");
//
//        }



    }



    //method making
//    static int sum(int a, int b){
//        return a+b;
//    }



}