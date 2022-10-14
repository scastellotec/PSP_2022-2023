package ud1_multiproceso.ejercicioSumador;

import java.io.*;

public class Main {

    static final int NUM_PROCESOS = 4;
    static final String PREFIJO_FICHEROS = "fichero";

    public static void lanzarComando(String comando, int n1, int n2,String ficheroResultado) throws IOException {
        File carpeta = new File("C:\\Users\\alu\\IdeaProjects\\PSP_2022-2023\\out\\production\\PSP_2022-23\\ud1_multiproceso\\ejercicioSumador\\");
        File fichero = new File(ficheroResultado);
        ProcessBuilder pb;
        pb = new ProcessBuilder("java", comando, String.valueOf(n1), String.valueOf(n2) );
        pb.directory(carpeta);
        //pb.redirectOutput(fichero);
        pb.inheritIO();
        pb.start();
    }

    public static int getResultadoFichero(String nombreFichero){
        int suma = 0;
        try {
            FileInputStream fis = new FileInputStream(nombreFichero);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String linea = br.readLine();
            System.out.println(nombreFichero + " " + linea);
            suma= Integer.valueOf(linea);
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir " + nombreFichero);
        } catch (IOException e) {
            System.out.println("No hay nada en " + nombreFichero);
        }
        return suma;
    }

    public static long getSumaTotal(){
        long sumaTotal = 0;
        for (int i = 0; i <= NUM_PROCESOS; i ++){
            sumaTotal += getResultadoFichero(PREFIJO_FICHEROS + String.valueOf(i) );
        }
        return sumaTotal;
    }

    public static void main(String[] args) throws IOException, InterruptedException{
        for(int i=0; i<=NUM_PROCESOS; i++){
            lanzarComando("Sumador",1+i,5+i,PREFIJO_FICHEROS+i);
        }

        //System.out.println(getSumaTotal());

    }
}
