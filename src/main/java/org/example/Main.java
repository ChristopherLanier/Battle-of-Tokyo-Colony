package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sakuna just entered Tokyo Colony!");
        System.out.println("Maki, Yuta and Yuji are our only hope to stop him and save the world!");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your player, 1.Maki 2.Yuta 3.Yuji");
        int userPlayer = sc.nextInt();
        int sakunaHealth = 100;
        switch (userPlayer){
            case 1:
                System.out.println("Great chice! You've chosen Maki of the Zenin Clan");
                System.out.println("known for her having heavenly restriction and weilding\n"+"the split-soul katana, Maki will put up a great fight!");
                System.out.println("");
                System.out.println("Choose your move but hurry, Sakuna is approaching!");
                System.out.println("1.Split-Soul katana slice 2.Dragon bone vertical Slash");
                int playerMove = sc.nextInt();
                if(playerMove == 1){
                    System.out.println("Maki used Split-Soul katana slice.\n This is highly effective Sakuna just lost 30% of his health!");
                    sakunaHealth-=30;
                    System.out.println("He's at "+sakunaHealth+" health now, keep pressing forward");
                } else if (playerMove == 2) {
                    System.out.println("Maki used Dragon bone vertical Slash");
                }

                break;
            case 2:
                System.out.println("Great choice! You've chosen Yuta Okkotsu");
                System.out.println("Being 2nd to Gojo, Yuta with Rika by his side, Sakuna won't stand a chance!");
                break;
            case 3:
                System.out.println("Great chice! You've chosen Yuji Itadori");
                System.out.println("Being the vessel of Sakuna comes with it's benefits\n in addition to being a cursed womb:Death painting");
                break;
        }
    }
}