package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.util.Arrays;

public class Exercise18 {

	public static void main(String[] args) {
		int value = Utils.integer("Introduce número de elementos: ");

		int[] array = createAndInitializeArray(value);

		showInlineArray(array);

	}

	public static int[] createAndInitializeArray(int value){
		int[]array=new int[value];
		for(int i=0; i<value; i++){
			array[i]=i+1;
		}
		return array;
	}

	public static void showInlineArray(int [] array){
		for(int i =0; i<array.length; i++){
			if (i>0){
				System.out.println(" ");
			}
			System.out.println(array[i]);
		}
	}
}
