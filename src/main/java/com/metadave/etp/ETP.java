package com.metadave.etp;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;

public class ETP {
     public static void main(String args[]) throws Exception {
         //String line = "{hello, world}";
         File f = new File("/Users/dparfitt/basho/riak/dev/dev1/etc/app.config");
         String line =
                 org.apache.commons.io.FileUtils.readFileToString(f);
         ANTLRInputStream input = new ANTLRInputStream(line);
         ETPLexer lexer = new ETPLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         ETPParser parser = new ETPParser(tokens);
         ETPWalker ew = new ETPWalker();

         ParseTreeWalker walker = new ParseTreeWalker();
         try {
             ETPParser.Etp_termContext t = parser.etp_term();
             walker.walk(ew, t);
             System.out.println(ew.getValue(t));
         } catch (Throwable t) {
             // catch parse errors. ANTLR will display a message for me.
         }
         
     }
}
