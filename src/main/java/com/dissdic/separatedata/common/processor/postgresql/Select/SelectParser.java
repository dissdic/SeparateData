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
		T__0=1, T__1=2, ALL=3, ANALYSE=4, ANALYZE=5, AND=6, ANY=7, ARRAY=8, AS=9, 
		ASC=10, ASYMMETRIC=11, BOTH=12, CASE=13, CAST=14, CHECK=15, COLLATE=16, 
		COLUMN=17, CONSTRAINT=18, CREATE=19, CURRENT_CATALOG=20, CURRENT_DATE=21, 
		CURRENT_ROLE=22, CURRENT_TIME=23, CURRENT_TIMESTAMP=24, CURRENT_USER=25, 
		DEFAULT=26, DEFERRABLE=27, DESC=28, DISTINCT=29, DO=30, ELSE=31, END=32, 
		EXCEPT=33, FALSE=34, FETCH=35, FOR=36, FOREIGN=37, FROM=38, GRANT=39, 
		GROUP=40, HAVING=41, IN=42, INITIALLY=43, INTERSECT=44, INTO=45, LATERAL=46, 
		LEADING=47, LIMIT=48, LOCALTIME=49, LOCALTIMESTAMP=50, NOT=51, NULL=52, 
		OFFSET=53, ON=54, ONLY=55, OR=56, ORDER=57, PLACING=58, PRIMARY=59, REFERENCES=60, 
		RETURNING=61, SELECT=62, SESSION_USER=63, SOME=64, SYMMETRIC=65, TABLE=66, 
		THEN=67, TO=68, TRAILING=69, TRUE=70, UNION=71, UNIQUE=72, USER=73, USING=74, 
		VARIADIC=75, WHEN=76, WHERE=77, WINDOW=78, WITH=79, IS=80, BY=81, INSERT=82, 
		LEFT=83, RIGHT=84, JOIN=85, OUTER=86, INNER=87, FULL=88, ARRAY_AGG=89, 
		AVG=90, BIT_AND=91, BIT_OR=92, BOOL_AND=93, BOOL_OR=94, COUNT=95, EVERY=96, 
		JSON_AGG=97, JSONB_AGG=98, JSON_OBJECT_AGG=99, JSONB_OBJECT_AGG=100, MAX=101, 
		MIN=102, STRING_AGG=103, SUM=104, XMLAGG=105, CORR=106, COVAR_POP=107, 
		COVAR_SAMP=108, REGR_AVGX=109, REGR_AVGY=110, REGR_COUNT=111, REGR_R2=112, 
		REGR_SLOPE=113, REGR_SXX=114, REGR_SXY=115, REGE_SYY=116, STDDEV=117, 
		STDDEV_POP=118, STDDEV_SAMP=119, VARIANCE=120, VAR_POP=121, VAR_SAMP=122, 
		GROUPING=123, SETS=124, CUBE=125, ROLLUP=126, UL=127, COMMA=128, MINUS=129, 
		STAR=130, EQ=131, GT=132, LT=133, GE=134, LE=135, NE=136, BI=137, DOT=138, 
		PLUS=139, ADJACENT=140, OVERLAP=141, INCLUDE=142, INCLUDED=143, STRICTLEFT=144, 
		STRICTRIGHT=145, NOTBEYONDLEFT=146, NOTBEYONDRIGHT=147, Value=148, TABLEORFIELD=149, 
		INT=150, ID=151, WS=152, OTHER=153;
	public static final int
		RULE_select = 0, RULE_join = 1, RULE_fields = 2, RULE_tables = 3, RULE_values = 4, 
		RULE_jointable = 5, RULE_joinwhere = 6, RULE_field = 7, RULE_table = 8, 
		RULE_tablewithalias = 9, RULE_fieldwithalias = 10, RULE_tablewithoutalias = 11, 
		RULE_fieldwithoutalias = 12, RULE_where = 13, RULE_singlewhere = 14, RULE_tabledotfield = 15, 
		RULE_relator = 16, RULE_relation = 17, RULE_name = 18, RULE_alias = 19, 
		RULE_nameoralias = 20, RULE_static = 21, RULE_groupfunctionexpr = 22, 
		RULE_groupingsets = 23, RULE_cube = 24, RULE_rollup = 25, RULE_keyword = 26, 
		RULE_groupfunctionname = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"select", "join", "fields", "tables", "values", "jointable", "joinwhere", 
			"field", "table", "tablewithalias", "fieldwithalias", "tablewithoutalias", 
			"fieldwithoutalias", "where", "singlewhere", "tabledotfield", "relator", 
			"relation", "name", "alias", "nameoralias", "static", "groupfunctionexpr", 
			"groupingsets", "cube", "rollup", "keyword", "groupfunctionname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'_'", "','", "'-'", "'*'", 
			"'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'<>'", "'.'", "'+'", "'-|-'", 
			"'&&'", "'@>'", "'@<'", "'<<'", "'>>'", "'&>'", "'&<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ALL", "ANALYSE", "ANALYZE", "AND", "ANY", "ARRAY", 
			"AS", "ASC", "ASYMMETRIC", "BOTH", "CASE", "CAST", "CHECK", "COLLATE", 
			"COLUMN", "CONSTRAINT", "CREATE", "CURRENT_CATALOG", "CURRENT_DATE", 
			"CURRENT_ROLE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DEFAULT", "DEFERRABLE", "DESC", "DISTINCT", "DO", "ELSE", "END", "EXCEPT", 
			"FALSE", "FETCH", "FOR", "FOREIGN", "FROM", "GRANT", "GROUP", "HAVING", 
			"IN", "INITIALLY", "INTERSECT", "INTO", "LATERAL", "LEADING", "LIMIT", 
			"LOCALTIME", "LOCALTIMESTAMP", "NOT", "NULL", "OFFSET", "ON", "ONLY", 
			"OR", "ORDER", "PLACING", "PRIMARY", "REFERENCES", "RETURNING", "SELECT", 
			"SESSION_USER", "SOME", "SYMMETRIC", "TABLE", "THEN", "TO", "TRAILING", 
			"TRUE", "UNION", "UNIQUE", "USER", "USING", "VARIADIC", "WHEN", "WHERE", 
			"WINDOW", "WITH", "IS", "BY", "INSERT", "LEFT", "RIGHT", "JOIN", "OUTER", 
			"INNER", "FULL", "ARRAY_AGG", "AVG", "BIT_AND", "BIT_OR", "BOOL_AND", 
			"BOOL_OR", "COUNT", "EVERY", "JSON_AGG", "JSONB_AGG", "JSON_OBJECT_AGG", 
			"JSONB_OBJECT_AGG", "MAX", "MIN", "STRING_AGG", "SUM", "XMLAGG", "CORR", 
			"COVAR_POP", "COVAR_SAMP", "REGR_AVGX", "REGR_AVGY", "REGR_COUNT", "REGR_R2", 
			"REGR_SLOPE", "REGR_SXX", "REGR_SXY", "REGE_SYY", "STDDEV", "STDDEV_POP", 
			"STDDEV_SAMP", "VARIANCE", "VAR_POP", "VAR_SAMP", "GROUPING", "SETS", 
			"CUBE", "ROLLUP", "UL", "COMMA", "MINUS", "STAR", "EQ", "GT", "LT", "GE", 
			"LE", "NE", "BI", "DOT", "PLUS", "ADJACENT", "OVERLAP", "INCLUDE", "INCLUDED", 
			"STRICTLEFT", "STRICTRIGHT", "NOTBEYONDLEFT", "NOTBEYONDRIGHT", "Value", 
			"TABLEORFIELD", "INT", "ID", "WS", "OTHER"
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
		public TerminalNode FROM() { return getToken(SelectParser.FROM, 0); }
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public List<FieldsContext> fields() {
			return getRuleContexts(FieldsContext.class);
		}
		public FieldsContext fields(int i) {
			return getRuleContext(FieldsContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SelectParser.STAR, 0); }
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
		public TerminalNode HAVING() { return getToken(SelectParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(SelectParser.ORDER, 0); }
		public TerminalNode ASC() { return getToken(SelectParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SelectParser.DESC, 0); }
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
			setState(56);
			match(SELECT);
			setState(59);
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
			case CUBE:
			case ROLLUP:
			case TABLEORFIELD:
				{
				setState(57);
				fields(0);
				}
				break;
			case STAR:
				{
				setState(58);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(61);
			match(FROM);
			setState(62);
			tables(0);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 51L) != 0) {
				{
				{
				setState(63);
				join();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(69);
				match(WHERE);
				setState(70);
				where(0);
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(73);
				match(GROUP);
				setState(74);
				match(BY);
				setState(75);
				fields(0);
				}
			}

			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(78);
				match(HAVING);
				setState(79);
				where(0);
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(82);
				match(ORDER);
				setState(83);
				match(BY);
				setState(84);
				fields(0);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(85);
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
		public JointableContext jointable() {
			return getRuleContext(JointableContext.class,0);
		}
		public TerminalNode ON() { return getToken(SelectParser.ON, 0); }
		public JoinwhereContext joinwhere() {
			return getRuleContext(JoinwhereContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(SelectParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(SelectParser.INNER, 0); }
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
			case RIGHT:
			case FULL:
				{
				{
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 35L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(91);
					match(OUTER);
					}
				}

				}
				}
				break;
			case INNER:
				{
				setState(94);
				match(INNER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(97);
			match(JOIN);
			}
			setState(99);
			jointable();
			setState(100);
			match(ON);
			setState(101);
			joinwhere();
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
	public static class FieldsContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public GroupfunctionexprContext groupfunctionexpr() {
			return getRuleContext(GroupfunctionexprContext.class,0);
		}
		public CubeContext cube() {
			return getRuleContext(CubeContext.class,0);
		}
		public RollupContext rollup() {
			return getRuleContext(RollupContext.class,0);
		}
		public GroupingsetsContext groupingsets() {
			return getRuleContext(GroupingsetsContext.class,0);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_fields, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(104);
				field();
				}
				break;
			case 2:
				{
				setState(105);
				groupfunctionexpr();
				}
				break;
			case 3:
				{
				setState(106);
				cube();
				}
				break;
			case 4:
				{
				setState(107);
				rollup();
				}
				break;
			case 5:
				{
				setState(108);
				groupingsets();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fields);
					setState(111);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(112);
					match(COMMA);
					setState(113);
					fields(7);
					}
					} 
				}
				setState(118);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_tables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			table();
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TablesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tables);
					setState(122);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(123);
					match(COMMA);
					setState(124);
					tables(3);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_values, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			match(Value);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValuesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_values);
					setState(133);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(134);
					match(COMMA);
					setState(135);
					values(3);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class JointableContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public JointableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jointable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterJointable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitJointable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitJointable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JointableContext jointable() throws RecognitionException {
		JointableContext _localctx = new JointableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jointable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			table();
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
	public static class JoinwhereContext extends ParserRuleContext {
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public JoinwhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinwhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterJoinwhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitJoinwhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitJoinwhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinwhereContext joinwhere() throws RecognitionException {
		JoinwhereContext _localctx = new JoinwhereContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_joinwhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			where(0);
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
	public static class FieldContext extends ParserRuleContext {
		public FieldwithaliasContext fieldwithalias() {
			return getRuleContext(FieldwithaliasContext.class,0);
		}
		public FieldwithoutaliasContext fieldwithoutalias() {
			return getRuleContext(FieldwithoutaliasContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_field);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				fieldwithalias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				fieldwithoutalias();
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
		enterRule(_localctx, 16, RULE_table);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				tablewithalias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
		enterRule(_localctx, 18, RULE_tablewithalias);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				tablewithoutalias();
				setState(154);
				match(AS);
				setState(155);
				alias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				tablewithoutalias();
				setState(158);
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
	public static class FieldwithaliasContext extends ParserRuleContext {
		public FieldwithoutaliasContext fieldwithoutalias() {
			return getRuleContext(FieldwithoutaliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SelectParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public FieldwithaliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldwithalias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterFieldwithalias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitFieldwithalias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitFieldwithalias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldwithaliasContext fieldwithalias() throws RecognitionException {
		FieldwithaliasContext _localctx = new FieldwithaliasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldwithalias);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				fieldwithoutalias();
				setState(163);
				match(AS);
				setState(164);
				alias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				fieldwithoutalias();
				setState(167);
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
		enterRule(_localctx, 22, RULE_tablewithoutalias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
	public static class FieldwithoutaliasContext extends ParserRuleContext {
		public TabledotfieldContext tabledotfield() {
			return getRuleContext(TabledotfieldContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldwithoutaliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldwithoutalias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterFieldwithoutalias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitFieldwithoutalias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitFieldwithoutalias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldwithoutaliasContext fieldwithoutalias() throws RecognitionException {
		FieldwithoutaliasContext _localctx = new FieldwithoutaliasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldwithoutalias);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				tabledotfield();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				name();
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
	public static class WhereContext extends ParserRuleContext {
		public List<WhereContext> where() {
			return getRuleContexts(WhereContext.class);
		}
		public WhereContext where(int i) {
			return getRuleContext(WhereContext.class,i);
		}
		public SinglewhereContext singlewhere() {
			return getRuleContext(SinglewhereContext.class,0);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_where, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(178);
				match(T__0);
				setState(179);
				where(0);
				setState(180);
				match(T__1);
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
			case TABLEORFIELD:
				{
				setState(182);
				singlewhere();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WhereContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_where);
					setState(185);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(186);
					relation();
					setState(187);
					where(4);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class SinglewhereContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode IN() { return getToken(SelectParser.IN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public RelatorContext relator() {
			return getRuleContext(RelatorContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SelectParser.NOT, 0); }
		public TerminalNode Value() { return getToken(SelectParser.Value, 0); }
		public FieldwithoutaliasContext fieldwithoutalias() {
			return getRuleContext(FieldwithoutaliasContext.class,0);
		}
		public SinglewhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlewhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterSinglewhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitSinglewhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitSinglewhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglewhereContext singlewhere() throws RecognitionException {
		SinglewhereContext _localctx = new SinglewhereContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_singlewhere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			field();
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
			case EQ:
			case GT:
			case LT:
			case GE:
			case LE:
			case NE:
			case BI:
				{
				{
				setState(195);
				relator();
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Value:
					{
					setState(196);
					match(Value);
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
				case TABLEORFIELD:
					{
					setState(197);
					fieldwithoutalias();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case IN:
			case NOT:
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(200);
					match(NOT);
					}
				}

				setState(203);
				match(IN);
				setState(204);
				match(T__0);
				setState(205);
				values(0);
				setState(206);
				match(T__1);
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
	public static class TabledotfieldContext extends ParserRuleContext {
		public NameoraliasContext nameoralias() {
			return getRuleContext(NameoraliasContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SelectParser.DOT, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_tabledotfield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			nameoralias();
			setState(211);
			match(DOT);
			setState(212);
			field();
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
		enterRule(_localctx, 32, RULE_relator);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(EQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(IS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(216);
				match(IS);
				setState(217);
				match(NOT);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(GT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(LT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				match(GE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				match(LE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				match(BI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(223);
				match(NE);
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
		enterRule(_localctx, 34, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 36, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 38, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 40, RULE_nameoralias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		public TerminalNode TABLEORFIELD() { return getToken(SelectParser.TABLEORFIELD, 0); }
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
		enterRule(_localctx, 42, RULE_static);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLEORFIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(TABLEORFIELD);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
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
				setState(236);
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
	public static class GroupfunctionexprContext extends ParserRuleContext {
		public GroupfunctionnameContext groupfunctionname() {
			return getRuleContext(GroupfunctionnameContext.class,0);
		}
		public GroupfunctionexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupfunctionexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterGroupfunctionexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitGroupfunctionexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitGroupfunctionexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupfunctionexprContext groupfunctionexpr() throws RecognitionException {
		GroupfunctionexprContext _localctx = new GroupfunctionexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_groupfunctionexpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			groupfunctionname();
			setState(240);
			match(T__0);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(241);
					matchWildcard();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(247);
			match(T__1);
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
	public static class GroupingsetsContext extends ParserRuleContext {
		public TerminalNode GROUPING() { return getToken(SelectParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SelectParser.SETS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SelectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SelectParser.COMMA, i);
		}
		public GroupingsetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingsets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterGroupingsets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitGroupingsets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitGroupingsets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingsetsContext groupingsets() throws RecognitionException {
		GroupingsetsContext _localctx = new GroupingsetsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_groupingsets);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(GROUPING);
			setState(250);
			match(SETS);
			setState(251);
			match(T__0);
			setState(252);
			match(T__0);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(253);
					matchWildcard();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(259);
			match(T__1);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				match(T__0);
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(262);
						matchWildcard();
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(268);
				match(T__1);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(T__1);
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
	public static class CubeContext extends ParserRuleContext {
		public TerminalNode CUBE() { return getToken(SelectParser.CUBE, 0); }
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public CubeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cube; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CubeContext cube() throws RecognitionException {
		CubeContext _localctx = new CubeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cube);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(CUBE);
			setState(277);
			match(T__0);
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(278);
						matchWildcard();
						}
						} 
					}
					setState(283);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(284);
				match(COMMA);
				}
				break;
			}
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(287);
					matchWildcard();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(293);
			match(T__1);
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
	public static class RollupContext extends ParserRuleContext {
		public TerminalNode ROLLUP() { return getToken(SelectParser.ROLLUP, 0); }
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public RollupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectListener ) ((SelectListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectVisitor ) return ((SelectVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollupContext rollup() throws RecognitionException {
		RollupContext _localctx = new RollupContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rollup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ROLLUP);
			setState(296);
			match(T__0);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(297);
						matchWildcard();
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(303);
				match(COMMA);
				}
				break;
			}
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(306);
					matchWildcard();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(312);
			match(T__1);
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
		enterRule(_localctx, 52, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -8L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 33554431L) != 0) ) {
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
		enterRule(_localctx, 54, RULE_groupfunctionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 34359738367L) != 0) ) {
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
			return fields_sempred((FieldsContext)_localctx, predIndex);
		case 3:
			return tables_sempred((TablesContext)_localctx, predIndex);
		case 4:
			return values_sempred((ValuesContext)_localctx, predIndex);
		case 13:
			return where_sempred((WhereContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fields_sempred(FieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean tables_sempred(TablesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean values_sempred(ValuesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean where_sempred(WhereContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0099\u013f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000<\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000A\b\u0000\n\u0000\f\u0000D\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000H\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000M\b\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000Q\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000W\b\u0000\u0003\u0000Y\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"]\b\u0001\u0001\u0001\u0003\u0001`\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002s\b\u0002\n\u0002\f\u0002v\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003~\b\u0003\n\u0003\f\u0003\u0081\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u0089\b\u0004\n\u0004\f\u0004\u008c\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0094\b\u0007\u0001"+
		"\b\u0001\b\u0003\b\u0098\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00a1\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00aa\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f\u00b0\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b8"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00be\b\r\n\r\f\r\u00c1\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c7\b"+
		"\u000e\u0001\u000e\u0003\u000e\u00ca\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d1\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00e1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00ee\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u00f3\b\u0016\n\u0016\f\u0016\u00f6\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00ff\b\u0017\n\u0017\f\u0017\u0102\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0108\b\u0017\n\u0017\f\u0017"+
		"\u010b\t\u0017\u0001\u0017\u0005\u0017\u010e\b\u0017\n\u0017\f\u0017\u0111"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0118\b\u0018\n\u0018\f\u0018\u011b\t\u0018\u0001\u0018\u0003\u0018"+
		"\u011e\b\u0018\u0001\u0018\u0005\u0018\u0121\b\u0018\n\u0018\f\u0018\u0124"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u012b\b\u0019\n\u0019\f\u0019\u012e\t\u0019\u0001\u0019\u0003\u0019"+
		"\u0131\b\u0019\u0001\u0019\u0005\u0019\u0134\b\u0019\n\u0019\f\u0019\u0137"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0007\u00f4\u0100\u0109\u0119\u0122\u012c\u0135\u0004"+
		"\u0004\u0006\b\u001a\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0005\u0002\u0000"+
		"\n\n\u001c\u001c\u0002\u0000STXX\u0002\u0000\u0006\u000688\u0001\u0000"+
		"\u0003X\u0001\u0000Y{\u0150\u00008\u0001\u0000\u0000\u0000\u0002_\u0001"+
		"\u0000\u0000\u0000\u0004m\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000"+
		"\u0000\b\u0082\u0001\u0000\u0000\u0000\n\u008d\u0001\u0000\u0000\u0000"+
		"\f\u008f\u0001\u0000\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010"+
		"\u0097\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000\u0000\u0000\u0014"+
		"\u00a9\u0001\u0000\u0000\u0000\u0016\u00ab\u0001\u0000\u0000\u0000\u0018"+
		"\u00af\u0001\u0000\u0000\u0000\u001a\u00b7\u0001\u0000\u0000\u0000\u001c"+
		"\u00c2\u0001\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00e0"+
		"\u0001\u0000\u0000\u0000\"\u00e2\u0001\u0000\u0000\u0000$\u00e4\u0001"+
		"\u0000\u0000\u0000&\u00e6\u0001\u0000\u0000\u0000(\u00e8\u0001\u0000\u0000"+
		"\u0000*\u00ed\u0001\u0000\u0000\u0000,\u00ef\u0001\u0000\u0000\u0000."+
		"\u00f9\u0001\u0000\u0000\u00000\u0114\u0001\u0000\u0000\u00002\u0127\u0001"+
		"\u0000\u0000\u00004\u013a\u0001\u0000\u0000\u00006\u013c\u0001\u0000\u0000"+
		"\u00008;\u0005>\u0000\u00009<\u0003\u0004\u0002\u0000:<\u0005\u0082\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u0005&\u0000\u0000>B\u0003\u0006\u0003\u0000?A\u0003\u0002"+
		"\u0001\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CG\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000EF\u0005M\u0000\u0000FH\u0003\u001a\r\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HL\u0001\u0000\u0000"+
		"\u0000IJ\u0005(\u0000\u0000JK\u0005Q\u0000\u0000KM\u0003\u0004\u0002\u0000"+
		"LI\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NO\u0005)\u0000\u0000OQ\u0003\u001a\r\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QX\u0001\u0000\u0000\u0000RS\u00059\u0000"+
		"\u0000ST\u0005Q\u0000\u0000TV\u0003\u0004\u0002\u0000UW\u0007\u0000\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000"+
		"\u0000\u0000XR\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0001"+
		"\u0001\u0000\u0000\u0000Z\\\u0007\u0001\u0000\u0000[]\u0005V\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000"+
		"\u0000^`\u0005W\u0000\u0000_Z\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0005U\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cd\u0003\n\u0005\u0000de\u00056\u0000\u0000ef\u0003\f\u0006\u0000"+
		"f\u0003\u0001\u0000\u0000\u0000gh\u0006\u0002\uffff\uffff\u0000hn\u0003"+
		"\u000e\u0007\u0000in\u0003,\u0016\u0000jn\u00030\u0018\u0000kn\u00032"+
		"\u0019\u0000ln\u0003.\u0017\u0000mg\u0001\u0000\u0000\u0000mi\u0001\u0000"+
		"\u0000\u0000mj\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000nt\u0001\u0000\u0000\u0000op\n\u0006\u0000\u0000pq\u0005"+
		"\u0080\u0000\u0000qs\u0003\u0004\u0002\u0007ro\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000u\u0005\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0006"+
		"\u0003\uffff\uffff\u0000xy\u0003\u0010\b\u0000y\u007f\u0001\u0000\u0000"+
		"\u0000z{\n\u0002\u0000\u0000{|\u0005\u0080\u0000\u0000|~\u0003\u0006\u0003"+
		"\u0003}z\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0007"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0006\u0004\uffff\uffff\u0000\u0083\u0084\u0005\u0094\u0000\u0000\u0084"+
		"\u008a\u0001\u0000\u0000\u0000\u0085\u0086\n\u0002\u0000\u0000\u0086\u0087"+
		"\u0005\u0080\u0000\u0000\u0087\u0089\u0003\b\u0004\u0003\u0088\u0085\u0001"+
		"\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\t\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u0010"+
		"\b\u0000\u008e\u000b\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u001a\r"+
		"\u0000\u0090\r\u0001\u0000\u0000\u0000\u0091\u0094\u0003\u0014\n\u0000"+
		"\u0092\u0094\u0003\u0018\f\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u000f\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0003\u0012\t\u0000\u0096\u0098\u0003\u0016\u000b\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0011"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0016\u000b\u0000\u009a\u009b"+
		"\u0005\t\u0000\u0000\u009b\u009c\u0003&\u0013\u0000\u009c\u00a1\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0003\u0016\u000b\u0000\u009e\u009f\u0003"+
		"&\u0013\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u0099\u0001\u0000"+
		"\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a1\u0013\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0003\u0018\f\u0000\u00a3\u00a4\u0005\t\u0000"+
		"\u0000\u00a4\u00a5\u0003&\u0013\u0000\u00a5\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0003\u0018\f\u0000\u00a7\u00a8\u0003&\u0013\u0000\u00a8"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a2\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a6\u0001\u0000\u0000\u0000\u00aa\u0015\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0003$\u0012\u0000\u00ac\u0017\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0003\u001e\u000f\u0000\u00ae\u00b0\u0003$\u0012\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u0019\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0006\r\uffff\uffff\u0000\u00b2\u00b3\u0005"+
		"\u0001\u0000\u0000\u00b3\u00b4\u0003\u001a\r\u0000\u00b4\u00b5\u0005\u0002"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u001c"+
		"\u000e\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bf\u0001\u0000\u0000\u0000\u00b9\u00ba\n\u0003\u0000"+
		"\u0000\u00ba\u00bb\u0003\"\u0011\u0000\u00bb\u00bc\u0003\u001a\r\u0004"+
		"\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u001b\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00d0\u0003\u000e\u0007\u0000"+
		"\u00c3\u00c6\u0003 \u0010\u0000\u00c4\u00c7\u0005\u0094\u0000\u0000\u00c5"+
		"\u00c7\u0003\u0018\f\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00d1\u0001\u0000\u0000\u0000\u00c8\u00ca"+
		"\u00053\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"*\u0000\u0000\u00cc\u00cd\u0005\u0001\u0000\u0000\u00cd\u00ce\u0003\b"+
		"\u0004\u0000\u00ce\u00cf\u0005\u0002\u0000\u0000\u00cf\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d0\u00c3\u0001\u0000\u0000\u0000\u00d0\u00c9\u0001\u0000"+
		"\u0000\u0000\u00d1\u001d\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003(\u0014"+
		"\u0000\u00d3\u00d4\u0005\u008a\u0000\u0000\u00d4\u00d5\u0003\u000e\u0007"+
		"\u0000\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6\u00e1\u0005\u0083\u0000"+
		"\u0000\u00d7\u00e1\u0005P\u0000\u0000\u00d8\u00d9\u0005P\u0000\u0000\u00d9"+
		"\u00e1\u00053\u0000\u0000\u00da\u00e1\u0005\u0084\u0000\u0000\u00db\u00e1"+
		"\u0005\u0085\u0000\u0000\u00dc\u00e1\u0005\u0086\u0000\u0000\u00dd\u00e1"+
		"\u0005\u0087\u0000\u0000\u00de\u00e1\u0005\u0089\u0000\u0000\u00df\u00e1"+
		"\u0005\u0088\u0000\u0000\u00e0\u00d6\u0001\u0000\u0000\u0000\u00e0\u00d7"+
		"\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000\u0000\u0000\u00e0\u00da"+
		"\u0001\u0000\u0000\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e0\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1!\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0007\u0002\u0000\u0000\u00e3#\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0003*\u0015\u0000\u00e5%\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0003*\u0015\u0000\u00e7\'\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0003*\u0015\u0000\u00e9)\u0001\u0000\u0000\u0000\u00ea\u00ee\u0005"+
		"\u0095\u0000\u0000\u00eb\u00ee\u00034\u001a\u0000\u00ec\u00ee\u00036\u001b"+
		"\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee+\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u00036\u001b\u0000\u00f0\u00f4\u0005\u0001\u0000\u0000\u00f1"+
		"\u00f3\t\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0002\u0000\u0000\u00f8-\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005{\u0000\u0000\u00fa\u00fb\u0005|\u0000"+
		"\u0000\u00fb\u00fc\u0005\u0001\u0000\u0000\u00fc\u0100\u0005\u0001\u0000"+
		"\u0000\u00fd\u00ff\t\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u010f\u0005\u0002\u0000\u0000"+
		"\u0104\u0105\u0005\u0080\u0000\u0000\u0105\u0109\u0005\u0001\u0000\u0000"+
		"\u0106\u0108\t\u0000\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u010b\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010c\u010e\u0005\u0002\u0000\u0000\u010d"+
		"\u0104\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005\u0002\u0000\u0000\u0113/\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005}\u0000\u0000\u0115\u011d\u0005\u0001\u0000\u0000\u0116\u0118\t"+
		"\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011b\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011c\u011e\u0005\u0080\u0000\u0000\u011d\u0119\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0122\u0001"+
		"\u0000\u0000\u0000\u011f\u0121\t\u0000\u0000\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0002"+
		"\u0000\u0000\u01261\u0001\u0000\u0000\u0000\u0127\u0128\u0005~\u0000\u0000"+
		"\u0128\u0130\u0005\u0001\u0000\u0000\u0129\u012b\t\u0000\u0000\u0000\u012a"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d"+
		"\u012f\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u0131\u0005\u0080\u0000\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0135\u0001\u0000\u0000\u0000\u0132"+
		"\u0134\t\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0137"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0135\u0133"+
		"\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0002\u0000\u0000\u01393\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0007\u0003\u0000\u0000\u013b5\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0007\u0004\u0000\u0000\u013d7\u0001\u0000\u0000"+
		"\u0000#;BGLPVX\\_mt\u007f\u008a\u0093\u0097\u00a0\u00a9\u00af\u00b7\u00bf"+
		"\u00c6\u00c9\u00d0\u00e0\u00ed\u00f4\u0100\u0109\u010f\u0119\u011d\u0122"+
		"\u012c\u0130\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}