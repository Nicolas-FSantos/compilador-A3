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
            'decimal'   
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

ler:   'leia' ABREP ID FP PV
   ;

escrever:   'escreva' ABREP (ID | STRING) FP PV
   ;

condicional:   'se' ABREP comp FP AC bloco FC

		('senao' AC bloco FC )?
   ;

comp:   (ID | NUM | DEC) OPREL (ID | NUM | DEC)
   ;

repetfor:  'para' ABREP atribuicao PV comp PV atribuicao FP AC bloco FC

   ;

repetwhile:  'enquanto' ABREP comp FP AC bloco FC
   ;

atribuicao:  ID Op_atrib (ID | NUM | DEC) PV

		{	
			nome = $ID.text;
			if(!cv.jaExiste(nome)){
				System.err.println("A variavel "+nome+" nao foi declarada");
				System.exit(0);
			}
			else{
				escopo = cv.getEscopo(nome);
				tipo = cv.getTipo(nome);
				if(tipo == 1){
					codigoJava += "int "+nome+" = "+$ID.text+";\n";
				}
				else if(tipo == 2){
					codigoJava += "String "+nome+" = "+$ID.text+";\n";
				}
				else if(tipo == 3){
					codigoJava += "double "+nome+" = "+$ID.text+";\n";
				}
			}
		}
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