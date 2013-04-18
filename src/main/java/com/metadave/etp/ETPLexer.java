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
		case 1: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\34\u00eb\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\7\23o\n\23\f\23\16\23r\13\23\3\24\3\24\3\24\7\24w\n\24\f"+
		"\24\16\24z\13\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0082\n\25\3\26\6"+
		"\26\u0085\n\26\r\26\16\26\u0086\3\27\6\27\u008a\n\27\r\27\16\27\u008b"+
		"\3\27\3\27\7\27\u0090\n\27\f\27\16\27\u0093\13\27\3\27\3\27\6\27\u0097"+
		"\n\27\r\27\16\27\u0098\5\27\u009b\n\27\3\30\6\30\u009e\n\30\r\30\16\30"+
		"\u009f\3\30\3\30\6\30\u00a4\n\30\r\30\16\30\u00a5\3\30\3\30\6\30\u00aa"+
		"\n\30\r\30\16\30\u00ab\3\31\6\31\u00af\n\31\r\31\16\31\u00b0\3\31\3\31"+
		"\6\31\u00b5\n\31\r\31\16\31\u00b6\3\31\3\31\6\31\u00bb\n\31\r\31\16\31"+
		"\u00bc\3\31\3\31\6\31\u00c1\n\31\r\31\16\31\u00c2\3\32\3\32\3\33\3\33"+
		"\3\33\7\33\u00ca\n\33\f\33\16\33\u00cd\13\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\5\34\u00d5\n\34\3\35\3\35\7\35\u00d9\n\35\f\35\16\35\u00dc\13\35"+
		"\3\35\5\35\u00df\n\35\3\35\3\35\3\35\3\35\3\36\6\36\u00e6\n\36\r\36\16"+
		"\36\u00e7\3\36\3\36\5x\u00cb\u00da\37\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\2\1+\26\1-\27\1/\30\1\61\31\1\63\2\1\65\32"+
		"\1\67\2\19\33\2;\34\3\3\2\5\3c|\7\60\60\62;B\\aac|\5\13\f\17\17\"\"\u00fd"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7E\3\2\2"+
		"\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2"+
		"\2\25S\3\2\2\2\27U\3\2\2\2\31X\3\2\2\2\33[\3\2\2\2\35`\3\2\2\2\37f\3\2"+
		"\2\2!h\3\2\2\2#j\3\2\2\2%l\3\2\2\2\'s\3\2\2\2)\u0081\3\2\2\2+\u0084\3"+
		"\2\2\2-\u009a\3\2\2\2/\u009d\3\2\2\2\61\u00ae\3\2\2\2\63\u00c4\3\2\2\2"+
		"\65\u00c6\3\2\2\2\67\u00d4\3\2\2\29\u00d6\3\2\2\2;\u00e5\3\2\2\2=>\7H"+
		"\2\2>?\7w\2\2?@\7p\2\2@\4\3\2\2\2AB\7T\2\2BC\7g\2\2CD\7h\2\2D\6\3\2\2"+
		"\2EF\7.\2\2F\b\3\2\2\2GH\7]\2\2H\n\3\2\2\2IJ\7_\2\2J\f\3\2\2\2KL\7}\2"+
		"\2L\16\3\2\2\2MN\7\177\2\2N\20\3\2\2\2OP\7>\2\2P\22\3\2\2\2QR\7@\2\2R"+
		"\24\3\2\2\2ST\7<\2\2T\26\3\2\2\2UV\7>\2\2VW\7>\2\2W\30\3\2\2\2XY\7@\2"+
		"\2YZ\7@\2\2Z\32\3\2\2\2[\\\7v\2\2\\]\7t\2\2]^\7w\2\2^_\7g\2\2_\34\3\2"+
		"\2\2`a\7h\2\2ab\7c\2\2bc\7n\2\2cd\7u\2\2de\7g\2\2e\36\3\2\2\2fg\7B\2\2"+
		"g \3\2\2\2hi\7%\2\2i\"\3\2\2\2jk\7\60\2\2k$\3\2\2\2lp\t\2\2\2mo\t\3\2"+
		"\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q&\3\2\2\2rp\3\2\2\2sx\7)\2"+
		"\2tw\5)\25\2uw\13\2\2\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2"+
		"\2\2y{\3\2\2\2zx\3\2\2\2{|\7)\2\2|(\3\2\2\2}~\7^\2\2~\u0082\7)\2\2\177"+
		"\u0080\7^\2\2\u0080\u0082\7^\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"*\3\2\2\2\u0083\u0085\5\63\32\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087,\3\2\2\2\u0088\u008a"+
		"\5\63\32\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091\5#\22\2\u008e\u0090"+
		"\5\63\32\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u009b\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096"+
		"\5#\22\2\u0095\u0097\5\63\32\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0089"+
		"\3\2\2\2\u009a\u0094\3\2\2\2\u009b.\3\2\2\2\u009c\u009e\5\63\32\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\5#\22\2\u00a2\u00a4\5\63\32\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\5#\22\2\u00a8\u00aa\5\63\32\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\60\3\2\2\2\u00ad\u00af\5\63\32\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\5#\22\2\u00b3\u00b5\5\63\32\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\5#\22\2\u00b9\u00bb\5\63\32\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\5#\22\2\u00bf\u00c1\5\63\32\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\62\3\2\2"+
		"\2\u00c4\u00c5\4\62;\2\u00c5\64\3\2\2\2\u00c6\u00cb\7$\2\2\u00c7\u00ca"+
		"\5\67\34\2\u00c8\u00ca\13\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2"+
		"\2\u00ca\u00cd\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf\66\3\2\2\2\u00d0"+
		"\u00d1\7^\2\2\u00d1\u00d5\7$\2\2\u00d2\u00d3\7^\2\2\u00d3\u00d5\7^\2\2"+
		"\u00d4\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d58\3\2\2\2\u00d6\u00da\7"+
		"\'\2\2\u00d7\u00d9\13\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00df\7\17\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\35"+
		"\2\2\u00e3:\3\2\2\2\u00e4\u00e6\t\4\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\b\36\3\2\u00ea<\3\2\2\2\31\2pvx\u0081\u0086\u008b\u0091\u0098\u009a"+
		"\u009f\u00a5\u00ab\u00b0\u00b6\u00bc\u00c2\u00c9\u00cb\u00d4\u00da\u00de"+
		"\u00e7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}