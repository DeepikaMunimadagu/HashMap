import java.util.*;
public class Classroom {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
/* 
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); //it will print next element and also update itself
        }
        */
        for(String city : cities){ //for(datatype Object : Collection name)
            System.out.println(city);
        }
    }
}
