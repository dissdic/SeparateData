// Generated from java-escape by ANTLR 4.11.1
package com.dissdic.separatedata.common.processor.postgresql.Select;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SelectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALL=1, ANALYSE=2, ANALYZE=3, AND=4, ANY=5, ARRAY=6, AS=7, ASC=8, ASYMMETRIC=9, 
		BOTH=10, CASE=11, CAST=12, CHECK=13, COLLATE=14, COLUMN=15, CONSTRAINT=16, 
		CREATE=17, CURRENT_CATALOG=18, CURRENT_DATE=19, CURRENT_ROLE=20, CURRENT_TIME=21, 
		CURRENT_TIMESTAMP=22, CURRENT_USER=23, DEFAULT=24, DEFERRABLE=25, DESC=26, 
		DISTINCT=27, DO=28, ELSE=29, END=30, EXCEPT=31, FALSE=32, FETCH=33, FOR=34, 
		FOREIGN=35, FROM=36, GRANT=37, GROUP=38, HAVING=39, IN=40, INITIALLY=41, 
		INTERSECT=42, INTO=43, LATERAL=44, LEADING=45, LIMIT=46, LOCALTIME=47, 
		LOCALTIMESTAMP=48, NOT=49, NULL=50, OFFSET=51, ON=52, ONLY=53, OR=54, 
		ORDER=55, PLACING=56, PRIMARY=57, REFERENCES=58, RETURNING=59, SELECT=60, 
		SESSION_USER=61, SOME=62, SYMMETRIC=63, TABLE=64, THEN=65, TO=66, TRAILING=67, 
		TRUE=68, UNION=69, UNIQUE=70, USER=71, USING=72, VARIADIC=73, WHEN=74, 
		WHERE=75, WINDOW=76, WITH=77, IS=78, BY=79, INSERT=80, LEFT=81, RIGHT=82, 
		JOIN=83, OUTER=84, INNER=85, FULL=86, CROSS=87, ARRAY_AGG=88, AVG=89, 
		BIT_AND=90, BIT_OR=91, BOOL_AND=92, BOOL_OR=93, COUNT=94, EVERY=95, JSON_AGG=96, 
		JSONB_AGG=97, JSON_OBJECT_AGG=98, JSONB_OBJECT_AGG=99, MAX=100, MIN=101, 
		STRING_AGG=102, SUM=103, XMLAGG=104, CORR=105, COVAR_POP=106, COVAR_SAMP=107, 
		REGR_AVGX=108, REGR_AVGY=109, REGR_COUNT=110, REGR_R2=111, REGR_SLOPE=112, 
		REGR_SXX=113, REGR_SXY=114, REGE_SYY=115, STDDEV=116, STDDEV_POP=117, 
		STDDEV_SAMP=118, VARIANCE=119, VAR_POP=120, VAR_SAMP=121, GROUPING=122, 
		SETS=123, CUBE=124, ROLLUP=125, EXTRACT=126, LIKE=127, BETWEEN=128, UL=129, 
		COMMA=130, SUB=131, SR=132, EQ=133, GT=134, LT=135, GE=136, LE=137, NE=138, 
		BI=139, DOT=140, PLUS=141, ADT=142, OVP=143, INC=144, IND=145, SLT=146, 
		SRT=147, NLT=148, NRT=149, LB=150, RB=151, SQ=152, PC=153, DS=154, TUB=155, 
		MG=156, IX=157, Value=158, WORDS=159, INT=160, ID=161, WS=162, OTHER=163;
	public static final int
		RULE_select = 0, RULE_join = 1, RULE_queryfields = 2, RULE_queryfield = 3, 
		RULE_where = 4, RULE_orderbyfields = 5, RULE_groupbyfields = 6, RULE_like = 7, 
		RULE_between = 8, RULE_in = 9, RULE_condition = 10, RULE_function = 11, 
		RULE_compute = 12, RULE_field = 13, RULE_table = 14, RULE_tables = 15, 
		RULE_fields = 16, RULE_tablewithalias = 17, RULE_tablewithoutalias = 18, 
		RULE_name = 19, RULE_alias = 20, RULE_nameoralias = 21, RULE_static = 22, 
		RULE_keyword = 23, RULE_groupfunctionname = 24, RULE_values = 25, RULE_tabledotfield = 26, 
		RULE_relator = 27, RULE_relation = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"select", "join", "queryfields", "queryfield", "where", "orderbyfields", 
			"groupbyfields", "like", "between", "in", "condition", "function", "compute", 
			"field", "table", "tables", "fields", "tablewithalias", "tablewithoutalias", 
			"name", "alias", "nameoralias", "static", "keyword", "groupfunctionname", 
			"values", "tabledotfield", "relator", "relation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'_'", "','", "'-'", 
			"'*'", "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'<>'", "'.'", "'+'", 
			"'-|-'", "'&&'", "'@>'", "'@<'", "'<<'", "'>>'", "'&>'", "'&<'", "'('", 
			"')'", "'''", "'%'", "'/'", "'|'", "'&'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALL", "ANALYSE", "ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", 
			"ASYMMETRIC", "BOTH", "CASE", "CAST", "CHECK", "COLLATE", "COLUMN", "CONSTRAINT", 
			"CREATE", "CURRENT_CATALOG", "CURRENT_DATE", "CURRENT_ROLE", "CURRENT_TIME", 
			"CURRENT_TIMESTAMP", "CURRENT_USER", "DEFAULT", "DEFERRABLE", "DESC", 
			"DISTINCT", "DO", "ELSE", "END", "EXCEPT", "FALSE", "FETCH", "FOR", "FOREIGN", 
			"FROM", "GRANT", "GROUP", "HAVING", "IN", "INITIALLY", "INTERSECT", "INTO", 
			"LATERAL", "LEADING", "LIMIT", "LOCALTIME", "LOCALTIMESTAMP", "NOT", 
			"NULL", "OFFSET", "ON", "ONLY", "OR", "ORDER", "PLACING", "PRIMARY", 
			"REFERENCES", "RETURNING", "SELECT", "SESSION_USER", "SOME", "SYMMETRIC", 
			"TABLE", "THEN", "TO", "TRAILING", "TRUE", "UNION", "UNIQUE", "USER", 
			"USING", "VARIADIC", "WHEN", "WHERE", "WINDOW", "WITH", "IS", "BY", "INSERT", 
			"LEFT", "RIGHT", "JOIN", "OUTER", "INNER", "FULL", "CROSS", "ARRAY_AGG", 
			"AVG", "BIT_AND", "BIT_OR", "BOOL_AND", "BOOL_OR", "COUNT", "EVERY", 
			"JSON_AGG", "JSONB_AGG", "JSON_OBJECT_AGG", "JSONB_OBJECT_AGG", "MAX", 
			"MIN", "STRING_AGG", "SUM", "XMLAGG", "CORR", "COVAR_POP", "COVAR_SAMP", 
			"REGR_AVGX", "REGR_AVGY", "REGR_COUNT", "REGR_R2", "REGR_SLOPE", "REGR_SXX", 
			"REGR_SXY", "REGE_SYY", "STDDEV", "STDDEV_POP", "STDDEV_SAMP", "VARIANCE", 
			"VAR_POP", "VAR_SAMP", "GROUPING", "SETS", "CUBE", "ROLLUP", "EXTRACT", 
			"LIKE", "BETWEEN", "UL", "COMMA", "SUB", "SR", "EQ", "GT", "LT", "GE", 
			"LE", "NE", "BI", "DOT", "PLUS", "ADT", "OVP", "INC", "IND", "SLT", "SRT", 
			"NLT", "NRT", "LB", "RB", "SQ", "PC", "DS", "TUB", "MG", "IX", "Value", 
			"WORDS", "INT", "ID", "WS", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SelectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SelectParser.SELECT, 0); }
		public QueryfieldsContext queryfields() {
			return getRuleContext(QueryfieldsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SelectParser.FROM, 0); }
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SelectParser.WHERE, 0); }
		public List<WhereContext> where() {
			return getRuleContexts(WhereContext.class);
		}
		public WhereContext where(int i) {
			return getRuleContext(WhereContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(SelectParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(SelectParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SelectParser.BY, i);
		}
		public GroupbyfieldsContext groupbyfields() {
			return getRuleContext(GroupbyfieldsContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SelectParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(SelectParser.ORDER, 0); }
		public OrderbyfieldsContext orderbyfields() {
			return getRuleContext(OrderbyfieldsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SelectParser.LIMIT, 0); }
		public List<TerminalNode> Value() { return getTokens(SelectParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(SelectParser.Value, i);
		}
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(SELECT);
			setState(59);
			queryfields(0);
			setState(60);
			match(FROM);
			setState(61);
			tables(0);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 115L) != 0) {
				{
				{
				setState(62);
				join();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(68);
				match(WHERE);
				setState(69);
				where(0);
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(72);
				match(GROUP);
				setState(73);
				match(BY);
				setState(74);
				groupbyfields(0);
				}
			}

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(77);
				match(HAVING);
				setState(78);
				where(0);
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(81);
				match(ORDER);
				setState(82);
				match(BY);
				setState(83);
				orderbyfields(0);
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(86);
				match(LIMIT);
				setState(87);
				match(Value);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(88);
					match(COMMA);
					setState(89);
					match(Value);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(SelectParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(SelectParser.ON, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public TerminalNode USING() { return getToken(SelectParser.USING, 0); }
		public TerminalNode LB() { return getToken(SelectParser.LB, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode RB() { return getToken(SelectParser.RB, 0); }
		public TerminalNode INNER() { return getToken(SelectParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SelectParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SelectParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SelectParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SelectParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(SelectParser.OUTER, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
			case RIGHT:
			case FULL:
				{
				{
				setState(94);
				_la = _input.LA(1);
				if ( !((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 35L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(95);
					match(OUTER);
					}
				}

				}
				}
				break;
			case INNER:
				{
				setState(98);
				match(INNER);
				}
				break;
			case CROSS:
				{
				setState(99);
				match(CROSS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			match(JOIN);
			}
			setState(104);
			table();
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(105);
				match(ON);
				setState(106);
				where(0);
				}
				break;
			case USING:
				{
				setState(107);
				match(USING);
				setState(108);
				match(LB);
				setState(109);
				fields(0);
				setState(110);
				match(RB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryfieldsContext extends ParserRuleContext {
		public QueryfieldContext queryfield() {
			return getRuleContext(QueryfieldContext.class,0);
		}
		public List<QueryfieldsContext> queryfields() {
			return getRuleContexts(QueryfieldsContext.class);
		}
		public QueryfieldsContext queryfields(int i) {
			return getRuleContext(QueryfieldsContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public QueryfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryfields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterQueryfields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitQueryfields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitQueryfields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryfieldsContext queryfields() throws RecognitionException {
		return queryfields(0);
	}

	private QueryfieldsContext queryfields(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryfieldsContext _localctx = new QueryfieldsContext(_ctx, _parentState);
		QueryfieldsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_queryfields, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			queryfield();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new QueryfieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_queryfields);
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
					match(COMMA);
					setState(119);
					queryfields(3);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryfieldContext extends ParserRuleContext {
		public ComputeContext compute() {
			return getRuleContext(ComputeContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SelectParser.DISTINCT, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SelectParser.AS, 0); }
		public QueryfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterQueryfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitQueryfield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitQueryfield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryfieldContext queryfield() throws RecognitionException {
		QueryfieldContext _localctx = new QueryfieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryfield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(125);
				match(DISTINCT);
				}
				break;
			}
			setState(128);
			compute(0);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(129);
					match(AS);
					}
					break;
				}
				setState(132);
				alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(SelectParser.LB, 0); }
		public List<WhereContext> where() {
			return getRuleContexts(WhereContext.class);
		}
		public WhereContext where(int i) {
			return getRuleContext(WhereContext.class,i);
		}
		public TerminalNode RB() { return getToken(SelectParser.RB, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		return where(0);
	}

	private WhereContext where(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WhereContext _localctx = new WhereContext(_ctx, _parentState);
		WhereContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_where, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(136);
				match(LB);
				setState(137);
				where(0);
				setState(138);
				match(RB);
				}
				break;
			case 2:
				{
				setState(140);
				condition();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WhereContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_where);
					setState(143);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(144);
					relation();
					setState(145);
					where(4);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderbyfieldsContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SelectParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SelectParser.DESC, 0); }
		public List<OrderbyfieldsContext> orderbyfields() {
			return getRuleContexts(OrderbyfieldsContext.class);
		}
		public OrderbyfieldsContext orderbyfields(int i) {
			return getRuleContext(OrderbyfieldsContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public OrderbyfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderbyfields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterOrderbyfields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitOrderbyfields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitOrderbyfields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderbyfieldsContext orderbyfields() throws RecognitionException {
		return orderbyfields(0);
	}

	private OrderbyfieldsContext orderbyfields(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrderbyfieldsContext _localctx = new OrderbyfieldsContext(_ctx, _parentState);
		OrderbyfieldsContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_orderbyfields, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(153);
			field();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrderbyfieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orderbyfields);
					setState(157);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(158);
					match(COMMA);
					setState(159);
					orderbyfields(3);
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupbyfieldsContext extends ParserRuleContext {
		public ComputeContext compute() {
			return getRuleContext(ComputeContext.class,0);
		}
		public List<GroupbyfieldsContext> groupbyfields() {
			return getRuleContexts(GroupbyfieldsContext.class);
		}
		public GroupbyfieldsContext groupbyfields(int i) {
			return getRuleContext(GroupbyfieldsContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public GroupbyfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupbyfields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterGroupbyfields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitGroupbyfields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitGroupbyfields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupbyfieldsContext groupbyfields() throws RecognitionException {
		return groupbyfields(0);
	}

	private GroupbyfieldsContext groupbyfields(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GroupbyfieldsContext _localctx = new GroupbyfieldsContext(_ctx, _parentState);
		GroupbyfieldsContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_groupbyfields, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			compute(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GroupbyfieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_groupbyfields);
					setState(168);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(169);
					match(COMMA);
					setState(170);
					groupbyfields(3);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LikeContext extends ParserRuleContext {
		public ComputeContext compute() {
			return getRuleContext(ComputeContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SelectParser.LIKE, 0); }
		public TerminalNode Value() { return getToken(SelectParser.Value, 0); }
		public TerminalNode NOT() { return getToken(SelectParser.NOT, 0); }
		public LikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeContext like() throws RecognitionException {
		LikeContext _localctx = new LikeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_like);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			compute(0);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(177);
				match(NOT);
				}
			}

			setState(180);
			match(LIKE);
			setState(181);
			match(Value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BetweenContext extends ParserRuleContext {
		public List<ComputeContext> compute() {
			return getRuleContexts(ComputeContext.class);
		}
		public ComputeContext compute(int i) {
			return getRuleContext(ComputeContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(SelectParser.BETWEEN, 0); }
		public TerminalNode LB() { return getToken(SelectParser.LB, 0); }
		public TerminalNode AND() { return getToken(SelectParser.AND, 0); }
		public TerminalNode RB() { return getToken(SelectParser.RB, 0); }
		public TerminalNode NOT() { return getToken(SelectParser.NOT, 0); }
		public BetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_between);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			compute(0);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(184);
				match(NOT);
				}
			}

			setState(187);
			match(BETWEEN);
			setState(188);
			match(LB);
			setState(189);
			compute(0);
			setState(190);
			match(AND);
			setState(191);
			compute(0);
			setState(192);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InContext extends ParserRuleContext {
		public ComputeContext compute() {
			return getRuleContext(ComputeContext.class,0);
		}
		public TerminalNode IN() { return getToken(SelectParser.IN, 0); }
		public TerminalNode LB() { return getToken(SelectParser.LB, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode RB() { return getToken(SelectParser.RB, 0); }
		public TerminalNode NOT() { return getToken(SelectParser.NOT, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			compute(0);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(195);
				match(NOT);
				}
			}

			setState(198);
			match(IN);
			setState(199);
			match(LB);
			setState(200);
			values(0);
			setState(201);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ComputeContext> compute() {
			return getRuleContexts(ComputeContext.class);
		}
		public ComputeContext compute(int i) {
			return getRuleContext(ComputeContext.class,i);
		}
		public RelatorContext relator() {
			return getRuleContext(RelatorContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public BetweenContext between() {
			return getRuleContext(BetweenContext.class,0);
		}
		public LikeContext like() {
			return getRuleContext(LikeContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				compute(0);
				setState(204);
				relator();
				setState(205);
				compute(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				in();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				between();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				like();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public StaticContext static_() {
			return getRuleContext(StaticContext.class,0);
		}
		public TerminalNode LB() { return getToken(SelectParser.LB, 0); }
		public TerminalNode RB() { return getToken(SelectParser.RB, 0); }
		public List<ComputeContext> compute() {
			return getRuleContexts(ComputeContext.class);
		}
		public ComputeContext compute(int i) {
			return getRuleContext(ComputeContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			static_();
			setState(213);
			match(LB);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(214);
						compute(0);
						}
						break;
					case 2:
						{
						setState(215);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(221);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComputeContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode Value() { return getToken(SelectParser.Value, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode LB() { return getToken(SelectParser.LB, 0); }
		public List<ComputeContext> compute() {
			return getRuleContexts(ComputeContext.class);
		}
		public ComputeContext compute(int i) {
			return getRuleContext(ComputeContext.class,i);
		}
		public TerminalNode RB() { return getToken(SelectParser.RB, 0); }
		public TerminalNode PLUS() { return getToken(SelectParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(SelectParser.SUB, 0); }
		public TerminalNode SR() { return getToken(SelectParser.SR, 0); }
		public TerminalNode DS() { return getToken(SelectParser.DS, 0); }
		public TerminalNode TUB() { return getToken(SelectParser.TUB, 0); }
		public TerminalNode MG() { return getToken(SelectParser.MG, 0); }
		public TerminalNode PC() { return getToken(SelectParser.PC, 0); }
		public TerminalNode IX() { return getToken(SelectParser.IX, 0); }
		public ComputeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterCompute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitCompute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitCompute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputeContext compute() throws RecognitionException {
		return compute(0);
	}

	private ComputeContext compute(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComputeContext _localctx = new ComputeContext(_ctx, _parentState);
		ComputeContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_compute, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(224);
				function();
				}
				break;
			case 2:
				{
				setState(225);
				match(Value);
				}
				break;
			case 3:
				{
				setState(226);
				field();
				}
				break;
			case 4:
				{
				setState(227);
				match(LB);
				setState(228);
				compute(0);
				setState(229);
				match(RB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComputeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_compute);
					setState(233);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(234);
					_la = _input.LA(1);
					if ( !((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 130024451L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(235);
					compute(6);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public TabledotfieldContext tabledotfield() {
			return getRuleContext(TabledotfieldContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SR() { return getToken(SelectParser.SR, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_field);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				tabledotfield();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(SR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends ParserRuleContext {
		public TablewithaliasContext tablewithalias() {
			return getRuleContext(TablewithaliasContext.class,0);
		}
		public TablewithoutaliasContext tablewithoutalias() {
			return getRuleContext(TablewithoutaliasContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_table);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				tablewithalias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				tablewithoutalias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablesContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<TablesContext> tables() {
			return getRuleContexts(TablesContext.class);
		}
		public TablesContext tables(int i) {
			return getRuleContext(TablesContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		return tables(0);
	}

	private TablesContext tables(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TablesContext _localctx = new TablesContext(_ctx, _parentState);
		TablesContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_tables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(251);
			table();
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TablesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tables);
					setState(253);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(254);
					match(COMMA);
					setState(255);
					tables(3);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldsContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public List<FieldsContext> fields() {
			return getRuleContexts(FieldsContext.class);
		}
		public FieldsContext fields(int i) {
			return getRuleContext(FieldsContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		return fields(0);
	}

	private FieldsContext fields(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldsContext _localctx = new FieldsContext(_ctx, _parentState);
		FieldsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_fields, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(262);
			field();
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fields);
					setState(264);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(265);
					match(COMMA);
					setState(266);
					fields(3);
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablewithaliasContext extends ParserRuleContext {
		public TablewithoutaliasContext tablewithoutalias() {
			return getRuleContext(TablewithoutaliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SelectParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TablewithaliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablewithalias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterTablewithalias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitTablewithalias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitTablewithalias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablewithaliasContext tablewithalias() throws RecognitionException {
		TablewithaliasContext _localctx = new TablewithaliasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tablewithalias);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				tablewithoutalias();
				setState(273);
				match(AS);
				setState(274);
				alias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				tablewithoutalias();
				setState(277);
				alias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablewithoutaliasContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TablewithoutaliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablewithoutalias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterTablewithoutalias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitTablewithoutalias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitTablewithoutalias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablewithoutaliasContext tablewithoutalias() throws RecognitionException {
		TablewithoutaliasContext _localctx = new TablewithoutaliasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tablewithoutalias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public StaticContext static_() {
			return getRuleContext(StaticContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			static_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public StaticContext static_() {
			return getRuleContext(StaticContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			static_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameoraliasContext extends ParserRuleContext {
		public StaticContext static_() {
			return getRuleContext(StaticContext.class,0);
		}
		public NameoraliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameoralias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterNameoralias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitNameoralias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitNameoralias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameoraliasContext nameoralias() throws RecognitionException {
		NameoraliasContext _localctx = new NameoraliasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nameoralias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			static_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StaticContext extends ParserRuleContext {
		public TerminalNode WORDS() { return getToken(SelectParser.WORDS, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public GroupfunctionnameContext groupfunctionname() {
			return getRuleContext(GroupfunctionnameContext.class,0);
		}
		public StaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticContext static_() throws RecognitionException {
		StaticContext _localctx = new StaticContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_static);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(WORDS);
				}
				break;
			case ALL:
			case ANALYSE:
			case ANALYZE:
			case AND:
			case ANY:
			case ARRAY:
			case AS:
			case ASC:
			case ASYMMETRIC:
			case BOTH:
			case CASE:
			case CAST:
			case CHECK:
			case COLLATE:
			case COLUMN:
			case CONSTRAINT:
			case CREATE:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DEFAULT:
			case DEFERRABLE:
			case DESC:
			case DISTINCT:
			case DO:
			case ELSE:
			case END:
			case EXCEPT:
			case FALSE:
			case FETCH:
			case FOR:
			case FOREIGN:
			case FROM:
			case GRANT:
			case GROUP:
			case HAVING:
			case IN:
			case INITIALLY:
			case INTERSECT:
			case INTO:
			case LATERAL:
			case LEADING:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case NOT:
			case NULL:
			case OFFSET:
			case ON:
			case ONLY:
			case OR:
			case ORDER:
			case PLACING:
			case PRIMARY:
			case REFERENCES:
			case RETURNING:
			case SELECT:
			case SESSION_USER:
			case SOME:
			case SYMMETRIC:
			case TABLE:
			case THEN:
			case TO:
			case TRAILING:
			case TRUE:
			case UNION:
			case UNIQUE:
			case USER:
			case USING:
			case VARIADIC:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case IS:
			case BY:
			case INSERT:
			case LEFT:
			case RIGHT:
			case JOIN:
			case OUTER:
			case INNER:
			case FULL:
			case SETS:
			case CUBE:
			case ROLLUP:
			case EXTRACT:
			case LIKE:
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				keyword();
				}
				break;
			case ARRAY_AGG:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BOOL_AND:
			case BOOL_OR:
			case COUNT:
			case EVERY:
			case JSON_AGG:
			case JSONB_AGG:
			case JSON_OBJECT_AGG:
			case JSONB_OBJECT_AGG:
			case MAX:
			case MIN:
			case STRING_AGG:
			case SUM:
			case XMLAGG:
			case CORR:
			case COVAR_POP:
			case COVAR_SAMP:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_R2:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGE_SYY:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VARIANCE:
			case VAR_POP:
			case VAR_SAMP:
			case GROUPING:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				groupfunctionname();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SelectParser.ALL, 0); }
		public TerminalNode COLLATE() { return getToken(SelectParser.COLLATE, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SelectParser.CURRENT_USER, 0); }
		public TerminalNode TABLE() { return getToken(SelectParser.TABLE, 0); }
		public TerminalNode PLACING() { return getToken(SelectParser.PLACING, 0); }
		public TerminalNode AND() { return getToken(SelectParser.AND, 0); }
		public TerminalNode WINDOW() { return getToken(SelectParser.WINDOW, 0); }
		public TerminalNode SOME() { return getToken(SelectParser.SOME, 0); }
		public TerminalNode TRAILING() { return getToken(SelectParser.TRAILING, 0); }
		public TerminalNode THEN() { return getToken(SelectParser.THEN, 0); }
		public TerminalNode INTO() { return getToken(SelectParser.INTO, 0); }
		public TerminalNode GRANT() { return getToken(SelectParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SelectParser.GROUP, 0); }
		public TerminalNode CASE() { return getToken(SelectParser.CASE, 0); }
		public TerminalNode UNIQUE() { return getToken(SelectParser.UNIQUE, 0); }
		public TerminalNode DEFERRABLE() { return getToken(SelectParser.DEFERRABLE, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SelectParser.CURRENT_DATE, 0); }
		public TerminalNode DESC() { return getToken(SelectParser.DESC, 0); }
		public TerminalNode OFFSET() { return getToken(SelectParser.OFFSET, 0); }
		public TerminalNode OR() { return getToken(SelectParser.OR, 0); }
		public TerminalNode CURRENT_CATALOG() { return getToken(SelectParser.CURRENT_CATALOG, 0); }
		public TerminalNode CAST() { return getToken(SelectParser.CAST, 0); }
		public TerminalNode ANALYZE() { return getToken(SelectParser.ANALYZE, 0); }
		public TerminalNode REFERENCES() { return getToken(SelectParser.REFERENCES, 0); }
		public TerminalNode CHECK() { return getToken(SelectParser.CHECK, 0); }
		public TerminalNode AS() { return getToken(SelectParser.AS, 0); }
		public TerminalNode LIMIT() { return getToken(SelectParser.LIMIT, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SelectParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode RETURNING() { return getToken(SelectParser.RETURNING, 0); }
		public TerminalNode FROM() { return getToken(SelectParser.FROM, 0); }
		public TerminalNode NOT() { return getToken(SelectParser.NOT, 0); }
		public TerminalNode WHERE() { return getToken(SelectParser.WHERE, 0); }
		public TerminalNode BOTH() { return getToken(SelectParser.BOTH, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SelectParser.LOCALTIMESTAMP, 0); }
		public TerminalNode PRIMARY() { return getToken(SelectParser.PRIMARY, 0); }
		public TerminalNode FOR() { return getToken(SelectParser.FOR, 0); }
		public TerminalNode INTERSECT() { return getToken(SelectParser.INTERSECT, 0); }
		public TerminalNode WHEN() { return getToken(SelectParser.WHEN, 0); }
		public TerminalNode ANALYSE() { return getToken(SelectParser.ANALYSE, 0); }
		public TerminalNode ORDER() { return getToken(SelectParser.ORDER, 0); }
		public TerminalNode ON() { return getToken(SelectParser.ON, 0); }
		public TerminalNode CURRENT_ROLE() { return getToken(SelectParser.CURRENT_ROLE, 0); }
		public TerminalNode INITIALLY() { return getToken(SelectParser.INITIALLY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SelectParser.SYMMETRIC, 0); }
		public TerminalNode LEADING() { return getToken(SelectParser.LEADING, 0); }
		public TerminalNode UNION() { return getToken(SelectParser.UNION, 0); }
		public TerminalNode IN() { return getToken(SelectParser.IN, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SelectParser.CURRENT_TIME, 0); }
		public TerminalNode EXCEPT() { return getToken(SelectParser.EXCEPT, 0); }
		public TerminalNode VARIADIC() { return getToken(SelectParser.VARIADIC, 0); }
		public TerminalNode END() { return getToken(SelectParser.END, 0); }
		public TerminalNode NULL() { return getToken(SelectParser.NULL, 0); }
		public TerminalNode USING() { return getToken(SelectParser.USING, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SelectParser.CONSTRAINT, 0); }
		public TerminalNode DEFAULT() { return getToken(SelectParser.DEFAULT, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SelectParser.ASYMMETRIC, 0); }
		public TerminalNode USER() { return getToken(SelectParser.USER, 0); }
		public TerminalNode DISTINCT() { return getToken(SelectParser.DISTINCT, 0); }
		public TerminalNode ANY() { return getToken(SelectParser.ANY, 0); }
		public TerminalNode HAVING() { return getToken(SelectParser.HAVING, 0); }
		public TerminalNode LATERAL() { return getToken(SelectParser.LATERAL, 0); }
		public TerminalNode FETCH() { return getToken(SelectParser.FETCH, 0); }
		public TerminalNode DO() { return getToken(SelectParser.DO, 0); }
		public TerminalNode LOCALTIME() { return getToken(SelectParser.LOCALTIME, 0); }
		public TerminalNode ARRAY() { return getToken(SelectParser.ARRAY, 0); }
		public TerminalNode ELSE() { return getToken(SelectParser.ELSE, 0); }
		public TerminalNode FOREIGN() { return getToken(SelectParser.FOREIGN, 0); }
		public TerminalNode TO() { return getToken(SelectParser.TO, 0); }
		public TerminalNode ONLY() { return getToken(SelectParser.ONLY, 0); }
		public TerminalNode WITH() { return getToken(SelectParser.WITH, 0); }
		public TerminalNode SELECT() { return getToken(SelectParser.SELECT, 0); }
		public TerminalNode CREATE() { return getToken(SelectParser.CREATE, 0); }
		public TerminalNode FALSE() { return getToken(SelectParser.FALSE, 0); }
		public TerminalNode ASC() { return getToken(SelectParser.ASC, 0); }
		public TerminalNode TRUE() { return getToken(SelectParser.TRUE, 0); }
		public TerminalNode COLUMN() { return getToken(SelectParser.COLUMN, 0); }
		public TerminalNode SESSION_USER() { return getToken(SelectParser.SESSION_USER, 0); }
		public TerminalNode IS() { return getToken(SelectParser.IS, 0); }
		public TerminalNode BY() { return getToken(SelectParser.BY, 0); }
		public TerminalNode INSERT() { return getToken(SelectParser.INSERT, 0); }
		public TerminalNode LEFT() { return getToken(SelectParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SelectParser.RIGHT, 0); }
		public TerminalNode JOIN() { return getToken(SelectParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(SelectParser.OUTER, 0); }
		public TerminalNode INNER() { return getToken(SelectParser.INNER, 0); }
		public TerminalNode FULL() { return getToken(SelectParser.FULL, 0); }
		public TerminalNode SETS() { return getToken(SelectParser.SETS, 0); }
		public TerminalNode CUBE() { return getToken(SelectParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SelectParser.ROLLUP, 0); }
		public TerminalNode EXTRACT() { return getToken(SelectParser.EXTRACT, 0); }
		public TerminalNode LIKE() { return getToken(SelectParser.LIKE, 0); }
		public TerminalNode BETWEEN() { return getToken(SelectParser.BETWEEN, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -1L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -288230376147517441L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupfunctionnameContext extends ParserRuleContext {
		public TerminalNode ARRAY_AGG() { return getToken(SelectParser.ARRAY_AGG, 0); }
		public TerminalNode AVG() { return getToken(SelectParser.AVG, 0); }
		public TerminalNode BIT_AND() { return getToken(SelectParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(SelectParser.BIT_OR, 0); }
		public TerminalNode BOOL_AND() { return getToken(SelectParser.BOOL_AND, 0); }
		public TerminalNode BOOL_OR() { return getToken(SelectParser.BOOL_OR, 0); }
		public TerminalNode COUNT() { return getToken(SelectParser.COUNT, 0); }
		public TerminalNode EVERY() { return getToken(SelectParser.EVERY, 0); }
		public TerminalNode JSON_AGG() { return getToken(SelectParser.JSON_AGG, 0); }
		public TerminalNode JSONB_AGG() { return getToken(SelectParser.JSONB_AGG, 0); }
		public TerminalNode JSON_OBJECT_AGG() { return getToken(SelectParser.JSON_OBJECT_AGG, 0); }
		public TerminalNode JSONB_OBJECT_AGG() { return getToken(SelectParser.JSONB_OBJECT_AGG, 0); }
		public TerminalNode MAX() { return getToken(SelectParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SelectParser.MIN, 0); }
		public TerminalNode STRING_AGG() { return getToken(SelectParser.STRING_AGG, 0); }
		public TerminalNode SUM() { return getToken(SelectParser.SUM, 0); }
		public TerminalNode XMLAGG() { return getToken(SelectParser.XMLAGG, 0); }
		public TerminalNode CORR() { return getToken(SelectParser.CORR, 0); }
		public TerminalNode COVAR_POP() { return getToken(SelectParser.COVAR_POP, 0); }
		public TerminalNode COVAR_SAMP() { return getToken(SelectParser.COVAR_SAMP, 0); }
		public TerminalNode REGR_AVGX() { return getToken(SelectParser.REGR_AVGX, 0); }
		public TerminalNode REGR_AVGY() { return getToken(SelectParser.REGR_AVGY, 0); }
		public TerminalNode REGR_COUNT() { return getToken(SelectParser.REGR_COUNT, 0); }
		public TerminalNode REGR_R2() { return getToken(SelectParser.REGR_R2, 0); }
		public TerminalNode REGR_SLOPE() { return getToken(SelectParser.REGR_SLOPE, 0); }
		public TerminalNode REGR_SXX() { return getToken(SelectParser.REGR_SXX, 0); }
		public TerminalNode REGR_SXY() { return getToken(SelectParser.REGR_SXY, 0); }
		public TerminalNode REGE_SYY() { return getToken(SelectParser.REGE_SYY, 0); }
		public TerminalNode STDDEV() { return getToken(SelectParser.STDDEV, 0); }
		public TerminalNode STDDEV_POP() { return getToken(SelectParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(SelectParser.STDDEV_SAMP, 0); }
		public TerminalNode VARIANCE() { return getToken(SelectParser.VARIANCE, 0); }
		public TerminalNode VAR_POP() { return getToken(SelectParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(SelectParser.VAR_SAMP, 0); }
		public TerminalNode GROUPING() { return getToken(SelectParser.GROUPING, 0); }
		public GroupfunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupfunctionname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterGroupfunctionname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitGroupfunctionname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitGroupfunctionname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupfunctionnameContext groupfunctionname() throws RecognitionException {
		GroupfunctionnameContext _localctx = new GroupfunctionnameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_groupfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 34359738367L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode Value() { return getToken(SelectParser.Value, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		return values(0);
	}

	private ValuesContext values(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValuesContext _localctx = new ValuesContext(_ctx, _parentState);
		ValuesContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_values, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(299);
			match(Value);
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValuesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_values);
					setState(301);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(302);
					match(COMMA);
					setState(303);
					values(3);
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TabledotfieldContext extends ParserRuleContext {
		public NameoraliasContext nameoralias() {
			return getRuleContext(NameoraliasContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SelectParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SR() { return getToken(SelectParser.SR, 0); }
		public TabledotfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabledotfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterTabledotfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitTabledotfield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitTabledotfield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabledotfieldContext tabledotfield() throws RecognitionException {
		TabledotfieldContext _localctx = new TabledotfieldContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tabledotfield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			nameoralias();
			setState(310);
			match(DOT);
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case ANALYSE:
			case ANALYZE:
			case AND:
			case ANY:
			case ARRAY:
			case AS:
			case ASC:
			case ASYMMETRIC:
			case BOTH:
			case CASE:
			case CAST:
			case CHECK:
			case COLLATE:
			case COLUMN:
			case CONSTRAINT:
			case CREATE:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DEFAULT:
			case DEFERRABLE:
			case DESC:
			case DISTINCT:
			case DO:
			case ELSE:
			case END:
			case EXCEPT:
			case FALSE:
			case FETCH:
			case FOR:
			case FOREIGN:
			case FROM:
			case GRANT:
			case GROUP:
			case HAVING:
			case IN:
			case INITIALLY:
			case INTERSECT:
			case INTO:
			case LATERAL:
			case LEADING:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case NOT:
			case NULL:
			case OFFSET:
			case ON:
			case ONLY:
			case OR:
			case ORDER:
			case PLACING:
			case PRIMARY:
			case REFERENCES:
			case RETURNING:
			case SELECT:
			case SESSION_USER:
			case SOME:
			case SYMMETRIC:
			case TABLE:
			case THEN:
			case TO:
			case TRAILING:
			case TRUE:
			case UNION:
			case UNIQUE:
			case USER:
			case USING:
			case VARIADIC:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case IS:
			case BY:
			case INSERT:
			case LEFT:
			case RIGHT:
			case JOIN:
			case OUTER:
			case INNER:
			case FULL:
			case ARRAY_AGG:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BOOL_AND:
			case BOOL_OR:
			case COUNT:
			case EVERY:
			case JSON_AGG:
			case JSONB_AGG:
			case JSON_OBJECT_AGG:
			case JSONB_OBJECT_AGG:
			case MAX:
			case MIN:
			case STRING_AGG:
			case SUM:
			case XMLAGG:
			case CORR:
			case COVAR_POP:
			case COVAR_SAMP:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_R2:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGE_SYY:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VARIANCE:
			case VAR_POP:
			case VAR_SAMP:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case EXTRACT:
			case LIKE:
			case BETWEEN:
			case WORDS:
				{
				setState(311);
				name();
				}
				break;
			case SR:
				{
				setState(312);
				match(SR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SelectParser.EQ, 0); }
		public TerminalNode IS() { return getToken(SelectParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SelectParser.NOT, 0); }
		public TerminalNode GT() { return getToken(SelectParser.GT, 0); }
		public TerminalNode LT() { return getToken(SelectParser.LT, 0); }
		public TerminalNode GE() { return getToken(SelectParser.GE, 0); }
		public TerminalNode LE() { return getToken(SelectParser.LE, 0); }
		public TerminalNode BI() { return getToken(SelectParser.BI, 0); }
		public TerminalNode NE() { return getToken(SelectParser.NE, 0); }
		public RelatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterRelator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitRelator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitRelator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelatorContext relator() throws RecognitionException {
		RelatorContext _localctx = new RelatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relator);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(EQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(IS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(317);
				match(IS);
				setState(318);
				match(NOT);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(GT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(LT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				match(GE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(322);
				match(LE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(323);
				match(BI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(324);
				match(NE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SelectParser.AND, 0); }
		public TerminalNode OR() { return getToken(SelectParser.OR, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return queryfields_sempred((QueryfieldsContext)_localctx, predIndex);
		case 4:
			return where_sempred((WhereContext)_localctx, predIndex);
		case 5:
			return orderbyfields_sempred((OrderbyfieldsContext)_localctx, predIndex);
		case 6:
			return groupbyfields_sempred((GroupbyfieldsContext)_localctx, predIndex);
		case 12:
			return compute_sempred((ComputeContext)_localctx, predIndex);
		case 15:
			return tables_sempred((TablesContext)_localctx, predIndex);
		case 16:
			return fields_sempred((FieldsContext)_localctx, predIndex);
		case 25:
			return values_sempred((ValuesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryfields_sempred(QueryfieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean where_sempred(WhereContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean orderbyfields_sempred(OrderbyfieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean groupbyfields_sempred(GroupbyfieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean compute_sempred(ComputeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean tables_sempred(TablesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean fields_sempred(FieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean values_sempred(ValuesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00a3\u014b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000G\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000L\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000P\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000U\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000[\b\u0000\u0003\u0000"+
		"]\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001a\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001e\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001q\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002y\b\u0002\n\u0002\f\u0002|\t"+
		"\u0002\u0001\u0003\u0003\u0003\u007f\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0083\b\u0003\u0001\u0003\u0003\u0003\u0086\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u008e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u0094\b\u0004\n\u0004\f\u0004\u0097\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u009c\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00a1\b\u0005\n\u0005\f\u0005\u00a4\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ac\b\u0006"+
		"\n\u0006\f\u0006\u00af\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00b3"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00ba"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\t\u00c5\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d3\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d9\b\u000b\n\u000b"+
		"\f\u000b\u00dc\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e8\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00ed\b\f\n\f\f\f\u00f0\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00f5\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u00f9\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0101\b\u000f\n\u000f\f\u000f\u0104\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u010c\b\u0010"+
		"\n\u0010\f\u0010\u010f\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0118\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0125"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0131"+
		"\b\u0019\n\u0019\f\u0019\u0134\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u013a\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0147\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u00da\b\u0004\b\n\f\u0018\u001e 2\u001d\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468\u0000\u0006\u0002\u0000QRVV\u0002\u0000\b\b\u001a\u001a"+
		"\u0003\u0000\u0083\u0084\u008d\u008d\u0099\u009d\u0002\u0000\u0001V{\u0080"+
		"\u0001\u0000Xz\u0002\u0000\u0004\u000466\u0160\u0000:\u0001\u0000\u0000"+
		"\u0000\u0002d\u0001\u0000\u0000\u0000\u0004r\u0001\u0000\u0000\u0000\u0006"+
		"~\u0001\u0000\u0000\u0000\b\u008d\u0001\u0000\u0000\u0000\n\u0098\u0001"+
		"\u0000\u0000\u0000\f\u00a5\u0001\u0000\u0000\u0000\u000e\u00b0\u0001\u0000"+
		"\u0000\u0000\u0010\u00b7\u0001\u0000\u0000\u0000\u0012\u00c2\u0001\u0000"+
		"\u0000\u0000\u0014\u00d2\u0001\u0000\u0000\u0000\u0016\u00d4\u0001\u0000"+
		"\u0000\u0000\u0018\u00e7\u0001\u0000\u0000\u0000\u001a\u00f4\u0001\u0000"+
		"\u0000\u0000\u001c\u00f8\u0001\u0000\u0000\u0000\u001e\u00fa\u0001\u0000"+
		"\u0000\u0000 \u0105\u0001\u0000\u0000\u0000\"\u0117\u0001\u0000\u0000"+
		"\u0000$\u0119\u0001\u0000\u0000\u0000&\u011b\u0001\u0000\u0000\u0000("+
		"\u011d\u0001\u0000\u0000\u0000*\u011f\u0001\u0000\u0000\u0000,\u0124\u0001"+
		"\u0000\u0000\u0000.\u0126\u0001\u0000\u0000\u00000\u0128\u0001\u0000\u0000"+
		"\u00002\u012a\u0001\u0000\u0000\u00004\u0135\u0001\u0000\u0000\u00006"+
		"\u0146\u0001\u0000\u0000\u00008\u0148\u0001\u0000\u0000\u0000:;\u0005"+
		"<\u0000\u0000;<\u0003\u0004\u0002\u0000<=\u0005$\u0000\u0000=A\u0003\u001e"+
		"\u000f\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000@C\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BF\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005K\u0000\u0000"+
		"EG\u0003\b\u0004\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GK\u0001\u0000\u0000\u0000HI\u0005&\u0000\u0000IJ\u0005O\u0000\u0000J"+
		"L\u0003\f\u0006\u0000KH\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MN\u0005\'\u0000\u0000NP\u0003\b\u0004\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PT\u0001\u0000\u0000"+
		"\u0000QR\u00057\u0000\u0000RS\u0005O\u0000\u0000SU\u0003\n\u0005\u0000"+
		"TQ\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\\\u0001\u0000\u0000"+
		"\u0000VW\u0005.\u0000\u0000WZ\u0005\u009e\u0000\u0000XY\u0005\u0082\u0000"+
		"\u0000Y[\u0005\u009e\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[]\u0001\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]\u0001\u0001\u0000\u0000\u0000^`\u0007\u0000\u0000"+
		"\u0000_a\u0005T\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ae\u0001\u0000\u0000\u0000be\u0005U\u0000\u0000ce\u0005W\u0000\u0000"+
		"d^\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fg\u0005S\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hp\u0003\u001c\u000e\u0000ij\u00054\u0000\u0000jq\u0003\b\u0004"+
		"\u0000kl\u0005H\u0000\u0000lm\u0005\u0096\u0000\u0000mn\u0003 \u0010\u0000"+
		"no\u0005\u0097\u0000\u0000oq\u0001\u0000\u0000\u0000pi\u0001\u0000\u0000"+
		"\u0000pk\u0001\u0000\u0000\u0000q\u0003\u0001\u0000\u0000\u0000rs\u0006"+
		"\u0002\uffff\uffff\u0000st\u0003\u0006\u0003\u0000tz\u0001\u0000\u0000"+
		"\u0000uv\n\u0002\u0000\u0000vw\u0005\u0082\u0000\u0000wy\u0003\u0004\u0002"+
		"\u0003xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0005\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}\u007f\u0005\u001b\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0085\u0003\u0018\f\u0000\u0081\u0083\u0005\u0007\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0003(\u0014\u0000\u0085"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0007\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u0004\uffff\uffff\u0000"+
		"\u0088\u0089\u0005\u0096\u0000\u0000\u0089\u008a\u0003\b\u0004\u0000\u008a"+
		"\u008b\u0005\u0097\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0003\u0014\n\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u0095\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\n\u0003\u0000\u0000\u0090\u0091\u00038\u001c\u0000\u0091\u0092\u0003"+
		"\b\u0004\u0004\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\t\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0006\u0005\uffff"+
		"\uffff\u0000\u0099\u009b\u0003\u001a\r\u0000\u009a\u009c\u0007\u0001\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u00a2\u0001\u0000\u0000\u0000\u009d\u009e\n\u0002\u0000\u0000"+
		"\u009e\u009f\u0005\u0082\u0000\u0000\u009f\u00a1\u0003\n\u0005\u0003\u00a0"+
		"\u009d\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u000b\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0006\u0006\uffff\uffff\u0000\u00a6\u00a7\u0003\u0018\f\u0000\u00a7"+
		"\u00ad\u0001\u0000\u0000\u0000\u00a8\u00a9\n\u0002\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0082\u0000\u0000\u00aa\u00ac\u0003\f\u0006\u0003\u00ab\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\r\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\u0018"+
		"\f\u0000\u00b1\u00b3\u00051\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u007f\u0000\u0000\u00b5\u00b6\u0005\u009e\u0000"+
		"\u0000\u00b6\u000f\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\u0018\f\u0000"+
		"\u00b8\u00ba\u00051\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\u0080\u0000\u0000\u00bc\u00bd\u0005\u0096\u0000\u0000\u00bd"+
		"\u00be\u0003\u0018\f\u0000\u00be\u00bf\u0005\u0004\u0000\u0000\u00bf\u00c0"+
		"\u0003\u0018\f\u0000\u00c0\u00c1\u0005\u0097\u0000\u0000\u00c1\u0011\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0003\u0018\f\u0000\u00c3\u00c5\u00051"+
		"\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005(\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0096\u0000\u0000\u00c8\u00c9\u00032\u0019\u0000"+
		"\u00c9\u00ca\u0005\u0097\u0000\u0000\u00ca\u0013\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0003\u0018\f\u0000\u00cc\u00cd\u00036\u001b\u0000\u00cd"+
		"\u00ce\u0003\u0018\f\u0000\u00ce\u00d3\u0001\u0000\u0000\u0000\u00cf\u00d3"+
		"\u0003\u0012\t\u0000\u00d0\u00d3\u0003\u0010\b\u0000\u00d1\u00d3\u0003"+
		"\u000e\u0007\u0000\u00d2\u00cb\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u0015\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003"+
		",\u0016\u0000\u00d5\u00da\u0005\u0096\u0000\u0000\u00d6\u00d9\u0003\u0018"+
		"\f\u0000\u00d7\u00d9\t\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005\u0097\u0000\u0000\u00de\u0017\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0006\f\uffff\uffff\u0000\u00e0\u00e8\u0003\u0016\u000b"+
		"\u0000\u00e1\u00e8\u0005\u009e\u0000\u0000\u00e2\u00e8\u0003\u001a\r\u0000"+
		"\u00e3\u00e4\u0005\u0096\u0000\u0000\u00e4\u00e5\u0003\u0018\f\u0000\u00e5"+
		"\u00e6\u0005\u0097\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7"+
		"\u00df\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ee\u0001\u0000\u0000\u0000\u00e9\u00ea\n\u0005\u0000\u0000\u00ea\u00eb"+
		"\u0007\u0002\u0000\u0000\u00eb\u00ed\u0003\u0018\f\u0006\u00ec\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u0019\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f5\u0003"+
		"4\u001a\u0000\u00f2\u00f5\u0003&\u0013\u0000\u00f3\u00f5\u0005\u0084\u0000"+
		"\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u001b\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f9\u0003\"\u0011\u0000\u00f7\u00f9\u0003$\u0012\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u001d\u0001\u0000\u0000\u0000\u00fa\u00fb\u0006\u000f\uffff\uffff"+
		"\u0000\u00fb\u00fc\u0003\u001c\u000e\u0000\u00fc\u0102\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\n\u0002\u0000\u0000\u00fe\u00ff\u0005\u0082\u0000\u0000"+
		"\u00ff\u0101\u0003\u001e\u000f\u0003\u0100\u00fd\u0001\u0000\u0000\u0000"+
		"\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u001f\u0001\u0000\u0000\u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0006\u0010\uffff\uffff"+
		"\u0000\u0106\u0107\u0003\u001a\r\u0000\u0107\u010d\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\n\u0002\u0000\u0000\u0109\u010a\u0005\u0082\u0000\u0000\u010a"+
		"\u010c\u0003 \u0010\u0003\u010b\u0108\u0001\u0000\u0000\u0000\u010c\u010f"+
		"\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e!\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0003$\u0012\u0000\u0111\u0112\u0005\u0007"+
		"\u0000\u0000\u0112\u0113\u0003(\u0014\u0000\u0113\u0118\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0003$\u0012\u0000\u0115\u0116\u0003(\u0014\u0000\u0116"+
		"\u0118\u0001\u0000\u0000\u0000\u0117\u0110\u0001\u0000\u0000\u0000\u0117"+
		"\u0114\u0001\u0000\u0000\u0000\u0118#\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0003&\u0013\u0000\u011a%\u0001\u0000\u0000\u0000\u011b\u011c\u0003,"+
		"\u0016\u0000\u011c\'\u0001\u0000\u0000\u0000\u011d\u011e\u0003,\u0016"+
		"\u0000\u011e)\u0001\u0000\u0000\u0000\u011f\u0120\u0003,\u0016\u0000\u0120"+
		"+\u0001\u0000\u0000\u0000\u0121\u0125\u0005\u009f\u0000\u0000\u0122\u0125"+
		"\u0003.\u0017\u0000\u0123\u0125\u00030\u0018\u0000\u0124\u0121\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000"+
		"\u0000\u0000\u0125-\u0001\u0000\u0000\u0000\u0126\u0127\u0007\u0003\u0000"+
		"\u0000\u0127/\u0001\u0000\u0000\u0000\u0128\u0129\u0007\u0004\u0000\u0000"+
		"\u01291\u0001\u0000\u0000\u0000\u012a\u012b\u0006\u0019\uffff\uffff\u0000"+
		"\u012b\u012c\u0005\u009e\u0000\u0000\u012c\u0132\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\n\u0002\u0000\u0000\u012e\u012f\u0005\u0082\u0000\u0000\u012f"+
		"\u0131\u00032\u0019\u0003\u0130\u012d\u0001\u0000\u0000\u0000\u0131\u0134"+
		"\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0001\u0000\u0000\u0000\u01333\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0003*\u0015\u0000\u0136\u0139\u0005\u008c"+
		"\u0000\u0000\u0137\u013a\u0003&\u0013\u0000\u0138\u013a\u0005\u0084\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000"+
		"\u0000\u013a5\u0001\u0000\u0000\u0000\u013b\u0147\u0005\u0085\u0000\u0000"+
		"\u013c\u0147\u0005N\u0000\u0000\u013d\u013e\u0005N\u0000\u0000\u013e\u0147"+
		"\u00051\u0000\u0000\u013f\u0147\u0005\u0086\u0000\u0000\u0140\u0147\u0005"+
		"\u0087\u0000\u0000\u0141\u0147\u0005\u0088\u0000\u0000\u0142\u0147\u0005"+
		"\u0089\u0000\u0000\u0143\u0147\u0005\u008b\u0000\u0000\u0144\u0147\u0005"+
		"\u008a\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u013b\u0001"+
		"\u0000\u0000\u0000\u0146\u013c\u0001\u0000\u0000\u0000\u0146\u013d\u0001"+
		"\u0000\u0000\u0000\u0146\u013f\u0001\u0000\u0000\u0000\u0146\u0140\u0001"+
		"\u0000\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0146\u0142\u0001"+
		"\u0000\u0000\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u01477\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0007\u0005\u0000\u0000\u01499\u0001\u0000\u0000"+
		"\u0000$AFKOTZ\\`dpz~\u0082\u0085\u008d\u0095\u009b\u00a2\u00ad\u00b2\u00b9"+
		"\u00c4\u00d2\u00d8\u00da\u00e7\u00ee\u00f4\u00f8\u0102\u010d\u0117\u0124"+
		"\u0132\u0139\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}