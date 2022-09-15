package ProjectEuler;
/*Author: Siya Agrawal
 Date: 15/09/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,September,Thursday
 Description:
 By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)



 */

public class Question18 {

    /*This problem seeks a maximum path sum in a binary tree. The brute force method, as indicated in the problem definition, is a very inefficient way to solve this problem.

    A more efficient method is to define the maximum path layer by layer, starting at the bottom. The maximum sum of 2 + 8 or 2 + 5 is 10, the maximum sum of 4 + 5 or 4 + 9 is 13, and the last maximum sum is 15. These numbers are now placed in the next row. This process cycles until only one number is left. This algorithm solves the sample triangle into four steps:

    Step 1:

                    3

                   7 4

                  2 4 6

                 8 5 9 3

    Step 2:

                    3

                   7 4

                 10 13 15

    Step 3:

                    3

                  20 19

    Step 4:

                    23 
    */
    public static void main(String[] args) {
        int[][] triangle = {  // Mutable
            {75},
            {95,64},
            {17,47,82},
            {18,35,87,10},
            {20, 4,82,47,65},
            {19, 1,23,75, 3,34},
            {88, 2,77,73, 7,63,67},
            {99,65, 4,28, 6,16,70,92},
            {41,41,26,56,83,40,80,70,33},
            {41,48,72,33,47,32,37,16,94,29},
            {53,71,44,65,25,43,91,52,97,51,14},
            {70,11,33,28,77,73,17,78,39,68,17,57},
            {91,71,52,38,17,14,91,43,58,50,27,29,48},
            {63,66, 4,68,89,53,67,30,73,16,69,87,40,31},
            { 4,62,98,27,23, 9,70,98,73,93,38,53,60, 4,23},
        };

        //loop for traversal of the triangle
        for (int i = triangle.length - 2; i >= 0; i--) {
			for (int j = 0; j < triangle[i].length; j++)
            //finding the max
				triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
		}
		System.out.println(Integer.toString(triangle[0][0])); 

    }
}
