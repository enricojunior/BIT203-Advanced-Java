/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297 
 * Contribution.java
 * Date: 09-11-2023
 * This part is completed
 * 
 */

// Import the LocalDate to get the current Date
import java.time.LocalDate;
// Import the DateTimeFormatter to format the Date according to my selection
import java.time.format.DateTimeFormatter;

/**
 * Contribution is an abstract and super class
 * It has two types of subclass such as Goods and CashDonation
 */
abstract public class Contribution {
    // List of the additional attributes
    private LocalDate receivedDate;
    private Appeal ThisAppeal;

    // List of the attributes
    private int contributionID;

    /**
     * Parameter Constructor
     * @param receivedDate @param ThisAppeal 
     * The constructor is used to initialize all of the required data fields
     */
    public Contribution(LocalDate receivedDate, Appeal ThisAppeal){
        this.receivedDate = receivedDate;
        this.contributionID = ValidateCtrID(contributionID);
        this.ThisAppeal = ThisAppeal;
    }

    /**
     * This method is used to set the Contribution's Received Date
     * @param receivedDate
     */
    public void setReceivedDate(LocalDate receivedDate){
        this.receivedDate = receivedDate;
    }

    /**
     * This method is used to set the Contribution's Generated ID
     * @param contributionID
     */
    public void setContributionID(int contributionID){
        this.contributionID = contributionID;
    }

    /**
     * This method is used to set the Contribution's Specified Appeal
     * @param ThisAppeal
     */
    public void setThisAppeal(Appeal ThisAppeal){
        this.ThisAppeal = ThisAppeal;
    }

    /**
     * This method is used to perform Contribution ID's Validation
     * @param contributionID
     * @return ValidateID 
     */
    public int ValidateCtrID(int contributionID){
        // Assign the Value of Contribution ID to Validate ID
        int ValidateID = contributionID;
        // Condition if the Validated ID is greater than 9999 or lower than 1000
        if(ValidateID < 1000 || ValidateID > 9999){
            // Generate another ID and makes sure that the condition is Valid
            ValidateID = (int) (Math.random() * 9000) + 1000;
        }
        // Return the ValidateID
        return ValidateID;
    }

    /**
     * This method is used to get the Contribution's Generated ID
     * @return contributionID - int
     */
    public int getContributionID(){
        return contributionID;
    }

    /**
     * This method is used to get the Contribution's received date
     * @return receivedDate - LocalDate
     */
    public LocalDate getReceivedDate(){
        return receivedDate;
    }

    /**
     * This method is used to get the Contribution's Specified Appeal
     * @return ThisAppeal - Appeal
     */
    public Appeal getThisAppeal(){
        return ThisAppeal;
    }

    /**
     * toString() method 
     * This method is used to return the details of the Contribution
     * @return CtrDet - String, Overriden Method
     */
    @Override
    public String toString(){
        // Create a new DateTimeFormatter object and set the pattern
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Initialize the CtrDet to empty string
        String CtrDet = "";
        // Add the details of the Contribution to the CtrDet
        CtrDet += "[ Contribution ID: " + contributionID + ", Received Date: " 
            + receivedDate.format(DTFormat) + " ]";
        // Return the whole details in String value
        return CtrDet;
    }

    /**
     * This method is used to get the contribution type
     * Depending from which instance of the class
     * @return "Goods" - String or "Cash Donation" - String
     */
    public String getContributionType(){
        // Check if the contribution is an instance of Goods
        if(this instanceof Goods){
            return "Goods";
        }
        // Check if the contribution is an instance of CashDonation
        else if(this instanceof CashDonation){
            return "Cash Donation";
        }
        // Condition if the contribution type is unknown
        else {
            return "Not Valid";
        }
    }
}