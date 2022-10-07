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
		FUN=1, REF=2, PID=3, BIN=4, COMMA=5, LSQUARE=6, RSQUARE=7, MAPOP=8, LCURLY=9, 
		RCURLY=10, LESSTHAN=11, GREATERTHAN=12, COLON=13, BINSTART=14, BINEND=15, 
		TRUE=16, FALSE=17, AT=18, HASH=19, DOT=20, ID=21, IDSTRING=22, INT=23, 
		FLOAT=24, PIDID=25, REFID=26, STRING=27, LINE_COMMENT=28, WS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'Fun'", "'Ref'", "'Pid'", "'Bin'", "','", "'['", "']'", 
		"'=>'", "'{'", "'}'", "'<'", "'>'", "':'", "'<<'", "'>>'", "'true'", "'false'", 
		"'@'", "'#'", "'.'", "ID", "IDSTRING", "INT", "FLOAT", "PIDID", "REFID", 
		"STRING", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_etp_terms = 0, RULE_etp_term = 1, RULE_etp_int = 2, RULE_etp_float = 3, 
		RULE_etp_string = 4, RULE_etp_atom = 5, RULE_etp_bool = 6, RULE_etp_map = 7, 
		RULE_etp_kv = 8, RULE_etp_list = 9, RULE_etp_tuple = 10, RULE_etp_pid = 11, 
		RULE_etp_fun = 12, RULE_etp_binary = 13, RULE_etp_binary_item = 14, RULE_etp_binary_fake = 15, 
		RULE_etp_ref = 16;
	public static final String[] ruleNames = {
		"etp_terms", "etp_term", "etp_int", "etp_float", "etp_string", "etp_atom", 
		"etp_bool", "etp_map", "etp_kv", "etp_list", "etp_tuple", "etp_pid", "etp_fun", 
		"etp_binary", "etp_binary_item", "etp_binary_fake", "etp_ref"
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); etp_term();
				setState(35); match(DOT);
				}
				}
				setState(39); 
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
		public Etp_mapContext etp_map() {
			return getRuleContext(Etp_mapContext.class,0);
		}
		public Etp_listContext etp_list() {
			return getRuleContext(Etp_listContext.class,0);
		}
		public Etp_stringContext etp_string() {
			return getRuleContext(Etp_stringContext.class,0);
		}
		public Etp_refContext etp_ref() {
			return getRuleContext(Etp_refContext.class,0);
		}
		public Etp_intContext etp_int() {
			return getRuleContext(Etp_intContext.class,0);
		}
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
		public Etp_binaryContext etp_binary() {
			return getRuleContext(Etp_binaryContext.class,0);
		}
		public Etp_tupleContext etp_tuple() {
			return getRuleContext(Etp_tupleContext.class,0);
		}
		public Etp_atomContext etp_atom() {
			return getRuleContext(Etp_atomContext.class,0);
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
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); etp_atom();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); etp_int();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43); etp_float();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44); etp_string();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45); etp_bool();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46); etp_list();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47); etp_tuple();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(48); etp_map();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(49); etp_binary();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(50); etp_binary_fake();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(51); etp_pid();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(52); etp_fun();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(53); etp_ref();
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
			setState(56); match(INT);
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
			setState(58); match(FLOAT);
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
			setState(60); match(STRING);
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
			setState(62);
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
			setState(64);
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

	public static class Etp_mapContext extends ParserRuleContext {
		public Etp_kvContext etp_kv;
		public List<Etp_kvContext> kvs = new ArrayList<Etp_kvContext>();
		public List<TerminalNode> COMMA() { return getTokens(ETPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ETPParser.COMMA, i);
		}
		public TerminalNode LCURLY() { return getToken(ETPParser.LCURLY, 0); }
		public List<Etp_kvContext> etp_kv() {
			return getRuleContexts(Etp_kvContext.class);
		}
		public Etp_kvContext etp_kv(int i) {
			return getRuleContext(Etp_kvContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(ETPParser.RCURLY, 0); }
		public TerminalNode HASH() { return getToken(ETPParser.HASH, 0); }
		public Etp_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_map(this);
		}
	}

	public final Etp_mapContext etp_map() throws RecognitionException {
		Etp_mapContext _localctx = new Etp_mapContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_etp_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(HASH);
			setState(67); match(LCURLY);
			setState(76);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << LESSTHAN) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << HASH) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(68); ((Etp_mapContext)_localctx).etp_kv = etp_kv();
				((Etp_mapContext)_localctx).kvs.add(((Etp_mapContext)_localctx).etp_kv);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(69); match(COMMA);
					setState(70); ((Etp_mapContext)_localctx).etp_kv = etp_kv();
					((Etp_mapContext)_localctx).kvs.add(((Etp_mapContext)_localctx).etp_kv);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(78); match(RCURLY);
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

	public static class Etp_kvContext extends ParserRuleContext {
		public Etp_termContext map_key;
		public Etp_termContext map_val;
		public List<Etp_termContext> etp_term() {
			return getRuleContexts(Etp_termContext.class);
		}
		public Etp_termContext etp_term(int i) {
			return getRuleContext(Etp_termContext.class,i);
		}
		public TerminalNode MAPOP() { return getToken(ETPParser.MAPOP, 0); }
		public Etp_kvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etp_kv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).enterEtp_kv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ETPListener ) ((ETPListener)listener).exitEtp_kv(this);
		}
	}

	public final Etp_kvContext etp_kv() throws RecognitionException {
		Etp_kvContext _localctx = new Etp_kvContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_etp_kv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); ((Etp_kvContext)_localctx).map_key = etp_term();
			setState(81); match(MAPOP);
			setState(82); ((Etp_kvContext)_localctx).map_val = etp_term();
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
		enterRule(_localctx, 18, RULE_etp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(LSQUARE);
			setState(93);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << LESSTHAN) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << HASH) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(85); ((Etp_listContext)_localctx).etp_term = etp_term();
				((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(86); match(COMMA);
					setState(87); ((Etp_listContext)_localctx).etp_term = etp_term();
					((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(95); match(RSQUARE);
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
		enterRule(_localctx, 20, RULE_etp_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(LCURLY);
			setState(106);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << LESSTHAN) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << HASH) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(98); ((Etp_tupleContext)_localctx).etp_term = etp_term();
				((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99); match(COMMA);
					setState(100); ((Etp_tupleContext)_localctx).etp_term = etp_term();
					((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108); match(RCURLY);
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
		enterRule(_localctx, 22, RULE_etp_pid);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case LESSTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); match(LESSTHAN);
				setState(111); match(PIDID);
				setState(112); match(GREATERTHAN);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); match(HASH);
				setState(114); match(PID);
				setState(115); match(LESSTHAN);
				setState(116); match(ID);
				setState(117); match(GREATERTHAN);
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
		enterRule(_localctx, 24, RULE_etp_fun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(HASH);
			setState(121); match(FUN);
			setState(122); match(LESSTHAN);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(123);
					matchWildcard();
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(129); match(GREATERTHAN);
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
		enterRule(_localctx, 26, RULE_etp_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(BINSTART);
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(132); ((Etp_binaryContext)_localctx).etp_binary_item = etp_binary_item();
				((Etp_binaryContext)_localctx).segments.add(((Etp_binaryContext)_localctx).etp_binary_item);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(133); match(COMMA);
					setState(134); ((Etp_binaryContext)_localctx).etp_binary_item = etp_binary_item();
					((Etp_binaryContext)_localctx).segments.add(((Etp_binaryContext)_localctx).etp_binary_item);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(142); match(BINEND);
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
		public Token STRING;
		public List<Token> strlines = new ArrayList<Token>();
		public List<TerminalNode> STRING() { return getTokens(ETPParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ETPParser.STRING, i);
		}
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
		enterRule(_localctx, 28, RULE_etp_binary_item);
		int _la;
		try {
			setState(158);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); ((Etp_binary_itemContext)_localctx).val = match(INT);
				setState(147);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(145); match(COLON);
					setState(146); ((Etp_binary_itemContext)_localctx).size = match(INT);
					}
				}

				}
				break;
			case COMMA:
			case BINEND:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(149); ((Etp_binary_itemContext)_localctx).STRING = match(STRING);
					((Etp_binary_itemContext)_localctx).strlines.add(((Etp_binary_itemContext)_localctx).STRING);
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==STRING) {
						{
						{
						setState(150); ((Etp_binary_itemContext)_localctx).STRING = match(STRING);
						((Etp_binary_itemContext)_localctx).strlines.add(((Etp_binary_itemContext)_localctx).STRING);
						}
						}
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

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
		enterRule(_localctx, 30, RULE_etp_binary_fake);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(HASH);
			setState(161); match(BIN);
			setState(162); match(LESSTHAN);
			setState(163); ((Etp_binary_fakeContext)_localctx).size = match(INT);
			setState(164); match(GREATERTHAN);
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
		enterRule(_localctx, 32, RULE_etp_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(HASH);
			setState(167); match(REF);
			setState(168); match(LESSTHAN);
			setState(169); match(REFID);
			setState(170); match(GREATERTHAN);
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
		"\2\3\37\u00af\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\3\2\3\2\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tJ\n\t\f\t\16\tM\13\t\5\tO\n\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13[\n\13\f\13\16\13^\13"+
		"\13\5\13`\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\5\fm"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\ry\n\r\3\16\3\16\3\16\3"+
		"\16\7\16\177\n\16\f\16\16\16\u0082\13\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\7\17\u008a\n\17\f\17\16\17\u008d\13\17\5\17\u008f\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\5\20\u0096\n\20\3\20\3\20\7\20\u009a\n\20\f\20\16\20\u009d"+
		"\13\20\5\20\u009f\n\20\5\20\u00a1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\u0080\23\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"\2\4\3\27\30\3\22\23\u00b8\2\'\3\2\2\2\48\3\2\2\2\6:\3"+
		"\2\2\2\b<\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20D\3\2\2\2\22R\3"+
		"\2\2\2\24V\3\2\2\2\26c\3\2\2\2\30x\3\2\2\2\32z\3\2\2\2\34\u0085\3\2\2"+
		"\2\36\u00a0\3\2\2\2 \u00a2\3\2\2\2\"\u00a8\3\2\2\2$%\5\4\3\2%&\7\26\2"+
		"\2&(\3\2\2\2\'$\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+9\5"+
		"\f\7\2,9\5\6\4\2-9\5\b\5\2.9\5\n\6\2/9\5\16\b\2\609\5\24\13\2\619\5\26"+
		"\f\2\629\5\20\t\2\639\5\34\17\2\649\5 \21\2\659\5\30\r\2\669\5\32\16\2"+
		"\679\5\"\22\28+\3\2\2\28,\3\2\2\28-\3\2\2\28.\3\2\2\28/\3\2\2\28\60\3"+
		"\2\2\28\61\3\2\2\28\62\3\2\2\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66"+
		"\3\2\2\28\67\3\2\2\29\5\3\2\2\2:;\7\31\2\2;\7\3\2\2\2<=\7\32\2\2=\t\3"+
		"\2\2\2>?\7\35\2\2?\13\3\2\2\2@A\t\2\2\2A\r\3\2\2\2BC\t\3\2\2C\17\3\2\2"+
		"\2DE\7\25\2\2EN\7\13\2\2FK\5\22\n\2GH\7\7\2\2HJ\5\22\n\2IG\3\2\2\2JM\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NF\3\2\2\2NO\3\2\2\2OP\3"+
		"\2\2\2PQ\7\f\2\2Q\21\3\2\2\2RS\5\4\3\2ST\7\n\2\2TU\5\4\3\2U\23\3\2\2\2"+
		"V_\7\b\2\2W\\\5\4\3\2XY\7\7\2\2Y[\5\4\3\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_W\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\t"+
		"\2\2b\25\3\2\2\2cl\7\13\2\2di\5\4\3\2ef\7\7\2\2fh\5\4\3\2ge\3\2\2\2hk"+
		"\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2ld\3\2\2\2lm\3\2\2\2m"+
		"n\3\2\2\2no\7\f\2\2o\27\3\2\2\2pq\7\r\2\2qr\7\33\2\2ry\7\16\2\2st\7\25"+
		"\2\2tu\7\5\2\2uv\7\r\2\2vw\7\27\2\2wy\7\16\2\2xp\3\2\2\2xs\3\2\2\2y\31"+
		"\3\2\2\2z{\7\25\2\2{|\7\3\2\2|\u0080\7\r\2\2}\177\13\2\2\2~}\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0084\7\16\2\2\u0084\33\3\2\2\2\u0085\u008e"+
		"\7\20\2\2\u0086\u008b\5\36\20\2\u0087\u0088\7\7\2\2\u0088\u008a\5\36\20"+
		"\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0086\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\21\2\2\u0091\35\3\2\2"+
		"\2\u0092\u0095\7\31\2\2\u0093\u0094\7\17\2\2\u0094\u0096\7\31\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00a1\3\2\2\2\u0097\u009b\7\35"+
		"\2\2\u0098\u009a\7\35\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u0097\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u0092\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\37\3\2\2\2\u00a2\u00a3\7\25\2"+
		"\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\7\31\2\2\u00a6"+
		"\u00a7\7\16\2\2\u00a7!\3\2\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\7\4\2"+
		"\2\u00aa\u00ab\7\r\2\2\u00ab\u00ac\7\34\2\2\u00ac\u00ad\7\16\2\2\u00ad"+
		"#\3\2\2\2\22)8KN\\_ilx\u0080\u008b\u008e\u0095\u009b\u009e\u00a0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}