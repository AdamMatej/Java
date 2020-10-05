package sk.kosickaakademia.a.matej.vetvenie;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {

        /*int x=55;
        if (x%2 == 0 ) {
            System.out.println("Cislo je parne");
        }
        else {
            System.out.println("Cislo je neparne");
        }

        System.out.println("-------------------------------------------");*/

        /*x = 181;
        int cs = x%10 + (x/10)%10 + (x/100)%10;

        System.out.println("ciferny sucet je "+cs);

        System.out.println("-------------------------------------------");*/


        /*if (x<0);
            else
        System.out.println("H");

        System.out.println("-------------------------------------------");*/



        ///////
        /*x = 11;
        int ss = (x/100)%10;

        System.out.println("ciferny sucet je "+ss);
        System.out.println("-------------------------------------------");*/



        /////////////////////////////////////////////
        ///Kolko ciferne cislo je to

       /* System.out.println("Kolko ciferne má to cislo? ");

        int a= 1000000;
                if (a<0) {
            System.out.println("ERROR");}

        else if (a<10){
            System.out.println("Cilo je 1 ciferne");}

        else if (a<100){
        System.out.println("Cislo je 2 ciferne");}

        else if (a<1000){
        System.out.println("Cislo je 3 ciferne");}

        else if (a<10000){
        System.out.println("Cislo je 4 ciferne");}

        else{
                    System.out.println("Cislo má viac ako 4 cifry ");}

        System.out.println("-------------------------------------------");*/



        ////////

        ///////////////////// Sprav cyklus pre lubovolné číslo, a zisti ciferny sucet
           /* int q = 454;
            int c = 0;

            while (q !=0){
                c=c+(q%10);
                q=q/10;
            }
            System.out.println("napis " +c);

        System.out.println("-------------------------------------------");*/


        ////////////////////////// otoč číslo

       /* int e=7385;
        int y=0;
        while (e>0) {
            y = (10 * y + e % 10);
            e = e / 10;
        }

        System.out.println("vypiš " +y);

        System.out.println("-------------------------------------------");*/

       /* //// Nájdi počet deliteľov v čísle "r"
        System.out.println("Nájdi počet deliteľov v čísle r");

        int r=99;
        int pd=0;
        int i=1;
        while(i<=r){
            if (r%i==0)
                pd=pd +1; //skratený zapis pd++;
            i=i+1;
        }
        System.out.println("vysledok " +pd);

        System.out.println("-------------------------------------------");
*/
        //priklad na prvocislo
       /* System.out.println("Nájdi počet deliteľov v čísle r");

        int f=7;
        int fd=0;
        int o=1;
        while(o<=r){
            if (f%o==0)
                fd=fd +1; //skratený zapis fd++;
            o=o+1;
        }

        System.out.println("vysledok " +fd);

        System.out.println("Je číslo prvočíslo?");
            if (fd==2)
                System.out.println("ANO");
            else
                System.out.println("NIE");



        System.out.println("-------------------------------------------");*/


        //mas cislo ak je delitelne 11 tak je to v poriadku ale ak nie je tak pridaj cifru tak aby to cislo bolo delitelne 11






       /* System.out.println("------------------------------------------------------------------------------------------------------------");
////////////////fibonaciho cislo

        int aa = 1;
        int bb = 1;
        int cc;

        System.out.println(aa);
        System.out.println(bb);
        for (int ii =0; ii<= 20; ii++) {
            cc = aa + bb;
            System.out.print (" " +cc);
            aa = bb;
            bb = cc;

        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------");
*/
        ////najdi najväčie cislo v cisle 9999 ktore je delitelne 91,  break=je prikaz na zastavenie cyklu

     /*   int cislo = 9999;
        while (cislo >= 0) {
            if (cislo%91==0)
                break;
            cislo= cislo-1;

        }
        System.out.println(cislo);
        System.out.println("----------------------------------------------------------------------------------------------------");

        //// máš 100€ pri uroku 10% za kolko rokov bude 200€?
        double aaa= 100;
        int roky= 0;
        double uroky = 1.1;
        while (aaa > 0) {
            aaa= aaa*uroky;
            roky=roky+1;
            if (aaa>=200) break;
        }
        System.out.println("Pocet rokov je " +roky);
        System.out.println("Pocet penazi po rokoch je " +aaa);


       */

        /*System.out.println("----------------------------------------------------------------------------------------------------");

        double aaaa=100;
        int rokyy=0;
        double urokyy=1.1;
        while (aaaa>0){
            aaaa=aaaa*urokyy;
            rokyy++;
            if (aaaa>200)break;
        }
        System.out.println(rokyy);

        System.out.println("----------------------------------------------------------------------------------------------------");
*/
     /*   int cf=1;
        int cq=1;
        int ca=1;
        int ce=(cf+cq+ca);
        while (ce>0){
            cf++;
            cq++;
            ca++;
            if ();
        }

        System.out.println(ce);

        System.out.println("----------------------------------------------------------------------------------------------------");
*/
//              FIBONACCI

/*
        int a = 1;
        int b = 1;
        int c;

        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <= 20; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }*/
//       PERFECT NUMBER



     /*   int number = 2;

        while (number <= 10000){
            ArrayList<Integer> listDel = new ArrayList<Integer>();
            int del = 1;
            int sum = 0;

            while (del < number){
                if (number%del==0){
                    sum -= -del;
                    listDel.add(del);
                }
                del -= -1;



            }
            if (sum == number){
                for (int i : listDel){
                    System.out.print(i + ", ");
                }
                System.out.println("");
                System.out.println("Number " + number + " is perfect number");
            }
            number -= -1;
        }*/
        System.out.println("----------------------------------------------------------------------------------------------------");
// do "m" zadaj palimdron, ak je to palindrom tak vypise ze ANO a ak nie je tak NIE


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter NUMBER please: ");
        long digital = myObj.nextLong();
        long copyofnumber = otoc(digital);
        System.out.println();
        if (copyofnumber == digital) { //ak dám 2x == znamená to porovnavaťak len 1x = tak prisudzujes hodnotu
            System.out.println("Je to PALINDROM:    " + digital + " a obratene takto: " + copyofnumber);
        }else {
            System.out.println("TOTO: " + digital + " Neni PALINDROM, choď domov! :wink:  " + copyofnumber);
        }

    }

    public static long otoc ( long digi ){
        long otocene = 0;
        double o = pc(digi);
        while (pc(digi) != 0){
            if (digi%10 != 0) {
                otocene = (long) (otocene + ((digi % 10 * Math.pow(10, o))));
                digi = digi / 10;
                o--;
            } else {
                digi = digi / 10;
                o--;
            }

        }
        return otocene/10;
    }


    public static int cs (int d) {  // ciferny sucet
        int count = 0;
        while (d != 0){
            count =  count + d%10;
            d = d/10;
        }
        return count;
    }

    public static long pc (long d) {  // pocet cifier
        int count = 0;
        while (d != 0){
            count++;
            d = d/10;
        }
        return count;



    }
}



