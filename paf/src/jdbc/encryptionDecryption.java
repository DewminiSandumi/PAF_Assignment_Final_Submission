package jdbc;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class encryptionDecryption
 */
@WebServlet("/encryptionDecryption")
public class encryptionDecryption extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public static final String str = "abcdefghijklmnopqrstuvwxyzy_";
    public static String encrypt(String plaint, int key){
        plaint = plaint.toLowerCase();
        String cipher = "";
        for(int i=0; i<plaint.length();i++){
            int charpose = str.indexOf(plaint.charAt(i));
            int keyval = (charpose + key)% 26;
            char replaceval = str.charAt(keyval);
            cipher = cipher + replaceval;
        }
        return cipher;
    }
    
    
    public static String dencrypt(String cipher, int key){
        cipher = cipher.toLowerCase();
        String plaint = "";
        for(int i=0;i<cipher.length();i++){
            int charpose = str.indexOf(cipher.charAt(i));
            int keyval = (charpose - key)% 26;
            if(keyval<0){
                keyval = str.length() + keyval;
            }
            char replaceval = str.charAt(keyval);
            plaint = plaint + replaceval;
        }
        return plaint;
    }
    

    public encryptionDecryption() {
        super();
        // TODO Auto-generated constructor stub
    }

}
