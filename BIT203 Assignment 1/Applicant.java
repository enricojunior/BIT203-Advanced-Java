/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * Applicant.java 
 * Date: 09-11-2023
 * This part is completed
 * 
 */ 

// Import the ArrayList utility
import java.util.ArrayList;

/**
 * Applicant is one of the sub-class from User class
 * Inherits attributes from the User class
 * Additional Attributes such as IDNo, address, and householdIncome
 */
public class Applicant extends User {
    // List of the attributes
    private int IDNo;
    private String address;
    private int householdIncome;

    // List of the additional attributes required
    private Organization SpecifiedOrg;
    private ArrayList<Document> documentList;
    private ArrayList<Disbursement> disbursementList;
    
    /**
     * Parameter Constructor
     * @param fullName @param email @param email @param mobileNo @param IDNo @param address @param householdIncome
     * The constructor is used to initialize all of the required data fields
     */
    public Applicant(String fullName, String email, int mobileNo, int IDNo, String address, int householdIncome){
        super(fullName, email, mobileNo);
        this.IDNo = IDNo;
        this.address = address;
        this.householdIncome = householdIncome;

        // Set the Applicant's Specified Organization to null
        this.SpecifiedOrg = null;
        // Assign the value of the ArrayList with keyword "new ArrayList<>();"
        disbursementList = new ArrayList<>();
        documentList = new ArrayList<>();
    }

    /**
     * This method is used to set the Applicant's IDNo
     * @param IDNo
     */
    public void setIDNo(int IDNo){
        this.IDNo = IDNo;
    }

    /**
     * This method is used to set the Applicant's address
     * @param address
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * This method is used to set the Applicant's Household Income
     * @param householdIncome
     */
    public void setHouseholdIncome(int householdIncome){
        this.householdIncome = householdIncome;
    }

    /**
     * This method is used to set the Applicant's Specified Organization
     * @param SpecifiedOrg
     */
    public void setSpecifiedOrg(Organization SpecifiedOrg){
        // Condition if the SpecifiedOrg is set to null
        if(this.SpecifiedOrg == null){
            // Assign the SpecifiedOrg with @param SpecifiedOrg
            this.SpecifiedOrg = SpecifiedOrg;
        }
    }

    /**
     * This method is used to set the Applicant's List of documents
     * @param documentList
     */
    public void setDocumentList(ArrayList<Document> documentList){
        this.documentList = documentList;
    }

    /**
     * This method is used to set the Applicant's List of disbursements
     * @param disbursementList
     */
    public void setDisbursement(ArrayList<Disbursement> disbursementList){
        this.disbursementList = disbursementList;
    }

    /**
     * This method is used to get the Applicant's IDNo
     * @return IDNo - int
     */
    public int getIDNo(){
        return IDNo;
    }

    /**
     * This method is used to get the Applicant's Address
     * @return address - String
     */
    public String getAddress(){
        return address;
    }

    /**
     * This method is used to get the Applicant's Household Income
     * @return householdIncome - int 
     */
    public int getHouseholdIncome(){
        return householdIncome;
    }

    /**
     * This method is used to get the Applicant's Organization
     * @return SpecifiedOrg - Organization
     */
    public Organization getSpecifiedOrg(){
        return SpecifiedOrg;
    }

    /**
     * This method is used to get the Applicant's List of documents
     * @return documentList - ArrayList<Document>
     */
    public ArrayList<Document> getDocumentList(){
        return documentList;
    }

    /**
     * This method is used to get the Applicant's List of disbursements
     * @return disbursementList - ArrayList<Disbursement>
     */
    public ArrayList<Disbursement> getDisbursementList(){
        return disbursementList;
    }

    /**
     * This method is used to add document to the List of documents
     * @param newDoc
     */
    public void addDocument(Document newDoc){
        documentList.add(newDoc);
    }

    /**
     * This method is used to add disbursement to the List of disbursements
     * @param newDbs
     */
    public void addDisbursement(Disbursement newDbs){
        disbursementList.add(newDbs);
    }

    /**
     * toString() method
     * This method is used to return the details of the Applicant
     * @return DetApp - String, Overriden Method
     */
    @Override
    public String toString(){
        // Initialize the DetApp to empty string
        String DetApp = "";
        // Using super() keyword to inherit details of the attributes 
        // along with the rest of the additional attributes
        DetApp += super.toString() + " | Applicant ID No: " + IDNo + ", Address: " + address
            + ", Household Income: " + householdIncome + " - " + getSpecifiedOrg().getOrgName();
        // Return the whole details in String value
        return DetApp;
    }
}