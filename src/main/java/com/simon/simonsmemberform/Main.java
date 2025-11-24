package com.simon.simonsmemberform;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    final int gridGap = 10;

    @Override
    public void start(Stage primaryStage) throws RuntimeException {

        GridPane root = new GridPane();
        root.setId( "root" );
        root.setPadding( new Insets( 10, 0, 0, 25 ));

        root.setHgap( gridGap );
        root.setVgap( gridGap );
        root.getStylesheets().add( getClass().getResource("style.css").toExternalForm() );

        Label firstNameLabel    = new Label( "Förnamn" );
        Label lastNameLabel     = new Label( "Efternamn" );
        Label phoneNumberLabel  = new Label( "Telefonnummer " );
        Label addressLabel      = new Label( "Adress " );

        firstNameLabel.getStyleClass().add( "descriptions" );
        lastNameLabel.getStyleClass().add( "descriptions" );
        phoneNumberLabel.getStyleClass().add( "descriptions" );
        addressLabel.getStyleClass().add( "descriptions" );

        TextField firstNameField = new TextField( );
        TextField lastNameField = new TextField();
        TextField phoneNumberField = new TextField();
        TextField addressField = new TextField();

        firstNameField.setPrefWidth( 450 );
        lastNameField.setPrefWidth( 450 );
        phoneNumberField.setPrefWidth( 450 );
        addressField.setPrefWidth( 450 );

        firstNameField.getStyleClass().add( "input-field" );
        lastNameField.getStyleClass().add( "input-field" );
        phoneNumberField.getStyleClass().add( "input-field" );
        addressField.getStyleClass().add( "input-field" );

        Button saveMemberButton = new Button( "Spara medlem" );
        saveMemberButton.setId( "save" );

        root.add( firstNameLabel, 0, 0 );
        root.add( firstNameField, 1, 0 );
        root.add( lastNameLabel, 0, 1 );
        root.add( lastNameField, 1, 1 );
        root.add( phoneNumberLabel, 0, 2 );
        root.add( phoneNumberField, 1, 2 );
        root.add( addressLabel, 0, 3 );
        root.add( addressField, 1, 3 );
        root.add( saveMemberButton, 0, 4 );

        Scene primaryScene = new Scene( root, 800,600 );

        primaryStage.setScene( primaryScene );
        primaryStage.setTitle( "Simons medlemsformulär" );
        primaryStage.setResizable( false );
        primaryStage.show();

        saveMemberButton.setOnAction( e -> {

            final String firstName   = firstNameField.getText();
            final String lastName    = lastNameField.getText();
            final String phoneNumber = phoneNumberField.getText();
            final String address     = addressField.getText();

            AlertBox.show( "sparad medlem", firstName, lastName, phoneNumber, address );

        } );
    }
}
