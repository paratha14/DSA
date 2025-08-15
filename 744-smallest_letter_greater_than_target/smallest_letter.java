import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
    Solution x= new Solution();
    char[] b={'c','f','j'};
        System.out.println(x.nextGreatestLetter(b,'z'));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return (start < letters.length) ? letters[start] : letters[0];
    }
    }
