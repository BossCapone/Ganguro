/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CMAS;

import java.awt.Image;

/**
 *
 * @author Eric
 */

public class Contact {
    // Account 
    //  Username
    //  password
    Account account[];
    
    Image picture;
    Name name;
    Name ailias[];
    PhoneNumber phone[];
    String email[];
    Event event[];
    String url[];
    PhysicalAddress address[];
    Relationship relationship[];
    Organization orgizanization[];
    
    
    
    
    String presetNumber[] = {
        "main"
            + "mobile"
            + "work"
            + "home"
            + "temp"
    };
    String presetAddress[] = {
       "Home"
           + "Work"
    };
    String presetURL[] = {
        "Profile"
            + "Home Page"
            + "Work"
            + "Blog"
    };
    String presetRelationship[] = {
        "Friend"
            + "Spouse"
            + "Child"
            + "Mother"
            + "Father"
            + "Parent"
            + "Brother"
            + "Sister"
            + "Relative"
            + "Manager"
            + "Assistant" 
            + "Referred by"
            + "Partner"
            + "Domestic Partner"
    };
    String presetEmail[] = {
        "Main"
            + "Work"
            + "Home"
            + ""
    };

    
    
    // Constructors
    // default contact
    // contact from any information
    
    public Contact() {
    }
    
 
    
    
}
