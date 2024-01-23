package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297
 * Organization.java
 * Date: 09-11-2023
 * This part is completed
 * 
 */

// Import the ArrayList utility
import java.util.ArrayList;
// Import the IO Serializable to save and load data
import java.io.Serializable;

/**
 * The Organization class is responsible on managing Organization's 
 * data that was registered by the HELP Aid Administrator
 */
public class Organization implements Serializable {
    // List of the attributes
    private int orgID;
    private String orgName;
    private String address;

    // List of the additional attributes - collections using ArrayList
    private ArrayList<OrganizationRep> orgRepList = new ArrayList<>();
    private ArrayList<Applicant> appList = new ArrayList<>();
    private ArrayList<Appeal> appealList = new ArrayList<>();

    /**
     * Parameter Constructor
     * @param orgName @param address
     * The constructor is used to initialize all of the required data fields
     * @param address
     */
    public Organization(String orgName, String address){
        this.orgID = checkValidID(orgID);
        this.orgName = orgName;
        this.address = address;
    }

    /**
     * This method is used to set the Organization's ID
     * @param orgID
     */
    public void setOrgID(int orgID){
        this.orgID = orgID;
    }

    /**
     * This method is used to set the Organization's Name
     * @param orgName
     */
    public void setOrgName(String orgName){
        this.orgName = orgName;
    }

    /**
     * This method is used to set the Organization's Address
     * @param address
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * This method is used to set the Organization's 
     * List of Organization Representatives
     * @param orgRepList
     */
    public void setOrgRepList(ArrayList<OrganizationRep> orgRepList){
        this.orgRepList = orgRepList;
    }

    /**
     * This method is used to set the Organization's List of Applicants
     * @param appList
     */
    public void setAppList(ArrayList<Applicant> appList){
        this.appList = appList;
    }

    /**
     * This method is used to set the Organization's List of Appeals
     * @param appealList
     */
    public void setAppealList(ArrayList<Appeal> appealList){
        this.appealList = appealList;
    }

    /**
     * This method is used to get the Organization's ID
     * @return orgID - int
     */
    public int getOrgID(){
        return orgID;
    }

    /**
     * This method is used to get the Organization's Name
     * @return orgName - String
     */
    public String getOrgName(){
        return orgName;
    }

    /**
     * This method is used to get the Organization's Address
     * @return address - String 
     */
    public String getAddress(){
        return address;
    }

    /**
     * This method is used to add an Organization Representative
     * to the List of Organization Representatives
     * @param newOrgRep
     */
    public void addOrgRep(OrganizationRep newOrgRep){
        orgRepList.add(newOrgRep);
    }

    /**
     * This method is used to add an Applicant
     * to the List of Applicants
     * @param newApplicant
     */
    public void addApplicant(Applicant newApplicant){
        appList.add(newApplicant);
    }

    /**
     * This method is used to add an Appeal
     * to the List of Appeals
     * @param newAppeal
     */
    public void addAppeal(Appeal newAppeal){
        appealList.add(newAppeal);
    }

    /**
     * This method is used to return the List of Organization Representatives
     * @return orgRepList - ArrayList<OrganizationRep>
     */
    public ArrayList<OrganizationRep> getOrgRepList(){
        return orgRepList;
    }

    /**
     * This method is used to return the List of Applicants
     * @return appList - ArrayList<Applicant>
     */
    public ArrayList<Applicant> getAppList(){
        return appList;
    }

    /**
     * This method is used to return the List of Appeals
     * @return appealList - ArrayList<Appeal>
     */
    public ArrayList<Appeal> getAppealList(){
        return appealList;
    }

    /**
     * toString() method
     * This methdo is used to return the details of the Organization
     * @return detOrg - String, Overriden Method
     */
    @Override
    public String toString(){
        // Initialize the detOrg to empty string
        String detOrg = "";
        // Add the details of the Organization to detOrg
        detOrg += "[ Organization ID : " + orgID + ", Organization Name: " + 
            orgName + ", Address: " + address + " ]";
        // Return the whole details in String value
        return detOrg;
    }

    /**
     * This method is used to perform Organization ID's Validation
     * @param myValidID
     * @return myValidID
     */
    public int checkValidID(int myValidID){
        // Condition if the Valid ID is greater than 9999 or lower than 1000
        if((myValidID < 1000) || (myValidID > 9999)){
            // Generate another ID and makes sure that the condition is Valid
            myValidID = (int) (Math.random() * 9000) + 1000;
        }
        // Return the myValidID
        return myValidID;
    }
}