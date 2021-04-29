import java.util.*;

public class Practica7{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Platillo plato = new Platillo();
		int op, op2;
		
		for(int i = 0; i < 3; i++){
			System.out.println("Cocina robotica");
			System.out.println("1)Robot Chef      (Prep. 2  Cocinar 2  Servir 2)");
			System.out.println("2)Sous Chef \"Cut\" (Prep. 3  Cocinar 1  Servir 1)");
			System.out.println("3)Sous Chef \"Hot\" (Prep. 1  Cocinar 3  Servir 1)");
			op = in.nextInt();
			
			System.out.println("1)Preparar Ingredientes");
			System.out.println("2)Cocinar");
			System.out.println("3)Servir plato");
			op2 = in.nextInt();
			
			switch(op){
				case 1:
					switch(op2){
						case 1:
							Chef.prepararIngredientes(plato);
						break;
						case 2:
							Chef.cocinarPlatillo(plato);
						break;
						case 3:
							Chef.presentarPlatillo(plato);
						break;
					}
				break;
				case 2:
					switch(op2){
						case 1:
							SousChefCut.prepararIngredientes(plato);
						break;
						case 2:
							SousChefCut.cocinarPlatillo(plato);
						break;
						case 3:
							SousChefCut.presentarPlatillo(plato);
						break;
					}
				break;
				case 3:
					switch(op2){
						case 1:
							SousChefHot.prepararIngredientes(plato);
						break;
						case 2:
							SousChefHot.cocinarPlatillo(plato);
						break;
						case 3:
							SousChefHot.presentarPlatillo(plato);
						break;
					}
				break;
			}
			
		}
		
		
		switch(plato.prep){
			case 1:
				System.out.println("\n\nMala preparacion");
			break;
			case 2:
				System.out.println("\n\nBuena preparacion");
			break;
			case 3:
				System.out.println("\n\nExcelente preparacion");
			break;
			default:
				System.out.println("\n\nSin preparacion");
		}
		
		if(plato.prep != 0){
			switch(plato.coci){
				case 1:
					System.out.println("Frio");
				break;
				case 2:
					System.out.println("Buena temperatura");
				break;
				case 3:
					System.out.println("Excelente temperatura");
				break;
				default:
					System.out.println("Sin cocinarse");
			}
		}
		else{
			System.out.println("Sin cocinarse");
		}
		
		if(plato.prep != 0 && plato.coci != 0){
			switch(plato.serv){
				case 1:
					System.out.println("Mala presentacion");
				break;
				case 2:
					System.out.println("Buena presentacion");
				break;
				case 3:
					System.out.println("Excelente presentacion");
				break;
				default:
					System.out.println("Sin presentacion");
			}
		}
		else{
			System.out.println("Sin presentacion");
		}
	}
}

class Platillo{
	int prep = 0, coci = 0, serv = 0;
}

abstract class Robot{
	static void prepararIngredientes(Platillo plato){
		
	}
	
	static void cocinarPlatillo(Platillo plato){
		
	}
	
	static void presentarPlatillo(Platillo plato){
		
	}
}

class Chef extends Robot{
	static void prepararIngredientes(Platillo plato){
		plato.prep = 2;
	}
	
	static void cocinarPlatillo(Platillo plato){
		plato.coci = 2;
	}
	
	static void presentarPlatillo(Platillo plato){
		plato.serv = 2;
	}
}

class SousChefCut extends Robot{
	static void prepararIngredientes(Platillo plato){
		plato.prep = 3;
	}
	
	static void cocinarPlatillo(Platillo plato){
		plato.coci = 1;
	}
	
	static void presentarPlatillo(Platillo plato){
		plato.serv = 1;
	}
}

class SousChefHot extends Robot{
	static void prepararIngredientes(Platillo plato){
		plato.prep = 1;
	}
	
	static void cocinarPlatillo(Platillo plato){
		plato.coci = 3;
	}
	
	static void presentarPlatillo(Platillo plato){
		plato.serv = 1;
	}
}