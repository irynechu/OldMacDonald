class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySound = "unknown";
         mySound1 = sound1
         mySound2 = sound2
     }      
     public String getSound(){
          return mySound;
     }     
     public String getType(){
          return myType;
     } 
}
