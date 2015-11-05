package org.lwx.managesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by hfeng on 2015/11/5.
 */
public class MainTester {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Please input How many students do you have");

        try {
            int totoalStudent = Integer.parseInt(bufferedReader.readLine());
            if (totoalStudent < 0) {
                System.out.println("Sorry the number is too small");
                return;
            }
            Student[] students = new Student[totoalStudent];

            for (int i = 0; i < students.length; i++) {
                System.out.println("Please input 3 exam result for student Name." + (i + 1));
                double[] results = new double[3];
                for (int j = 0; j < 3; j++) {
                    results[j] = Double.parseDouble(bufferedReader.readLine());
                }
                students[i] = new Student("Name" + (i + 1), "NO." + (i + 1), results);
            }

            System.out.println("OK, all the students and their result is ranked below order " +
                    "by their sum of exam results");
            Arrays.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getTotalResult().compareTo(o2.getTotalResult());
                }
            });

            System.out.println("Rank \tName \tResult");
            for (int i = totoalStudent - 1; i >= 0; i--) {
                System.out.println("Pos" + (totoalStudent - i) + "\t" + students[i].getName() + "\t" +
                        students[i].getTotalResult().doubleValue());
            }
        } catch (IOException err) {

        }
    }
}

//---------> Sample Input and Output <-------------------------------------
//    Please input How many students do you have
//        4
//        Please input 3 exam result for student Name.1
//        100
//        99
//        98
//        Please input 3 exam result for student Name.2
//        97
//        99
//        60
//        Please input 3 exam result for student Name.3
//        66.5
//        99.5
//        66
//        Please input 3 exam result for student Name.4
//        98.5
//        97.5
//        69
//        OK, all the students and their result is ranked below order by their sum of exam results
//        Rank 	Name 	Result
//        Pos1	Name1	297.0
//        Pos2	Name4	265.0
//        Pos3	Name2	256.0
//        Pos4	Name3	232.0

