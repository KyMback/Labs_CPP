package sample;

import Models.Client;
import Models.Company;
import Models.LegalPerson;
import Models.PhysicalPerson;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    private Client LegalPerson = new LegalPerson();
    private Client PhysicalPerson = new PhysicalPerson();
    private Company Company = new Company();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        GridPane root = new GridPane();

        Label legalPersonlabel = new Label("Legal person");
        Button legalPersonButtonToOrder = new Button("to order by legal person");
        Button legalPersonButtonToPayment = new Button("pay by legal person");
        Label legalPersonlabelMoney = new Label(Integer.toString(LegalPerson.getMoney()));

        Label physicalPersonlabel = new Label("Physical person");
        Button physicalPersonButtonToOrder = new Button("to order by physical person");
        Button physicalPersonButtonToPayment = new Button("pay by physical person");
        Label physicalPersonlabelMoney = new Label(Integer.toString(PhysicalPerson.getMoney()));

        legalPersonButtonToOrder.setOnMouseClicked((value) -> {
            LegalPerson.toOrder(Company);
        });
        legalPersonButtonToPayment.setOnMouseClicked((value) -> {
            LegalPerson.pay();
            legalPersonlabelMoney.setText(Integer.toString(LegalPerson.getMoney()));
        });

        physicalPersonButtonToOrder.setOnMouseClicked((value) -> {
            PhysicalPerson.toOrder(Company);
        });
        physicalPersonButtonToPayment.setOnMouseClicked((value) -> {
            PhysicalPerson.pay();
            physicalPersonlabelMoney.setText(Integer.toString(PhysicalPerson.getMoney()));
        });


        root.add(legalPersonlabel, 0, 0);
        root.add(legalPersonButtonToOrder, 0, 1);
        root.add(legalPersonButtonToPayment, 0, 2);
        root.add(legalPersonlabelMoney, 0, 3);

        root.add(physicalPersonlabel, 1, 0);
        root.add(physicalPersonButtonToOrder, 1, 1);
        root.add(physicalPersonButtonToPayment, 1, 2);
        root.add(physicalPersonlabelMoney, 1, 3);

        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
