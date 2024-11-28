package com.example.exam.dao;

import com.example.exam.database.Database;
import com.example.exam.entity.indexer;
import com.example.exam.entity.player;
import org.jboss.jandex.Indexer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IndexerDAO  {

    public List<indexer> getAllIndexers() throws SQLException {
        String sql = "SELECT * FROM indexer";
        List<indexer> indexers = new ArrayList<>();

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                indexer indexer = new indexer(
                        rs.getInt("index_id"),
                        rs.getString("name"),
                        rs.getInt("valueMin"),
                        rs.getInt("valueMax")
                );
                indexers.add(indexer);
            }
        }
        return indexers;
    }


    public boolean create(indexer indexer) {

        return false;
    }


    public void updateIndexer(int indexId, String name, float valueMin, float valueMax) throws SQLException {
        String sql = "UPDATE indexer SET name = ?, valueMin = ?, valueMax = ? WHERE index_id = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setFloat(2, valueMin);
            stmt.setFloat(3, valueMax);
            stmt.setInt(4, indexId);
            stmt.executeUpdate();
        }
    }


    public boolean delete(indexer indexer) {
        return false;
    }

}
