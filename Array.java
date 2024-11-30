import java.util.Date;
public class Array {
    
    public static void main(String[] args) {
        int[] reversedArr = reverseArr(new int[]{3,4,5,6,7});
        Date x= new Date();
        System.out.println("date: " + new Date().toString());
for (int i : reversedArr) {
    System.out.println(i);
}
    }

    public static int[] reverseArr(int[] givenArray){
      int[] reversedArr = new int[givenArray.length];
      for(int i=0, j=reversedArr.length-1; i< givenArray.length; i++,j--){
        reversedArr[j]=givenArray[i];
      }
      return reversedArr;

    }
}
