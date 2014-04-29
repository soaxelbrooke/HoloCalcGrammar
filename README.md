# HoloCalcGrammar
HoloCalcGrammar is an ANTLR4 grammar that describes the computation of complex equations.  It's the core computer for [HoloCalc](https://play.google.com/store/apps/details?id=com.brogramming.HoloCalc), the modern Android calculator.  It takes strings like

```
(12+39%+3*5+4%)-sin(20)^(5*20%)-(200*200)%
```

Turns them into walkable trees like

![ANTLR Parse Tree](http://stuartowen.com/host/antlr_parse_tree.png)

And calculates their solution. (The answer is -12781.6676, in case you're wondering)


## How Do I Use It?
Most of the work in using it is compiling the grammar (.g4 file) into a more useful language.  This process is described via the ANTLR [getting-started page](https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4).  This repo also has a compiled version of the current HoloCalcParser in Java, which you can use without going through the above process.

You can use the generated lexer and parser to calculate equations like so:

```Java
import com.axelerateapps.HoloCalc.HoloCalcParser;
import com.axelerateapps.HoloCalc.HoloCalcLexer;
import org.antlr.v4.runtime.*;

public double calculate(String equation)  {
    ANTLRInputStream input = new ANTLRInputStream(equation);
    HoloCalcLexer lexer = new HoloCalcLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    HoloCalcParser parser = new HoloCalcParser(tokens);
    return parser.calc().result;
}
```

## License
Copyright 2014 Stuart Owen.

Licensed under the [MIT license](https://tldrlegal.com/license/mit-license).