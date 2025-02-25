package Streams.Into;

import java.util.LinkedList;
import java.util.List;

public class SimplExp {
    public static void main(String[] args) {

        List<Integer> salaryList = new LinkedList<>();

        salaryList.add(1200);
        salaryList.add(7200);
        salaryList.add(3200);
        salaryList.add(6200);
        salaryList.add(4200);

        int count = 0;
        for(Integer val : salaryList){
            if (val <= 1200){
                count++;
            }
        }
        System.out.println("The salary of an employee: " + count);

        // Streams Example

        long output = salaryList.stream().filter((Integer sal) -> sal <= 1200).count();
        System.out.println("The value of Employee salary is: " + output);
    }
}
