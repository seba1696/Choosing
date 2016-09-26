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

    public static int[] Puntajes() { //Metodo donde se ingresan puntajes,nem y ranking correspondiente.
        int mat = 0, leng = 0, cien = 0, hist = 0, nem = 0;
        int puntajes[] = new int[4];
        System.out.println("Ingrese NEM");
        nem = LeerNum();
        System.out.println("Ingrese puntajes (simulados) PSU: ");
        System.out.println("Matematica: ");
        mat = LeerNum();
        System.out.println("Lenguaje: ");
        leng = LeerNum();
        System.out.println("Ciencias: ");
        cien = LeerNum();
        System.out.println("Historia: ");
        hist = LeerNum();
        System.out.println("===========================================================================================");
        puntajes[0] = mat;
        puntajes[1] = leng;
        puntajes[2] = cien;
        puntajes[3] = hist;
        return puntajes;
    }

    public static void Resultado(int[] x, int n) { //Metodo que muestra ponderaciones por universidad y carrera.
        switch (n) {
            case 1: {
                System.out.println("Ingeniería Civil Informática.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 15%    Ranking: 25%   Lenguaje: 15%   Matematica: 35%   Ciencias: 10%   Historia: 0%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 10%   Matematica: 30%   Ciencias: 10%   Historia: 0%.");
                System.out.println("Plan Común Ingeniería Civil.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 15%    Ranking: 25%   Lenguaje: 15%   Matematica: 35%   Ciencias: 10%   Historia: 0%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 10%   Matematica: 30%   Ciencias: 10%   Historia: 0%.");
                System.out.println("Ingeniería Civil Ambiental.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 15%    Ranking: 25%   Lenguaje: 15%   Matematica: 35%   Ciencias: 10%   Historia: 0%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 10%   Matematica: 30%   Ciencias: 10%   Historia: 0%.");
            }
            break;
            case 2: {
                System.out.println("Derecho.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 25%   Matematica: 20%   Ciencias: 0%   Historia: 15%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 20%   Matematica: 15%   Ciencias: 0%   Historia: 15%.");
                System.out.println("Contador Publico y Auditor.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 20%   Matematica: 30%   Ciencias: 0%   Historia: 10%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 15%   Matematica: 25%   Ciencias: 0%   Historia: 10%.");
            }
            break;
            case 3: {
                System.out.println("Ingenieria Comercial.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 20%   Matematica: 30%   Ciencias: 10%   Historia: 0%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 10%   Matematica: 30%   Ciencias: 10%   Historia: 0%.");
                System.out.println("Contador Publico y Auditor.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 20%   Matematica: 30%   Ciencias: 0%   Historia: 10%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 15%   Matematica: 25%   Ciencias: 0%   Historia: 10%.");
            }
            break;
            case 4: {
                System.out.println("Nutrición y Dietética.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 15%   Matematica: 25%   Ciencias: 20%   Historia: 0%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 15%   Matematica: 15%   Ciencias: 20%   Historia: 0%.");
                System.out.println("Kinesiología.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 15%   Matematica: 25%   Ciencias: 20%   Historia: 0%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 10%   Matematica: 10%   Ciencias: 30%   Historia: 0%.");
                System.out.println("Fonoaudiología.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 15%   Matematica: 25%   Ciencias: 20%   Historia: 0%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 25%   Matematica: 10%   Ciencias: 15%   Historia: 0%.");
            }
            break;
            case 5: {
                System.out.println("Sociología.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 20%   Matematica: 20%   Ciencias: 0%   Historia: 20%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 15%   Matematica: 15%   Ciencias: 0%   Historia: 20%.");
                System.out.println("Psicología.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 25%   Matematica: 25%   Ciencias: 10%   Historia: 0%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 15%   Matematica: 20%   Ciencias: 15%   Historia: 0%.");
                System.out.println("Pedagogía en Historia, Geografía y Educación Cívica.");
                System.out.println("Universidad de la Frontera:");
                System.out.println("NEM: 10%    Ranking: 30%   Lenguaje: 30%   Matematica: 20%   Ciencias: 0%   Historia: 10%.");
                System.out.println("Universidad Catolica de Temuco:");
                System.out.println("NEM: 10%    Ranking: 40%   Lenguaje: 20%   Matematica: 15%   Ciencias: 0%   Historia: 15%.");
            }
            break;
        }
    }

    public static void Preferencia() { //Metodo que muetra area preferida y las ponderaciones por carrera.
        int z = Mayor(Respuestas(Preguntas()));
        System.out.println("");
        System.out.println("Preferencia(s): ");
        switch (z) {
            case 1: {
                System.out.println("Tecnologia y construccion.");
                TYC();
                Resultado(Puntajes(), z);
            }
            break;
            case 2: {
                System.out.println("Area juridica-politica.");
                AJP();
                Resultado(Puntajes(), z);
            }
            break;
            case 3: {
                System.out.println("Economia administrativa.");
                EA();
                Resultado(Puntajes(), z);
            }
            break;
            case 4: {
                System.out.println("Ciencias de la salud.");
                CS();
                Resultado(Puntajes(), z);
            }
            break;
            case 5: {
                System.out.println("Humanidades.");
                Hm();
                Resultado(Puntajes(), z);
            }
            break;
        }
    }

    public static void TYC() { //carreras area Tecnoligia y construccion.
        System.out.println("Carreras: ");
        System.out.println("1.Ingeniería Civil Informática.");
        System.out.println("2.Plan Común Ingeniería Civil.");
        System.out.println("3.Ingeniería Civil Ambiental.");

    }

    public static void AJP() { //carreras area Juridica-Politica.
        System.out.println("Carreras: ");
        System.out.println("1.Derecho.");
        System.out.println("2.Contador Publico y Auditor.");
    }

    public static void EA() { // carreras area economia administrativa.
        System.out.println("Carreras: ");
        System.out.println("1.Ingenieria Comercial.");
        System.out.println("2.Contador publico y auditor.");

    }

    public static void CS() { //carreras area Ciencias de la Salud
        System.out.println("Carreras: ");
        System.out.println("1.Nutrición y Dietética.");
        System.out.println("2.Kinesiología.");
        System.out.println("3.Fonoaudiología.");

    }

    public static void Hm() { //carreras area Humaminadades.
        System.out.println("Carreras: ");
        System.out.println("1.Sociología.");
        System.out.println("2.Psicología.");
        System.out.println("3.Pedagogía en Historia, Geografía y Educación Cívica.");

    }

    public static int Mayor(int[] x) { //Metodo que devuelve la area preferida por el usuario.
        int Pos = 0;
        int Mayor = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > Mayor) {
                Mayor = x[i];
                Pos = i;
            }
        }
        return Pos + 1;
    }

    public static int[] Respuestas(String[] x) { //Metodo donde se crea arreglo con respuestas.
        char z = 0;
        int y[] = new int[5];
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
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

        y[0] = cont1;
        y[1] = cont2;
        y[2] = cont3;
        y[3] = cont4;
        y[4] = cont5;
        return y;
    }

    public static String[] Preguntas() {
        //Orden de las preguntas alterado, para facilitar uso de contadores.
        String msj[] = new String[30];
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
        //--Arte,comunicacion y diseño--. -> Arte eliminado por inexistencia de carreras relacionadas en la UFRO.
        /*msj[6] = "| 7.Asistir a conciertos y audiciones musicales.                                          |";
         msj[7] = "| 8.Participar en proyectos de turismo.                                                   |";
         msj[8] = "| 9.Realizar tareas de asesoramiento y consultoría en diseño multimedia.                  |";
         msj[9] = "| 10.Asistir a una obra de teatro.                                                        |";// -> Pregunta añadida
         msj[10] = "| 11.Hacer un bosquejo de algo que me llame la atención.                                 |";// -> Pregunta añadida
         msj[11] = "| 12.Escribir lo que me pasa en un diario de vida o cuaderno.                            |";// -> Pregunta añadida
         */
        //--Juridico - Politica--.
        msj[6] = "| 13..Participar en actividades políticas.                                               |";
        msj[7] = "| 14..Formular e implementar políticas públicas.                                         |";
        msj[8] = "| 15.Conocer las leyes y el derecho.                                                     |";
        msj[9] = "| 16.Presenciar audiencias y juicios.                                                    |";
        msj[10] = "| 17.Defender personas y representarlas jurídicamente.                                   |";
        msj[11] = "| 18.Analizar el contexto político local y el de las relaciones diplomáticas con el exterior.|  ";
        //--Economico administrativa--.
        msj[12] = "| 19.Llevar la contabilidad de empresas, de organismos o de personas que tengan actividad financiera.|  ";
        msj[13] = "| 20.Participar y asesorar en el área de administración de empresas.                     |";
        msj[14] = "| 21.Realizar estudios de mercado y proyecciones de oferta y demanda.                    |";
        msj[15] = "| 22.Analizar la oferta y la demanda de productos en el mercado nacional y/o internacional.|  ";
        msj[16] = "| 23.Trabajar en el área de comunicación interna y externa de una empresa.               |";
        msj[17] = "| 24.Diseñar estrategias para desarrollar nuevos productos, publicitarlos, ponerles precio, y distribuirlos.  |";
        //--Salud--.        
        msj[18] = "| 25.Trabajar con la salud bucal de las personas.                                        |";
        // msj[15] = "16.Diseñar menúes para diferentes personas.  "; -> Pregunta eliminada
        msj[19] = "| 26.Analizar los alimentos y trabajar en plantas alimenticias.                          |";
        msj[20] = "| 27.Detectar enfermedades en el área auditiva.                                          |";
        msj[21] = "| 28.Atender pacientes en clínicas, hospitales y consultorios.                           |";
        msj[22] = "| 29.Curar a pequeños y grandes animales.                                                |";
        msj[23] = "| 30.Entender por qué se producen algunas enfermedades.                                  |";// -> Pregunta añadida
        //--Humanidades--.
        //msj[19] = "20.Realizar tareas de información periodística.  "; -> Pregunta eliminada
        //msj[24] = "25.Estudiar problemas vinculados con la educación.  "; -> Pregunta eliminada
        msj[24] = "| 31.Realizar campañas publicitarias.                                                    |";
        //msj[37] = "38.Utilizar técnicas de ingeniería genética en microorganismos, células vegetales y animales.  "; -> Pregunta eliminada
        msj[25] = "| 32.Comprender el comportamiento humano.                                                |";
        msj[26] = "| 33.Predecir los fenómenos de la realidad social.                                       |";
        msj[27] = "| 34.Traducir y conocer idiomas.                                                         |";
        msj[28] = "| 35.Estudiar los hechos humanos del pasado.                                             |";
        msj[29] = "| 36.Dictar clases en los diferentes niveles educativos.                                 |";

        return msj;
        // Preguntas originales de http://www.uade.edu.ar/ovo/Default.aspx
    }

    public static char Leer() { // Metodo para leer varibles tipo char, usada para leer las respuestas.
        char x = 0;
        do {
            try {
                x = (char) System.in.read();

            } catch (IOException ex) {
                Logger.getLogger(Choosing.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        } while (x != 'n' && x != 's');
        return x;
    }

    public static int LeerNum() { //Metodo para leer variables del tipo entero
        int x = 0;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try {
            x = leer.read();

        } catch (IOException ex) {
            Logger.getLogger(Choosing.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

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
