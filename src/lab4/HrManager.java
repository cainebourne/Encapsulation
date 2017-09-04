
package lab4;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cainebourne
 */
public class HrManager {
 private List<Employee> employees;


    public HrManager() {
        employees = new ArrayList();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName,lastName,ssn);
        employees.add(e);
        orientEmployee(e);
    }
    
    // HRManager delegates work to employee
    public void orientEmployee(Employee e) {
        e.doFirstTimeOrientation("B101");
    }

    public void outputReport(String ssn) {
        Employee e = null;
        
        // find employee in list
        for(Employee emp : employees) {
            if(emp.getSsn().equals(ssn)) {
                e = emp;
                break;
            } else {
                // if not found end method prematurely
                return;
            }
        }

        // if found run report
        if(e.isMetWithHr() && e.isMetDeptStaff()
           && e.isReviewedDeptPolicies() && e.isMovedIn()) {
            
            e.getReportService().outputReport();
            
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public static void main(String[] args) {
        HrManager hr = new HrManager();
        hr.hireEmployee("BIll", "SMith", "555-55-5555");
        System.out.println(hr.getEmployees());
//        for(Employee emp : hr.getEmployees()) {
//            System.out.println(emp);
//        }
    }
}
