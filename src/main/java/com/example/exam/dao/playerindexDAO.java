package com.example.exam.dao;

import com.example.exam.database.Database;
import com.example.exam.entity.playerindex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class playerindexDAO implements DAOinterface<playerindex> {
    @Override
    public List<playerindex> all() {
        List<playerindex> playerIndexes = new ArrayList<>();
        String sql = "SELECT * FROM player_index WHERE player_id = ?";
        try (Connection conn = Database.createInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            int playerId = 0;
            stmt.setInt(1, playerId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    playerindex playerIndex = new playerindex();
                    playerIndex.setId(rs.getInt("id"));
                    playerIndex.setPlayerid(rs.getInt("player_id"));
                    playerIndex.setIndexid(rs.getInt("index_id"));
                    playerIndex.setValue(rs.getFloat("value"));
                    playerIndexes.add(playerIndex);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return List.of();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean create(playerindex playerindex) {
        return false;
    }

    @Override
    public boolean update(playerindex playerindex) {
        return false;
    }

    @Override
    public boolean delete(playerindex playerindex) {
        return false;
    }

    @Override
    public <K> playerindex find(K id) {
        return null;
    }
}

