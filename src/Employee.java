public class Employee {
    String eName;
    int eSalary;
    int eWorkHours;
    int eHireYear;

    Employee(String eName, int eSalary, int eWorkHours, int eHireYear ) {
        this.eName = eName;
        this.eSalary = eSalary;
        this.eWorkHours = eWorkHours;
        this.eHireYear = eHireYear;
    }
    double tax () {
        if(this.eSalary <= 1000) {
            return  0;
        }
        else {
        return ( ( eSalary * 3 ) / 100.0 );
        }
    }
    double bonus() {
        if (eWorkHours >40 ) {

            return ( ( eWorkHours - 40.0) * 30) ;
        }
        else {
            return 0;
        }
    }
    double yearlyRaiseSalary() {
        if (2024 - this.eHireYear <10 ) {
            return ( ( this.eSalary * 5) /100.0);
        }
        else if ( (2024 - this.eHireYear >=10 ) && ( 2024 - this.eHireYear <20)  ) {
            return (  (this.eSalary *10 ) / 100.0) ;
        }
        else {
            return  (  (this.eSalary * 15 ) /100.0 ) ;
        }
    }

    double netSalary() {
        return ( this.eSalary - this.tax() + this.bonus() + this.yearlyRaiseSalary() ) ;
    }

    void printInfo() {
        System.out.println("Çalışanın Adı: " + this.eName);
        System.out.println("Çalışanın Ham Maaşı: " + this.eSalary);
        System.out.println("Çalışanın Çalışma Saati: " + this.eWorkHours);
        System.out.println("Çalışanın işe başlangıç yılı: " + this.eHireYear);
        System.out.println("Çalışanın ham maaşından kesilecek vergi :" +this.tax());
        System.out.println("Çalışanın çalıştığı ek saatlere karşılık hak ettiği bonus: "+ this.bonus());
        System.out.println("Çalışanın çalıştığı yıla karşılık maaş artışı: " + this.yearlyRaiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş artışı :" +(this.bonus() + this.yearlyRaiseSalary() -this.tax())) ;
        System.out.println("Toplam net maaş: " + this.netSalary() );

    }

}
