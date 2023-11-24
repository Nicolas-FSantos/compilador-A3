// Generated from c:/Users/Nicolas Ferreira/Documents/antlr/compilador-A3/coffe.g4 by ANTLR 4.13.1

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
		T__9=10, T__10=11, T__11=12, ID=13, INT=14, DEC=15, BOOL=16, STRING=17, 
		OPREL=18, SOMA=19, SUB=20, MULT=21, DIV=22, PV=23, AC=24, FC=25, ABREP=26, 
		FP=27, Op_atrib=28, WS=29;
	public static final int
		RULE_prog = 0, RULE_declaracao = 1, RULE_tipo = 2, RULE_bloco = 3, RULE_comando = 4, 
		RULE_ler = 5, RULE_escrever = 6, RULE_condicional = 7, RULE_compare = 8, 
		RULE_repetfor = 9, RULE_repetwhile = 10, RULE_atribuicao = 11, RULE_expressao = 12, 
		RULE_termo = 13, RULE_fator = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaracao", "tipo", "bloco", "comando", "ler", "escrever", 
			"condicional", "compare", "repetfor", "repetwhile", "atribuicao", "expressao", 
			"termo", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'natural'", "'texto'", "'decimal'", "'boleano'", 
			"'leia'", "'escreva'", "'se'", "'senao'", "'para'", "'enquanto'", null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "';'", "'{'", 
			"'}'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "INT", "DEC", "BOOL", "STRING", "OPREL", "SOMA", "SUB", "MULT", 
			"DIV", "PV", "AC", "FC", "ABREP", "FP", "Op_atrib", "WS"
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
			setState(30);
			match(T__0);
			setState(31);
			declaracao();
			setState(32);
			bloco();
			setState(33);
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) {
				{
				{
				setState(35);
				tipo();
				setState(36);
				match(ID);
				setState(37);
				match(PV);
				}
				}
				setState(43);
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
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				comando();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 15232L) != 0) );
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				ler();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				escrever();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				condicional();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				repetfor();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				repetwhile();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
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
			setState(59);
			match(T__6);
			setState(60);
			match(ABREP);
			setState(61);
			match(ID);
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
			setState(65);
			match(T__7);
			setState(66);
			match(ABREP);
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(68);
			match(FP);
			setState(69);
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
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
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
			setState(71);
			match(T__8);
			setState(72);
			match(ABREP);
			setState(73);
			compare();
			setState(74);
			match(FP);
			setState(75);
			match(AC);
			setState(76);
			bloco();
			setState(77);
			match(FC);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(78);
				match(T__9);
				setState(79);
				match(AC);
				setState(80);
				bloco();
				setState(81);
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
	public static class CompareContext extends ParserRuleContext {
		public TerminalNode OPREL() { return getToken(coffeParser.OPREL, 0); }
		public List<TerminalNode> ID() { return getTokens(coffeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(coffeParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(coffeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(coffeParser.INT, i);
		}
		public List<TerminalNode> DEC() { return getTokens(coffeParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(coffeParser.DEC, i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
			match(OPREL);
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
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
			setState(89);
			match(T__10);
			setState(90);
			match(ABREP);
			setState(91);
			atribuicao();
			setState(92);
			match(PV);
			setState(93);
			compare();
			setState(94);
			match(PV);
			setState(95);
			atribuicao();
			setState(96);
			match(FP);
			setState(97);
			match(AC);
			setState(98);
			bloco();
			setState(99);
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
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
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
			setState(101);
			match(T__11);
			setState(102);
			match(ABREP);
			setState(103);
			compare();
			setState(104);
			match(FP);
			setState(105);
			match(AC);
			setState(106);
			bloco();
			setState(107);
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
		public List<TerminalNode> ID() { return getTokens(coffeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(coffeParser.ID, i);
		}
		public TerminalNode Op_atrib() { return getToken(coffeParser.Op_atrib, 0); }
		public TerminalNode PV() { return getToken(coffeParser.PV, 0); }
		public TerminalNode INT() { return getToken(coffeParser.INT, 0); }
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
			setState(109);
			match(ID);
			setState(110);
			match(Op_atrib);
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(112);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> SOMA() { return getTokens(coffeParser.SOMA); }
		public TerminalNode SOMA(int i) {
			return getToken(coffeParser.SOMA, i);
		}
		public List<TerminalNode> SUB() { return getTokens(coffeParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(coffeParser.SUB, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			termo();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA || _la==SUB) {
				{
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==SOMA || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				termo();
				}
				}
				setState(121);
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
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(coffeParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(coffeParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(coffeParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(coffeParser.DIV, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			fator();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				fator();
				}
				}
				setState(129);
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
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(coffeParser.ID, 0); }
		public TerminalNode INT() { return getToken(coffeParser.INT, 0); }
		public TerminalNode DEC() { return getToken(coffeParser.DEC, 0); }
		public TerminalNode ABREP() { return getToken(coffeParser.ABREP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(coffeParser.FP, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fator);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(INT);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(DEC);
				}
				break;
			case ABREP:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(133);
				match(ABREP);
				setState(134);
				expressao();
				setState(135);
				match(FP);
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0004\u00030\b\u0003\u000b\u0003\f\u0003"+
		"1\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004:\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007T\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\fv\b\f\n\f\f\fy\t\f\u0001\r"+
		"\u0001\r\u0001\r\u0005\r~\b\r\n\r\f\r\u0081\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u008a\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0005\u0001"+
		"\u0000\u0003\u0006\u0002\u0000\r\r\u0011\u0011\u0001\u0000\r\u000f\u0001"+
		"\u0000\u0013\u0014\u0001\u0000\u0015\u0016\u0089\u0000\u001e\u0001\u0000"+
		"\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000"+
		"\u0006/\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\n;\u0001\u0000"+
		"\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000"+
		"\u0010U\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014e"+
		"\u0001\u0000\u0000\u0000\u0016m\u0001\u0000\u0000\u0000\u0018r\u0001\u0000"+
		"\u0000\u0000\u001az\u0001\u0000\u0000\u0000\u001c\u0089\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0003\u0002\u0001\u0000"+
		" !\u0003\u0006\u0003\u0000!\"\u0005\u0002\u0000\u0000\"\u0001\u0001\u0000"+
		"\u0000\u0000#$\u0003\u0004\u0002\u0000$%\u0005\r\u0000\u0000%&\u0005\u0017"+
		"\u0000\u0000&(\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000(+\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000"+
		"*\u0003\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0007\u0000"+
		"\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.0\u0003\b\u0004\u0000/.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u00003:\u0003\n\u0005"+
		"\u00004:\u0003\f\u0006\u00005:\u0003\u000e\u0007\u00006:\u0003\u0012\t"+
		"\u00007:\u0003\u0014\n\u00008:\u0003\u0016\u000b\u000093\u0001\u0000\u0000"+
		"\u000094\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u000096\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\t\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0007\u0000\u0000<=\u0005\u001a\u0000\u0000"+
		"=>\u0005\r\u0000\u0000>?\u0005\u001b\u0000\u0000?@\u0005\u0017\u0000\u0000"+
		"@\u000b\u0001\u0000\u0000\u0000AB\u0005\b\u0000\u0000BC\u0005\u001a\u0000"+
		"\u0000CD\u0007\u0001\u0000\u0000DE\u0005\u001b\u0000\u0000EF\u0005\u0017"+
		"\u0000\u0000F\r\u0001\u0000\u0000\u0000GH\u0005\t\u0000\u0000HI\u0005"+
		"\u001a\u0000\u0000IJ\u0003\u0010\b\u0000JK\u0005\u001b\u0000\u0000KL\u0005"+
		"\u0018\u0000\u0000LM\u0003\u0006\u0003\u0000MS\u0005\u0019\u0000\u0000"+
		"NO\u0005\n\u0000\u0000OP\u0005\u0018\u0000\u0000PQ\u0003\u0006\u0003\u0000"+
		"QR\u0005\u0019\u0000\u0000RT\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000T\u000f\u0001\u0000\u0000\u0000UV\u0007"+
		"\u0002\u0000\u0000VW\u0005\u0012\u0000\u0000WX\u0007\u0002\u0000\u0000"+
		"X\u0011\u0001\u0000\u0000\u0000YZ\u0005\u000b\u0000\u0000Z[\u0005\u001a"+
		"\u0000\u0000[\\\u0003\u0016\u000b\u0000\\]\u0005\u0017\u0000\u0000]^\u0003"+
		"\u0010\b\u0000^_\u0005\u0017\u0000\u0000_`\u0003\u0016\u000b\u0000`a\u0005"+
		"\u001b\u0000\u0000ab\u0005\u0018\u0000\u0000bc\u0003\u0006\u0003\u0000"+
		"cd\u0005\u0019\u0000\u0000d\u0013\u0001\u0000\u0000\u0000ef\u0005\f\u0000"+
		"\u0000fg\u0005\u001a\u0000\u0000gh\u0003\u0010\b\u0000hi\u0005\u001b\u0000"+
		"\u0000ij\u0005\u0018\u0000\u0000jk\u0003\u0006\u0003\u0000kl\u0005\u0019"+
		"\u0000\u0000l\u0015\u0001\u0000\u0000\u0000mn\u0005\r\u0000\u0000no\u0005"+
		"\u001c\u0000\u0000op\u0007\u0002\u0000\u0000pq\u0005\u0017\u0000\u0000"+
		"q\u0017\u0001\u0000\u0000\u0000rw\u0003\u001a\r\u0000st\u0007\u0003\u0000"+
		"\u0000tv\u0003\u001a\r\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0019\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z\u007f\u0003\u001c\u000e"+
		"\u0000{|\u0007\u0004\u0000\u0000|~\u0003\u001c\u000e\u0000}{\u0001\u0000"+
		"\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u001b\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u008a\u0005\r\u0000\u0000\u0083"+
		"\u008a\u0005\u000e\u0000\u0000\u0084\u008a\u0005\u000f\u0000\u0000\u0085"+
		"\u0086\u0005\u001a\u0000\u0000\u0086\u0087\u0003\u0018\f\u0000\u0087\u0088"+
		"\u0005\u001b\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0082"+
		"\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000\u0000\u0089\u0084"+
		"\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u001d"+
		"\u0001\u0000\u0000\u0000\u0007)19Sw\u007f\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}