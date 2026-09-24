import java.io.InputStream;
import java.io.InputStreamReader;

public class EjercicioGuardian {
    // Abrir cancion y si se cierra el navegador que se abra automaticamente
    public static void main(String[] args) {
        navegador();
        ProcessBuilder pb2 = new ProcessBuilder("tasklist");
        try (Process p2 = pb2.start();
            InputStream entradaLista = p2.getInputStream();
            InputStreamReader
        ) {

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ProcessBuilder pb3 = new ProcessBuilder("cmd", "/c", "findstr firefox");

    }

    public static void navegador() {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c",
                "start firefox https://www.youtube.com/watch?v=Y4IO3GwsFPs");
        try (Process p = pb.start();) {

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
