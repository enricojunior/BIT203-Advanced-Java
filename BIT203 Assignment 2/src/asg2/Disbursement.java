package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297
 * Disbursement.java
 * Date: 09-11-2023
 * This part is completed
 * 
 */

// Import the IO Serializable to save and load data
import java.io.Serializable;

/**
 * The Disbursement class is responsible of managing Disbursement's data 
 * that was created by the Organization Representative and given to a specified Applicant
 */
public class Disbursement implements Serializable {
    // List of the attributes
    private String disbursementDate;
    private int cashAmount;
    private int goodsDisbursed;

    // List of the additional attributes
    private Appeal ThisAppeal;
    private Applicant isThisApplicant;

    /**
     * Parameter Constructor
     * @param disbursementDate @param cashAmount @param goodsDisbursed @param ThisAppeal @param isThisApplicant
     * This constructor is used to intialize all of the required data fields
     * @param cashAmount
     * @param goodsDisbursed
     * @param ThisAppeal
     * @param isThisApplicant
     */
    public Disbursement(String disbursementDate, int cashAmount, int goodsDisbursed
        , Appeal ThisAppeal, Applicant isThisApplicant){
        this.disbursementDate = disbursementDate;
        this.cashAmount = cashAmount;
        this.goodsDisbursed = goodsDisbursed;
        this.ThisAppeal = ThisAppeal;
        this.isThisApplicant = isThisApplicant;
    } 

    /**
     * This method is used to set the Disbursement's Date
     * @param disbursementDate
     */
    public void setDisbursementDate(String disbursementDate){
        this.disbursementDate = disbursementDate;
    }

    /**
     * This method is used to set the Disbursement's Cash Amount
     * @param cashAmount
     */
    public void setCashAmount(int cashAmount){
        this.cashAmount = cashAmount;
    }

    /**
     * This method is used to set the Disbursement's Goods Disbursed
     * @param goodsDisbursed
     */
    public void setGoodsDisbursed(int goodsDisbursed){
        this.goodsDisbursed = goodsDisbursed;
    }

    /**
     * This method is used to set the Disbursement's Specified Appeal
     * @param ThisAppeal
     */
    public void setThisAppeal(Appeal ThisAppeal){
        this.ThisAppeal = ThisAppeal;
    }

    /**
     * This method is used to set the Disbursement's Specified Applicant
     * @param isThisApplicant
     */
    public void setIsThisApplicant(Applicant isThisApplicant){
        this.isThisApplicant = isThisApplicant;
    }

    /**
     * This method is used to get the Disbursement's Date
     * @return disbursementDate - String 
     */
    public String getDisbursementDate(){
        return disbursementDate;
    }

    /**
     * This method is used to get the Disbursement's Cash Amount
     * @return cashAmount - int
     */
    public int getCashAmount(){
        return cashAmount;
    }

    /**
     * This method is used to get the Disbursement's Goods Disbursed
     * @return goodsDisbursed - int
     */
    public int getGoodsDisbursed(){
        return goodsDisbursed;
    }

    /**
     * This method is used to get the Disbursement's Specified Appeal
     * @return ThisAppeal - Appeal
     */
    public Appeal getThisAppeal(){
        return ThisAppeal;
    }

    /**
     * This method is used to get the Disbursement's Specified Applicant
     * @return isThisApplicant - Applicant
     */
    public Applicant getIsThisApplicant(){
        return isThisApplicant;
    }

    /**
     * toString() method
     * This method is used to return the details of the Disbursement
     * @return DisbursementDet - String, Overriden Method
     */
    @Override
    public String toString(){
        // Initialize the DisbursementDet to empty string
        String DisbursementDet = "";
        // Add the details of the disbursement to the DisbursementDet
        DisbursementDet += "[ Disbursement Date: " + disbursementDate + ", Cash Amount: " + cashAmount
            + ", Goods Disbursed: " + goodsDisbursed + " ]";
        // Return the whole details in String value
        return DisbursementDet;
    }
}