package application;
import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Controller implements Initializable {

	@FXML
	private AnchorPane pane1;

	@FXML
	private AnchorPane pane2;

	@FXML
	private AnchorPane pane3;
	
	@FXML
	private AnchorPane pane4;
	
	@FXML
	private AnchorPane pane5;
	
	@FXML
	private AnchorPane pane6;
	
	@FXML
	private AnchorPane pane7;
	
	@FXML
	private AnchorPane pane8;

    @FXML
    private JFXButton btnAdelante;

    @FXML
    private JFXButton btnAtras;

    @FXML
    private Label countLabel;

    @FXML
    private JFXButton btnSalir;

	public void translateAnimation(double duration, Node node, double byX) {

		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(duration), node);
		translateTransition.setByX(byX);
		translateTransition.play();

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		translateAnimation(0.5, pane2, 600);
		translateAnimation(0.5, pane3, 600);
		translateAnimation(0.5, pane4, 600);
		translateAnimation(0.5, pane5, 600);
		translateAnimation(0.5, pane6, 600);
		translateAnimation(0.5, pane7, 600);
		translateAnimation(0.5, pane8, 600);
	}

	int showSlide = 0;

	@FXML
	void nextAction(ActionEvent event) {

		if (showSlide == 0) {
			translateAnimation(0.5, pane2, -600);
			showSlide++; // showSlide=1
			countLabel.setText("2/8");
			btnAtras.setVisible(true);
		} else if (showSlide == 1) {
			translateAnimation(0.5, pane3, -600);
			showSlide++; // showSlide=2
			countLabel.setText("3/8");
		}else if (showSlide == 2) {
			translateAnimation(0.5, pane4, -600);
			showSlide++; // showSlide=3
			countLabel.setText("4/8");
		}else if (showSlide == 3) {
			translateAnimation(0.5, pane5, -600);
			showSlide++; // showSlide=4
			countLabel.setText("5/8");
		}else if (showSlide == 4) {
			translateAnimation(0.5, pane6, -600);
			showSlide++; // showSlide=5
			countLabel.setText("6/8");
		}else if (showSlide == 5) {
			translateAnimation(0.5, pane7, -600);
			showSlide++; // showSlide=6
			countLabel.setText("7/8");
		}else if (showSlide == 6) {
			translateAnimation(0.5, pane8, -600);
			showSlide++; // showSlide=7
			countLabel.setText("8/8");
			btnAdelante.setVisible(false);
		}
	}

	@FXML
	void backAction(ActionEvent event) {

		if (showSlide == 1) {
			translateAnimation(0.5, pane2, 600);
			showSlide--; 
			countLabel.setText("1/8");
			btnAtras.setVisible(false);
		} else if (showSlide == 2) {
			translateAnimation(0.5, pane3, 600);
			showSlide--;
			countLabel.setText("2/8");
		}else if (showSlide == 3) {
			translateAnimation(0.5, pane4, 600);
			showSlide--; 
			countLabel.setText("3/8");
			
		}else if (showSlide == 4) {
			translateAnimation(0.5, pane5, 600);
			showSlide--; 
			countLabel.setText("4/8");
			
		}else if (showSlide == 5) {
			translateAnimation(0.5, pane6, 600);
			showSlide--; 
			countLabel.setText("5/8");
			
		}else if (showSlide == 6) {
			translateAnimation(0.5, pane7, 600);
			showSlide--; 
			countLabel.setText("6/8");
			
		}else if (showSlide == 7) {
			translateAnimation(0.5, pane8, 600);
			showSlide--; 
			countLabel.setText("7/8");
			btnAdelante.setVisible(true);
		}
	}
	
	@FXML
	void salir() {
		Platform.exit();
		/*Stage thisStage = (Stage) btnSalir.getScene().getWindow();
    	thisStage.close();*/
	}
}
