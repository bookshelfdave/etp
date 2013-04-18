// Generated from ./src/main/java/com/metadave/etp/ETP.g4 by ANTLR 4.0
package com.metadave.etp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ETPParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, LSQUARE=2, RSQUARE=3, LCURLY=4, RCURLY=5, DOT=6, BINSTART=7, 
		BINEND=8, TRUE=9, FALSE=10, AT=11, ID=12, IDSTRING=13, INT=14, FLOAT=15, 
		STRING=16, LINE_COMMENT=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'['", "']'", "'{'", "'}'", "'.'", "'<<'", "'>>'", 
		"'true'", "'false'", "'@'", "ID", "IDSTRING", "INT", "FLOAT", "STRING", 
		"LINE_COMMENT", "WS"
	};
	public static final int
		RULE_etp_term = 0, RULE_etp_int = 1, RULE_etp_float = 2, RULE_etp_string = 3, 
		RULE_etp_atom = 4, RULE_etp_bool = 5, RULE_etp_list = 6, RULE_etp_tuple = 7;
	public static final String[] ruleNames = {
		"etp_term", "etp_int", "etp_float", "etp_string", "etp_atom", "etp_bool", 
		"etp_list", "etp_tuple"
	};

	@Override
	public String getGrammarFileName() { return "ETP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ETPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Etp_termContext extends ParserRuleContext {
		public Etp_floatContext etp_float() {
			return getRuleContext(Etp_floatContext.class,0);
		}
		public Etp_tupleContext etp_tuple() {
			return getRuleContext(Etp_tupleContext.class,0);
		}
		public Etp_atomContext etp_atom() {
			return getRuleContext(Etp_atomContext.class,0);
		}
		public Etp_stringContext etp_string() {
			return getRuleContext(Etp_stringContext.class,0);
		}
		public Etp_boolContext etp_bool() {
			return getRuleContext(Etp_boolContext.class,0);
		}
		public Etp_listContext etp_list() {
			return getRuleContext(Etp_listContext.class,0);
		}
		public Etp_intContext etp_int() {
			return getRuleContext(Etp_intContext.class,0);
		}
		public Etp_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_term(this);
		}
	}

	public final Etp_termContext etp_term() throws RecognitionException {
		Etp_termContext _localctx = new Etp_termContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_etp_term);
		try {
			setState(23);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(16); etp_int();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(17); etp_float();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(18); etp_string();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(19); etp_bool();
				}
				break;
			case ID:
			case IDSTRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(20); etp_atom();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 6);
				{
				setState(21); etp_list();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 7);
				{
				setState(22); etp_tuple();
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

	public static class Etp_intContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ETPParser.INT, 0); }
		public Etp_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_int(this);
		}
	}

	public final Etp_intContext etp_int() throws RecognitionException {
		Etp_intContext _localctx = new Etp_intContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_etp_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(INT);
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

	public static class Etp_floatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ETPParser.FLOAT, 0); }
		public Etp_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_float(this);
		}
	}

	public final Etp_floatContext etp_float() throws RecognitionException {
		Etp_floatContext _localctx = new Etp_floatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_etp_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(FLOAT);
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

	public static class Etp_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ETPParser.STRING, 0); }
		public Etp_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_string(this);
		}
	}

	public final Etp_stringContext etp_string() throws RecognitionException {
		Etp_stringContext _localctx = new Etp_stringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_etp_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(STRING);
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

	public static class Etp_atomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ETPParser.ID, 0); }
		public TerminalNode IDSTRING() { return getToken(ETPParser.IDSTRING, 0); }
		public Etp_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_atom(this);
		}
	}

	public final Etp_atomContext etp_atom() throws RecognitionException {
		Etp_atomContext _localctx = new Etp_atomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_etp_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDSTRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Etp_boolContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(ETPParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(ETPParser.TRUE, 0); }
		public Etp_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_bool(this);
		}
	}

	public final Etp_boolContext etp_bool() throws RecognitionException {
		Etp_boolContext _localctx = new Etp_boolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_etp_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Etp_listContext extends ParserRuleContext {
		public Etp_termContext etp_term;
		public List<Etp_termContext> listitems = new ArrayList<Etp_termContext>();
		public List<Etp_termContext> etp_term() {
			return getRuleContexts(Etp_termContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ETPParser.COMMA, i);
		}
		public TerminalNode LSQUARE() { return getToken(ETPParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(ETPParser.RSQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ETPParser.COMMA); }
		public Etp_termContext etp_term(int i) {
			return getRuleContext(Etp_termContext.class,i);
		}
		public Etp_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_list(this);
		}
	}

	public final Etp_listContext etp_list() throws RecognitionException {
		Etp_listContext _localctx = new Etp_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_etp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(LSQUARE);
			setState(44);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(36); ((Etp_listContext)_localctx).etp_term = etp_term();
				((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(37); match(COMMA);
					setState(38); ((Etp_listContext)_localctx).etp_term = etp_term();
					((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(46); match(RSQUARE);
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

	public static class Etp_tupleContext extends ParserRuleContext {
		public Etp_termContext etp_term;
		public List<Etp_termContext> tupleitems = new ArrayList<Etp_termContext>();
		public List<Etp_termContext> etp_term() {
			return getRuleContexts(Etp_termContext.class);
		}
		public TerminalNode LCURLY() { return getToken(ETPParser.LCURLY, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(ETPParser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ETPParser.COMMA); }
		public Etp_termContext etp_term(int i) {
			return getRuleContext(Etp_termContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(ETPParser.RCURLY, 0); }
		public Etp_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_tuple(this);
		}
	}

	public final Etp_tupleContext etp_tuple() throws RecognitionException {
		Etp_tupleContext _localctx = new Etp_tupleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_etp_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(LCURLY);
			setState(57);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(49); ((Etp_tupleContext)_localctx).etp_term = etp_term();
				((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(50); match(COMMA);
					setState(51); ((Etp_tupleContext)_localctx).etp_term = etp_term();
					((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(59); match(RCURLY);
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
		"\2\3\24@\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\32\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b*\n\b\f\b\16\b-\13\b\5\b/\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\7\t\67\n\t\f\t\16\t:\13\t\5\t<\n\t\3\t\3\t\3\t\2\n\2"+
		"\4\6\b\n\f\16\20\2\4\3\16\17\3\13\fA\2\31\3\2\2\2\4\33\3\2\2\2\6\35\3"+
		"\2\2\2\b\37\3\2\2\2\n!\3\2\2\2\f#\3\2\2\2\16%\3\2\2\2\20\62\3\2\2\2\22"+
		"\32\5\4\3\2\23\32\5\6\4\2\24\32\5\b\5\2\25\32\5\f\7\2\26\32\5\n\6\2\27"+
		"\32\5\16\b\2\30\32\5\20\t\2\31\22\3\2\2\2\31\23\3\2\2\2\31\24\3\2\2\2"+
		"\31\25\3\2\2\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\3\3\2\2\2"+
		"\33\34\7\20\2\2\34\5\3\2\2\2\35\36\7\21\2\2\36\7\3\2\2\2\37 \7\22\2\2"+
		" \t\3\2\2\2!\"\t\2\2\2\"\13\3\2\2\2#$\t\3\2\2$\r\3\2\2\2%.\7\4\2\2&+\5"+
		"\2\2\2\'(\7\3\2\2(*\5\2\2\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,"+
		"/\3\2\2\2-+\3\2\2\2.&\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\5\2\2\61\17"+
		"\3\2\2\2\62;\7\6\2\2\638\5\2\2\2\64\65\7\3\2\2\65\67\5\2\2\2\66\64\3\2"+
		"\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;\63\3\2\2\2"+
		";<\3\2\2\2<=\3\2\2\2=>\7\7\2\2>\21\3\2\2\2\7\31+.8;";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}