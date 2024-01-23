package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297
 * Goods.java
 * Date: 09-11-2023
 * This part is completed
 * 
 */

// Import the LocalDate to get the current date
import java.time.LocalDate;
// Import the IO Serializable to save and load data
import java.io.Serializable;

/**
 * Goods is one of the sub-class from Contribution class
 * Inherits attributes from the Contribution class
 * Additional attributes such as description and estimatedValue
 */
public class Goods extends Contribution implements Serializable {
    // List of the attributes
    private String description;
    private int estimatedValue;
    
    /**
     * Parameter Constructor
     * @param receivedDate @param ThisAppeal @param description @param estimatedValue
     * The constructor is used to initialize all of the required data fields
     * @param ThisAppeal
     * @param description
     * @param estimatedValue
     */
    public Goods(LocalDate receivedDate, Appeal ThisAppeal, String description, 
        int estimatedValue){
        super(receivedDate, ThisAppeal);
        this.description = description;
        this.estimatedValue = estimatedValue;
    }

    /**
     * This method is used to set the Goods's description
     * @param description 
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * This method is used to set the Goods's estimated value
     * @param estimatedValue
     */
    public void setEstValue(int estimatedValue){
        this.estimatedValue = estimatedValue;
    }

    /**
     * This method is used to get the Goods's description
     * @return description - String
     */
    public String getDescription(){
        return description;
    }

    /**
     * This method is used to get the Goods's estimated value
     * @return estimatedValue - int
     */
    public int getEstValue(){
        return estimatedValue;
    }

    /**
     * toString() method 
     * This method is used to return the details of the Goods
     * @return GoodDet - String, Overriden method
     */
    @Override
    public String toString(){
        // Initialize the GoodDet to empty string
        String GoodDet = "";
        // Using super() keyword to inherit details of the attributes
        // along with the rest of the additional attributes
        GoodDet += super.toString() + " | " + "Description: " + description + ", Est. Value: "
            + estimatedValue;
        // Return the whole details in String value
        return GoodDet;
    }
}