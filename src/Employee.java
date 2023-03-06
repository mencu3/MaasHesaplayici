public class Employee {
    String name;
    double salary;
    int workHours;
    int hiredYear;

    public Employee(String name, double salary, int workHours, int hiredYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hiredYear = hiredYear;
    }
    public double tax(){
        double taxes;
        if (this.salary<=1000){
            System.out.println("Vergi ver köle.");
            return 0;
        } else {
            taxes = (this.salary * 3) / 100;
            System.out.println("Vergi:" + taxes);
            return taxes;
        }
    }

    public double bonus(){
        double extra;
        int extraHour;

        if (this.workHours >= 40){
            extraHour = this.workHours - 40;
            extra = extraHour * 30;
            System.out.println("Bonus:" + extra);
            return extra;
        } else {
            System.out.println("Bonus para alamadın maalesef.");
            return 0;
        }
    }
    public double raiseSalary(){
        int date = 2021;
        int workDate = date - this.hiredYear;
        double salaryRise = 1.0;

        if (workDate < 10){
            salaryRise = (this.salary * 5) / 100;
            System.out.println("Maaş artışı :" + salaryRise);
            return salaryRise;
        } else if (workDate>=11 && workDate< 20) {
            salaryRise = (this.salary * 10)/100;
            System.out.println("Maaş artışı:" + salaryRise);
            return salaryRise;
        } else if (this.hiredYear>=20) {
            salaryRise = (this.salary * 15)/100;
            System.out.println("Maaş artışı: " + salaryRise);
            return salaryRise;
        }
        return 0;
    }
    public void toplamMaas(){
        double toplamMaas;
        toplamMaas = this.raiseSalary() + this.salary;
        System.out.println("Toplam Maaş: " + toplamMaas );
    }
    public void taxAndBonus(){
        double taxAndBonus;
        taxAndBonus = this.salary - this.tax() + this.bonus();

        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + taxAndBonus);
    }
    public void toStringPrint(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma şekli : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hiredYear);
    }
}