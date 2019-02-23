
public class Escalas {
	String[] notas = {"DO", "DO#", "RE", "RE#", "MI", "FA", "FA#", "SOL", "SOL#", "LA", "LA#", "SI",
			"DO", "DO#", "RE", "RE#", "MI", "FA", "FA#", "SOL", "SOL#", "LA", "LA#", "SI",};

    String[] nombresMayor = {"I Tónica", "II Supertonica", "III Mediante", "IV Subdominante", "V Dominante", "VI Superdominante", "VII SensIble"};
    String[] nombresMenor = {"I Tónica", "II Supertonica", "III Mediante", "IV Subdominante", "V Dominante", "VI Superdominante", "VII  subtónica"};

    public String buscar(String a, String b) {
    	String nota1 = "";
    	String nota2 = "";
    	String resultado = "coincidencias: ";
    	
    	for(int i = 0 ; i < 12; i++) {
    		if((a.indexOf(notas[i]) != -1) && (b.indexOf(notas[i])) != -1){ //si la misma nota esta en las 2 cadenas
    			
    			if(this.notas[i].length() == 4) {
    			nota1 = "" + a.charAt(a.indexOf(this.notas[i])) + a.charAt(a.indexOf(this.notas[i]) + 1) + a.charAt(a.indexOf(this.notas[i]) + 2) + a.charAt(a.indexOf(this.notas[i]) + 3) + " ";
    			nota2 = "" + a.charAt(b.indexOf(this.notas[i])) + b.charAt(a.indexOf(this.notas[i]) + 1) + b.charAt(a.indexOf(this.notas[i]) + 2) + b.charAt(a.indexOf(this.notas[i]) + 3) + " ";
    			}
    			
    			if(this.notas[i].length() <= 3) {
        			nota1 = "" + a.charAt(a.indexOf(this.notas[i])) + a.charAt(a.indexOf(this.notas[i]) + 1) + a.charAt(a.indexOf(this.notas[i]) + 2) ;
        			nota2 = "" + a.charAt(b.indexOf(this.notas[i])) + b.charAt(a.indexOf(this.notas[i]) + 1) + b.charAt(a.indexOf(this.notas[i]) + 2) ;
        		}
    			
    			
    			
    			if((nota1.equals("sib")) || (nota1.equals("dom"))){
    				nota1 = this.buscar(a, a.indexOf(i),i);
    			}
    			
    			if((nota2.equals("sib")) || (nota2.equals("dom"))){
    				nota2 = this.buscar(b, b.indexOf(i),i);
    			}
    			
    			
    			
    			if (nota1.equals(nota2)) {
    				
    				resultado = resultado + " " + nota1;
    				
    			}
    		}
    	}
    	
    	if (resultado.isEmpty()) return "no hay notas iguales entre estas escalas";
    	return resultado;
    }
    
    public String buscar(String a, int ix1,int i) 
    {
    	String nota1 = "";
    	
    	String resultado = "";
    	
    	
    		if(a.indexOf(notas[i],ix1) != -1)
    		{ 
    			nota1 = " " + a.charAt(a.indexOf(notas[i])) + a.charAt(a.indexOf(notas[i]) + 1) + a.charAt(a.indexOf(notas[i]) + 2);
    			resultado = resultado + " " + nota1;
    		}
    	
    	return resultado;
    }
    
    
    public int encontrar(String nota) {
        nota.toLowerCase();
        boolean seguir = true;
        int i = 0;
        while (seguir) {
            if (this.notas[i].equals(nota)) return i;

            if (i == 11) throw new RuntimeException("no se encuentra la nota deseada, corrobore que este bien escrita");

            i++;

        }

        return -1;
    }
 
    public String mayor( String tono) {
        int nota = encontrar(tono);


        int[] escala = {2, 2, 1, 2, 2,2, 1};
        int j = 0;
        int n = 0;
        
        String a = "";
        
       String formato = "%s: %-3s \n"; //formato que siguen los String
       for (int i = nota; j < escala.length; ) {
             a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
            i += escala[j];
            j++;
            n++;

        }
        return a;
    }
    
    public String menor( String tono) {
        int nota = encontrar(tono);


        int[] escala = {2,1,2,2,1,2,2};
        int j = 0;
        int n = 0;
        
        String a = "";
        
       String formato = "%s: %-3s \n"; //formato que siguen los String
       for (int i = nota; j < escala.length; ) {
             a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
            i += escala[j];
            j++;
            n++;

        }
        return a;
    }

    public String frigio( String tono) {
      int nota = encontrar(tono);


      int[] escala = { 1,2,2,2,1,2,2};
      int j = 0;
      int n = 0;
      
      String a = "";
      
     String formato = "%s: %-3s \n"; //formato que siguen los String
     for (int i = nota; j < escala.length; ) {
           a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
          i += escala[j];
          j++;
          n++;

      }
      return a;
  }

    public String lidio( String tono) {
        int nota = encontrar(tono);


        int[] escala = { 2,2,2,1,2,2,1};
        int j = 0;
        int n = 0;
        
        String a = "";
        
       String formato = "%s: %-3s \n"; //formato que siguen los String
       for (int i = nota; j < escala.length; ) {
             a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
            i += escala[j];
            j++;
            n++;

        }
        return a;
    }
    
    public String dorico( String tono) {
        int nota = encontrar(tono);


        int[] escala = {2,1,2,2,2,1,2};
        int j = 0;
        int n = 0;
        
        String a = "";
        
       String formato = "%s: %-3s \n"; //formato que siguen los String
       for (int i = nota; j < escala.length; ) {
             a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
            i += escala[j];
            j++;
            n++;

        }
        return a;
    }

    public String mixolidio( String tono) {
        int nota = encontrar(tono);


        int[] escala = { 1,2,2,2,1,2,2};
        int j = 0;
        int n = 0;
        
        String a = "";
        
       String formato = "%s: %-3s \n"; //formato que siguen los String
       for (int i = nota; j < escala.length; ) {
             a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
            i += escala[j];
            j++;
            n++;

        }
        return a;
    }
    
    public String locrio( String tono) {
        int nota = encontrar(tono);


        int[] escala = { 1,2,2,1,2,2,2};
        int j = 0;
        int n = 0;
        
        String a = "";
        
       String formato = "%s: %-3s \n"; //formato que siguen los String
       for (int i = nota; j < escala.length; ) {
             a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
            i += escala[j];
            j++;
            n++;

        }
        return a;
    }

    public String penMayor( String tono) {
        int nota = encontrar(tono);


        int[] escala = { 2,2,3,2,3};
        int j = 0;
        int n = 0;
        
        String a = "";
        
       String formato = "%s: %-3s \n"; //formato que siguen los String
       for (int i = nota; j < escala.length; ) {
             a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
            i += escala[j];
            j++;
            n++;

        }
        return a;
    }

    public String penMayorVar( String tono) {
        int nota = encontrar(tono);


        int[] escala = { 2,3,2,2,3};
        int j = 0;
        int n = 0;
        
        String a = "";
        
       String formato = "%s: %-3s \n"; //formato que siguen los String
       for (int i = nota; j < escala.length; ) {
             a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
            i += escala[j];
            j++;
            n++;

        }
        return a;
    }

    public String penMenor( String tono) {
        int nota = encontrar(tono);


        int[] escala = { 3,2,2,3,2};
        int j = 0;
        int n = 0;
        
        String a = "";
        
       String formato = "%s: %-3s \n"; //formato que siguen los String
       for (int i = nota; j < escala.length; ) {
             a = a + String.format(formato, this.nombresMayor[n], this.notas[i]); //aca uso el formato y despues los atributos 
            i += escala[j];
            j++;
            n++;

        }
        return a;
    }
}
