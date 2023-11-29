grammar coffe;

@header {
    import java.util.*;
}

@members {
	Variavel novaVariavel = new Variavel();
	ControleVariavel cv = new ControleVariavel();
   Conversor cj = new Conversor();
	String codigoJava = "";
	int escopo;
	int tipo;
	String nome;
   Scanner leia = new Scanner(System.in);

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
                  tipo 
                  ID { novaVariavel = new Variavel($ID.text, tipo, escopo);
                              boolean declarado = cv.adiciona(novaVariavel);
                        if(!declarado){
                           System.err.println("Variavel "+$ID.text+" ja foi declarada!!!");
                           System.exit(0);
                        }
                        codigoJava += $ID.text;
                     }
                  PV {codigoJava += ";\n";}
               )*
    ;

tipo:   (
            'natural'{ tipo = 1; 
                        codigoJava += "int ";
                     }|
            'texto'  {
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
		   atribuicao
   ;
//scanner
ler: 'leia' 
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
                        codigoJava += ";\n";
                        break;
                    case 2:
                        codigoJava += $ID.text+" = ";
                        codigoJava += "leia.nextLine()";
                        codigoJava += ";\n";
                        break;
                   case 3:
                        codigoJava += $ID.text+" = ";
                        codigoJava += "leia.nextFloat()";
                        codigoJava += ";\n";
                        break;
                  }
               }
      }
   ;

//print
escrever:  'escreva' 
            ABREP
            (
               ID {
                     boolean resultado = cv.jaExiste($ID.text);
                     if(!resultado){
                        System.err.println("A variavel "+$ID.text+" nao foi declarada");
                        System.exit(0);
                     }
                     else{
                        escopo = cv.getEscopo($ID.text);
                        tipo = cv.getTipo($ID.text);
                        if(tipo == 1){
                           codigoJava += "System.out.println("+$ID.text+");\n";
                        }
                        else if(tipo == 2){
                           codigoJava += "System.out.println("+$ID.text+");\n";
                        }
                        else if(tipo == 3){
                           codigoJava += "System.out.println("+$ID.text+");\n";
                        }
                     }
                  }|
               
                | STRING{
                     codigoJava += "System.out.println("+$STRING.text+");\n";
                }
                ) 
                FP 
                PV{
                  codigoJava += ";\n";
                }
   ;

condicional:   'se'
                ABREP{
                  codigoJava += "if";
                }
                compare
                 FP{
                  codigoJava += "\n";
                 }
                AC{
                  codigoJava += $AC.text+"\n"; 
                }
                 bloco 
                 FC{
                  codigoJava += $FC.text+"\n";
                 }
                 
                  (
                     'senao'
                      AC{
                        codigoJava += $AC.text+"\n";
                      }
                       bloco
                        FC{
                           codigoJava += $FC.text+"\n";
                        }
                         )?
   ;

compare:   (
               ID{
                  boolean resultado = cv.jaExiste($ID.text);
                  if(!resultado){
                     System.err.println("A variavel "+$ID.text+" nao foi declarada");
                     System.exit(0);
                  }
                  else{
                     escopo = cv.getEscopo($ID.text);
                     tipo = cv.getTipo($ID.text);
                     if(tipo == 1){
                        codigoJava += $ID.text;
                     }
                     else if(tipo == 2){
                        codigoJava += $ID.text;
                     }
                     else if(tipo == 3){
                        codigoJava += $ID.text;
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
                     boolean resultado = cv.jaExiste($ID.text);
                     if(!resultado){
                        System.err.println("A variavel "+$ID.text+" nao foi declarada");
                        System.exit(0);
                     }
                     else{
                        escopo = cv.getEscopo($ID.text);
                        tipo = cv.getTipo($ID.text);
                        if(tipo == 1){
                           codigoJava += $ID.text;
                        }
                        else if(tipo == 2){
                           codigoJava += $ID.text;
                        }
                        else if(tipo == 3){
                           codigoJava += $ID.text;
                        }
                     }
                  
                 } | 
                 INT{
                  codigoJava += $INT.text;
                 } | 
                 DEC{
                  codigoJava += $DEC.text;
                 }
                 )
   ;

repetfor:  'para'
             ABREP{
               codigoJava += "for";
             }
              atribuicao
               PV{codigoJava += ";\n";}
                compare
                 PV{codigoJava += ";\n";}
                  atribuicao
                   FP{codigoJava += "\n";}
                    AC{codigoJava += $AC.text+"\n";}
                     bloco
                      FC{codigoJava += $FC.text+"\n";}

   ;

repetwhile:  'enquanto'
                ABREP{
                  codigoJava += "while(";
                }
                 compare
                  FP{
                     codigoJava += ")\n";
                  }
                   
                   AC{
                     codigoJava += $AC.text+"\n";
                   }
                    bloco
                     FC{
                        codigoJava += $FC.text+"\n";
                     
                   }
   ;

atribuicao:  ID{ boolean resultado = cv.jaExiste($ID.text);
                  if(!resultado){
                     System.err.println("A variavel "+$ID.text+" nao foi declarada");
                     System.exit(0);
                  }else{
                     var1 = cv.getTipo($ID.text);
                     codigoJava += $ID.text;
                  }

               }
             Op_atrib
            (
               ID {
                     boolean resultado = cv.jaExiste($ID.text);
                     if(!resultado){
                        System.err.println("A variavel "+$ID.text+" nao foi declarada");
                        System.exit(0);
                     }

                     else{
                        var2 = cv.getTipo($ID.text);
                        if(var1 != var2){
                           System.err.println("A variavel "+$ID.text+" nao é do mesmo tipo");
                           System.exit(0);
                        }
                     }
               }| 
               INT{  if(var1 != 1){
                           System.err.println("A variavel "+$ID.text+" nao é do mesmo tipo");
                           System.exit(0);
                        }
                  } | 
               DEC{
                     if(var1 != 3){
                           System.err.println("A variavel "+$ID.text+" nao é do mesmo tipo");
                           System.exit(0);
                        }
                  }
               ) 
               PV{
                  {codigoJava += ";\n";}
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

fator:   ID{
            boolean resultado = cv.jaExiste($ID.text);
            if(!resultado){
               System.err.println("A variavel "+$ID.text+" nao foi declarada");
               System.exit(0);
            }
            else{
               escopo = cv.getEscopo($ID.text);
               tipo = cv.getTipo($ID.text);
               if(tipo == 1){
                  codigoJava += $ID.text;
               }
               else if(tipo == 2){
                  codigoJava += $ID.text;
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

         (ABREP expressao FP)
   ;




//atratamento semântico da atribuição
// 		{	
// 			nome = $ID.text;
// 			if(!cv.jaExiste(nome)){
// 				System.err.println("A variavel "+nome+" nao foi declarada");
// 				System.exit(0);
// 			}
// 			else{
// 				escopo = cv.getEscopo(nome);
// 				tipo = cv.getTipo(nome);
// 				if(tipo == 1){
// 					codigoJava += "int "+nome+" = "+$ID.text+";\n";
// 				}
// 				else if(tipo == 2){
// 					codigoJava += "String "+nome+" = "+$ID.text+";\n";
// 				}
// 				else if(tipo == 3){
// 					codigoJava += "double "+nome+" = "+$ID.text+";\n";
// 				}
// 			}
// 		}



// cond:   'se' ABREP compare FP AC bloco FC
// 		('senao' AC bloco FC )?
// 	;

// compare:   (ID | INT) OPREL (ID | INT)
//     ;

// repet:  'enquanto' ABREP compare FP AC bloco FC
// 	;
	
// atrib:  ID {	boolean resultado = cv.jaExiste($ID.text);
// 				if(!resultado){
// 					System.err.println("A variavel "+$ID.text+" nao foi declarada");
// 					System.exit(0);
// 				}
// 			}
// 		PV
//      ;

ID: [A-Za-z_][A-Za-z0-9_]*;
INT: [0-9]+;
DEC: [0-9]+ '.' [0-9]+;
BOOL: 'true' | 'false';
STRING: '"' .*? '"' ;

OPREL: '>' | '<' | '>=' | '<=' | '==' | '!=' ;

SOMA: '+' ;
SUB: '-' ;
MULT: '*' ;
DIV: '/' ;

PV: ';' ;

AC: '{' ;
FC: '}' ;

ABREP: '(' ;
FP: ')' ;

Op_atrib: '=';
WS: [ \t\r\n]+ -> skip;