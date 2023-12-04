/**
 * 
 * @author : Enrico Junior
 * Student ID : E2100297
 * AppealComparator.java
 * (Although this is not neccessary for the Assignment, but this is required in order to sort the aid appeals)
 * Date: 09-11-2023
 * This part is completed
 * 
 */

// Import the java utility libraries to access the Comparator
import java.util.*;

// Implementing Comparator to sort all of the contents inside the ArrayList
public class AppealComparator implements Comparator<Appeal>{

    /**
     * This method is used to compare the Appeal's Organization name, then Appeal's From Date
     * @param firstApl @param secondApl
     */
    public int compare(Appeal firstApl, Appeal secondApl){
        // Comparing the Appeal's Organziation name first
        int markedRes = firstApl.getThisOrg().getOrgName().compareTo(secondApl.getThisOrg().getOrgName());

        // If the markedRes is not equals to 0
        if(markedRes != 0){
            // Return the value of markedRes
            return markedRes;
        }

        // If the Appeal's Organization names are identic, compare the Appeal's From Date
        return (firstApl.getFromDate().compareTo(secondApl.getFromDate()));
    }
}