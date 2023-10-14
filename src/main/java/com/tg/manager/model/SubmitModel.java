package com.tg.manager.model;

import com.tg.manager.model.connection.ConnectionDataBase;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.HashMap;

public class SubmitModel {
    private Integer id;
    private String description;
    private Date initialDate;
    private Date finalDate; 

    public void addSubmit(String description, Date initialDate, Date finalDate) {

        try {
            ConnectionDataBase connectionDb = new ConnectionDataBase();
            Connection connection = connectionDb.getConexao();
            String insercaoSQL = "INSERT INTO entrega (descricao, data_inicial, data_final) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insercaoSQL);
            preparedStatement.setString(1, description);
            preparedStatement.setDate(2, initialDate);
            preparedStatement.setDate(3, finalDate);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public SubmitModel(Integer id, String description, Date initialDate, Date finalDate) {
        this.id = id;
        this.description = description;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }

    public void getSubmit() throws SQLException {
        try {    
            ConnectionDataBase connectionDb = new ConnectionDataBase();
            Connection connection = connectionDb.getConexao();
            Statement statementDb = connection.createStatement();
            ResultSet result = statementDb.executeQuery("SELECT * from entrega");

            while (result.next()) {
                HashMap<Integer, SubmitModel> informationList = new HashMap<Integer, SubmitModel>();
                Integer idSubmit = result.getInt("id");
                String descricao = result.getString("descricao");
                Date dataInicial = result.getDate("initialDate");
                Date dataFinal = result.getDate("finalDate");
                SubmitModel sm = new SubmitModel(id, description, initialDate, finalDate);
                informationList.put(id, sm);         
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}