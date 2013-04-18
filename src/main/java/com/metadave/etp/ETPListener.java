// Generated from ./src/main/java/com/metadave/etp/ETP.g4 by ANTLR 4.0
package com.metadave.etp;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ETPListener extends ParseTreeListener {
	void enterEtp_term(ETPParser.Etp_termContext ctx);
	void exitEtp_term(ETPParser.Etp_termContext ctx);

	void enterEtp_float(ETPParser.Etp_floatContext ctx);
	void exitEtp_float(ETPParser.Etp_floatContext ctx);

	void enterEtp_tuple(ETPParser.Etp_tupleContext ctx);
	void exitEtp_tuple(ETPParser.Etp_tupleContext ctx);

	void enterEtp_atom(ETPParser.Etp_atomContext ctx);
	void exitEtp_atom(ETPParser.Etp_atomContext ctx);

	void enterEtp_string(ETPParser.Etp_stringContext ctx);
	void exitEtp_string(ETPParser.Etp_stringContext ctx);

	void enterEtp_bool(ETPParser.Etp_boolContext ctx);
	void exitEtp_bool(ETPParser.Etp_boolContext ctx);

	void enterEtp_list(ETPParser.Etp_listContext ctx);
	void exitEtp_list(ETPParser.Etp_listContext ctx);

	void enterEtp_int(ETPParser.Etp_intContext ctx);
	void exitEtp_int(ETPParser.Etp_intContext ctx);
}