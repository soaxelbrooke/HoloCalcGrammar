# HoloCalcGrammar
HoloCalcGrammar is an ANTLR4 grammar that describes the computation of complex equations.  It's the core computer for [HoloCalc](https://play.google.com/store/apps/details?id=com.brogramming.HoloCalc), the modern Android calculator.  It takes strings like

```
(12+39%+3*5+4%)-sin(20)^(5*20%)-(200*200)%
```

Turns them into walkable trees like

```
imghere
```

And calculates their solution.


## How Do I Use It?
Most of the work in using it is compiling the grammar (.g4 file) into usable Java.  This process is described via the ANTLR page (https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4).  This repo also has a compiled version of the current HoloCalcParser in Java, which you can use without going through the above process.

## License
Copyright 2014 Stuart Owen.

Licensed under the [MIT license](https://tldrlegal.com/license/mit-license).