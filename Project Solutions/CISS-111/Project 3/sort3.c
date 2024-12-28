#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define BITRANGESIZE 1000000

void usage(int);

int main (int argc, char **argv) {

    char	n[9];
    FILE	*in, *out;
    char	*ba;
    int	c, x, y;

    if ( argc != 3 )
        usage(1);

    in = fopen(argv[1], "r");
    if ( in == NULL )
        usage(2);

    ba = calloc(BITRANGESIZE,sizeof(char));
    if ( ba == NULL )
        usage(4);

    out = fopen(argv[2], "w");
    if ( out == NULL ) {
        fclose(in);
        usage(3);
    }


    fgets(n, 9, in);
    while ( !feof(in) ) {
        c = atoi(n)-2000000;
        ba[c / 8] |= 0x80 >> (c % 8);	/*debug*/
        //printf("c = %d, byte = %d, bit = %02x\n",c+2000000, c/8, 0x80 >> (c%8) ); /*debug*/
        fgets(n, 9, in);
    }

    fclose(in);

    for ( x = 0; x < BITRANGESIZE; x++)
        for ( y = 0; y<8; y++)
            if ( ba[x] & (0x80 >> y) )
        fprintf(out, "%d\n", x*8+y+2000000);

    fclose (out);
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
            fprintf(stderr, "\nBitmap area could not be allocated.\n");
            perror("bit range memory");
            break;

        default:
            break;

    }

    fprintf(stderr, "\nUsage: sort3 infile outfile\n\n");
    exit(c);
}
