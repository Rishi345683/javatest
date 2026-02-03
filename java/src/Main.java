//
//class Main{
//	static boolean iseven(int n) {
//		int digit=0;
//		while(n>0) {
//			int temp=n%10;
//			digit+=temp;
//			n=n/10;
//		}
//		if(digit%2==0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		int[] arr= {10,20,40,40,60};
//		for(int i=2;i<arr.length;i+=2) {
//			if(arr[i]%2==0) {
//				if(iseven(arr[i])) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
//	}
//}
//class Main{
//	static boolean ispalindrome(int n) {
//		int tem=n;
//		int rev=0;
//		while(n>0) {
//			int temp=n%10;
//			rev=rev*10+temp;
//			n=n/10;
//		}
//		return rev==tem;
//	}
//	public static void main(String [] args) {
//		int[] arr= {10,20,30,40,50};
//		int cnt=0;
//		for(int i=0;i<arr.length;i++) {
//			if(ispalindrome(arr[i])) {
//                    cnt++;
//			}
//		}
//		System.out.println(cnt);
//	}
//}
//class Main{
//	public static void main(String[] args) {
//		String str="rishi";
//		int cont=0;
//		int vow=0;
//		for(char ch:str.toCharArray()) {
//			if("aeiou".indexOf(ch)!=-1) {
//				vow++;
//			}else {
//				cont++;
//			}
//		}
//		System.out.println(vow+" "+cont);
//	}
//}
//interface a{
//	static void show() {
//		System.out.println("show");
//	}
//}
//class Main{
//	public static void main(String[] args) {
//		a.show();
//	}
//	
//}
//interface A {
//    default void show() {
//        System.out.println("A");
//    }
//}
//
//interface B {
//    default void show() {
//        System.out.println("B");
//    }
//}
//
//public class Main implements A, B {
//
//    // Mandatory override to resolve ambiguity
//    public void show() {
//        System.out.println("Resolved ambiguity");
//    }
//
//    public static void main(String[] args) {
//        Main obj = new Main();
//        obj.show();
//    }
//}
//interface A {
//    void show();    
//}
//
//interface B {
//    void display();  
//}
//
//public class Main implements A, B {
//
//    public void show() {
//        System.out.println("Method implemented once for both A and B");
//    }
//    public void display() {
//        System.out.println("Method implemented once for both A and B");
//    }
//
//    public static void main(String[] args) {
//        Main obj = new Main();
//        obj.show();
//        obj.display();
//    }
//}
//import java.util.*;
//class Main{
//	public static void main(String[] args) {
//		List<String> l=new ArrayList<>();
//		l.add("apple");
//		l.add("mango");
//		System.out.println(l.get(0));
//		List li=new ArrayList();
//		li.add(0);
//		li.add("1");
//		System.out.println(li.get(0));
//	}
//}
import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pin=2004;
		int samount=10000;
		int famount=10000;
		System.out.println("Wellcome");
		System.out.println("Choose Option");
		System.out.println("1. Withdrawal, 2. Deposit, 3. BalanceEnquery");
		String choose=sc.next().toLowerCase();
		if(choose.equals("withdrawal")) {
			System.out.println("Choose Option");
			System.out.println("1. Savings, 2. FixedDeposits");
			String type=sc.next().toLowerCase();
			if(type.equals("savings")) {
				System.out.println("Enter Pin Number:");
				int enter=sc.nextInt();
				if(enter==pin) {
					System.out.println("Choose Amount in 500 100.");
					int money=sc.nextInt();
					if(money<=samount) {
						samount-=money;
		                System.out.println("Please Collect Your Cash.");
					}else {
						System.out.println("Insufficinet Funds.");
					}
				}else {
					System.out.println("Incorrect Pin");
				}
					
			}
				
			}else if(choose.equals("fixedDeposit")){
				System.out.println("Enter Pin Number");
				int enter=sc.nextInt();
				if(enter==pin) {
					System.out.println("Choose Amount in 500 100");
					int money=sc.nextInt();
					if(money<=famount) {
						famount-=money;
		                System.out.println("Please Collect Your Cash");
					}else {
						System.out.println("Insufficinet Funds");
					}
				}else {
					System.out.println("Incorrect Pin");
				}
			}else {
				System.out.println("Choose Option:");
				System.out.println("1.Savings, 2. FixedDeposit");
				String baleq=sc.next().toLowerCase();
				if(baleq.equals("savings")) {
					System.out.println("Remaining Balance:");
					System.out.println(samount);
				}else {
					System.out.println("Remaining Balance:");
					System.out.println(famount);
				}
			}
		sc.close();
	}
}


