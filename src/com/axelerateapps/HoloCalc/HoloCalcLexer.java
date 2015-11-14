// Generated from HoloCalc.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, POWER=5, PERCENT=6, INVERT=7, INT=8, 
		DOUBLE=9, OPENPAREN=10, CLOSEPAREN=11, PI=12, EXP=13, SQRE=14, CUBE=15, 
		SQRT=16, CBRT=17, LN=18, LOG10=19, LOG8=20, LOG2=21, SIN=22, COS=23, TAN=24, 
		ASIN=25, ACOS=26, ATAN=27, SIND=28, COSD=29, TAND=30, ASIND=31, ACOSD=32, 
		ATAND=33, NEWLINE=34, EQUALS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "POWER", "PERCENT", "INVERT", "INT", 
		"DOUBLE", "OPENPAREN", "CLOSEPAREN", "PI", "EXP", "SQRE", "CUBE", "SQRT", 
		"CBRT", "LN", "LOG10", "LOG8", "LOG2", "SIN", "COS", "TAN", "ASIN", "ACOS", 
		"ATAN", "SIND", "COSD", "TAND", "ASIND", "ACOSD", "ATAND", "NEWLINE", 
		"EQUALS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'inv'", null, null, "'('", 
		"')'", "'pi'", "'e'", "'sqre'", "'cube'", "'sqrt'", "'cbrt'", "'ln'", 
		"'log10'", "'log8'", "'log2'", "'sin'", "'cos'", "'tan'", "'asin'", "'acos'", 
		"'atan'", "'sind'", "'cosd'", "'tand'", "'asind'", "'acosd'", "'atand'", 
		"'\n'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "POWER", "PERCENT", "INVERT", 
		"INT", "DOUBLE", "OPENPAREN", "CLOSEPAREN", "PI", "EXP", "SQRE", "CUBE", 
		"SQRT", "CBRT", "LN", "LOG10", "LOG8", "LOG2", "SIN", "COS", "TAN", "ASIN", 
		"ACOS", "ATAN", "SIND", "COSD", "TAND", "ASIND", "ACOSD", "ATAND", "NEWLINE", 
		"EQUALS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HoloCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HoloCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\6\t[\n\t\r\t\16\t\\\3\n\6\n`\n\n\r\n\16\na\3\n"+
		"\3\n\7\nf\n\n\f\n\16\ni\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\2\2%\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%\3\2\3\3\2\62;\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2"+
		"\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21Z\3\2\2\2\23_\3\2\2\2\25j\3\2\2"+
		"\2\27l\3\2\2\2\31n\3\2\2\2\33q\3\2\2\2\35s\3\2\2\2\37x\3\2\2\2!}\3\2\2"+
		"\2#\u0082\3\2\2\2%\u0087\3\2\2\2\'\u008a\3\2\2\2)\u0090\3\2\2\2+\u0095"+
		"\3\2\2\2-\u009a\3\2\2\2/\u009e\3\2\2\2\61\u00a2\3\2\2\2\63\u00a6\3\2\2"+
		"\2\65\u00ab\3\2\2\2\67\u00b0\3\2\2\29\u00b5\3\2\2\2;\u00ba\3\2\2\2=\u00bf"+
		"\3\2\2\2?\u00c4\3\2\2\2A\u00ca\3\2\2\2C\u00d0\3\2\2\2E\u00d6\3\2\2\2G"+
		"\u00d8\3\2\2\2IJ\7-\2\2J\4\3\2\2\2KL\7/\2\2L\6\3\2\2\2MN\7,\2\2N\b\3\2"+
		"\2\2OP\7\61\2\2P\n\3\2\2\2QR\7`\2\2R\f\3\2\2\2ST\7\'\2\2T\16\3\2\2\2U"+
		"V\7k\2\2VW\7p\2\2WX\7x\2\2X\20\3\2\2\2Y[\t\2\2\2ZY\3\2\2\2[\\\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]\22\3\2\2\2^`\t\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2bc\3\2\2\2cg\7\60\2\2df\t\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2h\24\3\2\2\2ig\3\2\2\2jk\7*\2\2k\26\3\2\2\2lm\7+\2\2m"+
		"\30\3\2\2\2no\7r\2\2op\7k\2\2p\32\3\2\2\2qr\7g\2\2r\34\3\2\2\2st\7u\2"+
		"\2tu\7s\2\2uv\7t\2\2vw\7g\2\2w\36\3\2\2\2xy\7e\2\2yz\7w\2\2z{\7d\2\2{"+
		"|\7g\2\2| \3\2\2\2}~\7u\2\2~\177\7s\2\2\177\u0080\7t\2\2\u0080\u0081\7"+
		"v\2\2\u0081\"\3\2\2\2\u0082\u0083\7e\2\2\u0083\u0084\7d\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7v\2\2\u0086$\3\2\2\2\u0087\u0088\7n\2\2\u0088\u0089"+
		"\7p\2\2\u0089&\3\2\2\2\u008a\u008b\7n\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7i\2\2\u008d\u008e\7\63\2\2\u008e\u008f\7\62\2\2\u008f(\3\2\2\2\u0090"+
		"\u0091\7n\2\2\u0091\u0092\7q\2\2\u0092\u0093\7i\2\2\u0093\u0094\7:\2\2"+
		"\u0094*\3\2\2\2\u0095\u0096\7n\2\2\u0096\u0097\7q\2\2\u0097\u0098\7i\2"+
		"\2\u0098\u0099\7\64\2\2\u0099,\3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7p\2\2\u009d.\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0"+
		"\7q\2\2\u00a0\u00a1\7u\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4"+
		"\7c\2\2\u00a4\u00a5\7p\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8"+
		"\7u\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\64\3\2\2\2\u00ab\u00ac"+
		"\7c\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7u\2\2\u00af"+
		"\66\3\2\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b48\3\2\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7f\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7f\2\2\u00be<\3\2\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7f\2\2"+
		"\u00c3>\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7k\2"+
		"\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7f\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7"+
		"c\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf"+
		"\7f\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3"+
		"\7c\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7f\2\2\u00d5D\3\2\2\2\u00d6\u00d7"+
		"\7\f\2\2\u00d7F\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9H\3\2\2\2\6\2\\ag\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}