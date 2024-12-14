package model;

import java.util.*;

public class Customer extends Wallet{

    private static String customer_name;
    private static String customer_surname;
    private static String customer_email;
    private static  Integer paswword;
    private static String account_name;
    private static String lastchoice;
    static Scanner scanner =  new Scanner(System.in);

    //Getter
    public String getCustomer_name(){
        return customer_name;
    }

    //Setter
    public void setCustomer_naame(String customer_name) {
        this.customer_name = customer_name;
    }

    //Getter
    public String getCustomer_surname(){
        return customer_surname;
    }

    // Setter
    public void setCustomer_surname(String customer_surname){
        this.customer_surname = customer_surname;
    }

    //Getter
    public String getCustomer_email(){
        return customer_email;
    }

    //Setter
    public void setCustomer_email(String customer_email){
        this.customer_email = customer_email;
    }

    //Getter
    public Integer getPaswword(){
        return paswword;
    }

    //Setter
    public void setPaswword(Integer paswword){
        this.paswword = paswword;
    }

    //Getter
    public String getAccount_name(){
        return account_name;
    }

    //Setter
    public void setAccount_name(String account_name){
        this.account_name = account_name;
    }

      public static void displayMenu(){
        boolean display =  true;
        while(display){
                displayDashboard();
                int choice  =  getUserChoice();
                processChoice(choice);
                System.out.println();
        }
      }

    public static void displayDashboard(){
        System.out.println("Welcome to Wallet Application.");
        System.out.println("Please choose on of these option");
        System.out.println("1.Sign in");
        System.out.println("2.Sign up");
        System.out.println("3.Report");
        System.out.println("4.Exit");
    }

    public static int getUserChoice(){
        System.out.print("Enter of these option:");
        return scanner.nextInt();
    }

    public static void processChoice(int choice){
            switch (choice){
                case 1:
                    signIn();
                    break;
                case 2:
                    signUp();
                    break;
                case 3:
                    reportIssue();
                    break;
                case 4:
                    exitApp();
                    break;
                default:
                    System.out.println("Sorry wrong input try again");
                    displayDashboard();
            }
    }

    public static void signIn(){
        System.out.println("Please Enter Your email address: ");
        String result = scanner.next();
        System.out.println("Please enter your password");
        int result1 =  scanner.nextInt();
        if(result.equals("elmar465@gmail.com") && result1 == 12345){
            System.out.println("Welcome to Account");
            displayAccount();
        } else {
            System.out.println("Wrong input try again");
            signIn();
        }
    }

    public static String getCustomerInfo(){
       return  "Name: " + customer_name + "\nLastname: " + customer_surname + "\nEmail: " + customer_email +
                "\nPassword: " + paswword ;
    }

    public static  void signUp(){
        if (true) {
            System.out.print("Enter your FirstName:");
            customer_name = scanner.next();
            System.out.print("Enter you lastName:");
            customer_surname = scanner.next();
            System.out.print("Enter your email:");
            customer_email = scanner.next();
            System.out.println("Enter you Password:");
            paswword = scanner.nextInt();
            System.out.println("Thank you\nYour Account created " + "\n" + getCustomerInfo());
            signIn();
        } else {
            System.out.println("Sorry something went wrong try again");
            signUp();
        }
    }

    public static void reportIssue(){
        System.out.println("Please tell us what is issue ?");
        String report = scanner.next();
        System.out.println("Thank you for your feedback\nYour Report is " + report + "\nWe send email to you shortly Thank you ") ;
    }

    public static void exitApp(){
        System.out.println("Thank you very much See you again.");
        System.exit(0);
    }

    public static void displayAccount(){
        System.out.println("Add Record.");
        System.out.println("1.Add expenses");
        System.out.println("2.Add Income");
        System.out.println("3.Sign Out");
        int option =  scanner.nextInt();
        switch (option){
            case 1:
                addExpense();
                break;
            case 2:
                addIncome();
            case 3:
                displayDashboard();
                break;
            default:
                System.out.println("Something Went Wrong ");
                System.exit(0);
        }

    }
    public static void addExpense(){
        System.out.println("Which categories you want to choose");
        List<String> categories = new ArrayList<>();
        categories.add("Groceries");
        categories.add("Bar and Cafe");
        categories.add("Financial Expenses");
        categories.add("Exit");
        getCategorie(categories);
        System.out.println("Enter on these options");
        int option1 =  scanner.nextInt();
        switch (option1){
            case 1:
                System.out.println("How much " + categories.get(0) + " expense you want to add ?");
                recordGrocerieExpenses(0);
                    break;
            case 2:
                System.out.println("How much " + categories.get(1) + " expense you want to add ?");
                recordBarAndCafeExpenses(0);
                break;
            case 3:
                recordFinancialExensies(0);
                System.out.println("How much " + categories.get(2) + " expense you want to add ?");
                break;
            case 4:
                displayAccount();
            default:
                System.out.println("Wrong input Please try again");
                addExpense();
        }
    }
    public static void recordGrocerieExpenses(Integer addUP){
        System.out.print("Enter the amount: ");
        Integer amount =  scanner.nextInt();
        amount += addUP;
        List<String> categories = new ArrayList<>();
        categories.add("Groceries");
        categories.add("Bar and Cafe");
        categories.add("Financial Expenses");
        categories.add("Exit");
        System.out.println(amount + "$"  + " added to " + categories.get(0) +"\n" + categories.get(0) + ": " + amount + "$");
        displayAccount();
    }

    public static void recordFinancialExensies(Integer addUp){
        System.out.print("Enter the amount: ");
        Integer amount =  scanner.nextInt();
        amount += addUp;
        List<String> categories = new ArrayList<>();
        categories.add("Groceries");
   /*     categories.add("Bar And Coffee");
        categories.add("Financial Expenses");
        categories.add("Exit");*/
        System.out.println(amount + "$"  + " added to " + categories.get(1) +"\n" + categories.get(1) + ": " + amount + "$");
        displayAccount();
    }

    public static void recordBarAndCafeExpenses(Integer addUP){
        System.out.print("Enter the amount: ");
        Integer amount =  scanner.nextInt();
        amount += addUP;
        List<String> categories = new ArrayList<>();
//        categories.add("Groceries");
        categories.add("Bar And Coffee");
//        categories.add("Financial Expenses");
//        categories.add("Exit");
        System.out.println(amount + "$"  + " added to " + categories.get(0) +"\n" + categories.get(0) + ": " + amount + "$");
        displayAccount();
    }

    public static void addIncome(){
        System.out.println("Which categories you want to choose");
        List<String> categories = new ArrayList<>();
        categories.add("Groceries");
        categories.add("Financial Expenses");
        categories.add("Bar and Cafe");
        categories.add("Exit");
        getCategorie(categories);
        System.out.println("Enter on these options");
        int option1 =  scanner.nextInt();
        switch (option1){
            case 1:
                System.out.println("How much " + categories.get(0) + " expense you want to add ?");
                recordGrocerieIncome(0);
                break;
            case 2:
                System.out.println("How much " + categories.get(2) + " expense you want to add ?");
                recordBarAndCafeIncome(0);
                break;
            case 3:   System.out.println("How much " + categories.get(1) + " expense you want to add ?");
                recordFinancialIncome(0);
                break;
            case 4:
                displayAccount();
            default:
                System.out.println("Wrong input Please try again");
                addIncome();
        }
    }

    public static void recordGrocerieIncome(Integer addUp){
        System.out.print("Enter the amount: ");
        Integer amount  =  scanner.nextInt();
        amount += addUp;
        List<String> categories = new ArrayList<>();
        categories.add("Groceries");
        System.out.println(amount + "$"  + " added to " + categories.get(0) +"\n" + categories.get(0) + ": " + amount + "$");
        System.out.println("You want see records ?");
        String answer =  scanner.next();
//        if(answer.equals("yes")){
//            Map<String, Integer> result = new HashMap<>();
//            for(int i = 0; i < result.size(); i++){
//
//            }
//        }
        displayAccount();
    }

    public static void recordFinancialIncome(Integer addUp){
        System.out.print("Enter the amount: ");
        Integer amount  =  scanner.nextInt();
        amount += addUp;
        List<String> categories = new ArrayList<>();
        categories.add("Financial Expenses");
        System.out.println(amount + "$"  + " added to " + categories.get(0) +"\n" + categories.get(0) + ": " + amount + "$");
        displayAccount();
    }

    public static void recordBarAndCafeIncome(Integer addUP){
        System.out.print("Enter the amount: ");
        Integer amount  =  scanner.nextInt();
        amount += addUP;
        List<String> categories = new ArrayList<>();
        categories.add("Bar and Coffee");
        System.out.println(amount + "$"  + " added to " + categories.get(0) +"\n" + categories.get(0) + ": " + amount + "$");
        displayAccount();
    }
//
//    public static void displayBudget(List<Customer> budget){
//
//    }
}

