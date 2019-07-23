package main.java.Tasks;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String) V
 * реализовать методы геттеры и сеттеры для каждой переменной.V
 * Должны быть выполненны следующие условия:
 *  - не должно быть возможности напрямую устанваливать или читать значение age/name V
 *  - нельзя установить значение age меньше нуля V
 *  - максимальныое значение для возраста - 100 V
 *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов V
 *  - name не может состоять из одних только пробелов V
 *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 *      оно должно быть записано в переменную name с большой буквы V
 *  - ageGroup должен устанавливаться автоматически при установке возраста
 *      - child если age до 15 лет
 *      - student  - если age от 15 до 25 лет
 *      - worker - если age от 26 до 65 лет
 *      - pensioner - если age старше 66 лет
 *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

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


