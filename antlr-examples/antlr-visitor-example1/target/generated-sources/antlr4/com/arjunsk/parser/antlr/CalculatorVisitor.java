// Generated from com/arjunsk/parser/antlr/Calculator.g4 by ANTLR 4.9.2
package com.arjunsk.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(CalculatorParser.OperationContext ctx);
}