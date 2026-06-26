package model;
public class Account {
    private int id; private String holderName,email,accountType,openDate; private double balance;
    public Account(){}
    public Account(String holderName,String email,String accountType,double balance,String openDate){this.holderName=holderName;this.email=email;this.accountType=accountType;this.balance=balance;this.openDate=openDate;}
    public int getId(){return id;} public void setId(int i){this.id=i;}
    public String getHolderName(){return holderName;} public void setHolderName(String n){this.holderName=n;}
    public String getEmail(){return email;} public void setEmail(String e){this.email=e;}
    public String getAccountType(){return accountType;} public void setAccountType(String t){this.accountType=t;}
    public double getBalance(){return balance;} public void setBalance(double b){this.balance=b;}
    public String getOpenDate(){return openDate;} public void setOpenDate(String d){this.openDate=d;}
}
