//Marcos Lozano
//8/31/2015

public class variables{
    
    public static void main(String[] args0){
        /*
        byte b = 127;
        System.out.println("B = " + b);
        b++;
        System.out.println("B = " + b);
        */
        float processorSpeed ;
        byte numberProcessors;
        float computerSpeed;
        
        processorSpeed = 2.3f;
        numberProcessors = 3;
        
        computerSpeed = processorSpeed * numberProcessors;
        System.out.println("Computer Speed = " + computerSpeed);
    }
}