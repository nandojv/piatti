package corsoiniziodacapo;


import java.util.Scanner;

public class piattiscelta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int scegliItem=0;	

	String pasta="spaghetti";
    String pasta1="penne";
    String pasta2="farfalle";


String item1="vongole";
String item2="cozze";
String item3="pomodorini";
String item4="panna e salmone";

do {
	Scanner sc = new Scanner(System.in); 
	

	System.out.print("scegli il condimento:1  vongole,2  cozze,3  pomodorini,4  panna e salmone,o per terminare programma "); 

	 scegliItem = sc.nextInt(); 
	 
	 Scanner sc1 = new Scanner(System.in); 
		

		System.out.print("scegli la pasta:1 spaghetti ,2 per penne, 3 per farfalle"); 

		 int sceglipasta = sc.nextInt();

		 
		 if(sceglipasta==1){
		 
		 
		 
if (scegliItem==1) {
	System.out.println(pasta  + "  "  + item1) ; 
	
}
else if (scegliItem==2) {
	System.out.println(pasta    + "   " +   item2);
	
}

else if(scegliItem==3) {
	System.out.println(pasta + "   "  + item3);
}
	else if(scegliItem==4) {
		System.out.println(pasta +"   "+ item4);

}}

		 else if(sceglipasta==2){
	 
	 
	 
if (scegliItem==1) {
	System.out.println(pasta1 + "  "  + item1) ; 
	
}
else if (scegliItem==2) {
	System.out.println(pasta1    + "   " +   item2);
	
}

else if(scegliItem==3) {
	System.out.println(pasta1 + "   "  + item3);
}
	else if(scegliItem==4) {
		System.out.println(pasta1+"  "+ item4);
		{
	}
}}

		 else if(sceglipasta==3) 
		 
if (scegliItem==1) {
	System.out.println(pasta2 + "  "  + item1) ; 
	
}
else if (scegliItem==2) {
	System.out.println(pasta2    + "   " +   item2);
	
}

else if(scegliItem==3) {
	System.out.println(pasta2 + "   "  + item3);
}
	else if(scegliItem==4) {
		System.out.println(pasta2+"  "+ item4);
	}
	

}
while(scegliItem !=0);

	}}

	



