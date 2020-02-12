package com.cg.lab6.exercise5;

import java.util.Scanner;

public class ModifyNumberMain {

		public static void main(String[] args) {
			  Scanner scan=new Scanner(System.in);
			  ModifyNumber obj=new ModifyNumber();
			  System.out.println("Enter Number:");
			  String input=scan.nextLine();
			  System.out.println(obj.modifyNumbers(input));
			     scan.close();

		}		}
