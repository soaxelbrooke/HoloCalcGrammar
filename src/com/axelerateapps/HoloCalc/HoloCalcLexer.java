// Generated from /home/stuart/IdeaProjects/HoloCalcGrammar/HoloCalc.g4 by ANTLR 4.x
package com.axelerateapps.HoloCalc;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HoloCalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, POWER=5, PERCENT=6, INT=7, DOUBLE=8, 
		OPENPAREN=9, CLOSEPAREN=10, PI=11, EXP=12, SQRE=13, CUBE=14, SQRT=15, 
		CBRT=16, LN=17, LOG10=18, LOG8=19, LOG2=20, SIN=21, COS=22, TAN=23, ASIN=24, 
		ACOS=25, ATAN=26, SIND=27, COSD=28, TAND=29, ASIND=30, ACOSD=31, ATAND=32, 
		NEWLINE=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "INT", "DOUBLE", "'('", "')'", 
		"'pi'", "'e'", "'sqre'", "'cube'", "'sqrt'", "'cbrt'", "'ln'", "'log10'", 
		"'log8'", "'log2'", "'sin'", "'cos'", "'tan'", "'asin'", "'acos'", "'atan'", 
		"'sind'", "'cosd'", "'tand'", "'asind'", "'acosd'", "'atand'", "'\n'"
	};
	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "POWER", "PERCENT", "INT", "DOUBLE", 
		"OPENPAREN", "CLOSEPAREN", "PI", "EXP", "SQRE", "CUBE", "SQRT", "CBRT", 
		"LN", "LOG10", "LOG8", "LOG2", "SIN", "COS", "TAN", "ASIN", "ACOS", "ATAN", 
		"SIND", "COSD", "TAND", "ASIND", "ACOSD", "ATAND", "NEWLINE"
	};


	public HoloCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HoloCalc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\bS\n"+
		"\b\r\b\16\bT\3\t\6\tX\n\t\r\t\16\tY\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\3\3\2\62;\u00d2\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2"+
		"\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17R\3\2\2\2\21W\3\2\2\2\23b\3\2\2\2"+
		"\25d\3\2\2\2\27f\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35p\3\2\2\2\37u\3\2\2"+
		"\2!z\3\2\2\2#\177\3\2\2\2%\u0082\3\2\2\2\'\u0088\3\2\2\2)\u008d\3\2\2"+
		"\2+\u0092\3\2\2\2-\u0096\3\2\2\2/\u009a\3\2\2\2\61\u009e\3\2\2\2\63\u00a3"+
		"\3\2\2\2\65\u00a8\3\2\2\2\67\u00ad\3\2\2\29\u00b2\3\2\2\2;\u00b7\3\2\2"+
		"\2=\u00bc\3\2\2\2?\u00c2\3\2\2\2A\u00c8\3\2\2\2C\u00ce\3\2\2\2EF\7-\2"+
		"\2F\4\3\2\2\2GH\7/\2\2H\6\3\2\2\2IJ\7,\2\2J\b\3\2\2\2KL\7\61\2\2L\n\3"+
		"\2\2\2MN\7`\2\2N\f\3\2\2\2OP\7\'\2\2P\16\3\2\2\2QS\t\2\2\2RQ\3\2\2\2S"+
		"T\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\20\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[_\7\60\2\2\\^\t\2\2\2]\\\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`\22\3\2\2\2a_\3\2\2\2bc\7*\2\2c\24\3\2\2\2"+
		"de\7+\2\2e\26\3\2\2\2fg\7r\2\2gh\7k\2\2h\30\3\2\2\2ij\7g\2\2j\32\3\2\2"+
		"\2kl\7u\2\2lm\7s\2\2mn\7t\2\2no\7g\2\2o\34\3\2\2\2pq\7e\2\2qr\7w\2\2r"+
		"s\7d\2\2st\7g\2\2t\36\3\2\2\2uv\7u\2\2vw\7s\2\2wx\7t\2\2xy\7v\2\2y \3"+
		"\2\2\2z{\7e\2\2{|\7d\2\2|}\7t\2\2}~\7v\2\2~\"\3\2\2\2\177\u0080\7n\2\2"+
		"\u0080\u0081\7p\2\2\u0081$\3\2\2\2\u0082\u0083\7n\2\2\u0083\u0084\7q\2"+
		"\2\u0084\u0085\7i\2\2\u0085\u0086\7\63\2\2\u0086\u0087\7\62\2\2\u0087"+
		"&\3\2\2\2\u0088\u0089\7n\2\2\u0089\u008a\7q\2\2\u008a\u008b\7i\2\2\u008b"+
		"\u008c\7:\2\2\u008c(\3\2\2\2\u008d\u008e\7n\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7i\2\2\u0090\u0091\7\64\2\2\u0091*\3\2\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095,\3\2\2\2\u0096\u0097\7e\2\2\u0097"+
		"\u0098\7q\2\2\u0098\u0099\7u\2\2\u0099.\3\2\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7p\2\2\u009d\60\3\2\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\62\3\2\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7u\2\2"+
		"\u00a7\64\3\2\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7"+
		"c\2\2\u00ab\u00ac\7p\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7f\2\2\u00b18\3\2\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7f\2\2\u00b6"+
		":\3\2\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7p\2\2\u00ba"+
		"\u00bb\7f\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7u\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7f\2\2\u00c1>\3\2\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7u\2\2"+
		"\u00c6\u00c7\7f\2\2\u00c7@\3\2\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7v\2"+
		"\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2\u00cdB\3\2"+
		"\2\2\u00ce\u00cf\7\f\2\2\u00cfD\3\2\2\2\6\2TY_\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}