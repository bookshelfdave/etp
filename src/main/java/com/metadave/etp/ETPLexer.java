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
		COMMA=1, LSQUARE=2, RSQUARE=3, LCURLY=4, RCURLY=5, DOT=6, BINSTART=7, 
		BINEND=8, TRUE=9, FALSE=10, AT=11, ID=12, IDSTRING=13, INT=14, FLOAT=15, 
		STRING=16, LINE_COMMENT=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "'['", "']'", "'{'", "'}'", "'.'", "'<<'", "'>>'", "'true'", "'false'", 
		"'@'", "ID", "IDSTRING", "INT", "FLOAT", "STRING", "LINE_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"COMMA", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "DOT", "BINSTART", 
		"BINEND", "TRUE", "FALSE", "AT", "ID", "IDSTRING", "IDESC", "INT", "FLOAT", 
		"DIGIT", "STRING", "ESC", "LINE_COMMENT", "WS"
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
		case 19: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 20: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\24\u00a3\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\7\rO"+
		"\n\r\f\r\16\rR\13\r\3\16\3\16\3\16\7\16W\n\16\f\16\16\16Z\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\5\17b\n\17\3\20\6\20e\n\20\r\20\16\20f\3\21\6"+
		"\21j\n\21\r\21\16\21k\3\21\3\21\7\21p\n\21\f\21\16\21s\13\21\3\21\3\21"+
		"\6\21w\n\21\r\21\16\21x\5\21{\n\21\3\22\3\22\3\23\3\23\3\23\7\23\u0082"+
		"\n\23\f\23\16\23\u0085\13\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u008d"+
		"\n\24\3\25\3\25\7\25\u0091\n\25\f\25\16\25\u0094\13\25\3\25\5\25\u0097"+
		"\n\25\3\25\3\25\3\25\3\25\3\26\6\26\u009e\n\26\r\26\16\26\u009f\3\26\3"+
		"\26\5X\u0083\u0092\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\2\1\37\20\1!\21\1#\2\1%\22"+
		"\1\'\2\1)\23\2+\24\3\3\2\5\3c|\6\62;B\\aac|\5\13\f\17\17\"\"\u00ae\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2"+
		"\2\r\67\3\2\2\2\179\3\2\2\2\21<\3\2\2\2\23?\3\2\2\2\25D\3\2\2\2\27J\3"+
		"\2\2\2\31L\3\2\2\2\33S\3\2\2\2\35a\3\2\2\2\37d\3\2\2\2!z\3\2\2\2#|\3\2"+
		"\2\2%~\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u009d\3\2\2\2-.\7.\2\2"+
		".\4\3\2\2\2/\60\7]\2\2\60\6\3\2\2\2\61\62\7_\2\2\62\b\3\2\2\2\63\64\7"+
		"}\2\2\64\n\3\2\2\2\65\66\7\177\2\2\66\f\3\2\2\2\678\7\60\2\28\16\3\2\2"+
		"\29:\7>\2\2:;\7>\2\2;\20\3\2\2\2<=\7@\2\2=>\7@\2\2>\22\3\2\2\2?@\7v\2"+
		"\2@A\7t\2\2AB\7w\2\2BC\7g\2\2C\24\3\2\2\2DE\7h\2\2EF\7c\2\2FG\7n\2\2G"+
		"H\7u\2\2HI\7g\2\2I\26\3\2\2\2JK\7B\2\2K\30\3\2\2\2LP\t\2\2\2MO\t\3\2\2"+
		"NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\32\3\2\2\2RP\3\2\2\2SX\7)\2"+
		"\2TW\5\35\17\2UW\13\2\2\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3"+
		"\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7)\2\2\\\34\3\2\2\2]^\7^\2\2^b\7)\2\2_`"+
		"\7^\2\2`b\7^\2\2a]\3\2\2\2a_\3\2\2\2b\36\3\2\2\2ce\5#\22\2dc\3\2\2\2e"+
		"f\3\2\2\2fd\3\2\2\2fg\3\2\2\2g \3\2\2\2hj\5#\22\2ih\3\2\2\2jk\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mq\5\r\7\2np\5#\22\2on\3\2\2\2ps\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2r{\3\2\2\2sq\3\2\2\2tv\5\r\7\2uw\5#\22\2vu\3\2\2\2"+
		"wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zi\3\2\2\2zt\3\2\2\2{\"\3\2\2"+
		"\2|}\4\62;\2}$\3\2\2\2~\u0083\7$\2\2\177\u0082\5\'\24\2\u0080\u0082\13"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\7$\2\2\u0087&\3\2\2\2\u0088\u0089\7^\2\2\u0089\u008d"+
		"\7$\2\2\u008a\u008b\7^\2\2\u008b\u008d\7^\2\2\u008c\u0088\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d(\3\2\2\2\u008e\u0092\7\'\2\2\u008f\u0091\13\2\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0093\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\7\17\2\2"+
		"\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\7\f\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\25\2\2\u009b*\3\2\2\2\u009c"+
		"\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\26\3\2\u00a2"+
		",\3\2\2\2\22\2PVXafkqxz\u0081\u0083\u008c\u0092\u0096\u009f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}