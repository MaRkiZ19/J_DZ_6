
import java.util.*;

public class task01 {

    static HashMap<String, String> map;

    public static void main(String[] args) {
        map = new HashMap<>();

        map.merge("Petr", "123", (ov, nv) -> ov==null?nv:ov+" "+nv);
        map.merge("Petr", "234", (ov, nv) -> ov==null?nv:ov+" "+nv);
        map.merge("Petr", "345", (ov, nv) -> ov==null?nv:ov+" "+nv);
        map.merge("Petr", "456", (ov, nv) -> ov==null?nv:ov+" "+nv);
        map.merge("Petr", "567", (ov, nv) -> ov==null?nv:ov+" "+nv);
        map.merge("Ivan", "123", (ov, nv) -> ov==null?nv:ov+" "+nv);
        map.merge("Ivan", "234", (ov, nv) -> ov==null?nv:ov+" "+nv);
        map.merge("Ivan", "345", (ov, nv) -> ov==null?nv:ov+" "+nv);
        map.merge("Olga", "456", (ov, nv) -> ov==null?nv:ov+" "+nv);
        map.merge("Olga", "567", (ov, nv) -> ov==null?nv:ov+" "+nv);


//        addNumber("Petr", "123");
//        addNumber("Petr", "234");
//        addNumber("Petr", "567");
//        addNumber("Petr", "890");
//        addNumber("Ivan", "123");
//        addNumber("Ivan", "234");
//        addNumber("Ivan", "456");
//        addNumber("Olga", "789");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o2.split(" ").length - o1.split(" ").length))
                .forEach(System.out::println);

        System.out.println(map);
//
//        map.put("Petr", Arrays.asList("234", "345"));
//        map.put("Pedtr", List.of("345", "347", "567"));
//        map.get("Petr").add("456");

    }

//    private static void addNumber(String name, String number){
//        map.putIfAbsent(name, new ArrayList<>());
//        map.get(name).add(number);
//    }


}