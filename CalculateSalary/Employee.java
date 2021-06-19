package CalculateSalary;

public class Employee {
    
    String name;
    double salary;
    double workHourse;
    int hireYear;
    double tax;
    double bonus;
    int workDate;
    double zam;

    Employee(String name, double salary, double workHourse, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHourse = workHourse;
        this.hireYear = hireYear;
    }

    void tax(){
        

        if (this.salary<1000) {
            this.tax = 0;
        }
        else if(this.salary>=1000){
            this.tax = this.salary*0.03;
        }
    }

    void bonus(){
        this.bonus = this.workHourse*30;
    }
    
    void raiseSalary(){
        
        
        this.workDate = 2021-hireYear;

        if (this.workDate<=9) {
            this.zam = this.salary*0.05;
        }
        else if(this.workDate>9 && this.workDate<=19){
            this.zam = this.salary*0.10;
        }
        else if(this.workDate>19){
            this.zam = this.salary*0.15;
        }
    }
    
    void printEmployee(){

        tax();
        bonus();
        raiseSalary();
        double toplam = this.salary+this.bonus+this.zam;
        double brutMaas = toplam-this.tax;

        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hourse: " + this.workHourse);
        System.out.println("Starter Date: " + this.hireYear);
        System.out.println("Tax: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maas artıs: " + this.zam);
        System.out.println("Vergi ve bonuslar ile birlikte maas: " + brutMaas);
        System.out.println("Toplam maas: " + toplam);
        
        
    }
}
