package hwClass26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        Map<String, Integer> employee = new HashMap<>();
        employee.put("Sam",30000);
        employee.put("Jane",45000);

        int highSal=0;
        String highEmp="";

        for(var emp:employee.entrySet()){
            if(emp.getValue()>highSal){
                highSal=emp.getValue();
                highEmp=emp.getKey();
            }

        }
        System.out.println(highEmp+" "+highSal);

    }
}