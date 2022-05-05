import java.util.*;
class Insertion{
	void insertions(int a[]){
		int n = a.length;
		int element = a[n-1];
		for(int i=n-2; i>=0; i--){
			if(a[i] > element){
			a[i+1] = a[i];
			print(a);
			}else{
				a[i+1] = element;
				print(a);
				break;
			}
			
		}
	}
	
	void print(int []a){
		for(int i : a){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		Insertion is = new Insertion();
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i =0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		is.insertions(arr);
	}
}