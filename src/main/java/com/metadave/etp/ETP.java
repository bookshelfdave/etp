package com.metadave.etp;


import com.metadave.etp.rep.ETPTerm;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.InputStream;

public class ETP {
    public static ETPTerm parse(String s) {
        ANTLRInputStream input = new ANTLRInputStream(s);
        ETPLexer lexer = new ETPLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ETPParser parser = new ETPParser(tokens);
        ETPWalker ew = new ETPWalker();
        ParseTreeWalker walker = new ParseTreeWalker();
        ETPTerm<?> term = null;
        ETPParser.Etp_termContext t = parser.etp_term();
        walker.walk(ew, t);
        term = (ETPTerm<?>)ew.getValue(t);
        return term;
    }

    public static ETPTerm parse(InputStream is) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(is);
        ETPLexer lexer = new ETPLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ETPParser parser = new ETPParser(tokens);
        ETPWalker ew = new ETPWalker();
        ParseTreeWalker walker = new ParseTreeWalker();
        ETPTerm<?> term = null;
        ETPParser.Etp_termContext t = parser.etp_term();
        walker.walk(ew, t);
        term = (ETPTerm<?>)ew.getValue(t);
        return term;
    }
}

