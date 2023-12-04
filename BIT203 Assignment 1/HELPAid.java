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

/**
 * The HELPAid class has a special purpose where this class maintain 
 * a collection of User objects, Organization objects, and Appeal objects
 * 
 * Furthermore, this class also contains special methods from various different 
 * classes where most of the methods indicated supports the console validations
 */
public class HELPAid {
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
        // Get each Users from the userList
        for(User myUser : getUserList()){
            // Check if the User is an instance of OrganizationRep
            if(myUser.isOrgRep()){
                // apply casting
                OrganizationRep dctOrg = ((OrganizationRep) myUser);
                // Add the registered Organization Representatives to the arrayList
                orgRepList.add(dctOrg);
            }
        }
        // Return list of registered Organization Representatives
        return orgRepList;
    }

    /**
     * This method is used to get the List of Registered Applicants
     * @return appList - ArrayList<Applicant>
     */
    public ArrayList<Applicant> getApplicantList(){
        // Create an empty Applicant ArrayList
        ArrayList<Applicant> appList = new ArrayList<>();
        // Get each Users from the userList
        for(User myUser : getUserList()){
            // Check if the User is an instance of Applicant
            if(myUser.isApplicant()){
                // apply casting
                Applicant dctApp = ((Applicant) myUser);
                // // Add the registered Applicants to the arrayList
                appList.add(dctApp);
            }
        }
        // Return list of registered Applicants
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
        for(Appeal CrAppeal : getAppealList()){
            // Condition if the outcome status is set to PENDING
            if(CrAppeal.getOutcome().equals("PENDING")){
                // Add the appeals with the outcome status of PENDING
                CrAppealList.add(CrAppeal);
            }
        }
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
        for(Appeal CrSpcAppeal : getAppealList()){
            // Check if the status is set to PENDING and the Appeal is made by this Organization
            if(CrSpcAppeal.getOutcome().equals("PENDING") && CrSpcAppeal.getThisOrg() == thisOrg){
                // Add the appeals to the ArrayList
                CrSpcAppealList.add(CrSpcAppeal);
            }
        }
        // Return the List of Current Appeals
        return CrSpcAppealList;
    }

    /**
     * This method is used to get the List of Past Appeals
     * @return PstAppealList - ArrayList<Appeal>
     */
    public ArrayList<Appeal> getPstAppealList(){
        // Create new empty Appeal ArrayList
        ArrayList<Appeal> PstAppealList = new ArrayList<>();
        // Get each past appeals in the List of Appeals
        for(Appeal PstAppeal : getAppealList()){
            // Condition if the outcome status is set to APPROVED
            if(PstAppeal.getOutcome().equals("APPROVED")){
                // Add the appeals with the outcome status of APPROVED
                PstAppealList.add(PstAppeal);
            }
        }
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
        // Get each registered organizations in the list of organizations
        for(Organization myOrg : orgList){
            // Condition if the organization was found by ID
            if(myOrg.getOrgID() == designatedID){
                // Returns true (If found)
                return true;
            }
        }
        // Returns false otherwise (If not found)
        return false;
    }

    /**
     * This method is used to check if the Appeal exists in the ArrayList
     * @param designatedID
     * @return boolean 
     */
    public boolean foundAplByID(int designatedID){
        // Get each Appeals in the List of Appeals
        for(Appeal myApl : appealList){
            // Condition if the Appeal was found by ID
            if(myApl.getAppealID() == designatedID){
                // Returns true (If found)
                return true;
            }
        }
        // Returns false otherwise (If not found)
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
        // Get each Users from the userList
        for(User myUser : userList){
            // Check if the User is an instance of Applicant
            if(myUser.isApplicant()){
                Applicant sctApplicant = ((Applicant) myUser);
                // Check if the Specified Organization ID was found
                if(sctApplicant.getSpecifiedOrg().getOrgID() == orgID){
                    // Add the registered applicants to the arrayList
                    getAplByOrgIDList.add(sctApplicant);
                }
            }
        }
        // Returns the List of Applicants
        return getAplByOrgIDList;
    }

    /**
     * This method is used to get a singular Applicant by specified ID
     * @param sctID
     * @return sctApplicant - Applicant
     */
    public Applicant getApplicantByID(int sctID){
        // Get each Users from the ArrayList
        for(User myUser : userList){
            // Check if the User is an instance of Applicant
            if(myUser.isApplicant()){
                Applicant sctApplicant = ((Applicant) myUser);
                // Check if the Applicant's ID was found
                if(sctApplicant.getIDNo() == sctID){
                    // Return the specified Applicant (If found)
                    return sctApplicant;
                }
            }
        }
        // Return null (If not found)
        return null;
    }

    /**
     * This method is used to check and verify the Applicant by ID
     * @param sctID
     * @return boolean
     */
    public boolean VerifyAppByID(int sctID){
        // Get each Users from the ArrayList
        for(User myUser : userList){
            // Check if the User is an instance of Applicant
            if(myUser.isApplicant()){
                Applicant sctApplicant = ((Applicant) myUser);
                // Check if the Applicant's ID was found
                if(sctApplicant.getIDNo() == sctID){
                    // Returns true (If found)
                    return true;
                }
            }
        }
        // Returns false (If not found)
        return false;
    }

    /**
     * This method is used to get singular organization by ID
     * @param designatedID
     * @return myOrg - Organization
     */
    public Organization getOrganizationByID(int designatedID){
        // Get each Organizations from the ArrayList
        for(Organization myOrg : orgList){
            // Check if the Organization ID was found
            if(myOrg.getOrgID() == designatedID){
                // Returns the Organization object (If found)
                return myOrg;
            }
        }
        // Returns null otherwise (If not found)
        return null;
    }

    /**
     * This method is used to get singular Appeal by ID
     * @param designatedID
     * @return myApl - Appeal
     */
    public Appeal getAppealByID(int designatedID){
        // Get each Appeals in the ArrayList
        for(Appeal myApl : appealList){
            // Check if the Appeal was found by ID
            if(myApl.getAppealID() == designatedID){
                // Returns the Appeal object (If found)
                return myApl;
            }
        }
        // Returns null otherwise (If not found)
        return null;
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