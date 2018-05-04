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
		FUN=1, REF=2, PID=3, BIN=4, COMMA=5, LSQUARE=6, RSQUARE=7, MAPOP=8, LCURLY=9, 
		RCURLY=10, LESSTHAN=11, GREATERTHAN=12, COLON=13, BINSTART=14, BINEND=15, 
		TRUE=16, FALSE=17, AT=18, HASH=19, DOT=20, ID=21, IDSTRING=22, INT=23, 
		FLOAT=24, PIDID=25, REFID=26, STRING=27, LINE_COMMENT=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Fun'", "'Ref'", "'Pid'", "'Bin'", "','", "'['", "']'", "'=>'", "'{'", 
		"'}'", "'<'", "'>'", "':'", "'<<'", "'>>'", "'true'", "'false'", "'@'", 
		"'#'", "'.'", "ID", "IDSTRING", "INT", "FLOAT", "PIDID", "REFID", "STRING", 
		"LINE_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"FUN", "REF", "PID", "BIN", "COMMA", "LSQUARE", "RSQUARE", "MAPOP", "LCURLY", 
		"RCURLY", "LESSTHAN", "GREATERTHAN", "COLON", "BINSTART", "BINEND", "TRUE", 
		"FALSE", "AT", "HASH", "DOT", "ID", "IDSTRING", "IDESC", "INT", "FLOAT", 
		"PIDID", "REFID", "DIGIT", "STRING", "ESC", "LINE_COMMENT", "WS"
	};


	    public static final int WHITESPACE = 1;
	    public static final int COMMENTS = 2;


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
		case 30: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 31: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = COMMENTS;  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = WHITESPACE;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\37\u0105\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\7\26\u0080\n\26\f\26\16\26\u0083\13\26\3\27\3\27\3\27"+
		"\7\27\u0088\n\27\f\27\16\27\u008b\13\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\5\30\u0093\n\30\3\31\5\31\u0096\n\31\3\31\6\31\u0099\n\31\r\31\16\31"+
		"\u009a\3\32\5\32\u009e\n\32\3\32\6\32\u00a1\n\32\r\32\16\32\u00a2\3\32"+
		"\3\32\7\32\u00a7\n\32\f\32\16\32\u00aa\13\32\3\32\5\32\u00ad\n\32\3\32"+
		"\3\32\6\32\u00b1\n\32\r\32\16\32\u00b2\5\32\u00b5\n\32\3\33\6\33\u00b8"+
		"\n\33\r\33\16\33\u00b9\3\33\3\33\6\33\u00be\n\33\r\33\16\33\u00bf\3\33"+
		"\3\33\6\33\u00c4\n\33\r\33\16\33\u00c5\3\34\6\34\u00c9\n\34\r\34\16\34"+
		"\u00ca\3\34\3\34\6\34\u00cf\n\34\r\34\16\34\u00d0\3\34\3\34\6\34\u00d5"+
		"\n\34\r\34\16\34\u00d6\3\34\3\34\6\34\u00db\n\34\r\34\16\34\u00dc\3\35"+
		"\3\35\3\36\3\36\3\36\7\36\u00e4\n\36\f\36\16\36\u00e7\13\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\5\37\u00ef\n\37\3 \3 \7 \u00f3\n \f \16 \u00f6\13"+
		" \3 \5 \u00f9\n \3 \3 \3 \3 \3!\6!\u0100\n!\r!\16!\u0101\3!\3!\5\u0089"+
		"\u00e5\u00f4\"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\2\1\61\31\1\63\32\1\65\33\1\67\34\19\2\1;\35\1="+
		"\2\1?\36\2A\37\3\3\2\5\3c|\7\60\60\62;B\\aac|\5\13\f\17\17\"\"\u011a\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\3C\3\2\2\2\5G\3\2\2\2\7K\3\2\2\2\tO\3\2\2\2\13S\3\2\2\2\rU\3\2\2"+
		"\2\17W\3\2\2\2\21Y\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31b\3"+
		"\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37i\3\2\2\2!l\3\2\2\2#q\3\2\2\2%w\3\2\2"+
		"\2\'y\3\2\2\2){\3\2\2\2+}\3\2\2\2-\u0084\3\2\2\2/\u0092\3\2\2\2\61\u0095"+
		"\3\2\2\2\63\u00b4\3\2\2\2\65\u00b7\3\2\2\2\67\u00c8\3\2\2\29\u00de\3\2"+
		"\2\2;\u00e0\3\2\2\2=\u00ee\3\2\2\2?\u00f0\3\2\2\2A\u00ff\3\2\2\2CD\7H"+
		"\2\2DE\7w\2\2EF\7p\2\2F\4\3\2\2\2GH\7T\2\2HI\7g\2\2IJ\7h\2\2J\6\3\2\2"+
		"\2KL\7R\2\2LM\7k\2\2MN\7f\2\2N\b\3\2\2\2OP\7D\2\2PQ\7k\2\2QR\7p\2\2R\n"+
		"\3\2\2\2ST\7.\2\2T\f\3\2\2\2UV\7]\2\2V\16\3\2\2\2WX\7_\2\2X\20\3\2\2\2"+
		"YZ\7?\2\2Z[\7@\2\2[\22\3\2\2\2\\]\7}\2\2]\24\3\2\2\2^_\7\177\2\2_\26\3"+
		"\2\2\2`a\7>\2\2a\30\3\2\2\2bc\7@\2\2c\32\3\2\2\2de\7<\2\2e\34\3\2\2\2"+
		"fg\7>\2\2gh\7>\2\2h\36\3\2\2\2ij\7@\2\2jk\7@\2\2k \3\2\2\2lm\7v\2\2mn"+
		"\7t\2\2no\7w\2\2op\7g\2\2p\"\3\2\2\2qr\7h\2\2rs\7c\2\2st\7n\2\2tu\7u\2"+
		"\2uv\7g\2\2v$\3\2\2\2wx\7B\2\2x&\3\2\2\2yz\7%\2\2z(\3\2\2\2{|\7\60\2\2"+
		"|*\3\2\2\2}\u0081\t\2\2\2~\u0080\t\3\2\2\177~\3\2\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082,\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0089\7)\2\2\u0085\u0088\5/\30\2\u0086\u0088\13\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7)\2\2\u008d.\3\2\2\2\u008e\u008f\7^\2\2\u008f\u0093\7)\2\2\u0090"+
		"\u0091\7^\2\2\u0091\u0093\7^\2\2\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2"+
		"\2\u0093\60\3\2\2\2\u0094\u0096\7/\2\2\u0095\u0094\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\59\35\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\62\3\2\2"+
		"\2\u009c\u009e\7/\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u00a1\59\35\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a8\5)"+
		"\25\2\u00a5\u00a7\59\35\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b5\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ad\7/\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\5)\25\2\u00af\u00b1\59\35\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u009d\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b5\64\3\2\2"+
		"\2\u00b6\u00b8\59\35\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\5)\25\2\u00bc"+
		"\u00be\59\35\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\5)\25\2\u00c2"+
		"\u00c4\59\35\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\66\3\2\2\2\u00c7\u00c9\59\35\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\5)\25\2\u00cd\u00cf\59\35\2\u00ce\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\5)\25\2\u00d3\u00d5\59\35\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00da\5)\25\2\u00d9\u00db\59\35\2\u00da\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"8\3\2\2\2\u00de\u00df\4\62;\2\u00df:\3\2\2\2\u00e0\u00e5\7$\2\2\u00e1"+
		"\u00e4\5=\37\2\u00e2\u00e4\13\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3"+
		"\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7$\2\2\u00e9<\3\2\2\2\u00ea"+
		"\u00eb\7^\2\2\u00eb\u00ef\7$\2\2\u00ec\u00ed\7^\2\2\u00ed\u00ef\7^\2\2"+
		"\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef>\3\2\2\2\u00f0\u00f4\7"+
		"\'\2\2\u00f1\u00f3\13\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f9\7\17\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\7\f\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b "+
		"\2\2\u00fd@\3\2\2\2\u00fe\u0100\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\b!\3\2\u0104B\3\2\2\2\34\2\u0081\u0087\u0089\u0092\u0095\u009a"+
		"\u009d\u00a2\u00a8\u00ac\u00b2\u00b4\u00b9\u00bf\u00c5\u00ca\u00d0\u00d6"+
		"\u00dc\u00e3\u00e5\u00ee\u00f4\u00f8\u0101";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}