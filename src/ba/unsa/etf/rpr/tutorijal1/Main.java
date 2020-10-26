package ba.unsa.etf.rpr.tutorijal1;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj) {
       int suma=0;
       while(broj != 0){
           suma += broj%10;
           broj/=10;
       }
       return suma;
    }
    public static void main(String[] args) {
	System.out.println("Unesite cijeli broj:");
        Scanner unos = new Scanner (System.in);
        int n = unos.nextInt();
        System.out.println("Brojevi od 1 do unesenog broja djeljivi sumom svojih cifara su:");
        for (int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) ==0){
                System.out.println(i);
            }
        }
    }
}
