package Examples;
public class GenericMethodTest
{
// generic method printArray
public static < T ,D > void printArray(T what, D[] inputArray )
{
// Display array elements
for (  D element : inputArray ){
System.out.printf( "%s ", element );
}
System.out.println(what);
}
public static void main( String args[] )
{
// Create arrays of Integer, Double and Character
Integer[] intArray = { 1, 2, 3, 4, 5 };
Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
System.out.println( "Array integerArray contains:" );
printArray(5,intArray
); // pass an Integer array
System.out.println( "\nArray doubleArray contains:" );
printArray(5.34, doubleArray ); // pass a Double array
System.out.println( "\nArray characterArray contains:" );
printArray("loloka", charArray ); // pass a Character array
}
}