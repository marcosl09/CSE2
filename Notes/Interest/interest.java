//mlm
//9/2/2015

public class interest{
    public static void main(String[] args){
        double balance = 2000;
        double interestRate = .02;
        double interestMoney = balance * interestRate;
        balance += interestMoney;
        
        System.out.println("Balance = " + balance);
        
        
    }
    
}