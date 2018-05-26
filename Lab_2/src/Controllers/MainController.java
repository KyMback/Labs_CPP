package Controllers;

import Models.Company;
import Models.LegalPerson;
import Models.MainModel;
import Models.PhysicalPerson;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML private MainModel model;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model.setCompany(new Company());
        model.setLegalPerson(new LegalPerson());
        model.setPhysicalPerson(new PhysicalPerson());
    }

    public void toOrderByLegalPerson(){
        model.getLegalPerson().toOrder(model.getCompany());
    }

    public void payByLegalPerson(){
        model.getLegalPerson().pay();
    }

    public void toOrderByPhysicalPerson(){
        model.getPhysicalPerson().toOrder(model.getCompany());
    }

    public void payByPhysicalPerson(){
        model.getPhysicalPerson().pay();
    }
}
