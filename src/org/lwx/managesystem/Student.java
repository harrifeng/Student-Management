package org.lwx.managesystem;

import java.math.BigDecimal;

/**
 * Created by hfeng on 2015/11/5.
 */
public class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double[] getResults() {
        return results;
    }

    public void setResults(double[] results) {
        this.results = results;
    }

    public BigDecimal getTotalResult() {
        double total = 0;
        for (int i = 0; i < results.length; i++) {
            total += results[i];
        }
        return new BigDecimal(total);
    }

    // data should be private
    private String name;
    private String number;
    private double[] results;

    public Student(String name, String number, double[] results) {
        this.name = name;
        this.number = number;
        this.results = results;
    }

}
