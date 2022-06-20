import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CodeTest {


    @Test
    public void test() {
//        test1("John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker","Example");
        System.out.println(test1(new int[]{3, 2, 3, 2, 4}));
//        test1("","Example");
    }

    public int test1(int[] A) {
        if(A.length <= 2){
            return A.length;
        }

        int result = 3;
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i = 2; i < A.length; i++) {
            if(A[i-2] == A[i] &&  (i-3 >= 0  && A[i-3] == A[i-1])){
                result++;
            }else{
                result = 3;
                
//                integers.add(result);
//                result = 3;
            }
        }
        return result;
    }

}
