// Generated from /home/stuart/IdeaProjects/HoloCalcGrammar/HoloCalc.g4 by ANTLR 4.x
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, POWER=5, PERCENT=6, INT=7, DOUBLE=8, 
		OPENPAREN=9, CLOSEPAREN=10, PI=11, EXP=12, SQRE=13, CUBE=14, SQRT=15, 
		CBRT=16, LN=17, LOG10=18, LOG8=19, LOG2=20, SIN=21, COS=22, TAN=23, ASIN=24, 
		ACOS=25, ATAN=26, SIND=27, COSD=28, TAND=29, ASIND=30, ACOSD=31, ATAND=32, 
		NEWLINE=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "INT", "DOUBLE", 
		"'('", "')'", "'pi'", "'e'", "'sqre'", "'cube'", "'sqrt'", "'cbrt'", "'ln'", 
		"'log10'", "'log8'", "'log2'", "'sin'", "'cos'", "'tan'", "'asin'", "'acos'", 
		"'atan'", "'sind'", "'cosd'", "'tand'", "'asind'", "'acosd'", "'atand'", 
		"'\n'"
	};
	public static final int
		RULE_calc = 0, RULE_addsub = 1, RULE_muldiv = 2, RULE_power = 3, RULE_negation = 4, 
		RULE_atom = 5;
	public static final String[] ruleNames = {
		"calc", "addsub", "muldiv", "power", "negation", "atom"
	};

	@Override
	public String getGrammarFileName() { return "HoloCalc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public TerminalNode EOF() { return getToken(HoloCalcParser.EOF, 0); }
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
			setState(12); ((CalcContext)_localctx).value = addsub();
			setState(13); match(EOF);
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
		public TerminalNode MINUS(int i) {
			return getToken(HoloCalcParser.MINUS, i);
		}
		public MuldivContext muldiv(int i) {
			return getRuleContext(MuldivContext.class,i);
		}
		public TerminalNode PERCENT(int i) {
			return getToken(HoloCalcParser.PERCENT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(HoloCalcParser.PERCENT); }
		public List<TerminalNode> MINUS() { return getTokens(HoloCalcParser.MINUS); }
		public List<TerminalNode> PLUS() { return getTokens(HoloCalcParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HoloCalcParser.PLUS, i);
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
			setState(16); ((AddsubContext)_localctx).value = muldiv();
			((AddsubContext)_localctx).result =  ((AddsubContext)_localctx).value.result;
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(36);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(18); match(PLUS);
					setState(19); ((AddsubContext)_localctx).value2 = muldiv();
					setState(20); match(PERCENT);
					_localctx.result *= 1 + ((AddsubContext)_localctx).value2.result/100;
					}
					break;

				case 2:
					{
					setState(23); match(PLUS);
					setState(24); ((AddsubContext)_localctx).value2 = muldiv();
					_localctx.result += ((AddsubContext)_localctx).value2.result;
					}
					break;

				case 3:
					{
					setState(27); match(MINUS);
					setState(28); ((AddsubContext)_localctx).value2 = muldiv();
					setState(29); match(PERCENT);
					_localctx.result *= 1 - ((AddsubContext)_localctx).value2.result/100;
					}
					break;

				case 4:
					{
					setState(32); match(MINUS);
					setState(33); ((AddsubContext)_localctx).value2 = muldiv();
					_localctx.result -= ((AddsubContext)_localctx).value2.result;
					}
					break;
				}
				}
				setState(40);
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
		public TerminalNode PERCENT(int i) {
			return getToken(HoloCalcParser.PERCENT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(HoloCalcParser.PERCENT); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(HoloCalcParser.MULTIPLY, i);
		}
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public TerminalNode DIVIDE(int i) {
			return getToken(HoloCalcParser.DIVIDE, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(HoloCalcParser.MULTIPLY); }
		public List<TerminalNode> DIVIDE() { return getTokens(HoloCalcParser.DIVIDE); }
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
			setState(41); ((MuldivContext)_localctx).value = power();
			((MuldivContext)_localctx).result =  ((MuldivContext)_localctx).value.result;
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(61);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(43); match(MULTIPLY);
					setState(44); ((MuldivContext)_localctx).value2 = power();
					setState(45); match(PERCENT);
					_localctx.result *= ((MuldivContext)_localctx).value2.result/100;
					}
					break;

				case 2:
					{
					setState(48); match(MULTIPLY);
					setState(49); ((MuldivContext)_localctx).value2 = power();
					_localctx.result *= ((MuldivContext)_localctx).value2.result;
					}
					break;

				case 3:
					{
					setState(52); match(DIVIDE);
					setState(53); ((MuldivContext)_localctx).value2 = power();
					setState(54); match(PERCENT);
					_localctx.result /= ((MuldivContext)_localctx).value2.result/100;
					}
					break;

				case 4:
					{
					setState(57); match(DIVIDE);
					setState(58); ((MuldivContext)_localctx).value2 = power();
					_localctx.result /= ((MuldivContext)_localctx).value2.result;
					}
					break;
				}
				}
				setState(65);
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
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
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
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); ((PowerContext)_localctx).value = negation();
				setState(67); match(POWER);
				setState(68); ((PowerContext)_localctx).value2 = power();
				setState(69); match(PERCENT);
				((PowerContext)_localctx).result =  java.lang.Math.pow(((PowerContext)_localctx).value.result, ((PowerContext)_localctx).value2.result/100);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); ((PowerContext)_localctx).value = negation();
				setState(73); match(POWER);
				setState(74); ((PowerContext)_localctx).value2 = power();
				((PowerContext)_localctx).result =  java.lang.Math.pow(((PowerContext)_localctx).value.result, ((PowerContext)_localctx).value2.result);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); ((PowerContext)_localctx).value = negation();
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
		public TerminalNode MINUS() { return getToken(HoloCalcParser.MINUS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
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
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); ((NegationContext)_localctx).value = atom();
				setState(83); match(PERCENT);
				((NegationContext)_localctx).result =  ((NegationContext)_localctx).value.result/100;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); ((NegationContext)_localctx).value = atom();
				((NegationContext)_localctx).result =  ((NegationContext)_localctx).value.result;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); match(MINUS);
				setState(90); ((NegationContext)_localctx).value = atom();
				setState(91); match(PERCENT);
				((NegationContext)_localctx).result =  -((NegationContext)_localctx).value.result/100;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94); match(MINUS);
				setState(95); ((NegationContext)_localctx).value = atom();
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
		public TerminalNode LOG8() { return getToken(HoloCalcParser.LOG8, 0); }
		public TerminalNode LOG10() { return getToken(HoloCalcParser.LOG10, 0); }
		public TerminalNode INT() { return getToken(HoloCalcParser.INT, 0); }
		public AddsubContext addsub() {
			return getRuleContext(AddsubContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(HoloCalcParser.DOUBLE, 0); }
		public TerminalNode CBRT() { return getToken(HoloCalcParser.CBRT, 0); }
		public TerminalNode LOG2() { return getToken(HoloCalcParser.LOG2, 0); }
		public TerminalNode TAND() { return getToken(HoloCalcParser.TAND, 0); }
		public TerminalNode TAN() { return getToken(HoloCalcParser.TAN, 0); }
		public TerminalNode ATAND() { return getToken(HoloCalcParser.ATAND, 0); }
		public TerminalNode SIND() { return getToken(HoloCalcParser.SIND, 0); }
		public TerminalNode COSD() { return getToken(HoloCalcParser.COSD, 0); }
		public TerminalNode ACOSD() { return getToken(HoloCalcParser.ACOSD, 0); }
		public TerminalNode ACOS() { return getToken(HoloCalcParser.ACOS, 0); }
		public TerminalNode SQRT() { return getToken(HoloCalcParser.SQRT, 0); }
		public TerminalNode ASIN() { return getToken(HoloCalcParser.ASIN, 0); }
		public TerminalNode SIN() { return getToken(HoloCalcParser.SIN, 0); }
		public TerminalNode EXP() { return getToken(HoloCalcParser.EXP, 0); }
		public TerminalNode ASIND() { return getToken(HoloCalcParser.ASIND, 0); }
		public TerminalNode COS() { return getToken(HoloCalcParser.COS, 0); }
		public TerminalNode ATAN() { return getToken(HoloCalcParser.ATAN, 0); }
		public TerminalNode PI() { return getToken(HoloCalcParser.PI, 0); }
		public TerminalNode LN() { return getToken(HoloCalcParser.LN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(HoloCalcParser.CLOSEPAREN, 0); }
		public TerminalNode OPENPAREN() { return getToken(HoloCalcParser.OPENPAREN, 0); }
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
			setState(221);
			switch (_input.LA(1)) {
			case LOG10:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); match(LOG10);
				setState(101); match(OPENPAREN);
				setState(102); ((AtomContext)_localctx).exp = addsub();
				setState(103); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log10(((AtomContext)_localctx).exp.result);
				}
				break;
			case LOG8:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(LOG8);
				setState(107); match(OPENPAREN);
				setState(108); ((AtomContext)_localctx).exp = addsub();
				setState(109); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log10(((AtomContext)_localctx).exp.result)/java.lang.Math.log10(8.0);
				}
				break;
			case LOG2:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); match(LOG2);
				setState(113); match(OPENPAREN);
				setState(114); ((AtomContext)_localctx).exp = addsub();
				setState(115); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log10(((AtomContext)_localctx).exp.result)/java.lang.Math.log10(2.0);
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 4);
				{
				setState(118); match(LN);
				setState(119); match(OPENPAREN);
				setState(120); ((AtomContext)_localctx).exp = addsub();
				setState(121); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  java.lang.Math.log(((AtomContext)_localctx).exp.result);
				}
				break;
			case ASIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(124); match(ASIN);
				setState(125); match(OPENPAREN);
				setState(126); ((AtomContext)_localctx).exp = addsub();
				setState(127); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.asin(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 6);
				{
				setState(130); match(ACOS);
				setState(131); match(OPENPAREN);
				setState(132); ((AtomContext)_localctx).exp = addsub();
				setState(133); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.acos(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case ATAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(136); match(ATAN);
				setState(137); match(OPENPAREN);
				setState(138); ((AtomContext)_localctx).exp = addsub();
				setState(139); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.atan(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(142); match(SIN);
				setState(143); match(OPENPAREN);
				setState(144); ((AtomContext)_localctx).exp = addsub();
				setState(145); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.sin(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 9);
				{
				setState(148); match(COS);
				setState(149); match(OPENPAREN);
				setState(150); ((AtomContext)_localctx).exp = addsub();
				setState(151); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.cos(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 10);
				{
				setState(154); match(TAN);
				setState(155); match(OPENPAREN);
				setState(156); ((AtomContext)_localctx).exp = addsub();
				setState(157); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.tan(Math.PI*((((AtomContext)_localctx).exp.result/Math.PI) % 2));
				}
				break;
			case ASIND:
				enterOuterAlt(_localctx, 11);
				{
				setState(160); match(ASIND);
				setState(161); match(OPENPAREN);
				setState(162); ((AtomContext)_localctx).exp = addsub();
				setState(163); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  180f/Math.PI*Math.asin(((AtomContext)_localctx).exp.result);
				}
				break;
			case ACOSD:
				enterOuterAlt(_localctx, 12);
				{
				setState(166); match(ACOSD);
				setState(167); match(OPENPAREN);
				setState(168); ((AtomContext)_localctx).exp = addsub();
				setState(169); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  180f/Math.PI*Math.acos(((AtomContext)_localctx).exp.result);
				}
				break;
			case ATAND:
				enterOuterAlt(_localctx, 13);
				{
				setState(172); match(ATAND);
				setState(173); match(OPENPAREN);
				setState(174); ((AtomContext)_localctx).exp = addsub();
				setState(175); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  180f/Math.PI*Math.atan(((AtomContext)_localctx).exp.result);
				}
				break;
			case SIND:
				enterOuterAlt(_localctx, 14);
				{
				setState(178); match(SIND);
				setState(179); match(OPENPAREN);
				setState(180); ((AtomContext)_localctx).exp = addsub();
				setState(181); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.sin(Math.PI*((((AtomContext)_localctx).exp.result/180f) % 2));
				}
				break;
			case COSD:
				enterOuterAlt(_localctx, 15);
				{
				setState(184); match(COSD);
				setState(185); match(OPENPAREN);
				setState(186); ((AtomContext)_localctx).exp = addsub();
				setState(187); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.cos(Math.PI*((((AtomContext)_localctx).exp.result/180f) % 2));
				}
				break;
			case TAND:
				enterOuterAlt(_localctx, 16);
				{
				setState(190); match(TAND);
				setState(191); match(OPENPAREN);
				setState(192); ((AtomContext)_localctx).exp = addsub();
				setState(193); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  Math.tan(Math.PI*((((AtomContext)_localctx).exp.result/180f) % 2));
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 17);
				{
				setState(196); match(SQRT);
				setState(197); match(OPENPAREN);
				setState(198); ((AtomContext)_localctx).exp = addsub();
				setState(199); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  (double) java.lang.Math.pow(((AtomContext)_localctx).exp.result, 0.5);
				}
				break;
			case CBRT:
				enterOuterAlt(_localctx, 18);
				{
				setState(202); match(CBRT);
				setState(203); match(OPENPAREN);
				setState(204); ((AtomContext)_localctx).exp = addsub();
				setState(205); match(CLOSEPAREN);
				((AtomContext)_localctx).result =  (double) java.lang.Math.pow(((AtomContext)_localctx).exp.result, 1.0/3.0);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 19);
				{
				setState(208); ((AtomContext)_localctx).DOUBLE = match(DOUBLE);
				((AtomContext)_localctx).result =  (double) Double.parseDouble((((AtomContext)_localctx).DOUBLE!=null?((AtomContext)_localctx).DOUBLE.getText():null).replaceAll(",", ""));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 20);
				{
				setState(210); ((AtomContext)_localctx).INT = match(INT);
				((AtomContext)_localctx).result =  (double) Double.parseDouble((((AtomContext)_localctx).INT!=null?((AtomContext)_localctx).INT.getText():null).replaceAll(",", ""));
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 21);
				{
				setState(212); match(PI);
				((AtomContext)_localctx).result =  (double) java.lang.Math.PI;
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 22);
				{
				setState(214); match(EXP);
				((AtomContext)_localctx).result =  (double) java.lang.Math.E;
				}
				break;
			case OPENPAREN:
				enterOuterAlt(_localctx, 23);
				{
				setState(216); match(OPENPAREN);
				setState(217); ((AtomContext)_localctx).exp2 = addsub();
				setState(218); match(CLOSEPAREN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\'"+
		"\n\3\f\3\16\3*\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e0\n\7\3\7\2\2"+
		"\b\2\4\6\b\n\f\2\2\u00fe\2\16\3\2\2\2\4\22\3\2\2\2\6+\3\2\2\2\bR\3\2\2"+
		"\2\nd\3\2\2\2\f\u00df\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\21\b\2\1"+
		"\2\21\3\3\2\2\2\22\23\5\6\4\2\23(\b\3\1\2\24\25\7\3\2\2\25\26\5\6\4\2"+
		"\26\27\7\b\2\2\27\30\b\3\1\2\30\'\3\2\2\2\31\32\7\3\2\2\32\33\5\6\4\2"+
		"\33\34\b\3\1\2\34\'\3\2\2\2\35\36\7\4\2\2\36\37\5\6\4\2\37 \7\b\2\2 !"+
		"\b\3\1\2!\'\3\2\2\2\"#\7\4\2\2#$\5\6\4\2$%\b\3\1\2%\'\3\2\2\2&\24\3\2"+
		"\2\2&\31\3\2\2\2&\35\3\2\2\2&\"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2"+
		")\5\3\2\2\2*(\3\2\2\2+,\5\b\5\2,A\b\4\1\2-.\7\5\2\2./\5\b\5\2/\60\7\b"+
		"\2\2\60\61\b\4\1\2\61@\3\2\2\2\62\63\7\5\2\2\63\64\5\b\5\2\64\65\b\4\1"+
		"\2\65@\3\2\2\2\66\67\7\6\2\2\678\5\b\5\289\7\b\2\29:\b\4\1\2:@\3\2\2\2"+
		";<\7\6\2\2<=\5\b\5\2=>\b\4\1\2>@\3\2\2\2?-\3\2\2\2?\62\3\2\2\2?\66\3\2"+
		"\2\2?;\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2\2\2DE\5"+
		"\n\6\2EF\7\7\2\2FG\5\b\5\2GH\7\b\2\2HI\b\5\1\2IS\3\2\2\2JK\5\n\6\2KL\7"+
		"\7\2\2LM\5\b\5\2MN\b\5\1\2NS\3\2\2\2OP\5\n\6\2PQ\b\5\1\2QS\3\2\2\2RD\3"+
		"\2\2\2RJ\3\2\2\2RO\3\2\2\2S\t\3\2\2\2TU\5\f\7\2UV\7\b\2\2VW\b\6\1\2We"+
		"\3\2\2\2XY\5\f\7\2YZ\b\6\1\2Ze\3\2\2\2[\\\7\4\2\2\\]\5\f\7\2]^\7\b\2\2"+
		"^_\b\6\1\2_e\3\2\2\2`a\7\4\2\2ab\5\f\7\2bc\b\6\1\2ce\3\2\2\2dT\3\2\2\2"+
		"dX\3\2\2\2d[\3\2\2\2d`\3\2\2\2e\13\3\2\2\2fg\7\24\2\2gh\7\13\2\2hi\5\4"+
		"\3\2ij\7\f\2\2jk\b\7\1\2k\u00e0\3\2\2\2lm\7\25\2\2mn\7\13\2\2no\5\4\3"+
		"\2op\7\f\2\2pq\b\7\1\2q\u00e0\3\2\2\2rs\7\26\2\2st\7\13\2\2tu\5\4\3\2"+
		"uv\7\f\2\2vw\b\7\1\2w\u00e0\3\2\2\2xy\7\23\2\2yz\7\13\2\2z{\5\4\3\2{|"+
		"\7\f\2\2|}\b\7\1\2}\u00e0\3\2\2\2~\177\7\32\2\2\177\u0080\7\13\2\2\u0080"+
		"\u0081\5\4\3\2\u0081\u0082\7\f\2\2\u0082\u0083\b\7\1\2\u0083\u00e0\3\2"+
		"\2\2\u0084\u0085\7\33\2\2\u0085\u0086\7\13\2\2\u0086\u0087\5\4\3\2\u0087"+
		"\u0088\7\f\2\2\u0088\u0089\b\7\1\2\u0089\u00e0\3\2\2\2\u008a\u008b\7\34"+
		"\2\2\u008b\u008c\7\13\2\2\u008c\u008d\5\4\3\2\u008d\u008e\7\f\2\2\u008e"+
		"\u008f\b\7\1\2\u008f\u00e0\3\2\2\2\u0090\u0091\7\27\2\2\u0091\u0092\7"+
		"\13\2\2\u0092\u0093\5\4\3\2\u0093\u0094\7\f\2\2\u0094\u0095\b\7\1\2\u0095"+
		"\u00e0\3\2\2\2\u0096\u0097\7\30\2\2\u0097\u0098\7\13\2\2\u0098\u0099\5"+
		"\4\3\2\u0099\u009a\7\f\2\2\u009a\u009b\b\7\1\2\u009b\u00e0\3\2\2\2\u009c"+
		"\u009d\7\31\2\2\u009d\u009e\7\13\2\2\u009e\u009f\5\4\3\2\u009f\u00a0\7"+
		"\f\2\2\u00a0\u00a1\b\7\1\2\u00a1\u00e0\3\2\2\2\u00a2\u00a3\7 \2\2\u00a3"+
		"\u00a4\7\13\2\2\u00a4\u00a5\5\4\3\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\b"+
		"\7\1\2\u00a7\u00e0\3\2\2\2\u00a8\u00a9\7!\2\2\u00a9\u00aa\7\13\2\2\u00aa"+
		"\u00ab\5\4\3\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\b\7\1\2\u00ad\u00e0\3\2"+
		"\2\2\u00ae\u00af\7\"\2\2\u00af\u00b0\7\13\2\2\u00b0\u00b1\5\4\3\2\u00b1"+
		"\u00b2\7\f\2\2\u00b2\u00b3\b\7\1\2\u00b3\u00e0\3\2\2\2\u00b4\u00b5\7\35"+
		"\2\2\u00b5\u00b6\7\13\2\2\u00b6\u00b7\5\4\3\2\u00b7\u00b8\7\f\2\2\u00b8"+
		"\u00b9\b\7\1\2\u00b9\u00e0\3\2\2\2\u00ba\u00bb\7\36\2\2\u00bb\u00bc\7"+
		"\13\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7\f\2\2\u00be\u00bf\b\7\1\2\u00bf"+
		"\u00e0\3\2\2\2\u00c0\u00c1\7\37\2\2\u00c1\u00c2\7\13\2\2\u00c2\u00c3\5"+
		"\4\3\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\b\7\1\2\u00c5\u00e0\3\2\2\2\u00c6"+
		"\u00c7\7\21\2\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9\5\4\3\2\u00c9\u00ca\7"+
		"\f\2\2\u00ca\u00cb\b\7\1\2\u00cb\u00e0\3\2\2\2\u00cc\u00cd\7\22\2\2\u00cd"+
		"\u00ce\7\13\2\2\u00ce\u00cf\5\4\3\2\u00cf\u00d0\7\f\2\2\u00d0\u00d1\b"+
		"\7\1\2\u00d1\u00e0\3\2\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00e0\b\7\1\2\u00d4"+
		"\u00d5\7\t\2\2\u00d5\u00e0\b\7\1\2\u00d6\u00d7\7\r\2\2\u00d7\u00e0\b\7"+
		"\1\2\u00d8\u00d9\7\16\2\2\u00d9\u00e0\b\7\1\2\u00da\u00db\7\13\2\2\u00db"+
		"\u00dc\5\4\3\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\b\7\1\2\u00de\u00e0\3\2"+
		"\2\2\u00dff\3\2\2\2\u00dfl\3\2\2\2\u00dfr\3\2\2\2\u00dfx\3\2\2\2\u00df"+
		"~\3\2\2\2\u00df\u0084\3\2\2\2\u00df\u008a\3\2\2\2\u00df\u0090\3\2\2\2"+
		"\u00df\u0096\3\2\2\2\u00df\u009c\3\2\2\2\u00df\u00a2\3\2\2\2\u00df\u00a8"+
		"\3\2\2\2\u00df\u00ae\3\2\2\2\u00df\u00b4\3\2\2\2\u00df\u00ba\3\2\2\2\u00df"+
		"\u00c0\3\2\2\2\u00df\u00c6\3\2\2\2\u00df\u00cc\3\2\2\2\u00df\u00d2\3\2"+
		"\2\2\u00df\u00d4\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d8\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00e0\r\3\2\2\2\t&(?ARd\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}