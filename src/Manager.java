public class Manager extends Director {
    private String gender;
   private  Department department;
   private String workExperience;



    public Manager(String name, int age, String company, String male) {
        super(name, age, company);

    }

    public String getGender() {
        return gender;
    }

    public Department getDepartment() {
        return department;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void manage(){
        System.out.println("Менеджер работает над " + department);
    }
    public String getInfo(){
        return "Age: " + getAge() +
                "\nName: " + getName() ;


}
}


