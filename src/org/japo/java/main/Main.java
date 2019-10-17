/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;
import java.util.Locale;
import java.util.Calendar;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        int hAct;
        int mAct;
        int sAct;

        //Instanciar 
        Calendar CAL = Calendar.getInstance();

        //Obtencion de datos
        hAct = CAL.get(Calendar.HOUR_OF_DAY);
        mAct = CAL.get(Calendar.MINUTE);
        sAct = CAL.get(Calendar.SECOND);
        System.out.printf("Hora actual ...:%02d:%02d:%02d%n", hAct, mAct, sAct);

        //Variables
        int hEnt;
        int mEnt;
        int sEnt;

        //Entrada consola
        try {
            System.out.print("Introduzca la hora de inicio ... : ");
            hEnt = SCN.nextInt();
            System.out.print("Introduzca el minuto de inicio ... : ");
            mEnt = SCN.nextInt();
            System.out.print("Introduzca el segundo de inicio ... : ");
            sEnt = SCN.nextInt();
            System.out.printf("Hora inicio...: %02d:%02d:%02d%n", hEnt, mEnt, sEnt);

            //Tiempos
            int tiempoEnt = hEnt * 3600 + mEnt * 60 + sEnt;
            int tiempoAct = hAct * 3600 + mAct * 60 + sAct;

            //Segundos
            int sDis = tiempoAct - tiempoEnt;
            //Minutos
            int mDis = sDis/60;
            sDis = sDis % 60;
            //Horas
            int hDis = mDis / 60;
            mDis = mDis % 60;
            System.out.printf("Tiempo de clase... :%02d:%02d:%02d%n", hDis, mDis, sDis);
        } catch (Exception e) {
            //Mensaje de error
            System.out.println("Error, dato incorrecto");
        } finally {
            //Limpiar buffer
            SCN.nextLine();
        }
    }
}
