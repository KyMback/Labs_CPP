package Models.Persons.CompanyEntities;

import Models.Company;

public class CompanyManager {
    private String Name;
    private Company company;

    public CompanyManager(String name){
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void changeCompanyName(String newName){
        company.setName(newName);
    }

    public void changeCompanyPlan(String newPlan){
        company.setPlan(newPlan);
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
