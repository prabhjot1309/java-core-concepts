//Geekina got stuck on an island. There is only one shop on this island and it is open on all days of the week except for Sunday. 
//Consider following constraints:

//N – The maximum unit of food you can buy each day.
//S – Number of days you are required to survive.
//M – Unit of food required each day to survive.
//Currently, it’s Monday, and she needs to survive for the next S days, initially she has no food.
//Find the minimum number of days on which you need to buy food from the shop so that she can survive the next S days. 
//If it is not possible to survive for S days then return -1.
public class GFG26 {
      public int minimumDays(int S, int N, int M) {
        // code here
        int totalFood= S*M;
        int sundays = S/7;
        int buyingDays= S-sundays;
        
        if (S>6 && 6*N < 7*M){
            return -1;
        }
        if (buyingDays*N < totalFood){
            return -1;
        }
        int days = totalFood/N;
        if (totalFood % N != 0){
            days++;
        }
        return days;
    }
}
