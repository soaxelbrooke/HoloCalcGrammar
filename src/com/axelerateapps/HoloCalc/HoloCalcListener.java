// Generated from HoloCalc.g4 by ANTLR 4.5
package com.axelerateapps.HoloCalc;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HoloCalcParser}.
 */
public interface HoloCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(HoloCalcParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(HoloCalcParser.CalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#addsub}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(HoloCalcParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#addsub}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(HoloCalcParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#muldiv}.
	 * @param ctx the parse tree
	 */
	void enterMuldiv(HoloCalcParser.MuldivContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#muldiv}.
	 * @param ctx the parse tree
	 */
	void exitMuldiv(HoloCalcParser.MuldivContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(HoloCalcParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(HoloCalcParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(HoloCalcParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(HoloCalcParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(HoloCalcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(HoloCalcParser.AtomContext ctx);
}