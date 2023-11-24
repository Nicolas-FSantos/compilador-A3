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

declaracao:    (tipo ID PV)*
    ;

tipo:   (
            'natural'|
            'texto'|
            'decimal'|
			'boleano'   
        )
   ;

bloco:    (comando)+
   ;

comando:   ler |
		   escrever |
		   condicional |
		   repetfor |
		   repetwhile |
		   atribuicao
   ;
//scanner
ler:   'leia' ABREP ID FP PV
   ;

//print
escrever:  'escreva' ABREP (ID | STRING) FP PV
   ;

condicional:   'se' ABREP compare FP AC bloco FC

		('senao' AC bloco FC )?
   ;

compare:   (ID | INT | DEC) OPREL (ID | INT | DEC)
   ;

repetfor:  'para' ABREP atribuicao PV compare PV atribuicao FP AC bloco FC

   ;

repetwhile:  'enquanto' ABREP compare FP AC bloco FC
   ;

atribuicao:  ID Op_atrib (ID | INT | DEC) PV


   ;


expressao: termo ((SOMA | SUB) termo)*
   ;

termo: fator ((MULT | DIV) fator)*
   ;	

fator:   ID | INT | DEC | (ABREP expressao FP)
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