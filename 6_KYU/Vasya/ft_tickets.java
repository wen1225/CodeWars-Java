/* Improved Solution (scroll down for initial solution) */
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

*/

/* Initial Solution */
/*
import java.util.*;
public class Line {
  public static String Tickets(int[] queue)
  {
      if (queue[0] != 25)
          return "NO";
      else{
          ArrayList<Integer> availableBills = new ArrayList<>(); 
          for (int n = 0; n < queue.length; n++){
              if (queue[n] == 25)
                  availableBills.add(25);
              else if (queue[n] == 50){
                  //check if availableBills has 25.
                  //if got, remove the 25 and add a 50
                  if (!availableBills.isEmpty()){
                      Iterator<Integer> i = availableBills.iterator();
                      while (i.hasNext()){
                          Integer temp = i.next();
                          if (temp.equals(25)){
                              i.remove();
                              availableBills.add(50);
                              break;
                          }
                      }
                      continue;
                  }
                  //if here, means no 25 bills
                  return "NO";
              }
              else{
                  //check if there's three 25 bills or one 25 bill and one 50 bill
                  ArrayList<Integer> billIndex = new ArrayList<>();
                  for(int i = 0; i < availableBills.size(); i++){
                      if (availableBills.get(i) == 25 && billIndex.size() < 3)
                          billIndex.add(i);
                  }
                  //check if billIndex's size is 3. If yes, means it has enough bills, else do the second option
                  if (billIndex.size() == 3){
                      //because enough bills, remove the bills from availableBills
                      Iterator<Integer> i = availableBills.iterator();
                      while (i.hasNext()){
                          Integer temp = i.next();
                          if (temp.equals(25))
                              i.remove();
                      }
                      availableBills.add(100);
                      continue;
                  }
                  //if here, means option 1 doesn't work
                  else{
                      billIndex.clear();
                      //find one 25 bill
                      for (int i = 0; i < availableBills.size(); i++){
                          if (availableBills.get(i) == 25){
                              billIndex.add(i);
                              break;
                          }
                      }
                      //find one 50 bill
                      for (int i = 0; i < availableBills.size(); i++){
                          if (availableBills.get(i) == 50){
                              billIndex.add(i);
                              break;
                          }
                      }
                      //check if conditions are met
                      if (billIndex.size() == 2){
                          Iterator<Integer> i = availableBills.iterator();
                          while (i.hasNext()){
                              Integer temp = i.next();
                              if (temp.equals(25) || temp.equals(50))
                                  i.remove();
                          }
                          availableBills.add(100);
                          continue;
                      }
                      //if here, means both option doesn't work so return no
                      return "NO";
                  }
              }
          }   
      }
      //if here, means success so return yes
      return "YES";
  }
}
*/
