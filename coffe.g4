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
}

prog: 'inicio' declaracao bloco 'fim';

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
            'natural'|
            'texto'|
            'decimal'   
        )
   ;

bloco:    (comando)+
   ;

comando:   ler |
		   escrever |
		   condicional |
		   repeticao |
		   atribuicao
   ;

ler:   'leia' ABREP ID FP PV
   ;

escrever:   'escreva' ABREP (ID | STRING) FP PV
   ;







// cond:   'se' ABREP comp FP AC bloco FC
// 		('senao' AC bloco FC )?
// 	;

// comp:   (ID | NUM) OPREL (ID | NUM)
//     ;

// repet:  'enquanto' ABREP comp FP AC bloco FC
// 	;
	
// atrib:  ID {	boolean resultado = cv.jaExiste($ID.text);
// 				if(!resultado){
// 					System.err.println("A variavel "+$ID.text+" nao foi declarada");
// 					System.exit(0);
// 				}
// 			}
// 		PV
//      ;

ID: [A-Za-z]+;
NUM: [0-9]+;
DEC: [0-9]+ '.' [0-9]+;
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