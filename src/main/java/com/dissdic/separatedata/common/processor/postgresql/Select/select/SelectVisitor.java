// Generated from java-escape by ANTLR 4.11.1
package com.dissdic.separatedata.common.processor.postgresql.Select.select;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SelectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.TablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#tablewithalias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablewithalias(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.TablewithaliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#fieldwithalias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldwithalias(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.FieldwithaliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#tablewithoutalias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablewithoutalias(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.TablewithoutaliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#fieldwithoutalias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldwithoutalias(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.FieldwithoutaliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#singlewhere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglewhere(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.SinglewhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#tabledotfield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabledotfield(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.TabledotfieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#relator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelator(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.RelatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#nameoralias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameoralias(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.NameoraliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#static}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.StaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#groupfunctionexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupfunctionexpr(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.GroupfunctionexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#groupingsets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingsets(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.GroupingsetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#cube}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCube(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.CubeContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#rollup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.RollupContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser#groupfunctionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupfunctionname(SelectParser.GroupfunctionnameContext ctx);
}