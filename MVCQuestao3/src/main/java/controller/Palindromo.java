package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Palavra;

@WebServlet("/Palindromo")
public class Palindromo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String palavra1 = request.getParameter("palavra1");
        String palavra2 = request.getParameter("palavra2");
        
        Palavra p1 = new Palavra(palavra1);
        Palavra p2 = new Palavra(palavra2);
        
        PrintWriter writer = response.getWriter();
        
        writer.append(" <HTML>  <BODY> ");
        writer.append("Palavra 1: " + p1.getPalavra());
        writer.append("<br>Palavra 2: " + p2.getPalavra());
      if (p1.verificarPalindroma()) {
    	  writer.append("<br>A palavra " + p1.getPalavra() + " é um palíndromo.");
      } else {
    	  writer.append("<br>A palavra " + p1.getPalavra() + " não é um palíndromo.");
      }
      if (p2.verificarPalindroma()) {
    	  writer.append("<br>A palavra " + p2.getPalavra() + " é um palíndromo.");
      } else {
    	  writer.append("<br>A palavra " + p2.getPalavra() + " não é um palíndromo.");
      }
  	writer.append("</BODY>  </HTML>");
	}
}
