package code;

import java.util.Arrays;

public class Heaters {
    public static void main(String[] args) {
        int[] houses = {1};
        int[] heaters = {1,2,8,9,22,23,67,99,102};
        //findRadius(houses, heaters)
        System.out.println(findRadius(houses, heaters));
    }


//    public static int findRadius(int[] houses, int[] heaters) {
//        int x = 0;
//        int i = 0;
//        int jump = 0 ;
//        int skip;
//        if(houses.length > heaters.length){
//            skip = houses.length/heaters.length;
//        }else{
//            skip = 1;
//        }
//
//        while(i < houses.length){
//            for (int j = 0; j < skip; j++) {
//                x = Math.max(Math.abs(houses[i]- heaters[jump]), x);
//                i++;
//                if(i == houses.length){
//                    break;
//                }
//            }
//            if(jump < heaters.length-1){
//                jump++;
//            }
//        }
//        return x;
//    }


    public static int findRadius(int[] houses, int[] heaters){
        Arrays.sort(houses); //sort array houses
        Arrays.sort(heaters);//sort array heaters
        int radius = 0, i = 0; //inital radius
        for (int house : houses) {
            while (i < heaters.length - 1 && heaters[i] + heaters[i+1] <= house * 2) {
                i++;
            }
            radius = Math.max(radius, Math.abs(house - heaters[i]));
        }
        return radius;

    }




}
