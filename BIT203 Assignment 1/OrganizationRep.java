/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297
 * OrganizationRep.java
 * Date: 09-11-2023
 * This part is completed
 * 
 */

/**
 * OrganizationRep is one of the sub-class from User class
 * Inherits attributes from the User class
 * Additional Attributes such as jobTitle, isThisOrg
 */
public class OrganizationRep extends User {
    // List of the attributes
    private String jobTitle;

    // List of the additional attributes
    private Organization isThisOrg;

    /**
     * Parameter Constructor
     * @param fullName @param email @param mobileNo 
     * @param jobTitle @param isThisOrg
     * The constructor is used to initialize all of the required data fields
     */
    public OrganizationRep(String fullName, String email, int mobileNo
        , String jobTitle, Organization isThisOrg){
        super(fullName, email, mobileNo);
        this.jobTitle = jobTitle;
        this.isThisOrg = isThisOrg;
    }

    /**
     * This method is used to set the Organization Representative's Job Title
     * @param jobTitle
     */
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    } 

    /**
     * This method is used to set the Organization Representative's Specified Organization
     * @param isThisOrg
     */
    public void setThisOrg(Organization isThisOrg){
        this.isThisOrg = isThisOrg;
    }

    /**
     * This method is used to get the Organization Representative's Job Title
     * @return jobTitle - String
     */
    public String getJobTitle(){
        return jobTitle;
    }

    /**
     * This method is used to get the Organization Representative's Specified Organization
     * @return isThisOrg - Organization
     */
    public Organization getThisOrg(){
        return isThisOrg;
    }

    /**
     * toString() method
     * This method is used to return the details of the Organization Representatives
     * @return OrgDet - String, Overriden method
     */
    @Override
    public String toString(){
        // Initialize the CasDet to empty string
        String OrgDet = "";
        // Using super() keyword to inherit details of the attributes
        // along with the rest of the additional attributes
        OrgDet += super.toString() + " | Job Title: " + jobTitle + " - " + getThisOrg().getOrgName();
        // Return the whole details in String value
        return OrgDet;
    }
}