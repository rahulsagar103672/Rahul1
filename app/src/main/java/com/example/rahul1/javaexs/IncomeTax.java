package com.example.rahul1.javaexs;

public interface IncomeTax {
    String nameTaxpayer;


    int calculateTax(int income){
        return  income/10;
    }
}
