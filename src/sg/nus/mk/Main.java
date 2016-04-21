package sg.nus.mk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {
public static void main(String args[]) throws IOException{
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//String line = br.readLine().trim();
	Scanner sc = new Scanner(System.in);
	int value1=sc.nextInt();
	BinaryGap test1 = new BinaryGap();
	int result=test1.solution(value1);
	System.out.println(result);
}
}
