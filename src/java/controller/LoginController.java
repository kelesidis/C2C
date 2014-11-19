    package controller;  
import ConnectionMock.ConnMock;
    import model.LoginUserModel;
    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.RequestDispatcher;  
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    public class LoginController extends HttpServlet {  
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            String name=request.getParameter("name");  
            String password=request.getParameter("password");  
              
            LoginUserModel LUM=new LoginUserModel();  
            LUM.setName(name);  
            LUM.setPassword(password);  
            request.setAttribute("bean",LUM);  
            
            ConnMock DBconnMock = new ConnMock();
            boolean Namestatus = LUM.validateName(DBconnMock);
            boolean Passstatus = LUM.validatePass(DBconnMock);
              
            if(Namestatus){ 
                if(Passstatus){
                    RequestDispatcher rd=request.getRequestDispatcher("/Pages/Login/login-success.jsp");  
                    rd.forward(request, response);  
                }
                else{
                    RequestDispatcher rd=request.getRequestDispatcher("/Pages/Login/WrongPass.jsp");  
                    rd.forward(request, response);
                }
            }  
            else{ 
                if(Passstatus){
                    RequestDispatcher rd=request.getRequestDispatcher("/Pages/Login/WrongName.jsp");  
                    rd.forward(request, response);  
                }
                else{
                    RequestDispatcher rd=request.getRequestDispatcher("/Pages/Login/WrongName.jsp");  
                    rd.forward(request, response);
                }
            }  
          
        }  
      
        @Override  
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
                throws ServletException, IOException {  
            doPost(req, resp);  
        }  
    }  