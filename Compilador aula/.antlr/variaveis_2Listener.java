// Generated from c:/Users/Nicolas Ferreira/Documents/Compilador aula/variaveis_2.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link variaveis_2Parser}.
 */
public interface variaveis_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link variaveis_2Parser#vai}.
	 * @param ctx the parse tree
	 */
	void enterVai(variaveis_2Parser.VaiContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveis_2Parser#vai}.
	 * @param ctx the parse tree
	 */
	void exitVai(variaveis_2Parser.VaiContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveis_2Parser#declvar}.
	 * @param ctx the parse tree
	 */
	void enterDeclvar(variaveis_2Parser.DeclvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveis_2Parser#declvar}.
	 * @param ctx the parse tree
	 */
	void exitDeclvar(variaveis_2Parser.DeclvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveis_2Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(variaveis_2Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveis_2Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(variaveis_2Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveis_2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(variaveis_2Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveis_2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(variaveis_2Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveis_2Parser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(variaveis_2Parser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveis_2Parser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(variaveis_2Parser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveis_2Parser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(variaveis_2Parser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveis_2Parser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(variaveis_2Parser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveis_2Parser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(variaveis_2Parser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveis_2Parser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(variaveis_2Parser.AtribContext ctx);
}