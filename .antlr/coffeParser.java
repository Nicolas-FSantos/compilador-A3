// Generated from c:/Users/nicolas.santos/Documents/GitHub/compilador-A3/coffe.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class coffeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, NUM=13, DEC=14, STRING=15, OPREL=16, SOMA=17, 
		SUB=18, MULT=19, DIV=20, PV=21, AC=22, FC=23, ABREP=24, FP=25, Op_atrib=26, 
		WS=27;
	public static final int
		RULE_prog = 0, RULE_declaracao = 1, RULE_tipo = 2, RULE_bloco = 3, RULE_comando = 4, 
		RULE_ler = 5, RULE_escrever = 6, RULE_condicional = 7, RULE_comp = 8, 
		RULE_repetfor = 9, RULE_repetwhile = 10, RULE_atribuicao = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaracao", "tipo", "bloco", "comando", "ler", "escrever", 
			"condicional", "comp", "repetfor", "repetwhile", "atribuicao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'natural'", "'texto'", "'decimal'", "'leia'", 
			"'escreva'", "'se'", "'senao'", "'para'", "'enquanto'", null, null, null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "';'", "'{'", "'}'", "'('", "')'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "NUM", "DEC", "STRING", "OPREL", "SOMA", "SUB", "MULT", "DIV", 
			"PV", "AC", "FC", "ABREP", "FP", "Op_atrib", "WS"
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
	public String getGrammarFileName() { return "coffe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Variavel novaVariavel = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		String codigoJava = "";
		int escopo;
		int tipo;
		String nome;

	public coffeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			declaracao();
			setState(26);
			bloco();
			setState(27);
			match(T__1);
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(coffeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(coffeParser.ID, i);
		}
		public List<TerminalNode> PV() { return getTokens(coffeParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(coffeParser.PV, i);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				{
				setState(29);
				tipo();
				setState(30);
				match(ID);
				setState(31);
				match(PV);
				}
				}
				setState(37);
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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
	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				comando();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7616L) != 0) );
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
	public static class ComandoContext extends ParserRuleContext {
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public EscreverContext escrever() {
			return getRuleContext(EscreverContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepetforContext repetfor() {
			return getRuleContext(RepetforContext.class,0);
		}
		public RepetwhileContext repetwhile() {
			return getRuleContext(RepetwhileContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				ler();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				escrever();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				condicional();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				repetfor();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				repetwhile();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				atribuicao();
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
	public static class LerContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(coffeParser.ABREP, 0); }
		public TerminalNode ID() { return getToken(coffeParser.ID, 0); }
		public TerminalNode FP() { return getToken(coffeParser.FP, 0); }
		public TerminalNode PV() { return getToken(coffeParser.PV, 0); }
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__5);
			setState(54);
			match(ABREP);
			setState(55);
			match(ID);
			setState(56);
			match(FP);
			setState(57);
			match(PV);
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
	public static class EscreverContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(coffeParser.ABREP, 0); }
		public TerminalNode FP() { return getToken(coffeParser.FP, 0); }
		public TerminalNode PV() { return getToken(coffeParser.PV, 0); }
		public TerminalNode ID() { return getToken(coffeParser.ID, 0); }
		public TerminalNode STRING() { return getToken(coffeParser.STRING, 0); }
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_escrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__6);
			setState(60);
			match(ABREP);
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(62);
			match(FP);
			setState(63);
			match(PV);
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
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(coffeParser.ABREP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(coffeParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(coffeParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(coffeParser.AC, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(coffeParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(coffeParser.FC, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__7);
			setState(66);
			match(ABREP);
			setState(67);
			comp();
			setState(68);
			match(FP);
			setState(69);
			match(AC);
			setState(70);
			bloco();
			setState(71);
			match(FC);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(72);
				match(T__8);
				setState(73);
				match(AC);
				setState(74);
				bloco();
				setState(75);
				match(FC);
				}
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
	public static class CompContext extends ParserRuleContext {
		public TerminalNode OPREL() { return getToken(coffeParser.OPREL, 0); }
		public List<TerminalNode> ID() { return getTokens(coffeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(coffeParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(coffeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(coffeParser.NUM, i);
		}
		public List<TerminalNode> DEC() { return getTokens(coffeParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(coffeParser.DEC, i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			match(OPREL);
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
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
	public static class RepetforContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(coffeParser.ABREP, 0); }
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(coffeParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(coffeParser.PV, i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(coffeParser.FP, 0); }
		public TerminalNode AC() { return getToken(coffeParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(coffeParser.FC, 0); }
		public RepetforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetfor; }
	}

	public final RepetforContext repetfor() throws RecognitionException {
		RepetforContext _localctx = new RepetforContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repetfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__9);
			setState(84);
			match(ABREP);
			setState(85);
			atribuicao();
			setState(86);
			match(PV);
			setState(87);
			comp();
			setState(88);
			match(PV);
			setState(89);
			atribuicao();
			setState(90);
			match(FP);
			setState(91);
			match(AC);
			setState(92);
			bloco();
			setState(93);
			match(FC);
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
	public static class RepetwhileContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(coffeParser.ABREP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(coffeParser.FP, 0); }
		public TerminalNode AC() { return getToken(coffeParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(coffeParser.FC, 0); }
		public RepetwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetwhile; }
	}

	public final RepetwhileContext repetwhile() throws RecognitionException {
		RepetwhileContext _localctx = new RepetwhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repetwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__10);
			setState(96);
			match(ABREP);
			setState(97);
			comp();
			setState(98);
			match(FP);
			setState(99);
			match(AC);
			setState(100);
			bloco();
			setState(101);
			match(FC);
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
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(coffeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(coffeParser.ID, i);
		}
		public TerminalNode Op_atrib() { return getToken(coffeParser.Op_atrib, 0); }
		public TerminalNode PV() { return getToken(coffeParser.PV, 0); }
		public TerminalNode NUM() { return getToken(coffeParser.NUM, 0); }
		public TerminalNode DEC() { return getToken(coffeParser.DEC, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((AtribuicaoContext)_localctx).ID = match(ID);
			setState(104);
			match(Op_atrib);
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			match(PV);
				
						nome = (((AtribuicaoContext)_localctx).ID!=null?((AtribuicaoContext)_localctx).ID.getText():null);
						if(!cv.jaExiste(nome)){
							System.err.println("A variavel "+nome+" nao foi declarada");
							System.exit(0);
						}
						else{
							escopo = cv.getEscopo(nome);
							tipo = cv.getTipo(nome);
							if(tipo == 1){
								codigoJava += "int "+nome+" = "+(((AtribuicaoContext)_localctx).ID!=null?((AtribuicaoContext)_localctx).ID.getText():null)+";\n";
							}
							else if(tipo == 2){
								codigoJava += "String "+nome+" = "+(((AtribuicaoContext)_localctx).ID!=null?((AtribuicaoContext)_localctx).ID.getText():null)+";\n";
							}
							else if(tipo == 3){
								codigoJava += "double "+nome+" = "+(((AtribuicaoContext)_localctx).ID!=null?((AtribuicaoContext)_localctx).ID.getText():null)+";\n";
							}
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

	public static final String _serializedATN =
		"\u0004\u0001\u001bn\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\"\b\u0001\n\u0001\f\u0001%"+
		"\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003*\b\u0003\u000b"+
		"\u0003\f\u0003+\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u00044\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007N\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0003\u0001"+
		"\u0000\u0003\u0005\u0002\u0000\f\f\u000f\u000f\u0001\u0000\f\u000ei\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004&\u0001"+
		"\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000"+
		"\u0000\n5\u0001\u0000\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000eA\u0001"+
		"\u0000\u0000\u0000\u0010O\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000"+
		"\u0000\u0014_\u0001\u0000\u0000\u0000\u0016g\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0005\u0001\u0000\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a"+
		"\u001b\u0003\u0006\u0003\u0000\u001b\u001c\u0005\u0002\u0000\u0000\u001c"+
		"\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e"+
		"\u001f\u0005\f\u0000\u0000\u001f \u0005\u0015\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!\u001d\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0003\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0007\u0000\u0000\u0000\'\u0005"+
		"\u0001\u0000\u0000\u0000(*\u0003\b\u0004\u0000)(\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,\u0007\u0001\u0000\u0000\u0000-4\u0003\n\u0005\u0000.4\u0003\f"+
		"\u0006\u0000/4\u0003\u000e\u0007\u000004\u0003\u0012\t\u000014\u0003\u0014"+
		"\n\u000024\u0003\u0016\u000b\u00003-\u0001\u0000\u0000\u00003.\u0001\u0000"+
		"\u0000\u00003/\u0001\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000032\u0001\u0000\u0000\u00004\t\u0001\u0000\u0000\u0000"+
		"56\u0005\u0006\u0000\u000067\u0005\u0018\u0000\u000078\u0005\f\u0000\u0000"+
		"89\u0005\u0019\u0000\u00009:\u0005\u0015\u0000\u0000:\u000b\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0007\u0000\u0000<=\u0005\u0018\u0000\u0000=>\u0007"+
		"\u0001\u0000\u0000>?\u0005\u0019\u0000\u0000?@\u0005\u0015\u0000\u0000"+
		"@\r\u0001\u0000\u0000\u0000AB\u0005\b\u0000\u0000BC\u0005\u0018\u0000"+
		"\u0000CD\u0003\u0010\b\u0000DE\u0005\u0019\u0000\u0000EF\u0005\u0016\u0000"+
		"\u0000FG\u0003\u0006\u0003\u0000GM\u0005\u0017\u0000\u0000HI\u0005\t\u0000"+
		"\u0000IJ\u0005\u0016\u0000\u0000JK\u0003\u0006\u0003\u0000KL\u0005\u0017"+
		"\u0000\u0000LN\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000N\u000f\u0001\u0000\u0000\u0000OP\u0007\u0002\u0000"+
		"\u0000PQ\u0005\u0010\u0000\u0000QR\u0007\u0002\u0000\u0000R\u0011\u0001"+
		"\u0000\u0000\u0000ST\u0005\n\u0000\u0000TU\u0005\u0018\u0000\u0000UV\u0003"+
		"\u0016\u000b\u0000VW\u0005\u0015\u0000\u0000WX\u0003\u0010\b\u0000XY\u0005"+
		"\u0015\u0000\u0000YZ\u0003\u0016\u000b\u0000Z[\u0005\u0019\u0000\u0000"+
		"[\\\u0005\u0016\u0000\u0000\\]\u0003\u0006\u0003\u0000]^\u0005\u0017\u0000"+
		"\u0000^\u0013\u0001\u0000\u0000\u0000_`\u0005\u000b\u0000\u0000`a\u0005"+
		"\u0018\u0000\u0000ab\u0003\u0010\b\u0000bc\u0005\u0019\u0000\u0000cd\u0005"+
		"\u0016\u0000\u0000de\u0003\u0006\u0003\u0000ef\u0005\u0017\u0000\u0000"+
		"f\u0015\u0001\u0000\u0000\u0000gh\u0005\f\u0000\u0000hi\u0005\u001a\u0000"+
		"\u0000ij\u0007\u0002\u0000\u0000jk\u0005\u0015\u0000\u0000kl\u0006\u000b"+
		"\uffff\uffff\u0000l\u0017\u0001\u0000\u0000\u0000\u0004#+3M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}