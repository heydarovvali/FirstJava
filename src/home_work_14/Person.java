package home_work_14;

public class Person {

        private String name;
        private String surName;
        private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person " +
                "name = " + name + '\'' +
                ", surName = " + surName + '\'' +
                ", age=" + age +
                '}';
    }
}









