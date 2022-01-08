package _java_Encapusaltion_;

public class encap {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aditya");
        s.setAge(14);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}


class Student{
    private int age;
    private String name;

    public String getName(){

        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setName(String name) {
        this.name = name;

    }
}
