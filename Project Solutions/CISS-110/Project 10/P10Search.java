public class P10Search {
    // The number of comparisons for each search method.
    public static int SEQ_NUM;
    public static int BIN_NUM;

    /**
     * Performs a sequential search.
     * @param data the pool of values
     * @param key the value sought
     * @return position of key or -1
     */
    public static int seqSearch(int[] data, int key) {
        boolean found = false;
        int i = 0;

        SEQ_NUM = 0;

        while ( !found && (i < data.length) ) {
            if ( data[i] == key )
                found = true;
            else
                i++;

            SEQ_NUM++;
        }

        return found ? i : -1;
    }

    /**
     * Performs a binary search.
     * @param data the pool of sorted values
     * @param key the value sought
     * @return position of key or -1
     */
    public static int binSearch(int[] data, int key) {
        boolean found = false;
        int midpoint = 0, first = 0, last;

        BIN_NUM = 0;
        last = data.length - 1;

        while ( !found && ( first <= last ) ) {
            midpoint = (first + last) / 2;
            if ( data[midpoint] == key )
                found = true;
            else if ( data[midpoint] > key )
                last = midpoint - 1;
            else
                first = midpoint + 1;

            BIN_NUM++;
        }

        return found ? midpoint : -1;
    }
}
