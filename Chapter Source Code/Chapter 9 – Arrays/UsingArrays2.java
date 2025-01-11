public class UsingArrays2 {

    /**
     * Display a pretty array dump.
     *
     * @param array integer array
     */
    public static void dumpArray(int[] array) {

        int x, l = array.length;

        System.out.print("[ ");
        for (x = 0; x < l - 1; x++)
            System.out.print(array[x] + ", ");

        System.out.println(array[l - 1] + " ]");
    }

    /**
     * Delete the number at pos.
     *
     * @param array integer array
     * @param inuse number of values in use
     * @param pos   position to be removed
     * @return new in use count
     */
    public static int delete(int[] array, int inuse, int pos) {

    /*

    Length is 9, and inuse is 9. If we call delete
    with pos 2, we loop from 2 to 7. This is due to
    running off the end with x+1.

      0    1    2    3    4    5    6    7    8
     --------------------------------------------
    | 11 | 34 | 56 | -3 | 25 | 78 | 98 | 36 | 10 |
     --------------------------------------------
                 x   x+1                  x   x+1
                pos
                  BEGIN                    END


    Array after the move. In use is now 8.

      0    1    2    3    4    5    6    7    8
     --------------------------------------------
    | 11 | 34 | -3 | 25 | 78 | 98 | 36 | 10 | 10 |
     --------------------------------------------

    */

        int x;

        for (x = pos; x < inuse - 1; x++)
            array[x] = array[x + 1];

        return inuse - 1;
    }

    /**
     * Insert a value at pos.
     *
     * @param array integer array
     * @param inuse number of values in use
     * @param pos   position to be removed
     * @param val   value to be inserted
     * @return new in use count
     */
    public static int insert(int[] array, int inuse, int pos, int val) {

    /*

    Length is 9, and in use is 8. If we call insert
    with pos 3 and val 99, we loop from 7 to 3.
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

        for (x = inuse - 1; x >= pos; x--)
            array[x + 1] = array[x];

        array[pos] = val;
        return inuse + 1;
    }

    public static void main(String[] args) {

        int x, ia[] = new int[10], inuse = ia.length;

        // Populate array with 10 random numbers
        for (x = 0; x < ia.length; x++)
            ia[x] = (int) (Math.random() * 100 + 1);

        System.out.println("Original array.");
        dumpArray(ia);
        System.out.println("\nDeleting at index 3.");
        inuse = delete(ia, inuse, 3);
        dumpArray(ia);
        System.out.println("\nInserting a zero at index 5.");
        inuse = insert(ia, inuse, 5, 0);
        dumpArray(ia);
    }
}
