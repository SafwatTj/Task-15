import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("jack");
        set.add("john");
        set.add("ann");
        set.add("klod");
        set.add("sam");
        set.add("nick");
        set.add("mike");

        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String s: set){
            System.out.print(s +    " ");
        }
        System.out.println();

        List<String> listNames = new ArrayList<>(List.of("Jack", "Georg", "Luka", "Oleg", "Jack", "Poul", "Oleg"));
        List<String> distinctList = distinct(listNames);
        System.out.println(distinctList);

        /*
        Set<String> s
        et1 = new HashSet<>(listNames);
        ArrayList<String> distinct2 = new ArrayList<>(set1);
        System.out.println(distinct2);
        */

        List<String> namesUniq = new ArrayList<>(new HashSet<>(listNames));
        System.out.println(namesUniq);


        System.out.println("-----------------------------------------------");
        Set<Person> people = new HashSet<>();

        people.add(new Person("jack",23) );
        people.add(new Person("nick",20) );
        people.add(new Person("jack",23) );
        people.add(new Person("lena",20) );

        Person yyy=new Person("YYY", 10);
        people.add(yyy);
        people.add(yyy);

        System.out.println(people);

    }

    public static List<String> distinct(List<String> list){
         List<String> result = new ArrayList<>();
         for (String name : list){
             if (!isExists(result, name)) {
                 result.add(name);
             }
         }
         return result;
    }

    private static boolean isExists(List<String> list, String name) {
        for (String str: list){
            if (str.equals(name)){
                return true;
            }
        }
        return false;
    }


}