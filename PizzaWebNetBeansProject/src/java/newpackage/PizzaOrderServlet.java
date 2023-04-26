package newpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpSession;

/*
    Takes in 3 parameters from OrderMenu.jsp
    Finds username, pizza_name and size.
    Using value from size, it will determine the price of the pizza
    With these 4 variabes, a new Pizza class is created and savePizza()
    from PizzaDB is called to save the pizza into ordercart database.
*/

public class PizzaOrderServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PizzaOrderServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String username = request.getParameter("username");
            String pizza_name = request.getParameter("pizzaname");
            String size = request.getParameter("choosesize");
            
            int price = 0;
            if(size.equals("Small")) {
                price = 15;
            }
            if(size.equals("Medium")) {
                price= 20;
            }
            if(size.equals("Large")) {
                price = 30;
            }
            
            Pizza tempPizza = new Pizza(username,pizza_name,size,price);
            PizzaDB saveOrder = new PizzaDB(ConnectionDB.getConnection());
            
            if(saveOrder.savePizza(tempPizza)) {
                 response.sendRedirect("Response.jsp");
            }
            else {
                String errorMessage = "user Found";
                HttpSession regSession =request.getSession();
                regSession.setAttribute("RegError", errorMessage);
                out.println("Error adding order");
            }
   
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
