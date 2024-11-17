package School1;
import java.util.Scanner;
import javax.xml.namespace.QName;

class Account{
    String name;
    double balance;
    Account(){}
    public Account(String name, double balance){
        this.name  = name;
        this.balance = balance;
    }
    void deposit(double s){
        if(s==0){
            System.out.println("입금 금액은 0보다 커야합니다.");
        }
        else if(s>=1){
            balance += s;
        }
    }
    void withdraw(double w){
        if(balance<w){
            System.out.println("출금 실패");
        }
        else if(balance>w){
            balance-=w;
        }
    }
    void displayInfo(){
        System.out.println("계좌 번호 : "+name);
        System.out.println("잔액 : "+balance);
    }

}
class SavingAccount extends Account{
    double interestRate;
    SavingAccount(String name, double balance ,double interestRate){
        super(name,balance);
        this.interestRate = interestRate;
    }
    void addInt(){
        balance+=(balance*interestRate);
        System.out.println("이자 : "+(balance*interestRate));
    }
    void displaySavingInfo(){
       displayInfo();
       System.out.println("이자율 : "+interestRate);
    }
}
class Bank{
    String[] accounts;
    int accountcount = 0;
    Bank(int accountcount){
        accounts = new String[accountcount];
    }
    void addAccount(Account account){
        accounts[accountcount] = account.name;
        accountcount++;
    }
    void Q(Account ac){
        ac.displayInfo();


    }
}

public class T11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. 계좌생성 | 2. 입금 | 3. 출금 | 4. 이자율 확인 | 5. 계좌 확인 \n :");
            int a = sc.nextInt();

        }
    }
}
