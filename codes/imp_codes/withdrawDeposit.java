package imp_codes;

public class withdrawDeposit {
    public static void main(String[] args) {


    int balance = 1000;
    int withdraw = 500;
    int deposit = 700;


    System.out.println("total amount = "+balance);


        if(withdraw > balance){
         System.out.println("insufficient balance");
     }
     else{
         balance=balance-withdraw;
     }

        System.out.println("after withdraw amount = "+balance);

        balance=balance+deposit;
        System.out.println("after withdraw and deposit amount = "+balance);

    }

}
