package com.basics.flowcontrol.while_loop;

public class WhileLoopExample {

	public static void main(String[] args) {
		int count = 0;
        while (count < 11){
            System.out.print(count);
           if (count == 3)
                break;
            count++;
        }
        System.out.println("Finish");
        System.out.print(count);

	}

}
