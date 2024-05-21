package gen;// Generated from C:/Users/Micro/IdeaProjects/compProjeto/src/exp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link expParser}.
 */
public interface expListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link expParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(expParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(expParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(expParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(expParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#declararVAR}.
	 * @param ctx the parse tree
	 */
	void enterDeclararVAR(expParser.DeclararVARContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#declararVAR}.
	 * @param ctx the parse tree
	 */
	void exitDeclararVAR(expParser.DeclararVARContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(expParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(expParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#declararFunc}.
	 * @param ctx the parse tree
	 */
	void enterDeclararFunc(expParser.DeclararFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#declararFunc}.
	 * @param ctx the parse tree
	 */
	void exitDeclararFunc(expParser.DeclararFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(expParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(expParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(expParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(expParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(expParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(expParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(expParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(expParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaControle(expParser.EstruturaControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaControle(expParser.EstruturaControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void enterCaseLista(expParser.CaseListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void exitCaseLista(expParser.CaseListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void enterCaseDecl(expParser.CaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void exitCaseDecl(expParser.CaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#declararEstruct}.
	 * @param ctx the parse tree
	 */
	void enterDeclararEstruct(expParser.DeclararEstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#declararEstruct}.
	 * @param ctx the parse tree
	 */
	void exitDeclararEstruct(expParser.DeclararEstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(expParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(expParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void enterArrayInicializacao(expParser.ArrayInicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void exitArrayInicializacao(expParser.ArrayInicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(expParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(expParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#expreLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpreLogica(expParser.ExpreLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#expreLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpreLogica(expParser.ExpreLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#expreRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpreRelacional(expParser.ExpreRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#expreRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpreRelacional(expParser.ExpreRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#expreAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpreAritmetica(expParser.ExpreAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#expreAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpreAritmetica(expParser.ExpreAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#expreMulti}.
	 * @param ctx the parse tree
	 */
	void enterExpreMulti(expParser.ExpreMultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#expreMulti}.
	 * @param ctx the parse tree
	 */
	void exitExpreMulti(expParser.ExpreMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#expreUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpreUnaria(expParser.ExpreUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#expreUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpreUnaria(expParser.ExpreUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#exprePostfix}.
	 * @param ctx the parse tree
	 */
	void enterExprePostfix(expParser.ExprePostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#exprePostfix}.
	 * @param ctx the parse tree
	 */
	void exitExprePostfix(expParser.ExprePostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(expParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(expParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link expParser#primaria}.
	 * @param ctx the parse tree
	 */
	void enterPrimaria(expParser.PrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link expParser#primaria}.
	 * @param ctx the parse tree
	 */
	void exitPrimaria(expParser.PrimariaContext ctx);
}