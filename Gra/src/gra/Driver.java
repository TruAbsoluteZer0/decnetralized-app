
package gra;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    int i;
    
    
    // Instance variables (if needed)

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	char  userChoice = ' ';
      
        initializeDogList();
        initializeMonkeyList();
        
      
      while (userChoice != 'q'){
        displayMenu();
        userChoice = scanner.nextLine().charAt(0);
        
        switch(userChoice) {
          
          case '1': intakeNewDog(scanner);
            break;
            
          case '2':intakeNewMonkey(scanner);
            break;
           
          case '3': reserveAnimal(scanner);
            break;
          case '4': printAnimals("dog");
            break;
          case '5': printAnimals("monkey");
            break;
          case '6': printAnimals("available");
            break;
          default:
            System.out.println(" PLease enter a valid character");
        }
      }
    }
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false , "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey Monkey1 = new Monkey("John" , "male", "4", "3.5", "06-26-2020", "Argentina", "Phase V", true, "United States", "17.1", "16.2", "15.7","Capuchin"); 
        
        
        
        monkeyList.add(Monkey1);
    
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu 
            }
        }
        System.out.println("Enter the breed");
        String breed = scanner.nextLine();
        
        System.out.println("Enter the gender");
        String gender = scanner.nextLine();
        
        System.out.println("Enter the age");
        String age  = scanner.nextLine();
        
        System.out.println("Enter the weight ");
        String  weight = scanner.nextLine();
                           
        System.out.println("Enter the Aquisition date");
        String aquisitionDate = scanner.nextLine();
        
        System.out.println("Enter the Aquisition Country");
        String aquisitionCountry = scanner.nextLine();                   

        System.out.println("Enter the Training Status");
        String trainingStatus = scanner.nextLine();
         
        System.out.println("Is the Dog Reserved?");
        boolean reserved = scanner.nextBoolean();
      
         
        System.out.println("Enter dog InService Country?");
        String inServiceCountry = scanner.nextLine();
          
        Dog newDog = new Dog(name,breed,gender,age,
        weight,aquisitionDate,aquisitionCountry,
	    trainingStatus,reserved,inServiceCountry);
          
        
        
        dogList.add(newDog);
        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make1 sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu 
            }
        }
        System.out.println("Enter the gender");
        String gender = scanner.nextLine();
        
        System.out.println("Enter the age");
        String age  = scanner.nextLine();
        
        System.out.println("Enter the weight ");
        String  weight = scanner.nextLine();
                           
        System.out.println("Enter the Aquisition date");
        String aquisitionDate = scanner.nextLine();
        
        System.out.println("Enter the Aquisition Country");
        String aquisitionCountry = scanner.nextLine();                   

        System.out.println("Enter the Training Status");
        String trainingStatus = scanner.nextLine();
         
        System.out.println("Is the Monkey Reserved?");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();
        
        System.out.println("Enter Monkey InService Country?");
        String inServiceCountry = scanner.nextLine();
        
        System.out.println("Enter the tail Length");
        String tailLength = scanner.nextLine();
        
        System.out.println("Enter the height");
        String height = scanner.nextLine();
        
        System.out.println("Enter the body length");
        String bodyLength = scanner.nextLine();
        
          
          
        final String[] sixMonkeyTypes = {"Capuchin","Guenon","Macaque","Marmoset","Squirrel monkey","Tamarin"};
         List<String>monkeyTypes = Arrays.asList(sixMonkeyTypes);

        System.out.println("Enter the species");
        String species = scanner.nextLine();
        boolean correctSpecies = false;
       do{ 
         if (monkeyTypes.contains(species)){
          correctSpecies = true;
         }
         
         else{ 
        System.out.println(" Sorry we dont accept that specific monkey species. Enter a valid monkey Species");

         species = scanner.nextLine();
         continue;
         }
        
         
         
                            
       }
          while(correctSpecies = false);
          
        Monkey newMonkey =new Monkey(name, gender, age,
        	    weight, aquisitionDate, aquisitionCountry,
        		trainingStatus, reserved,inServiceCountry, tailLength, height, bodyLength, species);

        monkeyList.add(newMonkey);
       
    }
        

       
        //method that checks ig 
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Please enter the Country for service: ");
             String country=scanner.nextLine();
          System.out.println(" Please enter the type of animal you would like: ");
           String animalType=scanner.nextLine();
          
          if(animalType.equalsIgnoreCase("monkey")){
            for(Monkey obj :monkeyList) {
                if(obj.getInServiceLocation().equals(country) && !obj.getReserved()) {
                  obj.setReserved(true);
                  System.out.println(obj.getName() + " was reserved"); 
                  return;
                    }
                }
          
             System.out.println("No animals of the type or location are available"); 
          }
              
        else if(animalType.equalsIgnoreCase("dog")){
             for (Dog obj :dogList) { if(obj.getInServiceLocation().equals(country) && !obj.getReserved()) {
                 obj.setReserved(true);
                 System.out.println(obj.getName() + " was reserved"); 
                 return;
                     }
             }
            System.out.println("No animals of the type or location are available"); 
        }
             
        }

        
	//method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	
        public static void printAnimals(String listType) {
            switch(listType)
            {
                   case "monkey":
                     for(Monkey m : monkeyList){
                     System.out.println(m.getName() + " " + m.getTrainingStatus() + " " + m.getReserved() + " " + m.getInServiceLocation());                 
                }
                     break;
                   case "dog":
                     for(Dog d : dogList) {
                       System.out.println(d.getName() + " " + d.getTrainingStatus() + " " + d.getReserved() + " " + d.getInServiceLocation());  
                   }
                   break;
            
                   case "available":
                      for(Monkey m : monkeyList){
                       if (!m.getReserved() && m.getTrainingStatus().equalsIgnoreCase("in service")) { 
                         System.out.println(m.getName() + " " + m.getTrainingStatus() + " " + m.getReserved() + " " + m.getInServiceLocation()); 
                       }
                      
                      
                      }
  for(Dog d: dogList){
      if (!d.getReserved() && d.getTrainingStatus().equalsIgnoreCase("in service")){
        System.out.println(d.getName() + " " + d.getTrainingStatus() + " " + d.getReserved() + " " + d.getInServiceLocation()); 
                       }
                      }
                 break;                                                                         
            }
            }
}

            


