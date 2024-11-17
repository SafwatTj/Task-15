import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int hashCode;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        hashCode = calcHash();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return age == person.age;
    }

    private int calcHash(){
        return age;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }
}
