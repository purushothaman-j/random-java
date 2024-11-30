package Examples;
//  class FreshJuice {
//     enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
//     FreshJuiceSize size;
// }
public class FreshJuiceTest {
    
   
    public static void main(String[] args){
        FreshJuice freshJuice = new FreshJuice();
        freshJuice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println("size"+freshJuice.size);

 
    }
}
