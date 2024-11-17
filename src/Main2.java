import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {

        Person person = new Person("jack",30);
        Set<Person> set = new HashSet<>();

        System.out.println("Изначальный hash: " + person.hashCode());
        set.add(person);
        System.out.println("Изначальный set:");
        System.out.println(set);

        set.remove(person);
        person.setAge(31);
        set.add(person);

        System.out.println("Повзрослел  hash: " + person.hashCode());
        System.out.println("Повзрослел set:");
        System.out.println(set);

        System.out.println("Ищем " + person);
        System.out.println(set.contains(person));


    }

}
