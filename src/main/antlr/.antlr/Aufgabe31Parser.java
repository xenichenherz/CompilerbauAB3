// Generated from c:/Users/xenia/Documents/GitHub/dbshit2/CompilerbauAB3/src/main/antlr/Aufgabe31.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Aufgabe31Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, ASSIGN=9, 
		NUMBER=10, STRING=11, GREATERTHAN=12, LESSTHAN=13, PLUS=14, MINUS=15, 
		DIV=16, MUL=17, EQUAL=18, NEQUAL=19, COMMENT=20, WS=21, NEWLINE=22;
	public static final int
		RULE_program = 0, RULE_while = 1, RULE_condition = 2, RULE_vardec = 3, 
		RULE_assign = 4, RULE_expr = 5, RULE_comparison = 6, RULE_addition = 7, 
		RULE_multiplication = 8, RULE_idOrNum = 9, RULE_statement = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "while", "condition", "vardec", "assign", "expr", "comparison", 
			"addition", "multiplication", "idOrNum", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'do'", "'if'", "'else do'", "'end'", "'('", "')'", 
			null, "':='", null, null, "'>'", "'<'", "'+'", "'-'", "'/'", "'*'", "'=='", 
			"'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "ASSIGN", "NUMBER", 
			"STRING", "GREATERTHAN", "LESSTHAN", "PLUS", "MINUS", "DIV", "MUL", "EQUAL", 
			"NEQUAL", "COMMENT", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "Aufgabe31.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Aufgabe31Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Aufgabe31Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3402L) != 0)) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
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
	public static class WhileContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Aufgabe31Parser.NEWLINE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			expr();
			setState(32);
			match(T__1);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				statement();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3402L) != 0) );
			setState(38);
			match(NEWLINE);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__2);
			setState(41);
			expr();
			setState(42);
			match(T__1);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3402L) != 0) );
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(48);
				match(T__3);
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(49);
					statement();
					}
					}
					setState(52); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3402L) != 0) );
				}
			}

			setState(56);
			match(T__4);
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
	public static class VardecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Aufgabe31Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Aufgabe31Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(59);
				match(ASSIGN);
				setState(60);
				expr();
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Aufgabe31Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Aufgabe31Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ID);
			setState(64);
			match(ASSIGN);
			setState(65);
			expr();
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
	public static class ExprContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode STRING() { return getToken(Aufgabe31Parser.STRING, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				comparison();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(STRING);
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
	public static class ComparisonContext extends ParserRuleContext {
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(Aufgabe31Parser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(Aufgabe31Parser.EQUAL, i);
		}
		public List<TerminalNode> NEQUAL() { return getTokens(Aufgabe31Parser.NEQUAL); }
		public TerminalNode NEQUAL(int i) {
			return getToken(Aufgabe31Parser.NEQUAL, i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(Aufgabe31Parser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(Aufgabe31Parser.LESSTHAN, i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(Aufgabe31Parser.GREATERTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(Aufgabe31Parser.GREATERTHAN, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			addition();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 798720L) != 0)) {
				{
				{
				setState(72);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 798720L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(73);
				addition();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AdditionContext extends ParserRuleContext {
		public List<MultiplicationContext> multiplication() {
			return getRuleContexts(MultiplicationContext.class);
		}
		public MultiplicationContext multiplication(int i) {
			return getRuleContext(MultiplicationContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Aufgabe31Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Aufgabe31Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Aufgabe31Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Aufgabe31Parser.MINUS, i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			multiplication();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(80);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(81);
				multiplication();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class MultiplicationContext extends ParserRuleContext {
		public List<IdOrNumContext> idOrNum() {
			return getRuleContexts(IdOrNumContext.class);
		}
		public IdOrNumContext idOrNum(int i) {
			return getRuleContext(IdOrNumContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(Aufgabe31Parser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(Aufgabe31Parser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Aufgabe31Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Aufgabe31Parser.DIV, i);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			idOrNum();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV || _la==MUL) {
				{
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MUL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				idOrNum();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class IdOrNumContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Aufgabe31Parser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(Aufgabe31Parser.NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdOrNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idOrNum; }
	}

	public final IdOrNumContext idOrNum() throws RecognitionException {
		IdOrNumContext _localctx = new IdOrNumContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idOrNum);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(NUMBER);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(T__5);
				setState(98);
				expr();
				setState(99);
				match(T__6);
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
	public static class StatementContext extends ParserRuleContext {
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Aufgabe31Parser.NEWLINE, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				vardec();
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(104);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				assign();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(108);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				expr();
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(112);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				condition();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016x\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001#\b\u0001\u000b\u0001"+
		"\f\u0001$\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002-\b\u0002\u000b\u0002\f\u0002.\u0001\u0002\u0001"+
		"\u0002\u0004\u00023\b\u0002\u000b\u0002\f\u00024\u0003\u00027\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		">\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005F\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006K\b\u0006\n\u0006\f\u0006N\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007S\b\u0007\n\u0007\f\u0007V\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b[\b\b\n\b\f\b^\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tf\b\t\u0001\n\u0001\n\u0003\nj\b\n\u0001\n\u0001\n\u0003"+
		"\nn\b\n\u0001\n\u0001\n\u0003\nr\b\n\u0001\n\u0001\n\u0003\nv\b\n\u0001"+
		"\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0003\u0002\u0000\f\r\u0012\u0013\u0001\u0000\u000e\u000f\u0001"+
		"\u0000\u0010\u0011\u007f\u0000\u0019\u0001\u0000\u0000\u0000\u0002\u001e"+
		"\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006:\u0001\u0000"+
		"\u0000\u0000\b?\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000\u0000\fG"+
		"\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010W\u0001\u0000"+
		"\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0003\u0014\n\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d"+
		"\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f"+
		" \u0003\n\u0005\u0000 \"\u0005\u0002\u0000\u0000!#\u0003\u0014\n\u0000"+
		"\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0016"+
		"\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005\u0003\u0000\u0000"+
		")*\u0003\n\u0005\u0000*,\u0005\u0002\u0000\u0000+-\u0003\u0014\n\u0000"+
		",+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/6\u0001\u0000\u0000\u000002\u0005\u0004"+
		"\u0000\u000013\u0003\u0014\n\u000021\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001"+
		"\u0000\u0000\u000060\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0005\u0005\u0000\u00009\u0005\u0001\u0000"+
		"\u0000\u0000:=\u0005\b\u0000\u0000;<\u0005\t\u0000\u0000<>\u0003\n\u0005"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0007\u0001"+
		"\u0000\u0000\u0000?@\u0005\b\u0000\u0000@A\u0005\t\u0000\u0000AB\u0003"+
		"\n\u0005\u0000B\t\u0001\u0000\u0000\u0000CF\u0003\f\u0006\u0000DF\u0005"+
		"\u000b\u0000\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"F\u000b\u0001\u0000\u0000\u0000GL\u0003\u000e\u0007\u0000HI\u0007\u0000"+
		"\u0000\u0000IK\u0003\u000e\u0007\u0000JH\u0001\u0000\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"M\r\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OT\u0003\u0010\b"+
		"\u0000PQ\u0007\u0001\u0000\u0000QS\u0003\u0010\b\u0000RP\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\u000f\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"W\\\u0003\u0012\t\u0000XY\u0007\u0002\u0000\u0000Y[\u0003\u0012\t\u0000"+
		"ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\u0011\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_f\u0005\b\u0000\u0000`f\u0005\n\u0000\u0000ab\u0005"+
		"\u0006\u0000\u0000bc\u0003\n\u0005\u0000cd\u0005\u0007\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000e`\u0001\u0000\u0000\u0000"+
		"ea\u0001\u0000\u0000\u0000f\u0013\u0001\u0000\u0000\u0000gi\u0003\u0006"+
		"\u0003\u0000hj\u0005\u0016\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jv\u0001\u0000\u0000\u0000km\u0003\b\u0004\u0000ln\u0005"+
		"\u0016\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nv\u0001\u0000\u0000\u0000oq\u0003\n\u0005\u0000pr\u0005\u0016\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rv\u0001\u0000\u0000"+
		"\u0000sv\u0003\u0002\u0001\u0000tv\u0003\u0004\u0002\u0000ug\u0001\u0000"+
		"\u0000\u0000uk\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0015\u0001\u0000\u0000"+
		"\u0000\u000f\u0019$.46=ELT\\eimqu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}