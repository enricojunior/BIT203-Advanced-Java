package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297
 * CashDonation.java 
 * Date: 09-11-2023
 * This part is completed
 * 
 */

// Import the LocalDate to get the current date
import java.time.LocalDate;
// Import the IO Serializable to save and load data
import java.io.Serializable;

/**
 * CashDonation is one of the sub-class from Contribution class
 * Inherits attributes from the Contribution class
 * Additional Attributes such as amount, payment channel, and referenceNo
 */
public class CashDonation extends Contribution implements Serializable {
    // List of the attributes
    private int amount;
    private String paymentChannel;
    private String referenceNo;

    /**
     * Parameter Constructor
     * @param receivedDate @param ThisAppeal @param amount @param paymentChannel @param referenceNo
     * The constructor is used to initialize all of the required data fields
     */
    public CashDonation(LocalDate receivedDate, Appeal ThisAppeal, int amount,
        String paymentChannel, String referenceNo){
        super(receivedDate, ThisAppeal);
        this.amount = amount;
        this.paymentChannel = paymentChannel;
        this.referenceNo = referenceNo;
    }

    /**
     * This method is used to set the Cash Donation's amount
     * @param amount
     */
    public void setAmount(int amount){
        this.amount = amount;
    }

    /**
     * This method is used to set the Cash Donation's Payment Channel
     * @param paymentChannel
     */
    public void setPaymentChannel(String paymentChannel){
        this.paymentChannel = paymentChannel;
    }

    /**
     * This method is used to set the Cash Donation's reference No
     * @param referenceNo
     */
    public void setReferenceNo(String referenceNo){
        this.referenceNo = referenceNo;
    }

    /**
     * This method is used to get the Cash Donation's amount
     * @return amount - int
     */
    public int getAmount(){
        return amount;
    }

    /**
     * This method is used to get the Cash Donation's Payment Channel
     * @return paymentChannel - String
     */
    public String getPaymentChannel(){
        return paymentChannel;
    }

    /**
     * This method is used to get the Cash Donation's reference No
     * @return referenceNo - String
     */
    public String getReferenceNo(){
        return referenceNo;
    }

    /**
     * toString() method
     * This method is used to return the details of the Cash Donation
     * @return CashDet - String, Overriden method
     */
    @Override
    public String toString(){
        // Initialize the CasDet to empty string
        String CasDet = "";
        // Using super() keyword to inherit details of the attributes
        // along with the rest of the additional attributes
        CasDet += super.toString() + " | " + "Payment Channel: " + paymentChannel + ", Reference No: "
            + referenceNo + ", Cash Amount: " + amount;
        // Return the whole details in String value
        return CasDet;  
    }
}