// Generated from java-escape by ANTLR 4.11.1
package com.dissdic.separatedata.common.processor.postgresql.Select;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SelectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SelectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SelectParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(SelectParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(SelectParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#queryfields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryfields(SelectParser.QueryfieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(SelectParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#orderbyfields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderbyfields(SelectParser.OrderbyfieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#groupbyfields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupbyfields(SelectParser.GroupbyfieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#like}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(SelectParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(SelectParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(SelectParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SelectParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SelectParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#compute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompute(SelectParser.ComputeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SelectParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SelectParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(SelectParser.TablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(SelectParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#tablewithalias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablewithalias(SelectParser.TablewithaliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#tablewithoutalias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablewithoutalias(SelectParser.TablewithoutaliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SelectParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SelectParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#nameoralias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameoralias(SelectParser.NameoraliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#static}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic(SelectParser.StaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SelectParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#groupfunctionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupfunctionname(SelectParser.GroupfunctionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(SelectParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#tabledotfield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabledotfield(SelectParser.TabledotfieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#relator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelator(SelectParser.RelatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(SelectParser.RelationContext ctx);
}