public class Director {
    private String name;
    private int age;
    private String company;

    public Director(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;

    }
    public void manage(Department department){
        System.out.println("Директор работает над " + department);
    }




}
