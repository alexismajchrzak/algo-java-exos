package com.company;

public class binaire {
        public static  int turnbinaryschearch( int sortedarray[], int search){
           int  index = -1;
            int low = 0;
            int max = sortedarray.length-1 ;
            while (low <= max ){
                int mid = (low+max)/2;
                if(sortedarray[mid]<search) {
                    low = mid + 1;
                }
                else if (sortedarray[mid]>search) {
                    max = mid - 1;
                }else if (sortedarray[mid]== search){
                    index= mid;
                    break ;

                }
            }return index ;




        }








    public static void main(String[] args) {

        int nombres [] = {1,2,3,4,5,6,7,8,9};
        int resultat = turnbinaryschearch(nombres,-1);
        System.out.println(resultat);



    }
}
