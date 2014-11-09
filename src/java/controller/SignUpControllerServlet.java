/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a
 */
@WebServlet(name = "SignUpControllerServlet", urlPatterns = {"/SignUp"})
public class SignUpControllerServlet extends HttpServlet {
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
            
            
            
                RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/sign_Up.jsp");  
                rd.forward(request, response);  
           
          
        }  
      
        @Override  
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
                throws ServletException, IOException {  
            doPost(req, resp);  
        }  
   }  

