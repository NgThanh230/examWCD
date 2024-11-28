package com.example.exam.controllers;


import com.example.exam.dao.IndexerDAO;
import com.example.exam.dao.playerDAO;
import com.example.exam.entity.indexer;
import com.example.exam.entity.player;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/player")
public class playerController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<player> players = playerDAO.all();
        List<indexer> indexers = indexerDAO.all();
        request.setAttribute("indexers", indexers);
        request.setAttribute("players", players);
        request.getRequestDispatcher("player/list.jsp").forward(request, response);
    }
}
