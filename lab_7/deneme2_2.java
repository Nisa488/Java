package lab_7;

public class deneme2_2 { 
    private String name; 
    private String team; 
    private int jerseyNumber; 
    //----------------------------------------------------------- 
    // Prompts for and reads in the player's name, team, and  
    // jersey number. 
    //----------------------------------------------------------- 
    public void readPlayer() 
    { 
Scanner scan = new Scanner(System.in); 
 System.out.print("Name: "); 
name = scan.nextLine(); 
 System.out.print("Team: "); 
team = scan.nextLine(); 
System.out.print("Jersey number: "); 
jerseyNumber = Scan.nextInt(); 
    } 
}