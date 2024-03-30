public class Main {
    public static void main (String[] args) {

Manager manager = new Manager("Bob",23,"Alinur.kg","male");

Employee employee = new Employee("John",18,"Alinur.kg","2 years","programming");
Employee employee1 = new Employee("Jim",19,"Alinur.kg","4 years","Coding");
        System.out.println(manager.getInfo());
manager.manage(Department.MARKETING);
        System.out.println(employee.getInfo());
        employee.manage(Department.SALES);
        System.out.println(employee1.getInfo());
        employee1.manage(Department.ADVERTISMENT);











    }
}