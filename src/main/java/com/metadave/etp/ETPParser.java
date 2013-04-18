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
		FUN=1, REF=2, COMMA=3, LSQUARE=4, RSQUARE=5, LCURLY=6, RCURLY=7, LESSTHAN=8, 
		GREATERTHAN=9, COLON=10, BINSTART=11, BINEND=12, TRUE=13, FALSE=14, AT=15, 
		HASH=16, DOT=17, ID=18, IDSTRING=19, INT=20, FLOAT=21, BINSTRING=22, STRING=23, 
		LINE_COMMENT=24, WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'Fun'", "'Ref'", "','", "'['", "']'", "'{'", "'}'", "'<'", 
		"'>'", "':'", "'<<'", "'>>'", "'true'", "'false'", "'@'", "'#'", "'.'", 
		"ID", "IDSTRING", "INT", "FLOAT", "BINSTRING", "STRING", "LINE_COMMENT", 
		"WS"
	};
	public static final int
		RULE_etp_term = 0, RULE_etp_int = 1, RULE_etp_float = 2, RULE_etp_string = 3, 
		RULE_etp_atom = 4, RULE_etp_bool = 5, RULE_etp_list = 6, RULE_etp_tuple = 7, 
		RULE_etp_pid = 8, RULE_etp_fun = 9, RULE_etp_binary = 10, RULE_etp_binary_item = 11, 
		RULE_etp_ref = 12;
	public static final String[] ruleNames = {
		"etp_term", "etp_int", "etp_float", "etp_string", "etp_atom", "etp_bool", 
		"etp_list", "etp_tuple", "etp_pid", "etp_fun", "etp_binary", "etp_binary_item", 
		"etp_ref"
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
		public Etp_binaryContext etp_binary() {
			return getRuleContext(Etp_binaryContext.class,0);
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
			setState(34);
			switch (_input.LA(1)) {
			case ID:
			case IDSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); etp_atom();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); etp_int();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(28); etp_float();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(29); etp_string();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(30); etp_bool();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 6);
				{
				setState(31); etp_list();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 7);
				{
				setState(32); etp_tuple();
				}
				break;
			case BINSTART:
				enterOuterAlt(_localctx, 8);
				{
				setState(33); etp_binary();
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
			setState(36); match(INT);
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
			setState(38); match(FLOAT);
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
			setState(40); match(STRING);
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
			setState(42);
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
			setState(44);
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
			setState(46); match(LSQUARE);
			setState(55);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(47); ((Etp_listContext)_localctx).etp_term = etp_term();
				((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(48); match(COMMA);
					setState(49); ((Etp_listContext)_localctx).etp_term = etp_term();
					((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(57); match(RSQUARE);
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
			setState(59); match(LCURLY);
			setState(68);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(60); ((Etp_tupleContext)_localctx).etp_term = etp_term();
				((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(61); match(COMMA);
					setState(62); ((Etp_tupleContext)_localctx).etp_term = etp_term();
					((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70); match(RCURLY);
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

	public static class Etp_pidContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public Token c;
		public TerminalNode LESSTHAN() { return getToken(ETPParser.LESSTHAN, 0); }
		public TerminalNode DOT(int i) {
			return getToken(ETPParser.DOT, i);
		}
		public List<TerminalNode> INT() { return getTokens(ETPParser.INT); }
		public List<TerminalNode> DOT() { return getTokens(ETPParser.DOT); }
		public TerminalNode INT(int i) {
			return getToken(ETPParser.INT, i);
		}
		public TerminalNode GREATERTHAN() { return getToken(ETPParser.GREATERTHAN, 0); }
		public Etp_pidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_pid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_pid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_pid(this);
		}
	}

	public final Etp_pidContext etp_pid() throws RecognitionException {
		Etp_pidContext _localctx = new Etp_pidContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_etp_pid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(LESSTHAN);
			setState(73); ((Etp_pidContext)_localctx).a = match(INT);
			setState(74); match(DOT);
			setState(75); ((Etp_pidContext)_localctx).b = match(INT);
			setState(76); match(DOT);
			setState(77); ((Etp_pidContext)_localctx).c = match(INT);
			setState(78); match(GREATERTHAN);
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

	public static class Etp_funContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ETPParser.HASH, 0); }
		public TerminalNode LESSTHAN() { return getToken(ETPParser.LESSTHAN, 0); }
		public TerminalNode FUN() { return getToken(ETPParser.FUN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(ETPParser.GREATERTHAN, 0); }
		public Etp_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_fun(this);
		}
	}

	public final Etp_funContext etp_fun() throws RecognitionException {
		Etp_funContext _localctx = new Etp_funContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_etp_fun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(HASH);
			setState(81); match(FUN);
			setState(82); match(LESSTHAN);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(83);
					matchWildcard();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(89); match(GREATERTHAN);
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

	public static class Etp_binaryContext extends ParserRuleContext {
		public Etp_binary_itemContext etp_binary_item;
		public List<Etp_binary_itemContext> segments = new ArrayList<Etp_binary_itemContext>();
		public TerminalNode COMMA(int i) {
			return getToken(ETPParser.COMMA, i);
		}
		public TerminalNode BINSTART() { return getToken(ETPParser.BINSTART, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ETPParser.COMMA); }
		public TerminalNode BINEND() { return getToken(ETPParser.BINEND, 0); }
		public List<Etp_binary_itemContext> etp_binary_item() {
			return getRuleContexts(Etp_binary_itemContext.class);
		}
		public Etp_binary_itemContext etp_binary_item(int i) {
			return getRuleContext(Etp_binary_itemContext.class,i);
		}
		public Etp_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_binary(this);
		}
	}

	public final Etp_binaryContext etp_binary() throws RecognitionException {
		Etp_binaryContext _localctx = new Etp_binaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_etp_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(BINSTART);
			setState(100);
			_la = _input.LA(1);
			if (_la==INT || _la==BINSTRING) {
				{
				setState(92); ((Etp_binaryContext)_localctx).etp_binary_item = etp_binary_item();
				((Etp_binaryContext)_localctx).segments.add(((Etp_binaryContext)_localctx).etp_binary_item);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(93); match(COMMA);
					setState(94); ((Etp_binaryContext)_localctx).etp_binary_item = etp_binary_item();
					((Etp_binaryContext)_localctx).segments.add(((Etp_binaryContext)_localctx).etp_binary_item);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(102); match(BINEND);
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

	public static class Etp_binary_itemContext extends ParserRuleContext {
		public Token val;
		public Token size;
		public TerminalNode COLON() { return getToken(ETPParser.COLON, 0); }
		public TerminalNode BINSTRING() { return getToken(ETPParser.BINSTRING, 0); }
		public List<TerminalNode> INT() { return getTokens(ETPParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ETPParser.INT, i);
		}
		public Etp_binary_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_binary_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_binary_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_binary_item(this);
		}
	}

	public final Etp_binary_itemContext etp_binary_item() throws RecognitionException {
		Etp_binary_itemContext _localctx = new Etp_binary_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_etp_binary_item);
		int _la;
		try {
			setState(110);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); ((Etp_binary_itemContext)_localctx).val = match(INT);
				setState(107);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(105); match(COLON);
					setState(106); ((Etp_binary_itemContext)_localctx).size = match(INT);
					}
				}

				}
				break;
			case BINSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); match(BINSTRING);
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

	public static class Etp_refContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public Token c;
		public Token d;
		public TerminalNode HASH() { return getToken(ETPParser.HASH, 0); }
		public TerminalNode LESSTHAN() { return getToken(ETPParser.LESSTHAN, 0); }
		public TerminalNode DOT(int i) {
			return getToken(ETPParser.DOT, i);
		}
		public List<TerminalNode> INT() { return getTokens(ETPParser.INT); }
		public List<TerminalNode> DOT() { return getTokens(ETPParser.DOT); }
		public TerminalNode INT(int i) {
			return getToken(ETPParser.INT, i);
		}
		public TerminalNode REF() { return getToken(ETPParser.REF, 0); }
		public TerminalNode GREATERTHAN() { return getToken(ETPParser.GREATERTHAN, 0); }
		public Etp_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_ref(this);
		}
	}

	public final Etp_refContext etp_ref() throws RecognitionException {
		Etp_refContext _localctx = new Etp_refContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_etp_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(HASH);
			setState(113); match(REF);
			setState(114); match(LESSTHAN);
			setState(115); ((Etp_refContext)_localctx).a = match(INT);
			setState(116); match(DOT);
			setState(117); ((Etp_refContext)_localctx).b = match(INT);
			setState(118); match(DOT);
			setState(119); ((Etp_refContext)_localctx).c = match(INT);
			setState(120); match(DOT);
			setState(121); ((Etp_refContext)_localctx).d = match(INT);
			setState(122); match(GREATERTHAN);
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
		"\2\3\33\177\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2%\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\7\b\65\n\b\f\b\16\b8\13\b\5\b:\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7"+
		"\tB\n\t\f\t\16\tE\13\t\5\tG\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\7\13W\n\13\f\13\16\13Z\13\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\7\fb\n\f\f\f\16\fe\13\f\5\fg\n\f\3\f\3\f\3\r\3\r\3\r\5\rn\n\r"+
		"\3\r\5\rq\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3X\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\24\25\3\17\20\u0081"+
		"\2$\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f.\3\2\2\2\16"+
		"\60\3\2\2\2\20=\3\2\2\2\22J\3\2\2\2\24R\3\2\2\2\26]\3\2\2\2\30p\3\2\2"+
		"\2\32r\3\2\2\2\34%\5\n\6\2\35%\5\4\3\2\36%\5\6\4\2\37%\5\b\5\2 %\5\f\7"+
		"\2!%\5\16\b\2\"%\5\20\t\2#%\5\26\f\2$\34\3\2\2\2$\35\3\2\2\2$\36\3\2\2"+
		"\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\3\3\2\2\2&\'"+
		"\7\26\2\2\'\5\3\2\2\2()\7\27\2\2)\7\3\2\2\2*+\7\31\2\2+\t\3\2\2\2,-\t"+
		"\2\2\2-\13\3\2\2\2./\t\3\2\2/\r\3\2\2\2\609\7\6\2\2\61\66\5\2\2\2\62\63"+
		"\7\5\2\2\63\65\5\2\2\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\29\61\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\7\2"+
		"\2<\17\3\2\2\2=F\7\b\2\2>C\5\2\2\2?@\7\5\2\2@B\5\2\2\2A?\3\2\2\2BE\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F>\3\2\2\2FG\3\2\2\2GH\3\2"+
		"\2\2HI\7\t\2\2I\21\3\2\2\2JK\7\n\2\2KL\7\26\2\2LM\7\23\2\2MN\7\26\2\2"+
		"NO\7\23\2\2OP\7\26\2\2PQ\7\13\2\2Q\23\3\2\2\2RS\7\22\2\2ST\7\3\2\2TX\7"+
		"\n\2\2UW\13\2\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX"+
		"\3\2\2\2[\\\7\13\2\2\\\25\3\2\2\2]f\7\r\2\2^c\5\30\r\2_`\7\5\2\2`b\5\30"+
		"\r\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2f^\3\2"+
		"\2\2fg\3\2\2\2gh\3\2\2\2hi\7\16\2\2i\27\3\2\2\2jm\7\26\2\2kl\7\f\2\2l"+
		"n\7\26\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2oq\7\30\2\2pj\3\2\2\2po\3\2\2"+
		"\2q\31\3\2\2\2rs\7\22\2\2st\7\4\2\2tu\7\n\2\2uv\7\26\2\2vw\7\23\2\2wx"+
		"\7\26\2\2xy\7\23\2\2yz\7\26\2\2z{\7\23\2\2{|\7\26\2\2|}\7\13\2\2}\33\3"+
		"\2\2\2\f$\669CFXcfmp";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}