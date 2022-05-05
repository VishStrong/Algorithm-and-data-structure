class Stack{
	
	int[] arr;
	int top1;
	int top2;
	int size;
	Stack(int s){
		arr = new int[s];
		size=s;
		top1=-1;
		top2=s;
	}
	

	void push1(int value){
		if(top1+1==top2){
			System.out.println("Stack full");
			return;
		}
		else{
			arr[++top1]=value;
		}
		 
		
	}
	void push2(int value){
		if(top2-1==top2){
			System.out.println("Stack full");
			return;
		}
		else{
			arr[--top2]=value;
		}
		 
		
	}
	
	void pop1(){
		if(top1<0){
			System.out.println("no element in stack");
		return;
		}
	   int result=arr[top1];
	   top1++;
	   System.out.println("Popped element from stack1 is :"+result);
	}
	void pop2(){
		if(top2>size){
			System.out.println("no element in stack");
		return;
		}
	   int result=arr[top2];
	   ++top2;
	   System.out.println("Popped element from stack2  is "+result);
	}
	
	public static void main(String [] args){
		Stack s1= new Stack(10);
		s1.push1(5); 
        s1.push2(10); 
        s1.push2(15); 
        s1.push1(11); 
		s1.pop1();
        s1.push2(7); 
        s1.push2(40);
		s1.pop2();
		
	}
	
}