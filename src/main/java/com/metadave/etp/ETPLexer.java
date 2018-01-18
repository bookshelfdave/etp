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
		FUN=1, REF=2, PID=3, BIN=4, COMMA=5, LSQUARE=6, RSQUARE=7, LCURLY=8, RCURLY=9, 
		LESSTHAN=10, GREATERTHAN=11, COLON=12, BINSTART=13, BINEND=14, TRUE=15, 
		FALSE=16, AT=17, HASH=18, DOT=19, ID=20, IDSTRING=21, INT=22, FLOAT=23, 
		PIDID=24, REFID=25, STRING=26, LINE_COMMENT=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Fun'", "'Ref'", "'Pid'", "'Bin'", "','", "'['", "']'", "'{'", "'}'", 
		"'<'", "'>'", "':'", "'<<'", "'>>'", "'true'", "'false'", "'@'", "'#'", 
		"'.'", "ID", "IDSTRING", "INT", "FLOAT", "PIDID", "REFID", "STRING", "LINE_COMMENT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"FUN", "REF", "PID", "BIN", "COMMA", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", 
		"LESSTHAN", "GREATERTHAN", "COLON", "BINSTART", "BINEND", "TRUE", "FALSE", 
		"AT", "HASH", "DOT", "ID", "IDSTRING", "IDESC", "INT", "FLOAT", "PIDID", 
		"REFID", "DIGIT", "STRING", "ESC", "LINE_COMMENT", "WS"
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
		case 29: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 30: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\36\u0100\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7"+
		"\25{\n\25\f\25\16\25~\13\25\3\26\3\26\3\26\7\26\u0083\n\26\f\26\16\26"+
		"\u0086\13\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u008e\n\27\3\30\5\30\u0091"+
		"\n\30\3\30\6\30\u0094\n\30\r\30\16\30\u0095\3\31\5\31\u0099\n\31\3\31"+
		"\6\31\u009c\n\31\r\31\16\31\u009d\3\31\3\31\7\31\u00a2\n\31\f\31\16\31"+
		"\u00a5\13\31\3\31\5\31\u00a8\n\31\3\31\3\31\6\31\u00ac\n\31\r\31\16\31"+
		"\u00ad\5\31\u00b0\n\31\3\32\6\32\u00b3\n\32\r\32\16\32\u00b4\3\32\3\32"+
		"\6\32\u00b9\n\32\r\32\16\32\u00ba\3\32\3\32\6\32\u00bf\n\32\r\32\16\32"+
		"\u00c0\3\33\6\33\u00c4\n\33\r\33\16\33\u00c5\3\33\3\33\6\33\u00ca\n\33"+
		"\r\33\16\33\u00cb\3\33\3\33\6\33\u00d0\n\33\r\33\16\33\u00d1\3\33\3\33"+
		"\6\33\u00d6\n\33\r\33\16\33\u00d7\3\34\3\34\3\35\3\35\3\35\7\35\u00df"+
		"\n\35\f\35\16\35\u00e2\13\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u00ea"+
		"\n\36\3\37\3\37\7\37\u00ee\n\37\f\37\16\37\u00f1\13\37\3\37\5\37\u00f4"+
		"\n\37\3\37\3\37\3\37\3\37\3 \6 \u00fb\n \r \16 \u00fc\3 \3 \5\u0084\u00e0"+
		"\u00ef!\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\2\1/\30\1\61\31\1\63\32\1\65\33\1\67\2\19\34\1;\2\1=\35\2"+
		"?\36\3\3\2\5\3c|\7\60\60\62;B\\aac|\5\13\f\17\17\"\"\u0115\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\29\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5E\3\2\2"+
		"\2\7I\3\2\2\2\tM\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2"+
		"\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35d\3\2"+
		"\2\2\37g\3\2\2\2!l\3\2\2\2#r\3\2\2\2%t\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+\177"+
		"\3\2\2\2-\u008d\3\2\2\2/\u0090\3\2\2\2\61\u00af\3\2\2\2\63\u00b2\3\2\2"+
		"\2\65\u00c3\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00e9\3\2\2\2=\u00eb"+
		"\3\2\2\2?\u00fa\3\2\2\2AB\7H\2\2BC\7w\2\2CD\7p\2\2D\4\3\2\2\2EF\7T\2\2"+
		"FG\7g\2\2GH\7h\2\2H\6\3\2\2\2IJ\7R\2\2JK\7k\2\2KL\7f\2\2L\b\3\2\2\2MN"+
		"\7D\2\2NO\7k\2\2OP\7p\2\2P\n\3\2\2\2QR\7.\2\2R\f\3\2\2\2ST\7]\2\2T\16"+
		"\3\2\2\2UV\7_\2\2V\20\3\2\2\2WX\7}\2\2X\22\3\2\2\2YZ\7\177\2\2Z\24\3\2"+
		"\2\2[\\\7>\2\2\\\26\3\2\2\2]^\7@\2\2^\30\3\2\2\2_`\7<\2\2`\32\3\2\2\2"+
		"ab\7>\2\2bc\7>\2\2c\34\3\2\2\2de\7@\2\2ef\7@\2\2f\36\3\2\2\2gh\7v\2\2"+
		"hi\7t\2\2ij\7w\2\2jk\7g\2\2k \3\2\2\2lm\7h\2\2mn\7c\2\2no\7n\2\2op\7u"+
		"\2\2pq\7g\2\2q\"\3\2\2\2rs\7B\2\2s$\3\2\2\2tu\7%\2\2u&\3\2\2\2vw\7\60"+
		"\2\2w(\3\2\2\2x|\t\2\2\2y{\t\3\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}*\3\2\2\2~|\3\2\2\2\177\u0084\7)\2\2\u0080\u0083\5-\27\2\u0081\u0083"+
		"\13\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\7)\2\2\u0088,\3\2\2\2\u0089\u008a\7^\2\2\u008a\u008e"+
		"\7)\2\2\u008b\u008c\7^\2\2\u008c\u008e\7^\2\2\u008d\u0089\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e.\3\2\2\2\u008f\u0091\7/\2\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\5\67\34\2\u0093\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\60\3\2\2\2\u0097\u0099\7/\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2"+
		"\u0099\u009b\3\2\2\2\u009a\u009c\5\67\34\2\u009b\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a3\5\'\24\2\u00a0\u00a2\5\67\34\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00b0\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a8\7/\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\5\'\24\2\u00aa\u00ac\5\67\34\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u0098\3\2\2\2\u00af\u00a7\3\2\2\2\u00b0"+
		"\62\3\2\2\2\u00b1\u00b3\5\67\34\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b8\5\'\24\2\u00b7\u00b9\5\67\34\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\5\'\24\2\u00bd\u00bf\5\67\34\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\64\3\2\2\2\u00c2"+
		"\u00c4\5\67\34\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\5\'\24\2\u00c8"+
		"\u00ca\5\67\34\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\5\'\24\2\u00ce"+
		"\u00d0\5\67\34\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\5\'\24\2\u00d4"+
		"\u00d6\5\67\34\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\66\3\2\2\2\u00d9\u00da\4\62;\2\u00da"+
		"8\3\2\2\2\u00db\u00e0\7$\2\2\u00dc\u00df\5;\36\2\u00dd\u00df\13\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7$\2\2\u00e4:\3\2\2\2\u00e5\u00e6\7^\2\2\u00e6\u00ea\7$\2\2\u00e7"+
		"\u00e8\7^\2\2\u00e8\u00ea\7^\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e7\3\2\2"+
		"\2\u00ea<\3\2\2\2\u00eb\u00ef\7\'\2\2\u00ec\u00ee\13\2\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\7\17\2\2\u00f3\u00f2\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\f\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\b\37\2\2\u00f8>\3\2\2\2\u00f9\u00fb\t\4\2\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b \3\2\u00ff@\3\2\2\2\34\2|\u0082"+
		"\u0084\u008d\u0090\u0095\u0098\u009d\u00a3\u00a7\u00ad\u00af\u00b4\u00ba"+
		"\u00c0\u00c5\u00cb\u00d1\u00d7\u00de\u00e0\u00e9\u00ef\u00f3\u00fc";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}