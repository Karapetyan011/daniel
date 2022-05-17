public class Triangles {
    public static void main(String[] args) {

        int count = 10;

        // *
        // *  *
        // *  *  *
        // *  *  *  *
        // *  *  *  *  *
        // *  *  *  *  *  *

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        {


        }
        System.out.println("===============================================================");

        // *  *  *  *  *  *
        // *  *  *  *  *
        // *  *  *  *
        // *  *  *
        // *  *
        // *

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < count - i; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }

        System.out.println("===============================================================");

        //                *
        //             *  *
        //          *  *  *
        //       *  *  *  *
        //    *  *  *  *  *
        // *  *  *  *  *  *

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < count - 1 - i; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }

        System.out.println("===============================================================");

        // *  *  *  *  *  *
        //    *  *  *  *  *
        //       *  *  *  *
        //          *  *  *
        //             *  *
        //                *

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < count - i; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }

        System.out.println("===============================================================");

        //                *
        //             *  *  *
        //          *  *  *  *  *
        //       *  *  *  *  *  *  *
        //    *  *  *  *  *  *  *  *  *
        // *  *  *  *  *  *  *  *  *  *  *

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < count - 1 - i; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }

        System.out.println("===============================================================");

        //                *
        //             *  *  *
        //          *  *  *  *  *
        //       *  *  *  *  *  *  *
        //    *  *  *  *  *  *  *  *  *
        // *  *  *  *  *  *  *  *  *  *  *
        //    *  *  *  *  *  *  *  *  *
        //       *  *  *  *  *  *  *
        //          *  *  *  *  *
        //             *  *  *
        //                *

        for (int i = (count - 1) * -1; i < count; i++) {

            int k = (i < 0) ? i * -1 : i;

            for (int j = 0; j < k; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < (count - k - 1) * 2 + 1; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}



// 1)
// *
// *  *
// *  *  *
// *  *  *  *
// *  *  *  *  *
// *  *  *  *  *  *


// 2)
// *  *  *  *  *  *
// *  *  *  *  *
// *  *  *  *
// *  *  *
// *  *
// *

// 3)
//                *
//             *  *
//          *  *  *
//       *  *  *  *
//    *  *  *  *  *
// *  *  *  *  *  *

// 4)
// *  *  *  *  *  *
//    *  *  *  *  *
//       *  *  *  *
//          *  *  *
//             *  *
//                *