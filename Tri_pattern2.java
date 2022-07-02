import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

//Right Triangle pattern.

public class Tri_pattern2 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

}

/*output:- 
1
12
123
1234
12345 
*/

public class Tri_pattern2 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
/*outpur: -
1
22
333
4444
55555
*/

public class Tri_pattern2 {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.print("\n");
        }
    }
}
/*output:-
1 2 
3 4 5 
6 7 8 9 
10 11 12 13 14 
15 16 17 18 19 20 
*/

public class Tri_pattern2 {
    public static void main(String args[]) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*output:-
1 2 3 
2 3 
3 
*/

public class Tri_pattern2 {
    public static void main(String args[]) {
        int n = 12;
        for (int i = 0; i <= n; i += 2) {
            for (int j = 0; j <= i; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*output:-
0 
0 2 
0 2 4 
0 2 4 6 
0 2 4 6 8 
0 2 4 6 8 10 
0 2 4 6 8 10 12 
*/

public class Tri_pattern2 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(" 2 ");
                    // System.out.println();
                } else {
                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
    }
}
/*output:-
1 
2  2 
1  1  1 
2  2  2  2 
1  1  1  1  1
*/


