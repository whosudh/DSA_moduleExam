import java.util.*;
class Twostack{
	int[] arr;
	int size;
	int top1, top2;
	Twostack(int p){
		size = p;
		arr = new int[p];
		top1 = p/2 + 1;
		top2 = p/2;
	}
	void push1(int x){
		if(top1 > 0)
		{
			top1-- ;
			arr[top1] = x;
		}else{
		System.out.println("Stack overflow");
		return;
		}
	}
	
	void push2(int x){
		if(top2 < size -1)
		{
			top2++ ;
			arr[top2] = x;
		}else{
		System.out.println("Stack overflow");
		return;
		}
	}
	
	int pop1(){
		if(top1 <= size/2){
			int x = arr[top1];
			top1++;
			return x;
		}else{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		if(top2 >= size/2 + 1){
			int x = arr[top2];
			top2--;
			return x;
		}else{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 1;
	}
}
	
	class Main{
		public static void main(String...args){
			Twostack ts = new Twostack(5);
			
			ts.push1(5);
			ts.push2(10);
			ts.push2(15);
			ts.push1(11);
			ts.push2(7);
			ts.push2(40);
			System.out.println("popped element from stack1 is" + ts.pop1());
			System.out.println("popped element from stack1 is" + ts.pop2());
		}
	}