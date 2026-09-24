import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio2 {

    public static void main(String[] args) throws Exception {

        // Lazar el proceso "tasklist", imprimir por pantalla únicamente el nº de
        // procesos actuales
        // In:
        // Out: Hay x proceso en ejecucion

        ProcessBuilder pb = new ProcessBuilder("tasklist");
        Process p = pb.start();

        InputStream in = p.getInputStream();
        InputStreamReader input = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(input);

        br.close();
        input.close();
        
        String linea;
        String tasks=" ";
        int i=0;
        // Leemos línea a línea hasta que no haya más texto (null)
        while ((linea = br.readLine()) != null) {
            tasks+=linea + "\n";
            i++;
        }

        for(int j=0; j<i-3; j++){
            System.out.println(tasks);
        }

    }

}
