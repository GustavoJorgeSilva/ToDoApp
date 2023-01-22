/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToDoApp.controller;

import ToDoApp.model.Project;
import ToDoApp.util.Connectionfactory;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class ProjectController {

    public void save(Project project) throws SQLException {
        String sql = "INSERT INTO projects (name, description, createdAt, updatedAt)"
                + "VALUES (?,?,?,?)";

        Connection connection = null;

        PreparedStatement statement = null;

        try {
            //Estabelecendo comunicação
            connection = Connectionfactory.getConnection();
            //Preparando query
            statement = connection.prepareStatement(sql);
            //Setando valores na query
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));

            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("ERRO AO SALVAR PROJETO" , ex);

        } finally {
            Connectionfactory.closeConnection(connection, statement);
        }

    }

    public void update(Project project) {
        String sql = "UPDATE projects SET  name = ?, description = ?,createdAt = ?,updatedAt = ? WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            //Estabelecendo conexão com o banco de dados
            connection = Connectionfactory.getConnection();

            //Preparando query
            statement = connection.prepareStatement(sql);

            //Setando valores na query
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            //Executando a query 
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("ERRO AO ATUALIZAR PROJETO", ex);
        } finally {
            Connectionfactory.closeConnection(connection, statement);
        }

    }

    public void removeByID(int idProject) throws SQLException {
        String sql = "DELETE FROM projects WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Estabelecendo conexão
            connection = Connectionfactory.getConnection();

            //Preparando query
            statement = connection.prepareStatement(sql);

            //Setando valores na query
            statement.setInt(1, idProject);

            //Executando a query
            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("ERRO AO DELETAR PROJETO", ex);
        } finally {
            Connectionfactory.closeConnection(connection, statement);
        }
    }

    //METODO PARA TRAZER INFORMAÇÕES DO BANDO DE DADOS PARA O SISTEMA (filtro de busca)
    public List<Project> getAll() {

        String sql = "SELECT * FROM projects";

        List<Project> projects = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = Connectionfactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Project project = new Project();
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));

                //Adiciona o contato recuperado a lista de contatos
                projects.add(project);
            }

        } catch (SQLException ex) {
            throw  new RuntimeException("ERRO AO BUSCAR PROJETOS", ex);
        } finally {
            Connectionfactory.closeConnection(connection, statement, resultSet);
        }

        return projects;

    }

}
