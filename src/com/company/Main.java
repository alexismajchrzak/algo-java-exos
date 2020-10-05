package com.company;

public class Main {

    public static void main(String[] args) {
            int[]scores = new int[7]; //déclaration d'un tableau à 7 cases

            scores[0] = 18;    //affectation d'une valeur dans le tableau case 1 ( index 0)
            scores[1]= 14;
            scores[2]= 13;
            scores[3]= 16;
            scores[4]= 20;
            scores[5]= 8;
            scores[6]= 5;   // "" case 7 ( index6)


            for (int i = 0 ; i<scores.length ; i++) {    // mettre dans i tout les score puis les additionner
                    int score = scores[i];
                    System.out.println(scores[score]);        // I++ = I+1
                    




                    }
            float moyen = 0;
            for (int i = 0;i < scores.length; i++){
                    moyen = moyen + scores [i];
                    System.out.println(moyen);
            }



    }
}
