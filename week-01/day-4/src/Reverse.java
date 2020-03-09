import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] numbers = {3, 4, 5, 6, 7};
        int [] numbers2 = {3, 4, 5, 6, 7};
        int reverse = 0;
        for (int i = numbers.length -1 ; i > -1; i--) {
            numbers2[reverse] = numbers[i];
            reverse++;

        }
        System.out.println("Before :" + Arrays.toString(numbers));
        System.out.println("After :" + Arrays.toString(numbers2));

    }
    // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`
}
