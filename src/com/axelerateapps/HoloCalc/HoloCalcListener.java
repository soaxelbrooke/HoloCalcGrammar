// Generated from /home/stuart/IdeaProjects/HoloCalcGrammar/HoloCalc.g4 by ANTLR 4.x
package com.axelerateapps.HoloCalc;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HoloCalcParser}.
 */
public interface HoloCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(@NotNull HoloCalcParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(@NotNull HoloCalcParser.NegationContext ctx);

	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull HoloCalcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull HoloCalcParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#addsub}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(@NotNull HoloCalcParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#addsub}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(@NotNull HoloCalcParser.AddsubContext ctx);

	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull HoloCalcParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull HoloCalcParser.PowerContext ctx);

	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#muldiv}.
	 * @param ctx the parse tree
	 */
	void enterMuldiv(@NotNull HoloCalcParser.MuldivContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#muldiv}.
	 * @param ctx the parse tree
	 */
	void exitMuldiv(@NotNull HoloCalcParser.MuldivContext ctx);

	/**
	 * Enter a parse tree produced by {@link HoloCalcParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(@NotNull HoloCalcParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HoloCalcParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(@NotNull HoloCalcParser.CalcContext ctx);
}