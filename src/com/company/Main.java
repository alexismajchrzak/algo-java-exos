package com.company;

public class Main {

        /**
         * afficher les scores du tableau
         * @param tableau
         */
        static void afficherscore (int[]tableau ){                 //declare " afficher score "
                for (int i =0;i<tableau.length; i++ ){            //si le nombre de tableau est superieur a i, i++
                        System.out.println(tableau[i]);          // afficher tableau de i
                }
        }

        /**
         * afficher la valeur maximum du tableau
         * @param scoremax
         * max = scoremax[i]
         * @return
         * renvoyer le max
         */
        static int maxtableau (int[] scoremax  ){             // declare maxtableau
         int max= 0 ;                                        // donne une valeur aléatoire pour pas avoir d'erreur
         for (int i =0;i<scoremax.length; i++ ) {           //pareil que en haut
              if ( max < scoremax[i] ){                    //tant que max < scoremax[i] faire i++
                      max = scoremax[i];                  //max = scoremax[i] si il atteint le maximum
                  System.out.println("max=" + max);      //afficher "max =" + le résulatat du maximum
              }
         }
    return max;                                              //retouner à max

        }

        /**
         * declarer vrai ou faux si un nombre est inférieur à 10
         * @param tab
         * tab = nombre de case dans le tableau
         * @return
         * return true si un nombre < à 10
         * return false si aucun nombre < à 10
         */
        static  boolean containsinf10 (int[] tab) {                    // declare un boolean "..."
            for (int i = 0; i < tab.length; i++) {                // initialise i à =0 si i < au nombres de tab i++
                if (tab[i] < 10) {                           // si tab de  i inférieur à 10
                    return true;                        // dire vrai

                }
                                                      // si i = tab.lenght et toujours pas de i<10 dire faux
            }
return false;
        }

        public static void main (String[]args){
                int[] scores = new int[7];                    //déclaration d'un tableau à 7 cases
                                                             // pour rajouter des colone = [] [] apres le int

                /**scores
                 * tableau de 7 cases
                 * chaques cases a une valeur attribuer
                 */
                scores[0] = 18;      //affectation d'une valeur dans le tableau case 1 ( index 0)
                scores[1] = 14;
                scores[2] = 13;
                scores[3] = 16;
                scores[4] = 20;
                scores[5] = 8;
                scores[6] = 5;     // "" case 7 ( index6)

                afficherscore(scores);      //on apelle la variable global pour afficher le scores
                maxtableau(scores);        // affiche valeurs max
                containsinf10(scores);    // affiche si vrai ou faux sil ya nombre <10

                for (int i = 0; i < scores.length; i++) {     // mettre dans i tout les score puis les additionner
                        int score = scores[i];               // declare "score" = aux nombres de scores existant
                        System.out.println(score);          // affiche score


                }
                        /**
                         * faire la moyenne de tableau
                         * additionner chaque résultat puis diviser par le nombres de scores.lenght
                         */
                float moyen = 0;                             //déclare "moyen" qui = 0
                for (int i = 0; i < scores.length; i++) {   //boucle for,i=0,i inférieur aux nombre de scores faire i +1
                        moyen = moyen + scores[i];         // moyen = chaque score s'additionnant
                        System.out.println(moyen);        // afficher moyen

                }

                float resultat = moyen / scores.length;   //declare float pour résultat a virgule
                System.out.println(resultat);      //afficher résulatat des additions diviser par le nombres de scores existant

        }
}

