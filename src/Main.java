import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employees> employeeList = new ArrayList<>();
        employeeList.add(new Employees("Jurek", "Barbasz", 36));
        employeeList.add(new Employees("Bartek", "Kowalki", 23));
        employeeList.add(new Employees("Franek", "Babiarz", 45));
        employeeList.add(new Employees("Bronisława", "Kurowski", 11));
        employeeList.add(new Employees("Wiktor", "Polak", 31));
        employeeList.add(new Employees("Arek", "Czester", 54));
        employeeList.add(new Employees("Darek", "Kupiec", 39));


//        for (int i = 0; i < employeeList.size(); i++) {
//            System.out.println(employeeList.get(i).toString());
//        }



    }




}
