// Generated from java-escape by ANTLR 4.11.1
package com.dissdic.separatedata.common.processor.postgresql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OperateParser extends Parser {
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
		LEFT=83, RIGHT=84, JOIN=85, OUTER=86, INNER=87, FULL=88, UL=89, COMMA=90, 
		LINE=91, STAR=92, EQ=93, GT=94, LT=95, GE=96, LE=97, NE=98, BI=99, DOT=100, 
		VALUE=101, TABLEORFIELD=102, INT=103, ID=104, WS=105, OTHER=106;
	public static final int
		RULE_select = 0, RULE_join = 1, RULE_fields = 2, RULE_tables = 3, RULE_values = 4, 
		RULE_table = 5, RULE_field = 6, RULE_where = 7, RULE_singlewhere = 8, 
		RULE_tabledotfield = 9, RULE_relator = 10, RULE_static = 11, RULE_keyword = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"select", "join", "fields", "tables", "values", "table", "field", "where", 
			"singlewhere", "tabledotfield", "relator", "static", "keyword"
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
			null, null, null, null, null, "'_'", "','", "'-'", "'*'", "'='", "'>'", 
			"'<'", "'>='", "'<='", "'!='", "'<>'", "'.'"
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
			"INNER", "FULL", "UL", "COMMA", "LINE", "STAR", "EQ", "GT", "LT", "GE", 
			"LE", "NE", "BI", "DOT", "VALUE", "TABLEORFIELD", "INT", "ID", "WS", 
			"OTHER"
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

	public OperateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(OperateParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(OperateParser.FROM, 0); }
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public List<FieldsContext> fields() {
			return getRuleContexts(FieldsContext.class);
		}
		public FieldsContext fields(int i) {
			return getRuleContext(FieldsContext.class,i);
		}
		public TerminalNode STAR() { return getToken(OperateParser.STAR, 0); }
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(OperateParser.WHERE, 0); }
		public List<WhereContext> where() {
			return getRuleContexts(WhereContext.class);
		}
		public WhereContext where(int i) {
			return getRuleContext(WhereContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(OperateParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(OperateParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(OperateParser.BY, i);
		}
		public TerminalNode HAVING() { return getToken(OperateParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(OperateParser.ORDER, 0); }
		public TerminalNode ASC() { return getToken(OperateParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OperateParser.DESC, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitSelect(this);
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
			setState(26);
			match(SELECT);
			setState(29);
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
			case TABLEORFIELD:
				{
				setState(27);
				fields(0);
				}
				break;
			case STAR:
				{
				setState(28);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(31);
			match(FROM);
			setState(32);
			tables(0);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 51L) != 0) {
				{
				{
				setState(33);
				join();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(39);
				match(WHERE);
				setState(40);
				where(0);
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(43);
				match(GROUP);
				setState(44);
				match(BY);
				setState(45);
				fields(0);
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(48);
				match(HAVING);
				setState(49);
				where(0);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(52);
				match(ORDER);
				setState(53);
				match(BY);
				setState(54);
				fields(0);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(55);
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
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode ON() { return getToken(OperateParser.ON, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(OperateParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(OperateParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(OperateParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(OperateParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(OperateParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(OperateParser.OUTER, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitJoin(this);
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
			case RIGHT:
			case FULL:
				{
				{
				setState(60);
				_la = _input.LA(1);
				if ( !((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 35L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(61);
					match(OUTER);
					}
				}

				}
				}
				break;
			case INNER:
				{
				setState(64);
				match(INNER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(67);
			match(JOIN);
			}
			setState(69);
			table();
			setState(70);
			match(ON);
			setState(71);
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
		public TerminalNode COMMA() { return getToken(OperateParser.COMMA, 0); }
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitFields(this);
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
			{
			setState(74);
			field();
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fields);
					setState(76);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(77);
					match(COMMA);
					setState(78);
					fields(3);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode COMMA() { return getToken(OperateParser.COMMA, 0); }
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitTables(this);
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
			setState(85);
			table();
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TablesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tables);
					setState(87);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(88);
					match(COMMA);
					setState(89);
					tables(3);
					}
					} 
				}
				setState(94);
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
	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(OperateParser.VALUE, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(OperateParser.COMMA, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitValues(this);
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
			setState(96);
			match(VALUE);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValuesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_values);
					setState(98);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(99);
					match(COMMA);
					setState(100);
					values(3);
					}
					} 
				}
				setState(105);
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
	public static class TableContext extends ParserRuleContext {
		public List<StaticContext> static_() {
			return getRuleContexts(StaticContext.class);
		}
		public StaticContext static_(int i) {
			return getRuleContext(StaticContext.class,i);
		}
		public TerminalNode AS() { return getToken(OperateParser.AS, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				static_();
				setState(107);
				match(AS);
				setState(108);
				static_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				static_();
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(OperateParser.AS, 0); }
		public List<StaticContext> static_() {
			return getRuleContexts(StaticContext.class);
		}
		public StaticContext static_(int i) {
			return getRuleContext(StaticContext.class,i);
		}
		public TabledotfieldContext tabledotfield() {
			return getRuleContext(TabledotfieldContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(113);
					tabledotfield();
					}
					break;
				case 2:
					{
					setState(114);
					static_();
					}
					break;
				}
				setState(117);
				match(AS);
				setState(118);
				static_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				static_();
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
		public TerminalNode AND() { return getToken(OperateParser.AND, 0); }
		public TerminalNode OR() { return getToken(OperateParser.OR, 0); }
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitWhere(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_where, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(124);
				match(T__0);
				setState(125);
				where(0);
				setState(126);
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
			case TABLEORFIELD:
				{
				setState(128);
				singlewhere();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WhereContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_where);
					setState(131);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(132);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(133);
					where(4);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public List<TabledotfieldContext> tabledotfield() {
			return getRuleContexts(TabledotfieldContext.class);
		}
		public TabledotfieldContext tabledotfield(int i) {
			return getRuleContext(TabledotfieldContext.class,i);
		}
		public List<StaticContext> static_() {
			return getRuleContexts(StaticContext.class);
		}
		public StaticContext static_(int i) {
			return getRuleContext(StaticContext.class,i);
		}
		public TerminalNode IN() { return getToken(OperateParser.IN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public RelatorContext relator() {
			return getRuleContext(RelatorContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OperateParser.NOT, 0); }
		public TerminalNode VALUE() { return getToken(OperateParser.VALUE, 0); }
		public SinglewhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlewhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterSinglewhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitSinglewhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitSinglewhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglewhereContext singlewhere() throws RecognitionException {
		SinglewhereContext _localctx = new SinglewhereContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singlewhere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(139);
				tabledotfield();
				}
				break;
			case 2:
				{
				setState(140);
				static_();
				}
				break;
			}
			setState(157);
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
				setState(143);
				relator();
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(144);
					match(VALUE);
					}
					break;
				case 2:
					{
					setState(145);
					tabledotfield();
					}
					break;
				case 3:
					{
					setState(146);
					static_();
					}
					break;
				}
				}
				}
				break;
			case IN:
			case NOT:
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(149);
					match(NOT);
					}
				}

				setState(152);
				match(IN);
				setState(153);
				match(T__0);
				setState(154);
				values(0);
				setState(155);
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
		public List<StaticContext> static_() {
			return getRuleContexts(StaticContext.class);
		}
		public StaticContext static_(int i) {
			return getRuleContext(StaticContext.class,i);
		}
		public TerminalNode DOT() { return getToken(OperateParser.DOT, 0); }
		public TabledotfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabledotfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterTabledotfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitTabledotfield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitTabledotfield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabledotfieldContext tabledotfield() throws RecognitionException {
		TabledotfieldContext _localctx = new TabledotfieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tabledotfield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			static_();
			setState(160);
			match(DOT);
			setState(161);
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
	public static class RelatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(OperateParser.EQ, 0); }
		public TerminalNode IS() { return getToken(OperateParser.IS, 0); }
		public TerminalNode NOT() { return getToken(OperateParser.NOT, 0); }
		public TerminalNode GT() { return getToken(OperateParser.GT, 0); }
		public TerminalNode LT() { return getToken(OperateParser.LT, 0); }
		public TerminalNode GE() { return getToken(OperateParser.GE, 0); }
		public TerminalNode LE() { return getToken(OperateParser.LE, 0); }
		public TerminalNode BI() { return getToken(OperateParser.BI, 0); }
		public TerminalNode NE() { return getToken(OperateParser.NE, 0); }
		public RelatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterRelator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitRelator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitRelator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelatorContext relator() throws RecognitionException {
		RelatorContext _localctx = new RelatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relator);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(EQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(IS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(165);
				match(IS);
				setState(166);
				match(NOT);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(GT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(LT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(GE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				match(LE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				match(BI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
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
	public static class StaticContext extends ParserRuleContext {
		public TerminalNode TABLEORFIELD() { return getToken(OperateParser.TABLEORFIELD, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public StaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticContext static_() throws RecognitionException {
		StaticContext _localctx = new StaticContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_static);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLEORFIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
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
				setState(176);
				keyword();
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
		public TerminalNode ALL() { return getToken(OperateParser.ALL, 0); }
		public TerminalNode COLLATE() { return getToken(OperateParser.COLLATE, 0); }
		public TerminalNode CURRENT_USER() { return getToken(OperateParser.CURRENT_USER, 0); }
		public TerminalNode TABLE() { return getToken(OperateParser.TABLE, 0); }
		public TerminalNode PLACING() { return getToken(OperateParser.PLACING, 0); }
		public TerminalNode AND() { return getToken(OperateParser.AND, 0); }
		public TerminalNode WINDOW() { return getToken(OperateParser.WINDOW, 0); }
		public TerminalNode SOME() { return getToken(OperateParser.SOME, 0); }
		public TerminalNode TRAILING() { return getToken(OperateParser.TRAILING, 0); }
		public TerminalNode THEN() { return getToken(OperateParser.THEN, 0); }
		public TerminalNode INTO() { return getToken(OperateParser.INTO, 0); }
		public TerminalNode GRANT() { return getToken(OperateParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(OperateParser.GROUP, 0); }
		public TerminalNode CASE() { return getToken(OperateParser.CASE, 0); }
		public TerminalNode UNIQUE() { return getToken(OperateParser.UNIQUE, 0); }
		public TerminalNode DEFERRABLE() { return getToken(OperateParser.DEFERRABLE, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(OperateParser.CURRENT_DATE, 0); }
		public TerminalNode DESC() { return getToken(OperateParser.DESC, 0); }
		public TerminalNode OFFSET() { return getToken(OperateParser.OFFSET, 0); }
		public TerminalNode OR() { return getToken(OperateParser.OR, 0); }
		public TerminalNode CURRENT_CATALOG() { return getToken(OperateParser.CURRENT_CATALOG, 0); }
		public TerminalNode CAST() { return getToken(OperateParser.CAST, 0); }
		public TerminalNode ANALYZE() { return getToken(OperateParser.ANALYZE, 0); }
		public TerminalNode REFERENCES() { return getToken(OperateParser.REFERENCES, 0); }
		public TerminalNode CHECK() { return getToken(OperateParser.CHECK, 0); }
		public TerminalNode AS() { return getToken(OperateParser.AS, 0); }
		public TerminalNode LIMIT() { return getToken(OperateParser.LIMIT, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(OperateParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode RETURNING() { return getToken(OperateParser.RETURNING, 0); }
		public TerminalNode FROM() { return getToken(OperateParser.FROM, 0); }
		public TerminalNode NOT() { return getToken(OperateParser.NOT, 0); }
		public TerminalNode WHERE() { return getToken(OperateParser.WHERE, 0); }
		public TerminalNode BOTH() { return getToken(OperateParser.BOTH, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(OperateParser.LOCALTIMESTAMP, 0); }
		public TerminalNode PRIMARY() { return getToken(OperateParser.PRIMARY, 0); }
		public TerminalNode FOR() { return getToken(OperateParser.FOR, 0); }
		public TerminalNode INTERSECT() { return getToken(OperateParser.INTERSECT, 0); }
		public TerminalNode WHEN() { return getToken(OperateParser.WHEN, 0); }
		public TerminalNode ANALYSE() { return getToken(OperateParser.ANALYSE, 0); }
		public TerminalNode ORDER() { return getToken(OperateParser.ORDER, 0); }
		public TerminalNode ON() { return getToken(OperateParser.ON, 0); }
		public TerminalNode CURRENT_ROLE() { return getToken(OperateParser.CURRENT_ROLE, 0); }
		public TerminalNode INITIALLY() { return getToken(OperateParser.INITIALLY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(OperateParser.SYMMETRIC, 0); }
		public TerminalNode LEADING() { return getToken(OperateParser.LEADING, 0); }
		public TerminalNode UNION() { return getToken(OperateParser.UNION, 0); }
		public TerminalNode IN() { return getToken(OperateParser.IN, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(OperateParser.CURRENT_TIME, 0); }
		public TerminalNode EXCEPT() { return getToken(OperateParser.EXCEPT, 0); }
		public TerminalNode VARIADIC() { return getToken(OperateParser.VARIADIC, 0); }
		public TerminalNode END() { return getToken(OperateParser.END, 0); }
		public TerminalNode NULL() { return getToken(OperateParser.NULL, 0); }
		public TerminalNode USING() { return getToken(OperateParser.USING, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OperateParser.CONSTRAINT, 0); }
		public TerminalNode DEFAULT() { return getToken(OperateParser.DEFAULT, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(OperateParser.ASYMMETRIC, 0); }
		public TerminalNode USER() { return getToken(OperateParser.USER, 0); }
		public TerminalNode DISTINCT() { return getToken(OperateParser.DISTINCT, 0); }
		public TerminalNode ANY() { return getToken(OperateParser.ANY, 0); }
		public TerminalNode HAVING() { return getToken(OperateParser.HAVING, 0); }
		public TerminalNode LATERAL() { return getToken(OperateParser.LATERAL, 0); }
		public TerminalNode FETCH() { return getToken(OperateParser.FETCH, 0); }
		public TerminalNode DO() { return getToken(OperateParser.DO, 0); }
		public TerminalNode LOCALTIME() { return getToken(OperateParser.LOCALTIME, 0); }
		public TerminalNode ARRAY() { return getToken(OperateParser.ARRAY, 0); }
		public TerminalNode ELSE() { return getToken(OperateParser.ELSE, 0); }
		public TerminalNode FOREIGN() { return getToken(OperateParser.FOREIGN, 0); }
		public TerminalNode TO() { return getToken(OperateParser.TO, 0); }
		public TerminalNode ONLY() { return getToken(OperateParser.ONLY, 0); }
		public TerminalNode WITH() { return getToken(OperateParser.WITH, 0); }
		public TerminalNode SELECT() { return getToken(OperateParser.SELECT, 0); }
		public TerminalNode CREATE() { return getToken(OperateParser.CREATE, 0); }
		public TerminalNode FALSE() { return getToken(OperateParser.FALSE, 0); }
		public TerminalNode ASC() { return getToken(OperateParser.ASC, 0); }
		public TerminalNode TRUE() { return getToken(OperateParser.TRUE, 0); }
		public TerminalNode COLUMN() { return getToken(OperateParser.COLUMN, 0); }
		public TerminalNode SESSION_USER() { return getToken(OperateParser.SESSION_USER, 0); }
		public TerminalNode IS() { return getToken(OperateParser.IS, 0); }
		public TerminalNode BY() { return getToken(OperateParser.BY, 0); }
		public TerminalNode INSERT() { return getToken(OperateParser.INSERT, 0); }
		public TerminalNode LEFT() { return getToken(OperateParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(OperateParser.RIGHT, 0); }
		public TerminalNode JOIN() { return getToken(OperateParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(OperateParser.OUTER, 0); }
		public TerminalNode INNER() { return getToken(OperateParser.INNER, 0); }
		public TerminalNode FULL() { return getToken(OperateParser.FULL, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OperateListener ) ((OperateListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperateVisitor ) return ((OperateVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return fields_sempred((FieldsContext)_localctx, predIndex);
		case 3:
			return tables_sempred((TablesContext)_localctx, predIndex);
		case 4:
			return values_sempred((ValuesContext)_localctx, predIndex);
		case 7:
			return where_sempred((WhereContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fields_sempred(FieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
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
		"\u0004\u0001j\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001e\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000"+
		"&\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000*\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000/\b\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u00003\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u00009\b\u0000\u0003\u0000;\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"?\b\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002P\b\u0002\n\u0002"+
		"\f\u0002S\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003[\b\u0003\n\u0003\f\u0003^\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005p\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006t\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006z\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0082\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0087\b\u0007\n\u0007\f\u0007\u008a\t\u0007"+
		"\u0001\b\u0001\b\u0003\b\u008e\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0094\b\b\u0001\b\u0003\b\u0097\b\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u009e\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00ae\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u00b2\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0000\u0004\u0004\u0006\b\u000e\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0004\u0002\u0000\n\n"+
		"\u001c\u001c\u0002\u0000STXX\u0002\u0000\u0006\u000688\u0001\u0000\u0003"+
		"X\u00c7\u0000\u001a\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000"+
		"\u0004I\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\b_\u0001"+
		"\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000"+
		"\u000e\u0081\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000"+
		"\u0012\u009f\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000\u0000\u0000"+
		"\u0016\u00b1\u0001\u0000\u0000\u0000\u0018\u00b3\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0005>\u0000\u0000\u001b\u001e\u0003\u0004\u0002\u0000\u001c"+
		"\u001e\u0005\\\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005"+
		"&\u0000\u0000 $\u0003\u0006\u0003\u0000!#\u0003\u0002\u0001\u0000\"!\u0001"+
		"\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000"+
		"$%\u0001\u0000\u0000\u0000%)\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000\'(\u0005M\u0000\u0000(*\u0003\u000e\u0007\u0000)\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*.\u0001\u0000\u0000\u0000+,\u0005"+
		"(\u0000\u0000,-\u0005Q\u0000\u0000-/\u0003\u0004\u0002\u0000.+\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u000001\u0005"+
		")\u0000\u000013\u0003\u000e\u0007\u000020\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u00003:\u0001\u0000\u0000\u000045\u00059\u0000\u000056\u0005"+
		"Q\u0000\u000068\u0003\u0004\u0002\u000079\u0007\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000"+
		":4\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0001\u0001\u0000"+
		"\u0000\u0000<>\u0007\u0001\u0000\u0000=?\u0005V\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@B\u0005"+
		"W\u0000\u0000A<\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0005U\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0003"+
		"\n\u0005\u0000FG\u00056\u0000\u0000GH\u0003\u000e\u0007\u0000H\u0003\u0001"+
		"\u0000\u0000\u0000IJ\u0006\u0002\uffff\uffff\u0000JK\u0003\f\u0006\u0000"+
		"KQ\u0001\u0000\u0000\u0000LM\n\u0002\u0000\u0000MN\u0005Z\u0000\u0000"+
		"NP\u0003\u0004\u0002\u0003OL\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0005\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0006\u0003\uffff\uffff"+
		"\u0000UV\u0003\n\u0005\u0000V\\\u0001\u0000\u0000\u0000WX\n\u0002\u0000"+
		"\u0000XY\u0005Z\u0000\u0000Y[\u0003\u0006\u0003\u0003ZW\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]\u0007\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_`\u0006\u0004\uffff\uffff\u0000`a\u0005e\u0000\u0000ag\u0001\u0000\u0000"+
		"\u0000bc\n\u0002\u0000\u0000cd\u0005Z\u0000\u0000df\u0003\b\u0004\u0003"+
		"eb\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000jk\u0003\u0016\u000b\u0000kl\u0005\t\u0000\u0000lm\u0003\u0016"+
		"\u000b\u0000mp\u0001\u0000\u0000\u0000np\u0003\u0016\u000b\u0000oj\u0001"+
		"\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\u000b\u0001\u0000\u0000"+
		"\u0000qt\u0003\u0012\t\u0000rt\u0003\u0016\u000b\u0000sq\u0001\u0000\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\t\u0000"+
		"\u0000vw\u0003\u0016\u000b\u0000wz\u0001\u0000\u0000\u0000xz\u0003\u0016"+
		"\u000b\u0000ys\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\r\u0001"+
		"\u0000\u0000\u0000{|\u0006\u0007\uffff\uffff\u0000|}\u0005\u0001\u0000"+
		"\u0000}~\u0003\u000e\u0007\u0000~\u007f\u0005\u0002\u0000\u0000\u007f"+
		"\u0082\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0010\b\u0000\u0081{"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0088"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\n\u0003\u0000\u0000\u0084\u0085\u0007"+
		"\u0002\u0000\u0000\u0085\u0087\u0003\u000e\u0007\u0004\u0086\u0083\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u000f\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0003"+
		"\u0012\t\u0000\u008c\u008e\u0003\u0016\u000b\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u009d\u0001\u0000"+
		"\u0000\u0000\u008f\u0093\u0003\u0014\n\u0000\u0090\u0094\u0005e\u0000"+
		"\u0000\u0091\u0094\u0003\u0012\t\u0000\u0092\u0094\u0003\u0016\u000b\u0000"+
		"\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u009e\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u00053\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005*\u0000\u0000\u0099\u009a\u0005\u0001\u0000\u0000\u009a\u009b"+
		"\u0003\b\u0004\u0000\u009b\u009c\u0005\u0002\u0000\u0000\u009c\u009e\u0001"+
		"\u0000\u0000\u0000\u009d\u008f\u0001\u0000\u0000\u0000\u009d\u0096\u0001"+
		"\u0000\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a0\u0003"+
		"\u0016\u000b\u0000\u00a0\u00a1\u0005d\u0000\u0000\u00a1\u00a2\u0003\u0016"+
		"\u000b\u0000\u00a2\u0013\u0001\u0000\u0000\u0000\u00a3\u00ae\u0005]\u0000"+
		"\u0000\u00a4\u00ae\u0005P\u0000\u0000\u00a5\u00a6\u0005P\u0000\u0000\u00a6"+
		"\u00ae\u00053\u0000\u0000\u00a7\u00ae\u0005^\u0000\u0000\u00a8\u00ae\u0005"+
		"_\u0000\u0000\u00a9\u00ae\u0005`\u0000\u0000\u00aa\u00ae\u0005a\u0000"+
		"\u0000\u00ab\u00ae\u0005c\u0000\u0000\u00ac\u00ae\u0005b\u0000\u0000\u00ad"+
		"\u00a3\u0001\u0000\u0000\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000\u00ad"+
		"\u00a5\u0001\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u0015\u0001\u0000\u0000\u0000\u00af"+
		"\u00b2\u0005f\u0000\u0000\u00b0\u00b2\u0003\u0018\f\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u0017"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0003\u0000\u0000\u00b4\u0019"+
		"\u0001\u0000\u0000\u0000\u0017\u001d$).28:>AQ\\gosy\u0081\u0088\u008d"+
		"\u0093\u0096\u009d\u00ad\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}