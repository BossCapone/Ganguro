/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CMAS;

import java.util.logging.Logger;

/**
 *
 * @author Eric
 */
public class PhysicalAddress {
public String label,
            Street,
            POBox,
            Neighborhood,
            City,
            State,
            Country,
            ZIP;

    
    
    public PhysicalAddress() {
        this.label = "";
        this.Street = "";
        this.POBox = "";
        this.Neighborhood = "";
        this.City = "";
        this.State = "";
        this.Country = "";
        this.ZIP = "";
    }  
    public PhysicalAddress(String label, String Street, String POBox, String Neighborhood, String City, String State, String Country, String ZIP) {
        this.label = label;
        this.Street = Street;
        this.POBox = POBox;
        this.Neighborhood = Neighborhood;
        this.City = City;
        this.State = State;
        this.Country = Country;
        this.ZIP = ZIP;
    }

    public String getLabel() {
        return label;
    }

    public String getStreet() {
        return Street;
    }

    public String getPOBox() {
        return POBox;
    }

    public String getNeighborhood() {
        return Neighborhood;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getCountry() {
        return Country;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public void setPOBox(String POBox) {
        this.POBox = POBox;
    }

    public void setNeighborhood(String Neighborhood) {
        this.Neighborhood = Neighborhood;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setState(String State) {
        this.State = State;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }
    
        
    

}
