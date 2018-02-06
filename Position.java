import java.util.Arrays;
/**
 * Write a description of class Poisiton here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Position
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Poisiton
     */
    public Position(int r, int c)
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static Position findPosition(int num, int[][] intArr)
    {
        for (int row = 0; row < intArr.length; row++){
            for (int col = 0; col < intArr[0].length; col++){
                if(intArr[row][col] == num){
                    System.out.println(new Position(row, col));
                    return new Position(row, col);
                }
            }
        }
        return null;
    }
    
    public static Position[][] getSuccessorArray(int[][] orgArray){
        Position[][] scsrArray = new Position[orgArray.length][orgArray[0].length];
        for (int row = 0; row < orgArray.length; row++){
            for (int col = 0; col < orgArray[row].length; col++){
                scsrArray[row][col] = findPosition(orgArray[row][col] + 1, orgArray);
            }
        }
        System.out.println(java.util.Arrays.toString(scsrArray));
        return scsrArray;
    }
    
    public static void main(){
        int mat[][] = { { 17, 23, 15, 11 }, { 44, 29, 12, 76 },{ 21, 63, 35, 57 } };
        System.out.println(java.util.Arrays.toString(mat));
        Position pos = new Position(12, 2);
        pos.findPosition(12, mat);
        System.out.println(getSuccessorArray(mat));
    }
}
