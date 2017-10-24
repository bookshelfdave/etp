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
		FUN=1, REF=2, PID=3, COMMA=4, LSQUARE=5, RSQUARE=6, LCURLY=7, RCURLY=8, 
		LESSTHAN=9, GREATERTHAN=10, COLON=11, BINSTART=12, BINEND=13, TRUE=14, 
		FALSE=15, AT=16, HASH=17, DOT=18, ID=19, IDSTRING=20, INT=21, FLOAT=22, 
		PIDID=23, REFID=24, STRING=25, LINE_COMMENT=26, WS=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'Fun'", "'Ref'", "'Pid'", "','", "'['", "']'", "'{'", "'}'", 
		"'<'", "'>'", "':'", "'<<'", "'>>'", "'true'", "'false'", "'@'", "'#'", 
		"'.'", "ID", "IDSTRING", "INT", "FLOAT", "PIDID", "REFID", "STRING", "LINE_COMMENT", 
		"WS"
	};
	public static final int
		RULE_etp_terms = 0, RULE_etp_term = 1, RULE_etp_int = 2, RULE_etp_float = 3, 
		RULE_etp_string = 4, RULE_etp_atom = 5, RULE_etp_bool = 6, RULE_etp_list = 7, 
		RULE_etp_tuple = 8, RULE_etp_pid = 9, RULE_etp_fun = 10, RULE_etp_binary = 11, 
		RULE_etp_binary_item = 12, RULE_etp_ref = 13;
	public static final String[] ruleNames = {
		"etp_terms", "etp_term", "etp_int", "etp_float", "etp_string", "etp_atom", 
		"etp_bool", "etp_list", "etp_tuple", "etp_pid", "etp_fun", "etp_binary", 
		"etp_binary_item", "etp_ref"
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
		public TerminalNode DOT(int i) {
			return getToken(ETPParser.DOT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ETPParser.DOT); }
		public Etp_termContext etp_term(int i) {
			return getRuleContext(Etp_termContext.class,i);
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28); etp_term();
				setState(29); match(DOT);
				}
				}
				setState(33); 
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
		public Etp_refContext etp_ref() {
			return getRuleContext(Etp_refContext.class,0);
		}
		public Etp_floatContext etp_float() {
			return getRuleContext(Etp_floatContext.class,0);
		}
		public Etp_pidContext etp_pid() {
			return getRuleContext(Etp_pidContext.class,0);
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
		public Etp_funContext etp_fun() {
			return getRuleContext(Etp_funContext.class,0);
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
		enterRule(_localctx, 2, RULE_etp_term);
		try {
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); etp_atom();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); etp_int();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37); etp_float();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38); etp_string();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39); etp_bool();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40); etp_list();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(41); etp_tuple();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(42); etp_binary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(43); etp_pid();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(44); etp_fun();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(45); etp_ref();
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
			setState(48); match(INT);
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
			setState(50); match(FLOAT);
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
			setState(52); match(STRING);
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
		enterRule(_localctx, 10, RULE_etp_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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
		enterRule(_localctx, 12, RULE_etp_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
		enterRule(_localctx, 14, RULE_etp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(LSQUARE);
			setState(67);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << LESSTHAN) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << HASH) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(59); ((Etp_listContext)_localctx).etp_term = etp_term();
				((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(60); match(COMMA);
					setState(61); ((Etp_listContext)_localctx).etp_term = etp_term();
					((Etp_listContext)_localctx).listitems.add(((Etp_listContext)_localctx).etp_term);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(69); match(RSQUARE);
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
		enterRule(_localctx, 16, RULE_etp_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(LCURLY);
			setState(80);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSQUARE) | (1L << LCURLY) | (1L << LESSTHAN) | (1L << BINSTART) | (1L << TRUE) | (1L << FALSE) | (1L << HASH) | (1L << ID) | (1L << IDSTRING) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(72); ((Etp_tupleContext)_localctx).etp_term = etp_term();
				((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(73); match(COMMA);
					setState(74); ((Etp_tupleContext)_localctx).etp_term = etp_term();
					((Etp_tupleContext)_localctx).tupleitems.add(((Etp_tupleContext)_localctx).etp_term);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(82); match(RCURLY);
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
		public TerminalNode HASH() { return getToken(ETPParser.HASH, 0); }
		public TerminalNode LESSTHAN() { return getToken(ETPParser.LESSTHAN, 0); }
		public TerminalNode PID() { return getToken(ETPParser.PID, 0); }
		public TerminalNode ID() { return getToken(ETPParser.ID, 0); }
		public TerminalNode PIDID() { return getToken(ETPParser.PIDID, 0); }
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
		enterRule(_localctx, 18, RULE_etp_pid);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case LESSTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(LESSTHAN);
				setState(85); match(PIDID);
				setState(86); match(GREATERTHAN);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); match(HASH);
				setState(88); match(PID);
				setState(89); match(LESSTHAN);
				setState(90); match(ID);
				setState(91); match(GREATERTHAN);
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
		enterRule(_localctx, 20, RULE_etp_fun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(HASH);
			setState(95); match(FUN);
			setState(96); match(LESSTHAN);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(97);
					matchWildcard();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(103); match(GREATERTHAN);
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
		enterRule(_localctx, 22, RULE_etp_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(BINSTART);
			setState(114);
			_la = _input.LA(1);
			if (_la==INT || _la==STRING) {
				{
				setState(106); ((Etp_binaryContext)_localctx).etp_binary_item = etp_binary_item();
				((Etp_binaryContext)_localctx).segments.add(((Etp_binaryContext)_localctx).etp_binary_item);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(107); match(COMMA);
					setState(108); ((Etp_binaryContext)_localctx).etp_binary_item = etp_binary_item();
					((Etp_binaryContext)_localctx).segments.add(((Etp_binaryContext)_localctx).etp_binary_item);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(116); match(BINEND);
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
		public List<TerminalNode> INT() { return getTokens(ETPParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ETPParser.INT, i);
		}
		public TerminalNode STRING() { return getToken(ETPParser.STRING, 0); }
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
			setState(124);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); ((Etp_binary_itemContext)_localctx).val = match(INT);
				setState(121);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(119); match(COLON);
					setState(120); ((Etp_binary_itemContext)_localctx).size = match(INT);
					}
				}

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); match(STRING);
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
		public TerminalNode HASH() { return getToken(ETPParser.HASH, 0); }
		public TerminalNode LESSTHAN() { return getToken(ETPParser.LESSTHAN, 0); }
		public TerminalNode REFID() { return getToken(ETPParser.REFID, 0); }
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
		enterRule(_localctx, 26, RULE_etp_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(HASH);
			setState(127); match(REF);
			setState(128); match(LESSTHAN);
			setState(129); match(REFID);
			setState(130); match(GREATERTHAN);
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
		"\2\3\35\u0087\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2"+
		"\3\2\6\2\"\n\2\r\2\16\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\61\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"A\n\t\f\t\16\tD\13\t\5\tF\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nN\n\n\f\n\16"+
		"\nQ\13\n\5\nS\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"_\n\13\3\f\3\f\3\f\3\f\7\fe\n\f\f\f\16\fh\13\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\7\rp\n\r\f\r\16\rs\13\r\5\ru\n\r\3\r\3\r\3\16\3\16\3\16\5\16|\n\16\3"+
		"\16\5\16\177\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3f\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\4\3\25\26\3\20\21\u008d\2!\3\2\2\2\4\60\3\2"+
		"\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20"+
		"<\3\2\2\2\22I\3\2\2\2\24^\3\2\2\2\26`\3\2\2\2\30k\3\2\2\2\32~\3\2\2\2"+
		"\34\u0080\3\2\2\2\36\37\5\4\3\2\37 \7\24\2\2 \"\3\2\2\2!\36\3\2\2\2\""+
		"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%\61\5\f\7\2&\61\5\6\4\2\'\61"+
		"\5\b\5\2(\61\5\n\6\2)\61\5\16\b\2*\61\5\20\t\2+\61\5\22\n\2,\61\5\30\r"+
		"\2-\61\5\24\13\2.\61\5\26\f\2/\61\5\34\17\2\60%\3\2\2\2\60&\3\2\2\2\60"+
		"\'\3\2\2\2\60(\3\2\2\2\60)\3\2\2\2\60*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2"+
		"\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\63\7\27\2\2\63\7"+
		"\3\2\2\2\64\65\7\30\2\2\65\t\3\2\2\2\66\67\7\33\2\2\67\13\3\2\2\289\t"+
		"\2\2\29\r\3\2\2\2:;\t\3\2\2;\17\3\2\2\2<E\7\7\2\2=B\5\4\3\2>?\7\6\2\2"+
		"?A\5\4\3\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"E=\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\b\2\2H\21\3\2\2\2IR\7\t\2\2JO\5\4\3"+
		"\2KL\7\6\2\2LN\5\4\3\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2"+
		"\2QO\3\2\2\2RJ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\n\2\2U\23\3\2\2\2VW\7\13"+
		"\2\2WX\7\31\2\2X_\7\f\2\2YZ\7\23\2\2Z[\7\5\2\2[\\\7\13\2\2\\]\7\25\2\2"+
		"]_\7\f\2\2^V\3\2\2\2^Y\3\2\2\2_\25\3\2\2\2`a\7\23\2\2ab\7\3\2\2bf\7\13"+
		"\2\2ce\13\2\2\2dc\3\2\2\2eh\3\2\2\2fg\3\2\2\2fd\3\2\2\2gi\3\2\2\2hf\3"+
		"\2\2\2ij\7\f\2\2j\27\3\2\2\2kt\7\16\2\2lq\5\32\16\2mn\7\6\2\2np\5\32\16"+
		"\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2"+
		"\2tu\3\2\2\2uv\3\2\2\2vw\7\17\2\2w\31\3\2\2\2x{\7\27\2\2yz\7\r\2\2z|\7"+
		"\27\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}\177\7\33\2\2~x\3\2\2\2~}\3\2"+
		"\2\2\177\33\3\2\2\2\u0080\u0081\7\23\2\2\u0081\u0082\7\4\2\2\u0082\u0083"+
		"\7\13\2\2\u0083\u0084\7\32\2\2\u0084\u0085\7\f\2\2\u0085\35\3\2\2\2\16"+
		"#\60BEOR^fqt{~";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}