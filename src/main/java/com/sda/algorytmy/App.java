package com.sda.algorytmy;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int[] sort(int[] tab){

        int counter=0;
        //19
        for (int j=0; j<tab.length -1; j++) {
            //19
            boolean flaga = false;
            for (int i = 0; i < tab.length -j - 1; i++) {

                if (tab[i] > tab[i + 1]) {
                    //zamien miejscami
                    int tmp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = tmp;
                }
                counter++;
            }
            if (!flaga){
                break;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(counter);
        return tab;
    }
    public static void main( String[] args ) throws InterruptedException {
       Random random = new Random();
       int max = 5000;
       int min = -5000;
        //stworzyc tablice o rozmiarze 10000, ktora bedzie zawierala liczby losowe z zakresu
        // -5000 do 5000
        int[] tab = new int[20];
        long startTime = System.currentTimeMillis();
        for (int i=0; i<tab.length; i++){
              int randomNumber = random.nextInt(max - min + 1) + min;
              tab[i] = randomNumber;
        }
        System.out.println(Arrays.toString(tab));
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Czas wykonania: " + totalTime);
        startTime = System.currentTimeMillis();
        sort(tab);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Czas sortowania: " + totalTime);
        }
    }

