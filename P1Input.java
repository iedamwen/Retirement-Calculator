package Project1.ProjectOne;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.lang.String;
import javafx.scene.layout.VBox;



public class P1Input extends Application {

    //Creating window, scenes, table
    Stage window;
    Scene scene, scene2;
    TableView<Columns> table;

    public void start(Stage primaryStage) {
        //Window and title
        primaryStage.setTitle("Retirement Information");
        window = primaryStage;

        //Grid to put labels and text fields in
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(8);
        grid.setVgap(10);

        //Button to submit the users input
        Button button = new Button("Submit");

        //Labels - constrains use (child, column, row)
        Label ageLabel = new Label("How old are you? ");
        GridPane.setConstraints(ageLabel, 0, 0);

        //Text fields allow for input boxes
        TextField age = new TextField("");
        GridPane.setConstraints(age, 1, 0);

        Label currentRS = new Label("What are your current retirement savings? ");
        GridPane.setConstraints(currentRS, 0, 1);

        TextField rsText = new TextField("");
        GridPane.setConstraints(rsText, 1, 1);

        Label contLabel = new Label("How much will you contribute to retirement per year? ");
        GridPane.setConstraints(contLabel, 0, 2);

        TextField contText = new TextField("");
        GridPane.setConstraints(contText, 1, 2);

        Label labelTarget = new Label("What is your target retirement savings? ");
        GridPane.setConstraints(labelTarget, 0, 3);

        TextField textTarget = new TextField("");
        GridPane.setConstraints(textTarget, 1, 3);

        GridPane.setConstraints(button, 1, 4);

        /* UNUSED Menu for saving & loading data
        A File Menu
        Menu fileMenu = new Menu("File");

        //Starts a new file
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> {System.out.println("Creating a new file...");
            window.setScene(scene);
        });

        //Menu's items
        fileMenu.getItems().add(newFile);
        fileMenu.getItems().add(new MenuItem("Old..."));
        fileMenu.getItems().add(new MenuItem("Save..."));

        //Menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);
        */
        grid.getChildren().addAll(ageLabel, age, currentRS, rsText, contLabel, contText, labelTarget, textTarget, button);

        //Creating tables columns
        TableColumn<Columns, Integer> ageCol = new TableColumn<>("Age");
        ageCol.setMaxWidth(70);
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));

        TableColumn<Columns, Integer> zero = new TableColumn<>("0%");
        zero.setMaxWidth(70);
        zero.setCellValueFactory(new PropertyValueFactory<>("zero"));

        TableColumn one = new TableColumn<>("1%");
        one.setMaxWidth(70);
        one.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("one"));

        TableColumn two = new TableColumn<>("2%");
        two.setMaxWidth(70);
        two.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("two"));

        TableColumn three = new TableColumn<>("3%");
        three.setMaxWidth(70);
        three.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("three"));

        TableColumn four = new TableColumn<>("4%");
        four.setMaxWidth(70);
        four.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("four"));

        TableColumn five = new TableColumn<>("5%");
        five.setMaxWidth(70);
        five.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("five"));

        TableColumn six = new TableColumn<>("6%");
        six.setMaxWidth(70);
        six.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("six"));

        TableColumn seven = new TableColumn<>("7%");
        seven.setMaxWidth(70);
        seven.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("seven"));

        TableColumn eight = new TableColumn<>("8%");
        eight.setMaxWidth(70);
        eight.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("eight"));

        TableColumn nine = new TableColumn<>("9%");
        nine.setMaxWidth(70);
        nine.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("nine"));

        TableColumn ten = new TableColumn<>("10%");
        ten.setMaxWidth(70);
        ten.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("ten"));

        TableColumn eleven = new TableColumn<>("11%");
        eleven.setMaxWidth(70);
        eleven.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("eleven"));

        TableColumn twelve = new TableColumn<>("12%");
        twelve.setMaxWidth(70);
        twelve.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("twelve"));

        TableColumn thirteen = new TableColumn<>("13%");
        thirteen.setMaxWidth(70);
        thirteen.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("thirteen"));

        TableColumn fourteen = new TableColumn<>("14%");
        fourteen.setMaxWidth(70);
        fourteen.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("fourteen"));

        TableColumn fifteen = new TableColumn<>("15%");
        fifteen.setMaxWidth(70);
        fifteen.setCellValueFactory(new PropertyValueFactory<Columns, Integer>("fifteen"));


        //Creating table, storing inside VBox
        table = new TableView<>();
        table.getColumns().addAll(ageCol, zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve,
                thirteen, fourteen, fifteen);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);
        scene2 = new Scene(vBox, 1200, 300);

        //Checking if everything is right
        //All input must be number and have minimum values
        button.setOnAction(e -> {

            if (isAge(age, age.getText()) && isRS(rsText, rsText.getText()) && isContribute(contText, contText.getText()) &&
                    isTarget(textTarget, textTarget.getText()) && isDigit(age.getText())
                    && isDigit(contText.getText())&& isDigit(rsText.getText()) && isDigit(textTarget.getText()) ) {

                int ourAge = Integer.parseInt(age.getText());
                int savings = Integer.parseInt(rsText.getText());;
                int contribute = Integer.parseInt(contText.getText());;
                int target = Integer.parseInt(textTarget.getText());;
                final int R_AGE = 72;

                //Creates all the data with observable lists
                ObservableList<Columns> data  = FXCollections.observableArrayList();

                //then in next row it will be the added contribution, + percent + something else

                //First I did the base value of every percent in first row, and starting age
                int ageMi = ourAge;
                int count = 0;
                int zeroo = savings;
                int onee = savings;
                int twoo = savings;
                int threee = savings;
                int fourr = savings;
                int fivee = savings;
                int sixx = savings;
                int sevenn = savings;
                int eightt = savings;
                int ninee = savings;
                int tenn = savings ;
                int elevenn = savings;
                int twelvee = savings;
                int thirteenn = savings;
                int fourteenn = savings;
                int fifteenn = savings;

                //Next add the data to the columns
                data.add(new Columns(ageMi, zeroo, onee, twoo, threee,
                        fourr, fivee, sixx,
                        sevenn, eightt, ninee, tenn,
                        elevenn, twelvee, thirteenn, fourteenn,
                        fifteenn));

                //Use one array, double array creates too many complications, length is retirement age - user's age
                Columns[] arr = new Columns[R_AGE - ourAge];

                //While the incrementer is less than arrays length increase all the row's values at arr[increment] 
                //Don't try to do this with age, we increment it too
                while(count < arr.length) {
                    ageMi += 1;
                    zeroo = (zeroo + contribute);
                    onee = (onee + contribute) * 101 / 100;
                    twoo = (twoo + contribute) * 102 / 100;
                    threee = (threee + contribute) * 103 / 100;
                    fourr = (fourr + contribute) * 104 / 100;
                    fivee = (fivee + contribute) * 105 / 100;
                    sixx = (sixx + contribute) * 106 / 100;
                    sevenn = (sevenn + contribute) * 107 / 100;
                    eightt = (eightt + contribute) * 108 / 100;
                    ninee = (ninee + contribute) * 109 / 100;
                    tenn = (tenn + contribute) * 110 / 100;
                    elevenn = (elevenn + contribute) * 111 / 100;
                    twelvee = (twelvee + contribute) * 112 / 100;
                    thirteenn = (thirteenn + contribute) * 113 / 100;
                    fourteenn = (fourteenn + contribute) * 114 / 100;
                    fifteenn = (fifteenn + contribute) * 115 / 100;

                    data.add(arr[count] = new Columns(ageMi, zeroo, onee, twoo, threee, fourr, fivee, sixx, sevenn,
                            eightt, ninee, tenn, elevenn, twelvee, thirteenn, fourteenn, fifteenn));
                    count++;
                }
                //This saving and loading feature gives too many exceptions

                /*String fileName = "data.bin";
                try {
                    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
                    os.writeObject(data);
                    os.close();
                } catch (FileNotFoundException x) {
                    x.printStackTrace();
                } catch (IOException x) {
                    x.printStackTrace();
                }

                try {
                    ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
                    Columns y = (Columns) is.readObject();
                    is.close();
                } catch (FileNotFoundException s) {
                    s.printStackTrace();
                } catch (IOException s) {
                    s.printStackTrace();
                } catch (ClassNotFoundException s) {
                    s.printStackTrace();
                }
                */

                table.setItems(data);
                window.setScene(scene2);
            }
        });
        scene = new Scene(grid, 600, 300);
        window.setScene(scene);
        window.show();
    }


    //Checks if all the characters are digits
    private boolean isDigit(String text)
    {
        Boolean digits = true;
        char ch;

        for(int i=0;i<text.length();i++)
        {
            ch = text.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                digits = false;
            }
        }
        return digits;
    }

    //Checks if user inputs the right age
    private boolean isAge(TextField input, String text) {
        Boolean check = true;

        try {
            int age = Integer.parseInt(input.getText());
        }
        catch (NumberFormatException e){
            {
                System.out.println("Only enter integers please!");
            }
        }

        int other = Integer.parseInt(input.getText());

        if (other > 72 || other < 0) {
            check = false;
            System.out.println("Please enter a valid age less than 72");
        }
        return check;
    }

    //Checks if user inputs the right retirement savings
    private boolean isRS(TextField input, String text) {
        Boolean check = true;

        try {
            int savings = Integer.parseInt(input.getText());
        }
        catch (NumberFormatException e){
            {
                System.out.println("Only enter integers please!");
            }
        }

        int other = Integer.parseInt(input.getText());

        if (other < 0) {
            check = false;
            System.out.println("Your current savings can not be less than 0");
        }
        return check;
    }

    //Checks if user inputs the right contribution
    private boolean isContribute(TextField input, String text) {
        Boolean check = true;

        try {
            int invest = Integer.parseInt(input.getText());
        }
        catch (NumberFormatException e){
            {
                System.out.println("Only enter integers please!");
            }
        }

        int other = Integer.parseInt(input.getText());

        if (other < 0) {
            check = false;
            System.out.println("Your yearly contribution can not be less than 0");
        }
        return check;
    }

    //Checks is user inputs the right target amount
    private boolean isTarget(TextField input, String text) {
        Boolean check = true;

        try {
            int target = Integer.parseInt(input.getText());
        }
        catch (NumberFormatException e){
            {
                System.out.println("Only enter integers please!");
            }
        }
        int other = Integer.parseInt(input.getText());

        if (other < 273600) {
            check = false;
            System.out.println("Please enter a target savings greater than the minimum ($273,600)");
        }
        return check;
    }
}