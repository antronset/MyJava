package EducationalGame;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

import java.util.Random;

public class GraphicalInterface extends Application {

    Label question;
    Label response;
    BackEnd be = new BackEnd();
    int buttomWithRightAnswer = 0;
    int counter = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Игра");
        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 1500, 500);
        primaryStage.setScene(myScene);

        question = new Label("Определение интерфейса - " + be.getRandomQuestion());
        question.setAlignment(Pos.TOP_CENTER);
        response = new Label();
        response.setAlignment(Pos.BASELINE_CENTER);

        Random rd = new Random(System.currentTimeMillis());

        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button next = new Button("Далее");

        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        String check;

        switch (rd.nextInt(3)) {
            case 0:
                check = be.getRightAnswer();
                buttomWithRightAnswer = 0;
                btn1 = new Button(check);
                btn2 = new Button(be.getRandomAnswers());
                btn3 = new Button(be.getRandomAnswers());
                btn4 = new Button(be.getRandomAnswers());
                break;
            case 1:
                check = be.getRightAnswer();
                buttomWithRightAnswer = 1;
                btn1 = new Button(be.getRandomAnswers());
                btn2 = new Button(check);
                btn3 = new Button(be.getRandomAnswers());
                btn4 = new Button(be.getRandomAnswers());
                break;
            case 2:
                check = be.getRightAnswer();
                buttomWithRightAnswer = 2;
                btn1 = new Button(be.getRandomAnswers());
                btn2 = new Button(be.getRandomAnswers());
                btn3 = new Button(check);
                btn4 = new Button(be.getRandomAnswers());
                break;
            case 3:
                check = be.getRightAnswer();
                buttomWithRightAnswer = 3;
                btn1 = new Button(be.getRandomAnswers());
                btn2 = new Button(be.getRandomAnswers());
                btn3 = new Button(be.getRandomAnswers());
                btn4 = new Button(check);
                break;
        }

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                counter++;
                if (buttomWithRightAnswer == 0) response.setText("Верно");
                else response.setText("Ошибка");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                counter++;
                if (buttomWithRightAnswer == 1) response.setText("Верно");
                else response.setText("Ошибка");
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                counter++;
                if (buttomWithRightAnswer == 2) response.setText("Верно");
                else response.setText("Ошибка");
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                counter++;
                if (buttomWithRightAnswer == 3) response.setText("Верно");
                else response.setText("Ошибка");
            }
        });

        rootNode.getChildren().addAll(question, response, btn1, btn2, btn3, btn4, next);
        primaryStage.show();
    }
}
