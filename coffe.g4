grammar coffe;

@header {
    import java.util.*;
}

@members {
	Variavel novaVariavel = new Variavel();
	ControleVariavel cv = new ControleVariavel();
	String codigoJava = "";
	int escopo;
	int tipo;
	String nome;
   Scanner leia = new Scanner(System.in);
   boolean resultado;

   int valor1;
   int valor2;

   int var1;
   int var2;
}

prog:  { escopo = 0;
		  codigoJava += "public class Codigo{\n\t";
		}
		'inicio' { codigoJava += "public static void main(String args[]){\n\t\t"; 
				 }
		declaracao
		bloco
	    'fim' {codigoJava += "\t}\n}";
			   System.out.println(codigoJava);
			  }
   ;

declaracao:    (
                  {
                     codigoJava += "public ";
                  }
                  tipo 
                  ID { novaVariavel = new Variavel($ID.text, tipo, escopo);
                              boolean declarado = cv.adiciona(novaVariavel);
                        if(!declarado){
                           System.err.println("Variavel "+$ID.text+" ja foi declarada!!!");
                           System.exit(0);
                        }
                        codigoJava += $ID.text;
                     }
                  
                  PV {codigoJava += ";\n\t\t";}
               )*
    ;

tipo:   (
            'nat'{ tipo = 1; 
                        codigoJava += "int ";
                     }|
            'texto'{
                        tipo = 2;
                        codigoJava += "String ";
                     }|
            'decimal'{
                        tipo = 3;
                        codigoJava += "float ";
                     }|
			   'boleano' {
                        tipo = 4;
                        codigoJava += "boolean ";
                     }
        )
   ;

bloco:    (comando)+
   ;

comando: ler |
		   escrever |
		   condicional |
		   repetfor |
		   repetwhile |
		   atribuicao |
         incremento |
         expressao 


   ;
//scanner
ler: 'leia' {
               codigoJava += "Scanner leia = new Scanner(System.in);\n\t\t";
            }
      ABREP 
      ID 
      FP 
      PV{   String nome = $ID.text;
               Variavel tmp = cv.busca(nome);
               if(tmp == null){
                  System.err.println("essa variavel nao foi declarada");
               }
               else{
                  switch(tmp.getTipo()){
                     case 1:
                        codigoJava += $ID.text+" = ";
                        codigoJava += "leia.nextInt()";
                        codigoJava += ";\n\t\t";
                        break;
                    case 2:
                        codigoJava += $ID.text+" = ";
                        codigoJava += "leia.nextLine()";
                        codigoJava += ";\n\t\t";
                        break;
                   case 3:
                        codigoJava += $ID.text+" = ";
                        codigoJava += "leia.nextFloat()";
                        codigoJava += ";\n\t\t";
                        break;
                  }
               }
      }
   ;

//print
escrever:  'escreva' // 'print' ABREP (ID | STRING) FP PV
                     {
                        codigoJava += "System.out.println";
                     }
            ABREP {
                     codigoJava += "(";
                  }
            (
               ID {
                     boolean resultado = cv.jaExiste($ID.text);
                     if(!resultado){
                        System.err.println("A variavel "+$ID.text+" nao foi declarada");
                        System.exit(0);
                     }
                     else{
                        codigoJava += $ID.text;
                     }
                  }|
               
                | STRING{
                     codigoJava += ""+$STRING.text+"";
                }
                ) 
                FP {
                  codigoJava += ")";
                }
                PV{
                  codigoJava += ";\n\t\t";
                }
   ;

condicional:   'se' {
                        codigoJava += "if";
                     }
                ABREP{
                  codigoJava += "(";
                }
                compare
                 FP{
                  codigoJava += ")";
                 }
                AC{
                  codigoJava += $AC.text+"\n\t\t\t"; 
                }
                 bloco 
                 FC{
                  codigoJava += $FC.text;
                 }
                 
                  (
                     'senao' {
                        codigoJava += "else";
                     }
                      AC{
                        codigoJava += $AC.text+"\n\t\t\t";
                      }
                       bloco
                        FC{
                           codigoJava += $FC.text+"\n\t\t";
                        }
                         )?
   ;

compare:   ( //(ID | INT) OPREL (ID | INT)
               ID{
                  nome = $ID.text;
                  boolean resultado = cv.jaExiste(nome);
                  tipo = cv.getTipo(nome);
                  if(!resultado){
                     System.err.println("A variavel "+$ID.text+" nao foi declarada");
                     System.exit(0);
                  }
                  else{      
                     if(tipo == 1){
                        codigoJava += $ID.text;
                        valor1 = 1;
                     }
                     else if(tipo == 2){
                        codigoJava += $ID.text;
                        valor1 = 2;
                     }
                     else if(tipo == 3){
                        codigoJava += $ID.text;
                        valor1 = 3;
                     }
                  }
                  
               }|
                INT{
                  codigoJava += $INT.text;
                } | 
                DEC{
                  codigoJava += $DEC.text;
                }
                ) OPREL{
                  codigoJava += $OPREL.text;
                }
                 (ID{
                     nome = $ID.text;
                     boolean resultado = cv.jaExiste(nome);
                     tipo = cv.getTipo(nome);
                     if(!resultado){
                        System.err.println("A variavel "+$ID.text+" nao foi declarada");
                        System.exit(0);
                     }
                     else{
                        tipo = novaVariavel.getTipo();
                        if(tipo == 1){
                           codigoJava += $ID.text;
                           valor2 = 1;
                        }
                        else if(tipo == 2){
                           codigoJava += $ID.text;
                           valor2 = 2;
                        }
                        else if(tipo == 3){
                           codigoJava += $ID.text;
                           valor2 = 3;
                        }
                     }
                  
                 } | 
                 INT{
                  codigoJava += $INT.text;
                 } | 
                 DEC{
                  codigoJava += $DEC.text;
                 }{
                     if(valor1 != valor2){
                        System.err.println("As variaveis nao sao do mesmo tipo");
                        System.exit(0);
                     }
                 }
                 )
   ;

repetfor:  'para'   // 'para' ABREP atribuicao PV compare PV incremento FP AC bloco FC
                  {        
                     codigoJava += "for ";
                  }
            ABREP {
                     codigoJava += "(";
                  }

            declfor{}

            PV{codigoJava += ";";}

            compare

            PV{codigoJava += ";";}

            increfor

            FP{codigoJava += ")";}

            AC{codigoJava += $AC.text+"\n";}

            bloco

            FC{codigoJava += $FC.text+"\n";}

   ;

repetwhile:  'enquanto' // 'enquanto' ABREP compare FP AC bloco FC
                        {
                           codigoJava += "while ";
                        }
            ABREP {
                     codigoJava += "(";
                  }

            compare

            FP {
                  codigoJava += ")";
               }
                   
            AC {
                  codigoJava += $AC.text+"\n\t\t\t";

               }

            bloco{
                  codigoJava += "\t\t\t";
            }

            FC {
                  codigoJava += $FC.text+"\n\t\t";
                     
               }
   ;

atribuicao:  ID //ID Op_atrib (ID | INT | DEC | STRING) PV
               {
                  nome = $ID.text;
                  boolean resultado;
                  resultado = cv.jaExiste(nome);
                  tipo = cv.getTipo(nome);

                  if(!resultado){
                     System.out.println(tipo);
                     System.err.println("A variavel "+$ID.text+" nao foi declarada test1");
                     System.exit(0);
                  } else {
                     var1 = tipo;
                     codigoJava += $ID.text;
                  }
               }
             Op_atrib {
                        codigoJava += $Op_atrib.text;
                     }  
            (
               ID {  
                     nome = $ID.text;
                     resultado = cv.jaExiste(nome);
                     tipo = cv.getTipo(nome);
                     if(!resultado){
                        System.err.println("A variavel "+$ID.text+" nao foi declarada test2");
                        System.exit(0);
                     } else {
                        var2 = tipo;
                        if(var1 != var2){
                           System.err.println("A variavel "+$ID.text+" nao é do mesmo tipo test3");
                           System.exit(0);
                        }
                        codigoJava += $ID.text;
                     }
               } | 
               INT {  
                        if(var1 != 1){
                           System.err.println("A variavel "+$ID.text+" nao é do mesmo tipo test4");
                           System.exit(0);
                        }else{
                           codigoJava += $INT.text;
                        }

                  } | 
               DEC {  
                        if(var1 != 3){
                           System.err.println("A variavel "+$ID.text+" nao é do mesmo tipo test5");
                           System.exit(0);
                        }else{
                           codigoJava += $DEC.text;
                        }
                  } |
               STRING {  
                        if(var1 != 2){
                           System.err.println("A variavel "+$ID.text+" nao é do mesmo tipo test6");
                           System.exit(0);
                        }else{
                           codigoJava += $STRING.text;
                        }
                  } 
               )* 
               PV {
                  {codigoJava += ";\n\t\t";}
               }
   ;

declfor:
            'nat'
            ID{
               novaVariavel = new Variavel($ID.text, 1, escopo);
               boolean declarado = cv.adiciona(novaVariavel);
               if(!declarado){
                  System.err.println("Variavel "+$ID.text+" ja foi declarada!!!");
                  System.exit(0);
               }
               codigoJava += "int "+$ID.text;
            }
            Op_atrib{
               codigoJava += $Op_atrib.text;
            }
            INT{
               codigoJava += $INT.text;
            }
;

incremento:
            ID {
                  String nome = $ID.text;
                  boolean resultado;
                  resultado = cv.jaExiste(nome);

                  if(!resultado){
                     System.err.println("A variavel "+$ID.text+" nao foi declarada");
                     System.exit(0);
                  } else {
                     var1 = novaVariavel.getTipo();
                     codigoJava += $ID.text;
                  }
               }
            INCREMENTAL {
                           codigoJava += $INCREMENTAL.text;
                        }

            PV{
               codigoJava += ";\n";
            }

;

increfor:
          ID {
                  String nome = $ID.text;
                  boolean resultado;
                  resultado = cv.jaExiste(nome);

                  if(!resultado){
                     System.err.println("A variavel "+$ID.text+" nao foi declarada");
                     System.exit(0);
                  } else {
                     var1 = novaVariavel.getTipo();
                     codigoJava += $ID.text;
                  }
               }
            INCREMENTAL {
                           codigoJava += $INCREMENTAL.text;
                        }
;


expressao: termo
          (
            (
               SOMA{
                  codigoJava += "+";
               }| 
               SUB{
                  codigoJava += "-";   
               }
            ) 
            termo)*
   ;

termo: fator (
               (
                  MULT{
                     codigoJava += "*";
                  
                  } | 
                  DIV{
                     codigoJava += "/";
                  }
               ) 
            fator{
               
            }
            )*
   ;	

fator:   ID //ID | INT | DEC | BOOL | STRING | ABREP expressao FP
            {
            boolean resultado;
            resultado = cv.jaExiste($ID.text);
            if(!resultado){
               System.err.println("A variavel "+$ID.text+" nao foi declarada");
               System.exit(0);
            }
            else{
               escopo = novaVariavel.getEscopo();
               tipo = novaVariavel.getTipo();
               if(tipo == 1){
                  codigoJava += $ID.text;
               }
               else if(tipo == 2){
                  System.err.println("A variavel "+$ID.text+" nao é do mesmo tipo");
               }
               else if(tipo == 3){
                  codigoJava += $ID.text;
               }
            }
         }| 
         INT{
            codigoJava += $INT.text;
         }| 
         DEC{
            codigoJava += $DEC.text;
         }| 

         (ABREP {
                  codigoJava += "(";
         }
         expressao {
                  codigoJava += $expressao.text;
         }
         FP{codigoJava += $FP.text;}
         )
   ;


ID: [A-Za-z_][A-Za-z0-9_]*;
INT: [0-9]+;
DEC: [0-9]+ '.' [0-9]+;
BOOL: 'true' | 'false';
STRING: '"' .*? '"' ;

OPREL: '>' | '<' | '>=' | '<=' | '==' | '!=' ;

INCREMENTAL: '++' | '--' | '+=' | '-=' | '*=' | '/=' ;

SOMA: '+' ;
SUB: '-' ;
MULT: '*' ;
DIV: '/' ;

PV: ';' ;

VG: ',' ;

AC: '{' ;
FC: '}' ;

ABREP: '(' ;
FP: ')' ;

Op_atrib: '=';
WS: [ \t\r\n]+ -> skip;