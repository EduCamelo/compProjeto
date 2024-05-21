package gen;// Generated from C:/Users/Micro/IdeaProjects/compProjeto/src/exp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class expParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, Proximo=55, NEWLINE=56, ID=57, NUM_INT=58, NUM_DEC=59, 
		TEXTO=60;
	public static final int
		RULE_programa = 0, RULE_declarar = 1, RULE_declararVAR = 2, RULE_type = 3, 
		RULE_declararFunc = 4, RULE_parametros = 5, RULE_parametro = 6, RULE_bloco = 7, 
		RULE_atribuicao = 8, RULE_estruturaControle = 9, RULE_caseLista = 10, 
		RULE_caseDecl = 11, RULE_declararEstruct = 12, RULE_array = 13, RULE_arrayInicializacao = 14, 
		RULE_expressao = 15, RULE_expreLogica = 16, RULE_expreRelacional = 17, 
		RULE_expreAritmetica = 18, RULE_expreMulti = 19, RULE_expreUnaria = 20, 
		RULE_exprePostfix = 21, RULE_argumentos = 22, RULE_primaria = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declarar", "declararVAR", "type", "declararFunc", "parametros", 
			"parametro", "bloco", "atribuicao", "estruturaControle", "caseLista", 
			"caseDecl", "declararEstruct", "array", "arrayInicializacao", "expressao", 
			"expreLogica", "expreRelacional", "expreAritmetica", "expreMulti", "expreUnaria", 
			"exprePostfix", "argumentos", "primaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'int'", "'float'", "'double'", "'char'", "'boolean'", 
			"'vet'", "'('", "')'", "','", "'['", "']'", "'{'", "'}'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'&&='", "'||='", "'if'", "'else'", "'while'", 
			"'for'", "'switch'", "'break'", "'continue'", "'return'", "'case'", "':'", 
			"'default'", "'struct'", "'expressaoLista'", "'&&'", "'||'", "'!'", "'>'", 
			"'>='", "'<'", "'<='", "'!='", "'=='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'++'", "'--'", "'.'", "'->'", "'vazio'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Proximo", "NEWLINE", "ID", 
			"NUM_INT", "NUM_DEC", "TEXTO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "exp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public expParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclararContext> declarar() {
			return getRuleContexts(DeclararContext.class);
		}
		public DeclararContext declarar(int i) {
			return getRuleContext(DeclararContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(expParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(expParser.NEWLINE, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028816321167864L) != 0)) {
				{
				{
				setState(48);
				declarar();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(54);
				match(NEWLINE);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararContext extends ParserRuleContext {
		public DeclararVARContext declararVAR() {
			return getRuleContext(DeclararVARContext.class,0);
		}
		public DeclararFuncContext declararFunc() {
			return getRuleContext(DeclararFuncContext.class,0);
		}
		public DeclararEstructContext declararEstruct() {
			return getRuleContext(DeclararEstructContext.class,0);
		}
		public ArrayInicializacaoContext arrayInicializacao() {
			return getRuleContext(ArrayInicializacaoContext.class,0);
		}
		public EstruturaControleContext estruturaControle() {
			return getRuleContext(EstruturaControleContext.class,0);
		}
		public TerminalNode Proximo() { return getToken(expParser.Proximo, 0); }
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterDeclarar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitDeclarar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarar);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				declararVAR();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				declararFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				declararEstruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				arrayInicializacao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				estruturaControle();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(Proximo);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararVARContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(expParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclararVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararVAR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterDeclararVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitDeclararVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitDeclararVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararVARContext declararVAR() throws RecognitionException {
		DeclararVARContext _localctx = new DeclararVARContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declararVAR);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				type();
				setState(69);
				match(ID);
				setState(70);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				type();
				setState(73);
				match(ID);
				setState(74);
				match(T__1);
				setState(75);
				expressao();
				setState(76);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararFuncContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(expParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclararFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterDeclararFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitDeclararFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitDeclararFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararFuncContext declararFunc() throws RecognitionException {
		DeclararFuncContext _localctx = new DeclararFuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declararFunc);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				type();
				setState(83);
				match(ID);
				setState(84);
				match(T__8);
				setState(85);
				parametros();
				setState(86);
				match(T__9);
				setState(87);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				type();
				setState(90);
				match(ID);
				setState(91);
				match(T__8);
				setState(92);
				match(T__9);
				setState(93);
				bloco();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				parametro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				parametro();
				setState(99);
				match(T__10);
				setState(100);
				parametros();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(expParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				type();
				setState(105);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				type();
				setState(108);
				match(ID);
				setState(109);
				match(T__11);
				setState(110);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(expParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(expParser.NEWLINE, i);
		}
		public List<DeclararContext> declarar() {
			return getRuleContexts(DeclararContext.class);
		}
		public DeclararContext declarar(int i) {
			return getRuleContext(DeclararContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__13);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(115);
				match(NEWLINE);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028816321167864L) != 0)) {
				{
				{
				setState(121);
				declarar();
				setState(122);
				match(NEWLINE);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(expParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(expParser.ID, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atribuicao);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(ID);
				setState(132);
				match(T__1);
				setState(133);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(ID);
				setState(135);
				match(T__15);
				setState(136);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(ID);
				setState(138);
				match(T__16);
				setState(139);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(ID);
				setState(141);
				match(T__17);
				setState(142);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(ID);
				setState(144);
				match(T__18);
				setState(145);
				expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(ID);
				setState(147);
				match(T__19);
				setState(148);
				expressao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				match(ID);
				setState(150);
				match(T__20);
				setState(151);
				expressao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				match(ID);
				setState(153);
				match(T__21);
				setState(154);
				expressao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				match(ID);
				setState(156);
				match(T__1);
				setState(157);
				match(ID);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				match(ID);
				setState(159);
				match(T__15);
				setState(160);
				match(ID);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				match(ID);
				setState(162);
				match(T__16);
				setState(163);
				match(ID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
				match(ID);
				setState(165);
				match(T__17);
				setState(166);
				match(ID);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(167);
				match(ID);
				setState(168);
				match(T__18);
				setState(169);
				match(ID);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(170);
				match(ID);
				setState(171);
				match(T__19);
				setState(172);
				match(ID);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(173);
				match(ID);
				setState(174);
				match(T__20);
				setState(175);
				match(ID);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(176);
				match(ID);
				setState(177);
				match(T__21);
				setState(178);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstruturaControleContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public CaseListaContext caseLista() {
			return getRuleContext(CaseListaContext.class,0);
		}
		public EstruturaControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaControle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterEstruturaControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitEstruturaControle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitEstruturaControle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaControleContext estruturaControle() throws RecognitionException {
		EstruturaControleContext _localctx = new EstruturaControleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_estruturaControle);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__22);
				setState(182);
				match(T__8);
				setState(183);
				expressao();
				setState(184);
				match(T__9);
				setState(185);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__22);
				setState(188);
				match(T__8);
				setState(189);
				expressao();
				setState(190);
				match(T__9);
				setState(191);
				bloco();
				setState(192);
				match(T__23);
				setState(193);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(T__24);
				setState(196);
				match(T__8);
				setState(197);
				expressao();
				setState(198);
				match(T__9);
				setState(199);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(T__25);
				setState(202);
				match(T__8);
				setState(203);
				expressao();
				setState(204);
				match(T__0);
				setState(205);
				expressao();
				setState(206);
				match(T__0);
				setState(207);
				expressao();
				setState(208);
				match(T__9);
				setState(209);
				bloco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				match(T__26);
				setState(212);
				match(T__8);
				setState(213);
				expressao();
				setState(214);
				match(T__9);
				setState(215);
				caseLista();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(T__27);
				setState(218);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				match(T__28);
				setState(220);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				match(T__29);
				setState(222);
				expressao();
				setState(223);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseListaContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(expParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(expParser.NEWLINE, i);
		}
		public List<CaseDeclContext> caseDecl() {
			return getRuleContexts(CaseDeclContext.class);
		}
		public CaseDeclContext caseDecl(int i) {
			return getRuleContext(CaseDeclContext.class,i);
		}
		public CaseListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterCaseLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitCaseLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitCaseLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListaContext caseLista() throws RecognitionException {
		CaseListaContext _localctx = new CaseListaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caseLista);
		int _la;
		try {
			int _alt;
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						match(NEWLINE);
						setState(228);
						caseDecl();
						}
						} 
					}
					setState(233);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__30 || _la==T__32) {
					{
					{
					setState(234);
					caseDecl();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterCaseDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitCaseDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitCaseDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseDeclContext caseDecl() throws RecognitionException {
		CaseDeclContext _localctx = new CaseDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_caseDecl);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__30);
				setState(243);
				expressao();
				setState(244);
				match(T__31);
				setState(245);
				bloco();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(T__32);
				setState(248);
				match(T__31);
				setState(249);
				bloco();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararEstructContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(expParser.ID, 0); }
		public List<DeclararVARContext> declararVAR() {
			return getRuleContexts(DeclararVARContext.class);
		}
		public DeclararVARContext declararVAR(int i) {
			return getRuleContext(DeclararVARContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(expParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(expParser.NEWLINE, i);
		}
		public DeclararEstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararEstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterDeclararEstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitDeclararEstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitDeclararEstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararEstructContext declararEstruct() throws RecognitionException {
		DeclararEstructContext _localctx = new DeclararEstructContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declararEstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__33);
			setState(253);
			match(ID);
			setState(254);
			match(T__13);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594037928440L) != 0)) {
				{
				{
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(255);
					match(NEWLINE);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				declararVAR();
				setState(262);
				match(NEWLINE);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(T__14);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(270);
				match(NEWLINE);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(expParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(ID);
				setState(279);
				match(T__11);
				setState(280);
				expressao();
				setState(281);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(ID);
				setState(284);
				match(T__11);
				setState(285);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInicializacaoContext extends ParserRuleContext {
		public ArrayInicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterArrayInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitArrayInicializacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitArrayInicializacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInicializacaoContext arrayInicializacao() throws RecognitionException {
		ArrayInicializacaoContext _localctx = new ArrayInicializacaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayInicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__13);
			setState(289);
			match(T__34);
			setState(290);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpreLogicaContext expreLogica() {
			return getRuleContext(ExpreLogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				expreLogica(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreLogicaContext extends ParserRuleContext {
		public ExpreRelacionalContext expreRelacional() {
			return getRuleContext(ExpreRelacionalContext.class,0);
		}
		public ExpreLogicaContext expreLogica() {
			return getRuleContext(ExpreLogicaContext.class,0);
		}
		public ExpreLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterExpreLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitExpreLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitExpreLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreLogicaContext expreLogica() throws RecognitionException {
		return expreLogica(0);
	}

	private ExpreLogicaContext expreLogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpreLogicaContext _localctx = new ExpreLogicaContext(_ctx, _parentState);
		ExpreLogicaContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expreLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__45:
			case T__49:
			case T__50:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				{
				setState(297);
				expreRelacional();
				}
				break;
			case T__37:
				{
				setState(298);
				match(T__37);
				setState(299);
				expreRelacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpreLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreLogica);
						setState(302);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(303);
						match(T__35);
						setState(304);
						expreRelacional();
						}
						break;
					case 2:
						{
						_localctx = new ExpreLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreLogica);
						setState(305);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(306);
						match(T__36);
						setState(307);
						expreRelacional();
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreRelacionalContext extends ParserRuleContext {
		public List<ExpreAritmeticaContext> expreAritmetica() {
			return getRuleContexts(ExpreAritmeticaContext.class);
		}
		public ExpreAritmeticaContext expreAritmetica(int i) {
			return getRuleContext(ExpreAritmeticaContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(expParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(expParser.ID, i);
		}
		public ExpreRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterExpreRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitExpreRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitExpreRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreRelacionalContext expreRelacional() throws RecognitionException {
		ExpreRelacionalContext _localctx = new ExpreRelacionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expreRelacional);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				expreAritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				expreAritmetica(0);
				setState(315);
				match(T__38);
				setState(316);
				expreAritmetica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				expreAritmetica(0);
				setState(319);
				match(T__39);
				setState(320);
				expreAritmetica(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				expreAritmetica(0);
				setState(323);
				match(T__40);
				setState(324);
				expreAritmetica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				expreAritmetica(0);
				setState(327);
				match(T__41);
				setState(328);
				expreAritmetica(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(330);
				expreAritmetica(0);
				setState(331);
				match(T__42);
				setState(332);
				expreAritmetica(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(334);
				expreAritmetica(0);
				setState(335);
				match(T__43);
				setState(336);
				expreAritmetica(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(338);
				match(ID);
				setState(339);
				match(T__39);
				setState(340);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreAritmeticaContext extends ParserRuleContext {
		public ExpreMultiContext expreMulti() {
			return getRuleContext(ExpreMultiContext.class,0);
		}
		public ExpreAritmeticaContext expreAritmetica() {
			return getRuleContext(ExpreAritmeticaContext.class,0);
		}
		public ExpreAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterExpreAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitExpreAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitExpreAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreAritmeticaContext expreAritmetica() throws RecognitionException {
		return expreAritmetica(0);
	}

	private ExpreAritmeticaContext expreAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpreAritmeticaContext _localctx = new ExpreAritmeticaContext(_ctx, _parentState);
		ExpreAritmeticaContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expreAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(344);
			expreMulti(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(352);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpreAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreAritmetica);
						setState(346);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(347);
						match(T__44);
						setState(348);
						expreMulti(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpreAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreAritmetica);
						setState(349);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(350);
						match(T__45);
						setState(351);
						expreMulti(0);
						}
						break;
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreMultiContext extends ParserRuleContext {
		public ExpreUnariaContext expreUnaria() {
			return getRuleContext(ExpreUnariaContext.class,0);
		}
		public ExpreMultiContext expreMulti() {
			return getRuleContext(ExpreMultiContext.class,0);
		}
		public ExpreMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreMulti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterExpreMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitExpreMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitExpreMulti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreMultiContext expreMulti() throws RecognitionException {
		return expreMulti(0);
	}

	private ExpreMultiContext expreMulti(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpreMultiContext _localctx = new ExpreMultiContext(_ctx, _parentState);
		ExpreMultiContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expreMulti, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(358);
			expreUnaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpreMultiContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreMulti);
						setState(360);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(361);
						match(T__46);
						setState(362);
						expreUnaria();
						}
						break;
					case 2:
						{
						_localctx = new ExpreMultiContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreMulti);
						setState(363);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(364);
						match(T__47);
						setState(365);
						expreUnaria();
						}
						break;
					case 3:
						{
						_localctx = new ExpreMultiContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreMulti);
						setState(366);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(367);
						match(T__48);
						setState(368);
						expreUnaria();
						}
						break;
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreUnariaContext extends ParserRuleContext {
		public ExprePostfixContext exprePostfix() {
			return getRuleContext(ExprePostfixContext.class,0);
		}
		public ExpreUnariaContext expreUnaria() {
			return getRuleContext(ExpreUnariaContext.class,0);
		}
		public ExpreUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterExpreUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitExpreUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitExpreUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreUnariaContext expreUnaria() throws RecognitionException {
		ExpreUnariaContext _localctx = new ExpreUnariaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expreUnaria);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				exprePostfix();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(T__45);
				setState(376);
				expreUnaria();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(T__49);
				setState(378);
				exprePostfix();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				match(T__50);
				setState(380);
				exprePostfix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprePostfixContext extends ParserRuleContext {
		public PrimariaContext primaria() {
			return getRuleContext(PrimariaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode ID() { return getToken(expParser.ID, 0); }
		public ExprePostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprePostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterExprePostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitExprePostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitExprePostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprePostfixContext exprePostfix() throws RecognitionException {
		ExprePostfixContext _localctx = new ExprePostfixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprePostfix);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				primaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				primaria();
				setState(385);
				match(T__11);
				setState(386);
				expressao();
				setState(387);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				primaria();
				setState(390);
				match(T__8);
				setState(391);
				argumentos();
				setState(392);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				primaria();
				setState(395);
				match(T__51);
				setState(396);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				primaria();
				setState(399);
				match(T__52);
				setState(400);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__53) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimariaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(expParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(expParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(expParser.NUM_DEC, 0); }
		public TerminalNode TEXTO() { return getToken(expParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimariaContext primaria() throws RecognitionException {
		PrimariaContext _localctx = new PrimariaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primaria);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				match(NUM_DEC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				match(TEXTO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(411);
				match(T__8);
				setState(412);
				expressao();
				setState(413);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expreLogica_sempred((ExpreLogicaContext)_localctx, predIndex);
		case 18:
			return expreAritmetica_sempred((ExpreAritmeticaContext)_localctx, predIndex);
		case 19:
			return expreMulti_sempred((ExpreMultiContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expreLogica_sempred(ExpreLogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expreAritmetica_sempred(ExpreAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expreMulti_sempred(ExpreMultiContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u01a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0005\u00008\b\u0000\n"+
		"\u0000\f\u0000;\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004`\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006q\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007u\b\u0007\n\u0007"+
		"\f\u0007x\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007}\b\u0007"+
		"\n\u0007\f\u0007\u0080\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00b4\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00e2\b\t\u0001\n\u0001\n\u0005\n\u00e6\b\n"+
		"\n\n\f\n\u00e9\t\n\u0001\n\u0005\n\u00ec\b\n\n\n\f\n\u00ef\t\n\u0003\n"+
		"\u00f1\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fb\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0101\b\f\n\f\f\f\u0104\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0109\b\f\n\f\f\f\u010c\t\f\u0001\f\u0001\f\u0005\f"+
		"\u0110\b\f\n\f\f\f\u0113\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u011f\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u0127"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u012d"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0135\b\u0010\n\u0010\f\u0010\u0138\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0156\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0161\b\u0012\n\u0012\f\u0012\u0164"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0172\b\u0013\n\u0013\f\u0013\u0175\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u017e\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0193\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01a0\b\u0017"+
		"\u0001\u0017\u0000\u0003 $&\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0002"+
		"\u0001\u0000\u0003\b\u0002\u0000##66\u01d0\u00003\u0001\u0000\u0000\u0000"+
		"\u0002B\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006P"+
		"\u0001\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000"+
		"\u0000\fp\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010"+
		"\u00b3\u0001\u0000\u0000\u0000\u0012\u00e1\u0001\u0000\u0000\u0000\u0014"+
		"\u00f0\u0001\u0000\u0000\u0000\u0016\u00fa\u0001\u0000\u0000\u0000\u0018"+
		"\u00fc\u0001\u0000\u0000\u0000\u001a\u011e\u0001\u0000\u0000\u0000\u001c"+
		"\u0120\u0001\u0000\u0000\u0000\u001e\u0126\u0001\u0000\u0000\u0000 \u012c"+
		"\u0001\u0000\u0000\u0000\"\u0155\u0001\u0000\u0000\u0000$\u0157\u0001"+
		"\u0000\u0000\u0000&\u0165\u0001\u0000\u0000\u0000(\u017d\u0001\u0000\u0000"+
		"\u0000*\u0192\u0001\u0000\u0000\u0000,\u0194\u0001\u0000\u0000\u0000."+
		"\u019f\u0001\u0000\u0000\u000002\u0003\u0002\u0001\u000010\u0001\u0000"+
		"\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000049\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"68\u00058\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0001\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<C\u0003\u0004\u0002\u0000=C\u0003"+
		"\b\u0004\u0000>C\u0003\u0018\f\u0000?C\u0003\u001c\u000e\u0000@C\u0003"+
		"\u0012\t\u0000AC\u00057\u0000\u0000B<\u0001\u0000\u0000\u0000B=\u0001"+
		"\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003\u0001\u0000"+
		"\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u00059\u0000\u0000FG\u0005\u0001"+
		"\u0000\u0000GO\u0001\u0000\u0000\u0000HI\u0003\u0006\u0003\u0000IJ\u0005"+
		"9\u0000\u0000JK\u0005\u0002\u0000\u0000KL\u0003\u001e\u000f\u0000LM\u0005"+
		"\u0001\u0000\u0000MO\u0001\u0000\u0000\u0000ND\u0001\u0000\u0000\u0000"+
		"NH\u0001\u0000\u0000\u0000O\u0005\u0001\u0000\u0000\u0000PQ\u0007\u0000"+
		"\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0003\u0006\u0003\u0000"+
		"ST\u00059\u0000\u0000TU\u0005\t\u0000\u0000UV\u0003\n\u0005\u0000VW\u0005"+
		"\n\u0000\u0000WX\u0003\u000e\u0007\u0000X`\u0001\u0000\u0000\u0000YZ\u0003"+
		"\u0006\u0003\u0000Z[\u00059\u0000\u0000[\\\u0005\t\u0000\u0000\\]\u0005"+
		"\n\u0000\u0000]^\u0003\u000e\u0007\u0000^`\u0001\u0000\u0000\u0000_R\u0001"+
		"\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000`\t\u0001\u0000\u0000\u0000"+
		"ag\u0003\f\u0006\u0000bc\u0003\f\u0006\u0000cd\u0005\u000b\u0000\u0000"+
		"de\u0003\n\u0005\u0000eg\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000\u0000"+
		"fb\u0001\u0000\u0000\u0000g\u000b\u0001\u0000\u0000\u0000hi\u0003\u0006"+
		"\u0003\u0000ij\u00059\u0000\u0000jq\u0001\u0000\u0000\u0000kl\u0003\u0006"+
		"\u0003\u0000lm\u00059\u0000\u0000mn\u0005\f\u0000\u0000no\u0005\r\u0000"+
		"\u0000oq\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000\u0000pk\u0001\u0000"+
		"\u0000\u0000q\r\u0001\u0000\u0000\u0000rv\u0005\u000e\u0000\u0000su\u0005"+
		"8\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w~\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000yz\u0003\u0002\u0001\u0000z{\u00058\u0000\u0000"+
		"{}\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005\u000f\u0000\u0000\u0082\u000f\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u00059\u0000\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085\u00b4"+
		"\u0003\u001e\u000f\u0000\u0086\u0087\u00059\u0000\u0000\u0087\u0088\u0005"+
		"\u0010\u0000\u0000\u0088\u00b4\u0003\u001e\u000f\u0000\u0089\u008a\u0005"+
		"9\u0000\u0000\u008a\u008b\u0005\u0011\u0000\u0000\u008b\u00b4\u0003\u001e"+
		"\u000f\u0000\u008c\u008d\u00059\u0000\u0000\u008d\u008e\u0005\u0012\u0000"+
		"\u0000\u008e\u00b4\u0003\u001e\u000f\u0000\u008f\u0090\u00059\u0000\u0000"+
		"\u0090\u0091\u0005\u0013\u0000\u0000\u0091\u00b4\u0003\u001e\u000f\u0000"+
		"\u0092\u0093\u00059\u0000\u0000\u0093\u0094\u0005\u0014\u0000\u0000\u0094"+
		"\u00b4\u0003\u001e\u000f\u0000\u0095\u0096\u00059\u0000\u0000\u0096\u0097"+
		"\u0005\u0015\u0000\u0000\u0097\u00b4\u0003\u001e\u000f\u0000\u0098\u0099"+
		"\u00059\u0000\u0000\u0099\u009a\u0005\u0016\u0000\u0000\u009a\u00b4\u0003"+
		"\u001e\u000f\u0000\u009b\u009c\u00059\u0000\u0000\u009c\u009d\u0005\u0002"+
		"\u0000\u0000\u009d\u00b4\u00059\u0000\u0000\u009e\u009f\u00059\u0000\u0000"+
		"\u009f\u00a0\u0005\u0010\u0000\u0000\u00a0\u00b4\u00059\u0000\u0000\u00a1"+
		"\u00a2\u00059\u0000\u0000\u00a2\u00a3\u0005\u0011\u0000\u0000\u00a3\u00b4"+
		"\u00059\u0000\u0000\u00a4\u00a5\u00059\u0000\u0000\u00a5\u00a6\u0005\u0012"+
		"\u0000\u0000\u00a6\u00b4\u00059\u0000\u0000\u00a7\u00a8\u00059\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0013\u0000\u0000\u00a9\u00b4\u00059\u0000\u0000\u00aa"+
		"\u00ab\u00059\u0000\u0000\u00ab\u00ac\u0005\u0014\u0000\u0000\u00ac\u00b4"+
		"\u00059\u0000\u0000\u00ad\u00ae\u00059\u0000\u0000\u00ae\u00af\u0005\u0015"+
		"\u0000\u0000\u00af\u00b4\u00059\u0000\u0000\u00b0\u00b1\u00059\u0000\u0000"+
		"\u00b1\u00b2\u0005\u0016\u0000\u0000\u00b2\u00b4\u00059\u0000\u0000\u00b3"+
		"\u0083\u0001\u0000\u0000\u0000\u00b3\u0086\u0001\u0000\u0000\u0000\u00b3"+
		"\u0089\u0001\u0000\u0000\u0000\u00b3\u008c\u0001\u0000\u0000\u0000\u00b3"+
		"\u008f\u0001\u0000\u0000\u0000\u00b3\u0092\u0001\u0000\u0000\u0000\u00b3"+
		"\u0095\u0001\u0000\u0000\u0000\u00b3\u0098\u0001\u0000\u0000\u0000\u00b3"+
		"\u009b\u0001\u0000\u0000\u0000\u00b3\u009e\u0001\u0000\u0000\u0000\u00b3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00b3\u00a4\u0001\u0000\u0000\u0000\u00b3"+
		"\u00a7\u0001\u0000\u0000\u0000\u00b3\u00aa\u0001\u0000\u0000\u0000\u00b3"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b4"+
		"\u0011\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0017\u0000\u0000\u00b6"+
		"\u00b7\u0005\t\u0000\u0000\u00b7\u00b8\u0003\u001e\u000f\u0000\u00b8\u00b9"+
		"\u0005\n\u0000\u0000\u00b9\u00ba\u0003\u000e\u0007\u0000\u00ba\u00e2\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\u0017\u0000\u0000\u00bc\u00bd\u0005"+
		"\t\u0000\u0000\u00bd\u00be\u0003\u001e\u000f\u0000\u00be\u00bf\u0005\n"+
		"\u0000\u0000\u00bf\u00c0\u0003\u000e\u0007\u0000\u00c0\u00c1\u0005\u0018"+
		"\u0000\u0000\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\u00e2\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0019\u0000\u0000\u00c4\u00c5\u0005\t\u0000"+
		"\u0000\u00c5\u00c6\u0003\u001e\u000f\u0000\u00c6\u00c7\u0005\n\u0000\u0000"+
		"\u00c7\u00c8\u0003\u000e\u0007\u0000\u00c8\u00e2\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\u001a\u0000\u0000\u00ca\u00cb\u0005\t\u0000\u0000\u00cb"+
		"\u00cc\u0003\u001e\u000f\u0000\u00cc\u00cd\u0005\u0001\u0000\u0000\u00cd"+
		"\u00ce\u0003\u001e\u000f\u0000\u00ce\u00cf\u0005\u0001\u0000\u0000\u00cf"+
		"\u00d0\u0003\u001e\u000f\u0000\u00d0\u00d1\u0005\n\u0000\u0000\u00d1\u00d2"+
		"\u0003\u000e\u0007\u0000\u00d2\u00e2\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\u001b\u0000\u0000\u00d4\u00d5\u0005\t\u0000\u0000\u00d5\u00d6\u0003"+
		"\u001e\u000f\u0000\u00d6\u00d7\u0005\n\u0000\u0000\u00d7\u00d8\u0003\u0014"+
		"\n\u0000\u00d8\u00e2\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u001c\u0000"+
		"\u0000\u00da\u00e2\u0005\u0001\u0000\u0000\u00db\u00dc\u0005\u001d\u0000"+
		"\u0000\u00dc\u00e2\u0005\u0001\u0000\u0000\u00dd\u00de\u0005\u001e\u0000"+
		"\u0000\u00de\u00df\u0003\u001e\u000f\u0000\u00df\u00e0\u0005\u0001\u0000"+
		"\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00b5\u0001\u0000\u0000"+
		"\u0000\u00e1\u00bb\u0001\u0000\u0000\u0000\u00e1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00e1\u00c9\u0001\u0000\u0000\u0000\u00e1\u00d3\u0001\u0000\u0000"+
		"\u0000\u00e1\u00d9\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000"+
		"\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e2\u0013\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u00058\u0000\u0000\u00e4\u00e6\u0003\u0016\u000b\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00f1\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0003\u0016\u000b\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f1\u0015\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0005\u001f\u0000\u0000\u00f3\u00f4\u0003\u001e\u000f\u0000"+
		"\u00f4\u00f5\u0005 \u0000\u0000\u00f5\u00f6\u0003\u000e\u0007\u0000\u00f6"+
		"\u00fb\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005!\u0000\u0000\u00f8\u00f9"+
		"\u0005 \u0000\u0000\u00f9\u00fb\u0003\u000e\u0007\u0000\u00fa\u00f2\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fb\u0017\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005\"\u0000\u0000\u00fd\u00fe\u00059"+
		"\u0000\u0000\u00fe\u010a\u0005\u000e\u0000\u0000\u00ff\u0101\u00058\u0000"+
		"\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0003\u0004\u0002\u0000\u0106\u0107\u00058\u0000\u0000"+
		"\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0102\u0001\u0000\u0000\u0000"+
		"\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0111\u0005\u000f\u0000\u0000"+
		"\u010e\u0110\u00058\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0001\u0000\u0000\u0115"+
		"\u0019\u0001\u0000\u0000\u0000\u0116\u0117\u00059\u0000\u0000\u0117\u0118"+
		"\u0005\f\u0000\u0000\u0118\u0119\u0003\u001e\u000f\u0000\u0119\u011a\u0005"+
		"\r\u0000\u0000\u011a\u011f\u0001\u0000\u0000\u0000\u011b\u011c\u00059"+
		"\u0000\u0000\u011c\u011d\u0005\f\u0000\u0000\u011d\u011f\u0005\r\u0000"+
		"\u0000\u011e\u0116\u0001\u0000\u0000\u0000\u011e\u011b\u0001\u0000\u0000"+
		"\u0000\u011f\u001b\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u000e\u0000"+
		"\u0000\u0121\u0122\u0005#\u0000\u0000\u0122\u0123\u0005\u000f\u0000\u0000"+
		"\u0123\u001d\u0001\u0000\u0000\u0000\u0124\u0127\u0003\u0010\b\u0000\u0125"+
		"\u0127\u0003 \u0010\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u001f\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0006\u0010\uffff\uffff\u0000\u0129\u012d\u0003\"\u0011\u0000\u012a\u012b"+
		"\u0005&\u0000\u0000\u012b\u012d\u0003\"\u0011\u0000\u012c\u0128\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0136\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\n\u0003\u0000\u0000\u012f\u0130\u0005$"+
		"\u0000\u0000\u0130\u0135\u0003\"\u0011\u0000\u0131\u0132\n\u0002\u0000"+
		"\u0000\u0132\u0133\u0005%\u0000\u0000\u0133\u0135\u0003\"\u0011\u0000"+
		"\u0134\u012e\u0001\u0000\u0000\u0000\u0134\u0131\u0001\u0000\u0000\u0000"+
		"\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137!\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0139\u0156\u0003$\u0012\u0000\u013a\u013b"+
		"\u0003$\u0012\u0000\u013b\u013c\u0005\'\u0000\u0000\u013c\u013d\u0003"+
		"$\u0012\u0000\u013d\u0156\u0001\u0000\u0000\u0000\u013e\u013f\u0003$\u0012"+
		"\u0000\u013f\u0140\u0005(\u0000\u0000\u0140\u0141\u0003$\u0012\u0000\u0141"+
		"\u0156\u0001\u0000\u0000\u0000\u0142\u0143\u0003$\u0012\u0000\u0143\u0144"+
		"\u0005)\u0000\u0000\u0144\u0145\u0003$\u0012\u0000\u0145\u0156\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0003$\u0012\u0000\u0147\u0148\u0005*\u0000\u0000"+
		"\u0148\u0149\u0003$\u0012\u0000\u0149\u0156\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0003$\u0012\u0000\u014b\u014c\u0005+\u0000\u0000\u014c\u014d\u0003"+
		"$\u0012\u0000\u014d\u0156\u0001\u0000\u0000\u0000\u014e\u014f\u0003$\u0012"+
		"\u0000\u014f\u0150\u0005,\u0000\u0000\u0150\u0151\u0003$\u0012\u0000\u0151"+
		"\u0156\u0001\u0000\u0000\u0000\u0152\u0153\u00059\u0000\u0000\u0153\u0154"+
		"\u0005(\u0000\u0000\u0154\u0156\u00059\u0000\u0000\u0155\u0139\u0001\u0000"+
		"\u0000\u0000\u0155\u013a\u0001\u0000\u0000\u0000\u0155\u013e\u0001\u0000"+
		"\u0000\u0000\u0155\u0142\u0001\u0000\u0000\u0000\u0155\u0146\u0001\u0000"+
		"\u0000\u0000\u0155\u014a\u0001\u0000\u0000\u0000\u0155\u014e\u0001\u0000"+
		"\u0000\u0000\u0155\u0152\u0001\u0000\u0000\u0000\u0156#\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0006\u0012\uffff\uffff\u0000\u0158\u0159\u0003&\u0013"+
		"\u0000\u0159\u0162\u0001\u0000\u0000\u0000\u015a\u015b\n\u0002\u0000\u0000"+
		"\u015b\u015c\u0005-\u0000\u0000\u015c\u0161\u0003&\u0013\u0000\u015d\u015e"+
		"\n\u0001\u0000\u0000\u015e\u015f\u0005.\u0000\u0000\u015f\u0161\u0003"+
		"&\u0013\u0000\u0160\u015a\u0001\u0000\u0000\u0000\u0160\u015d\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163%\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0006\u0013\uffff"+
		"\uffff\u0000\u0166\u0167\u0003(\u0014\u0000\u0167\u0173\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\n\u0003\u0000\u0000\u0169\u016a\u0005/\u0000\u0000"+
		"\u016a\u0172\u0003(\u0014\u0000\u016b\u016c\n\u0002\u0000\u0000\u016c"+
		"\u016d\u00050\u0000\u0000\u016d\u0172\u0003(\u0014\u0000\u016e\u016f\n"+
		"\u0001\u0000\u0000\u016f\u0170\u00051\u0000\u0000\u0170\u0172\u0003(\u0014"+
		"\u0000\u0171\u0168\u0001\u0000\u0000\u0000\u0171\u016b\u0001\u0000\u0000"+
		"\u0000\u0171\u016e\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000"+
		"\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\'\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0176\u017e\u0003*\u0015\u0000\u0177\u0178\u0005.\u0000\u0000\u0178\u017e"+
		"\u0003(\u0014\u0000\u0179\u017a\u00052\u0000\u0000\u017a\u017e\u0003*"+
		"\u0015\u0000\u017b\u017c\u00053\u0000\u0000\u017c\u017e\u0003*\u0015\u0000"+
		"\u017d\u0176\u0001\u0000\u0000\u0000\u017d\u0177\u0001\u0000\u0000\u0000"+
		"\u017d\u0179\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017e)\u0001\u0000\u0000\u0000\u017f\u0193\u0003.\u0017\u0000\u0180\u0181"+
		"\u0003.\u0017\u0000\u0181\u0182\u0005\f\u0000\u0000\u0182\u0183\u0003"+
		"\u001e\u000f\u0000\u0183\u0184\u0005\r\u0000\u0000\u0184\u0193\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0003.\u0017\u0000\u0186\u0187\u0005\t\u0000"+
		"\u0000\u0187\u0188\u0003,\u0016\u0000\u0188\u0189\u0005\n\u0000\u0000"+
		"\u0189\u0193\u0001\u0000\u0000\u0000\u018a\u018b\u0003.\u0017\u0000\u018b"+
		"\u018c\u00054\u0000\u0000\u018c\u018d\u00059\u0000\u0000\u018d\u0193\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0003.\u0017\u0000\u018f\u0190\u00055\u0000"+
		"\u0000\u0190\u0191\u00059\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000"+
		"\u0192\u017f\u0001\u0000\u0000\u0000\u0192\u0180\u0001\u0000\u0000\u0000"+
		"\u0192\u0185\u0001\u0000\u0000\u0000\u0192\u018a\u0001\u0000\u0000\u0000"+
		"\u0192\u018e\u0001\u0000\u0000\u0000\u0193+\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0007\u0001\u0000\u0000\u0195-\u0001\u0000\u0000\u0000\u0196\u01a0"+
		"\u00059\u0000\u0000\u0197\u01a0\u0003\u001a\r\u0000\u0198\u01a0\u0005"+
		":\u0000\u0000\u0199\u01a0\u0005;\u0000\u0000\u019a\u01a0\u0005<\u0000"+
		"\u0000\u019b\u019c\u0005\t\u0000\u0000\u019c\u019d\u0003\u001e\u000f\u0000"+
		"\u019d\u019e\u0005\n\u0000\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f"+
		"\u0196\u0001\u0000\u0000\u0000\u019f\u0197\u0001\u0000\u0000\u0000\u019f"+
		"\u0198\u0001\u0000\u0000\u0000\u019f\u0199\u0001\u0000\u0000\u0000\u019f"+
		"\u019a\u0001\u0000\u0000\u0000\u019f\u019b\u0001\u0000\u0000\u0000\u01a0"+
		"/\u0001\u0000\u0000\u0000\u001f39BN_fpv~\u00b3\u00e1\u00e7\u00ed\u00f0"+
		"\u00fa\u0102\u010a\u0111\u011e\u0126\u012c\u0134\u0136\u0155\u0160\u0162"+
		"\u0171\u0173\u017d\u0192\u019f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}