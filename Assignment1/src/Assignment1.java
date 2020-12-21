import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to our shop!!!");
		System.out.println("\nPlease enter your background detail");
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Age: ");
		int age = scan.nextInt();
		
		System.out.print("Job Occuption: ");
		String job = scan.next();
		
		System.out.println("\n");
		System.out.println("+--------------------------+");
		System.out.println("|                          |");
		System.out.println("|         Welcome          |");
		System.out.println("|                          |");
		System.out.println("+--------------------------+");
		System.out.println("We sell some watches in our shop.");
		System.out.println("1.Rolex oyster perpetual ------------------------------RM 21200 per unit");
		System.out.println("2.Gucci-G-Timeless Web-stripe watch--------------------RM 4070 per unit");
		System.out.println("3.CASIO G-Shock Watch DW-9052GBX-1A4-------------------RM 260 per unit");
		System.out.println("4.CASIO G-SHOCK CAGD-100-1BDR--------------------------RM 470 per unit");
		System.out.println("5.Swatch-BBBLACK---------------------------------------RM 425 per unit");
		System.out.println("6.Swatch-CHECKPOINT BLACK------------------------------RM 590 per unit");
		System.out.println("7.Malaya-01 S------------------------------------------RM 352 per unit");
		System.out.println("8.Malaya-01 RG-----------------------------------------RM 352 per unit");
		System.out.println("9.Seiko-watch fossil the minimalist 3H FS5305----------RM 485 per unit");
		System.out.println("10.Seiko ladies SXDG86P1-------------------------------RM 1854 per unit");
		
		System.out.print("\nEnter the quantity of Rolex oyster perpetual : ");
		int quantity1 = scan.nextInt();
		
		System.out.print("\nEnter the quantity of Gucci-G-Timeless Web-stripe watch : ");
		int quantity2 = scan.nextInt();
		
		System.out.print("\nEnter the quantity of CASIO G-Shock Watch DW-9052GBX-1A4 : ");
		int quantity3 = scan.nextInt();
		
		System.out.print("\nEnter the quantity of CASIO G-SHOCK CAGD-100-1BDR : ");
		int quantity4 = scan.nextInt();
		
		System.out.print("\nEnter the quantity of Swatch-BBBLACK : ");
		int quantity5 = scan.nextInt();
		
		System.out.print("\nEnter the quantity of Swatch-CHECKPOINT BLACK : ");
		int quantity6 = scan.nextInt();
		
		System.out.print("\nEnter the quantity of Malaya-01 S : ");
		int quantity7 = scan.nextInt();
		
		System.out.print("\nEnter the quantity of Malaya-01 RG : ");
		int quantity8 = scan.nextInt();
		
		System.out.print("\nEnter the quantity of Seiko-watch fossil the minimalist 3H FS5305 : ");
		int quantity9 = scan.nextInt();
		
		System.out.print("\nEnter the quantity of Seiko ladies SXDG86P1 : ");
		int quantity10 = scan.nextInt();
		
		double totalprice1 = 21200.00 * quantity1;
		double totalprice2 = 4070.00 * quantity2;
		double totalprice3 = 260.00 * quantity3;
		double totalprice4 = 470.00 * quantity4;
		double totalprice5 = 425.00 * quantity5;
		double totalprice6 = 590.00 * quantity6;
		double totalprice7 = 352.00 * quantity7;
		double totalprice8 = 352.00 * quantity8;
		double totalprice9 = 485.00 * quantity9;
		double totalprice10 = 1854.00 * quantity10;

		double totalNeedToPaid = totalprice1 + totalprice2+ totalprice3+ totalprice4+ totalprice5+ totalprice6+ totalprice7+ totalprice8+ totalprice9+ totalprice10;
			
		System.out.println("The list of product ");
		System.out.println("Rolex oyster perpetual ------------------------------Quantity : "+ quantity1);
		System.out.println("Gucci-G-Timeless Web-stripe watch--------------------Quantity : "+ quantity2);
		System.out.println("CASIO G-Shock Watch DW-9052GBX-1A4-------------------Quantity : "+ quantity3);
		System.out.println("CASIO G-SHOCK CAGD-100-1BDR--------------------------Quantity : "+ quantity4);
		System.out.println("Swatch-BBBLACK---------------------------------------Quantity : "+ quantity5);
		System.out.println("Swatch-CHECKPOINT BLACK------------------------------Quantity : "+ quantity6);
		System.out.println("Malaya-01 S------------------------------------------Quantity : "+ quantity7);
		System.out.println("Malaya-01 RG-----------------------------------------Quantity : "+ quantity8);
		System.out.println("Seiko-watch fossil the minimalist 3H FS5305----------Quantity : "+ quantity9);
		System.out.println("Seiko ladies SXDG86P1--------------------------------Quantity : "+ quantity10);
		
		System.out.println("Total price that need to be paid : RM " + totalNeedToPaid);
		
		scan.close();
		}
		
		
	}


