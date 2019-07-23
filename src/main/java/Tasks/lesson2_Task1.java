package main.java.Tasks;

public class lesson2_Task1 {
    private int age;
    private String name;
    private String AgeGroup;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("Age must be between 0 and 100");
            return;
        }

        this.age = age;
        this.setAgeGroup();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().length() == 0) {
            System.out.println("");
            return;
        }

        int len = name.length();
        if (len >= 3 && len <= 50) {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
            return;
        }

        System.out.println("name cannot be shorter than 3 characters and no longer than 50 characters");
    }

    public String getAgeGroup() {
        return AgeGroup;
    }

    protected void setAgeGroup() {
        if (this.age < 15) {
            this.AgeGroup = "child";
        } else if (this.age >= 15 && age < 25) {
            this.AgeGroup = "student";
        } else if (this.age >= 25 && age < 65) {
            this.AgeGroup = "worker";
        } else if (this.age >= 65) {
            this.AgeGroup = "pensioner";
        }
    }
}


