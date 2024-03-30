    final class Employee extends Manager {
      private String workExperience;
      private  String skills;


        public Employee(String name, int age, String company, String workExperience, String skills) {
            super(name, age, company, "male");
        }

        public String getWorkExperience() {
            return workExperience;
        }

        public String getSkills() {
            return skills;

        }
        public void manage(Department department){
            System.out.println("Работник работает над " + department);
        }

        @Override
        public String getInfo(){
            return "Age: " + getAge() +
                    "\nName: " + getName() ;



}}
