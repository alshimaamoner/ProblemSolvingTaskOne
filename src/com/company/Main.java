package com.company;

public class Main {

    public static void main(String[] args) {
	    try {
	        test();
        }catch (OutOfMemoryError | CustomException ex){
            System.out.println("Exception .......");
        }finally {
            System.out.println("ok........");
        }

    }
    public static  void test() throws CustomException {
        throw new CustomException();
    }
}
