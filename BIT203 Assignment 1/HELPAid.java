/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * HELPAid.java
 * Date: 09-11-2023
 * This part is completed
 * 
 */

// Import the ArrayList utility
import java.util.ArrayList;
// Import the LocalDate to execute parsing date object
import java.time.LocalDate;
// Import the DateTimeFormatter to format the date according to my selection
import java.time.format.DateTimeFormatter;
// Import the IO Serializable to save and load data
import java.io.Serializable;

/**
 * The HELPAid class has a special purpose where this class maintain 
 * a collection of User objects, Organization objects, and Appeal objects
 * 
 * Furthermore, this class also contains special methods from various different 
 * classes where most of the methods indicated supports the console validations
 */
public class HELPAid implements Serializable {
    // List of the collections attributes
    private ArrayList<Organization> orgList;
    private ArrayList<User> userList;
    private ArrayList<Appeal> appealList;

    /**
     * HELPAid constructor, the constructor does not take any parameters
     * The constructor is only initialize the collections
     */
    public HELPAid(){
        orgList = new ArrayList<>();
        userList = new ArrayList<>();
        appealList = new ArrayList<>();
    }

    /**
     * This method is used to set List of Organizations
     * @param orgList
     */
    public void setOrgList(ArrayList<Organization> orgList){
        this.orgList = orgList;
    }

    /**
     * This method is used to set List of Users
     * @param userList
     */
    public void setUserList(ArrayList<User> userList){
        this.userList = userList;
    }

    /**
     * This method is used to set List of Appeals
     * @param appealList
     */
    public void setAppealList(ArrayList<Appeal> appealList){
        this.appealList = appealList;
    }

    /**
     * This method is used to add singular 
     * Organization object to the List of Organizations
     * @param newOrg
     */
    public void addOrg(Organization newOrg){
        orgList.add(newOrg);
    }

    /**
     * This method is used to add singular User regardless from the instance of 
     * Organization Representative or Applicant to the List of Users
     * @param newUser
     */
    public void addUser(User newUser){
        userList.add(newUser);
    }

    /**
     * This method is used to add singular Appeal to the List of Appeals
     * @param newAppeal
     */
    public void addAppeal(Appeal newAppeal){
        appealList.add(newAppeal);
    }

    /**
     * This method is used to get the List of Organizations
     * @return orgList - ArrayList<Organization>
     */
    public ArrayList<Organization> getOrgList(){
        return orgList;
    }

    /**
     * This method is used to get the List of Users
     * @return userList - ArrayList<User>
     */
    public ArrayList<User> getUserList(){
        return userList;
    }

    /**
     * This method is used to get the List of Registered Organization Representatives
     * @return orgRepList - ArrayList<OrganizationRep>
     */
    public ArrayList<OrganizationRep> getOrgRepList(){
        // Create an empty OrganizationRep ArrayList
        ArrayList<OrganizationRep> orgRepList = new ArrayList<>();
        // Get each users from the userList
        // Stream and iterate, filter the data where the user is an instance of OrganizationRep
        // Map to transform and apply casting and get each Representative and add it to the empty array list
        userList.stream().filter(tct -> tct.isOrgRep()).map(tct -> (OrganizationRep) tct)
                         .forEach(orgRepList::add);
        // Return list of the registered Organization Representative
        return orgRepList;
    }

    /**
     * This method is used to get the List of Registered Applicants
     * @return appList - ArrayList<Applicant>
     */
    public ArrayList<Applicant> getApplicantList(){
        // Create an empty Applicant ArrayList
        ArrayList<Applicant> appList = new ArrayList<>();
        // Get each users from the userList
        // Stream and iterate, filter the data where the user is an instance of Applicant
        // Map to transform and apply casting and get each Applicants and add it to the empty array list
        userList.stream().filter(tct -> tct.isApplicant()).map(tct -> (Applicant) tct) 
                         .forEach(appList::add);
        // Return list of the registered Applicants
        return appList;
    }

    /**
     * This method is used to get the List of Appeals
     * @return appealList - ArrayList<Appeal>
     */
    public ArrayList<Appeal> getAppealList(){
        return appealList;
    }

    /**
     * This method is used to get the List of Current Appeals
     * @return CrAppealList - ArrayList<Appeal>
     */
    public ArrayList<Appeal> getCrAppealList(){
        // Create a new empty Appeal ArrayList 
        ArrayList<Appeal> CrAppealList = new ArrayList<>();
        // Get each current appeals in the List of Appeals
        // filter the Appeal List by outcome and check if the outcome status is set to PENDING
        // Add the appeals with the outcome status of PENDING
        getAppealList().stream().filter(tct -> tct.getOutcome().equals("PENDING"))
                       .forEach(CrAppealList::add);
        // Return the List of Current Appeals
        return CrAppealList;
    }

    /**
     * This method is used to get List of Current Appeals made by specified Organization
     * @param thisOrg
     * @return CrSpcAppealList - ArrayList<Appeal> 
     */
    public ArrayList<Appeal> getCrAppealByOrg(Organization thisOrg){
        // Create a new empty Appeal ArrayList
        ArrayList<Appeal> CrSpcAppealList = new ArrayList<>();
        // Get each current Appeals in the List of Appeals
        // filter the Appeal List by outcome and its specified Organization
        // Add the appeals with the outcome of PENDING and made by the specified Organization object
        getAppealList().stream().filter(tct -> tct.getOutcome().equals("PENDING") && tct.getThisOrg() == thisOrg)
                              .forEach(CrSpcAppealList::add);
        // Return the List of Current Appeals
        return CrSpcAppealList;
    }

    /**
     * This method is used to get the List of Past Appeals
     * @return PstAppealList - ArrayList<Appeal>
     */
    public ArrayList<Appeal> getPstAppealList(){
        // Create a new empty array list of Appeals
        ArrayList<Appeal> PstAppealList = new ArrayList<>();
        // Implementing streams and lambda expressions, filter it by the outcome and get
        // each appeals its outcome that is already set to APPROVED
        getAppealList().stream().filter(tct -> tct.getOutcome().equals("APPROVED"))
                       .forEach(PstAppealList::add);
        // Return the List of Past Appeals
        return PstAppealList;
    }

    /**
     * This method is used to get List of Disbursements to a specified registered Applicant
     * @param sctApp @param idNo
     * @return List of Disbursements 
     */
    public ArrayList<Disbursement> getDisbursByApp(Applicant sctApp, int idNo){
        // Condition if the Disbursement List is not empty and the idNo is same
        if(!(sctApp.getDisbursementList().isEmpty()) && sctApp.getIDNo() == idNo){
            // Returns the list of disbursements to the Applicant
            return sctApp.getDisbursementList();
        }
        // Returns null otherwise
        return null;
    }
    
    /**
     * This method is used to check if the list of disbursements exist to a specified applicant
     * @param sctApp @param idNo
     * @return boolean
     */
    public boolean isDisbursementExist(Applicant sctApp, int idNo){
        // Condition if the Disbursement List is not empty and the idNo is same
        if(!(sctApp.getDisbursementList().isEmpty()) && sctApp.getIDNo() == idNo){
            // Returns true if valid
            return true;
        }
        // Returns false otherwise
        return false;
    }

    /**
     * This method is used to check if the organization exists in the ArrayList
     * @param designatedID
     * @return boolean
     */
    public boolean foundOrgByID(int designatedID){
        // Stream and iterate the Organization List according to the specified ID
        // filter the Organization according to the ID
        Organization myOrg = orgList.stream().filter(tct -> tct.getOrgID() == designatedID)
                                             .findFirst().orElse(null);
        // Check if the condition is not null
        if(myOrg != null){
            // If not, returns true
            return true;
        }
        // If yes, returns false otherwise
        return false;
    }

    /**
     * This method is used to check if the Appeal exists in the ArrayList
     * @param designatedID
     * @return boolean 
     */
    public boolean foundAplByID(int designatedID){
        // Stream and iterate the Appeal List according to the specified ID
        // filter the Appeal according to the ID
        Appeal myApl = getAppealList().stream().filter(tct -> tct.getAppealID() == designatedID)
                                      .findFirst().orElse(null);
        // Check if the condition is not null
        if(myApl != null){
            // If not, returns true
            return true;
        }
        // If yes, returns false otherwise
        return false;
    }

    /**
     * This method is used to get the List of Documents that was submitted by
     * the Organization Representative and given to a specific singular Applicant
     * @param sctApp @param sctOrgRep
     * @return List of Documents
     */
    public ArrayList<Document> getDocList(Applicant sctApp, OrganizationRep sctOrgRep){
        // Condition if the Organization is same from both Users
        if(sctApp.getSpecifiedOrg() == sctOrgRep.getThisOrg()){
            // Returns the Applicant's List of Documents
            return sctApp.getDocumentList();
        }
        // Return null otherwise
        return null;
    }

    /**
     * This method is used to get the List of the registered Applicant
     * under specified Organization through the Organization ID
     * @param orgID
     * @return List of Applicants
     */ 
    public ArrayList<Applicant> getRegAppByOrgID(int orgID){
        // Create an empty Applicant ArrayList
        ArrayList<Applicant> getAplByOrgIDList = new ArrayList<Applicant>();
        // Stream and iterate the Registered Applicant according to the specified Organization by orgID
        // filter the registered Applicant and add each Applicant to the empty Applicant ArrayList
        getApplicantList().stream().filter(tct -> tct.getSpecifiedOrg().getOrgID() == orgID)
                                   .forEach(getAplByOrgIDList::add);
        // Returns the List of Applicants
        return getAplByOrgIDList;
    }

    /**
     * This method is used to get a singular Applicant by specified ID
     * @param sctID
     * @return sctApplicant - Applicant
     */
    public Applicant getApplicantByID(int sctID){
        // This time, I make some modifications for the code, 
        // where I'm implementing streams instead of using conventional way
        // filter the data from the userList to get the list of registered applicant
        // Applying map to transform and down-cast to Applicant, and filter it according to the ID
        return userList.stream().filter(tct -> tct instanceof Applicant).map(tct -> (Applicant) tct)
                       .filter(tct -> tct.getIDNo() == sctID).findFirst().orElse(null);
    }

    /**
     * This method is used to check and verify the Applicant by ID
     * @param sctID
     * @return boolean
     */
    public boolean VerifyAppByID(int sctID){
        // This time, I make some modifications for the code, 
        // where I'm implementing streams instead of using conventional way
        // filter the data from the userList to get the list of registered applicant
        // Applying map to transform and down-cast to Applicant, and filter it according to the ID
        Applicant sctApplicant = getApplicantList().stream().filter(tct -> tct.getIDNo() == sctID)
                                                   .findFirst().orElse(null);
        // Check if the condition is not null
        if(sctApplicant != null){
            // Returns true, if the Applicant was found by ID
            return true;
        }
        return false;
    }

    /**
     * This method is used to get singular organization by ID
     * @param designatedID
     * @return myOrg - Organization
     */
    public Organization getOrganizationByID(int designatedID){
        // This time, I make some modifications for the code, 
        // where I'm implementing streams instead of using conventional way
        return getOrgList().stream().filter(tct -> tct.getOrgID() == designatedID)
                           .findFirst().orElse(null);
    }

    /**
     * This method is used to get singular Appeal by ID
     * @param designatedID
     * @return myApl - Appeal
     */
    public Appeal getAppealByID(int designatedID){
        // This time, I make some modifications for the code, 
        // where I'm implementing streams instead of using conventional way
        return getAppealList().stream().filter(tct -> tct.getAppealID() == designatedID)
                              .findFirst().orElse(null);
    }

    /**
     * This method is used to validate if duplicate username
     * Regardless from which instance of Users was found in the system
     * @param Username
     * @return boolean
     */
    public boolean DuplicateUName(String Username){
        // Get each Users in the ArrayList
        for(User myUser : userList){
            // Implementing stream(), check if there are any duplicate username found
            if(getUserList().stream().anyMatch(tct -> tct.getUsername().equals(Username))){
                // Returns true (If found)
                return true;
            }
        }
        // Returns false (If not found)
        return false; // Means there aren't any duplicate usernames
    }

    /**
     * This method is used to check if there are any duplicates of 
     * Applicant's ID No detected in the HELPAidConsole class
     * @param idNo
     * @return boolean
     */
    public boolean DuplicateIDNo(int idNo){
        // Get each Users in the ArrayList
        for(User myUser : userList){
            // Check if the user is an instance of Applicant
            if(myUser.isApplicant()){
                // Implementing stream(), check if there are any duplicate idNo found
                if(getApplicantList().stream().anyMatch(tct -> tct.getIDNo() == idNo)){
                    // Returns true (If found)
                    return true;
                }
            }
        }
        // Returns false (If not found)
        return false;
    }

    /**
     * This method is used to get the User by Username and Password
     * @param Username @param Pwd
     * @return myUser - User
     */
    public User getUser(String Username, String Pwd){
        // Get each Users in the ArrayList
        for(User myUser : userList){
            // Check if the username and password are the same
            if(myUser.getUsername().equals(Username) && myUser.getPassword().equals(Pwd)){
                // Returns the User object (If valid)
                return myUser;
            }
        }
        // Returns null otherwise (If not valid)
        return null;
    }

    /**
     * This method is used to detect whether the data input has already been taken
     * while registering a new User (Both Applicant and Organization Representative)
     * @param fullName @param email @param mobileNo
     * @return boolean
     */
    public boolean isUserTaken(String fullName, String email, int mobileNo){
        // Get each users in the ArrayList
        for(User myUser : userList){
            // Check if the required fields is identic according to the @param
            if(myUser.getFullName().equals(fullName) && myUser.getEmail().equals(email) 
                && (myUser.getMobileNo() == mobileNo)){
                // Returns true (If detected)
                return true;
            }
        }
        // Returns false otherwise (If not detected)
        return false;
    }

    /**
     * This method is used to check a date whether it's valid or invalid
     * Dates according to the Appeal's From Date, Appeal's To Date, and Disbursement Date
     * @param strDt
     * @return boolean
     */
    public boolean isValidDate(String strDate){
        // Parse the required data fields 
        // Get each element of a date and modify the data type to int
        int parseDay = Integer.parseInt(strDate.substring(0,2));
        int parseMonth = Integer.parseInt(strDate.substring(3,5));
        int parseYear = Integer.parseInt(strDate.substring(6,10));
        // Boolean method for a leap year checker
        boolean isLeapYear;
        // Check if it's a leap year
        if((parseYear % 4 == 0 && parseYear % 100 != 0) || (parseYear % 400 == 0)){
            // If yes, set it to true
            isLeapYear = true;
        }
        else {
            // if no, set it to false
            isLeapYear = false;
        } 
        // Check if the month is February
        if(parseMonth == 2){
            // Check if it's a leap year and the parse day is between 1 and 29
            if((isLeapYear && parseDay >= 1 && parseDay <= 29)){
                // If valid, returns true
                return true;
            }
            // Check if it's not a leap year and the parse day is between 1 and 28
            else if(!isLeapYear && parseDay >= 1 && parseDay <= 28){
                // If valid, returns true
                return true;
            }
        }  
        // Check if the month has 31 days
        else if((parseMonth == 1 || parseMonth == 3 || parseMonth == 5 || parseMonth == 7 || 
            parseMonth == 8 || parseMonth == 10 || parseMonth == 12)){
            // Check if the parse day is between 1 and 31
            if(parseDay >= 1 && parseDay <= 31){
                // If valid, returns true
                return true;
            }
        }
        // Check if month has 30 days
        else if((parseMonth == 4 || parseMonth == 6 || parseMonth == 9 || parseMonth == 11)){
            // Check if the parse day is between 1 and 30
            if(parseDay >= 1 && parseDay <= 30){
                // If valid, returns true
                return true;
            }
        }
        // If the date isn't valid, returns false otherwise
        return false;
    }

    /**
     * This method is used to validate Appeal's From Date and Appeal's To Date range
     * @param strFromDt @param strToDt
     * @return boolean
     */
    public boolean isValidRange(String strFromDt, String strToDt){
        // Set the DateTime of Pattern to dd-MM-yyyy
        DateTimeFormatter dfTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Parse the Inputted date
        LocalDate DtFrom = LocalDate.parse(strFromDt, dfTime);
        LocalDate DtTo = LocalDate.parse(strToDt, dfTime);
        // Check if the To Date is after From Date
        if(DtTo.isAfter(DtFrom)){
            // If yes, returns true
            return true;
        }
        // If no, returns false otherwise
        return false;
    }

    /**
     * This method is used to detect if the User is an instance of Organization Representative
     * @param OrgRepUsername @param OrgRepPwd
     * @return boolean
     */
    public boolean DetectUserOrgRep(String OrgRepUsername, String OrgRepPwd){
        // Get the User object using stream() and lambda expressions
        User myUser = userList.stream()
            .filter(dctUser -> dctUser.getUsername().equals(OrgRepUsername) && dctUser.getPassword().equals(OrgRepPwd))
            .findAny().orElse(null);
        // Condition If the user is null
        if(myUser == null){
            return false; // Returns false
        }

        // Condition if the User is an instance of Organization Representative
        if(myUser.isOrgRep() == true){
            // Returns true (If yes)
            return true;
        }
        else {
            // Returns false otherwise (If no)
            return false;
        }
    }

    /**
     * This method is used to detect if the User is an instance of Applicant
     * @param AppUsername @param AppPwd
     * @return boolean
     */
    public boolean DetectUserApplicant(String AppUsername, String AppPwd){
        // Get the User object using stream() and lambda expressions
        User myUser = userList.stream()
            .filter(dctUser -> dctUser.getUsername().equals(AppUsername) && dctUser.getPassword().equals(AppPwd))
            .findAny().orElse(null);
        // Condition if the user is null
        if(myUser == null){
            return false; // Returns false
        }

        // Condition if the User is an instance of Applicant
        if(myUser.isApplicant() == true){
            // Returns true (If yes)
            return true; 
        }
        else {
            // Returns false (If no)
            return false;
        }
    }
}