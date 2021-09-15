package com.company;

public class Main {

    public static void main(String[] args) {
	int COUNT = 0;
	int S = 0;
	int [] VALUE = {3, 5, 0, 11, 1};
	for (int i = 0; i < 5; i = i + 1) {
	    if (!(VALUE[i] == 0)) {
	        S = S + VALUE[i];
	        COUNT ++;
        }
    }
	if (COUNT == 0) {
        System.out.println(0);
    }
	else System.out.println(S/COUNT);
    }
}
