/* 
 * Copyright 2019 Casimiro Ondo Obiang.
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

import java.util.Random;

/**
 *
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 */
public class Main {
    public static final Random RDM= new Random();
    public static void main(String[] args) {
        //ejercicio 03307-ContaminacionAlteatoriaRepeticion
        //Constante
        final int MICRO_MAX= 700;
        final int MICRO_MIN= 0;
        final int ESTACION_INICIO = 1;
        final int ESTACION_FINAL = 5;
       
        //variable
       
       //bucle
       for(int i=ESTACION_INICIO; i<ESTACION_FINAL; i++){
           int contaminacion =RDM.nextInt(MICRO_MAX-MICRO_MIN+1)+MICRO_MIN;
           System.out.printf("Estacion %d:....: %d mcg NO2%n", i, contaminacion);
       }
    }
}
