package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * Appeal.java
 * Date: 09-11-2023
 * This part is completed
 * 
 */ 

// Import the ArrayList utility
import java.util.ArrayList;

// Import the IO Serializable to save and load data
import java.io.Serializable;

/**
 * The Appeal class is responsible of managing Appeal's data that was 
 * Organized by Organization Representative from a specific Organization
 */
public class Appeal implements Serializable {
    // List of the attributes
    private int appealID;
    private String fromDate;
    private String toDate;
    private String description;
    private String outcome;

    // List of the additional attributes
    private Organization thisOrg;
    private ArrayList<Contribution> contributionList = new ArrayList<>();
    private ArrayList<Disbursement> disbursementList = new ArrayList<>();

    /**
     * Parameter Constructor
     * @param fromDate @param toDate @param description @param outcome @param thisOrg
     * The constructor is used to initialize all of the required data fields
     */
    public Appeal(String fromDate, String toDate, String description, String outcome, Organization thisOrg){
        this.appealID = ValidateAplID(appealID);
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.description = description;
        this.outcome = outcome;      
        this.thisOrg = thisOrg;
    }

    /**
     * This method is used to set the Appeal's ID
     * @param appealID
     */
    public void setAppealID(int appealID){
        this.appealID = appealID;
    }

    /**
     * This method is used to set the Appeal's From Date
     * @param fromDate
     */
    public void setFromDate(String fromDate){
        this.fromDate = fromDate;
    }

    /**
     * This method is used to set the Appeal's To Date
     * @param toDate
     */
    public void setToDate(String toDate){
        this.toDate = toDate;
    }

    /**
     * This method is used to set the Appeal's Description
     * @param description
     */
    public void setAplDescription(String description){
        this.description = description;
    }

    /**
     * This method is used to set the Appeal's Outcome
     * @param outcome
     */
    public void setOutcome(String outcome){
        this.outcome = outcome;
    }

    /**
     * This method is used to set the specified Organization
     * @param thisOrg
     */
    public void setThisOrg(Organization thisOrg){
        this.thisOrg = thisOrg;
    }

    /**
     * This method is used to set the List of Contributions
     * @param contributionList
     */
    public void setContributionList(ArrayList<Contribution> contributionList){
        this.contributionList = contributionList;
    }

    /**
     * This method is used to set the List of Disbursements
     * @param disbursementList
     */
    public void setDisbursement(ArrayList<Disbursement> disbursementList){
        this.disbursementList = disbursementList;
    }

    /**
     * This method is used to add contribution to the List of Contributions
     * @param newCt
     */
    public void addContribution(Contribution newCt){
        contributionList.add(newCt);
    }

    /**
     * This method is used to add disbursement to the List of Disbursements
     * @param newDbs
     */
    public void addDisbursement(Disbursement newDbs){
        disbursementList.add(newDbs);
    }

    /**
     * This method is used to perform Appeal ID's Validation
     * @param appealID
     * @return ValidatedID
     */
    public int ValidateAplID(int appealID){
        // Assign the Value of Appeal ID to Validated ID
        int ValidatedID = appealID;
        // Condition if the Validated ID is greater than 99999 or lower than 10000
        if(ValidatedID < 10000 || ValidatedID > 99999){
            // Generate another ID and makes sure that the condition is Valid
            ValidatedID = (int) (Math.random() * 90000) + 10000;
        }
        // Return the ValidatedID
        return ValidatedID;
    }

    /**
     * This method is used to get the Appeal's ID
     * @return appealID - int
     */
    public int getAppealID(){
        return appealID;
    }

    /**
     * This method is used to get the Appeal's From Date
     * @return fromDate - String
     */
    public String getFromDate(){
        return fromDate;
    }

    /**
     * This method is used to get the Appeal's To Date
     * @return toDate - String
     */
    public String getToDate(){
        return toDate;
    }

    /**
     * This method is used to get the Appeal's Description
     * @return description - String
     */
    public String getAplDescription(){
        return description;
    }

    /**
     * This method is used to get the Appeal's Outcome
     * @return outcome - String
     */
    public String getOutcome(){
        return outcome;
    }

    /**
     * This method is used to get the specified Organization
     * @return thisOrg - Organization
     */
    public Organization getThisOrg(){
        return thisOrg;
    }

    /**
     * This method is used to return the List of Contributions
     * @return contributionList - ArrayList<Contribution>
     */
    public ArrayList<Contribution> getContributionList(){
        return contributionList;
    }

    /**
     * This method is used to return the List of Disbursements
     * @return disbursementList - ArrayList<Disbursement>
     */
    public ArrayList<Disbursement> getDisbursementList(){
        return disbursementList;
    }

    /**
     * toString() method
     * This method is used to return the details of the Appeal
     * @return AplDet - String, Overriden Method
     */
    @Override
    public String toString(){
        // Initialize the AplDet to empty string
        String AplDet = "";
        // Add the details of the Appeal to the AplDet
        AplDet += "[ Appeal ID: " + appealID + ", From Date: " + fromDate + " To Date: " 
            + toDate + ", Description: " + description + ", Outcome: " + outcome + " ]";
        // Return the whole details in String value
        return AplDet;
    }
}