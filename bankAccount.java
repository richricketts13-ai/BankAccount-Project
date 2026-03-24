import java.util.ArrayList;
import java.util.Scanner;



public class bankAccount {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ArrayList<String> transList = new ArrayList<>();
        
        double balance = 0.0;
        int choice = 0;
        double amount = 0.0;



        while (true) { 
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");

            choice = input.nextInt();

            if (choice == 1) {
                
                System.out.println("Amount to deposit: ");
                
                amount = input.nextDouble(); 
                input.nextLine();
                
                if (amount < 0.0) {

                    System.out.println("Enter valid amount:  ");
                 }
                 else {

                    balance = amount + balance;
                    transList.add("Client Deposited: " + amount);
                    System.out.println("Deposit Successful" + " Balance "+balance );
                    

                 }
                
             }
             else if (choice == 2) {
                System.out.println("Amount to withdraw: ");
                
                amount = input.nextDouble();
                input.nextLine();
                
                if (amount <= balance && amount > 0) {
                    
                    balance = balance - amount;
                    transList.add("Client Withdrew: " + amount);
                    System.out.println("Withdraw Successful"+ " Balance "+balance);
                    
                }
                else {
                    
                    System.out.println("Insuffcient Funds");
                }

             }
             else if (choice == 3) {
                 System.out.println("Current Balance: "+balance); 
             }

             else if (choice == 4) {
                if (transList.isEmpty()) {
                    System.out.println("No Transaction History");
                }
                else {
                    for (int i = 0; i < transList.size();i++) {
                    System.out.println(i + 1 + " . " + transList.get(i));
                 }
                 
                }
                 
             }

             else if (choice == 5) {
                System.out.println("Thanks for using");
                break;
            }
            else {
                System.out.println("Input has no function");
            }

            

     }



    }
}
