import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee {
    int id;
    String name;
    String designation;

    public Employee(int id, String name, String designation){
        this.id=id;
        this.name= name;
        this.designation=designation;
    }

    public static void main(String[] args) {

        System.out.println("commit 1");
        System.out.println("commit 2");

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"X", "TA"));
        list.add(new Employee(2,"Y", "QA"));
        list.add(new Employee(3,"Z", "HR"));
        list.add(new Employee(4,"W", "QA"));

        HashMap<String, List<String>> map =new HashMap<>();

        for(Employee emp: list){

            if(!map.containsKey(emp.designation)){
                List<String> names= new ArrayList<>();
                names.add(emp.name);
                map.put(emp.designation,names);
            }else{
                map.get(emp.designation).add(emp.name);
            }
        }

        for(String designation: map.keySet()){
            System.out.println(designation +" : "+ map.get(designation));
        }
        System.out.println("Completed successfully");
    }
}


