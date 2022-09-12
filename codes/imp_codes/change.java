package imp_codes;


import java.util.Scanner;
        import java.lang.Math;

public class change
{
    public static void main(String[] args)
    {

        int amount = 14788;
        System.out.println("Amount: "+amount);

        int noOf5000 = amount/5000;
        amount = amount % 5000;

        int noOf1000 = amount/1000;
        amount = amount % 1000;

        int noOf500 = amount/500;
        amount = amount % 500;

        int noOf100 = amount/100;
        amount = amount%100;

        int noOf50 = amount/50;
        amount = amount%50;


        int noOf20 = amount/20;
        amount = amount%20;

        int noOf10 = amount/10;
        amount = amount%10;

        int noOf5 = amount/5;
        amount = amount%5;


        int noOf2 = amount/2;
        amount = amount%2;

        int noOf1 = amount/1;
        amount = amount%1;

        System.out.println("no Of 5000 ruppees are "+noOf5000+" = " + 5000*noOf5000);
        System.out.println("no Of 1000 ruppees are "+noOf1000+" = " + 1000*noOf1000);
        System.out.println("no Of 500 ruppees are "+noOf500+" = " + 500*noOf500);
        System.out.println("no Of 100 ruppees are "+noOf100+" = " + 100*noOf100);
        System.out.println("no Of 50 ruppees are "+noOf50+" = " + 50*noOf50);
        System.out.println("no Of 20 ruppees are "+noOf20+" = " + 20*noOf20);
        System.out.println("no Of 10 ruppees are "+noOf10+" = " + 10*noOf10);
        System.out.println("no Of 5 ruppees are "+noOf5+" = " + 5*noOf5);
        System.out.println("no Of 2 ruppees are "+noOf2+" = " + 2*noOf2);
        System.out.println("no Of 1 ruppee are "+noOf1+" = " + 1*noOf1);








    }
}