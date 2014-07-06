/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CMAS;

/**
 *
 * @author Eric
 */
public class Name {
    private String prefix = "";
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private String suffix = "";

    public Name() {
    }

    public String getPrefix() {
        return prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }
   
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    @Override
    public String toString() {
        return prefix+" "+firstName+" "+middleName+" "+lastName+" "+suffix;
    }
    
}
