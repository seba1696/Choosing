/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choosing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seba1
 */
public class Choosing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--.PRIMERA PARTE.--");
        System.out.println("----------------------");
        System.out.println("|--.TEST VOCACIONAL.--|");
        System.out.println("-----------------------");
        System.out.println("===========================================================================================");
        System.out.println("|Responder 's' o 'n', dependiendo de si presentas interes por las siguientes actividades. |");
        System.out.println("===========================================================================================");
        Preferencia();
    }

    public static void Preferencia() {
        int z = Mayor(Respuestas(Preguntas()));
        System.out.println("Preferencia(s): ");
        switch (z) {
            case 1: {
                System.out.println("Tecnologia y construccion.");
                TYC();
            }
            break;
            case 2: {
                System.out.println("Arte, comunicacion y diseño.");
                ACD();
            }
            break;
            case 3: {
                System.out.println("Area juridica-politica.");
                AJP();
            }
            break;
            case 4: {
                System.out.println("Economia administrativa.");
                EA();
            }
            break;
            case 5: {
                System.out.println("Ciencias de la salud.");
                CS();
            }
            break;
            case 6: {
                System.out.println("Humanidades.");
                Hm();
            }
            break;
        }
    }

    public static void TYC() { //carreras area Tecnoligia y construccion.
        System.out.println("Carreras posibles: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
    }

    public static void ACD() { //carreras area de Artes,comunicacion y diseño
        System.out.println("Carreras posibles: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
    }

    public static void AJP() { //carreras area Juridica-Politica.
        System.out.println("Carreras posibles: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
    }

    public static void EA() { // carreras area economia administrativa.
        System.out.println("Carreras posibles: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
    }

    public static void CS() { //carreras area Ciencias de la Salud
        System.out.println("Carreras posibles: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
    }

    public static void Hm() { //carreras area Humaminadades.
        System.out.println("Carreras posibles: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
    }

    public static int Mayor(int[] x) {
        int Pos = 0;
        int Mayor = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > Mayor) {
                Mayor = x[i];
                Pos = i;
            }
        }
        System.out.println(Pos);
        return Pos + 1;
    }

    public static int[] Respuestas(String[] x) { //Metodo donde se crea arreglo con respuestas.
        char z = 0;
        int y[] = new int[6];
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println(x[i]);
            z = Leer();
            System.out.println("===========================================================================================");
            if (z == 's') {
                cont1++;
            }
        }
        for (int i = 6; i < 12; i++) {
            System.out.println(x[i]);
            z = Leer();
            System.out.println("===========================================================================================");
            if (z == 's') {
                cont2++;
            }
        }
        for (int i = 12; i < 18; i++) {
            System.out.println(x[i]);
            z = Leer();
            System.out.println("===========================================================================================");
            if (z == 's') {
                cont3++;
            }
        }
        for (int i = 18; i < 24; i++) {
            System.out.println(x[i]);
            z = Leer();
            System.out.println("===========================================================================================");
            if (z == 's') {
                cont4++;
            }
        }
        for (int i = 24; i < 30; i++) {
            System.out.println(x[i]);
            z = Leer();
            System.out.println("===========================================================================================");
            if (z == 's') {
                cont5++;
            }
        }
        for (int i = 30; i < 36; i++) {
            System.out.println(x[i]);
            z = Leer();
            System.out.println("===========================================================================================");
            if (z == 's') {
                cont6++;
            }
        }
        y[0] = cont1;
        y[1] = cont2;
        y[2] = cont3;
        y[3] = cont4;
        y[4] = cont5;
        y[5] = cont6;
        return y;
    }

    public static String[] Preguntas() {
        //Orden de las preguntas alterado, para facilitar uso de contadores.
        String msj[] = new String[36];
        //--Tecnologia y construccion--.
        msj[0] = "| 1.Proyectar, dirigir y controlar la construcción de obras  .                            |";
        //msj[5] = "6.Diseñar y programar redes de telecomunicaciones.  "; -> Pregunta eliminada
        //msj[6] = "7.Dirigir procesos de Diseño Textil y de Indumentaria.  "; -> Pregunta eliminanda
        //msj[8] = "9.Realizar análisis estadísticos.  "; -> Pregunta eliminada
        msj[1] = "| 2.Trabajar con   máquinas e instrumentos mecánicos.                                     |";
        //msj[32] = "33.Realizar obras de arquitectura.  "; -> Pregunta eliminada
        msj[2] = "| 3.Desarrollar modelos matemáticos para analizar la realidad financiera de una empresa.  |";
        msj[3] = "| 4.Armar proyectos y estrategias de comunicación.                                        |";
        //msj[27] = "28.Trabajar en estudios de radio y de televisión.  "; -> Pregunta eliminada
        msj[4] = "| 5.Desempeñar funciones gerenciales organizando y dirigiendo empresas del sector agropecuario.|  ";
        msj[5] = "| 6.Realizar evaluaciones de daños de edificios.                                          |";
        //msj[31] = "32.Trabajar en la aplicación de herramientas informáticas para la solución de problemas biológicos, médicos o biotecnológicos.  "; -> Pregunta eliminada
        //--Arte,comunicacion y diseño--.
        msj[6] = "| 7.Asistir a conciertos y audiciones musicales.                                          |";
        msj[7] = "| 8.Participar en proyectos de turismo.                                                   |";
        msj[8] = "| 9.Realizar tareas de asesoramiento y consultoría en diseño multimedia.                  |";
        msj[9] = "| 10.Asistir a una obra de teatro.                                                        |";// -> Pregunta añadida
        msj[10] = "| 11.Hacer un bosquejo de algo que me llame la atención.                                 |";// -> Pregunta añadida
        msj[11] = "| 12.Escribir lo que me pasa en un diario de vida o cuaderno.                            |";// -> Pregunta añadida
        //--Juridico - Politica--.
        msj[12] = "| 13..Participar en actividades políticas.                                               |";
        msj[13] = "| 14..Formular e implementar políticas públicas.                                         |";
        msj[14] = "| 15.Conocer las leyes y el derecho.                                                     |";
        msj[15] = "| 16.Presenciar audiencias y juicios.                                                    |";
        msj[16] = "| 17.Defender personas y representarlas jurídicamente.                                   |";
        msj[17] = "| 18.Analizar el contexto político local y el de las relaciones diplomáticas con el exterior.|  ";
        //--Economico administrativa--.
        msj[18] = "| 19.Llevar la contabilidad de empresas, de organismos o de personas que tengan actividad financiera.|  ";
        msj[19] = "| 20.Participar y asesorar en el área de administración de empresas.                     |";
        msj[20] = "| 21.Realizar estudios de mercado y proyecciones de oferta y demanda.                    |";
        msj[21] = "| 22.Analizar la oferta y la demanda de productos en el mercado nacional y/o internacional.|  ";
        msj[22] = "| 23.Trabajar en el área de comunicación interna y externa de una empresa.               |";
        msj[23] = "| 24.Diseñar estrategias para desarrollar nuevos productos, publicitarlos, ponerles precio, y distribuirlos.  |";
        //--Salud--.        
        msj[24] = "| 25.Trabajar con la salud bucal de las personas.                                        |";
        // msj[15] = "16.Diseñar menúes para diferentes personas.  "; -> Pregunta eliminada
        msj[25] = "| 26.Analizar los alimentos y trabajar en plantas alimenticias.                          |";
        msj[26] = "| 27.Detectar enfermedades en el área auditiva.                                          |";
        msj[27] = "| 28.Atender pacientes en clínicas, hospitales y consultorios.                           |";
        msj[28] = "| 29.Curar a pequeños y grandes animales.                                                |";
        msj[29] = "| 30.Entender por qué se producen algunas enfermedades.                                  |";// -> Pregunta añadida
        //--Humanidades--.
        //msj[19] = "20.Realizar tareas de información periodística.  "; -> Pregunta eliminada
        //msj[24] = "25.Estudiar problemas vinculados con la educación.  "; -> Pregunta eliminada
        msj[30] = "| 31.Realizar campañas publicitarias.                                                    |";
        //msj[37] = "38.Utilizar técnicas de ingeniería genética en microorganismos, células vegetales y animales.  "; -> Pregunta eliminada
        msj[31] = "| 32.Comprender el comportamiento humano.                                                |";
        msj[32] = "| 33.Predecir los fenómenos de la realidad social.                                       |";
        msj[33] = "| 34.Traducir y conocer idiomas.                                                         |";
        msj[34] = "| 35.Estudiar los hechos humanos del pasado.                                             |";
        msj[35] = "| 36.Dictar clases en los diferentes niveles educativos.                                 |";

        return msj;
        // Preguntas originales de http://www.uade.edu.ar/ovo/Default.aspx
    }

    public static char Leer() {
        char x = 0;
        do {
            try {
                x = (char) System.in.read();
            } catch (IOException ex) {
                Logger.getLogger(Choosing.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (x != 'n' && x != 's');
        return x;
    }

    public static int LeerNum() {
        int x = 0;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                x = leer.read();
            } catch (IOException ex) {
                Logger.getLogger(Choosing.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (x < 1 || x > 3);
        return x;
    }

}
