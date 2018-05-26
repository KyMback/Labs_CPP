package Models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class MainModel {
    private ObjectProperty<LegalPerson> legalPerson = new SimpleObjectProperty(this, "LegalPerson");
    public final void setLegalPerson(LegalPerson value) { legalPerson.set(value); }
    public final LegalPerson getLegalPerson() { return legalPerson.get(); }
    public int getLegalPersonMoney() { return legalPerson.get().getMoney(); }

    private ObjectProperty<PhysicalPerson> physicalPerson = new SimpleObjectProperty(this, "PhysicalPerson");
    public final void setPhysicalPerson(PhysicalPerson value) { physicalPerson.set(value); }
    public final PhysicalPerson getPhysicalPerson() { return physicalPerson.get(); }
    public int getPhysicalPersonMoney() { return physicalPerson.get().getMoney(); }

    private ObjectProperty<Company> company = new SimpleObjectProperty(this, "Company");
    public final void setCompany(Company value) { company.set(value); }
    public final Company getCompany() { return company.get(); }
}