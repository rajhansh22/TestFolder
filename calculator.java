class calculator.java
{
	public static void main(String args[]){
		System.out.println("1.Add\n2.subtract\nmult");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		int a=15,b=3;
		switch(choice){
<<<<<<< HEAD
			case 1:int sum=a+b;
			       System.out.println(sum);
=======
			case 2:int sub=a-b;
			       System.out.println(sub);
>>>>>>> branch1
			       break;
			default:System.out.println("thats it");
		}
		//System.out.println("1.Add");
	}
}
