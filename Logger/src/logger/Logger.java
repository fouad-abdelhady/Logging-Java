/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;



/**
 *
 * @author Fouad
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Logging obj = new Logging();
       
       obj.getAppender().adjustWARNING_LEVEL(Logging.INFO);
       
       obj.getAppender().setLOG_LEVEL(Appender.WARNING_LEVEL);
       
       obj.log(Logging.INFO, "Hello");
    }
    
}
