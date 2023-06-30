package pecera;

import java.util.ArrayList;
import java.util.List;

public class Acuari {

    public static void main(String[] args) {

        List<Organisme> Organismes = crearOrganismes();
        
//ES REALIZA L'EXTRACCIO DE METODES PER FER EL CODI UNA MICA MES FACIL D'ENTENDRE 
        
        //ACTIVITAT_1  
        phOrganismes(Organismes);
        temperaturesOrganisme(Organismes);
   		tipusdedietapeixos(Organismes);
		tipusdellumOrganisme(Organismes);
        tipus_de_plantes(Organismes);

        //ACTIVITAT_2
        mostrarOrganismes(Organismes);
        numeroOmnivors(Organismes);
        extrauTempiPHOrganismes(Organismes);
   }

	
//EXERCICIS DINS ACTIVITAT 1.
//*****************************************************************************************************************************
    
		    //1. Per a cada organisme, retornar una cadena amb els marges 
		    //d'acidesa de l'aigua acceptables. Per exemple: 6-7
		    public static void phOrganismes(List<Organisme> organismes) {
		        System.out.println("ACTIVITAT 1 PUNT 1" + "\n" + "Marges del PH per Organisme");
		        System.out.println("***************************"); 
		        for (Organisme organisme : organismes) {
		            String acidesaAigua = organisme.getPHMin() + "-" + organisme.getPHMax();
		            String tipusOrganisme = "";
		            if (organisme instanceof Peixos) {
		                tipusOrganisme = "Peixos";
		            } else if (organisme instanceof Planta) {
		                tipusOrganisme = "Planta";
		            }
		            System.out.println(tipusOrganisme + ": " + organisme.getNomOrganisme() + ": " + acidesaAigua);
		        }
		        System.out.println("\n");
		    }
		    //*****************************************************************************************************************************  
		    //2. Per a cada organisme, retornar una cadena amb els marges 
		    //de temperatura acceptables. Per exemple: 10-20
		    public static void temperaturesOrganisme(List<Organisme> organismes) {
		    	System.out.println("ACTIVITAT 1 PUNT 2" + "\n" + "Marges de Temperatura per Organisme");
		        System.out.println("***********************************"); 
				for (Organisme organisme : organismes) {
		            String temperaturaAigua = organisme.getTempMin() + "-" + organisme.getTempMax();
		            String tipusOrganisme = "";
		            if (organisme instanceof Peixos) {
		            	tipusOrganisme = "Peixos";
		            } else if (organisme instanceof Planta) {
		            	tipusOrganisme ="Planta";
		            }
		            System.out.println(tipusOrganisme + ": " +organisme.getNomOrganisme() + ": " + temperaturaAigua);
		        }
				System.out.println("\n");
			}
    		//*****************************************************************************************************************************
			//3. Per a cada peix, traduir el codi del tipus de dieta a l'explicació 
		    // pertinent. Si és 'A', "Algues", etc
		    public static void tipusdedietapeixos(List<Organisme> Organismes) {
					System.out.println("ACTIVITAT 1 PUNT 3" + "\n" + "Tipus de Dieta segons peix");
			        System.out.println("**************************"); 
			        for (Organisme organisme : Organismes) {
			        	if (organisme instanceof Peixos) {
			        	Peixos peix = (Peixos) organisme;
		                System.out.println(peix.getNomOrganisme() + ": " + peix.getTipusMenjar());
		            }
			}
			System.out.println("\n");
		    }
			
			//*****************************************************************************************************************************
    		//4. Per a cada organisme, traduir el codi de tipus de necessitats de llum 
		    //a l'explicació pertinent. Si és 'A', "Necessitats altes de llum", etc
			public static void tipusdellumOrganisme(List<Organisme> Organismes) {
				System.out.println("ACTIVITAT 1 PUNT 4" + "\n" + "Necesitat de LLum de l'Organisme");
		        System.out.println("********************************");
				for (Organisme organisme : Organismes) {
					     
		            String tipusOrganisme = "";
		            if (organisme instanceof Peixos) {
		                tipusOrganisme = "Peixos";
		            } else if (organisme instanceof Planta) {
		                tipusOrganisme = "Planta";
		            }
		            System.out.println(tipusOrganisme + " - " +organisme.getNomOrganisme() + ": " + organisme.getTipusLlum());
		        }
				System.out.println("\n");
			}
			//*****************************************************************************************************************************
			//5. Per a cada planta, traduir el codi de tipus de planta a 
		    // l'explicació pertinent. Si és 'T', "Tija", etc.
			public static void tipus_de_plantes(List<Organisme> Organismes) {
				System.out.println("ACTIVITAT 1 PUNT 5" + "\n" + "Tipus de planta");
		        System.out.println("***************");
				for (Organisme organisme : Organismes) {
		            if (organisme instanceof Planta) {
		                Planta planta = (Planta) organisme;
		                                
		                System.out.println(planta.getNomOrganisme() + ": " + planta.getTipusplanta());
		            }
		         }   
				System.out.println("\n");
			}
			
//EXERCICIS DINS ACTIVITAT 2.
//*****************************************************************************************************************************		
			//1. Crear 3 objectes de tipus Peix i 3 de tipus Planta i afegir-los a 
			//un ArrayList d'organismes.
			public static List<Organisme> crearOrganismes() {
				List<Organisme> Organismes = new ArrayList<>();

		        // Crear 3 instancias de Peixos
		        Organismes.add(new Peixos("Guppy", "Poecilia Reticulata", Llum.A, 25, 18, 5, 8, "NorteMundial", Dieta.O, 7));
		        Organismes.add(new Peixos("Neon tetra", "Paracheirodon innesi", Llum.M, 26, 22, 6.5, 7.5, "Tropical", Dieta.O, 5));
		        Organismes.add(new Peixos("Pez Angel","Pterophyllum scalare",Llum.B, 27, 21, 6, 7.5, "Asia", Dieta.F, 6));
		     // Organismes.add(new Peixos(null, null, null, 0, 0, 0, 0, null, null, 0));
		        
		        // Crear 3 instancias de Planta
		        Organismes.add(new Planta("Anubias", "Anubias barteri", Llum.A, 26, 20, 7.0, 8.5, TipusDePlanta.T));
		        Organismes.add(new Planta("Vallisneria", "Vallisneria spiralis", Llum.M, 28, 18, 6.5, 7.5, TipusDePlanta.B));
		        Organismes.add(new Planta("Cabomba", "Cabomba caroliniana", Llum.B, 24, 22, 6.0, 7.5, TipusDePlanta.T));
		      //Organismes.add(new Planta(null, null, null, 0, 0, 0, 0, null));
				return Organismes;
			}
			//*****************************************************************************************************************************
			/*2. Recórrer l'ArrayList i per a cada element mostrar per pantalla les dades de
			l'organisme i escriure també per pantalla les dades específiques d'aquell
			organisme (si és peix la procedència, la longitud i la dieta; si és planta el
			tipus).*/
			public static void mostrarOrganismes(List<Organisme> Organismes) {
			    System.out.println("ACTIVITAT 2 PUNT 1 y 2" + "\n" + "Llistat d'Organismes dins l'acuari");
			    System.out.println("**********************************");
			    int contadorPeixos = 0;
			    int contadorPlanta = 0;
			    int contadorTotal = 0;

			    for (Organisme organisme : Organismes) {
			        System.out.println("Organisme #" + (contadorTotal + 1) + " - Tipo: " + organisme.getClass().getSimpleName());
			        System.out.println(organisme.toString());
			        System.out.println("_____________________________________________________________________________");

			        if (organisme instanceof Peixos) {
			            contadorPeixos++;
			        } else if (organisme instanceof Planta) {
			            contadorPlanta++;
			        }

			        contadorTotal++;
			    }

			    System.out.println("\n");
			    System.out.println("Quantitat de peixos: " + contadorPeixos);
			    System.out.println("Quantitat de plantes: " + contadorPlanta);
			    System.out.println("Total d'Organismes: " + contadorTotal);
			    System.out.println("\n");
			}
			//*****************************************************************************************************************************
			//3. Mostrar el número de peixos omnívors que hi ha a l'aquari
			public static void numeroOmnivors(List<Organisme> Organismes) {
				int countOmnivors=0;
		        for (Organisme organisme : Organismes) {
		            if (organisme instanceof Peixos) {
		                Peixos peix = (Peixos) organisme;
		                if (peix.getTipusMenjar().equals("Omnivor"))
		                		countOmnivors++;
		                }
		            }
		        System.out.println("ACTIVITAT 2 PUNT 3" + "\n" + "Num peixos Omnivors a l'aquari: " + countOmnivors);
		        System.out.println("**********************************");
		        System.out.println("\n");
		        
			}
			
			
			//*****************************************************************************************************************************
			//4. Mostrar per pantalla les màxims i mínims de temperatura i PH que pot
			//suportar el nostre aquari.
			public static void extrauTempiPHOrganismes(List<Organisme> Organismes) {
				double maxTemp = Double.MIN_VALUE;
		        double minTemp = Double.MAX_VALUE;
		        double maxPH = Double.MIN_VALUE;
		        double minPH = Double.MAX_VALUE;

		        for (Organisme organisme : Organismes) {
		            if (organisme.getTempMax() > maxTemp) {
		                maxTemp = organisme.getTempMax();
		            }
		            if (organisme.getTempMin() < minTemp) {
		                minTemp = organisme.getTempMin();
		            }
		            if (organisme.getPHMax() > maxPH) {
		                maxPH = organisme.getPHMax();
		            }
		            if (organisme.getPHMin() < minPH) {
		                minPH = organisme.getPHMin();
		            }
		        }
		        System.out.println("ACTIVITAT 2 PUNT 4" + "\n" + "Maxims i minims de temperatura i pH a l'aquari:");
		        System.out.println("***********************************************");
		        System.out.println("La temperatura pot estar entre: " + maxTemp + " i " + minTemp);
		        System.out.println("El PH pot ser entre: " + maxPH+ " i " + minPH);
		      
			}
			//*****************************************************************************************************************************
			//5. A part dels indicats, crea els constructors i mètodes que necessitis per a fer
			//les tasques indicades.
			//*****************************************************************************************************************************
			//6. En els constructors i setters (si es defineixen) controlar els valors correctes
			//dels atributs amb excepcions.
			
			
}
