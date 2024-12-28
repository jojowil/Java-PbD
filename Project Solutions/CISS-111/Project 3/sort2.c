#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void usage(int);
int intcmp(const void *, const void *);

int main (int argc, char **argv) {

    char    n[9];
    FILE    *in, *out;
    int    *ba, x, last;

    if ( argc != 3 )
        usage(1);

    ba = malloc( 4000000 * sizeof(int) );
    if ( ba == NULL )
        usage(4);

    in = fopen(argv[1], "r");
    if ( in == NULL )
        usage(2);

    out = fopen(argv[2], "w");
    if ( out == NULL ) {
        fclose(in);
        usage(3);
    }

    x = 0;
    fgets(n, 9, in);
    while ( !feof(in) ) {
        ba[x] = atoi(n);
        fgets(n, 9, in);
        x++;
    }

    fclose(in);

    qsort((char*)ba, 4000000, sizeof(int), intcmp );

    last = 0;
    for ( x = 0; x < 4000000; x++)
        if ( last != ba[x] ) {
            fprintf(out, "%d\n", ba[x]);
            last = ba[x];
        }

    fclose (out);
}

int intcmp(const void *a, const void *b) {

    return (*(int*)a - *(int*)b);
}

void usage(int c) {

    switch(c) {

        case 1:
            fprintf(stderr, "\nInvalid number of parameters.\n");
            break;

        case 2:
            fprintf(stderr, "\nError occurred with input file.\n");
            perror("inputfile");
            break;

        case 3:
            fprintf(stderr, "\nError occurred with output file.\n");
            perror("outputfile");
            break;
        case 4:
            fprintf(stderr, "\nCannot allocate memory for array.\n");
            break;
        default:
            break;

    }

    fprintf(stderr, "\nUsage: sort2 infile outfile\n\n");
    exit(c);
}
