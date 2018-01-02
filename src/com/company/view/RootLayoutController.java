package com.company.view;

import com.company.Main;
import com.company.model.Ekonomia;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class RootLayoutController{
    @FXML
    private TextArea consoleOutputTextArea;
    @FXML
    private AnchorPane AktywaPane;
    @FXML
    private AnchorPane RynekPane;
    @FXML
    private AnchorPane KupcyPane;
    @FXML
    private Console console;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public RootLayoutController() {
    }

    @FXML
    private void initialize() {
        makeConsolePrintSouts();
    }
    public void  setTabContents(Ekonomia eko)
    {
        initMyAnchors(AktywaPane,"view/Aktywa.fxml",eko);
        initMyAnchors(RynekPane,"view/Rynki.fxml",eko);
        initMyAnchors(KupcyPane,"view/Kupcy.fxml",eko);
    }
    /**
     * Loads content into tabs of RootLayout
     * @param pane AnchorPane that we want to fill with fxml file
     * @param loc location of fxml file we want to lad into Pane
     */
    private void initMyAnchors(AnchorPane pane, String loc,Ekonomia eko){

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource(loc));
        try {
            pane.getChildren().setAll((Node) loader.load());
        }
        catch(IOException e){
            System.out.println("Nie udało się załadować zawartści zakładek");
        }
        ProtoController controller = loader.getController();
        controller.setEkonomia(eko);
        controller.wypelnijTabelka();
    }



    /**
     * Sets sout to TextArea in Application Window
     */
    private void makeConsolePrintSouts(){

        console =  new Console(consoleOutputTextArea);
        PrintStream ps = new PrintStream(console, true);
        System.setOut(ps);
        System.setErr(ps);

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
}
