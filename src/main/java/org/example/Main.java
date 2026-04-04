package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sakuna just entered Tokyo Colony!");
        System.out.println("Maki, Yuta and Yuji are our only hope to stop him and save the world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your player, 1.Maki 2.Yuta 3.Yuji");
        int userPlayer = sc.nextInt();
        switch (userPlayer){
            case 1:
                System.out.println("Great chice! You've chosen Maki of the Zenin Clan");
                System.out.println("known for her having heavenly restriction and weilding\n"+"the split-soul katana, Maki will put up a great fight!");
                break;
            case 2:
                System.out.println("Great chice! You've chosen Yuta Okkotsu");
                System.out.println("Being 2nd to Gojo Yuta and with Rika by his side, Sakuna won't stand a chance!");
                break;
            case 3:
                System.out.println("Great chice! You've chosen Yuji Itadori");
                System.out.println("Being the vessel of Sakuna comes with it's benefits\n in addition to being a cursed womb:Death painting");
                break;
        }
    }
}