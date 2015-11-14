// Generated from HoloCalc.g4 by ANTLR 4.5
package com.axelerateapps.HoloCalc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HoloCalcParser extends Parser {
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
	public static final int
		RULE_calc = 0, RULE_addsub = 1, RULE_muldiv = 2, RULE_power = 3, RULE_negation = 4, 
		RULE_atom = 5;
	public static final String[] ruleNames = {
		"calc", "addsub", "muldiv", "power", "negation", "atom"
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

	@Override
	public String getGrammarFileName() { return "HoloCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HoloCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CalcContext extends ParserRuleContext {
		public double result;
		public AddsubContext value;
		public AddsubContext addsub() {
			return getRuleContext(AddsubContext.class,0);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).exitCalc(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((CalcContext)_localctx).value = addsub();
			((CalcContext)_localctx).result =  ((CalcContext)_localctx).value.result;
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

	public static class AddsubContext extends ParserRuleContext {
		public double result;
		public MuldivContext value;
		public MuldivContext value2;
		public List<MuldivContext> muldiv() {
			return getRuleContexts(MuldivContext.class);
		}
		public MuldivContext muldiv(int i) {
			return getRuleContext(MuldivContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HoloCalcParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HoloCalcParser.PLUS, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(HoloCalcParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(HoloCalcParser.PERCENT, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(HoloCalcParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(HoloCalcParser.MINUS, i);
		}
		public AddsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addsub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).enterAddsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).exitAddsub(this);
		}
	}

	public final AddsubContext addsub() throws RecognitionException {
		AddsubContext _localctx = new AddsubContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_addsub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			((AddsubContext)_localctx).value = muldiv();
			((AddsubContext)_localctx).result =  ((AddsubContext)_localctx).value.result;
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(35);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(17);
					match(PLUS);
					setState(18);
					((AddsubContext)_localctx).value2 = muldiv();
					setState(19);
					match(PERCENT);
					_localctx.result *= 1 + ((AddsubContext)_localctx).value2.result/100;
					}
					break;
				case 2:
					{
					setState(22);
					match(PLUS);
					setState(23);
					((AddsubContext)_localctx).value2 = muldiv();
					_localctx.result += ((AddsubContext)_localctx).value2.result;
					}
					break;
				case 3:
					{
					setState(26);
					match(MINUS);
					setState(27);
					((AddsubContext)_localctx).value2 = muldiv();
					setState(28);
					match(PERCENT);
					_localctx.result *= 1 - ((AddsubContext)_localctx).value2.result/100;
					}
					break;
				case 4:
					{
					setState(31);
					match(MINUS);
					setState(32);
					((AddsubContext)_localctx).value2 = muldiv();
					_localctx.result -= ((AddsubContext)_localctx).value2.result;
					}
					break;
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MuldivContext extends ParserRuleContext {
		public double result;
		public PowerContext value;
		public PowerContext value2;
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(HoloCalcParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(HoloCalcParser.MULTIPLY, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(HoloCalcParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(HoloCalcParser.PERCENT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(HoloCalcParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(HoloCalcParser.DIVIDE, i);
		}
		public MuldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muldiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).enterMuldiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).exitMuldiv(this);
		}
	}

	public final MuldivContext muldiv() throws RecognitionException {
		MuldivContext _localctx = new MuldivContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_muldiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((MuldivContext)_localctx).value = power();
			((MuldivContext)_localctx).result =  ((MuldivContext)_localctx).value.result;
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(60);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(42);
					match(MULTIPLY);
					setState(43);
					((MuldivContext)_localctx).value2 = power();
					setState(44);
					match(PERCENT);
					_localctx.result *= ((MuldivContext)_localctx).value2.result/100;
					}
					break;
				case 2:
					{
					setState(47);
					match(MULTIPLY);
					setState(48);
					((MuldivContext)_localctx).value2 = power();
					_localctx.result *= ((MuldivContext)_localctx).value2.result;
					}
					break;
				case 3:
					{
					setState(51);
					match(DIVIDE);
					setState(52);
					((MuldivContext)_localctx).value2 = power();
					setState(53);
					match(PERCENT);
					_localctx.result /= ((MuldivContext)_localctx).value2.result/100;
					}
					break;
				case 4:
					{
					setState(56);
					match(DIVIDE);
					setState(57);
					((MuldivContext)_localctx).value2 = power();
					_localctx.result /= ((MuldivContext)_localctx).value2.result;
					}
					break;
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class PowerContext extends ParserRuleContext {
		public double result;
		public NegationContext value;
		public PowerContext value2;
		public TerminalNode POWER() { return getToken(HoloCalcParser.POWER, 0); }
		public TerminalNode PERCENT() { return getToken(HoloCalcParser.PERCENT, 0); }
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_power);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((PowerContext)_localctx).value = negation();
				setState(66);
				match(POWER);
				setState(67);
				((PowerContext)_localctx).value2 = power();
				setState(68);
				match(PERCENT);
				((PowerContext)_localctx).result =  java.lang.Math.pow(((PowerContext)_localctx).value.result, ((PowerContext)_localctx).value2.result/100);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((PowerContext)_localctx).value = negation();
				setState(72);
				match(POWER);
				setState(73);
				((PowerContext)_localctx).value2 = power();
				((PowerContext)_localctx).result =  java.lang.Math.pow(((PowerContext)_localctx).value.result, ((PowerContext)_localctx).value2.result);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				((PowerContext)_localctx).value = negation();
				((PowerContext)_localctx).result =  ((PowerContext)_localctx).value.result;
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

	public static class NegationContext extends ParserRuleContext {
		public double result;
		public AtomContext value;
		public TerminalNode PERCENT() { return getToken(HoloCalcParser.PERCENT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode INVERT() { return getToken(HoloCalcParser.INVERT, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).exitNegation(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_negation);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((NegationContext)_localctx).value = atom();
				setState(82);
				match(PERCENT);
				((NegationContext)_localctx).result =  ((NegationContext)_localctx).value.result/100;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((NegationContext)_localctx).value = atom();
				((NegationContext)_localctx).result =  ((NegationContext)_localctx).value.result;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(INVERT);
				setState(89);
				((NegationContext)_localctx).value = atom();
				setState(90);
				match(PERCENT);
				((NegationContext)_localctx).result =  -((NegationContext)_localctx).value.result/100;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(INVERT);
				setState(94);
				((NegationContext)_localctx).value = atom();
				((NegationContext)_localctx).result =  -((NegationContext)_localctx).value.result;
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

	public static class AtomContext extends ParserRuleContext {
		public double result;
		public AddsubContext exp;
		public Token DOUBLE;
		public Token INT;
		public AddsubContext exp2;
		public TerminalNode LOG10() { return getToken(HoloCalcParser.LOG10, 0); }
		public AddsubContext addsub() {
			return getRuleContext(AddsubContext.class,0);
		}
		public TerminalNode LOG8() { return getToken(HoloCalcParser.LOG8, 0); }
		public TerminalNode LOG2() { return getToken(HoloCalcParser.LOG2, 0); }
		public TerminalNode LN() { return getToken(HoloCalcParser.LN, 0); }
		public TerminalNode ASIN() { return getToken(HoloCalcParser.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(HoloCalcParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(HoloCalcParser.ATAN, 0); }
		public TerminalNode SIN() { return getToken(HoloCalcParser.SIN, 0); }
		public TerminalNode COS() { return getToken(HoloCalcParser.COS, 0); }
		public TerminalNode TAN() { return getToken(HoloCalcParser.TAN, 0); }
		public TerminalNode ASIND() { return getToken(HoloCalcParser.ASIND, 0); }
		public TerminalNode ACOSD() { return getToken(HoloCalcParser.ACOSD, 0); }
		public TerminalNode ATAND() { return getToken(HoloCalcParser.ATAND, 0); }
		public TerminalNode SIND() { return getToken(HoloCalcParser.SIND, 0); }
		public TerminalNode COSD() { return getToken(HoloCalcParser.COSD, 0); }
		public TerminalNode TAND() { return getToken(HoloCalcParser.TAND, 0); }
		public TerminalNode SQRT() { return getToken(HoloCalcParser.SQRT, 0); }
		public TerminalNode CBRT() { return getToken(HoloCalcParser.CBRT, 0); }
		public TerminalNode DOUBLE() { return getToken(HoloCalcParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(HoloCalcParser.INT, 0); }
		public TerminalNode PI() { return getToken(HoloCalcParser.PI, 0); }
		public TerminalNode EXP() { return getToken(HoloCalcParser.EXP, 0); }
		public TerminalNode OPENPAREN() { return getToken(HoloCalcParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(HoloCalcParser.CLOSEPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HoloCalcListener ) ((HoloCalcListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case LOG10:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(LOG10);
				setState(100);
				match(OPENPAREN);
				setState(101);
				((AtomContext)_localctx).exp = addsub();
				setState(102);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log10(((AtomContext)_localctx).exp.result);
				}
				break;
			case LOG8:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(LOG8);
				setState(106);
				match(OPENPAREN);
				setState(107);
				((AtomContext)_localctx).exp = addsub();
				setState(108);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log10(((AtomContext)_localctx).exp.result)/java.lang.Math.log10(8.0);
				}
				break;
			case LOG2:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(LOG2);
				setState(112);
				match(OPENPAREN);
				setState(113);
				((AtomContext)_localctx).exp = addsub();
				setState(114);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log10(((AtomContext)_localctx).exp.result)/java.lang.Math.log10(2.0);
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(LN);
				setState(118);
				match(OPENPAREN);
				setState(119);
				((AtomContext)_localctx).exp = addsub();
				setState(120);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log(((AtomContext)_localctx).exp.result);
				}
				break;
			case ASIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(ASIN);
				setState(124);
				match(OPENPAREN);
				setState(125);
				((AtomContext)_localctx).exp = addsub();
				setState(126);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.asin(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(ACOS);
				setState(130);
				match(OPENPAREN);
				setState(131);
				((AtomContext)_localctx).exp = addsub();
				setState(132);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.acos(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case ATAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				match(ATAN);
				setState(136);
				match(OPENPAREN);
				setState(137);
				((AtomContext)_localctx).exp = addsub();
				setState(138);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.atan(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				match(SIN);
				setState(142);
				match(OPENPAREN);
				setState(143);
				((AtomContext)_localctx).exp = addsub();
				setState(144);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.sin(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				match(COS);
				setState(148);
				match(OPENPAREN);
				setState(149);
				((AtomContext)_localctx).exp = addsub();
				setState(150);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.cos(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 10);
				{
				setState(153);
				match(TAN);
				setState(154);
				match(OPENPAREN);
				setState(155);
				((AtomContext)_localctx).exp = addsub();
				setState(156);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.tan(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case ASIND:
				enterOuterAlt(_localctx, 11);
				{
				setState(159);
				match(ASIND);
				setState(160);
				match(OPENPAREN);
				setState(161);
				((AtomContext)_localctx).exp = addsub();
				setState(162);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  180f/Math.PI*Math.asin(((AtomContext)_localctx).exp.result);
				}
				break;
			case ACOSD:
				enterOuterAlt(_localctx, 12);
				{
				setState(165);
				match(ACOSD);
				setState(166);
				match(OPENPAREN);
				setState(167);
				((AtomContext)_localctx).exp = addsub();
				setState(168);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  180f/Math.PI*Math.acos(((AtomContext)_localctx).exp.result);
				}
				break;
			case ATAND:
				enterOuterAlt(_localctx, 13);
				{
				setState(171);
				match(ATAND);
				setState(172);
				match(OPENPAREN);
				setState(173);
				((AtomContext)_localctx).exp = addsub();
				setState(174);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  180f/Math.PI*Math.atan(((AtomContext)_localctx).exp.result);
				}
				break;
			case SIND:
				enterOuterAlt(_localctx, 14);
				{
				setState(177);
				match(SIND);
				setState(178);
				match(OPENPAREN);
				setState(179);
				((AtomContext)_localctx).exp = addsub();
				setState(180);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.sin(Math.PI*((((AtomContext)_localctx).exp.result/180f) % 2));
				}
				break;
			case COSD:
				enterOuterAlt(_localctx, 15);
				{
				setState(183);
				match(COSD);
				setState(184);
				match(OPENPAREN);
				setState(185);
				((AtomContext)_localctx).exp = addsub();
				setState(186);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.cos(Math.PI*((((AtomContext)_localctx).exp.result/180f) % 2));
				}
				break;
			case TAND:
				enterOuterAlt(_localctx, 16);
				{
				setState(189);
				match(TAND);
				setState(190);
				match(OPENPAREN);
				setState(191);
				((AtomContext)_localctx).exp = addsub();
				setState(192);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.tan(Math.PI*((((AtomContext)_localctx).exp.result/180f) % 2));
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 17);
				{
				setState(195);
				match(SQRT);
				setState(196);
				match(OPENPAREN);
				setState(197);
				((AtomContext)_localctx).exp = addsub();
				setState(198);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  (double) java.lang.Math.pow(((AtomContext)_localctx).exp.result, 0.5);
				}
				break;
			case CBRT:
				enterOuterAlt(_localctx, 18);
				{
				setState(201);
				match(CBRT);
				setState(202);
				match(OPENPAREN);
				setState(203);
				((AtomContext)_localctx).exp = addsub();
				setState(204);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  (double) java.lang.Math.pow(((AtomContext)_localctx).exp.result, 1.0/3.0);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 19);
				{
				setState(207);
				((AtomContext)_localctx).DOUBLE = match(DOUBLE);
				((AtomContext)_localctx).result =  (double) Double.parseDouble((((AtomContext)_localctx).DOUBLE!=null?((AtomContext)_localctx).DOUBLE.getText():null).replaceAll(",", ""));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 20);
				{
				setState(209);
				((AtomContext)_localctx).INT = match(INT);
				((AtomContext)_localctx).result =  (double) Double.parseDouble((((AtomContext)_localctx).INT!=null?((AtomContext)_localctx).INT.getText():null).replaceAll(",", ""));
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 21);
				{
				setState(211);
				match(PI);
				((AtomContext)_localctx).result =  (double) java.lang.Math.PI;
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 22);
				{
				setState(213);
				match(EXP);
				((AtomContext)_localctx).result =  (double) java.lang.Math.E;
				}
				break;
			case OPENPAREN:
				enterOuterAlt(_localctx, 23);
				{
				setState(215);
				match(OPENPAREN);
				setState(216);
				((AtomContext)_localctx).exp2 = addsub();
				setState(217);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  ((AtomContext)_localctx).exp2.result;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3&\n\3"+
		"\f\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00df\n\7\3\7\2\2\b\2"+
		"\4\6\b\n\f\2\2\u00fd\2\16\3\2\2\2\4\21\3\2\2\2\6*\3\2\2\2\bQ\3\2\2\2\n"+
		"c\3\2\2\2\f\u00de\3\2\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20\3\3\2\2\2\21"+
		"\22\5\6\4\2\22\'\b\3\1\2\23\24\7\3\2\2\24\25\5\6\4\2\25\26\7\b\2\2\26"+
		"\27\b\3\1\2\27&\3\2\2\2\30\31\7\3\2\2\31\32\5\6\4\2\32\33\b\3\1\2\33&"+
		"\3\2\2\2\34\35\7\4\2\2\35\36\5\6\4\2\36\37\7\b\2\2\37 \b\3\1\2 &\3\2\2"+
		"\2!\"\7\4\2\2\"#\5\6\4\2#$\b\3\1\2$&\3\2\2\2%\23\3\2\2\2%\30\3\2\2\2%"+
		"\34\3\2\2\2%!\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\'\3"+
		"\2\2\2*+\5\b\5\2+@\b\4\1\2,-\7\5\2\2-.\5\b\5\2./\7\b\2\2/\60\b\4\1\2\60"+
		"?\3\2\2\2\61\62\7\5\2\2\62\63\5\b\5\2\63\64\b\4\1\2\64?\3\2\2\2\65\66"+
		"\7\6\2\2\66\67\5\b\5\2\678\7\b\2\289\b\4\1\29?\3\2\2\2:;\7\6\2\2;<\5\b"+
		"\5\2<=\b\4\1\2=?\3\2\2\2>,\3\2\2\2>\61\3\2\2\2>\65\3\2\2\2>:\3\2\2\2?"+
		"B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2B@\3\2\2\2CD\5\n\6\2DE\7\7\2\2"+
		"EF\5\b\5\2FG\7\b\2\2GH\b\5\1\2HR\3\2\2\2IJ\5\n\6\2JK\7\7\2\2KL\5\b\5\2"+
		"LM\b\5\1\2MR\3\2\2\2NO\5\n\6\2OP\b\5\1\2PR\3\2\2\2QC\3\2\2\2QI\3\2\2\2"+
		"QN\3\2\2\2R\t\3\2\2\2ST\5\f\7\2TU\7\b\2\2UV\b\6\1\2Vd\3\2\2\2WX\5\f\7"+
		"\2XY\b\6\1\2Yd\3\2\2\2Z[\7\t\2\2[\\\5\f\7\2\\]\7\b\2\2]^\b\6\1\2^d\3\2"+
		"\2\2_`\7\t\2\2`a\5\f\7\2ab\b\6\1\2bd\3\2\2\2cS\3\2\2\2cW\3\2\2\2cZ\3\2"+
		"\2\2c_\3\2\2\2d\13\3\2\2\2ef\7\25\2\2fg\7\f\2\2gh\5\4\3\2hi\7\r\2\2ij"+
		"\b\7\1\2j\u00df\3\2\2\2kl\7\26\2\2lm\7\f\2\2mn\5\4\3\2no\7\r\2\2op\b\7"+
		"\1\2p\u00df\3\2\2\2qr\7\27\2\2rs\7\f\2\2st\5\4\3\2tu\7\r\2\2uv\b\7\1\2"+
		"v\u00df\3\2\2\2wx\7\24\2\2xy\7\f\2\2yz\5\4\3\2z{\7\r\2\2{|\b\7\1\2|\u00df"+
		"\3\2\2\2}~\7\33\2\2~\177\7\f\2\2\177\u0080\5\4\3\2\u0080\u0081\7\r\2\2"+
		"\u0081\u0082\b\7\1\2\u0082\u00df\3\2\2\2\u0083\u0084\7\34\2\2\u0084\u0085"+
		"\7\f\2\2\u0085\u0086\5\4\3\2\u0086\u0087\7\r\2\2\u0087\u0088\b\7\1\2\u0088"+
		"\u00df\3\2\2\2\u0089\u008a\7\35\2\2\u008a\u008b\7\f\2\2\u008b\u008c\5"+
		"\4\3\2\u008c\u008d\7\r\2\2\u008d\u008e\b\7\1\2\u008e\u00df\3\2\2\2\u008f"+
		"\u0090\7\30\2\2\u0090\u0091\7\f\2\2\u0091\u0092\5\4\3\2\u0092\u0093\7"+
		"\r\2\2\u0093\u0094\b\7\1\2\u0094\u00df\3\2\2\2\u0095\u0096\7\31\2\2\u0096"+
		"\u0097\7\f\2\2\u0097\u0098\5\4\3\2\u0098\u0099\7\r\2\2\u0099\u009a\b\7"+
		"\1\2\u009a\u00df\3\2\2\2\u009b\u009c\7\32\2\2\u009c\u009d\7\f\2\2\u009d"+
		"\u009e\5\4\3\2\u009e\u009f\7\r\2\2\u009f\u00a0\b\7\1\2\u00a0\u00df\3\2"+
		"\2\2\u00a1\u00a2\7!\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\5\4\3\2\u00a4"+
		"\u00a5\7\r\2\2\u00a5\u00a6\b\7\1\2\u00a6\u00df\3\2\2\2\u00a7\u00a8\7\""+
		"\2\2\u00a8\u00a9\7\f\2\2\u00a9\u00aa\5\4\3\2\u00aa\u00ab\7\r\2\2\u00ab"+
		"\u00ac\b\7\1\2\u00ac\u00df\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7\f"+
		"\2\2\u00af\u00b0\5\4\3\2\u00b0\u00b1\7\r\2\2\u00b1\u00b2\b\7\1\2\u00b2"+
		"\u00df\3\2\2\2\u00b3\u00b4\7\36\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\5"+
		"\4\3\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\b\7\1\2\u00b8\u00df\3\2\2\2\u00b9"+
		"\u00ba\7\37\2\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd\7"+
		"\r\2\2\u00bd\u00be\b\7\1\2\u00be\u00df\3\2\2\2\u00bf\u00c0\7 \2\2\u00c0"+
		"\u00c1\7\f\2\2\u00c1\u00c2\5\4\3\2\u00c2\u00c3\7\r\2\2\u00c3\u00c4\b\7"+
		"\1\2\u00c4\u00df\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\7\f\2\2\u00c7"+
		"\u00c8\5\4\3\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\b\7\1\2\u00ca\u00df\3\2"+
		"\2\2\u00cb\u00cc\7\23\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\5\4\3\2\u00ce"+
		"\u00cf\7\r\2\2\u00cf\u00d0\b\7\1\2\u00d0\u00df\3\2\2\2\u00d1\u00d2\7\13"+
		"\2\2\u00d2\u00df\b\7\1\2\u00d3\u00d4\7\n\2\2\u00d4\u00df\b\7\1\2\u00d5"+
		"\u00d6\7\16\2\2\u00d6\u00df\b\7\1\2\u00d7\u00d8\7\17\2\2\u00d8\u00df\b"+
		"\7\1\2\u00d9\u00da\7\f\2\2\u00da\u00db\5\4\3\2\u00db\u00dc\7\r\2\2\u00dc"+
		"\u00dd\b\7\1\2\u00dd\u00df\3\2\2\2\u00dee\3\2\2\2\u00dek\3\2\2\2\u00de"+
		"q\3\2\2\2\u00dew\3\2\2\2\u00de}\3\2\2\2\u00de\u0083\3\2\2\2\u00de\u0089"+
		"\3\2\2\2\u00de\u008f\3\2\2\2\u00de\u0095\3\2\2\2\u00de\u009b\3\2\2\2\u00de"+
		"\u00a1\3\2\2\2\u00de\u00a7\3\2\2\2\u00de\u00ad\3\2\2\2\u00de\u00b3\3\2"+
		"\2\2\u00de\u00b9\3\2\2\2\u00de\u00bf\3\2\2\2\u00de\u00c5\3\2\2\2\u00de"+
		"\u00cb\3\2\2\2\u00de\u00d1\3\2\2\2\u00de\u00d3\3\2\2\2\u00de\u00d5\3\2"+
		"\2\2\u00de\u00d7\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\r\3\2\2\2\t%\'>@Qc"+
		"\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}