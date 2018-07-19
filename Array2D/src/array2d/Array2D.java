package array2d;

public class Array2D {

    public static void main(String[] args) {
        int i, j, sum=0, avg=0;
        int Mark[][]={{1,2},{3,4}};
        for (i=0; i<2; i++)
        {
            for (j=0; j<2; j++)
            {
                sum= sum + Mark[i][j];
                System.out.println(Mark[i][j]);
            }
            System.out.println();
        }
        System.out.println("sum:" +sum);
        avg= sum/2;
        System.out.println("avg:" +avg);
    }
}
