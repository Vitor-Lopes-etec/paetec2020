/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class JavaApplication5 {

    public  static void ex1(){
        double pc,alt,i, sexo;
        Scanner s = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o sexo (1-Masculino e 2-Feminino)");
        sexo = s.nextDouble();
        System.out.println("Digite o peso corporal");
        pc = num.nextDouble();
        System.out.println("Digite a sua altura");
        alt = num.nextDouble();
        System.out.println("Digite a idade em anos");
        i = num.nextDouble();
        if (sexo==1)
        {
            double result = 66.47 + (13.75 * pc) + (5 * alt) - (6.76 * i);
            System.out.println ("O seu gasto energético é de:" +result);
        }
        else
               if(sexo==2)
                {
               double result = 655.1 + (9.56 * pc) + (1.85 * alt) - (4.67 * i);
                System.out.println("O seu gasto energético é de:" + result);
                }    
                    
            
    }   

     public  static void ex2 (){
         int vlr, c,  d, u, j;
        Scanner num = new Scanner(System.in);
         System.out.println("Digite um número de 0 até 999");
         String extenso, cent = null,dez = null,uni = null;
         vlr = num.nextInt();
         c = vlr/100;
         d = vlr % 100/10;
         u = (vlr % 100)%10;
         j = vlr/1;
         if(c==1&&d==0&&u==0){
         System.out.println("cem");}
         else if(c==0&&d==0&&u==0){
         System.out.println("zero");
         }
         else
         {
            if(c>=1&&d==0&&u==0){
             
            switch(c){
            case 1 :System.out.println("Cento ");
            break;
            case 2 : System.out.println("Duzentos ");
            break;
            case 3 : System.out.println("Trezentos ");
            break;
            case 4 : System.out.println("Quatrocentos ");
            break;
            case 5 : System.out.println("Quinhentos ");
            break;
            case 6 : System.out.println("Seiscentos ");
            break;
            case 7 : System.out.println("Setecentos ");
            break;
            case 8 : System.out.println("Oitocentos ");
            break;
            case 9 : System.out.println("Novecentos ");
            break;
        }
      }
            else
   {
	switch(c)
	{
	case 1 : System.out.println("Cento e ");break;
	case 2 : System.out.println("Duzentos e ");break;
	case 3 : System.out.println("Trezentos e ");break;
	case 4 : System.out.println("Quatrocentos e");break;
	case 5 : System.out.println("Quinhentos e ");break;
	case 6 : System.out.println("Seiscentos e ");break;
	case 7 : System.out.println("Setecentos e ");break;
	case 8 : System.out.println("Oitocentos e ");break;
	case 9 : System.out.println("Novecentos e ");break;
	}
   }
   if(d==1)
   {
	switch(u)
	{
	case 0 : System.out.println("Dez ");break;
	case 1 : System.out.println("Onze ");break;
	case 2 : System.out.println("Doze ");break;
	case 3 : System.out.println("Treze ");break;
	case 4 : System.out.println("Quatorze ");break;
	case 5 : System.out.println("Quinze ");break;
	case 6 : System.out.println("Dezesseis ");break;
	case 7 : System.out.println("Dezessete ");break;
	case 8 : System.out.println("Dezoito ");break;
	case 9 : System.out.println("Dezenove ");break;
	}
   }
   else if(d>1)
   {
	switch (d)
	{
	case 2 : System.out.println("Vinte");break;
	case 3 : System.out.println("Trinta");break;
	case 4 : System.out.println("Quarenta");break;
	case 5 : System.out.println("Cinquenta");break;
	case 6 : System.out.println("Sessenta");break;
	case 7 : System.out.println("Setenta");break;
	case 8 : System.out.println("Oitenta");break;
	case 9 : System.out.println("Noventa");break;
	}
	switch (u)
	{
	case 1 : System.out.println(" e Um ");break;
	case 2 : System.out.println(" e Dois ");break;
	case 3 : System.out.println(" e Tres ");break;
	case 4 : System.out.println(" e Quatro ");break;
	case 5 : System.out.println(" e Cinco ");break;
	case 6 : System.out.println(" e Seis ");break;
	case 7 : System.out.println(" e Sete ");break;
	case 8 : System.out.println(" e Oito ");break;
	case 9 : System.out.println(" e Nove ");break;
	}
   }
   else
   {
	switch (u)
	{
	case 1 : System.out.println("Um ");break;
	case 2 : System.out.println("Dois ");break;
	case 3 : System.out.println("Tres ");break;
	case 4 : System.out.println("Quatro ");break;
	case 5 : System.out.println("Cinco ");break;
	case 6 : System.out.println("Seis ");break;
	case 7 : System.out.println("Sete ");break;
	case 8 : System.out.println("Oito ");break;
	case 9 : System.out.println("Nove ");break;
	}
   }
        extenso = ( cent + dez + uni);
        System.out.println(extenso);
     }
   



    
    
    
     }
     
     public static void  ex3 (){
        Scanner scan = new Scanner (System.in);
        int a,b;
        System.out.print("Digite um número qualquer:");
         a = scan.nextInt();
        
        System.out.print("Digite um número que pode ser multiplo de "+a+" : ");
         b = scan.nextInt();
        
        if (a == 0)
        {
            System.out.println("Não existe Múltiplo de zero");
        }
        else{
            
        }
        if ((a==0)&&(b==0))
        {
        System.out.println(a+" e " +b+" São Multiplos");    
        }
        else
        {
            System.out.println(a+ "e" +b+ "Não são Multiplos");
        }
    }
     public static void ex4(){
     Scanner scan = new Scanner(System.in);
         System.out.print("Digite 1 ou 2: ");
         int i = scan.nextInt();
         
         System.out.print("Digite um número real:");
         int a = scan.nextInt();
         
         System.out.print ("Digite um número real:");
         int b = scan.nextInt();
         
         System.out.print ("Digite um número real:");
         int c = scan.nextInt();
         
         if(i==1){
             if(a==b && a==c){
                 System.out.println(a);
        System.out.println(a);
        System.out.println(a);
             }
             
             if (a!=b && a!=c){
                 if(a<b && a<c){
                     if(b==c){
                         System.out.println(a);
                         System.out.print(b);
                         System.out.print(b);
                     }
                     if(b<c){
                         System.out.println(a);
                         System.out.println(b);
                         System.out.println(c);
                     }
                     if(b>c){
                         System.out.println(a);
                         System.out.println(c);
                         System.out.println(b);
                     }
                     if(a>b && a>c){
                         if(b==c){
                             System.out.println(b);
                         System.out.println(b);
                         System.out.println(a);
                         }
                         if(b<c){
                             System.out.println(b);
                         System.out.println(c);
                         System.out.println(a);
                         }
                         if(b>c){
                             System.out.println(c);
                         System.out.println(b);
                         System.out.println(a);
                         }
                     }
                 }
                 if(a>c && a<b){
                     System.out.println(c);
                         System.out.println(a);
                         System.out.println(b);
                 }
                 if(a>b && a<c){
                    System.out.println(b);
                         System.out.println(a);
                         System.out.println(c); 
                 }
             }
             if(i==2){
                 if(a==b && a==c){
                     System.out.println(a);
                         System.out.println(a);
                         System.out.println(a);
                 }
                 if(a!=b && a!=c){
                 if(a<b && a<c){
                     if(b==c){
                       System.out.println(b);
                         System.out.println(b);
                         System.out.println(a);  
                     }
                     if(b<c){
                      System.out.println(c);
                         System.out.println(b);
                         System.out.println(a);      
                     }
                     if(b>c){
                        System.out.println(b);
                         System.out.println(c);
                         System.out.println(a);   
                     }
                 }
                 if(a>b && a>c){
                     if(b==c){
                      System.out.println(a);
                         System.out.println(b);
                         System.out.println(c);      
                     }
                     if(b>c){
                       System.out.println(a);
                         System.out.println(c);
                         System.out.println(b);   
                     }
                     if(b>c){
                      System.out.println(a);
                         System.out.println(b);
                         System.out.println(c);    
                     }
                 }
             }
                 if(a>b && a<c){
                  System.out.println(c);
                         System.out.println(a);
                         System.out.println(b);     
                 }
             }
             else if(i!=1 && i!=2){
                 System.out.println("Apenas aceita os numeros 1 e 2 na Primeira pergunta!!!!!");
             }
         }

     }
     private  static void ex5 (){
     Scanner scani = new Scanner (System.in);
     System.out.print("Digite a,ou as horas extras(Lógico que em minutos):");
     float ext = scani.nextInt();
    
     System.out.print("Digite as horas faltadas(Lógico que em minutos):");
     float faltt = scani.nextInt();
     
     float a = 2;
     float b = 3;
                     float sessenta = 60;
                             float h = ext- (a/b * (faltt));
                                     float nvextt = ext/sessenta;
                                     float nvfaltt = faltt/sessenta;
    
    if(h>2400){
    System.out.println("Voce fez" + (int)nvextt+ "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou restantes ,"
    +(double) h + "Seus pontos e a sua recompensa juntas foram de R$500"); 
              }
    else
     if(h>1800){
         System.out.println("Voce fez," + (int) nvextt + "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou Restantes ,"
         +(double) h+ "Seus pontos e suas recompensas juntas foram de R%400");
     }
    else
    if(h>1200){
        System.out.println("Voce fez," + (int) nvextt + "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou Restantes ,"
         +(double) h+ "Seus pontos e suas recompensas juntas foram de R%300");
    }
    else
    if(h>=600){
     System.out.println("Voce fez," + (int) nvextt + "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou Restantes ,"
         +(double) h+ "Seus pontos e suas recompensas juntas foram de R%200");
    }
    else
    {
       System.out.println("Voce fez," + (int) nvextt + "Suas Horas Extras, " + (int) nvfaltt + "Horas Faltadas ou Restantes ,"
         +(double) h+ "Seus pontos e suas recompensas juntas foram de R%100");
    }
     }  
    
    public  static void  ex6 (){
        Scanner scani = new Scanner (System.in);
        
        System.out.print("Digite o seu horário de entrada (entre 0 a 24h):");
        int entrada = scani.nextInt();
        int saida = entrada+6;
        int sd_especial = saida - 24;
        
        if(entrada>18){
            System.out.println("A sua saida é exatamente as" + sd_especial +"h");
        }
        else if(entrada>12){
            System.out.println("A sua saida é exatamente as" + sd_especial +"h");
        }
        else{
            System.out.println("A sua saida é exatamente as" + sd_especial +"h");
        }
    } 
    
    
    
    
     
    public  static void ex7() {
        Scanner scann = new Scanner(System.in);
        
        float i=0;
        float fat = 1;
        float a = 1;
        
        while (a>=0){
            System.out.print ("Digite um número qualquer");
            a = scann.nextInt();
            fat+=a;
            i++;
        }
        System.out.println( fat/(i-1));
    }
    
    public static void ex8 (){
        Scanner escolha = new Scanner(System.in);
        
        System.out.println("Escolha o programa");
        double e = escolha.nextDouble();
        
        JavaApplication5 m = new JavaApplication5();
        if(e==0){
        }
        else{
            if(e==1){
                JavaApplication5.ex1();
            }
            else{
                if(e==2){
                   JavaApplication5.ex2();
                }
                else{
                    if(e==3){
                        JavaApplication5.ex3();
                    }
                    else{
                        if(e==4){
                            JavaApplication5.ex4();
                        }
                        else{
                            if(e==5){
                                JavaApplication5.ex5();
                            }
                            else{
                                if (e==6){
                                    JavaApplication5.ex6();
                                }
                                else{
                                    if (e==7){
                                        JavaApplication5.ex7();
                                    }
                                    else{
                                        if (e==8){
                                            JavaApplication5.ex8();
                                        }
                                        else{
                                            if(e==9){
                                                JavaApplication5.ex9();
                                            }
                                            else{
                                                if(e==10){
                                                    JavaApplication5.ex10();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    
    public static void ex9 (){
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um valor inteiro que seja positivio");
        int n = num.nextInt();
        int i ;
        int soma;
        soma = 0;
        i = 1;
        
        while (i <= n){
            soma = soma + i;
            i = i + 1;
        }
        System.out.println("O resultado da soma é:" + soma);
    }
    
    
    public static void ex10(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int som = 0;
        int i = 1;
        while(i <= n){
            if (n>=7){
                float a = 1%2;
                float b = 1%3;
                float c = 1%4;
                float d = 1%5;
                float e = 1%6;
                float f = 1%7;
                float g = 1%8;
                float h = 1%9;
                
                if(a != 0 && b != 0 && c != 0 && d != 0 && e != 0 && f != 0 && g != 0 && h != 0){
                    som += i;
                }
            }
            i++;
        }
        if(n>=7){
            System.out.println(som+2+3+5+7);
        }
        else if(n<7){
            switch(n){
                case 1 : System.out.println("1"); ;break;
                case 2 : System.out.println("3"); ;break;
                case 3 : System.out.println("6"); ;break;
                case 4 : System.out.println("6"); ;break;
                case 5 : System.out.println("11"); ;break;
                case 6 : System.out.println("11"); ;break;
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
