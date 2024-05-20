package gen;// Generated from C:/Users/Micro/IdeaProjects/compProjeto/src/exp.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, NEWLINE=58, ID=59, NUM_INT=60, 
		NUM_DEC=61, TEXTO=62;
	public static final int
		RULE_programa = 0, RULE_declarar = 1, RULE_declararVAR = 2, RULE_type = 3, 
		RULE_declararFunc = 4, RULE_parametros = 5, RULE_parametro = 6, RULE_bloco = 7, 
		RULE_coment = 8, RULE_atribuicao = 9, RULE_estruturaControle = 10, RULE_caseLista = 11, 
		RULE_caseDecl = 12, RULE_declararEstruct = 13, RULE_array = 14, RULE_arrayInicializacao = 15, 
		RULE_expressao = 16, RULE_expreLogica = 17, RULE_expreRelacional = 18, 
		RULE_expreAritmetica = 19, RULE_expreMulti = 20, RULE_expreUnaria = 21, 
		RULE_exprePostfix = 22, RULE_argumentos = 23, RULE_primaria = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declarar", "declararVAR", "type", "declararFunc", "parametros", 
			"parametro", "bloco", "coment", "atribuicao", "estruturaControle", "caseLista", 
			"caseDecl", "declararEstruct", "array", "arrayInicializacao", "expressao", 
			"expreLogica", "expreRelacional", "expreAritmetica", "expreMulti", "expreUnaria", 
			"exprePostfix", "argumentos", "primaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'int'", "'float'", "'double'", "'char'", "'boolean'", 
			"'vet'", "'('", "')'", "','", "'['", "']'", "'{'", "'}'", "'//'", "'/*'", 
			"'*/'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", "'||='", "'if'", 
			"'else'", "'while'", "'for'", "'switch'", "'break'", "'continue'", "'return'", 
			"'case'", "':'", "'default'", "'struct'", "'expressaoLista'", "'&&'", 
			"'||'", "'!'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'++'", "'--'", "'.'", "'->'", "'vazio'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"ID", "NUM_INT", "NUM_DEC", "TEXTO"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460906721133048L) != 0)) {
				{
				{
				setState(50);
				declarar();
				setState(51);
				match(NEWLINE);
				}
				}
				setState(57);
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
		public ComentContext coment() {
			return getRuleContext(ComentContext.class,0);
		}
		public ArrayInicializacaoContext arrayInicializacao() {
			return getRuleContext(ArrayInicializacaoContext.class,0);
		}
		public EstruturaControleContext estruturaControle() {
			return getRuleContext(EstruturaControleContext.class,0);
		}
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				declararVAR();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				declararFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				declararEstruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				coment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				arrayInicializacao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				estruturaControle();
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
		public TerminalNode ID() { return getToken(expParser.ID, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
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
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) {
					{
					{
					setState(66);
					type();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(ID);
				setState(73);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				type();
				setState(75);
				match(ID);
				setState(76);
				match(T__1);
				setState(77);
				expressao();
				setState(78);
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
			setState(82);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				type();
				setState(85);
				match(ID);
				setState(86);
				match(T__8);
				setState(87);
				parametros();
				setState(88);
				match(T__9);
				setState(89);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				type();
				setState(92);
				match(ID);
				setState(93);
				match(T__8);
				setState(94);
				match(T__9);
				setState(95);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				parametro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				parametro();
				setState(101);
				match(T__10);
				setState(102);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				type();
				setState(107);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				type();
				setState(110);
				match(ID);
				setState(111);
				match(T__11);
				setState(112);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				type();
				setState(115);
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
			setState(119);
			match(T__13);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(120);
				match(NEWLINE);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460906721133048L) != 0)) {
				{
				{
				setState(126);
				declarar();
				setState(127);
				match(NEWLINE);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
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
	public static class ComentContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(expParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(expParser.NEWLINE, i);
		}
		public ComentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).enterComent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expListener ) ((expListener)listener).exitComent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expVisitor ) return ((expVisitor<? extends T>)visitor).visitComent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentContext coment() throws RecognitionException {
		ComentContext _localctx = new ComentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coment);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__15);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8935141660703064062L) != 0)) {
					{
					{
					setState(137);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__16);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9223372036854513662L) != 0)) {
					{
					{
					setState(144);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__17) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(T__17);
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
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(ID);
				setState(154);
				match(T__1);
				setState(155);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(ID);
				setState(157);
				match(T__18);
				setState(158);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(ID);
				setState(160);
				match(T__19);
				setState(161);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(ID);
				setState(163);
				match(T__20);
				setState(164);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(ID);
				setState(166);
				match(T__21);
				setState(167);
				expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				match(ID);
				setState(169);
				match(T__22);
				setState(170);
				expressao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(ID);
				setState(172);
				match(T__23);
				setState(173);
				expressao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				match(ID);
				setState(175);
				match(T__24);
				setState(176);
				expressao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
				match(ID);
				setState(178);
				match(T__1);
				setState(179);
				match(ID);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
				match(ID);
				setState(181);
				match(T__18);
				setState(182);
				match(ID);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(183);
				match(ID);
				setState(184);
				match(T__19);
				setState(185);
				match(ID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(186);
				match(ID);
				setState(187);
				match(T__20);
				setState(188);
				match(ID);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(189);
				match(ID);
				setState(190);
				match(T__21);
				setState(191);
				match(ID);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(192);
				match(ID);
				setState(193);
				match(T__22);
				setState(194);
				match(ID);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(195);
				match(ID);
				setState(196);
				match(T__23);
				setState(197);
				match(ID);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(198);
				match(ID);
				setState(199);
				match(T__24);
				setState(200);
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
		enterRule(_localctx, 20, RULE_estruturaControle);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__25);
				setState(204);
				match(T__8);
				setState(205);
				expressao();
				setState(206);
				match(T__9);
				setState(207);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__25);
				setState(210);
				match(T__8);
				setState(211);
				expressao();
				setState(212);
				match(T__9);
				setState(213);
				bloco();
				setState(214);
				match(T__26);
				setState(215);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(T__27);
				setState(218);
				match(T__8);
				setState(219);
				expressao();
				setState(220);
				match(T__9);
				setState(221);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(T__28);
				setState(224);
				match(T__8);
				setState(225);
				expressao();
				setState(226);
				match(T__0);
				setState(227);
				expressao();
				setState(228);
				match(T__0);
				setState(229);
				expressao();
				setState(230);
				match(T__9);
				setState(231);
				bloco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				match(T__29);
				setState(234);
				match(T__8);
				setState(235);
				expressao();
				setState(236);
				match(T__9);
				setState(237);
				caseLista();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				match(T__30);
				setState(240);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				match(T__31);
				setState(242);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				match(T__32);
				setState(244);
				expressao();
				setState(245);
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
		enterRule(_localctx, 22, RULE_caseLista);
		int _la;
		try {
			int _alt;
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						match(NEWLINE);
						setState(250);
						caseDecl();
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__33 || _la==T__35) {
					{
					{
					setState(256);
					caseDecl();
					}
					}
					setState(261);
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
		enterRule(_localctx, 24, RULE_caseDecl);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(T__33);
				setState(265);
				expressao();
				setState(266);
				match(T__34);
				setState(267);
				bloco();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__35);
				setState(270);
				match(T__34);
				setState(271);
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
		enterRule(_localctx, 26, RULE_declararEstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__36);
			setState(275);
			match(ID);
			setState(276);
			match(T__13);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691128455135736L) != 0)) {
				{
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(277);
					match(NEWLINE);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				declararVAR();
				setState(284);
				match(NEWLINE);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(T__14);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(292);
				match(NEWLINE);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
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
		enterRule(_localctx, 28, RULE_array);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(ID);
				setState(301);
				match(T__11);
				setState(302);
				expressao();
				setState(303);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(ID);
				setState(306);
				match(T__11);
				setState(307);
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
		enterRule(_localctx, 30, RULE_arrayInicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__13);
			setState(311);
			match(T__37);
			setState(312);
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
		enterRule(_localctx, 32, RULE_expressao);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expreLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__48:
			case T__52:
			case T__53:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				{
				setState(319);
				expreRelacional();
				}
				break;
			case T__40:
				{
				setState(320);
				match(T__40);
				setState(321);
				expreRelacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpreLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreLogica);
						setState(324);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(325);
						match(T__38);
						setState(326);
						expreRelacional();
						}
						break;
					case 2:
						{
						_localctx = new ExpreLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreLogica);
						setState(327);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(328);
						match(T__39);
						setState(329);
						expreRelacional();
						}
						break;
					}
					} 
				}
				setState(334);
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
		enterRule(_localctx, 36, RULE_expreRelacional);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				expreAritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				expreAritmetica(0);
				setState(337);
				match(T__41);
				setState(338);
				expreAritmetica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				expreAritmetica(0);
				setState(341);
				match(T__42);
				setState(342);
				expreAritmetica(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				expreAritmetica(0);
				setState(345);
				match(T__43);
				setState(346);
				expreAritmetica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				expreAritmetica(0);
				setState(349);
				match(T__44);
				setState(350);
				expreAritmetica(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(352);
				expreAritmetica(0);
				setState(353);
				match(T__45);
				setState(354);
				expreAritmetica(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(356);
				expreAritmetica(0);
				setState(357);
				match(T__46);
				setState(358);
				expreAritmetica(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(360);
				match(ID);
				setState(361);
				match(T__42);
				setState(362);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expreAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(366);
			expreMulti(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(374);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpreAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreAritmetica);
						setState(368);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(369);
						match(T__47);
						setState(370);
						expreMulti(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpreAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreAritmetica);
						setState(371);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(372);
						match(T__48);
						setState(373);
						expreMulti(0);
						}
						break;
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expreMulti, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(380);
			expreUnaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExpreMultiContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreMulti);
						setState(382);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(383);
						match(T__49);
						setState(384);
						expreUnaria();
						}
						break;
					case 2:
						{
						_localctx = new ExpreMultiContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreMulti);
						setState(385);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(386);
						match(T__50);
						setState(387);
						expreUnaria();
						}
						break;
					case 3:
						{
						_localctx = new ExpreMultiContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreMulti);
						setState(388);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(389);
						match(T__51);
						setState(390);
						expreUnaria();
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 42, RULE_expreUnaria);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				exprePostfix();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(T__48);
				setState(398);
				expreUnaria();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(T__52);
				setState(400);
				exprePostfix();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				match(T__53);
				setState(402);
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
		enterRule(_localctx, 44, RULE_exprePostfix);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				primaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				primaria();
				setState(407);
				match(T__11);
				setState(408);
				expressao();
				setState(409);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				primaria();
				setState(412);
				match(T__8);
				setState(413);
				argumentos();
				setState(414);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				primaria();
				setState(417);
				match(T__54);
				setState(418);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				primaria();
				setState(421);
				match(T__55);
				setState(422);
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
		enterRule(_localctx, 46, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__56) ) {
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
		enterRule(_localctx, 48, RULE_primaria);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				match(NUM_DEC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(TEXTO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				match(T__8);
				setState(434);
				expressao();
				setState(435);
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
		case 17:
			return expreLogica_sempred((ExpreLogicaContext)_localctx, predIndex);
		case 19:
			return expreAritmetica_sempred((ExpreAritmeticaContext)_localctx, predIndex);
		case 20:
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
		"\u0004\u0001>\u01b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0005\u0002D\b\u0002\n\u0002"+
		"\f\u0002G\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Q\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006v\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0005\u0007z\b\u0007\n\u0007\f\u0007}\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0082\b\u0007\n"+
		"\u0007\f\u0007\u0085\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005"+
		"\b\u008b\b\b\n\b\f\b\u008e\t\b\u0001\b\u0001\b\u0005\b\u0092\b\b\n\b\f"+
		"\b\u0095\t\b\u0001\b\u0003\b\u0098\b\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00ca\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00f8\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u00fc\b\u000b"+
		"\n\u000b\f\u000b\u00ff\t\u000b\u0001\u000b\u0005\u000b\u0102\b\u000b\n"+
		"\u000b\f\u000b\u0105\t\u000b\u0003\u000b\u0107\b\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0111\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u0117\b\r\n\r\f\r\u011a\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u011f\b\r\n\r\f\r\u0122\t\r\u0001\r\u0001\r\u0005"+
		"\r\u0126\b\r\n\r\f\r\u0129\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0135\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u013d\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0143\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u014b\b\u0011"+
		"\n\u0011\f\u0011\u014e\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u016c\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0177\b\u0013\n\u0013\f\u0013\u017a\t\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0188\b\u0014"+
		"\n\u0014\f\u0014\u018b\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0194\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01a9\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01b6\b\u0018\u0001\u0018\u0000\u0003\""+
		"&(\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0\u0000\u0004\u0001\u0000\u0003\b\u0001\u0000"+
		"::\u0001\u0000\u0012\u0012\u0002\u0000&&99\u01e9\u00007\u0001\u0000\u0000"+
		"\u0000\u0002@\u0001\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006"+
		"R\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000"+
		"\u0000\fu\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010"+
		"\u0097\u0001\u0000\u0000\u0000\u0012\u00c9\u0001\u0000\u0000\u0000\u0014"+
		"\u00f7\u0001\u0000\u0000\u0000\u0016\u0106\u0001\u0000\u0000\u0000\u0018"+
		"\u0110\u0001\u0000\u0000\u0000\u001a\u0112\u0001\u0000\u0000\u0000\u001c"+
		"\u0134\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000\u0000\u0000 \u013c"+
		"\u0001\u0000\u0000\u0000\"\u0142\u0001\u0000\u0000\u0000$\u016b\u0001"+
		"\u0000\u0000\u0000&\u016d\u0001\u0000\u0000\u0000(\u017b\u0001\u0000\u0000"+
		"\u0000*\u0193\u0001\u0000\u0000\u0000,\u01a8\u0001\u0000\u0000\u0000."+
		"\u01aa\u0001\u0000\u0000\u00000\u01b5\u0001\u0000\u0000\u000023\u0003"+
		"\u0002\u0001\u000034\u0005:\u0000\u000046\u0001\u0000\u0000\u000052\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008\u0001\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:A\u0003\u0004\u0002\u0000;A\u0003\b\u0004\u0000<A\u0003\u001a"+
		"\r\u0000=A\u0003\u0010\b\u0000>A\u0003\u001e\u000f\u0000?A\u0003\u0014"+
		"\n\u0000@:\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000@<\u0001\u0000"+
		"\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000A\u0003\u0001\u0000\u0000\u0000BD\u0003\u0006\u0003"+
		"\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HI\u0005;\u0000\u0000IQ\u0005\u0001\u0000\u0000JK\u0003"+
		"\u0006\u0003\u0000KL\u0005;\u0000\u0000LM\u0005\u0002\u0000\u0000MN\u0003"+
		" \u0010\u0000NO\u0005\u0001\u0000\u0000OQ\u0001\u0000\u0000\u0000PE\u0001"+
		"\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000Q\u0005\u0001\u0000\u0000"+
		"\u0000RS\u0007\u0000\u0000\u0000S\u0007\u0001\u0000\u0000\u0000TU\u0003"+
		"\u0006\u0003\u0000UV\u0005;\u0000\u0000VW\u0005\t\u0000\u0000WX\u0003"+
		"\n\u0005\u0000XY\u0005\n\u0000\u0000YZ\u0003\u000e\u0007\u0000Zb\u0001"+
		"\u0000\u0000\u0000[\\\u0003\u0006\u0003\u0000\\]\u0005;\u0000\u0000]^"+
		"\u0005\t\u0000\u0000^_\u0005\n\u0000\u0000_`\u0003\u000e\u0007\u0000`"+
		"b\u0001\u0000\u0000\u0000aT\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000"+
		"\u0000b\t\u0001\u0000\u0000\u0000ci\u0003\f\u0006\u0000de\u0003\f\u0006"+
		"\u0000ef\u0005\u000b\u0000\u0000fg\u0003\n\u0005\u0000gi\u0001\u0000\u0000"+
		"\u0000hc\u0001\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000i\u000b\u0001"+
		"\u0000\u0000\u0000jk\u0003\u0006\u0003\u0000kl\u0005;\u0000\u0000lv\u0001"+
		"\u0000\u0000\u0000mn\u0003\u0006\u0003\u0000no\u0005;\u0000\u0000op\u0005"+
		"\f\u0000\u0000pq\u0005\r\u0000\u0000qv\u0001\u0000\u0000\u0000rs\u0003"+
		"\u0006\u0003\u0000st\u0005;\u0000\u0000tv\u0001\u0000\u0000\u0000uj\u0001"+
		"\u0000\u0000\u0000um\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000"+
		"v\r\u0001\u0000\u0000\u0000w{\u0005\u000e\u0000\u0000xz\u0005:\u0000\u0000"+
		"yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|\u0083\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u007f\u0003\u0002\u0001\u0000\u007f\u0080\u0005:\u0000"+
		"\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000"+
		"\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u000f\u0000\u0000"+
		"\u0087\u000f\u0001\u0000\u0000\u0000\u0088\u008c\u0005\u0010\u0000\u0000"+
		"\u0089\u008b\b\u0001\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u0098\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u0093\u0005\u0011\u0000\u0000\u0090"+
		"\u0092\b\u0002\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0005\u0012\u0000\u0000\u0097\u0088"+
		"\u0001\u0000\u0000\u0000\u0097\u008f\u0001\u0000\u0000\u0000\u0098\u0011"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005;\u0000\u0000\u009a\u009b\u0005"+
		"\u0002\u0000\u0000\u009b\u00ca\u0003 \u0010\u0000\u009c\u009d\u0005;\u0000"+
		"\u0000\u009d\u009e\u0005\u0013\u0000\u0000\u009e\u00ca\u0003 \u0010\u0000"+
		"\u009f\u00a0\u0005;\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1"+
		"\u00ca\u0003 \u0010\u0000\u00a2\u00a3\u0005;\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0015\u0000\u0000\u00a4\u00ca\u0003 \u0010\u0000\u00a5\u00a6\u0005;\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0016\u0000\u0000\u00a7\u00ca\u0003 \u0010\u0000"+
		"\u00a8\u00a9\u0005;\u0000\u0000\u00a9\u00aa\u0005\u0017\u0000\u0000\u00aa"+
		"\u00ca\u0003 \u0010\u0000\u00ab\u00ac\u0005;\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0018\u0000\u0000\u00ad\u00ca\u0003 \u0010\u0000\u00ae\u00af\u0005;\u0000"+
		"\u0000\u00af\u00b0\u0005\u0019\u0000\u0000\u00b0\u00ca\u0003 \u0010\u0000"+
		"\u00b1\u00b2\u0005;\u0000\u0000\u00b2\u00b3\u0005\u0002\u0000\u0000\u00b3"+
		"\u00ca\u0005;\u0000\u0000\u00b4\u00b5\u0005;\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0013\u0000\u0000\u00b6\u00ca\u0005;\u0000\u0000\u00b7\u00b8\u0005;\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0014\u0000\u0000\u00b9\u00ca\u0005;\u0000\u0000"+
		"\u00ba\u00bb\u0005;\u0000\u0000\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc"+
		"\u00ca\u0005;\u0000\u0000\u00bd\u00be\u0005;\u0000\u0000\u00be\u00bf\u0005"+
		"\u0016\u0000\u0000\u00bf\u00ca\u0005;\u0000\u0000\u00c0\u00c1\u0005;\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0017\u0000\u0000\u00c2\u00ca\u0005;\u0000\u0000"+
		"\u00c3\u00c4\u0005;\u0000\u0000\u00c4\u00c5\u0005\u0018\u0000\u0000\u00c5"+
		"\u00ca\u0005;\u0000\u0000\u00c6\u00c7\u0005;\u0000\u0000\u00c7\u00c8\u0005"+
		"\u0019\u0000\u0000\u00c8\u00ca\u0005;\u0000\u0000\u00c9\u0099\u0001\u0000"+
		"\u0000\u0000\u00c9\u009c\u0001\u0000\u0000\u0000\u00c9\u009f\u0001\u0000"+
		"\u0000\u0000\u00c9\u00a2\u0001\u0000\u0000\u0000\u00c9\u00a5\u0001\u0000"+
		"\u0000\u0000\u00c9\u00a8\u0001\u0000\u0000\u0000\u00c9\u00ab\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ae\u0001\u0000\u0000\u0000\u00c9\u00b1\u0001\u0000"+
		"\u0000\u0000\u00c9\u00b4\u0001\u0000\u0000\u0000\u00c9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ba\u0001\u0000\u0000\u0000\u00c9\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c0\u0001\u0000\u0000\u0000\u00c9\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00ca\u0013\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005\u001a\u0000\u0000\u00cc\u00cd\u0005\t\u0000"+
		"\u0000\u00cd\u00ce\u0003 \u0010\u0000\u00ce\u00cf\u0005\n\u0000\u0000"+
		"\u00cf\u00d0\u0003\u000e\u0007\u0000\u00d0\u00f8\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005\u001a\u0000\u0000\u00d2\u00d3\u0005\t\u0000\u0000\u00d3"+
		"\u00d4\u0003 \u0010\u0000\u00d4\u00d5\u0005\n\u0000\u0000\u00d5\u00d6"+
		"\u0003\u000e\u0007\u0000\u00d6\u00d7\u0005\u001b\u0000\u0000\u00d7\u00d8"+
		"\u0003\u000e\u0007\u0000\u00d8\u00f8\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005\u001c\u0000\u0000\u00da\u00db\u0005\t\u0000\u0000\u00db\u00dc\u0003"+
		" \u0010\u0000\u00dc\u00dd\u0005\n\u0000\u0000\u00dd\u00de\u0003\u000e"+
		"\u0007\u0000\u00de\u00f8\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u001d"+
		"\u0000\u0000\u00e0\u00e1\u0005\t\u0000\u0000\u00e1\u00e2\u0003 \u0010"+
		"\u0000\u00e2\u00e3\u0005\u0001\u0000\u0000\u00e3\u00e4\u0003 \u0010\u0000"+
		"\u00e4\u00e5\u0005\u0001\u0000\u0000\u00e5\u00e6\u0003 \u0010\u0000\u00e6"+
		"\u00e7\u0005\n\u0000\u0000\u00e7\u00e8\u0003\u000e\u0007\u0000\u00e8\u00f8"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001e\u0000\u0000\u00ea\u00eb"+
		"\u0005\t\u0000\u0000\u00eb\u00ec\u0003 \u0010\u0000\u00ec\u00ed\u0005"+
		"\n\u0000\u0000\u00ed\u00ee\u0003\u0016\u000b\u0000\u00ee\u00f8\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0005\u001f\u0000\u0000\u00f0\u00f8\u0005\u0001"+
		"\u0000\u0000\u00f1\u00f2\u0005 \u0000\u0000\u00f2\u00f8\u0005\u0001\u0000"+
		"\u0000\u00f3\u00f4\u0005!\u0000\u0000\u00f4\u00f5\u0003 \u0010\u0000\u00f5"+
		"\u00f6\u0005\u0001\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7"+
		"\u00cb\u0001\u0000\u0000\u0000\u00f7\u00d1\u0001\u0000\u0000\u0000\u00f7"+
		"\u00d9\u0001\u0000\u0000\u0000\u00f7\u00df\u0001\u0000\u0000\u0000\u00f7"+
		"\u00e9\u0001\u0000\u0000\u0000\u00f7\u00ef\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000\u0000\u00f8"+
		"\u0015\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005:\u0000\u0000\u00fa\u00fc"+
		"\u0003\u0018\f\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u0107\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u0102\u0003\u0018\f\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u00fd\u0001\u0000"+
		"\u0000\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0107\u0017\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0005\"\u0000\u0000\u0109\u010a\u0003 \u0010"+
		"\u0000\u010a\u010b\u0005#\u0000\u0000\u010b\u010c\u0003\u000e\u0007\u0000"+
		"\u010c\u0111\u0001\u0000\u0000\u0000\u010d\u010e\u0005$\u0000\u0000\u010e"+
		"\u010f\u0005#\u0000\u0000\u010f\u0111\u0003\u000e\u0007\u0000\u0110\u0108"+
		"\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0111\u0019"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0005%\u0000\u0000\u0113\u0114\u0005"+
		";\u0000\u0000\u0114\u0120\u0005\u000e\u0000\u0000\u0115\u0117\u0005:\u0000"+
		"\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0003\u0004\u0002\u0000\u011c\u011d\u0005:\u0000\u0000"+
		"\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0118\u0001\u0000\u0000\u0000"+
		"\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000"+
		"\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0127\u0005\u000f\u0000\u0000"+
		"\u0124\u0126\u0005:\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126"+
		"\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0001\u0000\u0000\u012b"+
		"\u001b\u0001\u0000\u0000\u0000\u012c\u012d\u0005;\u0000\u0000\u012d\u012e"+
		"\u0005\f\u0000\u0000\u012e\u012f\u0003 \u0010\u0000\u012f\u0130\u0005"+
		"\r\u0000\u0000\u0130\u0135\u0001\u0000\u0000\u0000\u0131\u0132\u0005;"+
		"\u0000\u0000\u0132\u0133\u0005\f\u0000\u0000\u0133\u0135\u0005\r\u0000"+
		"\u0000\u0134\u012c\u0001\u0000\u0000\u0000\u0134\u0131\u0001\u0000\u0000"+
		"\u0000\u0135\u001d\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u000e\u0000"+
		"\u0000\u0137\u0138\u0005&\u0000\u0000\u0138\u0139\u0005\u000f\u0000\u0000"+
		"\u0139\u001f\u0001\u0000\u0000\u0000\u013a\u013d\u0003\u0012\t\u0000\u013b"+
		"\u013d\u0003\"\u0011\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013d!\u0001\u0000\u0000\u0000\u013e\u013f\u0006"+
		"\u0011\uffff\uffff\u0000\u013f\u0143\u0003$\u0012\u0000\u0140\u0141\u0005"+
		")\u0000\u0000\u0141\u0143\u0003$\u0012\u0000\u0142\u013e\u0001\u0000\u0000"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u014c\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\n\u0003\u0000\u0000\u0145\u0146\u0005\'\u0000\u0000"+
		"\u0146\u014b\u0003$\u0012\u0000\u0147\u0148\n\u0002\u0000\u0000\u0148"+
		"\u0149\u0005(\u0000\u0000\u0149\u014b\u0003$\u0012\u0000\u014a\u0144\u0001"+
		"\u0000\u0000\u0000\u014a\u0147\u0001\u0000\u0000\u0000\u014b\u014e\u0001"+
		"\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d#\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014f\u016c\u0003&\u0013\u0000\u0150\u0151\u0003&\u0013\u0000"+
		"\u0151\u0152\u0005*\u0000\u0000\u0152\u0153\u0003&\u0013\u0000\u0153\u016c"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0003&\u0013\u0000\u0155\u0156\u0005"+
		"+\u0000\u0000\u0156\u0157\u0003&\u0013\u0000\u0157\u016c\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0003&\u0013\u0000\u0159\u015a\u0005,\u0000\u0000\u015a"+
		"\u015b\u0003&\u0013\u0000\u015b\u016c\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0003&\u0013\u0000\u015d\u015e\u0005-\u0000\u0000\u015e\u015f\u0003&"+
		"\u0013\u0000\u015f\u016c\u0001\u0000\u0000\u0000\u0160\u0161\u0003&\u0013"+
		"\u0000\u0161\u0162\u0005.\u0000\u0000\u0162\u0163\u0003&\u0013\u0000\u0163"+
		"\u016c\u0001\u0000\u0000\u0000\u0164\u0165\u0003&\u0013\u0000\u0165\u0166"+
		"\u0005/\u0000\u0000\u0166\u0167\u0003&\u0013\u0000\u0167\u016c\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0005;\u0000\u0000\u0169\u016a\u0005+\u0000\u0000"+
		"\u016a\u016c\u0005;\u0000\u0000\u016b\u014f\u0001\u0000\u0000\u0000\u016b"+
		"\u0150\u0001\u0000\u0000\u0000\u016b\u0154\u0001\u0000\u0000\u0000\u016b"+
		"\u0158\u0001\u0000\u0000\u0000\u016b\u015c\u0001\u0000\u0000\u0000\u016b"+
		"\u0160\u0001\u0000\u0000\u0000\u016b\u0164\u0001\u0000\u0000\u0000\u016b"+
		"\u0168\u0001\u0000\u0000\u0000\u016c%\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0006\u0013\uffff\uffff\u0000\u016e\u016f\u0003(\u0014\u0000\u016f\u0178"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\n\u0002\u0000\u0000\u0171\u0172\u0005"+
		"0\u0000\u0000\u0172\u0177\u0003(\u0014\u0000\u0173\u0174\n\u0001\u0000"+
		"\u0000\u0174\u0175\u00051\u0000\u0000\u0175\u0177\u0003(\u0014\u0000\u0176"+
		"\u0170\u0001\u0000\u0000\u0000\u0176\u0173\u0001\u0000\u0000\u0000\u0177"+
		"\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0001\u0000\u0000\u0000\u0179\'\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0006\u0014\uffff\uffff\u0000\u017c"+
		"\u017d\u0003*\u0015\u0000\u017d\u0189\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\n\u0003\u0000\u0000\u017f\u0180\u00052\u0000\u0000\u0180\u0188\u0003"+
		"*\u0015\u0000\u0181\u0182\n\u0002\u0000\u0000\u0182\u0183\u00053\u0000"+
		"\u0000\u0183\u0188\u0003*\u0015\u0000\u0184\u0185\n\u0001\u0000\u0000"+
		"\u0185\u0186\u00054\u0000\u0000\u0186\u0188\u0003*\u0015\u0000\u0187\u017e"+
		"\u0001\u0000\u0000\u0000\u0187\u0181\u0001\u0000\u0000\u0000\u0187\u0184"+
		"\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a)\u0001"+
		"\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u0194\u0003"+
		",\u0016\u0000\u018d\u018e\u00051\u0000\u0000\u018e\u0194\u0003*\u0015"+
		"\u0000\u018f\u0190\u00055\u0000\u0000\u0190\u0194\u0003,\u0016\u0000\u0191"+
		"\u0192\u00056\u0000\u0000\u0192\u0194\u0003,\u0016\u0000\u0193\u018c\u0001"+
		"\u0000\u0000\u0000\u0193\u018d\u0001\u0000\u0000\u0000\u0193\u018f\u0001"+
		"\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194+\u0001\u0000"+
		"\u0000\u0000\u0195\u01a9\u00030\u0018\u0000\u0196\u0197\u00030\u0018\u0000"+
		"\u0197\u0198\u0005\f\u0000\u0000\u0198\u0199\u0003 \u0010\u0000\u0199"+
		"\u019a\u0005\r\u0000\u0000\u019a\u01a9\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u00030\u0018\u0000\u019c\u019d\u0005\t\u0000\u0000\u019d\u019e\u0003"+
		".\u0017\u0000\u019e\u019f\u0005\n\u0000\u0000\u019f\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u00030\u0018\u0000\u01a1\u01a2\u00057\u0000\u0000"+
		"\u01a2\u01a3\u0005;\u0000\u0000\u01a3\u01a9\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u00030\u0018\u0000\u01a5\u01a6\u00058\u0000\u0000\u01a6\u01a7\u0005"+
		";\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u0195\u0001\u0000"+
		"\u0000\u0000\u01a8\u0196\u0001\u0000\u0000\u0000\u01a8\u019b\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a0\u0001\u0000\u0000\u0000\u01a8\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a9-\u0001\u0000\u0000\u0000\u01aa\u01ab\u0007\u0003\u0000"+
		"\u0000\u01ab/\u0001\u0000\u0000\u0000\u01ac\u01b6\u0005;\u0000\u0000\u01ad"+
		"\u01b6\u0003\u001c\u000e\u0000\u01ae\u01b6\u0005<\u0000\u0000\u01af\u01b6"+
		"\u0005=\u0000\u0000\u01b0\u01b6\u0005>\u0000\u0000\u01b1\u01b2\u0005\t"+
		"\u0000\u0000\u01b2\u01b3\u0003 \u0010\u0000\u01b3\u01b4\u0005\n\u0000"+
		"\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01ac\u0001\u0000\u0000"+
		"\u0000\u01b5\u01ad\u0001\u0000\u0000\u0000\u01b5\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b5\u01af\u0001\u0000\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b61\u0001\u0000\u0000\u0000"+
		"\"7@EPahu{\u0083\u008c\u0093\u0097\u00c9\u00f7\u00fd\u0103\u0106\u0110"+
		"\u0118\u0120\u0127\u0134\u013c\u0142\u014a\u014c\u016b\u0176\u0178\u0187"+
		"\u0189\u0193\u01a8\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}