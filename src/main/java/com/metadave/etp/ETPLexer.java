// Generated from ./src/main/java/com/metadave/etp/ETP.g4 by ANTLR 4.0
package com.metadave.etp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ETPLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUN=1, REF=2, COMMA=3, LSQUARE=4, RSQUARE=5, LCURLY=6, RCURLY=7, LESSTHAN=8, 
		GREATERTHAN=9, COLON=10, BINSTART=11, BINEND=12, TRUE=13, FALSE=14, AT=15, 
		HASH=16, DOT=17, ID=18, IDSTRING=19, INT=20, FLOAT=21, BINSTRING=22, STRING=23, 
		LINE_COMMENT=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Fun'", "'Ref'", "','", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "':'", 
		"'<<'", "'>>'", "'true'", "'false'", "'@'", "'#'", "'.'", "ID", "IDSTRING", 
		"INT", "FLOAT", "BINSTRING", "STRING", "LINE_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"FUN", "REF", "COMMA", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "LESSTHAN", 
		"GREATERTHAN", "COLON", "BINSTART", "BINEND", "TRUE", "FALSE", "AT", "HASH", 
		"DOT", "ID", "IDSTRING", "IDESC", "INT", "FLOAT", "DIGIT", "BINSTRING", 
		"STRING", "ESC", "LINE_COMMENT", "WS"
	};


	public ETPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ETP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 27: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\33\u00ca\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\7\23m\n\23\f\23\16\23p\13\23\3\24\3\24\3\24\7\24u\n\24\f\24\16\24"+
		"x\13\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0080\n\25\3\26\6\26\u0083"+
		"\n\26\r\26\16\26\u0084\3\27\6\27\u0088\n\27\r\27\16\27\u0089\3\27\3\27"+
		"\7\27\u008e\n\27\f\27\16\27\u0091\13\27\3\27\3\27\6\27\u0095\n\27\r\27"+
		"\16\27\u0096\5\27\u0099\n\27\3\30\3\30\3\31\3\31\7\31\u009f\n\31\f\31"+
		"\16\31\u00a2\13\31\3\31\3\31\3\32\3\32\3\32\7\32\u00a9\n\32\f\32\16\32"+
		"\u00ac\13\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00b4\n\33\3\34\3\34\7"+
		"\34\u00b8\n\34\f\34\16\34\u00bb\13\34\3\34\5\34\u00be\n\34\3\34\3\34\3"+
		"\34\3\34\3\35\6\35\u00c5\n\35\r\35\16\35\u00c6\3\35\3\35\6v\u00a0\u00aa"+
		"\u00b9\36\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\2\1+\26\1-\27\1/\2\1\61\30\1\63\31\1\65\2\1\67\32\29\33\3\3\2\5\3c|\6"+
		"\62;B\\aac|\5\13\f\17\17\"\"\u00d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2"+
		"\2\2\5?\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2"+
		"\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31V\3\2\2\2\33Y\3\2"+
		"\2\2\35^\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#h\3\2\2\2%j\3\2\2\2\'q\3\2\2\2"+
		")\177\3\2\2\2+\u0082\3\2\2\2-\u0098\3\2\2\2/\u009a\3\2\2\2\61\u009c\3"+
		"\2\2\2\63\u00a5\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00c4\3\2\2"+
		"\2;<\7H\2\2<=\7w\2\2=>\7p\2\2>\4\3\2\2\2?@\7T\2\2@A\7g\2\2AB\7h\2\2B\6"+
		"\3\2\2\2CD\7.\2\2D\b\3\2\2\2EF\7]\2\2F\n\3\2\2\2GH\7_\2\2H\f\3\2\2\2I"+
		"J\7}\2\2J\16\3\2\2\2KL\7\177\2\2L\20\3\2\2\2MN\7>\2\2N\22\3\2\2\2OP\7"+
		"@\2\2P\24\3\2\2\2QR\7<\2\2R\26\3\2\2\2ST\7>\2\2TU\7>\2\2U\30\3\2\2\2V"+
		"W\7@\2\2WX\7@\2\2X\32\3\2\2\2YZ\7v\2\2Z[\7t\2\2[\\\7w\2\2\\]\7g\2\2]\34"+
		"\3\2\2\2^_\7h\2\2_`\7c\2\2`a\7n\2\2ab\7u\2\2bc\7g\2\2c\36\3\2\2\2de\7"+
		"B\2\2e \3\2\2\2fg\7%\2\2g\"\3\2\2\2hi\7\60\2\2i$\3\2\2\2jn\t\2\2\2km\t"+
		"\3\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o&\3\2\2\2pn\3\2\2\2qv\7"+
		")\2\2ru\5)\25\2su\13\2\2\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3"+
		"\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7)\2\2z(\3\2\2\2{|\7^\2\2|\u0080\7)\2\2}"+
		"~\7^\2\2~\u0080\7^\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080*\3\2\2\2\u0081"+
		"\u0083\5/\30\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085,\3\2\2\2\u0086\u0088\5/\30\2\u0087\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008f\5#\22\2\u008c\u008e\5/\30\2\u008d\u008c\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0099\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\5#\22\2\u0093\u0095\5/"+
		"\30\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0087\3\2\2\2\u0098\u0092\3\2"+
		"\2\2\u0099.\3\2\2\2\u009a\u009b\4\62;\2\u009b\60\3\2\2\2\u009c\u00a0\7"+
		"$\2\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7$\2\2\u00a4\62\3\2\2\2\u00a5\u00aa\7$\2\2\u00a6\u00a9"+
		"\5\65\33\2\u00a7\u00a9\13\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2"+
		"\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7$\2\2\u00ae\64\3\2\2\2\u00af"+
		"\u00b0\7^\2\2\u00b0\u00b4\7$\2\2\u00b1\u00b2\7^\2\2\u00b2\u00b4\7^\2\2"+
		"\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\66\3\2\2\2\u00b5\u00b9"+
		"\7\'\2\2\u00b6\u00b8\13\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00be\7\17\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\b\34\2\2\u00c28\3\2\2\2\u00c3\u00c5\t\4\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\b\35\3\2\u00c9:\3\2\2\2\23\2ntv\177\u0084\u0089\u008f"+
		"\u0096\u0098\u00a0\u00a8\u00aa\u00b3\u00b9\u00bd\u00c6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}