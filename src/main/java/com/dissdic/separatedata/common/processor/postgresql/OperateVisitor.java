// Generated from java-escape by ANTLR 4.11.1
package com.dissdic.separatedata.common.processor.postgresql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OperateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OperateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OperateParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(OperateParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(OperateParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(OperateParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(OperateParser.TablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(OperateParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(OperateParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(OperateParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(OperateParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#singlewhere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglewhere(OperateParser.SinglewhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#tabledotfield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabledotfield(OperateParser.TabledotfieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#relator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelator(OperateParser.RelatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#static}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic(OperateParser.StaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperateParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(OperateParser.KeywordContext ctx);
}