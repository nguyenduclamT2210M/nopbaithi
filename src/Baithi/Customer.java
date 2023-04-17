package Baithi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    String customerCode;
    String accountName;
    int accNumber;
    long ammout;
    int or;



    public Customer(String customerCode, String accountName, int accNumber,  int ammout) {
        this.customerCode = customerCode;
        this.accountName = accountName;
        this.accNumber = accNumber;
        this.ammout = ammout;

    }

    public Customer() {
        this.customerCode = "";
        this.accountName = "";
        this.accNumber= 0 ;
        this.ammout = 1234;
    }

    public String toString() {
        return this.customerCode + ", " + this.accountName + ", " +this.accNumber+", "+this.ammout;
    }



    public void inputData() throws Exception {
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d{6}");
        System.out.println("Your account: ");

        Customer c = new Customer("MNMN","NUNU",123123123,1234);
        System.out.println(c);
        System.out.println("========Realize the transaction==========");
        try {
            System.out.print("Enter customer code: ");
            String code = input.nextLine();
            while (code.length() != 5)
            {
                System.out.println("Did you enter the wrong cup, please reply again");
                System.out.print("Enter customer code: ");
                 code = input.nextLine();
            }
            if (code.length() != 5) {
                throw new Exception("Code must be charaters");
            } else {
                this.customerCode = code;
                System.out.print("Enter account name: ");
                String accName = input.nextLine();

                if (!accName.startsWith("100")) {


                    System.out.print("Emter acc number: ");
                    int accNumber = input.nextInt();


                    System.out.println("1.You want to transfer?");
                    System.out.println("2.you want to withdraw money");

                    System.out.print("My choice is: ");
                    this.or = input.nextInt();
                    while (or != 1 || or != 2)
                    {
                        System.out.print("My choice is: ");
                        or = input.nextInt();
                    }
                    if(or == 1 ){
                    System.out.print("So you want to move: ");
                    int mony = input.nextInt();

                    if (mony > ammout){
                        System.out.println("Your earphone is not used for transactions");

                        while (mony>ammout){
                            System.out.print("So you want to move: ");
                            mony = input.nextInt();
                        }
                    }else{
                        System.out.println("Bar trading");
                        int hieu = (int) (ammout - mony);
                        System.out.println("Account balance is: "+hieu);
                    }


                    }else if ( or == 2 ){

                        System.out.print("First you want to nap: ");
                        int a = input.nextInt();
                        int tong = (int) (a + ammout);
                        System.out.println("Account balance is: "+tong);

                    }



                } else {
                    Matcher matcher = pattern.matcher(accName);
                    if (!matcher.matches()) {
                        throw new Exception("Account number must be 6 digits");
                    }
                }

            }
        } catch (Exception var6) {
            throw new Exception(var6.getMessage());
        }
    }
}
