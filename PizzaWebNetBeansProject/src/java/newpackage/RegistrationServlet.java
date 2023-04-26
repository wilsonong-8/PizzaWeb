package newpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpSession;

/*
    Takes in 7 parameters from Registration.jsp and create a Customer class.
    saveCustomer() is called from CustomerDB to save the details of the customer
    onto the customer database.
    Redirects to index.jsp if successful.
    Else will print Error in Registration.
*/

public class RegistrationServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            // fetch data from the customer registration form
            //use the form textbox name inside getParameter
            
            String username = request.getParameter("user");
            String password = request.getParameter("pass");
            String firstname = request.getParameter("first");
            String lastname = request.getParameter("last");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            String country = request.getParameter("country");
            
            //creat user object
            Customer customerModel = new Customer(username, password, firstname, lastname, email, address, country);
            CustomerDB regUser = new CustomerDB(ConnectionDB.getConnection());
            if(regUser.saveCustomer(customerModel))
            {
                response.sendRedirect("index.jsp");
            }
            else
            {
                String errorMessage = "user Found";
                HttpSession regSession =request.getSession();
                regSession.setAttribute("RegError", errorMessage);
                out.println("Error in Registration");
                
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
