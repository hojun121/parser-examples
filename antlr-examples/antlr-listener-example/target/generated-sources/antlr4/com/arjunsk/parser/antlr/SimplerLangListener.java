// Generated from com/arjunsk/parser/antlr/SimplerLang.g4 by ANTLR 4.9.2
package com.arjunsk.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplerLangParser}.
 */
public interface SimplerLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplerLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimplerLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplerLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimplerLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplerLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimplerLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplerLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimplerLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplerLangParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(SimplerLangParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplerLangParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(SimplerLangParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplerLangParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(SimplerLangParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplerLangParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(SimplerLangParser.ShowContext ctx);
}