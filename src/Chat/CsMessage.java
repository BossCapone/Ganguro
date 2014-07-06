/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chat;

import java.net.InetAddress;

/**
 * ******************************************************************************
 * 	@file: Message.java
 * 	@author: Stephen Virgil Jr.
 * 			(c) Ganguro Studios, 2014
 * 
 * 	@description: 
 * 		A message object for handling ChatScript protocol 
 * 		and sending messages to programs using CharScript from Java
 * 		supports message framework. 
 * 			* User address - the location of the user sending the message
 * 			* BotName - The bot addressed to receive the message
 * 			* Message - The message to be received  	 
 * 
 * 		ChatScript uses null terminates strings for its operation. Java strings
 * 		 are not null terminated which leads to protocol errors that cause runtime
 * 		 errors in the Java environment. 
 * 
 * 	TODO:
 * 		Implement out-of-band communications and data support
 * 		The out of band information encased in [ ] passed with the message, use for chatscript and abstract communication
 * *****************************************************************************
 */

public class CsMessage {
	// CsMessage class to handle and contain protocol1
	public static final char nullChar = (char) 0;
        String botAddr = "localhost";
        String userLogin;
        String botLogin;
        String messageTxt;
        int port = 1024;
        
        //Message vars for stream communication
        String userAddr;
	
	public CsMessage() {
            // Creates a empty messageTxt best used for local conversation initiation
                userLogin = "guest";
                botLogin = "";
                messageTxt = "";
                userAddr = getMyIp();
	}
	public CsMessage(String text) { 
            // Creates a messageTxt with a text body
		userLogin = "guest";
                botLogin = "";
                messageTxt = text;
                userAddr = getMyIp();
	} 
	public CsMessage(String Server, int Port, String UserId, String Botname, String Message) {
            // Creates a fully detailed messageTxt
            botAddr = Server;
            port = Port;
            userLogin = UserId;
            botLogin = Botname;
            messageTxt = Message;
            userAddr = getMyIp();
	}

        
        public static CsMessage ping() {
            // Returns a ping messageTxt
            return new CsMessage("localhost",1024,"","1","");
        }        

	public String getBotAddr() {
		return botAddr;
	}
        public int    getPort() {
            return port;
        }
        public String getUserLogin() {
            return userLogin+nullChar;
        }
        public String getBotLogin() {
            return botLogin+nullChar;
        }
        public String getMessageTxt() {
            return messageTxt+nullChar;
        }
        public String getUserAddr() {
            return userAddr;
        }
        private String getMyIp() {
            // Returns the ip address of the current userAddr
            String ipAddr ="";
            try {
                InetAddress ip = InetAddress.getLocalHost();
                ipAddr = ip.getHostAddress();
            } catch (Exception e) {
            }
            return ipAddr;
        }

	public void setBotAddr(String Id) {
		botAddr = Id;
	}
        public void setPort(int id) {
            port = id;
        }
        public void setUserLogin(String id) {
            userLogin = id;
        }
        public void setBotName(String id) {
            botLogin = id;
        }
        public void setMessageTxt(String txt) {
            messageTxt = txt;
        }

        @Override
	public String toString() {
		return  userLogin+nullChar +" "+
                        botLogin+nullChar +" "+
                        messageTxt+nullChar;
	}

}
