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
import model.RegUser;

/**
 *
 * @author a
 */
@WebServlet(name = "SignUpVerification", urlPatterns = {"/SignUpVerification"})
public class SignUpVerificationControllerServlet extends HttpServlet {
 @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            String name=request.getParameter("suname");  
            String password=request.getParameter("supassword"); 
            String confpassword=request.getParameter("supasswordconfirmation:");
            String email=request.getParameter("suemail:");
            String username=request.getParameter("suusername");
            String surname=request.getParameter("susurname");
              
            RegUser bean=new RegUser();  
            bean.setEmail(email);
            bean.setFirstName(name);
            bean.setConfirmpass(confpassword);
            bean.setSurnamename(surname);
            bean.setUsername(username);
            bean.setPassword(password);  
            request.setAttribute("bean",bean);  
              
            boolean status=bean.validate();
              
            if(status){  
                RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/registrationSuccess.jsp");  
                rd.forward(request, response);  
            }  
            else{  
                RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/LoginFailed.jsp");  
                rd.forward(request, response);  
            }  
          
        }  
      
        @Override  
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
                throws ServletException, IOException {  
            doPost(req, resp);  
        }  
    }  