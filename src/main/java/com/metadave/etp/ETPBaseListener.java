// Generated from ./src/main/java/com/metadave/etp/ETP.g4 by ANTLR 4.0
package com.metadave.etp;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class ETPBaseListener implements ETPListener {
	@Override public void enterEtp_term(ETPParser.Etp_termContext ctx) { }
	@Override public void exitEtp_term(ETPParser.Etp_termContext ctx) { }

	@Override public void enterEtp_float(ETPParser.Etp_floatContext ctx) { }
	@Override public void exitEtp_float(ETPParser.Etp_floatContext ctx) { }

	@Override public void enterEtp_tuple(ETPParser.Etp_tupleContext ctx) { }
	@Override public void exitEtp_tuple(ETPParser.Etp_tupleContext ctx) { }

	@Override public void enterEtp_atom(ETPParser.Etp_atomContext ctx) { }
	@Override public void exitEtp_atom(ETPParser.Etp_atomContext ctx) { }

	@Override public void enterEtp_string(ETPParser.Etp_stringContext ctx) { }
	@Override public void exitEtp_string(ETPParser.Etp_stringContext ctx) { }

	@Override public void enterEtp_bool(ETPParser.Etp_boolContext ctx) { }
	@Override public void exitEtp_bool(ETPParser.Etp_boolContext ctx) { }

	@Override public void enterEtp_list(ETPParser.Etp_listContext ctx) { }
	@Override public void exitEtp_list(ETPParser.Etp_listContext ctx) { }

	@Override public void enterEtp_int(ETPParser.Etp_intContext ctx) { }
	@Override public void exitEtp_int(ETPParser.Etp_intContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}