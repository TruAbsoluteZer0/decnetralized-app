package gra;
public class Monkey extends RescueAnimal {

    // Instance variable
    private String tailLength;
    private String bodyLength;
    private String height;
    private String species;
    private String animalName;
    // Constructor
    public Monkey (String name, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height, String bodyLength, String species) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);

    }

    // Accessor Method
  public void setTailLength(String monkeyTailLength){
       tailLength = monkeyTailLength;
  }
  public String getTailLength(){
    return tailLength;
  }
  public void setHeight(String monkeyHeight){
       height  = monkeyHeight;
  }
  public String getHeight(){
    return height;
    
  }public void setBodyLength(String monkeyBodyLength){
       bodyLength = monkeyBodyLength;
  }
  public String getBodyLength(){
    return bodyLength;
  } 
    
  public void setSpecies (String monkeySpecies){
       species = monkeySpecies;
  }
  public String getSpecies(){
    return species;
  }

}