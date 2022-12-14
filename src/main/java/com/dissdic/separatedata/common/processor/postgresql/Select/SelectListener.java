// Generated from java-escape by ANTLR 4.11.1
package com.dissdic.separatedata.common.processor.postgresql.Select;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SelectParser}.
 */
public interface SelectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SelectParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SelectParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SelectParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(SelectParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(SelectParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(SelectParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(SelectParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(SelectParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(SelectParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(SelectParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(SelectParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#jointable}.
	 * @param ctx the parse tree
	 */
	void enterJointable(SelectParser.JointableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#jointable}.
	 * @param ctx the parse tree
	 */
	void exitJointable(SelectParser.JointableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#joinwhere}.
	 * @param ctx the parse tree
	 */
	void enterJoinwhere(SelectParser.JoinwhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#joinwhere}.
	 * @param ctx the parse tree
	 */
	void exitJoinwhere(SelectParser.JoinwhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SelectParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SelectParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(SelectParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(SelectParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#tablewithalias}.
	 * @param ctx the parse tree
	 */
	void enterTablewithalias(SelectParser.TablewithaliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#tablewithalias}.
	 * @param ctx the parse tree
	 */
	void exitTablewithalias(SelectParser.TablewithaliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#fieldwithalias}.
	 * @param ctx the parse tree
	 */
	void enterFieldwithalias(SelectParser.FieldwithaliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#fieldwithalias}.
	 * @param ctx the parse tree
	 */
	void exitFieldwithalias(SelectParser.FieldwithaliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#tablewithoutalias}.
	 * @param ctx the parse tree
	 */
	void enterTablewithoutalias(SelectParser.TablewithoutaliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#tablewithoutalias}.
	 * @param ctx the parse tree
	 */
	void exitTablewithoutalias(SelectParser.TablewithoutaliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#fieldwithoutalias}.
	 * @param ctx the parse tree
	 */
	void enterFieldwithoutalias(SelectParser.FieldwithoutaliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#fieldwithoutalias}.
	 * @param ctx the parse tree
	 */
	void exitFieldwithoutalias(SelectParser.FieldwithoutaliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(SelectParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(SelectParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#singlewhere}.
	 * @param ctx the parse tree
	 */
	void enterSinglewhere(SelectParser.SinglewhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#singlewhere}.
	 * @param ctx the parse tree
	 */
	void exitSinglewhere(SelectParser.SinglewhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#tabledotfield}.
	 * @param ctx the parse tree
	 */
	void enterTabledotfield(SelectParser.TabledotfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#tabledotfield}.
	 * @param ctx the parse tree
	 */
	void exitTabledotfield(SelectParser.TabledotfieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#relator}.
	 * @param ctx the parse tree
	 */
	void enterRelator(SelectParser.RelatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#relator}.
	 * @param ctx the parse tree
	 */
	void exitRelator(SelectParser.RelatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(SelectParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(SelectParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SelectParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SelectParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SelectParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SelectParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#nameoralias}.
	 * @param ctx the parse tree
	 */
	void enterNameoralias(SelectParser.NameoraliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#nameoralias}.
	 * @param ctx the parse tree
	 */
	void exitNameoralias(SelectParser.NameoraliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#static}.
	 * @param ctx the parse tree
	 */
	void enterStatic(SelectParser.StaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#static}.
	 * @param ctx the parse tree
	 */
	void exitStatic(SelectParser.StaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#groupfunctionexpr}.
	 * @param ctx the parse tree
	 */
	void enterGroupfunctionexpr(SelectParser.GroupfunctionexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#groupfunctionexpr}.
	 * @param ctx the parse tree
	 */
	void exitGroupfunctionexpr(SelectParser.GroupfunctionexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#groupingsets}.
	 * @param ctx the parse tree
	 */
	void enterGroupingsets(SelectParser.GroupingsetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#groupingsets}.
	 * @param ctx the parse tree
	 */
	void exitGroupingsets(SelectParser.GroupingsetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#cube}.
	 * @param ctx the parse tree
	 */
	void enterCube(SelectParser.CubeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#cube}.
	 * @param ctx the parse tree
	 */
	void exitCube(SelectParser.CubeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#rollup}.
	 * @param ctx the parse tree
	 */
	void enterRollup(SelectParser.RollupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#rollup}.
	 * @param ctx the parse tree
	 */
	void exitRollup(SelectParser.RollupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SelectParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SelectParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SelectParser#groupfunctionname}.
	 * @param ctx the parse tree
	 */
	void enterGroupfunctionname(SelectParser.GroupfunctionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectParser#groupfunctionname}.
	 * @param ctx the parse tree
	 */
	void exitGroupfunctionname(SelectParser.GroupfunctionnameContext ctx);
}