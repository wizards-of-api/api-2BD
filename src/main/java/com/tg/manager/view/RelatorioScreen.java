package com.tg.manager.view;


import com.tg.manager.model.DisplayTableModel;
import com.tg.manager.model.TGModel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RelatorioScreen extends Application {
    public  static DisplayTableModel display1;
    public RelatorioScreen(){}

    public RelatorioScreen(DisplayTableModel display1) {
        this.display1 = display1;
        }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String relatorio;
        String qualRelatorio = TGModel.getModelTg(ButtonCell.getDisplayModel1().getStudent().getId());
        if (qualRelatorio.contains("Científico")){
            relatorio = "RelatorioCientifico.fxml";
        }
        
        else if (qualRelatorio.contains("Estágio")){
            relatorio = "RelatorioEstagioTecnico.fxml";
        }
        
        else if(qualRelatorio.contains("Disciplina")){
            relatorio = "RelatorioTecnicoDisciplina.fxml";
        }
        
        else{
            relatorio = "RelatorioPortfolio.fxml";
        }
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(relatorio)); 
        Parent root = fxmlLoader.load();
        Scene tela1 = new Scene(root);

        primaryStage.setScene(tela1);
        primaryStage.setResizable(false);
        primaryStage.show();


    }
}
