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
		FUN=1, REF=2, PID=3, BIN=4, COMMA=5, LSQUARE=6, RSQUARE=7, LCURLY=8, RCURLY=9, 
		LESSTHAN=10, GREATERTHAN=11, COLON=12, BINSTART=13, BINEND=14, TRUE=15, 
		FALSE=16, AT=17, HASH=18, DOT=19, ID=20, IDSTRING=21, INT=22, FLOAT=23, 
		PIDID=24, REFID=25, STRING=26, LINE_COMMENT=27, WS=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'Fun'", "'Ref'", "'Pid'", "'Bin'", "','", "'['", "']'", 
		"'{'", "'}'", "'<'", "'>'", "':'", "'<<'", "'>>'", "'true'", "'false'", 
		"'@'", "'#'", "'.'", "ID", "IDSTRING", "INT", "FLOAT", "PIDID", "REFID", 
		"STRING", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_etp_terms = 0, RULE_etp_term = 1, RULE_etp_int = 2, RULE_etp_float = 3, 
		RULE_etp_string = 4, RULE_etp_atom = 5, RULE_etp_bool = 6, RULE_etp_list = 7, 
		RULE_etp_tuple = 8, RULE_etp_pid = 9, RULE_etp_fun = 10, RULE_etp_binary = 11, 
		RULE_etp_binary_item = 12, RULE_etp_binary_fake = 13, RULE_etp_ref = 14;
	public static final String[] ruleNames = {
		"etp_terms", "etp_term", "etp_int", "etp_float", "etp_string", "etp_atom", 
		"etp_bool", "etp_list", "etp_tuple", "etp_pid", "etp_fun", "etp_binary", 
		"etp_binary_item", "etp_binary_fake", "etp_ref"
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
	public static class Etp_termsContext extends ParserRuleContext {
		public List<Etp_termContext> etp_term() {
			return getRuleContexts(Etp_termContext.class);
		}
		public Etp_termContext etp_term(int i) {
			return getRuleContext(Etp_termContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ETPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ETPParser.DOT, i);
		}
		public Etp_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_terms(this);
		}
	}

	public final Etp_termsContext etp_terms() throws RecognitionException {
		Etp_termsContext _localctx = new Etp_termsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_etp_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30); etp_term();
				setState(31); match(DOT);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << LESSTHAN) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << HASH) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0) );
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

	public static class Etp_termContext extends ParserRuleContext {
		public Etp_floatContext etp_float() {
			return getRuleContext(Etp_floatContext.class,0);
		}
		public Etp_pidContext etp_pid() {
			return getRuleContext(Etp_pidContext.class,0);
		}
		public Etp_binary_fakeContext etp_binary_fake() {
			return getRuleContext(Etp_binary_fakeContext.class,0);
		}
		public Etp_boolContext etp_bool() {
			return getRuleContext(Etp_boolContext.class,0);
		}
		public Etp_listContext etp_list() {
			return getRuleContext(Etp_listContext.class,0);
		}
		public Etp_binaryContext etp_binary() {
			return getRuleContext(Etp_binaryContext.class,0);
		}
		public Etp_stringContext etp_string() {
			return getRuleContext(Etp_stringContext.class,0);
		}
		public Etp_refContext etp_ref() {
			return getRuleContext(Etp_refContext.class,0);
		}
		public Etp_tupleContext etp_tuple() {
			return getRuleContext(Etp_tupleContext.class,0);
		}
		public Etp_atomContext etp_atom() {
			return getRuleContext(Etp_atomContext.class,0);
		}
		public Etp_intContext etp_int() {
			return getRuleContext(Etp_intContext.class,0);
		}
		public Etp_funContext etp_fun() {
			return getRuleContext(Etp_funContext.class,0);
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
		enterRule(_localctx, 2, RULE_etp_term);
		try {
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); etp_atom();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); etp_int();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); etp_float();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40); etp_string();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41); etp_bool();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42); etp_list();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(43); etp_tuple();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(44); etp_binary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(45); etp_binary_fake();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(46); etp_pid();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(47); etp_fun();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(48); etp_ref();
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
		enterRule(_localctx, 4, RULE_etp_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(INT);
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
		enterRule(_localctx, 6, RULE_etp_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(FLOAT);
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
		enterRule(_localctx, 8, RULE_etp_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(STRING);
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
		public TerminalNode IDSTRING() { return getToken(ETPParser.IDSTRING, 0); }
		public TerminalNode ID() { return getToken(ETPParser.ID, 0); }
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
		enterRule(_localctx, 10, RULE_etp_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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
		public TerminalNode TRUE() { return getToken(ETPParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ETPParser.FALSE, 0); }
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
		enterRule(_localctx, 12, RULE_etp_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		public List<TerminalNode> COMMA() { return getTokens(ETPParser.COMMA); }
		public TerminalNode LSQUARE() { return getToken(ETPParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(ETPParser.RSQUARE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(ETPParser.COMMA, i);
		}
		public List<Etp_termContext> etp_term() {
			return getRuleContexts(Etp_termContext.class);
		}
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
		enterRule(_localctx, 14, RULE_etp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(LSQUARE);
			setState(70);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << LESSTHAN) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << HASH) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(62); ((Etp_listContext)_localctx).etp_term = etp_term();
				((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63); match(COMMA);
					setState(64); ((Etp_listContext)_localctx).etp_term = etp_term();
					((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(72); match(RSQUARE);
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
		public List<TerminalNode> COMMA() { return getTokens(ETPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ETPParser.COMMA, i);
		}
		public List<Etp_termContext> etp_term() {
			return getRuleContexts(Etp_termContext.class);
		}
		public Etp_termContext etp_term(int i) {
			return getRuleContext(Etp_termContext.class,i);
		}
		public TerminalNode LCURLY() { return getToken(ETPParser.LCURLY, 0); }
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
		enterRule(_localctx, 16, RULE_etp_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(LCURLY);
			setState(83);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << LESSTHAN) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << HASH) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(75); ((Etp_tupleContext)_localctx).etp_term = etp_term();
				((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(76); match(COMMA);
					setState(77); ((Etp_tupleContext)_localctx).etp_term = etp_term();
					((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85); match(RCURLY);
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
		public TerminalNode LESSTHAN() { return getToken(ETPParser.LESSTHAN, 0); }
		public TerminalNode PID() { return getToken(ETPParser.PID, 0); }
		public TerminalNode ID() { return getToken(ETPParser.ID, 0); }
		public TerminalNode GREATERTHAN() { return getToken(ETPParser.GREATERTHAN, 0); }
		public TerminalNode PIDID() { return getToken(ETPParser.PIDID, 0); }
		public TerminalNode HASH() { return getToken(ETPParser.HASH, 0); }
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
		enterRule(_localctx, 18, RULE_etp_pid);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case LESSTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); match(LESSTHAN);
				setState(88); match(PIDID);
				setState(89); match(GREATERTHAN);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); match(HASH);
				setState(91); match(PID);
				setState(92); match(LESSTHAN);
				setState(93); match(ID);
				setState(94); match(GREATERTHAN);
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

	public static class Etp_funContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(ETPParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(ETPParser.GREATERTHAN, 0); }
		public TerminalNode FUN() { return getToken(ETPParser.FUN, 0); }
		public TerminalNode HASH() { return getToken(ETPParser.HASH, 0); }
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
		enterRule(_localctx, 20, RULE_etp_fun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(HASH);
			setState(98); match(FUN);
			setState(99); match(LESSTHAN);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(100);
					matchWildcard();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(106); match(GREATERTHAN);
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
		public List<TerminalNode> COMMA() { return getTokens(ETPParser.COMMA); }
		public Etp_binary_itemContext etp_binary_item(int i) {
			return getRuleContext(Etp_binary_itemContext.class,i);
		}
		public List<Etp_binary_itemContext> etp_binary_item() {
			return getRuleContexts(Etp_binary_itemContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ETPParser.COMMA, i);
		}
		public TerminalNode BINSTART() { return getToken(ETPParser.BINSTART, 0); }
		public TerminalNode BINEND() { return getToken(ETPParser.BINEND, 0); }
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
		enterRule(_localctx, 22, RULE_etp_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(BINSTART);
			setState(117);
			_la = _input.LA(1);
			if (_la==INT || _la==STRING) {
				{
				setState(109); ((Etp_binaryContext)_localctx).etp_binary_item = etp_binary_item();
				((Etp_binaryContext)_localctx).segments.add(((Etp_binaryContext)_localctx).etp_binary_item);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(110); match(COMMA);
					setState(111); ((Etp_binaryContext)_localctx).etp_binary_item = etp_binary_item();
					((Etp_binaryContext)_localctx).segments.add(((Etp_binaryContext)_localctx).etp_binary_item);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(119); match(BINEND);
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
		public TerminalNode STRING() { return getToken(ETPParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(ETPParser.COLON, 0); }
		public TerminalNode INT(int i) {
			return getToken(ETPParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(ETPParser.INT); }
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
		enterRule(_localctx, 24, RULE_etp_binary_item);
		int _la;
		try {
			setState(127);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); ((Etp_binary_itemContext)_localctx).val = match(INT);
				setState(124);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(122); match(COLON);
					setState(123); ((Etp_binary_itemContext)_localctx).size = match(INT);
					}
				}

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); match(STRING);
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

	public static class Etp_binary_fakeContext extends ParserRuleContext {
		public Token size;
		public TerminalNode BIN() { return getToken(ETPParser.BIN, 0); }
		public TerminalNode LESSTHAN() { return getToken(ETPParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(ETPParser.GREATERTHAN, 0); }
		public TerminalNode INT() { return getToken(ETPParser.INT, 0); }
		public TerminalNode HASH() { return getToken(ETPParser.HASH, 0); }
		public Etp_binary_fakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_binary_fake; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_binary_fake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_binary_fake(this);
		}
	}

	public final Etp_binary_fakeContext etp_binary_fake() throws RecognitionException {
		Etp_binary_fakeContext _localctx = new Etp_binary_fakeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_etp_binary_fake);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(HASH);
			setState(130); match(BIN);
			setState(131); match(LESSTHAN);
			setState(132); ((Etp_binary_fakeContext)_localctx).size = match(INT);
			setState(133); match(GREATERTHAN);
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
		public TerminalNode REF() { return getToken(ETPParser.REF, 0); }
		public TerminalNode LESSTHAN() { return getToken(ETPParser.LESSTHAN, 0); }
		public TerminalNode REFID() { return getToken(ETPParser.REFID, 0); }
		public TerminalNode GREATERTHAN() { return getToken(ETPParser.GREATERTHAN, 0); }
		public TerminalNode HASH() { return getToken(ETPParser.HASH, 0); }
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
		enterRule(_localctx, 28, RULE_etp_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(HASH);
			setState(136); match(REF);
			setState(137); match(LESSTHAN);
			setState(138); match(REFID);
			setState(139); match(GREATERTHAN);
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
		"\2\3\36\u0090\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\3\2\3\2\3\2\6\2$\n\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\64\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\7\tD\n\t\f\t\16\tG\13\t\5\tI\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7"+
		"\nQ\n\n\f\n\16\nT\13\n\5\nV\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13b\n\13\3\f\3\f\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\7\rs\n\r\f\r\16\rv\13\r\5\rx\n\r\3\r\3\r\3\16\3\16\3"+
		"\16\5\16\177\n\16\3\16\5\16\u0082\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3i\21\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36\2\4\3\26\27\3\21\22\u0096\2#\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2"+
		"\2\b\67\3\2\2\2\n9\3\2\2\2\f;\3\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22L\3\2"+
		"\2\2\24a\3\2\2\2\26c\3\2\2\2\30n\3\2\2\2\32\u0081\3\2\2\2\34\u0083\3\2"+
		"\2\2\36\u0089\3\2\2\2 !\5\4\3\2!\"\7\25\2\2\"$\3\2\2\2# \3\2\2\2$%\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'\64\5\f\7\2(\64\5\6\4\2)\64\5\b\5"+
		"\2*\64\5\n\6\2+\64\5\16\b\2,\64\5\20\t\2-\64\5\22\n\2.\64\5\30\r\2/\64"+
		"\5\34\17\2\60\64\5\24\13\2\61\64\5\26\f\2\62\64\5\36\20\2\63\'\3\2\2\2"+
		"\63(\3\2\2\2\63)\3\2\2\2\63*\3\2\2\2\63+\3\2\2\2\63,\3\2\2\2\63-\3\2\2"+
		"\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64"+
		"\5\3\2\2\2\65\66\7\30\2\2\66\7\3\2\2\2\678\7\31\2\28\t\3\2\2\29:\7\34"+
		"\2\2:\13\3\2\2\2;<\t\2\2\2<\r\3\2\2\2=>\t\3\2\2>\17\3\2\2\2?H\7\b\2\2"+
		"@E\5\4\3\2AB\7\7\2\2BD\5\4\3\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2"+
		"FI\3\2\2\2GE\3\2\2\2H@\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\t\2\2K\21\3\2\2"+
		"\2LU\7\n\2\2MR\5\4\3\2NO\7\7\2\2OQ\5\4\3\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2"+
		"\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UM\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\13"+
		"\2\2X\23\3\2\2\2YZ\7\f\2\2Z[\7\32\2\2[b\7\r\2\2\\]\7\24\2\2]^\7\5\2\2"+
		"^_\7\f\2\2_`\7\26\2\2`b\7\r\2\2aY\3\2\2\2a\\\3\2\2\2b\25\3\2\2\2cd\7\24"+
		"\2\2de\7\3\2\2ei\7\f\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2\2ig\3"+
		"\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\r\2\2m\27\3\2\2\2nw\7\17\2\2ot\5\32\16"+
		"\2pq\7\7\2\2qs\5\32\16\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2wo\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\20\2\2z\31\3\2\2\2{~"+
		"\7\30\2\2|}\7\16\2\2}\177\7\30\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3"+
		"\2\2\2\u0080\u0082\7\34\2\2\u0081{\3\2\2\2\u0081\u0080\3\2\2\2\u0082\33"+
		"\3\2\2\2\u0083\u0084\7\24\2\2\u0084\u0085\7\6\2\2\u0085\u0086\7\f\2\2"+
		"\u0086\u0087\7\30\2\2\u0087\u0088\7\r\2\2\u0088\35\3\2\2\2\u0089\u008a"+
		"\7\24\2\2\u008a\u008b\7\4\2\2\u008b\u008c\7\f\2\2\u008c\u008d\7\33\2\2"+
		"\u008d\u008e\7\r\2\2\u008e\37\3\2\2\2\16%\63EHRUaitw~\u0081";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}