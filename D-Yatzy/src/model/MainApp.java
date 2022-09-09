package model;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	private final Controller controller = new Controller();

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("Yatzy");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	// -------------------------------------------------------------------------

	// Shows the face values of the 5 dice.
	private final TextField[] txfValues = new TextField[5];
	// Shows the hold status of the 5 dice.
	private final CheckBox[] cbxHolds = new CheckBox[5];
	// Shows the obtained results.
	// For results not set yet, the possible result of
	// the actual face values of the 5 dice are shown.
	private final TextField[] txfResults = new TextField[15];
	// Shows points in sums, bonus and total.
	private final TextField txfSumSame = new TextField(), txfBonus = new TextField(), txfSumOther = new TextField(),
			txfTotal = new TextField();

//    private final Label lblRolled = new Label();
//    private final Button btnRoll = new Button(" Roll ");

	private void initContent(GridPane pane) {
		// pane.setGridLinesVisible(true);
		pane.setPadding(new Insets(10));
		pane.setHgap(5);
		pane.setVgap(5);

		// ---------------------------------------------------------------------

//		GridPane dicePane = new GridPane();
//		pane.add(dicePane, 0, 0);
//		// dicePane.setGridLinesVisible(true);
//		dicePane.setPadding(new Insets(10));
//		dicePane.setHgap(10);
//		dicePane.setVgap(10);
//		dicePane.setStyle("-fx-border-color: black");

		// add txfValues, chbHolds, lblRolled and btnRoll

		for (int i = 0; i < txfValues.length; i++) {
			TextField txf = new TextField();
			txfValues[i] = txf;
			pane.add(txf, i, 0);
			txf.setText("");
			txf.setMinSize(80, 80);
			txf.setMinWidth(10);

		}
		for (int i = 0; i < cbxHolds.length; i++) {
			CheckBox cbx = new CheckBox();
			cbxHolds[i] = cbx;
			pane.add(cbx, i, 2);
			cbx.setText("Hold?");
			cbx.setSelected(false);
		}

		Button btnRolled = new Button("Roll");
		pane.add(btnRolled, 4, 3);
		btnRolled.setMinSize(80, 80);
		btnRolled.setMinWidth(100);
		btnRolled.setOnAction(event -> controller.throwAction());

//		Label btnLabel = new Label("");
//		pane.add(btnLabel, 0, 0);

//		}

		// ---------------------------------------------------------------------

		GridPane scorePane = new GridPane();
		pane.add(scorePane, 0, 8);
		// scorePane.setGridLinesVisible(true);
		scorePane.setPadding(new Insets(10));
		scorePane.setVgap(5);
		scorePane.setHgap(10);
		scorePane.setStyle("-fx-border-color: black");
		int w = 50; // width of the text fields

		// add labels for results, add txfResults,

		String[] label = new String[] { "1-s", "2-s", "3-s", "4-s", "5-s", "6-s", "One Pair", "Two Pairs",
				"Three Of A Kind", "Four Of A Kind", "Full House", "Small Straight", "Large Straight", "Chance",
				"Yatzy" };

		for (int i = 0; i < label.length; i++) {
			Label lbl = new Label(label[i]);
			txfResults[i] = new TextField();
			if (i < 6) {
				scorePane.add(lbl, 0, i);
				scorePane.add(txfResults[i], 1, i);
			} else {
				scorePane.add(lbl, 0, i + 1);
				scorePane.add(txfResults[i], 1, i + 1);

			}
			txfResults[i].setOnMouseClicked(event -> controller.mouseClicked(event));

		}

		// add labels and text fields for sums, bonus and total.
		Label lblSum = new Label("Sum");
		pane.add(lblSum, 1, 8);
		pane.add(txfSumOther, 2, 8);
		Label lblBonus = new Label("Bonus");
		pane.add(lblBonus, 1, 9);
		pane.add(txfBonus, 2, 9);
		Label lblSum2 = new Label("Sum");
		pane.add(lblSum2, 1, 18);
		pane.add(txfSumSame, 2, 18);
		Label lblTotal = new Label("Total");
		pane.add(lblTotal, 1, 19);
		pane.add(txfTotal, 2, 19);

		// Mouse click ERROR?

	}

// -------------------------------------------------------------------------

	private class Controller {
		boolean[] holdUp = new boolean[15];

		private YatzyDice dice = new YatzyDice();

		public void throwAction() {

			boolean[] holds = new boolean[5];
			boolean firstRun = true;
			if (firstRun == true) {
				txfTotal.setText("0");
				txfSumSame.setText("0");
				firstRun = false;
			}
			if (dice.getThrowCount() == 3) {

				for (int i = 0; i < holds.length; i++) {
					holds[i] = true;

				}
				for (int i = 0; i < cbxHolds.length; i++) {
					cbxHolds[i].setSelected(false);
				}

			} else {
				for (int i = 0; i < cbxHolds.length; i++) {
					holds[i] = cbxHolds[i].isSelected();
				}

				dice.throwDice(holds);

				int[] values = dice.getValues();
				for (int i = 0; i < txfValues.length; i++) {
					txfValues[i].setText(values[i] + "");
				}
				int[] results = dice.getResults();
				for (int i = 0; i < txfResults.length; i++) {
					if (!holdUp[i]) {
						txfResults[i].setText(results[i] + "");
					}
				}
			}
		}

		public int calculateSumOther() {
			int sumOtherValue = 0;
			for (int i = 0; i < 6; i++) {
				if (holdUp[i] == true) {
					sumOtherValue = sumOtherValue + Integer.parseInt(txfResults[i].getText());
				}
			}
			if (sumOtherValue > 63) {
				txfBonus.setText("" + 50);
				return sumOtherValue + 50;
			}
			return sumOtherValue;
		}

		public int calculateSumSame() {
			int sumSameValue = 0;
			for (int i = 6; i < txfResults.length; i++) {
				if (holdUp[i] == true) {
					sumSameValue = sumSameValue + Integer.parseInt(txfResults[i].getText());
				}
			}
			return sumSameValue;
		}

		public int calculateTotal() {
			int sumOther = calculateSumOther();
			int sumSame = calculateSumSame();
			int total = sumOther + sumSame;

			return total;

		}

		// Create a method for btnRoll's action.
		// Hint: Create small helper methods to be used in the action method.

		// -------------------------------------------------------------------------

		// dose nothing right now

		private void mouseClicked(MouseEvent event) {
			TextField txf = (TextField) event.getSource();
			txf.setStyle("-fx-background-color:yellow");
			txf.getText();

			dice.resetThrowCount();

			for (int i = 0; i < holdUp.length; i++) {
				if (txf == txfResults[i]) {
					if (!holdUp[i]) {
						holdUp[i] = true;
						txfSumSame.setText(Integer.toString(calculateSumSame()));
						txfSumOther.setText(Integer.toString(calculateSumOther()));
						txfTotal.setText(Integer.toString(calculateTotal()));

					}

				}
			}

		}

	}

}

// Create a method for mouse click on one of the text fields in txfResults.
// Hint: Create small helper methods to be used in the mouse click method.
