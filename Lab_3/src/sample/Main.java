package sample;

import Models.*;
import Models.Persons.Clients.Client;
import Models.Persons.Clients.LegalPerson;
import Models.Persons.Clients.PhysicalPerson;
import Models.Persons.Clients.VipClient;
import Models.Persons.CompanyEntities.CompanyManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    private Client legalPerson = new LegalPerson();
    private Client physicalPerson = new PhysicalPerson();
    private CompanyManager companyManager = new CompanyManager("manager");
    private Company company = new Company();
    private VipClient vipClient = new VipClient();

    private void Configure(){
        companyManager.setCompany(company);
        company.setPlan("First plan");
        company.setName("Company name");
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        GridPane root = new GridPane();
        Configure();

        Label legalPersonlabel = new Label("Legal person");
        Button legalPersonButtonToOrder = new Button("to order by legal person");
        Button legalPersonButtonToPayment = new Button("pay by legal person");
        Label legalPersonlabelMoney = new Label(Integer.toString(legalPerson.getMoney()));

        Label physicalPersonlabel = new Label("Physical person");
        Button physicalPersonButtonToOrder = new Button("to order by physical person");
        Button physicalPersonButtonToPayment = new Button("pay by physical person");
        Label physicalPersonlabelMoney = new Label(Integer.toString(physicalPerson.getMoney()));

        Label vipPersonlabel = new Label("Vip person");
        Button vipPersonButtonToOrder = new Button("to order by Vip person");
        Button vipPersonButtonToPayment = new Button("pay by Vip person");
        Label vipPersonlabelMoney = new Label(Integer.toString(legalPerson.getMoney()));

        Label companyName = new Label(company.getName());
        TextField fieldName = new TextField();
        Label companyPlan = new Label(company.getPlan());
        TextField fieldPlan = new TextField();

        Button managerChangeNameButtom = new Button("Change money");
        Button managerChangePlanButton = new Button("Change plan");

        legalPersonButtonToOrder.setOnMouseClicked((value) -> {
            legalPerson.toOrder(company);
        });
        legalPersonButtonToPayment.setOnMouseClicked((value) -> {
            legalPerson.pay();
            legalPersonlabelMoney.setText(Integer.toString(legalPerson.getMoney()));
        });

        physicalPersonButtonToOrder.setOnMouseClicked((value) -> {
            physicalPerson.toOrder(company);
        });
        physicalPersonButtonToPayment.setOnMouseClicked((value) -> {
            physicalPerson.pay();
            physicalPersonlabelMoney.setText(Integer.toString(physicalPerson.getMoney()));
        });

        vipPersonButtonToOrder.setOnMouseClicked((value) -> {
            vipClient.toOrder(company);
        });
        vipPersonButtonToPayment.setOnMouseClicked((value) -> {
            vipClient.pay();
            vipPersonlabelMoney.setText(Integer.toString(vipClient.getMoney()));
        });

        managerChangeNameButtom.setOnMouseClicked((value)->{
            String text = fieldName.getText();
            company.setName(text);
            companyName.setText(text);
        });
        managerChangePlanButton.setOnMouseClicked((value)->{
            String text = fieldPlan.getText();
            company.setPlan(text);
            companyPlan.setText(text);
        });



        root.add(legalPersonlabel, 0, 0);
        root.add(legalPersonButtonToOrder, 0, 1);
        root.add(legalPersonButtonToPayment, 0, 2);
        root.add(legalPersonlabelMoney, 0, 3);

        root.add(physicalPersonlabel, 1, 0);
        root.add(physicalPersonButtonToOrder, 1, 1);
        root.add(physicalPersonButtonToPayment, 1, 2);
        root.add(physicalPersonlabelMoney, 1, 3);

        root.add(vipPersonlabel, 2, 0);
        root.add(vipPersonButtonToOrder, 2, 1);
        root.add(vipPersonButtonToPayment, 2, 2);
        root.add(vipPersonlabelMoney, 2, 3);

        root.add(companyName, 3, 0);
        root.add(fieldName, 3, 1);
        root.add(companyPlan, 3, 2);
        root.add(fieldPlan, 3, 3);

        root.add(managerChangeNameButtom, 4, 1);
        root.add(managerChangePlanButton, 4, 3);

        primaryStage.setScene(new Scene(root, 800, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
