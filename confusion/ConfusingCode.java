package confusion;
// What Will Be The OutPut Of Bellow Code
// class ConfuseLoop {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         int i = 0;

//         while (i < arr.length) {
//             arr[i] = arr[i++] + arr[i];
//         }

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// What will be the output?
class TrickyConcat {
    public static void main(String[] args) {
        System.out.println(10 + 20 + "30" + 40 + 50);
    }
}


// A. 1020304050
// B. 30304050
// C. 303050
// D. 303040

// */


public class ConfusingCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int i = 0;

        while (i < arr.length) {
            arr[i] = arr[i++] + arr[i];
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
