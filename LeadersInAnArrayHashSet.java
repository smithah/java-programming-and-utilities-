import java.util.*;

     int arr[] = {98,23,54,12,20,7,27};
     int leader = -1;

Set<Integer> leaderelement = new HashSet<Integer>();

for(int i = arr.length -1 ; i >=0; i--) {
    if(arr[i] > leader ) {
        leader = arr[i];
        leaderelement.add(arr[i]);
    }
}
  System.out.println(leaderelement);
 
Input:{16,17,4,3,5,2}, {1, 7, 5,4,6},{6, 7, 4, 3, 5, 2},{98,23,54,12,20,7,27},{95, 4, 46 ,8, 12 ,21}
output:[17, 2, 5] ,[6, 7],[2, 5, 7],[98, 54, 27],[21, 46, 95]
