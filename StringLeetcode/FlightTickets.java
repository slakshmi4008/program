package StringLeetcode;

import java.util.Arrays;

public class FlightTickets {
    public static void main(String[] args) {
        int[][] bookings={
                {1,2,10},
                {2,3,20},
                {2,5,25}

        };

        //
        // corpFlightBookings(bookings,5);
        flight(bookings,5);
    }

    public static void flight(int[][] bookings,int n) {
        int [] res = new int[n];
            for(int j=0;j<3;j++){

                int start=bookings[j][0],end=bookings[j][1];
                while(start<=end)
                {
                    res[start-1]+=bookings[j][2];
                    start++;
                }
                //if(bookings[j][0]<=i && i<=bookings[j][1]){
                  //  res[i-1]+=bookings[j][2];
                //}
            }


        System.out.println(Arrays.toString(res));
    }

        public static int[] corpFlightBookings(int[][] bookings, int n) {
            int[][] booked = new int[bookings.length][n];
            int firstBooking=0;
            int lastBooking=0;
            int seats =0;

            for(int i=0;i<bookings.length;i++){

                firstBooking=bookings[i][0];
                lastBooking=bookings[i][1];
                seats =bookings[i][2];

                booked[i][firstBooking-1]=seats;
                booked[i][lastBooking-1]=seats;
            }
            System.out.println(Arrays.deepToString(booked));
            int [] sum= new int[n];
         int temp=0;

            for(int i=0;i<n;i++ ){
                for(int j=0;j<bookings.length-1;j++){
                    temp=sum[i]+booked[j][i];
                }
                sum[i]=temp;
            }
            return sum;
        }
    }


