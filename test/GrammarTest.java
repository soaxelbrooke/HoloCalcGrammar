/**
 * Created by stuart on 4/28/14.
 */

import static org.junit.Assert.assertEquals;

import com.axelerateapps.HoloCalc.HoloCalcParser;
import com.axelerateapps.HoloCalc.HoloCalcLexer;

import org.antlr.v4.runtime.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GrammarTest {

    public double calculate(String equation)  {
        ANTLRInputStream input = new ANTLRInputStream(equation);
        HoloCalcLexer lexer = new HoloCalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HoloCalcParser parser = new HoloCalcParser(tokens);
        return parser.calc().result;
    }

    @Test
    public void testAddition() {assertEquals(calculate("2+3"), 5, 0.000005);}

    @Test
    public void testAdditionLarge() {assertEquals(calculate("4652344562534456253445562345426534456523445+2635445263545462354456523445652344565234465524346554-52634565234456523445652434655423465542356445234+2536454625344562534452653445625344562534456253445"), 2.6379291e+51, 1e46);}

    @Test
    public void testAdditionNegative() {assertEquals(calculate("12+(-135)"), -123, 0.000005);}

    @Test
    public void testAdditionComplex() {assertEquals(calculate("12-135+12+2-3+2+4+643+341"), 878, 0.000005);}

    @Test
    public void testNegation() {assertEquals(calculate("1+(-(-(-(-1))))"), 2, 0.000005);}

    @Test
    public void testPower() {assertEquals(calculate("2^2^2^2"), 65536, 0.000005);}

    @Test
    public void testPowerLarge() {assertEquals(calculate("12893471982347918273498127349871234^-2"), 6.0153408e-69, 1e-74);}

    @Test
    public void testComplex() {assertEquals(calculate("1234-2^2^2^2^(2-1)/5+432*3/234/(1-2^2)"), -11875.0461538, 0.000005);}

    @Test
    public void sin() {assertEquals(calculate("sin(0)"), 0, 0.000005);}

    @Test
    public void sin2() {assertEquals(calculate("sin(2)"), 0.90929742682, 0.000005);}

    @Test
    public void sinBig() {assertEquals(calculate("sin(2165161032)"), -0.86785412626, 0.000005);}

    @Test
    public void sinBigNeg() {assertEquals(calculate("sin(-56106540)"), -0.90691121013, 0.000005);}

    @Test
    public void cos() {assertEquals(calculate("cos(0)"), 1, 0.000005);}

    @Test
    public void cos2() {assertEquals(calculate("cos(2)"), -0.41614683654, 0.000005);}

    @Test
    public void cosBig() {assertEquals(calculate("cos(2165161032)"), 0.49681909738, 0.000005);}

    @Test
    public void cosBigNeg() {assertEquals(calculate("cos(-56106540)"), 0.42132179735, 0.000005);}

    @Test
    public void tan() {assertEquals(calculate("tan(1)"), 1.55740772465, 0.000005);}

    @Test
    public void tan2() {assertEquals(calculate("tan(2)"), -2.18503986326, 0.000005);}

    @Test
    public void tanBig() {assertEquals(calculate("tan(2165161032)"), -1.74682118873, 0.000005);}

    @Test
    public void tanBigNeg() {assertEquals(calculate("tan(-56106540)"), -2.1525380738, 0.000005);}

    @Test
    public void powSin() {assertEquals(calculate("2^sin(-56106540)"), 0.53332571264, 0.000005);}

    @Test
    public void sqrtPowSin() {assertEquals(calculate("sqrt(2^sin(-56106540))"), 0.73029152579, 0.000005);}

    @Test
    public void sqrtLarge() {assertEquals(calculate("sqrt(5465123515446542135468463516)"), 7.3926474e+13, 1e7);}

    @Test
    public void cbrtPowSin() {assertEquals(calculate("cbrt(2^sin(-56106540))"), 0.8109564035, 0.000005);}

    @Test
    public void cbrtLarge() {assertEquals(calculate("cbrt(5465123515446542135468463516)"), 1761435158.12, 1);}

    @Test
    public void percent() {assertEquals(1.50, calculate("150%"), 0.000005);}

    @Test
    public void percentAdd() {assertEquals(12.1, calculate("10+10%+10%"), 0.000005);}

    @Test
    public void percentSubtract() {assertEquals(8.1, calculate("10-10%-10%"), 0.000005);}

    @Test
    public void percentMultiply() {assertEquals(20, calculate("100*20%"), 0.000005);}

    @Test
    public void percentDivide() {assertEquals(500, calculate("100/20%"), 0.000005);}

    @Test
    public void percentPower() {assertEquals(1.58489319246, calculate("10^20%"), 0.000005);}

    @Test
    public void percentParens() {assertEquals(-49900, calculate("100-(100*500)%"), 0.000005);}

    @Test
    public void percentFunction() {assertEquals(0.00999999999, calculate("sin(3.14159/2)%"), 0.000005);}

    @Test
    public void percentComplex() {assertEquals(120, calculate("10+80+10+20%"), 0.0000005);}

    @Test
    public void percentComplex2() {assertEquals(19.68, calculate("12+39%+4+5-6"), 0.00000005);}

    @Test
    public void percentComplex3() {assertEquals(20.4672, calculate("12+39%+4+5-6+4%"), 0.00000005);}

    @Test
    public void percentComplex4() {assertEquals(19.5542547493, calculate("12+39%+4+5-6+4%-sin(20)^(5*20%)"), 0.0000005);}

    @Test
    public void percentComplex5() {assertEquals(-7802.14764496, calculate("12+39%+4+5-6+4%-sin(20)^(5*20%)-(200*200)%"), 0.0000005);}
}
