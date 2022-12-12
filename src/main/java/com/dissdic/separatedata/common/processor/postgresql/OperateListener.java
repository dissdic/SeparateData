// Generated from java-escape by ANTLR 4.11.1
package com.dissdic.separatedata.common.processor.postgresql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OperateParser}.
 */
public interface OperateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OperateParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(OperateParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(OperateParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(OperateParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(OperateParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(OperateParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(OperateParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(OperateParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(OperateParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(OperateParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(OperateParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(OperateParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(OperateParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(OperateParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(OperateParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(OperateParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(OperateParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#singlewhere}.
	 * @param ctx the parse tree
	 */
	void enterSinglewhere(OperateParser.SinglewhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#singlewhere}.
	 * @param ctx the parse tree
	 */
	void exitSinglewhere(OperateParser.SinglewhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#tabledotfield}.
	 * @param ctx the parse tree
	 */
	void enterTabledotfield(OperateParser.TabledotfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#tabledotfield}.
	 * @param ctx the parse tree
	 */
	void exitTabledotfield(OperateParser.TabledotfieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#relator}.
	 * @param ctx the parse tree
	 */
	void enterRelator(OperateParser.RelatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#relator}.
	 * @param ctx the parse tree
	 */
	void exitRelator(OperateParser.RelatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#static}.
	 * @param ctx the parse tree
	 */
	void enterStatic(OperateParser.StaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#static}.
	 * @param ctx the parse tree
	 */
	void exitStatic(OperateParser.StaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperateParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(OperateParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperateParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(OperateParser.KeywordContext ctx);
}