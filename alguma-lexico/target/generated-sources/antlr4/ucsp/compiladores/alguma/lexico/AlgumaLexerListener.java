// Generated from ucsp\compiladores\alguma\lexico\AlgumaLexer.g4 by ANTLR 4.9.1
package ucsp.compiladores.alguma.lexico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaLexerParser}.
 */
public interface AlgumaLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaLexerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaLexerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(AlgumaLexerParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(AlgumaLexerParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#nl}.
	 * @param ctx the parse tree
	 */
	void enterNl(AlgumaLexerParser.NlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#nl}.
	 * @param ctx the parse tree
	 */
	void exitNl(AlgumaLexerParser.NlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(AlgumaLexerParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(AlgumaLexerParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(AlgumaLexerParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(AlgumaLexerParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(AlgumaLexerParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(AlgumaLexerParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(AlgumaLexerParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(AlgumaLexerParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(AlgumaLexerParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(AlgumaLexerParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(AlgumaLexerParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(AlgumaLexerParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AlgumaLexerParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AlgumaLexerParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#tipobase}.
	 * @param ctx the parse tree
	 */
	void enterTipobase(AlgumaLexerParser.TipobaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#tipobase}.
	 * @param ctx the parse tree
	 */
	void exitTipobase(AlgumaLexerParser.TipobaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#declvar}.
	 * @param ctx the parse tree
	 */
	void enterDeclvar(AlgumaLexerParser.DeclvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#declvar}.
	 * @param ctx the parse tree
	 */
	void exitDeclvar(AlgumaLexerParser.DeclvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AlgumaLexerParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AlgumaLexerParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void enterCmdif(AlgumaLexerParser.CmdifContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void exitCmdif(AlgumaLexerParser.CmdifContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdwhile(AlgumaLexerParser.CmdwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdwhile(AlgumaLexerParser.CmdwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdasign}.
	 * @param ctx the parse tree
	 */
	void enterCmdasign(AlgumaLexerParser.CmdasignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdasign}.
	 * @param ctx the parse tree
	 */
	void exitCmdasign(AlgumaLexerParser.CmdasignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(AlgumaLexerParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(AlgumaLexerParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void enterListaexp(AlgumaLexerParser.ListaexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void exitListaexp(AlgumaLexerParser.ListaexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#cmdreturn}.
	 * @param ctx the parse tree
	 */
	void enterCmdreturn(AlgumaLexerParser.CmdreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#cmdreturn}.
	 * @param ctx the parse tree
	 */
	void exitCmdreturn(AlgumaLexerParser.CmdreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(AlgumaLexerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(AlgumaLexerParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(AlgumaLexerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(AlgumaLexerParser.ExpContext ctx);
}