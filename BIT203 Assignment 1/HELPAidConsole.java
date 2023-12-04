/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297
 * HELPAidConsole.java
 * This code was compiled using Visual Studio Code (Blue Colored Icon)
 * Assignment 1 BIT203
 * Date: 09-11-2023
 * Current JDK Version (javac version) : 19
 * Java(TM) SE Runtime Environment (build 19+36-2238)
 * 
 */

// LIST OF THE UTILITIES REQUIRED FOR THE CONSOLE
import java.util.*;
import java.util.stream.Stream; // Implementing stream() and few lambda expressions
import java.util.ArrayList;
import java.util.Iterator; // Implementing iterator to iterate the collections
import java.time.LocalDate; // Get the Current Date for the Received Date

/**
 * The HELPAidConsole is a driver program that controls the system of the HELP Aid Management
 * It carries the functionalities needed from every single class that are considered as fragment
 * Here, I designed with some of the additional methods that supports the main function
 */
public class HELPAidConsole {
    // List of the declared static variables
    // This is used to ensure that all variables will be recognized globally by all methods
    // Declare single working HELPAid Object for the HELPAid class
    private static HELPAid HELPAid = new HELPAid();
    // This static variable is used to monitor which selected Organization from the Organization Representatives
    private static Organization selectedOrg = null;
    // This static variable is used to monitor which User is current logging in to the HELPAid system
    private static User selectedUser = null;

    /**
     * {@Description} This method below is used to create a new appeal 
     * object and returns the Appeal object that was created
     * @return newApl - Appeal
     */
    public static Appeal CreateNewApl(){
        while(true){
            try {
                // Set the Choosed Organization Representative according 
                // to the User from the instance of OrganizationRep that's currently logging in
                OrganizationRep choosedOrgRep = ((OrganizationRep) selectedUser);

                // Declare list of the required variables
                String AplfromDate, ApltoDate, AplDsc, AplOct;
                // Prompts the OrgRep to enter the Appeal's from date 
                Stream.of("Enter the Appeal's From Date (Format: dd-mm-yyyy): ").forEach(System.out::print);
                AplfromDate = (System.console().readLine());
                // Check if the Appeal's From Date is valid or not
                if(!HELPAid.isValidDate(AplfromDate)){
                    // If the date is invalid, cancel the Appeal's registration and display the following message
                    Stream.of("System: Invalid From Date Detected", "System: Returning to the main menu..").forEach(System.out::println);
                    OrganizationRepMenu();
                }
                // Prompts the OrgRep to enter the Appeal's to date
                Stream.of("Enter the Appeal's To Date (Format: dd-mm-yyyy): ").forEach(System.out::print);
                ApltoDate = (System.console().readLine()); 
                // Check if the Appeal's To Date is valid or not
                if(!HELPAid.isValidDate(ApltoDate)){
                    // If the date is invalid, cancel the Appeal's registration and display the following message
                    Stream.of("System: Invalid To Date Detected", "System: Returning to the main menu..").forEach(System.out::println);
                    OrganizationRepMenu();
                }
                // Check if the Appeal's date range is valid or not
                if(!HELPAid.isValidRange(AplfromDate, ApltoDate)){
                    // If the date range is invalid, cancel the Appeal's registration and display the following message
                    Stream.of("System: Invalid date range!", "System: Returning to the main menu..").forEach(System.out::println);
                    OrganizationRepMenu();
                }
                // Prompts the OrgRep to enter the Appeal's description
                Stream.of("Enter the Appeal's Description: ").forEach(System.out::print);
                AplDsc = (System.console().readLine());
                // Set the Appeal's Outcome to PENDING, means that it'll be attached to List of Current Appeals
                AplOct = "PENDING";
                // A message will be displayed if the appeal's added successfully
                Stream.of("\nSystem: Successfully added new appeal..").forEach(System.out::println);
                // Create the Appeal Object
                Appeal newApl = new Appeal(AplfromDate, ApltoDate, AplDsc, AplOct, choosedOrgRep.getThisOrg());
                // System will display the Generated Appeal ID according to user's input
                Stream.of("\nSystem: Generated Appeal ID: " + newApl.getAppealID()).forEach(System.out::println);
                // Returns the created Appeal object
                return newApl;
            }
            catch(Exception e){
                // Catch an exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    }
    /**
     * {@Description} The method below is used to create a new Organization
     * Takes no parameters, @return newOrganization
     */
    public static Organization CreateNewOrg(){
        while(true){
            try {
                // List of the declared variables
                String name, address;
                // Prompts the Admin to enter the Organization's Name
                Stream.of("Enter the Organization Name: ").forEach(System.out::print);
                name = (System.console().readLine());
                // Prompts the Admin to enter the Organization's Address
                Stream.of("Enter the Organization Address: ").forEach(System.out::print);
                address = (System.console().readLine());
                // Check if the Organization has already been registered to the system to prevent duplicated data
                if(HELPAid.getOrgList().stream().anyMatch(dct -> dct.getOrgName().equals(name) && dct.getAddress().equals(address))){
                    // If found and match, returns a message that the organization has already been registered
                    Stream.of("\nSystem: This Organization has already been registered.."
                        , "System: Returning to the HELP Aid Admin Menu..").forEach(System.out::println);
                    // Returns the HELP Aid Admin Menu..
                    HELPAidAdminMenu();
                }
                else {
                    // If not found, returns a message where the organization's successfully added to the list 
                    Stream.of("System: Successfully added a new organization..").forEach(System.out::println);
                    // Create a new object newOrganization
                    Organization newOrganization = new Organization(name, address);
                    // Display the details of the organizations, such as name, address, and it's ID
                    Stream.of("\nDetails of the Organization:", "Organization Name\t: " + newOrganization.getOrgName()
                            , "Organization Address\t: " + newOrganization.getAddress()
                            , "Organization ID\t\t: " + newOrganization.getOrgID()).forEach(System.out::println);
                    // Returns the newly created object
                    return newOrganization;
                }
            }
            catch(Exception e){
                // Catch an exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    } 
    /**
     * {@Description} This method is responsible on creating a new document to a specified Applicant
     * Organization Representative can create new document(s) to a specified Applicant
     * @param DctApplicant 
     * @return newDct - Document
     */
    private static Document CreateNewDoc(Applicant DctApplicant){
        while(true){
            try {
                // System will display the following message
                System.out.println("\n\nSystem: Uploading new document for Applicant..\n");
                // List of the declared variables
                String DocfileName, DocDescription;
                // Prompts the Organization Representative to enter the document's name
                Stream.of("Enter the document file name: ").forEach(System.out::print);
                DocfileName = (System.console().readLine());
                // Prompts the Organization Representative to enter the document's description
                Stream.of("Enter the document description: ").forEach(System.out::print);
                DocDescription = (System.console().readLine());
                // Display the following message that the document has successfully uploaded
                Stream.of("System: Successfully uploaded a document..\n").forEach(System.out::println);
                // Create a new Document object
                Document newDct = new Document(DocfileName, DocDescription, DctApplicant);
                // Display the details of the newly created object before proceeding to the next stat
                // Starting from the Generated ID, Document Name, and Document Description
                Stream.of("Details of the Document: \n", "Generated ID: " + newDct.getDocumentID()
                    , "Document Name: " + newDct.getFileName(), "Document Description: " + newDct.getDescription())
                        .forEach(System.out::println);
                System.out.println();
                // returns the newly created document
                return newDct;
            }
            catch(Exception e){
                // Catch an exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    }
    /**
     * {@Description} This method is responsible on displaying 
     * List of the current appeals from any organizations 
     * @return void (Non-returnable function)
     */
    public static void ShowAppeals(){
        System.out.println("List of Current Appeals: ");
        // Get each Appeals in the List of Appeals
        for(Appeal myAppeal : HELPAid.getAppealList()){
            // Check if the Appeal's outcome status is set to "PENDING"
            if(myAppeal.getOutcome().equals("PENDING")){
                // Display the details of the Appeals, from ID, description, outcome, and orgName
                System.out.println("Appeal ID: " + myAppeal.getAppealID() + " | Description: " 
                    + myAppeal.getAplDescription() + " | Outcome: " + myAppeal.getOutcome()
                    + " | Organization: " + myAppeal.getThisOrg().getOrgName() + " | ");
            }
        }
    }
    /**
     * {@Description} This method is responsible on displaying
     * List of the current appeals made by a specified organizations
     * @return void (Non-returnable function)
     */
    public static void ShowSpcOrgAppeals(Organization thisOrg){
        // Printed out the Organization Name
        System.out.println("List of Current Appeals from: " + thisOrg.getOrgName());
        // Get each current appeals in the list of current appeals
        for(Appeal myAppeal : HELPAid.getCrAppealList()){
            // Check if the Appeal was made by this organization
            if(myAppeal.getThisOrg() == thisOrg){
                // Display the details of the Appeals, from ID, description, outcome, and orgName
                System.out.println("Appeal ID: " + myAppeal.getAppealID() + " | Description: " 
                    + myAppeal.getAplDescription() + " | Outcome: " + myAppeal.getOutcome()
                    + " | Organization: " + myAppeal.getThisOrg().getOrgName() + " | ");
            }
        }
    }
    /**
     * {@Description} This method is used to create a new goods 
     * to a selected Appeal according to the Organization Representative or Donor
     * Takes no parameters, @return NewGoodCtb - Goods
     */
    private static Goods CreateNewGoods(Appeal DctAppeal){
        while(true){
            try {
                // Prompts the Organization Representative or Donor to enter the Goods description
                Stream.of("Enter the Goods's description: ").forEach(System.out::print);
                String GoodDesc = (System.console().readLine());
                // Prompts the Organization Representative or Donor to enter the Goods estimated value
                Stream.of("Enter the Goods's estimated value: ").forEach(System.out::print);
                int GoodEstValue = Integer.parseInt(System.console().readLine());
                // Get the current date and set the receivedDate to the current date
                LocalDate receivedGoodDate = LocalDate.now();
                // Display the following message that the Goods has successfully recorded
                Stream.of("\nSystem: Successfully added a new contribution..").forEach(System.out::println);
                // Create a new Goods object
                Goods NewGoodCtb = new Goods(receivedGoodDate, DctAppeal, GoodDesc, GoodEstValue);
                // returns the newly created Goods
                return NewGoodCtb;
            }
            catch(Exception e){
                // catch an exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    }
    /**
     * {@Description} This method is used to create a new Cash Donation 
     * to a selected Appeal according to the Organization Representative or Donor
     * Takes no parameters, @return NewGoodCtb - Goods
     */
    private static CashDonation CreateNewCashDonation(Appeal DctAppeal){
        while(true){
            try {
                // Prompts the Organization Representative to enter the cash amount
                Stream.of("Enter the cash amount: ").forEach(System.out::print);
                int CashCt = Integer.parseInt(System.console().readLine());
                // Prompts the Organization Representative to enter the payment channel
                Stream.of("Enter the payment channel: ").forEach(System.out::print);
                String Channel = (System.console().readLine());
                // Prompts the Organization Representative to enter the reference No
                Stream.of("Enter the reference number (Eg: RF305.202.395): ").forEach(System.out::print);
                String refNo = (System.console().readLine());
                // Get the current date and set the receivedDate to the current date
                LocalDate receivedCashDate = LocalDate.now();
                // Display the following message that the Cash Donation has successfully recorded
                Stream.of("\nSystem: Successfully added a new contribution..").forEach(System.out::println);
                // Create a new CashDonation object
                CashDonation NewCsCtb = new CashDonation(receivedCashDate, DctAppeal, CashCt, Channel, refNo);
                // returns the newly created CashDonation
                return NewCsCtb;
            }
            catch(Exception e){
                // catch an exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    } 
    /**
     * {@Description} This method is in charge of displaying the Organization Representative 
     * menu, if the User that is currently logging in is an instance of Organization Representative
     * Takes no parameters 
     */
    public static void OrganizationRepMenu(){
        // Set the OrgRepOpt to -1
        int OrgRepOpt = -1;
        while(true){
            // Display the Organization Representative Menu
            System.out.println("\nOrganization Representative Menu");
            System.out.println("----------------------------------");
            // The code below is used to display the Organization's name 
            // according to the Organization Representative that currently logging in
            System.out.println("Organization Name: " + ((OrganizationRep) selectedUser).getThisOrg().getOrgName());
            // List of the options that the Organization Representative could select using Stream.of()
            Stream.of("Welcome to the Organization Representative System\n", "[1] Register New Applicant"
                , "[2] Organize Aid Appeal", "[3] Record Contribution", "[4] Record Aid Disbursement"
                    , "\n[0] Log out as Organization Representative", "----------------------------------").forEach(System.out::println);
            // Get the current Representative that's currently logging in
            OrganizationRep selectedRep = ((OrganizationRep) selectedUser);
            try {
                // Prompts the Organization Representative to enter the choice
                System.out.print("Enter your choice: ");
                OrgRepOpt = Integer.parseInt(System.console().readLine());
                // Implementing switch-case
                switch(OrgRepOpt){
                    case 0:
                        // Case if the Organization Representative wants to log out from the console
                        // Display the following message if the Organization Representative chooses to log out
                        System.out.println("System: Logging out as Organization Representative..");
                        // Call the main method
                        main(null);
                        break;
                    case 1:
                        // Case if the Organization Representative wants to register a new applicant
                        try {
                            // List of the declared variables needed on registering the new applicant
                            String AppfullName, AppAddress, AppEmail, RepChoice = "defaultChoice";
                            int AppNoID, houseHDIncome, AppMobileNo;                          
                            // Prompts the Organization Representative to enter the Aid Applicant's full name
                            Stream.of("Enter the Aid Applicant's Full Name: ").forEach(System.out::print);
                            AppfullName = (System.console().readLine());
                            // Prompts the Organization Representative to enter the Aid Applicant's email
                            Stream.of("Enter the Aid Applicant's Email: ").forEach(System.out::print);
                            AppEmail = (System.console().readLine());
                            // Prompts the Organization Representative to enter the Aid Applicant's mobile number
                            Stream.of("Enter the Aid Applicant's Mobile Number (eg: 6288955): ").forEach(System.out::print);
                            AppMobileNo = Integer.parseInt(System.console().readLine());
                            // Prompts the Organization Representative to enter the Aid Applicant's ID No
                            Stream.of("Enter the Aid Applicant's ID Number: ").forEach(System.out::print);
                            AppNoID = Integer.parseInt(System.console().readLine());
                            // Prompts the Organization Representative to enter the Aid Applicant's address
                            Stream.of("Enter the Aid Applicant's Address: ").forEach(System.out::print);
                            AppAddress = (System.console().readLine());
                            // Prompts the Organization Representative to enter the Aid Applicant's household income
                            Stream.of("Enter the Aid Applicant's Household Income (RM) (eg: 3455, 5905): ").forEach(System.out::print);
                            houseHDIncome = Integer.parseInt(System.console().readLine());

                            // Check if the User data regardless from any instance has already been taken 
                            if(HELPAid.isUserTaken(AppfullName, AppEmail, AppMobileNo)){
                                // Display the following message if the data has already been taken
                                Stream.of("\nSystem: This data has already been taken!", "System: Returning to the Main menu..").forEach(System.out::println);
                                // Call the OrganizationRepMenu() method
                                OrganizationRepMenu();
                            }
                            // Check if there are any duplicate IDNo in the system
                            else if(HELPAid.DuplicateIDNo(AppNoID)){
                                // Display the following message if the system finds an identical Applicant's IDNo
                                Stream.of("\nSystem: Duplicate Applicant's ID No Detected!", "System: Returning to the Main Menu..").forEach(System.out::println);
                                OrganizationRepMenu();
                            }
                            else {
                                // Create a new object of Applicant
                                Applicant NewApplicant = new Applicant(AppfullName, AppEmail, AppMobileNo, AppNoID, AppAddress, houseHDIncome);
                                // Set the Applicant object's Specified Organization according to the selectedRep's organization
                                NewApplicant.setSpecifiedOrg(selectedRep.getThisOrg());
                                // Check if a duplicate username is detected in the collections
                                if(HELPAid.DuplicateUName(NewApplicant.getUsername())){
                                    // If found, the newly created object won't be added to the List of registered Users
                                    Stream.of("\nSystem: Duplicated Username Detected!", "Returning to the Main Menu..").forEach(System.out::println);
                                    // Call the OrganizationRepMenu() method
                                    OrganizationRepMenu();
                                }
                                else {
                                    // Display the following message if the Aid Applicant's has successfully registered
                                    Stream.of("\nSystem: Successfully registered a new applicant..\n").forEach(System.out::print);
                                    // Display the details of the Aid Applicant
                                    Stream.of("\nSystem: The Aid Applicant is registered under " + 
                                        selectedRep.getThisOrg().getOrgName() + " Organization..").forEach(System.out::println);           
                                    Stream.of("\nDetails of the Generated Identity: ", "Generated Username: " + NewApplicant.getUsername()
                                        , "Generated Password: " + NewApplicant.getPassword()).forEach(System.out::println);
                                    // Add the newly created Applicant to the HELPAid object
                                    HELPAid.addUser(NewApplicant);
                                    // Add the newly created Applicant under a specified Organization
                                    selectedRep.getThisOrg().addApplicant(NewApplicant);
                                    while(!(RepChoice.equalsIgnoreCase("N"))){
                                        // Call the method CreateNewDoc() with @param NewApplicant to create a new document
                                        Document newDocument = CreateNewDoc(NewApplicant);
                                        // Add the document to the respective New Applicant
                                        NewApplicant.addDocument(newDocument);
                                        // Prompts the Organization Representative if they want to attach another document to the respective New Applicant
                                        Stream.of("\nWould you like to attach another document? (Y/N): ").forEach(System.out::print);
                                        RepChoice = (System.console().readLine());
                                        // Check if the Organization Representative chooses no
                                        if(RepChoice.equalsIgnoreCase("N")){
                                            // This message will be displayed if the Organization Representative refuses to attach another document
                                            System.out.println("System: Returning back to the Organization Representative Menu..");
                                            // Call the OrganizationRepMenu() method
                                            OrganizationRepMenu();
                                        }
                                    }
                                }
                            }
                        }
                        catch(Exception e){
                            // catch an exception if the user input is invalid
                            System.out.println("\n\nError Exception: " + e.getMessage());
                        }
                        break;
                    case 2:
                        // Case if the Organization Representative wants to organize an Aid Appeal
                        try {
                            // Call the CreateNewApl object to get the Appeal object
                            Appeal newAppeal = CreateNewApl();
                            // Add the newly created Appeal to the collections of Appeals
                            HELPAid.addAppeal(newAppeal);
                        }
                        catch(Exception e){
                            // catch an exception if the user input is invalid
                            System.out.println("\n\nError Exception: " + e.getMessage());
                        }
                        break;
                    case 3:
                        // Case if the Organization Representative wants to record contribution
                        // Check if the current appeals made by a specific organization is empty
                        if(HELPAid.getCrAppealByOrg(selectedRep.getThisOrg()).isEmpty()){
                            // Display the following message that there aren't any current appeals
                            Stream.of("System: There aren't any current appeals yet..", "Returning to the Organization Representative Menu..")
                                .forEach(System.out::println);
                        }
                        // Check if there are any available current appeals made by a specific organization
                        else {
                            // Display the current appeals made by a specific organization
                            ShowSpcOrgAppeals(selectedRep.getThisOrg());
                            // Declare a variable selectID
                            int selectID;
                            // Prompts the Organization Representative to enter the Appeal's ID for the contribution
                            Stream.of("Select the Appeal ID for the contribution: ").forEach(System.out::print);
                            selectID = Integer.parseInt(System.console().readLine());
                            // Check if the Appeal's ID was found
                            if(HELPAid.foundAplByID(selectID)){
                                // Get the choosen Appeal object according to the selection
                                Appeal choosenAppeal = HELPAid.getAppealByID(selectID);
                                // Display the Appeal's fromDate and toDate
                                System.out.println("Details of the Choosen Appeal: \n");
                                Stream.of("Appeal's From Date: " + choosenAppeal.getFromDate(), "Appeal's To Date: "
                                    + choosenAppeal.getToDate()).forEach(System.out::println);
                                // Call the ContributionTypeMenu() to display the contibution menu
                                ContributionTypeMenu();
                                // Prompts the Organization Representative to enter the contribution type
                                Stream.of("\nChoose the contribution type: ").forEach(System.out::print);
                                int CtType = Integer.parseInt(System.console().readLine());
                                // Implementing switch-case
                                switch(CtType){
                                    case 1:
                                        // Case if the Organization Representative chooses to contribute Goods
                                        try {
                                            // Call the CreateNewGoods() method to create a new Goods contribution
                                            Goods newGoods = CreateNewGoods(choosenAppeal);
                                            // Display the Contribution's Generated ID
                                            Stream.of("\nSystem: Generated ID: " + newGoods.getContributionID()).forEach(System.out::println);
                                            // Add the contribution to the choosen Appeal 
                                            choosenAppeal.addContribution(newGoods);
                                        }
                                        catch(Exception e){
                                            // catch an exception if the User input is invalid 
                                            System.out.println("\n\nError Exception: " + e.getMessage());
                                        }
                                        break;
                                    case 2:
                                        // Case if the Organization Representative chooses to contribute Cash Donation
                                        try {
                                            // Call the CreateNewCashDonation() method to create a new Cash Donation contribution
                                            CashDonation newCsDonation = CreateNewCashDonation(choosenAppeal);
                                            // Display the Contribution's Generated ID
                                            Stream.of("\nSystem: Generated ID: " + newCsDonation.getContributionID()).forEach(System.out::println);
                                            // Add the contribution to the choosen Appeal
                                            choosenAppeal.addContribution(newCsDonation);
                                        }
                                        catch(Exception e){
                                            // catch an exception if the User input is invalid
                                            System.out.println("\n\nError Exception: " + e.getMessage());
                                        }
                                        break;
                                    default:
                                        // Case if the selection is invalid
                                        // Display the following message if the Organization Representative's input is invalid
                                        Stream.of("System: Invalid selection!"
                                            , "System: Returning to the Organization Representative Menu").forEach(System.out::println);
                                        // Call the OrganizationRepMenu() method
                                        OrganizationRepMenu();
                                        break;
                                }
                            }
                            // Check if the Appeal's ID is not found
                            else {
                                // Display the following message if the Appeal's not found in the list
                                Stream.of("System: Unable to find the specified Appeal!"
                                    , "System: Returning to the Organization Representative Menu..").forEach(System.out::println);
                                // Call the OrganizationRepMenu() method
                                OrganizationRepMenu();
                            }
                        }
                        break;
                    case 4:
                        // Case if the Organization Representative wants to record an aid disbursement
                        // Check if the List of Current Appeals made by a specific organization is empty
                        if(HELPAid.getCrAppealByOrg(selectedRep.getThisOrg()).isEmpty()){
                            // It will display the following message if there aren't any appeals made by a specific organization
                            Stream.of("System: There aren't any current appeals yet..", "Returning to the Organization Representative Menu..")
                                .forEach(System.out::println);
                        }
                        // Check if there are any available current appeals
                        else { // else start-bracket
                            // Call the ShowSpcOrgAppeals() method to display the current appeals
                            ShowSpcOrgAppeals(selectedRep.getThisOrg());
                            // Declare variable selectID
                            int selectID;
                            // Prompts the Organization Representative to select the Appeal ID
                            Stream.of("Select the Appeal ID for the Aid Disbursement: ").forEach(System.out::print);
                            selectID = Integer.parseInt(System.console().readLine());
                            // Check if the Appeal was found by ID
                            if(HELPAid.foundAplByID(selectID)){
                                // Get the selected Appeal object
                                Appeal sctAppeal = HELPAid.getAppealByID(selectID);
                                // Display the selected Appeal's From Date and To Date
                                System.out.println("Details of the Selected Appeal: ");
                                Stream.of("Appeal's From Date: " + sctAppeal.getFromDate(), "Appeal's To Date: " + sctAppeal.getToDate())
                                    .forEach(System.out::println);
                                System.out.println();
                                // Condition if there aren't any contributions for the selected Appeal
                                if(sctAppeal.getContributionList().isEmpty()){
                                    // It will display the following message and returns back to the Main Menu
                                    Stream.of("System: There aren't any contributions available for the choosen Appeal!",
                                        "System: Returning back to the Organization Representative Menu..")
                                            .forEach(System.out::println);
                                    // Call the OrganizationRepMenu()
                                    OrganizationRepMenu();                                 
                                }
                                // Condition if the contributions made are available for the selected Appeal
                                else {
                                    // Display each contributions from Organization Representative and Donor
                                    Stream.of("List of the Contributions: ").forEach(System.out::println);
                                    for(Contribution myCtr : sctAppeal.getContributionList()){
                                        System.out.println(myCtr.getContributionType() + " - " + myCtr.toString());
                                    }
                                    // Continuous options if the Organization Representative wishes 
                                    // to view registered Applicants from a specified Organization
                                    System.out.println("Continuous Options: ");
                                    System.out.println("--------------------");
                                    Stream.of("[1] View Applicants", "\n[0] Back to Menu", 
                                        "--------------------").forEach(System.out::println);
                                    // Prompts the Organization Representative to enter their option
                                    System.out.print("Select your option: ");
                                    int CtOpt = Integer.parseInt(System.console().readLine());
                                    // Implements switch-case
                                    switch(CtOpt){
                                        case 0:
                                            // Case if the Organization Representative wants to return back to the main menu
                                            // It will display the following message if the Organization Representative wants to return back
                                            System.out.println("System: Returning back to Organization Representative Menu..");
                                            // Call the OrganizationRepMenu() method
                                            OrganizationRepMenu();
                                            break;
                                        case 1:
                                            // Case if the Organization Representative wants to View Applicants
                                            // Check if there aren't any registered Applicants under a specified organization
                                            if(selectedRep.getThisOrg().getAppList().isEmpty()){
                                                // Display the following message if there aren't any registered applicants
                                                System.out.println("System: There aren't any registered applicant under this organization..");
                                                // Call the OrganizationRepMenu() method
                                                OrganizationRepMenu();
                                            }
                                            // Condition if there are available registered Applicants
                                            else {
                                                // Declare list of the required variables
                                                int sctApplicantID = -10;
                                                String ctMyChoice = "def";
                                                // Perform looping, in case the Organization Representative wants to record another Aid disbursement
                                                while(true){
                                                    // Display list of the registered Applicant under a specified organization
                                                    System.out.println("\nList of the Registered Applicant under " + 
                                                        selectedRep.getThisOrg().getOrgName() + " Organization...");
                                                    // The details of the Applicant's ID, Email, and Mobile Number is shown
                                                    for(Applicant MyApplicant : HELPAid.getRegAppByOrgID(selectedRep.getThisOrg().getOrgID())){
                                                        System.out.println("Applicant ID: " + MyApplicant.getIDNo() + ", Applicant Email: " + 
                                                            MyApplicant.getEmail() + ", Applicant Mobile Number: " + MyApplicant.getMobileNo());
                                                    }
                                                    // Prompts the Organization Representative to select the Applicant's ID for the disbursement
                                                    Stream.of("Select the Applicant's ID No for the disbursement: ").forEach(System.out::print);
                                                    sctApplicantID = Integer.parseInt(System.console().readLine());
                                                    // Prompts the Organization Representative if they wish to view the Applicant's documents
                                                    Stream.of("Would you like to view the Applicant's documents? (Y/N): ").forEach(System.out::print);
                                                    ctMyChoice = (System.console().readLine());
                                                    // Condition if the Applicant was not found
                                                    if(!(HELPAid.VerifyAppByID(sctApplicantID))){
                                                        // Display the following message if the specified Applicant was not found by ID
                                                        // Returning back to the Organization Representative Menu
                                                        Stream.of("System: Unable to find the specified Applicant!", 
                                                                  "System: Returning to the Organization Representative Menu..").forEach(System.out::println);
                                                        // Call the OrganizationRepMenu() method
                                                        OrganizationRepMenu();
                                                    }
                                                    // Condition if the Applicant was found
                                                    else {
                                                        // Get the choosen Applicant by selected ID
                                                        Applicant choosenApplicant = HELPAid.getApplicantByID(sctApplicantID);
                                                        // Display details of the Applicant
                                                        System.out.println("Details of the Applicant: ");
                                                        // The Applicant's name, address, and household income is shown
                                                        Stream.of("Applicant's Name: " + choosenApplicant.getFullName()
                                                                , "Applicant's Address: " + choosenApplicant.getAddress()
                                                                , "Applicant's Household Income: " + choosenApplicant.getHouseholdIncome())
                                                                .forEach(System.out::println);
                                                        System.out.println();
                                                        // Condition if the Organization Representative wishes to check the Applicant's Document
                                                        if(ctMyChoice.equalsIgnoreCase("Y")){
                                                            // Get all of the documents from the choosen Appeal
                                                            for(Document ViewDoc : HELPAid.getDocList(choosenApplicant, selectedRep)){
                                                                Stream.of(ViewDoc.toString() + "\n").forEach(System.out::println);
                                                            }
                                                        }
                                                        // Prompts the Organization Representative to enter the disbursement's date
                                                        Stream.of("Enter the Disbursement Date (Format: dd-mm-yyyy): ").forEach(System.out::print);
                                                        String dsDate = (System.console().readLine());
                                                        // Check if the disbursement date is valid or not
                                                        if(!HELPAid.isValidDate(dsDate)){
                                                            // If the disbursement date is invalid, cancel the recording of the aid disbursement and display the following message
                                                            Stream.of("System: Invalid Disbursement Date!", "System: Returning to the main menu..").forEach(System.out::println);
                                                            OrganizationRepMenu();
                                                        }
                                                        // Prompts the Organization Representative to enter the disbursement's cash amount
                                                        Stream.of("Enter the Cash Amount: ").forEach(System.out::print);
                                                        int csAmount = Integer.parseInt(System.console().readLine());
                                                        // Prompts the Organization Representative to enter the goods disbursed
                                                        Stream.of("Enter the Good's Disbursed: ").forEach(System.out::print);
                                                        int gdDis = Integer.parseInt(System.console().readLine());
                                                        // This message will be displayed if the aid disbursement has been sucessfully recorded 
                                                        Stream.of("\nSystem: Successfully recorded new aid disbursement..\n").forEach(System.out::print);
                                                        // Create a Disbursement object 
                                                        Disbursement newDisburs = new Disbursement(dsDate, csAmount, gdDis, sctAppeal, choosenApplicant);
                                                        // Change the Appeal's outcome status to APPROVED
                                                        newDisburs.getThisAppeal().setOutcome("APPROVED");
                                                        // Add the disbursement object to the choosen Applicant
                                                        choosenApplicant.addDisbursement(newDisburs);
                                                        // Prompts the Organization Representative if they wish to add another disbursement
                                                        Stream.of("Do you wish to add another disbursements to applicants? (Y/N): ").forEach(System.out::print);
                                                        String ctChoice = (System.console().readLine());
                                                        // Check if the option is yes
                                                        if(ctChoice.equalsIgnoreCase("Y")){
                                                            // if yes, continue from the beginning 
                                                            continue;
                                                        }
                                                        // Check if the option is no
                                                        else {
                                                            // If no, return back to the Organization Representative Menu
                                                            Stream.of("System: Returning to the Organization Representative Menu..")
                                                                .forEach(System.out::println);
                                                            OrganizationRepMenu();
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            // Default-case
                                            // If the Organization Representative option is invalid, display the following message
                                            Stream.of("System: Invalid Choice!", 
                                                "System: Returning back to Organization Representative Menu..").forEach(System.out::println);
                                            // Call the OrganizationRepMenu() method
                                            OrganizationRepMenu();
                                            break;
                                    }
                                }
                            }
                            // Check if the Appeal's not found
                            else {
                                // If the Appeal's not found, display the following message
                                System.out.println("System: Unable to find the specified Appeal!");
                                // Call the OrganizationRepMenu() method
                                OrganizationRepMenu();
                            }
                        } // else end-bracket
                        break;
                    default:
                        // Default-case
                        // If the Organization Representative option is invalid, display the following message
                        Stream.of("System: Invalid option!", "System: Please try it again!").forEach(System.out::println);
                        break;
                }
            }
            catch(Exception e){
                // catch an exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    }
    /**
     * {@Description} This method is in charge of controlling Applicant's Login Menu
     * In this Login Controller, Applicant has given option to view aid disbursement
     * Takes no parameters
     */
    private static void ApplicantLoginController(){
        // Initialize AptCtrlOpt to -1 (Set to default)
        int AptCtrlOpt = -1;
        // Get the Applicant object according to the current logged in user
        Applicant sctApplicant = ((Applicant) selectedUser);
        while(true){ // while loop start-bracket
            // Display the Applicant's Login Controller menu 
            System.out.println("\nHELP Aid Applicant Login Menu");
            System.out.println("-------------------------------");
            // Get the Applicant's Full Name
            System.out.println("Login as: " + sctApplicant.getFullName());
            Stream.of("Welcome to the HELP Aid Applicant Login Menu\n", "[1] View Aid Disbursement"
                , "\n[0] Log Out as HELP Aid Applicant").forEach(System.out::println);
            try {
                System.out.println("-------------------------------");
                // Prompts the Applicant to enter the choice
                System.out.print("Enter your choice: ");
                AptCtrlOpt = Integer.parseInt(System.console().readLine());
                // Implementing switch-case
                switch(AptCtrlOpt){
                    case 0:
                        // Case if the Applicant wants to logging out from the console
                        // Display the following message, if the Applicant wants to logging out
                        System.out.println("System: Logging out as HELP Aid Applicant..");
                        // Call the ApplicantMenu() method
                        ApplicantMenu();
                        break;
                    case 1:
                        // Case if the Applicant wants to view given disbursement(s)
                        // Check if there aren't any disbursement(s) given to a specified Applicant
                        if(!(HELPAid.isDisbursementExist(sctApplicant, sctApplicant.getIDNo()))){
                            // Display the following message, if there aren't any disbursement(s)
                            Stream.of("System: There aren't any given disbursement for Applicant : " + sctApplicant.getFullName()
                                , "System: Returning to the Applicant's Main Menu..").forEach(System.out::println);
                        }
                        // Check if there are available disbursement(s) given to the Applicant
                        else {
                            // Get the disbursements list given to a specified Applicant
                            ArrayList<Disbursement> disbursements = HELPAid.getDisbursByApp(sctApplicant, sctApplicant.getIDNo());
                            // Display all of the given disbursement(s) using stream() and lambda expression
                            Stream.of("List of the Disbursement given from the Organizations: ").forEach(System.out::println);
                            disbursements.stream().forEach(tcx -> System.out.println(tcx));
                        }
                        break;
                    default:
                        // Case if the Applicant's option is out of range
                        // Display the following message, if the Applicant's option is not valid
                        Stream.of("System: Invalid option!", "System: Please try it again!").forEach(System.out::println);
                        break;
                }
            }
            catch(Exception ex){
                // catch an error exception if the user input is invalid
                System.out.println("\n\nError Exception: " + ex.getMessage());
            }
        }
    }
    /**
     * {@Description} This method is used to display the HELP Aid Applicant's Menu
     * There's an option whether the Applicant wants to register themselves by online without relying on Organization Representative
     * Takes no parameters
     */
    public static void ApplicantMenu(){
        // Initialize the ApplicantOpt to -1 (set to default)
        int ApplicantOpt = -1;
        while(true){
            // Display the HELP Aid Applicant's Menu
            System.out.println("\nHELP Aid Applicant Menu");
            System.out.println("-------------------------");
            Stream.of("Welcome to the HELP Aid Applicant System\n", "[1] Applicant Self-Registration", "[2] Login as Applicant"
                , "\n[0] Log out as HELP Aid Applicant", "-------------------------").forEach(System.out::println);
            try {
                // Prompts the Applicant to enter the choice
                System.out.print("Enter your choice: ");
                ApplicantOpt = Integer.parseInt(System.console().readLine());
                // Implementing switch-case
                switch(ApplicantOpt){
                    case 0:
                        // Case if the Applicant wants to logging out from console
                        // Display the following message, if the Applicant wants to logging out
                        System.out.println("System: Logging out as HELP Aid Applicant..");
                        // Returns to the main method
                        main(null);
                        break;
                    case 1:
                        try {
                            // Condition if there aren't any registered organization(s)
                            if(HELPAid.getOrgList().isEmpty()){
                                // Display the following message, if there aren't any registered organizations
                                Stream.of("System: There aren't any registered organizations..", 
                                          "System: Returning to the HELP Aid Admin Menu..").forEach(System.out::println);
                                // Returns to the ApplicantMenu() method 
                                ApplicantMenu();
                            }
                            // Check if there are any available registered organization(s)
                            else {
                                // List of the declared variables
                                String RegfullName, RegEmail, RegAddress, RegChoice = "defaultChoice";
                                int RegAppNoID, ReghouseHDIncome, RegAppMobileNo, chooseOrgID = -1;
                                // Get all of the registered organizations
                                ArrayList<Organization> ListofOrg = HELPAid.getOrgList();
                                // Display list of the registered organizations using stream() and lambda 
                                System.out.println("\nList of the Registered Organizations: ");
                                ListofOrg.stream().forEach(tct -> System.out.println(tct));
                                // Prompts the Applicant to enter the Organization ID they would like to choose
                                Stream.of("\nChoose the Organization ID would you like to apply: ").forEach(System.out::print);
                                chooseOrgID = Integer.parseInt(System.console().readLine());
                                // Condition if the Organization was found by ID
                                if(HELPAid.foundOrgByID(chooseOrgID)){
                                    // Get the Organization object by the selected ID
                                    selectedOrg = HELPAid.getOrganizationByID(chooseOrgID);
                                    System.out.println("Choosed Organization: " + selectedOrg.getOrgName());                        
                                    // Prompts the Applicant to enter the full name
                                    Stream.of("Enter the Aid Applicant's Full Name: ").forEach(System.out::print);
                                    RegfullName = (System.console().readLine());
                                    // Prompts the Applicant to enter the email
                                    Stream.of("Enter the Aid Applicant's Email: ").forEach(System.out::print);
                                    RegEmail = (System.console().readLine());
                                    // Prompts the Applicant to enter the mobile number
                                    Stream.of("Enter the Aid Applicant's Mobile Number (eg: 6288955): ").forEach(System.out::print);
                                    RegAppMobileNo = Integer.parseInt(System.console().readLine());
                                    // Prompts the Applicant to enter the ID Number
                                    Stream.of("Enter the Aid Applicant's ID Number: ").forEach(System.out::print);
                                    RegAppNoID = Integer.parseInt(System.console().readLine());
                                    // Prompts the Applicant to enter the address
                                    Stream.of("Enter the Aid Applicant's Address: ").forEach(System.out::print);
                                    RegAddress = (System.console().readLine());
                                    // Prompts the Applicant to enter the household income
                                    Stream.of("Enter the Aid Applicant's Household Income (RM) (eg: 3455, 5905): ").forEach(System.out::print);
                                    ReghouseHDIncome = Integer.parseInt(System.console().readLine());
                                    // Check if the data has already been taken or not
                                    if(HELPAid.isUserTaken(RegfullName, RegEmail, RegAppMobileNo)){
                                        // Display the following message if the data has already been taken
                                        Stream.of("\nSystem: This data has already been taken!", "System: Returning to the main menu..")
                                            .forEach(System.out::println);
                                        ApplicantMenu();
                                    }
                                    // Check if there are any duplicate IDNo in the system
                                    else if(HELPAid.DuplicateIDNo(RegAppNoID)){
                                        // Display the following message if the system finds an identical Applicant's IDNo
                                        Stream.of("\nSystem: Duplicate Applicant's ID No Detected!", "System: Returning to the Main Menu..").forEach(System.out::println);
                                        ApplicantMenu();
                                    }
                                    // Check if the data is not taken
                                    else {
                                        // Create a new object of Applicant
                                        Applicant RegApplicant = new Applicant(RegfullName, RegEmail, RegAppMobileNo, RegAppNoID, RegAddress, ReghouseHDIncome);
                                        // set the Applicant's SpecifiedOrg to the selected Organization
                                        RegApplicant.setSpecifiedOrg(selectedOrg);
                                        // Check if a duplicate username is detected in the collections
                                        if(HELPAid.DuplicateUName(RegApplicant.getUsername())){
                                            // If found, the newly created object won't be added to the List of registered Users
                                            Stream.of("\nSystem: Duplicated Username Detected!", "Returning to the Main Menu..").forEach(System.out::println);
                                            // Call the ApplicantMenu() method
                                            ApplicantMenu();
                                        }
                                        else {
                                            // Display the following message if the Aid Applicant's has successfully registered
                                            Stream.of("\nSystem: Successfully registered a new applicant..\n").forEach(System.out::print);
                                            // Display the details of the Aid Applicant
                                            Stream.of("\nSystem: The Aid Applicant is registered under " + 
                                                selectedOrg.getOrgName() + " Organization..").forEach(System.out::println);
                                            Stream.of("\nDetails of the Generated Identity: ", "Generated Username: " + RegApplicant.getUsername()
                                                , "Generated Password: " + RegApplicant.getPassword()).forEach(System.out::println);
                                            // Add the newly created Applicant to the HELPAid object
                                            HELPAid.addUser(RegApplicant);
                                            // Add the newly created Applicant under a specified Organization
                                            selectedOrg.addApplicant(RegApplicant);
                                            while(!(RegChoice.equalsIgnoreCase("N"))){
                                                // Call the method CreateNewDoc() with @param RegApplicant to create a new document
                                                Document regDocument = CreateNewDoc(RegApplicant);
                                                // Add the document to the respective New Applicant
                                                RegApplicant.addDocument(regDocument);
                                                // Prompts the Applicant if they want to attach another document
                                                Stream.of("Would you like to attach another document? (Y/N): ").forEach(System.out::print);
                                                RegChoice = (System.console().readLine());
                                                // Check if the Applicant chooses no
                                                if(RegChoice.equalsIgnoreCase("N")){
                                                    // This message will be displayed if the Applicant refuses to attach another document
                                                    System.out.println("System: Returning back to the HELP Aid Applicant Menu..");
                                                    // Call the ApplicantMenu() method 
                                                    ApplicantMenu();
                                                }  // if end-bracket 
                                            } // while end-bracket
                                        } // else end-bracket
                                    }
                                }
                                // Check if the Organization is not found according to the selected ID
                                else {
                                    // If the organization is not found, it will display the message below
                                    Stream.of("System: Unable to find the organization!", "System: Returning back to the HELP Aid Applicant Menu..")
                                        .forEach(System.out::println);
                                    // Returns back to the Applicant Menu
                                    ApplicantMenu();
                                }
                            }
                        }
                        catch(Exception e){
                            // catch an error exception if the user input is invalid
                            System.out.println("\n\nError Exception: " + e.getMessage());
                        }
                        break;
                    case 2:
                        // Case if the Applicant wants to login
                        //List of the declared variables
                        String AppUsername, AppPwd;
                        // Prompts the Applicant to enter the username
                        Stream.of("Enter HELP Aid Applicant's Username: ").forEach(System.out::print);
                        AppUsername = (System.console().readLine());
                        // Prompts the Applicant to enter the password
                        Stream.of("Enter HELP Aid Applicant's Password: ").forEach(System.out::print);
                        AppPwd = (System.console().readLine());
                        // Check if the User wants to login is an instance of Applicant
                        if(HELPAid.DetectUserApplicant(AppUsername, AppPwd)){
                            // set the current selected user according to username and password
                            selectedUser = HELPAid.getUser(AppUsername, AppPwd);
                            // Display the following message, if both username and password are valid
                            System.out.println("System: Successfully login as Applicant..");  
                            // Calls the ApplicantLoginController() method                   
                            ApplicantLoginController();
                        }
                        // Check if the data input is not valid
                        else {
                            // Display the following message if either username or password is not valid
                            // Returns back to the Applicant Menu
                            Stream.of("System: Invalid Username or Password!", 
                                      "System: Returning back to HELP Aid Console..").forEach(System.out::println);
                            // Call the ApplicantMenu() method
                            ApplicantMenu();
                        }
                        break;
                    default:
                        // Case if the Applicant's option is out of range
                        // Display the following message, if the Applicant's option is invalid
                        Stream.of("System: Invalid option!", "System: Please try it again!").forEach(System.out::println);
                        break;
                }
            }
            catch(Exception e){
                // catch an error exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    }
    /**
     * {@Description} This method is in charge of displaying the HELP Aid Admin's Menu
     * Takes no parameters
     */
    public static void HELPAidAdminMenu(){
        // Initialize the AdminOpt to -1 (set to default)
        int AdminOpt = -1;
        while(true){
            // Display the HELP Aid Admin's Menu
            System.out.println("\nHELP Aid Admin Menu");
            System.out.println("---------------------");
            Stream.of("Welcome to the HELP Aid Admin System\n", "[1] Register New Organization", "[2] Manage Organization"
                , "\n[0] Log out as HELP Aid Admin", "---------------------").forEach(System.out::println);
            try {
                // Prompts the Admin to enter the choice
                System.out.print("Enter your choice: ");
                AdminOpt = Integer.parseInt(System.console().readLine());
                // Implementing switch-case
                switch(AdminOpt){
                    case 0:
                        // Case if the HELP Aid Admin wants to logging out from console
                        // Display the following message, if the HELP Aid Admin wants to logging out
                        System.out.println("System: Logging out as HELP Aid Admin..");
                        // Returns to the main method 
                        main(null);
                        break;
                    case 1:
                        // Case if the HELP Aid Admin wants to register a new organization
                        try {
                            // Call the CreateNewOrg() method to create a new organization
                            Organization newOrganization = CreateNewOrg();
                            // Add the newly created Organization object to the HELPAid object
                            HELPAid.addOrg(newOrganization);
                        }
                        catch(Exception e){
                            // catch an exception if the user input is invalid
                            System.out.println("\n\nError Exception: " + e.getMessage());
                        }
                        break;
                    case 2:
                        // Case if the HELP Aid Admin wants to register a new Organization Representative
                        // to a specified Organization by choosing the Organization ID
                        // List of the declared variable(s)
                        int desiredID;
                        // Condition if there aren't any registered organization(s)
                        if(HELPAid.getOrgList().isEmpty()){
                            // Display the following message, if there aren't any registered organizations
                            Stream.of("System: There aren't any registered organizations..", "System: Returning to the HELP Aid Admin Menu..")
                                .forEach(System.out::println);
                            // Returning back to the HELPAidAdminMenu() method
                            HELPAidAdminMenu();
                        }
                        // Check if there are any available registered organization(s)
                        else {
                            // Get the List of Registered Organizations from the HELPAid object
                            ArrayList<Organization> displayOrgList = HELPAid.getOrgList();
                            // Display all of the registered organization(s) using stream() and lambda
                            Stream.of("\nList of the Registered Organizations: ").forEach(System.out::println);
                            displayOrgList.stream().forEach(orgPt -> System.out.println(orgPt));
                            // Prompts the HELP Aid Admin to enter the Organization ID
                            Stream.of("Select the Organization ID: ").forEach(System.out::print);
                            desiredID = Integer.parseInt(System.console().readLine());
                            // Condition if the Organization was found by ID
                            if(HELPAid.foundOrgByID(desiredID)){
                                // Get the Organization object by the selected ID
                                selectedOrg = HELPAid.getOrganizationByID(desiredID);
                                System.out.println("\n-----------------");
                                // Display the organization name
                                System.out.println("Organization Name: " + selectedOrg.getOrgName() + "\n");
                                // List of the declared variables
                                String orgfullName, orgEmail, orgRepJobTitle, aidChoice = "def";
                                int orgRepMobileNo;
                                // while-loop start-pos
                                while(!aidChoice.equalsIgnoreCase("n")){
                                    // Prompts the HELP Aid Admin to enter the Representative's full name
                                    Stream.of("Enter the Representative Full Name: ").forEach(System.out::print);
                                    orgfullName = (System.console().readLine());
                                    // Prompts the HELP Aid Admin to enter the Representative's email
                                    Stream.of("Enter the Representative Email: ").forEach(System.out::print);
                                    orgEmail = (System.console().readLine());
                                    // Prompts the HELP Aid Admin to enter the Representative's mobile number
                                    Stream.of("Enter the Representative Mobile Number (eg: 6288955): ").forEach(System.out::print);
                                    orgRepMobileNo = Integer.parseInt(System.console().readLine());
                                    // Prompts the HELP Aid Admin to enter the Representative's job title
                                    Stream.of("Enter the Representative Job Title: ").forEach(System.out::print);
                                    orgRepJobTitle = (System.console().readLine());
                                    // Check if the data has already been taken or not
                                    if(HELPAid.isUserTaken(orgfullName, orgEmail, orgRepMobileNo)){
                                        // If yes, returns the following message and cancel the registration
                                        Stream.of("\nSystem: This data has already been taken!", "System: Returning to the main menu..")
                                            .forEach(System.out::println);
                                        HELPAidAdminMenu();
                                    }
                                    // Condition if the data is not taken
                                    else {
                                        // Create a new object newOrgRep with list of the required data fields according to the constructor
                                        OrganizationRep newOrgRep = new OrganizationRep(orgfullName, orgEmail, orgRepMobileNo, orgRepJobTitle, selectedOrg);
                                        // Check if duplicate username(s) are detected in the system
                                        if(HELPAid.DuplicateUName(newOrgRep.getUsername())){
                                            // If yes, returns the following message and cancel the registration
                                            Stream.of("System: Duplicated Username Detected!", "System: Returning to the Main Menu..").forEach(System.out::println);
                                            // Call the HELPAidAdminMenu() method
                                            HELPAidAdminMenu();
                                        }
                                        // Condition if there aren't any duplicate username detected 
                                        else {
                                            // Display the following message that the Organization Representative was successfully registered to the system
                                            System.out.println("\nSystem: Successfully registered a new Organization Representative..\n");
                                            // Add the newly Organization Representative to the Collection of Users from the HELPAid object
                                            HELPAid.addUser(newOrgRep);
                                            // Display the details of the registered Organization Representative
                                            // Starting from the username along with the password
                                            Stream.of("Details for the Generated Identity: ", "Generated Username: " + newOrgRep.getUsername()
                                                , "Generated Password: " + newOrgRep.getPassword()).forEach(System.out::println);
                                        }
                                    }
                                    System.out.println("\n");
                                    // Prompts the Organization Representative, whether wants to add another representative or not
                                    Stream.of("Would you like to add another representative? ('y' for yes & 'n' for no): ").forEach(System.out::print);
                                    aidChoice = (System.console().readLine());
                                    // Check if the Organization Representative's option is yes
                                    if(aidChoice.equalsIgnoreCase("y")){
                                        // If yes, it will display the following message and continue looping
                                        Stream.of("System: Adding another Organization Representative.." , 
                                            "Organization Name: " + selectedOrg.getOrgName()).forEach(System.out::println);
                                        System.out.println();
                                        continue;
                                    }
                                    // Check if the Organization Representative's option is no
                                    else {
                                        // If no, it will display the following message and returns back to the Main Menu
                                        Stream.of("System: Returning back to the main menu..").forEach(System.out::println);
                                        HELPAidAdminMenu();
                                    }
                                }
                                // while-loop end pos
                            }
                            // Condition if the Organization was not found by ID
                            else {
                                // Display the following message if the Organization was not found
                                // Returns to the HELP Aid Admin Menu
                                Stream.of("System: Organization was not found by ID!"
                                    , "System: Returning to HELP Aid Admin Menu..").forEach(System.out::println);
                            }
                        }
                        break;
                    default:
                        // Case if the HELP Aid Admin's option is out of range
                        // Display the following message, if the HELP Aid Admin's option is invalid
                        Stream.of("System: Invalid option!", "System: Please try it again!").forEach(System.out::println);
                        break;
                }
            }
            catch(Exception e){
                // catch an exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    }
    /**
     * {@Description} This method is used to display the menu for the Sequence Options
     * The Sequence Options is referring to the display of registered User(s), both OrgRep and Applicant
     * Takes no parameters
     */
    public static void DisplaySortOption(){
        // Display Sort Option Menu
        Stream.of("\nSequence Options: ", "--------------------------------")
              .forEach(System.out::println);
        Stream.of("[1] Display in Original Sequence", "[2] Display Sorted According to Full Name", 
                  "--------------------------------").forEach(System.out::println);
    } // STOP-POS
    /**
     * {@Description} This method is in charge of displaying the registered Users
     * Whether All of the Registered Users are both from two different instances (OrgRep and Applicant)
     * Takes no parameters
     */
    public static void DisplayUsersMenu(){
        // Initialize the DsUserOpt to -1 (set to default) 
        int DsUserOpt = -1;
        // Get the List of Registered Applicants and Organization Representatives from the HELPAid Object
        ArrayList<Applicant> Applicants = HELPAid.getApplicantList();
        ArrayList<OrganizationRep> OrgReps = HELPAid.getOrgRepList();
        while(true){
            // Display the menu for user classification
            Stream.of("\nUser Classification: ", "-------------------", "[1] Organization Representative", 
                "[2] Aid Applicant", "\n[0] Exit Option").forEach(System.out::println);
            try {
                // Prompts the person to enter the option
                System.out.println("-------------------");
                System.out.print("Enter your option: ");
                DsUserOpt = Integer.parseInt(System.console().readLine());
                // Implementing switch-case
                switch(DsUserOpt){
                    case 0:
                        // Case if the person selects the exit option
                        // It will display the following message and returns back to the main method
                        System.out.println("System: Exiting from menu..");
                        main(null);
                        break;
                    case 1:
                        // Case if the person wants to view registered OrgReps
                        // Check if the Organization Representative List is empty
                        if(HELPAid.getOrgRepList().isEmpty()){
                            // Display the following message if there aren't any registered Organization Representative(s) in the List
                            Stream.of("System: There aren't any registered Organization Representative(s) yet..", 
                                      "System: Returning to the main menu..").forEach(System.out::println);
                            // Call the main method
                            main(null);
                        }
                        // Check if there are any available registered Organization Representatives
                        else {
                            // Call the DisplaySortOption() method
                            DisplaySortOption();
                            // Prompts the person to enter the choice
                            System.out.print("Enter your choice: ");
                            int OrgChoice = Integer.parseInt(System.console().readLine());
                            // Implementing switch-case
                            switch(OrgChoice){
                                case 1:
                                    // Case if the person wants to view in original sequence
                                    int iterateNumOrg = 1;
                                    Iterator<OrganizationRep> OrgItr = OrgReps.iterator();
                                    // List of the Registered OrgReps in original sequence
                                    System.out.println("\nRegistered Representatives (Original Sequence): ");
                                    while(OrgItr.hasNext()){
                                        System.out.println("[" + iterateNumOrg + "] " + OrgItr.next());
                                        // pre-increment variable iterateNumOrg by 1
                                        iterateNumOrg++;
                                    }
                                    // Call the main method
                                    main(null);
                                    break;
                                case 2:
                                    // Case if the person wants to view sorted according to full name
                                    int iterateNumOrg2 = 1;
                                    // Create a new copy list of Organization Representatives ArrayList
                                    ArrayList<OrganizationRep> sortedOrgRepList = new ArrayList<>(OrgReps);
                                    // Sort the collections according to full name
                                    Collections.sort(sortedOrgRepList);
                                    Iterator<OrganizationRep> OrgSrtItr = sortedOrgRepList.iterator();
                                    // List of the Registered OrgReps sorted according full name
                                    System.out.println("\nRegistered Representatives (Sorted According to Full Name): ");
                                    while(OrgSrtItr.hasNext()){
                                        System.out.println("[" + iterateNumOrg2 + "] " + OrgSrtItr.next());
                                        // pre-increment variable iterateNumOrg2 by 1
                                        iterateNumOrg2++;
                                    }
                                    // Call the main method
                                    main(null);
                                    break;
                                default:
                                    // Case if the person's option is invalid
                                    // It will display the following message if the person's input is not valid
                                    Stream.of("System: Invalid option!", "System: Please try it again!").forEach(System.out::println);
                                    DisplayUsersMenu();
                                    break;
                            }
                        }
                        break;
                    case 2:
                        // Case if the person wants to view registered Applicants
                        // Check if the Applicant List is empty
                        if(HELPAid.getApplicantList().isEmpty()){
                            // Display the following message if there aren't any registered Applicant(s) in the List
                            Stream.of("System: There aren't any registered Applicant(s) yet..", 
                                      "System: Returning to the main menu..").forEach(System.out::println);
                            // Call the main method
                            main(null);
                        }
                        else {
                            // Call the DisplaySortOption() method
                            DisplaySortOption();
                            // Prompts the person to enter the choice
                            System.out.print("Enter your choice: ");
                            int AppChoice = Integer.parseInt(System.console().readLine());
                            // Implementing switch-case
                            switch(AppChoice){
                                case 1:
                                    // Case if the person wants to view in original sequence
                                    int iterateNumApp = 1;
                                    Iterator<Applicant> AppItr = Applicants.iterator();
                                    // List of the Registered Applicants in original sequence
                                    System.out.println("\nRegistered Applicant (Original Sequence): ");
                                    while(AppItr.hasNext()){
                                        System.out.println("[" + iterateNumApp + "] " + AppItr.next());
                                        // pre-increment variable iterateNumApp by 1
                                        iterateNumApp++;
                                    }
                                    // Call the main method
                                    main(null);
                                    break;
                                case 2:
                                    // Case if the person wants to view sorted according to full name
                                    int iterateNumApp2 = 1;
                                    // Create a new copy list of Applicants ArrayList
                                    ArrayList<Applicant> sortedAppList = new ArrayList<>(Applicants);
                                    // Sort the collections according to full name 
                                    Collections.sort(sortedAppList);
                                    Iterator<Applicant> AppSrtItr = sortedAppList.iterator();
                                    // List of the Registered Applicant(s) sorted according full name
                                    System.out.println("\nRegistered Applicant (Sorted According to Full Name): ");
                                    while(AppSrtItr.hasNext()){
                                        System.out.println("[" + iterateNumApp2 + "] " + AppSrtItr.next());
                                        // pre-increment variable iterateNumApp2 by 1
                                        iterateNumApp2++;
                                    }
                                    // Call the main method
                                    main(null);
                                    break;
                                default:
                                    // Case if the person's option is invalid
                                    // It will display the following message if the person's input is not valid
                                    Stream.of("System: Invalid option!", "System: Please try it again!").forEach(System.out::println);
                                    DisplayUsersMenu();
                                    break;
                            }
                        }
                    default:
                        // Case if the person's option is invalid
                        // It will display the following message if the person's input is not valid
                        Stream.of("System: Invalid option!", "System: Please try it again!").forEach(System.out::println);
                        break;
                }
            }
            catch(Exception e){
                // catch an exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    } 
    /**
     * {@Description} This is the main function, where it all starts from here
     * In the main function, it will display the HELP Aid Console along with six types of option
     */
    public static void main(String args[]){
        // Initialize the person's Option
        int UserOpt = -1;
        while(true){
            // Display the HELP Aid Console Menu with list of options
            System.out.println("\nHELP Aid Console");
            System.out.println("------------------");
            Stream.of("Welcome to the HELP Aid System\n", "[1] Display All Users", "[2] Login as HELP Aid Admin"
                , "[3] Login as Organization Representative", "[4] Enter as Applicant", "[5] Login as Donor", "[6] Exit Console"
                    , "------------------").forEach(System.out::println);
            try {
                // Prompts the person to enter the choice
                System.out.print("Enter your choice: ");
                UserOpt = Integer.parseInt(System.console().readLine());
                // Implementing switch-case
                switch(UserOpt){
                    case 1:
                        // Case if the person wants to view all of the registered Users
                        // Condition if the User List is empty
                        if(HELPAid.getUserList().isEmpty()){
                            // Display the following message, if there aren't any registered users in the list
                            System.out.println("\nSystem: There aren't any registered users..");
                        }
                        // Condition if there are any available registered Users in the list
                        else {
                            // Call the DisplayUserMenu()
                            DisplayUsersMenu();
                        }
                        break;
                    case 2:
                        // Case if the person to login as HELP Aid Admin
                        // List of the declared variables // The username and password is set hardcoded
                        String AdminuserName = "HELPAidAdmin", AdminPwd = "HELPAid2023", desiredUsername, desiredPwd;
                        // Prompts the person to enter the HELP Aid Admin's username
                        Stream.of("Enter the HELP Aid Admin's Username: ").forEach(System.out::print);
                        desiredUsername = (System.console().readLine());
                        // Prompts the person to enter the HELP Aid Admin's password
                        Stream.of("Enter the HELP Aid Admin's Password: ").forEach(System.out::print);
                        desiredPwd = (System.console().readLine());
                        // Check if the username and password are valid
                        if(desiredUsername.equals(AdminuserName) && desiredPwd.equals(AdminPwd)){
                            // Display the following message if the username and password are both valid
                            System.out.println("\nSystem: Successfully login as HELP Aid Admin..");
                            // Display the HELP Aid Admin menu
                            HELPAidAdminMenu();
                        }
                        // Check if the username or password is not valid
                        else{
                            // Display the following message if either username or password is not valid
                            // Returns back to the main method
                            Stream.of("\nSystem: Invalid Username or Password!", 
                                      "System: Returning back to HELP Aid Console..").forEach(System.out::println);
                        }
                        break;
                    case 3:
                        // Case if the person wants to login as Organization Representative
                        // List of the declared variables
                        String OrguserName, OrgPwd;
                        // Prompts the person to enter the Representative's unique username
                        Stream.of("Enter the Representative's Username: ").forEach(System.out::print);
                        OrguserName = (System.console().readLine());
                        // Prompts the person to enter the Representative's unique password
                        Stream.of("Enter the Representative's Password: ").forEach(System.out::print);
                        OrgPwd = (System.console().readLine());
                        // Check if the User wants to login is an instance of Organization Representative
                        if(HELPAid.DetectUserOrgRep(OrguserName, OrgPwd)){
                            // set the current selected user according to username and password
                            selectedUser = HELPAid.getUser(OrguserName, OrgPwd);
                            // Display the following message, if both username and password are valid
                            System.out.println("System: Successfully login as Organization Representative..");
                            // Calls the OrganizationRepMenu() method    
                            OrganizationRepMenu();
                        }
                        // Check if the data input is not valid 
                        else {
                            // Display the following message if either username or password is not valid
                            // Returns back to the main method
                            Stream.of("\nSystem: Invalid Username or Password!", 
                                "System: Returning back to HELP Aid Console..").forEach(System.out::println);
                        }
                        break;
                    case 4:
                        // Case if the person wants to enter as an Applicant
                        // Redirect to the Applicant Menu
                        ApplicantMenu();
                        break;
                    case 5:
                        // Case if the person wants to login as a Donor
                        // List of the declared variables // The username and password is set hardcoded 
                        String DonorUsername = "Donor", DonorPwd = "Donor2023", InputUsername, InputPwd;
                        // Prompts the person to enter the Donor's username
                        Stream.of("Enter the Donor's Username: ").forEach(System.out::print);
                        InputUsername = (System.console().readLine());
                        // Prompts the person to enter the Donor's password
                        Stream.of("Enter the Donor's Password: ").forEach(System.out::print);
                        InputPwd = (System.console().readLine());
                        // Check if the username and password are valid
                        if(InputUsername.equals(DonorUsername) && InputPwd.equals(DonorPwd)){
                            // Display the following message, if both username and password are valid
                            System.out.println("System: Successfully login as Donor..");
                            // Call the DonorMenu() method
                            DonorMenu();
                        }
                        // Check if the data input is not valid 
                        else {
                            // Display the following message if either username or password is not valid
                            // Returns back to the main method
                            Stream.of("\nSystem: Invalid Username or Password!", 
                                "System: Returning back to HELP Aid Console..").forEach(System.out::println);
                        }
                        break;
                    case 6:
                        // Case if the person wants to exit from console
                        // System will display the following message if the person wants to exit
                        System.out.println("\nSystem: Exiting Console..");
                        System.out.println("System: Thank you and have a nice day..");
                        // System.exit(0) to end the program
                        System.exit(0);
                        break;
                    default:
                        // Case if the person's input is out of range
                        // Display the following message if the person's input is invalid
                        Stream.of("\nSystem: Invalid option!", "Please try it again!").forEach(System.out::println);
                        break;
                }
            } 
            catch(Exception e){
                // catch an error exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
                main(null);
            }
        }
    }
    /**
     * {@Description} This method is in charge on displaying collections of Current Appeals
     * Any appeals's outcome that is set to PENDING will be added to the collections of Current Appeals 
     * Takes no parameters 
     */
    public static void DonorViewCrAppeals(){
        // Init the sctID to -1, assume that it's default Negative number
        int sctID = -1;
        // Get the Current Appeal List from any organizations
        ArrayList<Appeal> CrAppeals = HELPAid.getCrAppealList();
        while(true){
            try {
                // Sort the collections by Organization name, then Appeal's from Date
                Collections.sort(CrAppeals, new AppealComparator());
                // Display the list of current appeals using stream() and lambda expressions
                System.out.println("List of the Current Appeals: ");
                CrAppeals.stream().forEach(tctPrint -> System.out.println(tctPrint));
                // Prompt the Donor to enter the designated Appeal's ID
                Stream.of("Enter the Appeal's ID you would like to review: ").forEach(System.out::print);
                sctID = Integer.parseInt(System.console().readLine());
                // Check if the appeal was found by the ID before proceeding to the next stat
                if(HELPAid.foundAplByID(sctID)){
                    // gets the specified appeal by ID
                    Appeal currentAppeal = HELPAid.getAppealByID(sctID);
                    // Display the organization's name and address
                    Stream.of("\nDetails of the Specified Appeal: ", "\nOrganization Name: " + currentAppeal.getThisOrg().getOrgName()
                        , "Organization Address: " + currentAppeal.getThisOrg().getAddress()).forEach(System.out::println);
                    // Returning back to Donor Menu
                    DonorMenu();
                }
                else {
                    // If not found, display the following message
                    System.out.println("\nSystem: Unable to find the specified Appeal!");
                    DonorMenu();
                }
            } 
            catch (Exception e){
                // Catch an exception if the Donor's input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    }
    /**
     * {@Description} This method is in charge on displaying collections of Past Appeals
     * Any appeals's outcome that is set to APPROVED will be added to the collections of Past Appeals
     * Regardless from any organizations that approves it
     */
    public static void ViewPastAppeals(){
        // Get the HELP Aid Past Appeal List
        ArrayList<Appeal> pastAplList = HELPAid.getPstAppealList();
        // Sort the collections by Organization Name, then the Appeal's Date
        Collections.sort(pastAplList, new AppealComparator());
        // Implementing stream().forEach() to display all of the past reviewed appeals
        System.out.println("List of the Past Reviewed Appeals: ");
        pastAplList.stream().forEach(it -> System.out.println(it));      
    }
    /**
     * {@Description} This method is in charge of displaying the Donor's Menu
     * The Donor can choose option to view appeals and create a new contribution
     * Takes no parameters
     */
    public static void DonorMenu(){
        // Initialize the DonorOpt to -1 (Set to default)
        int DonorOpt = -1;
        while(true){
            // View of the Donor's console
            System.out.println("\nDonor Console");
            System.out.println("-------------");
            System.out.println("Welcome to the Aid Donor System");
            Stream.of("[1] View Current Appeals", "[2] View Past Appeals", "[3] Self-Record Contribution"
                , "\n[0] Log Out as Donor", "-------------").forEach(System.out::println);
            try {
                // Prompts the Donor to select an option
                System.out.print("Select your option: ");
                DonorOpt = Integer.parseInt(System.console().readLine());
                // Implementing switch-case
                switch(DonorOpt){
                    case 0:
                        // Case if the Donor wants to Log out from the console
                        System.out.println("System: Logging out as Donor..");
                        main(null);
                        break;
                    case 1:
                        // Case if the Donor wants to view current appeals
                        // Check if the current appeal list is empty
                        if(HELPAid.getCrAppealList().isEmpty()){
                            // Returns the following message, if there aren't any current appeals
                            Stream.of("System: There aren't any appeals yet..", "System: Returning to the Donor Menu..")
                                .forEach(System.out::println);
                            // Call the DonorMenu() method
                            DonorMenu();
                        }
                        // Check if there are any current appeals
                        else {
                            // Redirect to the DonorViewCrAppeals() method
                            DonorViewCrAppeals();
                        }
                        break;
                    case 2:
                        // Case if the Donor wants to view past appeals
                        // Check if the past appeal list is empty
                        if(HELPAid.getPstAppealList().isEmpty()){
                            // Returns the following message, if there aren't any past appeals
                            Stream.of("System: There aren't any past reviewed appeals yet..", "System: Returning to the Donor Menu..")
                                .forEach(System.out::println);
                            // Call the DonorMenu() method
                            DonorMenu();
                        }
                        // Check if there are any past appeals
                        else {
                            // Redirect to the ViewPastAppeals() method
                            ViewPastAppeals();
                        }
                        break;
                    case 3:
                        // Case if the Donor wants to record a new contribution
                        // Check if the current appeal list is empty
                        if(HELPAid.getCrAppealList().isEmpty()){
                            // Returns the following message, if there aren't any current appeals
                            Stream.of("System: There aren't any current appeals yet..", "System: Returning to the Donor Menu..")
                                .forEach(System.out::println);
                            // Call the DonorMenu() method
                            DonorMenu();
                        }
                        // Check if there are any current appeals
                        else {
                            // Call the ShowAppeals() method
                            ShowAppeals();
                            // Declare a variable DonorSctID
                            int DonorSctID;
                            // Prompts the Donor to select the designated Appeal's ID for contribution
                            Stream.of("Select the Appeal ID for the contribution: ").forEach(System.out::print);
                            DonorSctID = Integer.parseInt(System.console().readLine());
                            // Check if the Appeal was found by ID
                            if(HELPAid.foundAplByID(DonorSctID)){
                                // Get the Appeal's object according to the Appeal's ID
                                Appeal DonorSctApl = HELPAid.getAppealByID(DonorSctID);
                                // Display details of the specified Appeal
                                System.out.println("Details of the Choosen Appeal: \n");
                                Stream.of("Appeal's From Date: " + DonorSctApl.getFromDate(), "Appeal's To Date: "
                                    + DonorSctApl.getToDate()).forEach(System.out::println);
                                // Display the Contribution Type Menu
                                ContributionTypeMenu();
                                // Prompts the Donor to select the Contribution Type
                                Stream.of("\nChoose the contribution type: ").forEach(System.out::print);
                                int CtType = Integer.parseInt(System.console().readLine());
                                // Implementing switch-case
                                switch(CtType){
                                    case 1:
                                        // Case if the Donor wants to contribute Goods
                                        try {
                                            // Call the CreateNewGoods() method to create a new Goods
                                            Goods newGoods = CreateNewGoods(DonorSctApl);
                                            // Display the contribution's generated ID
                                            Stream.of("\nGenerated ID: " + newGoods.getContributionID()).forEach(System.out::println);
                                            // Add the Goods contribution to the list
                                            DonorSctApl.addContribution(newGoods);
                                        }
                                        catch(Exception e){
                                            // catch an exception if the user input is invalid
                                            System.out.println("\n\nError Exception: " + e.getMessage());
                                        }
                                        break;
                                    case 2:
                                        // Case if the Donor wants to contribute Cash Donation
                                        try {
                                            // Call the CreateNewCashDonation() method to create a new Cash contribution
                                            CashDonation newCsDonation = CreateNewCashDonation(DonorSctApl);
                                            // Display the contribution's generated ID
                                            Stream.of("\nGenerated ID: " + newCsDonation.getContributionID()).forEach(System.out::println);
                                            // Add the Cash Donation's contribution to the list
                                            DonorSctApl.addContribution(newCsDonation);
                                        }
                                        catch(Exception e){
                                            // catch an exception if the user input is invalid
                                            System.out.println("\n\nError Exception: " + e.getMessage());
                                        }
                                        break;
                                    default:
                                        // Case if the Donor's input is invalid!
                                        Stream.of("System: Invalid selection!"
                                            , "System: Returning to the Donor Menu..").forEach(System.out::println);
                                        // Call the DonorMenu() method
                                        DonorMenu();
                                        break;
                                }
                            }
                            // Check if the Appeal was not found by ID
                            else {
                                // Display the following message, if the Appeal was not found by ID
                                Stream.of("System: Unable to find the specified Appeal!"
                                    , "System: Returning to the Donor Menu..").forEach(System.out::println);
                                // Call the DonorMenu() method
                                DonorMenu();
                            }
                        }
                        break;
                    default:
                        // Display the following message if the user chooses an invalid option
                        Stream.of("System: Invalid option!", "System: Please try it again!").forEach(System.out::println);
                        break;
                }
            }   
            catch(Exception e){
                // catch an exception if the user input is invalid
                System.out.println("\n\nError Exception: " + e.getMessage());
            }
        }
    }
    /**
     * {@Description} This method is in charge of displaying the menu for Contribution
     * Where both Donor and Organization Representative can select their options
     * Takes no parameters
     */
    public static void ContributionTypeMenu(){
        System.out.println("Contribution Type: ");
        System.out.println("-------------------");
        // Display the options
        Stream.of("[1] Goods ", "[2] Cash Contribution", "-------------------").forEach(System.out::println);
    }
}