package lab3;

public class EmployeeReportService {
    private String report = "";
    
    public void addData(String data) {
        report += data;
    }
    
    public void outputReport() {
        System.out.println(report);
    }
    
    public void clearReport() {
        report = "";
    }

}
