// Generated from com/arjunsk/parser/antlr/SimplerLang.g4 by ANTLR 4.9.2
package com.arjunsk.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimplerLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimplerLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimplerLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimplerLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimplerLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerLangParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(SimplerLangParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplerLangParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(SimplerLangParser.ShowContext ctx);
}