package main; import java.util.Scanner; import dao.*; import model.Account;
public class BankApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);AccountDAO dao=new AccountDAO();UserDAO u=new UserDAO();
        System.out.println("===== Admin Login =====");System.out.print("Username: ");String user=sc.nextLine();System.out.print("Password: ");String pass=sc.nextLine();
        if(!u.login(user,pass)){System.out.println("Invalid credentials");return;}System.out.println("Login Successful");
        while(true){
            System.out.println("\n===== Bank Account Management System =====");
            System.out.println("1.Open Account\n2.View All Accounts\n3.Search by ID\n4.Deposit\n5.Withdraw\n6.Close Account\n7.Count Accounts\n8.Highest Balance\n9.Sort by Balance\n10.Account Type Report\n11.Exit");
            System.out.print("Choice: ");int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("Holder Name: ");String n=sc.nextLine();System.out.print("Email: ");String e=sc.nextLine();System.out.print("Account Type (Savings/Current): ");String t=sc.nextLine();System.out.print("Initial Balance: ");double b=sc.nextDouble();sc.nextLine();System.out.print("Open Date: ");String d=sc.nextLine();System.out.println(dao.add(new Account(n,e,t,b,d))?"Account Opened":"Failed");break;
                case 2:dao.viewAll();break;case 3:System.out.print("ID: ");dao.searchById(sc.nextInt());break;
                case 4:System.out.print("ID: ");int did=sc.nextInt();System.out.print("Amount: ");System.out.println(dao.deposit(did,sc.nextDouble())?"Deposited Successfully":"Failed");break;
                case 5:System.out.print("ID: ");int wid=sc.nextInt();System.out.print("Amount: ");System.out.println(dao.withdraw(wid,sc.nextDouble())?"Withdrawn Successfully":"Insufficient Balance / Failed");break;
                case 6:System.out.print("ID: ");System.out.println(dao.delete(sc.nextInt())?"Account Closed":"Failed");break;
                case 7:dao.count();break;case 8:dao.highestBalance();break;case 9:dao.sortByBalance();break;case 10:dao.accountTypeReport();break;
                case 11:System.out.println("Thank you!");return;default:System.out.println("Invalid");
            }
        }
    }
}
