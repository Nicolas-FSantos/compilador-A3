// Generated from c:/Users/Nicolas Ferreira/Documents/antlr/compilador-A3/coffe.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link coffeParser}.
 */
public interface coffeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link coffeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(coffeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(coffeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(coffeParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(coffeParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(coffeParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(coffeParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(coffeParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(coffeParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(coffeParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(coffeParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#ler}.
	 * @param ctx the parse tree
	 */
	void enterLer(coffeParser.LerContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#ler}.
	 * @param ctx the parse tree
	 */
	void exitLer(coffeParser.LerContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#escrever}.
	 * @param ctx the parse tree
	 */
	void enterEscrever(coffeParser.EscreverContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#escrever}.
	 * @param ctx the parse tree
	 */
	void exitEscrever(coffeParser.EscreverContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(coffeParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(coffeParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(coffeParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(coffeParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#repetfor}.
	 * @param ctx the parse tree
	 */
	void enterRepetfor(coffeParser.RepetforContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#repetfor}.
	 * @param ctx the parse tree
	 */
	void exitRepetfor(coffeParser.RepetforContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#repetwhile}.
	 * @param ctx the parse tree
	 */
	void enterRepetwhile(coffeParser.RepetwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#repetwhile}.
	 * @param ctx the parse tree
	 */
	void exitRepetwhile(coffeParser.RepetwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link coffeParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(coffeParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link coffeParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(coffeParser.AtribuicaoContext ctx);
}