package main.java.controller;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DashboardWindow extends Stage {
    Stage primaryStage;
    GridPane grid = new GridPane();
    
    TrackingWindow trackingWindow;
    ShipmentWindow shipmentWindow;
    CustomerWindow customerWindow;
    LocationWindow locationWindow;

    public DashboardWindow(Stage stage) {
        super();
        this.primaryStage = stage;

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button trackingBtn = new Button("Tracking");
        Button createShipmentBtn = new Button("Create Shipment");
        Button locationManagement = new Button("Mangage Location");
        Button customerMangement = new Button("Manage Customer");
        
        int width = 150;
        
        trackingBtn.setPrefWidth(width);
        createShipmentBtn.setPrefWidth(width);
        locationManagement.setPrefWidth(width);
        customerMangement.setPrefWidth(width);
        
        trackingBtn.setOnAction((evt)->{
            trackingWindow = new TrackingWindow(stage);
            trackingWindow.show();
        });
        
        createShipmentBtn.setOnAction((evt)->{
            shipmentWindow = new ShipmentWindow(stage);
            shipmentWindow.show();
        });
        
        locationManagement.setOnAction((evt)->{
            locationWindow = new LocationWindow(stage);
            locationWindow.show();
        });
        
        customerMangement.setOnAction((evt)->{
            customerWindow = new CustomerWindow(stage);
            customerWindow.show();
        });

        grid.add(trackingBtn, 0, 0);
        grid.add(createShipmentBtn, 0, 1);
        grid.add(locationManagement, 0, 2);
        grid.add(customerMangement, 0, 3);

        Scene scene = new Scene(grid, 500, 300);
        setScene(scene);

    }

}
