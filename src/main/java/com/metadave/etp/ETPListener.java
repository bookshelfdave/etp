// Generated from ./src/main/java/com/metadave/etp/ETP.g4 by ANTLR 4.0
package com.metadave.etp;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ETPListener extends ParseTreeListener {
	void enterEtp_list(ETPParser.Etp_listContext ctx);
	void exitEtp_list(ETPParser.Etp_listContext ctx);

	void enterEtp_string(ETPParser.Etp_stringContext ctx);
	void exitEtp_string(ETPParser.Etp_stringContext ctx);

	void enterEtp_ref(ETPParser.Etp_refContext ctx);
	void exitEtp_ref(ETPParser.Etp_refContext ctx);

	void enterEtp_int(ETPParser.Etp_intContext ctx);
	void exitEtp_int(ETPParser.Etp_intContext ctx);

	void enterEtp_float(ETPParser.Etp_floatContext ctx);
	void exitEtp_float(ETPParser.Etp_floatContext ctx);

	void enterEtp_binary_item(ETPParser.Etp_binary_itemContext ctx);
	void exitEtp_binary_item(ETPParser.Etp_binary_itemContext ctx);

	void enterEtp_term(ETPParser.Etp_termContext ctx);
	void exitEtp_term(ETPParser.Etp_termContext ctx);

	void enterEtp_pid(ETPParser.Etp_pidContext ctx);
	void exitEtp_pid(ETPParser.Etp_pidContext ctx);

	void enterEtp_binary_fake(ETPParser.Etp_binary_fakeContext ctx);
	void exitEtp_binary_fake(ETPParser.Etp_binary_fakeContext ctx);

	void enterEtp_terms(ETPParser.Etp_termsContext ctx);
	void exitEtp_terms(ETPParser.Etp_termsContext ctx);

	void enterEtp_bool(ETPParser.Etp_boolContext ctx);
	void exitEtp_bool(ETPParser.Etp_boolContext ctx);

	void enterEtp_binary(ETPParser.Etp_binaryContext ctx);
	void exitEtp_binary(ETPParser.Etp_binaryContext ctx);

	void enterEtp_tuple(ETPParser.Etp_tupleContext ctx);
	void exitEtp_tuple(ETPParser.Etp_tupleContext ctx);

	void enterEtp_atom(ETPParser.Etp_atomContext ctx);
	void exitEtp_atom(ETPParser.Etp_atomContext ctx);

	void enterEtp_fun(ETPParser.Etp_funContext ctx);
	void exitEtp_fun(ETPParser.Etp_funContext ctx);
}