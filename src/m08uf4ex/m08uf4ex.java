/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m08uf4ex;

/**
 *
 * @author Raúl Heredia
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;


public class m08uf4ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("m08uf4ex_20220209.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Exercici 1 M08UF4 DAW2 09-02-2022");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    P&agrave;gina web de l'Exercici 1<br>");bw.newLine();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            bw.write("    ");bw.write(dateFormat.format(date));
            bw.write("<br>");bw.newLine();
            bw.write("     Nom d'usuari de sistema: ");bw.write(System.getProperty("user.name"));
            bw.write("<br>");bw.newLine();
            bw.write("     Nom del sistema operatiu: ");bw.write(System.getProperty("os.name"));
            bw.write("<br>");bw.newLine();
            bw.write("     VersiÃ³ del sistema operatiu: ");bw.write(System.getProperty("os.version"));
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }
    }

}