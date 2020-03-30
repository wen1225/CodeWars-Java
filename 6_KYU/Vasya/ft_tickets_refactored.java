public class Line {
  public static String Tickets(int[] queue)
  {
      if (queue[0] != 25)
          return "NO";
      else{
          int bill25 = 0, bill50 = 0;
          for (int customerBill : queue){
              if (customerBill == 25)
                  bill25++;
              else if (customerBill == 50 && bill25 > 0){
                  bill50++;
                  bill25--;                }
              else if (customerBill == 100 && bill25 > 0 && bill50 > 0){
                  bill25--;
                  bill50--;
              }
              else if (customerBill == 100 && bill25 > 2){
                  bill25 -= 3;
              }
              else
                  return "NO";
            }   
        }
        //if here, means successful processing of all customers, so return yes
        return "YES";
  }
}
