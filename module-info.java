Scanner nc=new Scanner(System.in);
 int a,b, pgcd=0, max;
 System.out.print("entrer l'entier a : ");
 a = nc.nextInt();
 System.out.print("entrer l'entier b : ");
 b = nc.nextInt();
 for (int i=1; i>0 ; i++) {
 if ((a % i == 0) && (b % i == 0)){
	pgcd = i;
			}
	}
	System.out.print("pgcd : "+pgcd);*