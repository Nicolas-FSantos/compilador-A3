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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		NUM=10, DEC=11, STRING=12, OPREL=13, SOMA=14, SUB=15, MULT=16, DIV=17, 
		PV=18, AC=19, FC=20, ABREP=21, FP=22, Op_atrib=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_declaracao = 1, RULE_tipo = 2, RULE_bloco = 3, RULE_cond = 4, 
		RULE_comp = 5, RULE_repet = 6, RULE_atrib = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaracao", "tipo", "bloco", "cond", "comp", "repet", "atrib"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'natural'", "'texto'", "'decimal'", "'se'", 
			"'senao'", "'enquanto'", null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "';'", "'{'", "'}'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "NUM", "DEC", 
			"STRING", "OPREL", "SOMA", "SUB", "MULT", "DIV", "PV", "AC", "FC", "ABREP", 
			"FP", "Op_atrib", "WS"
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
			setState(16);
			match(T__0);
			setState(17);
			declaracao();
			setState(18);
			bloco();
			setState(19);
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
		public Token ID;
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				{
				setState(21);
				tipo();
				setState(22);
				((DeclaracaoContext)_localctx).ID = match(ID);
				 novaVariavel = new Variavel((((DeclaracaoContext)_localctx).ID!=null?((DeclaracaoContext)_localctx).ID.getText():null), tipo, escopo);
				                     boolean declarado = cv.adiciona(novaVariavel);
									 if(!declarado){
									    System.err.println("Variavel "+(((DeclaracaoContext)_localctx).ID!=null?((DeclaracaoContext)_localctx).ID.getText():null)+" ja foi declarada!!!");
									    System.exit(0);
									 }
									 codigoJava += (((DeclaracaoContext)_localctx).ID!=null?((DeclaracaoContext)_localctx).ID.getText():null);
								   
				setState(24);
				match(PV);
				codigoJava += ";\n";
				}
				}
				setState(31);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(32);
				match(T__2);
					tipo = 0;
											codigoJava += "int ";
										
				}
				break;
			case T__3:
				{
				setState(34);
				match(T__3);
					tipo = 1;
											codigoJava += "String ";
										
				}
				break;
			case T__4:
				{
				setState(36);
				match(T__4);
				   tipo = 2;
				                            codigoJava += "float ";
				                        
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
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
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==ID) {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(40);
					cond();
					}
					break;
				case ID:
					{
					setState(41);
					atrib();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46);
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
	public static class CondContext extends ParserRuleContext {
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
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__5);
			setState(48);
			match(ABREP);
			setState(49);
			comp();
			setState(50);
			match(FP);
			setState(51);
			match(AC);
			setState(52);
			bloco();
			setState(53);
			match(FC);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(54);
				match(T__6);
				setState(55);
				match(AC);
				setState(56);
				bloco();
				setState(57);
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
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(62);
			match(OPREL);
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
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
	public static class RepetContext extends ParserRuleContext {
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
		public RepetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repet; }
	}

	public final RepetContext repet() throws RecognitionException {
		RepetContext _localctx = new RepetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repet);
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
	public static class AtribContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(coffeParser.ID, 0); }
		public TerminalNode PV() { return getToken(coffeParser.PV, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((AtribContext)_localctx).ID = match(ID);
				boolean resultado = cv.jaExiste((((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null));
							if(!resultado){
								System.err.println("A variavel "+(((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null)+" nao foi declarada");
								System.exit(0);
							}
						
			setState(75);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018N\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c"+
		"\b\u0001\n\u0001\f\u0001\u001f\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003+\b\u0003\n\u0003\f\u0003.\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"<\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000"+
		"\t\nK\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004&\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b"+
		"/\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000"+
		"\u0000\u000eI\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0001\u0000\u0000"+
		"\u0011\u0012\u0003\u0002\u0001\u0000\u0012\u0013\u0003\u0006\u0003\u0000"+
		"\u0013\u0014\u0005\u0002\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u0017\u0005\t\u0000\u0000\u0017"+
		"\u0018\u0006\u0001\uffff\uffff\u0000\u0018\u0019\u0005\u0012\u0000\u0000"+
		"\u0019\u001a\u0006\u0001\uffff\uffff\u0000\u001a\u001c\u0001\u0000\u0000"+
		"\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000 !\u0005\u0003\u0000\u0000!\'\u0006\u0002\uffff\uffff\u0000\"#\u0005"+
		"\u0004\u0000\u0000#\'\u0006\u0002\uffff\uffff\u0000$%\u0005\u0005\u0000"+
		"\u0000%\'\u0006\u0002\uffff\uffff\u0000& \u0001\u0000\u0000\u0000&\"\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'\u0005\u0001\u0000\u0000"+
		"\u0000(+\u0003\b\u0004\u0000)+\u0003\u000e\u0007\u0000*(\u0001\u0000\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0007\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000/0\u0005\u0006\u0000\u000001\u0005\u0015\u0000"+
		"\u000012\u0003\n\u0005\u000023\u0005\u0016\u0000\u000034\u0005\u0013\u0000"+
		"\u000045\u0003\u0006\u0003\u00005;\u0005\u0014\u0000\u000067\u0005\u0007"+
		"\u0000\u000078\u0005\u0013\u0000\u000089\u0003\u0006\u0003\u00009:\u0005"+
		"\u0014\u0000\u0000:<\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000"+
		"\u0000>?\u0005\r\u0000\u0000?@\u0007\u0000\u0000\u0000@\u000b\u0001\u0000"+
		"\u0000\u0000AB\u0005\b\u0000\u0000BC\u0005\u0015\u0000\u0000CD\u0003\n"+
		"\u0005\u0000DE\u0005\u0016\u0000\u0000EF\u0005\u0013\u0000\u0000FG\u0003"+
		"\u0006\u0003\u0000GH\u0005\u0014\u0000\u0000H\r\u0001\u0000\u0000\u0000"+
		"IJ\u0005\t\u0000\u0000JK\u0006\u0007\uffff\uffff\u0000KL\u0005\u0012\u0000"+
		"\u0000L\u000f\u0001\u0000\u0000\u0000\u0005\u001d&*,;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}