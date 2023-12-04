/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297
 * Document.java
 * Date: 09-11-2023
 * This part is completed
 * 
 */

/**
 * The Document class is responsible of managing Document's data from
 * the registered Applicant and was added through Organization Representative or through online 
 */
public class Document {
    // List of the attributes
    private int documentID;
    private String fileName;
    private String description;

    // List of the additional attributes
    private Applicant isThisApplicant;

    /**
     * Parameter Constructor
     * @param fileName @param description @param isThisApplicant
     * The constructor is used to initialize all of the required data fields
     */
    public Document(String fileName, String description, Applicant isThisApplicant){
        this.documentID = ValidateDcID(documentID);
        this.fileName = fileName;
        this.description = description;
        this.isThisApplicant = isThisApplicant;
    }

    /**
     * This method is used to set the Document's Generated ID
     * @param documentID
     */
    public void setDocumentID(int documentID){
        this.documentID = documentID;
    }

    /**
     * This method is used to set the Document's File Name
     * @param fileName
     */
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    /**
     * This method is used to set the Document's Description
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * This method is used to set the Document's Specified Applicant
     * @param isThisApplicant
     */
    public void setIsThisApplicant(Applicant isThisApplicant){
        this.isThisApplicant = isThisApplicant;
    }

    /**
     * This method is used to perform Document's ID Validation
     * @param documentID
     * @return GenDcID - int
     */
    public int ValidateDcID(int documentID){
        // Assign the value of document ID to GenDcID
        int GenDcID = documentID;
        // Condition if the GenDcID is greater than 999999 or lower than 100000
        if(GenDcID < 100000 || GenDcID > 999999){
            // Generate another ID and makes sure that the condition is Valid 
            GenDcID = (int) (Math.random() * 900000) + 100000;
        }
        // Return the GenDcID
        return GenDcID;
    }

    /**
     * This method is used to get the Document's ID
     * @return - documentID - int
     */
    public int getDocumentID(){
        return documentID;
    }

    /**
     * This method is used to get the Document's File Name
     * @return fileName - String
     */
    public String getFileName(){
        return fileName;
    }

    /**
     * This method is used to get the Document's Description
     * @return description - String
     */
    public String getDescription(){
        return description;
    }

    /**
     * This method is used to get the Document's Specified Applicant
     * @return isThisApplicant - Applicant
     */
    public Applicant getIsThisApplicant(){
        return isThisApplicant;
    }

    /**
     * toString() method
     * This method is used to return the details of the Document
     * @return DetDoc - String, Overriden Method
     */
    @Override
    public String toString(){
        // Initialize the DetDoc to empty string
        String DetDoc = "";
        // Add the details of the Document to the DetDoc
        DetDoc += "[ Document ID: " + documentID + ", Document File Name: " + fileName + ", Document Description: "
            + description + ", Designated Applicant: " + isThisApplicant.getFullName() + " ]";
        // Return the whole details in String value
        return DetDoc;
    }
}