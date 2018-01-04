package com.company.view;

import com.company.Main;
import com.company.view.Zakladki.ProtoTabController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RootLayoutController{
    @FXML
    private TextArea consoleOutputTextArea;
    @FXML
    private AnchorPane AktywaPane;
    @FXML
    private AnchorPane RynekPane;

    public TextArea getConsoleOutputTextArea() {
        return consoleOutputTextArea;
    }

    @FXML
    private AnchorPane KupcyPane;
    @FXML
    private Console console;

    Main main;
    private Stage dialogStage;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public RootLayoutController() {

    }

    @FXML
    private void initialize() {

    }

    public void  setTabContents()
    {
        initMyAnchors(AktywaPane,"Zakladki/Aktywa.fxml");
        initMyAnchors(RynekPane,"Zakladki/Rynki.fxml");
        initMyAnchors(KupcyPane,"Zakladki/Kupcy.fxml");
    }
    /**
     * Loads content into tabs of RootLayout
     * @param pane AnchorPane that we want to fill with fxml file
     * @param loc location of fxml file we want to lad into Pane
     */
    private void initMyAnchors(AnchorPane pane, String loc){

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(RootLayoutController.class.getResource(loc));
        try {
            pane.getChildren().setAll((Node) loader.load());
        }
        catch(IOException e){
            System.out.println("Nie udało się załadować zawartści zakładek");
        }
        ProtoTabController controller = loader.getController();
        controller.setEkonomia(main.getEkonomia());
        controller.wypelnijTabelka();
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    /**
     * Needed to set console output to TextArea
     */
    public static class Console extends OutputStream {

        private TextArea output;
        public Console(TextArea ta) {
            this.output = ta;
            this.output.setEditable(false);
        }

        @Override
        public void write(int i) throws IOException {
            output.appendText(String.valueOf((char) i));
        }
    }

    public void setMainApp(Main main) {
        this.main = main;
        setTabContents();
    }

    @FXML
    private void handleDodaj() {
        boolean okClicked = main.showPanelDodawania();
    }
}
