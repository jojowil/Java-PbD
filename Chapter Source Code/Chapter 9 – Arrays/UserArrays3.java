public class UsingArrays3 {

    // Dump the array. Make it pretty.
    public static void dumpArray (int[] array) {

        int x, l = array.length;

        System.out.print("[ ");
        for ( x = 0 ; x < l - 1 ; x++ )
            System.out.print(array[x] + ", ");

        System.out.println(array[l-1] + " ]");

    }
    // Delete the number at pos.
    public static int delete(int[] array, int inuse, int pos) {

    /*

    Length is 9, inuse is 9. If we call delete
    with pos 2, we loop from 2 to 7. This is due to
    running off the end with x+1.

      0    1    2    3    4    5    6    7    8
     --------------------------------------------
    | 11 | 34 | 56 | -3 | 25 | 78 | 98 | 36 | 10 |
     --------------------------------------------
                 x   x+1                  x   x+1
                pos
                  BEGIN                    END


    Array after move. In use is now 8.

      0    1    2    3    4    5    6    7    8
     --------------------------------------------
    | 11 | 34 | -3 | 25 | 78 | 98 | 36 | 10 | 10 |
     --------------------------------------------

    */

        int x;

        /* if pos is out of bounds or there are no
         * items in the array, it is an error.
         */
        if ( pos > inuse || pos < 0 || inuse == 0 )
            return -1;

        // Note: if pos == inuse, no move happens.
        // Also, if pos == 0 and inuse == 1,
        // no move happens.
        for ( x = pos; x < inuse - 1; x++)
            array[x] = array[x+1];

        return inuse - 1;
    }

    // Insert val at pos.
    public static int insert(int[] array, int inuse, int pos, int val) {

    /*

    Length is 9, inuse is 8. If we call insert
    with pos 4 and val 99, we loop from 7 to 4.
    This is due to running off the end with x+1.

      0    1    2    3    4    5    6    7    8
     --------------------------------------------
    | 11 | 34 | -3 | 25 | 78 | 98 | 36 | 10 | 0  |
     --------------------------------------------
                      x   x+1             x   x+1
                     pos
                       END                BEGIN

    Array after move with inuse at 9.

      0    1    2    3    4    5    6    7    8
     --------------------------------------------
    | 11 | 34 | -3 | 99 | 25 | 78 | 98 | 36 | 10 |
     --------------------------------------------

    */

        int x;

        /* if the array is exhausted, cannot extend here.
         * You can add to one past inuse, but not past the end
         * of the array.
         * If pos is out of bounds, it is an error.
         */
        if ( inuse == array.length || pos > inuse + 1
                || pos > array.length || pos < 0 )
            return -1;

        // Note:
        for ( x = inuse - 1; x >= pos; x--)
            array[x+1] = array[x];

        array[pos] = val;
        return inuse + 1;
    }

    public static void main(String[] args) {

        int x, ia[] = new int[10], inuse = ia.length, result;

        // Populate array with 10 random numbers
        for ( x = 0; x < ia.length; x++ )
            ia[x] = (int)(Math.random() * 100 + 1);

        System.out.println("Original array.");
        dumpArray(ia);
        System.out.println("\nDeleting at index 3.");
        inuse = delete(ia, inuse, 3);
        dumpArray(ia);
        System.out.println("\nInserting a zero at index 5.");
        result = insert(ia, inuse, 5, 0);
        if (result != -1 )
            inuse = result;
        dumpArray(ia);
    }

}
