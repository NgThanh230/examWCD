package com.example.exam.dao;

import com.example.exam.database.Database;
import com.example.exam.entity.player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class playerDAO  {

    public List<player> all() {
        String sql = "SELECT * FROM classes";
        ArrayList<player> list = new ArrayList<>();
        try (Connection conn = Database.createInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()){
            while (rs.next()){
                list.add(new player(
                        rs.getInt("player_id"),
                        rs.getInt("indexid"),
                        rs.getString("name"),
                        rs.getInt("age")
                ));
            }
        }catch (Exception e){

        }
        return list;
    }


    public void createPlayer(String name, String fullName, String age, int indexId) throws SQLException {
        String sql = "INSERT INTO player (name, full_name, age, index_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, fullName);
            stmt.setString(3, age);
            stmt.setInt(4, indexId);
            stmt.executeUpdate();
        }
    }
    public List<player> getPlayersByIndex(int indexId) throws SQLException {
        String sql = "SELECT * FROM player WHERE index_id = ?";
        List<player> players = new ArrayList<>();

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, indexId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                player player = new player(
                        rs.getInt("player_id"),
                        rs.getInt("indexid"),
                        rs.getInt("age"),
                        rs.getString("name")
                );
                players.add(player);
            }
        }
        return players;
    }


}
