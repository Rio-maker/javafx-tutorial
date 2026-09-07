import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class DialogBox extends HBox {
    private Label text;
    private ImageView displayPicture;

    public DialogBox(String s, Image i) {
        text = new Label(s);

        displayPicture = new ImageView(i);
        displayPicture.setFitWidth(100);
        displayPicture.setFitHeight(100);
        displayPicture.setPreserveRatio(true);

        this.setSpacing(10);
        this.setAlignment(Pos.TOP_RIGHT);
        this.setMaxWidth(Double.MAX_VALUE);

        this.getChildren().addAll(text, displayPicture);
    }

    /**
     * Flips the dialog box so the image is on the left and text is on the right.
     */
    private void flip() {
        this.setAlignment(Pos.TOP_LEFT);
        ObservableList<Node> items = FXCollections.observableArrayList(this.getChildren());
        FXCollections.reverse(items);
        this.getChildren().setAll(items);
    }

    public static DialogBox getUserDialog(String s, Image i) {
        return new DialogBox(s, i);
    }

    public static DialogBox getDukeDialog(String s, Image i) {
        DialogBox dialogBox = new DialogBox(s, i);
        dialogBox.flip();
        return dialogBox;
    }
}
