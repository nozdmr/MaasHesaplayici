import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Çalışanın ismini giriniz: ");
        String name= input.nextLine();
        System.out.print("Çalışanın ham maaşını giriniz: ");
        int salary = input.nextInt();
        System.out.print("Çalışanın aylık çalışma saatini giriniz: ");
        int workHours = input.nextInt();
        System.out.print("Çalışanın işe giriş yılını giriniz: ");
        int hireYear=  input.nextInt();

        Employee e1 = new Employee(name, salary,workHours,hireYear);
        e1.printInfo();

    }
}
