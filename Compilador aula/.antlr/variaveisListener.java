// Generated from c:/Users/Nicolas Ferreira/Documents/Compilador aula/variaveis.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link variaveisParser}.
 */
public interface variaveisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link variaveisParser#vai}.
	 * @param ctx the parse tree
	 */
	void enterVai(variaveisParser.VaiContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#vai}.
	 * @param ctx the parse tree
	 */
	void exitVai(variaveisParser.VaiContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#declvar}.
	 * @param ctx the parse tree
	 */
	void enterDeclvar(variaveisParser.DeclvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#declvar}.
	 * @param ctx the parse tree
	 */
	void exitDeclvar(variaveisParser.DeclvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(variaveisParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(variaveisParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(variaveisParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(variaveisParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(variaveisParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(variaveisParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(variaveisParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(variaveisParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(variaveisParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(variaveisParser.AtribContext ctx);
}