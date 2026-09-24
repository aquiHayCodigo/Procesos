
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Ejercico3Dirrrrr {

    public static void main(String[] args) {
        // ProcessBuilder pb = new ProcessBuilder("cmd","/c","dir");
        // pb.inheritIO();
        // String comando= IO.readln();
        ProcessBuilder pb = new ProcessBuilder("cmd");

        try (Process p= pb.start();
            InputStream in = p.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader br = new java.io.BufferedReader(reader);

            OutputStream os = p.getOutputStream();
            // OutputStreamWriter ow= new OutputStreamWriter(os);
            PrintWriter writer = new PrintWriter(os, true);

        ) {
            IO.print("Escribe un comando: ");
            String comando = IO.readln();
            while (comando.equals("exit")) {
                writer.write(comando);
                // writer.write("exit");
                // writer.flush();
                p.waitFor();
                String linea;
                while ((linea = br.readLine()) != null) {
                    IO.print(br);
                }
                IO.print("Escribe un comando: ");
                IO.readln();
            }

        } 
        catch (IOException e){}
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
