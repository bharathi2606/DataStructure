package SpiralMatrix;

import java.util.Scanner;

public class SprialMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int[][]a = new int[m][m];
		int r=m/2;
		int c=m%2==0?r-1:r;
		int n=1;
		a[r][c]=n++;
		if(m%2==0) {
			a[r-1][c]=n++;
			a[r-1][c+1]=n++;
			a[r][c+1] =n++;
			for(int i=2;i<=r;i++) {
				for(int j=(i-1);j >= (i-1)*-1;j--) {
					a[r+(i-1)][c+j]=n++;
				}
				for(int j=(i-2);j>=i*-1;j--) {
					a[r+j][c-(i-1)]=n++;
				}
				for(int j = 2-i; j<=i; j++) {
					a[r-i][c+j]=n++;
				}
				for(int j =(i-1)*-1;j<=(i-1);j++) {
					a[r+j][c+i]=n++;
				}
			}
		}else {
			for(int i=1;i<=r;i++) {
				for(int j=-i+1;j<=i;j++) {
					a[r-i][c+j]=n++;
				}
				for(int j=-i+1;j<=i;j++) {
					a[r+j][c+i]=n++;
				}
				for(int j=i-1;j>=(i*-1);j--) {
					a[r+i][c+j]=n++;
				}
				for(int j=i-1;j>=(i*-1);j--) {
					a[r+j][c-i]=n++;
				}

			}			
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+"          ");
			}
			System.out.println();
		}
	}

	/**
	 * even 
	a[r][c]=1

    a[r-1][c]=2            a[r][c+1]       a[r+1][c]         a[r][c-1]
    a[r-1][c+1]=3          a[r+1][c+1]     a[r+1][c-1]       a[r-1][c-1]

    a[r-2][c-1]           a[r-1][c+2]    a[r+2][c+1]       a[r+1][c-2]
    a[r-2][c]             a[r+0][c+2]    a[r+2][c]         a[r]
    a[r-2][c+1]           a[r+1][c+2]    a[r+2][c-1]       a[r-1]
    a[r-2][c+2]           a[r+2][c+2]    a[r+2][c-2]       a[r-2]
	 * */

	/**	
	 * odd
10  11 12 13
9	2  3  14
8	1  4  15
7	6  5  16


a[r][c]=1

a[r-1][c]=2

a[r-1][c+1]=3
a[r][c+1] =4

a[r+1][c+1]=5
a[r+1][c]=6
a[r+1][c-1]=7

a[r][c-1]=8
a[r-1][c-1]=9
a[r-2][c-1]=10

a[r-2][c]=11
a[r-2][c+1]=12
a[r-2][c+2]=13

a[r-1][c+2]=14
a[r][c+2]=15
a[r+1][c+2]=16
	 */
}
