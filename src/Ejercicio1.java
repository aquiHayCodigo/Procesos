import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) throws Exception{
        
        System.out.println("Dime una dirección: ");
        Scanner sc= new Scanner(System.in);
        //String dir= sc.nextLine();
        
        /* ProcessBuilder pb= new ProcessBuilder("ping", dir);
        // pb.directory(new File("src")).start();
        Process p= pb.start();

        System.out.println("Trabajando...");

        p.waitFor();
        boolean sigue= p.isAlive();

        if (sigue){
            System.out.println("Proceso OK");
        }else{
            System.out.println("ERRORRRRRR");
        }

        sc.close();*/

        String dir= sc.nextLine();
        Process p= new ProcessBuilder("ping", dir).start();

        while(p.isAlive()){
            System.out.println("Trabajando...");
        }  

        sc.close();
        

    } 

}