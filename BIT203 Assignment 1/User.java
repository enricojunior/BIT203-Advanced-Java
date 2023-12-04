/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297
 * User.java
 * Date: 09-11-2023
 * This part is completed
 * 
 */

// Import Random to generate username and password
import java.util.Random;

/**
 * User is an abstract and super class
 * It has two types of subclass such as OrganizationRep and Applicant
 * 
 * Furthermore, it also implements Comparable to sort the collections
 */
abstract public class User implements Comparable<User> {
    // List of the attributes
    private String username;
    private String password;
    private String fullName;
    private String email;
    private int mobileNo;

    /**
     * Parameter Constructor
     * @param fullName @param email @param mobileNo
     * The constructor is used to initialize all of the required data fields
     */
    public User(String fullName, String email, int mobileNo){
        this.username = GenUsername(username);
        this.password = GenPassword(password);
        this.fullName = fullName;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    /**
     * Default Constructor
     * Takes no parameters - Initialize all of the values to default value
     */
    public User(){
        this.username = "defaultUser";
        this.password = "defaultPass";
        this.fullName = "defaultName";
        this.email = "default@gmail.com";
        this.mobileNo = 000;
    }

    /**
     * This method is used to set the User's Username
     * @param username
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * This method is used to set the User's Password
     * @param password
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * This method is used to set the User's Full Name
     * @param fullName
     */
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    /**
     * This method is used to set the User's Email
     * @param email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * This method is used to set the User's Mobile Number
     * @param mobileNo
     */
    public void setMobileNo(int mobileNo){
        this.mobileNo = mobileNo;
    }

    /**
     * This method is used to get the User's Username
     * @return username - String
     */
    public String getUsername(){
        return username;
    }

    /**
     * This method is used to get the User's Password
     * @return password - String
     */
    public String getPassword(){
        return password;
    }

    /**
     * This method is used to get the User's Full Name
     * @return fullName - String 
     */
    public String getFullName(){
        return fullName;
    }

    /**
     * This method is used to get the User's Email
     * @return email - String
     */
    public String getEmail(){
        return email;
    }

    /**
     * This method is used to get the User's Mobile Number
     * @return mobileNo - int
     */
    public int getMobileNo(){
        return mobileNo;
    }

    /**
     * toString() method
     * This method is used to return the details of the User
     * @return UserDet - String, Overriden Method
     */
    @Override
    public String toString(){
        // Initialize the UserDet to empty string
        String UserDet = "";
        // Add the details of the User to the CtrDet
        UserDet += "[ Username: " + username + ", Password: " + password + ", Full Name: " + fullName +
            ", Email: " + email + ", Mobile No: " + mobileNo + " ]";
        // Return the whole details in String value
        return UserDet;
    }

    /**
     * This method is used to generate a unique username to a desired User
     * @param Username
     * @return finalUserName - String
     */
    public String GenUsername(String Username){
        // List of the required attributes
        // Get the collections of uppercase + lowercase letters and numbers
        String upperCol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCol = "abcdefghijklmnopqrstuvwxyz";
        String numCol = "0123456789";

        // Gather all three elements to generate username
        Username = upperCol + lowerCol + numCol;

        // Initialize the username's length to 7
        int UNameLength = 7;
        char[] UName = new char[UNameLength];
        // Create a new random object rUName
        Random rUName = new Random();

        for(int i = 0; i < UNameLength; i++){
            UName[i] = Username.charAt(rUName.nextInt(Username.length()));
        }
        // Set the Final Username accordingly
        String finalUserName = new String(UName);
        // Return the final product
        return finalUserName;
    }

    /**
     * This method is used to generate a unique password to a desired User
     * @param Password
     * @return finalPwd - String
     */
    public String GenPassword(String Password){
        // List of the required attributes
        // Get the collections of lowercase letters and numbers
        String lowerCol = "abcdefghijklmnopqrstuvwxyz";
        String numCol = "0123456789";

        // Gather all two elements to generate password
        Password = lowerCol + numCol;

        // Initialize the password's length to 5
        int PwdLength = 5;
        char[] Pwd = new char[PwdLength];
        // Create a new random object rPwd
        Random rPwd = new Random();

        for(int i = 0; i < PwdLength; i++){
            Pwd[i] = Password.charAt(rPwd.nextInt(Password.length()));
        }

        // Set the Final Password accordingly
        String finalPwd = new String(Pwd);
        // Return the final product 
        return finalPwd;
    }

    /**
     * This method is used to check if the User 
     * is an instance of Organization Representative
     * @return boolean
     */
    public boolean isOrgRep(){
        // Check if the User an instance of Organization Representative
        if(this instanceof OrganizationRep){
            // Returns true (If yes)
            return true;
        }
        // Returns false otherwise (If no)
        return false;
    }

    /**
     * This method is used to check if the User 
     * is an instance of Applicant
     * @return boolean
     */
    public boolean isApplicant(){
        // Check if the User an instance of Organization Representative
        if(this instanceof Applicant){
            // Returns true (If yes)
            return true;
        }
        // Returns false otherwise (If no)
        return false;
    }

    /**
     * This method is used to compare the User by Full Name
     * @param dctUser
     */
    public int compareTo(User dctUser){
        // Check if its an identical object
        if(this == dctUser){
            return 0;
        }
        // applying string to compare according to the User's Full Name
        return (this.getFullName().compareTo(dctUser.fullName));
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof User)){
            return false;
        }
        User myUser = (User) obj;
        if(myUser.getUsername().equals(this.username)){
            return true;
        }
        else {
            return false;
        }
    }
}