// public class For {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }

//     }
// }

// public class For {

//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 0; i<=5 ; i++) {
//             sum = sum + i;
//         }
//         System.err.println("Sum:" + sum);
//     }
// }


public class For {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i<=20; i++) {
            if(i%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}