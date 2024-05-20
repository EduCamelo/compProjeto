package gen;// Generated from C:/Users/Micro/IdeaProjects/compProjeto/src/exp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link expParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface expVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link expParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(expParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(expParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#declararVAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararVAR(expParser.DeclararVARContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(expParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#declararFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararFunc(expParser.DeclararFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(expParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(expParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(expParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#coment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComent(expParser.ComentContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(expParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#estruturaControle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaControle(expParser.EstruturaControleContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#caseLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseLista(expParser.CaseListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#caseDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseDecl(expParser.CaseDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#declararEstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararEstruct(expParser.DeclararEstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(expParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInicializacao(expParser.ArrayInicializacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(expParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#expreLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreLogica(expParser.ExpreLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#expreRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreRelacional(expParser.ExpreRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#expreAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreAritmetica(expParser.ExpreAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#expreMulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreMulti(expParser.ExpreMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#expreUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreUnaria(expParser.ExpreUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#exprePostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprePostfix(expParser.ExprePostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(expParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link expParser#primaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaria(expParser.PrimariaContext ctx);
}