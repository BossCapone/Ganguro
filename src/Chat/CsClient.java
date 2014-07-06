/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


/**
 * Simple userAddr class to communicate with the ChatScript botAddr.
 * 
 * @author Eric
 */
public class CsClient {
    /**
     * 
     * 
     * @param server chat script botAddr hostname/ip
     * @param port chat script botAddr listen port
     * @param userId user name as whom to connect to in chat (typically required except when running a 'ping') 
     * @param botname can be null (not ""), will use default bot id if so
     * @param message to send to the chat botAddr, will be null only for initial messageTxt from a userAddr
     * @return response from the chat botAddr
     * @throws IOException on communication failure
     */
    public static final char nullChar = (char) 0;
   
    // custom log for output
    private static void log(String txt) {
        System.out.println("[chatclient] ["+txt+"]");
    }
    
    // Preforms a single transaction, send a messageTxt and receive a response.
    public static String sendMessage(String server, int port, String userId, String botname, String message) {
        /*
            Send and recieve a messageTxt to ChatScript using Strings
                Protocol is:
                userLogin, botLogin, messageTxt // all being null terminated (nullChar)
        */
        log("sending text message");
        try { // Append null termination to the protocol elements if they exist:
            userId = userId+nullChar;
            botname = botname+nullChar;
            message = message+nullChar;

            //Create the conection and send the messageTxt
            Socket chatSocket = new Socket(server,port);
            PrintWriter out = new PrintWriter( chatSocket.getOutputStream(), true);
            out.println(userId+botname+message);

            //Recieve the input and close the connection
            BufferedReader in= new BufferedReader( new InputStreamReader(chatSocket.getInputStream()));
            String response = in.readLine();
            chatSocket.close();

            // Return the recieved messageTxt
            return response;
        } catch (IOException e) {
        }
       return null;
    }
    public static String sendMessage(CsMessage msg) {
         /*
            Send and recieve a messageTxt to ChatScript using the CsMessage object
                Protocol is:
                userLogin, botLogin, messageTxt // all being null terminated (nullChar)
        */
        return sendMessage(msg.botAddr, msg.port, msg.userLogin, msg.botLogin, msg.messageTxt);
    }
    
    // This function will invoke a chat messageTxt as if the bot was the first to speak or initiate a conversation.
    public static String invokeChat() {
        log("invoking chat");
        return sendMessage( new CsMessage() );
    }
    public static String invokeChat(String bot) {
        log("invoking chat with "+bot);
        CsMessage msg = new CsMessage();
        msg.setBotName(bot);
        return sendMessage(msg);
    }
    
    // This function will invoke a chat messageTxt at later time measured in seconds
    // TODO:
    // the current implementation uses thread.sleep which freezes the program.
    // convert the method to use an independent timer 
    public static String delayInvokeChat(int seconds) {
        log("invoking chat in "+ seconds +" seconds");
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException ex) {
            log(ex.toString());
        }
        return invokeChat();
    }
    public static String delayInvokeChat(int seconds, String bot) {
        log("invoking chat with "+bot+ " in "+ seconds +" seconds");
               seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException ex) {
            log(ex.toString());
        }
        return invokeChat(bot);
    }

}
