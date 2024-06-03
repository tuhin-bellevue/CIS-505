import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DawGradeBookApp extends Application {
    
    private TextField fisrtNameTextField;
    private TextField lastNameTextField;
    private TextField courseTextField;

    private Label firstName,lastName,course;
    ComboBox<String> comboBox;;
    private Button btnSubmit,btnClear,btnViewGrade;

    String txtMonthlyPayment="",txtInterestRate = "",txtResults="", lblFutureValueDate="";

    public static void main(String[] args) {
        launch(args);
    }
    
    @SuppressWarnings("static-access")
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Daw Grade Book App");
        
        StackPane root = new StackPane();

        firstName = new Label("fisrt name");
        fisrtNameTextField = new TextField();
        lastName = new Label("last name");
        lastNameTextField = new TextField();
        course = new Label("Course");
        courseTextField = new TextField();

        comboBox = new ComboBox<String>();
    
        btnSubmit = new Button("Submit");
        btnSubmit.setOnAction(e -> submitForm());
        btnClear = new Button("Clear");
        btnClear.setOnAction(e -> clearFormFields());
        btnViewGrade = new Button("View Grade");
        btnClear.setOnAction(e -> clearFormFields());


        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        Insets insets = new Insets(11.5, 12.5, 13.5, 14.5);
        gridPane.setPadding(insets);
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        comboBox.getItems().add("A");
        comboBox.getItems().add("B");
        comboBox.getItems().add("C");
        comboBox.getItems().add("D");
        comboBox.getItems().add("E");
        comboBox.getItems().add("F");

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.getChildren()
        .addAll(firstName,fisrtNameTextField,lastName,lastNameTextField,course,courseTextField,comboBox, btnClear,btnSubmit,btnViewGrade);
        
        gridPane.add(actionBtnContainer, 1, 4);
   
    
        root.getChildren().add(gridPane);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

    }

    private void clearFormFields() {
        String fisrtNameTextField="",lastNameTextField = "",courseTextField="";
    }

    private void viewGrade() {
        List<String[]> fileContent = Student.readDataFromCSV();
    }

    private void submitForm () {
       String firstName = fisrtNameTextField.getText();
       String lastName = lastNameTextField.getText();
       String course = courseTextField.getText();
       String grade = comboBox.getValue();

       String [] data = new String[4];
       data[0]=firstName;
       data[1]=lastName;
       data[2]=course;
       data[3]=grade;
    
       Student.writeDataToCSV(data);
    }

    
}
