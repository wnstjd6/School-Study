package School1;

public class T13 {

    public static void main(String[] args) {
        String data[][]= {{"MCTEIT", "고영희", "D", "40", "5" }, {"MCRSIZ", "도민준", "A","50"},
                {"MCRM13","채송화","C","30"}, {"MCRM14","경연주","B","47"}};

        Employee[] e = new Employee[data.length];
        for(int i = 0; i < data.length;i++) {
            String id = data[i][0];
            String name = data[i][1];
            String basicSalary = data[i][2];
            char[] arr = data[i][0].toCharArray();
            if(arr[2]=='R' && arr[3]=='M') {
                String manageAllow = data[i][3];
                e[i] = new Manager(id, name, basicSalary, manageAllow);
            }
            if(arr[2]=='T' && arr[3]=='E') {
                String performAllow = data[i][3];
                String conPeriod = data[i][4];
                e[i] = new Temporary(id, name, basicSalary, performAllow,conPeriod);
            }
            if(arr[2]=='R' && arr[3]=='S') {
                String salesAllow = data[i][3];
                e[i] = new SalesMan(id, name, basicSalary, salesAllow);
            }
        }
        for(int i = 0; i < e.length; i++) {
            e[i].info();
            System.out.println();
        }
    }

}
 abstract class  Employee1 {
    String uniquenum;
    String name;
    char basicSalary;
    public Employee1(String uniquenum, String name, char basicSalary) {
        this.uniquenum = uniquenum;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public void info() {
        System.out.println("이름 : "+ name + "\n고유번호 : " + uniquenum + "\n기본급 : " + basicSalary);
    }
    abstract int claSalary();
}
class Manager1 extends Employee1 {
    private int manageAllow;
    public Manager1(String uniquenum, String name, char basicSalary,String manageAllow) {
        super(uniquenum, name, basicSalary);
        this.manageAllow = Integer.parseInt(manageAllow);
    }
    public void info() {
        super.info();
        System.out.println("관리수당 : " + manageAllow);
    }
    @Override
    int claSalary(){
        int salary = 0;
        switch (basicSalary){
        case 'A' :
            salary = 5000*manageAllow;
            break;
            case 'B' :
                salary = 4000*manageAllow;
                break;
            case 'C':
                salary = 3000*manageAllow;
                break;
            case 'D':
                salary = 2000*manageAllow;
                break;
            case 'E':
                salary = 1000*manageAllow;

    }
    return salary;
    }

}
class SalesMan1 extends Employee1 {
    private int salesAllow;
    public SalesMan1(String uniquenum, String name, char basicSalary,String salesAllow) {
        super(uniquenum, name, basicSalary);
        this.salesAllow = Integer.parseInt(salesAllow);
    }
    public void info() {
        super.info();
        System.out.println("영업수당: " + salesAllow);

    }
    @Override
    int claSalary(){
        int salary = 0;
        switch (basicSalary){
            case 'A' :
                salary = 5000*salesAllow;
                break;
            case 'B' :
                salary = 4000*salesAllow;
                break;
            case 'C':
                salary = 3000*salesAllow;
                break;
            case 'D':
                salary = 2000*salesAllow;
                break;
            case 'E':
                salary = 1000*salesAllow;

        }
        return salary;
    }
}
class Temporary1 extends Employee1{
    private int perfromAllow;
    private int conPeriod;
    public Temporary1(String uniquenum, String name, char basicSalary,String perfromAllow, String conPeriod) {
        super(uniquenum, name, basicSalary);
        this.perfromAllow = Integer.parseInt(perfromAllow);//Integer = String 타입을 int 타입으로 형변환 해주는 함수
        this.conPeriod = Integer.parseInt(conPeriod);
    }
    public void info() {
        super.info();
        System.out.println("성과수당: " + perfromAllow + "\n계약기간: " + conPeriod);
    }
    @Override
    int claSalary(){
        int salary = 0;
        switch (basicSalary){
            case 'A' :
                salary = 400*conPeriod;
                break;
            case 'B' :
                salary = 300*conPeriod;
                break;
            case 'C':
                salary = 200*conPeriod;
                break;
            case 'D':
                salary = 150*conPeriod;
                break;
            case 'E':
                salary = 100*conPeriod;
        }
        return salary;
    }
}
