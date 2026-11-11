package org.example;
import java.util.Scanner;

public class Main {
    public static class Fighter{

        private String sorcerer;
        private int sakunaHealth;


        //getters- retrieve fields
        public int getSakunaHealth() {
            return sakunaHealth;
        }

        public String getSorcerer() {
            return sorcerer;
        }

        public String getSorcererName(){
            return sorcerer;
        }

        //setters - update fields
        public void setSorcerer(String sorcerer) {
            this.sorcerer = sorcerer;
        }

        public void setSakunaHealth(int sakunaHealth) {
            this.sakunaHealth = sakunaHealth;
        }

        //Special attacks

             //Maki
        public void katanaSlice(){sakunaHealth -= 30;}
        public void dragonBoneSlash(){sakunaHealth -= 20;}

             //yuta
        public void authenticLove(){sakunaHealth -= 60;}
        public void rikaPunch(){sakunaHealth -= 15;}

            //yuji
        public void blackFlash(){sakunaHealth -= 60;}
        public void piercingBlood(){
            sakunaHealth -= 25;
            }

    }
    public static void main(String[] args) {

        //fighter class object, needed to access methods and attributes of class
        Fighter opponent = new Fighter();

        //set sakuna's health to 100
        opponent.setSakunaHealth(100);
        Scanner sc = new Scanner(System.in);

        do {
            //user chooses sorcerer
            System.out.println("Choose your sorcerer: 1.Maki 2.Yuji 3. Yuta");
            int userSorcerer = sc.nextInt();
            sc.nextLine();


            //control flow for Maki
            if (userSorcerer == 1) {
                opponent.setSorcerer("Maki");
                System.out.println("Nice choice picking "+opponent.getSorcererName()+"! She's a warrior!");
                System.out.println("Now choose your attack: a.Slice b.Vertical Slash");
                String userAttack = sc.nextLine();
                if (userAttack.equals("a")) {
                    opponent.katanaSlice();
                    opponent.getSakunaHealth();
                } else if (userAttack.equals("b")) {
                    opponent.dragonBoneSlash();
                    opponent.getSakunaHealth();
                }
            }


            //control flow for Yuji
            if(userSorcerer == 2){
                opponent.setSorcerer("Yuji");
                System.out.println(opponent.getSorcererName()+" is an absolute unit! Great choice!");
                System.out.println("Choose your attack: a. Black Flash b.Piercing Blood");
                String userAttack = sc.nextLine();
                if(userAttack.equals("a")) {
                    opponent.blackFlash();
                    opponent.getSakunaHealth();
                } else if(userAttack.equals("b")){
                    opponent.piercingBlood();
                    opponent.getSakunaHealth();
                }
            }

            //control flow for Yuta
            if(userSorcerer == 3){
                opponent.setSorcerer("Yuta");
                System.out.println("You chose "+opponent.getSorcererName()+"!"+" With Rika by his side, he'll be unstaoppable!");
                System.out.println("Choose your attack: a. Domain Expansion: Authentic Love b. Rika's Punch");
                String userAttack = sc.nextLine();
                if(userAttack.equals("a")) {
                    opponent.rikaPunch();
                    opponent.getSakunaHealth();
                } else if(userAttack.equals("b")){
                    opponent.authenticLove();
                    opponent.getSakunaHealth();
                }
            }

            //display results
            if(opponent.sakunaHealth <= 0){
                System.out.println("Sakuna has been defeated");
            } else if (opponent.sakunaHealth > 0) {
                System.out.println("Sakuna's health is " + opponent.sakunaHealth + "%!\n" + "Keep going you're not done yet!");
            }




        } while (opponent.getSakunaHealth() > 0);
    }


}















