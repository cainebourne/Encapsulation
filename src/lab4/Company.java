/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Cainebourne
 */
public class Company {
    private HrManager hr;
    
    public Company() {
        hr = new HrManager();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }

    public HrManager getHr() {
        return hr;
    }

    public void setHr(HrManager hr) {
        this.hr = hr;
    }
    

}
