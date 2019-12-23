package stream_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemoForEach {

    public static void main(String[] args) {
        /*
        List<String> person=new ArrayList<>();
        person.add("Rahul");
        person.add("Vidula");
        person.add("Rama");
        person.add("Varsha");
        person.add("Rajiv");

        //Stream<String> selectedpersons=person.stream().filter(p->p.startsWith("R"));
        Stream<String> selectedpersons=person.stream().filter(a->a.endsWith("a"));

      //  Stream<String> sorted = person.stream().sorted().;

        Stream<String> mydata=person.stream().filter(a-> !a.equals("Rahul"));

        mydata.forEach(System.out::println);
        */
        //------------------------------------------------

        List<Integer> numberlist = Arrays.asList(1,1,2,3,4,5,60,40,6,7,8,9,10,11,12,13);

/*        Predicate<Integer> p =new Predicate<Integer>() {

            public boolean test(Integer i) {
                return i%2==0;
            }
        };*/

        numberlist.stream()
                .filter(p->p%2==0)
                .forEach(System.out::println);



    }

}
