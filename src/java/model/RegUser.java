/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author a
 */
public class RegUser {
    private String FirstName;
    private String Surname;
    private String Password;
    private String Confirmpass;
    private String Email;
    private String Username;
    
    public String getFirstName() {  
        return FirstName;  
    }  
    public void setFirstName(String FirstName) {  
        this.FirstName = FirstName;  
    }  
    public String getSurnamename() {  
        return Surname;  
    }  
    public void setSurnamename(String Surname) {  
        this.Surname = Surname;  
    } 
    public String getPassword() {  
        return Password;  
    }
    public void setPassword(String Password) {  
        this.Password = Password;  
    }
    public String getConfirmpass() {  
        return Confirmpass;  
    }
    public void setConfirmpass(String Confirmpass) {  
        this.Confirmpass = Confirmpass;  
    }
    public String getEmail() {  
        return Email;  
    }
    public void setEmail(String Email) {  
        this.Email = Email;  
    }
    public String getUsername() {  
        return Username;  
    }
    public void setUsername(String Username) {  
        this.Username = Username;  
    }
    


    public boolean validate(){  
        boolean passmatch=false;
        boolean legitname=false;
        boolean legitemail;
        boolean legitusername=false;
        boolean legitsurname=false;
        boolean legitpasslenght=false;
        
        if(Password.equals(Confirmpass)){ //passmatch confirmation
            passmatch = true;
        }
        
//         String emailPattern = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,4}";
//         Pattern emailp = Pattern.compile(emailPattern);
//         Matcher emailm = emailp.matcher(Email.trim());
//         legitemail = emailm.matches();
         legitemail =true;
         
         if(FirstName.length()>4){ //passmatch confirmation
            legitname = true;
        }
         
         if(Username.length()>4){ //passmatch confirmation
            legitusername = true;
        }
         
         if(Surname.length()>4){ //passmatch confirmation
            legitsurname = true;
        }
         
         if(FirstName.length()>4){ //passmatch confirmation
            legitpasslenght = true;
        }
//         String namePattern = ".{4,12}+$";
//         java.util.regex.Pattern namep = java.util.regex.Pattern.compile(namePattern);
//         java.util.regex.Matcher namem = namep.matcher(FirstName);
//         legitname = namem.matches();
         
//         String usernamePattern = ".{4,12}+$";
//         java.util.regex.Pattern usernamep = java.util.regex.Pattern.compile(usernamePattern);
//         java.util.regex.Matcher usernamem = usernamep.matcher(Username);
//         legitusername = usernamem.matches();
//         
//         String surnamePattern = ".{4,12}+$";
//         java.util.regex.Pattern surnamep = java.util.regex.Pattern.compile(surnamePattern);
//         java.util.regex.Matcher surnamem = surnamep.matcher(Surname);
//         legitsurname = surnamem.matches();
//         
//         String passlenghtPattern = ".{4,12}+$";
//         java.util.regex.Pattern passlenghtp = java.util.regex.Pattern.compile(passlenghtPattern);
//         java.util.regex.Matcher passlenghtm = passlenghtp.matcher(Password);
//         legitpasslenght = passlenghtm.matches();
        
        
        
        if((passmatch==true) && (legitname==true) && (legitemail==true) && (legitusername==true) && (legitsurname==true) && (legitpasslenght==true)){  
            return true;  
        }  
        else{  
            return false;  
        }  
    }
}
