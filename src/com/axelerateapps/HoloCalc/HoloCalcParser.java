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
		public TerminalNode EQUALS() { return getToken(HoloCalcParser.EQUALS, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((CalcContext)_localctx).value = addsub();
			setState(14);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(13);
				match(EQUALS);
				}
			}

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
			setState(18);
			((AddsubContext)_localctx).value = muldiv();
			((AddsubContext)_localctx).result =  ((AddsubContext)_localctx).value.result;
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(38);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(20);
					match(PLUS);
					setState(21);
					((AddsubContext)_localctx).value2 = muldiv();
					setState(22);
					match(PERCENT);
					_localctx.result *= 1 + ((AddsubContext)_localctx).value2.result/100;
					}
					break;
				case 2:
					{
					setState(25);
					match(PLUS);
					setState(26);
					((AddsubContext)_localctx).value2 = muldiv();
					_localctx.result += ((AddsubContext)_localctx).value2.result;
					}
					break;
				case 3:
					{
					setState(29);
					match(MINUS);
					setState(30);
					((AddsubContext)_localctx).value2 = muldiv();
					setState(31);
					match(PERCENT);
					_localctx.result *= 1 - ((AddsubContext)_localctx).value2.result/100;
					}
					break;
				case 4:
					{
					setState(34);
					match(MINUS);
					setState(35);
					((AddsubContext)_localctx).value2 = muldiv();
					_localctx.result -= ((AddsubContext)_localctx).value2.result;
					}
					break;
				}
				}
				setState(42);
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
			setState(43);
			((MuldivContext)_localctx).value = power();
			((MuldivContext)_localctx).result =  ((MuldivContext)_localctx).value.result;
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(63);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(45);
					match(MULTIPLY);
					setState(46);
					((MuldivContext)_localctx).value2 = power();
					setState(47);
					match(PERCENT);
					_localctx.result *= ((MuldivContext)_localctx).value2.result/100;
					}
					break;
				case 2:
					{
					setState(50);
					match(MULTIPLY);
					setState(51);
					((MuldivContext)_localctx).value2 = power();
					_localctx.result *= ((MuldivContext)_localctx).value2.result;
					}
					break;
				case 3:
					{
					setState(54);
					match(DIVIDE);
					setState(55);
					((MuldivContext)_localctx).value2 = power();
					setState(56);
					match(PERCENT);
					_localctx.result /= ((MuldivContext)_localctx).value2.result/100;
					}
					break;
				case 4:
					{
					setState(59);
					match(DIVIDE);
					setState(60);
					((MuldivContext)_localctx).value2 = power();
					_localctx.result /= ((MuldivContext)_localctx).value2.result;
					}
					break;
				}
				}
				setState(67);
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
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((PowerContext)_localctx).value = negation();
				setState(69);
				match(POWER);
				setState(70);
				((PowerContext)_localctx).value2 = power();
				setState(71);
				match(PERCENT);
				((PowerContext)_localctx).result =  java.lang.Math.pow(((PowerContext)_localctx).value.result, ((PowerContext)_localctx).value2.result/100);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((PowerContext)_localctx).value = negation();
				setState(75);
				match(POWER);
				setState(76);
				((PowerContext)_localctx).value2 = power();
				((PowerContext)_localctx).result =  java.lang.Math.pow(((PowerContext)_localctx).value.result, ((PowerContext)_localctx).value2.result);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
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
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((NegationContext)_localctx).value = atom();
				setState(85);
				match(PERCENT);
				((NegationContext)_localctx).result =  ((NegationContext)_localctx).value.result/100;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				((NegationContext)_localctx).value = atom();
				((NegationContext)_localctx).result =  ((NegationContext)_localctx).value.result;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(INVERT);
				setState(92);
				((NegationContext)_localctx).value = atom();
				setState(93);
				match(PERCENT);
				((NegationContext)_localctx).result =  -((NegationContext)_localctx).value.result/100;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(INVERT);
				setState(97);
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
			setState(223);
			switch (_input.LA(1)) {
			case LOG10:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(LOG10);
				setState(103);
				match(OPENPAREN);
				setState(104);
				((AtomContext)_localctx).exp = addsub();
				setState(105);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log10(((AtomContext)_localctx).exp.result);
				}
				break;
			case LOG8:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(LOG8);
				setState(109);
				match(OPENPAREN);
				setState(110);
				((AtomContext)_localctx).exp = addsub();
				setState(111);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log10(((AtomContext)_localctx).exp.result)/java.lang.Math.log10(8.0);
				}
				break;
			case LOG2:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(LOG2);
				setState(115);
				match(OPENPAREN);
				setState(116);
				((AtomContext)_localctx).exp = addsub();
				setState(117);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log10(((AtomContext)_localctx).exp.result)/java.lang.Math.log10(2.0);
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(LN);
				setState(121);
				match(OPENPAREN);
				setState(122);
				((AtomContext)_localctx).exp = addsub();
				setState(123);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log(((AtomContext)_localctx).exp.result);
				}
				break;
			case ASIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(ASIN);
				setState(127);
				match(OPENPAREN);
				setState(128);
				((AtomContext)_localctx).exp = addsub();
				setState(129);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.asin(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(ACOS);
				setState(133);
				match(OPENPAREN);
				setState(134);
				((AtomContext)_localctx).exp = addsub();
				setState(135);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.acos(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case ATAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				match(ATAN);
				setState(139);
				match(OPENPAREN);
				setState(140);
				((AtomContext)_localctx).exp = addsub();
				setState(141);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.atan(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				match(SIN);
				setState(145);
				match(OPENPAREN);
				setState(146);
				((AtomContext)_localctx).exp = addsub();
				setState(147);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.sin(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 9);
				{
				setState(150);
				match(COS);
				setState(151);
				match(OPENPAREN);
				setState(152);
				((AtomContext)_localctx).exp = addsub();
				setState(153);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.cos(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 10);
				{
				setState(156);
				match(TAN);
				setState(157);
				match(OPENPAREN);
				setState(158);
				((AtomContext)_localctx).exp = addsub();
				setState(159);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.tan(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case ASIND:
				enterOuterAlt(_localctx, 11);
				{
				setState(162);
				match(ASIND);
				setState(163);
				match(OPENPAREN);
				setState(164);
				((AtomContext)_localctx).exp = addsub();
				setState(165);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  180f/Math.PI*Math.asin(((AtomContext)_localctx).exp.result);
				}
				break;
			case ACOSD:
				enterOuterAlt(_localctx, 12);
				{
				setState(168);
				match(ACOSD);
				setState(169);
				match(OPENPAREN);
				setState(170);
				((AtomContext)_localctx).exp = addsub();
				setState(171);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  180f/Math.PI*Math.acos(((AtomContext)_localctx).exp.result);
				}
				break;
			case ATAND:
				enterOuterAlt(_localctx, 13);
				{
				setState(174);
				match(ATAND);
				setState(175);
				match(OPENPAREN);
				setState(176);
				((AtomContext)_localctx).exp = addsub();
				setState(177);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  180f/Math.PI*Math.atan(((AtomContext)_localctx).exp.result);
				}
				break;
			case SIND:
				enterOuterAlt(_localctx, 14);
				{
				setState(180);
				match(SIND);
				setState(181);
				match(OPENPAREN);
				setState(182);
				((AtomContext)_localctx).exp = addsub();
				setState(183);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.sin(Math.PI*((((AtomContext)_localctx).exp.result/180f) % 2));
				}
				break;
			case COSD:
				enterOuterAlt(_localctx, 15);
				{
				setState(186);
				match(COSD);
				setState(187);
				match(OPENPAREN);
				setState(188);
				((AtomContext)_localctx).exp = addsub();
				setState(189);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.cos(Math.PI*((((AtomContext)_localctx).exp.result/180f) % 2));
				}
				break;
			case TAND:
				enterOuterAlt(_localctx, 16);
				{
				setState(192);
				match(TAND);
				setState(193);
				match(OPENPAREN);
				setState(194);
				((AtomContext)_localctx).exp = addsub();
				setState(195);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.tan(Math.PI*((((AtomContext)_localctx).exp.result/180f) % 2));
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 17);
				{
				setState(198);
				match(SQRT);
				setState(199);
				match(OPENPAREN);
				setState(200);
				((AtomContext)_localctx).exp = addsub();
				setState(201);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  (double) java.lang.Math.pow(((AtomContext)_localctx).exp.result, 0.5);
				}
				break;
			case CBRT:
				enterOuterAlt(_localctx, 18);
				{
				setState(204);
				match(CBRT);
				setState(205);
				match(OPENPAREN);
				setState(206);
				((AtomContext)_localctx).exp = addsub();
				setState(207);
				match(CLOSEPAREN);
				((AtomContext)_localctx).result =  (double) java.lang.Math.pow(((AtomContext)_localctx).exp.result, 1.0/3.0);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 19);
				{
				setState(210);
				((AtomContext)_localctx).DOUBLE = match(DOUBLE);
				((AtomContext)_localctx).result =  (double) Double.parseDouble((((AtomContext)_localctx).DOUBLE!=null?((AtomContext)_localctx).DOUBLE.getText():null).replaceAll(",", ""));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 20);
				{
				setState(212);
				((AtomContext)_localctx).INT = match(INT);
				((AtomContext)_localctx).result =  (double) Double.parseDouble((((AtomContext)_localctx).INT!=null?((AtomContext)_localctx).INT.getText():null).replaceAll(",", ""));
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 21);
				{
				setState(214);
				match(PI);
				((AtomContext)_localctx).result =  (double) java.lang.Math.PI;
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 22);
				{
				setState(216);
				match(EXP);
				((AtomContext)_localctx).result =  (double) java.lang.Math.E;
				}
				break;
			case OPENPAREN:
				enterOuterAlt(_localctx, 23);
				{
				setState(218);
				match(OPENPAREN);
				setState(219);
				((AtomContext)_localctx).exp2 = addsub();
				setState(220);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\5\2\21\n\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5U\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e2\n"+
		"\7\3\7\2\2\b\2\4\6\b\n\f\2\2\u0101\2\16\3\2\2\2\4\24\3\2\2\2\6-\3\2\2"+
		"\2\bT\3\2\2\2\nf\3\2\2\2\f\u00e1\3\2\2\2\16\20\5\4\3\2\17\21\7%\2\2\20"+
		"\17\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2\2\22\23\b\2\1\2\23\3\3\2\2\2\24"+
		"\25\5\6\4\2\25*\b\3\1\2\26\27\7\3\2\2\27\30\5\6\4\2\30\31\7\b\2\2\31\32"+
		"\b\3\1\2\32)\3\2\2\2\33\34\7\3\2\2\34\35\5\6\4\2\35\36\b\3\1\2\36)\3\2"+
		"\2\2\37 \7\4\2\2 !\5\6\4\2!\"\7\b\2\2\"#\b\3\1\2#)\3\2\2\2$%\7\4\2\2%"+
		"&\5\6\4\2&\'\b\3\1\2\')\3\2\2\2(\26\3\2\2\2(\33\3\2\2\2(\37\3\2\2\2($"+
		"\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3\2\2\2-.\5\b\5\2"+
		".C\b\4\1\2/\60\7\5\2\2\60\61\5\b\5\2\61\62\7\b\2\2\62\63\b\4\1\2\63B\3"+
		"\2\2\2\64\65\7\5\2\2\65\66\5\b\5\2\66\67\b\4\1\2\67B\3\2\2\289\7\6\2\2"+
		"9:\5\b\5\2:;\7\b\2\2;<\b\4\1\2<B\3\2\2\2=>\7\6\2\2>?\5\b\5\2?@\b\4\1\2"+
		"@B\3\2\2\2A/\3\2\2\2A\64\3\2\2\2A8\3\2\2\2A=\3\2\2\2BE\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2D\7\3\2\2\2EC\3\2\2\2FG\5\n\6\2GH\7\7\2\2HI\5\b\5\2IJ\7\b"+
		"\2\2JK\b\5\1\2KU\3\2\2\2LM\5\n\6\2MN\7\7\2\2NO\5\b\5\2OP\b\5\1\2PU\3\2"+
		"\2\2QR\5\n\6\2RS\b\5\1\2SU\3\2\2\2TF\3\2\2\2TL\3\2\2\2TQ\3\2\2\2U\t\3"+
		"\2\2\2VW\5\f\7\2WX\7\b\2\2XY\b\6\1\2Yg\3\2\2\2Z[\5\f\7\2[\\\b\6\1\2\\"+
		"g\3\2\2\2]^\7\t\2\2^_\5\f\7\2_`\7\b\2\2`a\b\6\1\2ag\3\2\2\2bc\7\t\2\2"+
		"cd\5\f\7\2de\b\6\1\2eg\3\2\2\2fV\3\2\2\2fZ\3\2\2\2f]\3\2\2\2fb\3\2\2\2"+
		"g\13\3\2\2\2hi\7\25\2\2ij\7\f\2\2jk\5\4\3\2kl\7\r\2\2lm\b\7\1\2m\u00e2"+
		"\3\2\2\2no\7\26\2\2op\7\f\2\2pq\5\4\3\2qr\7\r\2\2rs\b\7\1\2s\u00e2\3\2"+
		"\2\2tu\7\27\2\2uv\7\f\2\2vw\5\4\3\2wx\7\r\2\2xy\b\7\1\2y\u00e2\3\2\2\2"+
		"z{\7\24\2\2{|\7\f\2\2|}\5\4\3\2}~\7\r\2\2~\177\b\7\1\2\177\u00e2\3\2\2"+
		"\2\u0080\u0081\7\33\2\2\u0081\u0082\7\f\2\2\u0082\u0083\5\4\3\2\u0083"+
		"\u0084\7\r\2\2\u0084\u0085\b\7\1\2\u0085\u00e2\3\2\2\2\u0086\u0087\7\34"+
		"\2\2\u0087\u0088\7\f\2\2\u0088\u0089\5\4\3\2\u0089\u008a\7\r\2\2\u008a"+
		"\u008b\b\7\1\2\u008b\u00e2\3\2\2\2\u008c\u008d\7\35\2\2\u008d\u008e\7"+
		"\f\2\2\u008e\u008f\5\4\3\2\u008f\u0090\7\r\2\2\u0090\u0091\b\7\1\2\u0091"+
		"\u00e2\3\2\2\2\u0092\u0093\7\30\2\2\u0093\u0094\7\f\2\2\u0094\u0095\5"+
		"\4\3\2\u0095\u0096\7\r\2\2\u0096\u0097\b\7\1\2\u0097\u00e2\3\2\2\2\u0098"+
		"\u0099\7\31\2\2\u0099\u009a\7\f\2\2\u009a\u009b\5\4\3\2\u009b\u009c\7"+
		"\r\2\2\u009c\u009d\b\7\1\2\u009d\u00e2\3\2\2\2\u009e\u009f\7\32\2\2\u009f"+
		"\u00a0\7\f\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3\b\7"+
		"\1\2\u00a3\u00e2\3\2\2\2\u00a4\u00a5\7!\2\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\u00a7\5\4\3\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\b\7\1\2\u00a9\u00e2\3\2"+
		"\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\5\4\3\2\u00ad"+
		"\u00ae\7\r\2\2\u00ae\u00af\b\7\1\2\u00af\u00e2\3\2\2\2\u00b0\u00b1\7#"+
		"\2\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\5\4\3\2\u00b3\u00b4\7\r\2\2\u00b4"+
		"\u00b5\b\7\1\2\u00b5\u00e2\3\2\2\2\u00b6\u00b7\7\36\2\2\u00b7\u00b8\7"+
		"\f\2\2\u00b8\u00b9\5\4\3\2\u00b9\u00ba\7\r\2\2\u00ba\u00bb\b\7\1\2\u00bb"+
		"\u00e2\3\2\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00be\7\f\2\2\u00be\u00bf\5"+
		"\4\3\2\u00bf\u00c0\7\r\2\2\u00c0\u00c1\b\7\1\2\u00c1\u00e2\3\2\2\2\u00c2"+
		"\u00c3\7 \2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\5\4\3\2\u00c5\u00c6\7\r"+
		"\2\2\u00c6\u00c7\b\7\1\2\u00c7\u00e2\3\2\2\2\u00c8\u00c9\7\22\2\2\u00c9"+
		"\u00ca\7\f\2\2\u00ca\u00cb\5\4\3\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\b\7"+
		"\1\2\u00cd\u00e2\3\2\2\2\u00ce\u00cf\7\23\2\2\u00cf\u00d0\7\f\2\2\u00d0"+
		"\u00d1\5\4\3\2\u00d1\u00d2\7\r\2\2\u00d2\u00d3\b\7\1\2\u00d3\u00e2\3\2"+
		"\2\2\u00d4\u00d5\7\13\2\2\u00d5\u00e2\b\7\1\2\u00d6\u00d7\7\n\2\2\u00d7"+
		"\u00e2\b\7\1\2\u00d8\u00d9\7\16\2\2\u00d9\u00e2\b\7\1\2\u00da\u00db\7"+
		"\17\2\2\u00db\u00e2\b\7\1\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\5\4\3\2\u00de"+
		"\u00df\7\r\2\2\u00df\u00e0\b\7\1\2\u00e0\u00e2\3\2\2\2\u00e1h\3\2\2\2"+
		"\u00e1n\3\2\2\2\u00e1t\3\2\2\2\u00e1z\3\2\2\2\u00e1\u0080\3\2\2\2\u00e1"+
		"\u0086\3\2\2\2\u00e1\u008c\3\2\2\2\u00e1\u0092\3\2\2\2\u00e1\u0098\3\2"+
		"\2\2\u00e1\u009e\3\2\2\2\u00e1\u00a4\3\2\2\2\u00e1\u00aa\3\2\2\2\u00e1"+
		"\u00b0\3\2\2\2\u00e1\u00b6\3\2\2\2\u00e1\u00bc\3\2\2\2\u00e1\u00c2\3\2"+
		"\2\2\u00e1\u00c8\3\2\2\2\u00e1\u00ce\3\2\2\2\u00e1\u00d4\3\2\2\2\u00e1"+
		"\u00d6\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00dc\3\2"+
		"\2\2\u00e2\r\3\2\2\2\n\20(*ACTf\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}