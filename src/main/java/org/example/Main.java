package org.example;
import java.util.Scanner;

public class Main {
    public static class Fighter{
        private String sorcerer;
        private int sakunaHealth;
        private String attackName;
        private int attackHp;

        //may need a constructor for sakuna health


        //getters- retrieve fields
        public String getSorcerer() {
            return sorcerer;
        }
        public int getSakunaHealth() {
            return sakunaHealth;
        }
        public String getAttackName() {
            return attackName;
        }
        public int getAttackHp() {
            return attackHp;
        }

        //setters - update fields
        public void setSorcerer(String sorcerer) {
            this.sorcerer = sorcerer;
        }
        public void setSakunaHealth(int sakunaHealth) {
            this.sakunaHealth = sakunaHealth;
        }
        public void setAttackName(String attackName) {
            this.attackName = attackName;
        }
        public void setAttackHp(int attackHp) {
            this.attackHp = attackHp;
        }

        //moves
        public void katanaSlice(){
           sakunaHealth -= 30;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fighter opponent = new Fighter();
        //set sakuna's health to 100
        opponent.setSakunaHealth(100);
        //user chooses sorcerer
        System.out.println("Choose your sorcerer: 1.Maki");
        int userSorcerer = sc.nextInt();
        sc.nextLine();
        //user chooses attack
        System.out.println("Choose your attack: 1a.Slice");
        String userAttack = sc.nextLine();
        //control flow based upon user input
        if(userSorcerer == 1 && userAttack.equals("1a")){
            opponent.setSorcerer("Maki");
            opponent.katanaSlice();
            opponent.getSakunaHealth();
        }
        //display results
        System.out.println("Sakuna's health is "+opponent.sakunaHealth+"%!\n"+ "Keep going you're not done yet!");



    }



     /*   System.out.println("Choose Maki");
        System.out.println("use slice");




        int sakunaHealth = 100;

        //This block needs to run until Sakuna is defeated (health <= 0)
        do {


            //Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.println("Choose your player, 1.Maki 2.Yuta 3.Yuji");
            int userPlayer = sc.nextInt();

            switch (userPlayer) {
                case 1:
                    System.out.println("You've chosen Maki of the Zenin Clan");
                    System.out.println("");
                    System.out.println("known for her having heavenly restriction and weilding\n" + "the split-soul katana, Maki will put up a great fight!");
                    System.out.println("");
                    System.out.println("Choose your attack, Sakuna is approaching!");
                    System.out.println("");
                    System.out.println("1.Split-Soul katana slice (30hp)  2.Dragon bone vertical Slash (20hp)");
                    int makiMove = sc.nextInt();
                    if (makiMove == 1) {
                        System.out.println("Maki used Split-Soul katana slice.\nThis is highly effective Sakuna just lost 30% of his health!");
                        sakunaHealth -= 30;
                        System.out.println("");
                        System.out.println("He's at " + sakunaHealth + "%");
                    } else if (makiMove == 2) {
                        System.out.println("Maki used Dragon bone vertical Slash");
                        sakunaHealth -= 20;
                        System.out.println("");
                        System.out.println("He's at " + sakunaHealth + "% health now!");
                    }
                    break;


                case 2:
                    System.out.println("You've chosen Yuta Okkotsu");
                    System.out.println("");
                    System.out.println("Being 2nd to Gojo and with Rika by his side, Sakuna won't stand a chance!");
                    System.out.println("");
                    System.out.println("Choose your attack, Sakuna is approaching!");
                    System.out.println("");
                    System.out.println("1.Rika's Punch (10hp) 2.Domain Expansion: Authentic Mutual Love(60hp)");
                    int yutaMove = sc.nextInt();
                    if (yutaMove == 1) {
                        System.out.println("Yuta used Rika's Punch.");
                        sakunaHealth -= 10;
                        System.out.println("");
                        System.out.println("He's at " + sakunaHealth + "%");
                    } else if (yutaMove == 2) {
                        System.out.println("Domain Expansion: Authentic Mutual Love, Sakuna is in trouble!");
                        sakunaHealth -= 60;
                        System.out.println("");
                        System.out.println("He's at " + sakunaHealth + "% health now!");
                    }
                    break;
                case 3:
                    System.out.println("You've chosen Yuji Itadori");
                    System.out.println("");
                    System.out.println("Being the vessel of Sakuna comes with it's benefits\nin addition to being a cursed womb:Death painting");
                    System.out.println("");
                    System.out.println("Choose your attack, Sakuna is approaching!");
                    System.out.println("");
                    System.out.println("1.Black Flash(30hp) 2.Dismantle(50hp)");
                    int yujiMove = sc.nextInt();
                    if (yujiMove == 1) {
                        System.out.println("Yuji used Black Flash.");
                        sakunaHealth -= 30;
                        System.out.println("");
                        System.out.println("Oooo that hurt him! He's at " + sakunaHealth + "%");
                    } else if (yujiMove == 2) {
                        System.out.println("Yuji used dismantle, Sakuna is hurt!");
                        sakunaHealth -= 50;
                        System.out.println("");
                        System.out.println("He's at " + sakunaHealth + "% health now!");
                        break;
                    }
            }
        } while(sakunaHealth > 0);
        //

        //informs user of Sakuna's defeat
        if(sakunaHealth <= 0){
            System.out.println("You did it,Sakuna has been defeated!!");
        }*/

}















