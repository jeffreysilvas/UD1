/********************************************
* AUTHORS:	Jeffrey Silvas, Katelyn Ho, Noah Vargas Polo, Kevin Lopez
* COLLABORATORS: N/A
* LAST MODIFIED:	6/18/2026
********************************************/

import java.util.Scanner;

/********************************************
*	Giraffe Information
*********************************************
*	PROGRAM DESCRIPTION:
*	Provides the user with information about giraffes
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <UML style list of static methods>
*********************************************/


public class Main {
  /***** CONSTANT SECTION *****/

  public static void main(String[] args) {
    //  SCIENTIFIC NAMES
    String northernScientificName = "Giraffa camelopardalis";
    String southernScientificName = "Giraffa giraffa";
    String masaiScientificName = "Giraffa tippelskirchi";
    String reticulatediScientificName = "Giraffa reticulata";

// — FUN FACTS (years, miles per hour)
    boolean matriarchal = true;
    int avgLifeSpan = 13;
    double recordSpeed = 34.7;
    String eyeballSize = "golf balls";

// — ANATOMICAL FACTS (meters)
    double largestPossibleNeckLength = 1.8;
    double largestPossibleLegLength = 1.8;
    double largestPossibleFemaleHeight = 4.2672;
    double largestPossibleMaleHeight = 5.4864;
    double heartSize = 0.6096;

// TOTAL NUMBERS
    int totalPopulation = 140000;
    int speciesAmount = 4;
    int africanCountriesExtinctIn = 7;

//POPULATIONS
    int northernPopulation = 7037;
    int reticulatedPopulation = 20901;
    int southernPopulation = 68837;
    int masaiPopulation = 43926;


//PRIOR POPULATION
    int popIn1980s = 155000;
    int popIn2016 = 100000;
    int popin2026 = totalPopulation;
//STATUS
    String northernStatus = "Critically Endangered";
    String reticulatedStatus = "Endangered";
    String southernStatus = "Vulnerable";
    String masaiStatus = "Endangered";

//PROGRAM START
    System.out.println("Welcome! Please type in a number to learn more about the following topics: ");
    System.out.println("[1] Endangered Status\n[2] Anatomical Facts\n[3] Fun Facts\n[4] Scientific Names\n[5] Projected Population Growth");
/* Program begins by outputting a list of things the user could ask about
For example:
Output: Welcome! Please type in one of the following to learn more about it
Endangered status
Anatomical facts
Fun facts
Scientific names
Projected population growth
Projected population decline
 */

    Scanner scanner = new Scanner(System.in);
    String response = scanner.nextLine();

//Input by user:  Endangered status
//Output: The northern giraffes are Critically Endangered, the reticulated giraffes….
  }
}
