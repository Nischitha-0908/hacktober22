import java.util.*;
public class Alphabets_BubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many u want to enter ");
		int n=sc.nextInt();
		char a[]=new char[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.next().charAt(0);
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[i]>a[i+1]) {
					char temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;}}}		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");}}
	


