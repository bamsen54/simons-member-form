package com.simon.simonsmemberform;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void show( String title, String... messages ) {

        Stage stage = new Stage();
        stage.setTitle( title );
        stage.setResizable( false );
        stage.initModality( Modality.APPLICATION_MODAL );

        VBox root = new VBox(10);
        root.setStyle( "-fx-background-color: #404142;" );

        for( String message : messages ) {
            final Label label = new Label( message );
            label.setStyle( "-fx-font-size: 28px; -fx-text-fill: white" );

            root.getChildren().add( label );
        }

        Scene scene = new Scene( root, 500, 500 );
        stage.setScene( scene );
        stage.showAndWait();
    }
}
