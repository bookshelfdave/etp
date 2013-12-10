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
		HASH=16, DOT=17, ID=18, IDSTRING=19, INT=20, FLOAT=21, PID=22, REFID=23, 
		STRING=24, LINE_COMMENT=25, WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Fun'", "'Ref'", "','", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "':'", 
		"'<<'", "'>>'", "'true'", "'false'", "'@'", "'#'", "'.'", "ID", "IDSTRING", 
		"INT", "FLOAT", "PID", "REFID", "STRING", "LINE_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"FUN", "REF", "COMMA", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "LESSTHAN", 
		"GREATERTHAN", "COLON", "BINSTART", "BINEND", "TRUE", "FALSE", "AT", "HASH", 
		"DOT", "ID", "IDSTRING", "IDESC", "INT", "FLOAT", "PID", "REFID", "DIGIT", 
		"STRING", "ESC", "LINE_COMMENT", "WS"
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
		case 27: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 28: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = WHITESPACE;  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = COMMENTS;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\34\u00f4\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\7\23o\n\23\f\23\16\23r\13\23\3\24\3\24\3\24\7\24w\n\24\f"+
		"\24\16\24z\13\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0082\n\25\3\26\5"+
		"\26\u0085\n\26\3\26\6\26\u0088\n\26\r\26\16\26\u0089\3\27\5\27\u008d\n"+
		"\27\3\27\6\27\u0090\n\27\r\27\16\27\u0091\3\27\3\27\7\27\u0096\n\27\f"+
		"\27\16\27\u0099\13\27\3\27\5\27\u009c\n\27\3\27\3\27\6\27\u00a0\n\27\r"+
		"\27\16\27\u00a1\5\27\u00a4\n\27\3\30\6\30\u00a7\n\30\r\30\16\30\u00a8"+
		"\3\30\3\30\6\30\u00ad\n\30\r\30\16\30\u00ae\3\30\3\30\6\30\u00b3\n\30"+
		"\r\30\16\30\u00b4\3\31\6\31\u00b8\n\31\r\31\16\31\u00b9\3\31\3\31\6\31"+
		"\u00be\n\31\r\31\16\31\u00bf\3\31\3\31\6\31\u00c4\n\31\r\31\16\31\u00c5"+
		"\3\31\3\31\6\31\u00ca\n\31\r\31\16\31\u00cb\3\32\3\32\3\33\3\33\3\33\7"+
		"\33\u00d3\n\33\f\33\16\33\u00d6\13\33\3\33\3\33\3\34\3\34\3\34\3\34\5"+
		"\34\u00de\n\34\3\35\3\35\7\35\u00e2\n\35\f\35\16\35\u00e5\13\35\3\35\5"+
		"\35\u00e8\n\35\3\35\3\35\3\35\3\35\3\36\6\36\u00ef\n\36\r\36\16\36\u00f0"+
		"\3\36\3\36\5x\u00d4\u00e3\37\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\2\1+\26\1-\27\1/\30\1\61\31\1\63\2\1\65\32\1\67\2"+
		"\19\33\2;\34\3\3\2\5\3c|\7\60\60\62;B\\aac|\5\13\f\17\17\"\"\u0109\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7E\3\2\2\2\t"+
		"G\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25"+
		"S\3\2\2\2\27U\3\2\2\2\31X\3\2\2\2\33[\3\2\2\2\35`\3\2\2\2\37f\3\2\2\2"+
		"!h\3\2\2\2#j\3\2\2\2%l\3\2\2\2\'s\3\2\2\2)\u0081\3\2\2\2+\u0084\3\2\2"+
		"\2-\u00a3\3\2\2\2/\u00a6\3\2\2\2\61\u00b7\3\2\2\2\63\u00cd\3\2\2\2\65"+
		"\u00cf\3\2\2\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00ee\3\2\2\2=>\7H\2\2"+
		">?\7w\2\2?@\7p\2\2@\4\3\2\2\2AB\7T\2\2BC\7g\2\2CD\7h\2\2D\6\3\2\2\2EF"+
		"\7.\2\2F\b\3\2\2\2GH\7]\2\2H\n\3\2\2\2IJ\7_\2\2J\f\3\2\2\2KL\7}\2\2L\16"+
		"\3\2\2\2MN\7\177\2\2N\20\3\2\2\2OP\7>\2\2P\22\3\2\2\2QR\7@\2\2R\24\3\2"+
		"\2\2ST\7<\2\2T\26\3\2\2\2UV\7>\2\2VW\7>\2\2W\30\3\2\2\2XY\7@\2\2YZ\7@"+
		"\2\2Z\32\3\2\2\2[\\\7v\2\2\\]\7t\2\2]^\7w\2\2^_\7g\2\2_\34\3\2\2\2`a\7"+
		"h\2\2ab\7c\2\2bc\7n\2\2cd\7u\2\2de\7g\2\2e\36\3\2\2\2fg\7B\2\2g \3\2\2"+
		"\2hi\7%\2\2i\"\3\2\2\2jk\7\60\2\2k$\3\2\2\2lp\t\2\2\2mo\t\3\2\2nm\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q&\3\2\2\2rp\3\2\2\2sx\7)\2\2tw\5)\25"+
		"\2uw\13\2\2\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y{\3\2"+
		"\2\2zx\3\2\2\2{|\7)\2\2|(\3\2\2\2}~\7^\2\2~\u0082\7)\2\2\177\u0080\7^"+
		"\2\2\u0080\u0082\7^\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082*\3\2\2"+
		"\2\u0083\u0085\7/\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0088\5\63\32\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a,\3\2\2\2\u008b\u008d\7"+
		"/\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u0090\5\63\32\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\5#\22\2\u0094"+
		"\u0096\5\63\32\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u00a4\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009c\7/\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\5#\22\2\u009e\u00a0\5\63\32\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u008c\3\2\2\2\u00a3\u009b\3\2\2\2\u00a4.\3\2\2\2\u00a5\u00a7"+
		"\5\63\32\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\5#\22\2\u00ab\u00ad"+
		"\5\63\32\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\5#\22\2\u00b1\u00b3"+
		"\5\63\32\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\60\3\2\2\2\u00b6\u00b8\5\63\32\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\5#\22\2\u00bc\u00be\5\63\32\2\u00bd\u00bc\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\5#\22\2\u00c2\u00c4\5\63\32\2\u00c3\u00c2\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c9\5#\22\2\u00c8\u00ca\5\63\32\2\u00c9\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\62\3\2\2\2\u00cd\u00ce\4\62;\2\u00ce\64\3\2\2\2\u00cf\u00d4\7$\2\2\u00d0"+
		"\u00d3\5\67\34\2\u00d1\u00d3\13\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8\66\3\2\2\2"+
		"\u00d9\u00da\7^\2\2\u00da\u00de\7$\2\2\u00db\u00dc\7^\2\2\u00dc\u00de"+
		"\7^\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00db\3\2\2\2\u00de8\3\2\2\2\u00df\u00e3"+
		"\7\'\2\2\u00e0\u00e2\13\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e8\7\17\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\f\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec"+
		"\b\35\2\2\u00ec:\3\2\2\2\u00ed\u00ef\t\4\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\b\36\3\2\u00f3<\3\2\2\2\34\2pvx\u0081\u0084\u0089\u008c"+
		"\u0091\u0097\u009b\u00a1\u00a3\u00a8\u00ae\u00b4\u00b9\u00bf\u00c5\u00cb"+
		"\u00d2\u00d4\u00dd\u00e3\u00e7\u00f0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}