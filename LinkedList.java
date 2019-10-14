class Node{

	int value;
	Node next;
	Node head;
		static{}
	Node(int value){
		this.value = value;
	}
	public static void main(String[]args){
		LinkedList cake = new LinkedList();
		
		System.out.println(cake.value);
		System.out.println(cake.next);
		System.out.println(cake);
		
		}
		public static void fill(Node cake, int index){
			if (index >= 0){
			cake.value = index;
			
			}else{return;};
		}
		public static void print(Node cake){
			System.out.println(cake.value);
			if(cake.next == null){return;}
			else{print(cake.next);};
		}
	
	
}
