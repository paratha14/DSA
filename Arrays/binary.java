import java.util.Arrays;
import java.util.*;
class binary{
    public static void main(String[] args) {
        binary x= new binary();
        int[] b= {2,3,5,6,9,14};
        x.binary_search(b, 15);

    }

    void binary_search(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

            while(start <= end){
                int mid=end-start/2;
                if(arr[mid]==target) {
                    System.out.println("value found, at position: " + mid);
                    return;
                }

                else if(target<arr[mid]){
                    end=mid-1;

                }
                else if(target>arr[mid]){
                    start=mid+1;
                }

            }
        System.out.println("value not found");

        }
    }
