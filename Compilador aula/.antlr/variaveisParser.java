// Generated from c:/Users/Nicolas Ferreira/Documents/Compilador aula/variaveis.g4 by ANTLR 4.13.1

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
public class variaveisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, NUM=9, OPREL=10, 
		PV=11, AC=12, FC=13, AP=14, FP=15, Op_atrib=16, WS=17;
	public static final int
		RULE_vai = 0, RULE_declvar = 1, RULE_tipo = 2, RULE_cmd = 3, RULE_cond = 4, 
		RULE_comp = 5, RULE_atrib = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"vai", "declvar", "tipo", "cmd", "cond", "comp", "atrib"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'natural'", "'texto'", "'decimal'", "'se'", 
			"'senao'", null, null, null, "';'", "'{'", "'}'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "NUM", "OPREL", 
			"PV", "AC", "FC", "AP", "FP", "Op_atrib", "WS"
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
	public String getGrammarFileName() { return "variaveis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Variavel novaVariavel = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		int escopo;
		int tipo;
		String nome;

	public variaveisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VaiContext extends ParserRuleContext {
		public List<DeclvarContext> declvar() {
			return getRuleContexts(DeclvarContext.class);
		}
		public DeclvarContext declvar(int i) {
			return getRuleContext(DeclvarContext.class,i);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public VaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterVai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitVai(this);
		}
	}

	public final VaiContext vai() throws RecognitionException {
		VaiContext _localctx = new VaiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 escopo = 0;
			setState(15);
			declvar();
			setState(16);
			match(T__0);
			 escopo = 1;
			setState(18);
			declvar();
			setState(19);
			cmd();
			setState(20);
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
	public static class DeclvarContext extends ParserRuleContext {
		public Token ID;
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(variaveisParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(variaveisParser.ID, i);
		}
		public List<TerminalNode> PV() { return getTokens(variaveisParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(variaveisParser.PV, i);
		}
		public DeclvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterDeclvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitDeclvar(this);
		}
	}

	public final DeclvarContext declvar() throws RecognitionException {
		DeclvarContext _localctx = new DeclvarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declvar);
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
				setState(22);
				tipo();
				setState(23);
				((DeclvarContext)_localctx).ID = match(ID);
				 novaVariavel = new Variavel((((DeclvarContext)_localctx).ID!=null?((DeclvarContext)_localctx).ID.getText():null), tipo, escopo);
				                     boolean declarado = cv.adiciona(novaVariavel);
									 if(!declarado){
									    System.err.println("Variavel "+(((DeclvarContext)_localctx).ID!=null?((DeclvarContext)_localctx).ID.getText():null)+" ja foi declarada!!!");
									    System.exit(0);
									 }
								   
				setState(25);
				match(PV);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitTipo(this);
		}
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
				}
				break;
			case T__3:
				{
				setState(34);
				match(T__3);
				tipo = 1;
				}
				break;
			case T__4:
				{
				setState(36);
				match(T__4);
				tipo = 2;
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
	public static class CmdContext extends ParserRuleContext {
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
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
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
		public TerminalNode AP() { return getToken(variaveisParser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(variaveisParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(variaveisParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(variaveisParser.AC, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(variaveisParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(variaveisParser.FC, i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitCond(this);
		}
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
			match(AP);
			setState(49);
			comp();
			setState(50);
			match(FP);
			setState(51);
			match(AC);
			setState(52);
			cmd();
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
				cmd();
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
		public TerminalNode OPREL() { return getToken(variaveisParser.OPREL, 0); }
		public List<TerminalNode> ID() { return getTokens(variaveisParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(variaveisParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(variaveisParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(variaveisParser.NUM, i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitComp(this);
		}
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
	public static class AtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(variaveisParser.ID, 0); }
		public TerminalNode PV() { return getToken(variaveisParser.PV, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
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
		"\u0004\u0001\u0011E\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c"+
		"\b\u0001\n\u0001\f\u0001\u001f\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003+\b\u0003\n\u0003\f\u0003.\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"<\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u0000\u0001\u0001\u0000\b\tC\u0000\u000e\u0001\u0000\u0000"+
		"\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000"+
		"\u0006,\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n=\u0001\u0000"+
		"\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000e\u000f\u0006\u0000\uffff"+
		"\uffff\u0000\u000f\u0010\u0003\u0002\u0001\u0000\u0010\u0011\u0005\u0001"+
		"\u0000\u0000\u0011\u0012\u0006\u0000\uffff\uffff\u0000\u0012\u0013\u0003"+
		"\u0002\u0001\u0000\u0013\u0014\u0003\u0006\u0003\u0000\u0014\u0015\u0005"+
		"\u0002\u0000\u0000\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0003"+
		"\u0004\u0002\u0000\u0017\u0018\u0005\b\u0000\u0000\u0018\u0019\u0006\u0001"+
		"\uffff\uffff\u0000\u0019\u001a\u0005\u000b\u0000\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0016\u0001\u0000\u0000\u0000\u001c\u001f\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000 !\u0005\u0003\u0000\u0000!\'\u0006\u0002\uffff\uffff"+
		"\u0000\"#\u0005\u0004\u0000\u0000#\'\u0006\u0002\uffff\uffff\u0000$%\u0005"+
		"\u0005\u0000\u0000%\'\u0006\u0002\uffff\uffff\u0000& \u0001\u0000\u0000"+
		"\u0000&\"\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'\u0005\u0001"+
		"\u0000\u0000\u0000(+\u0003\b\u0004\u0000)+\u0003\f\u0006\u0000*(\u0001"+
		"\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0007\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0006\u0000\u000001\u0005"+
		"\u000e\u0000\u000012\u0003\n\u0005\u000023\u0005\u000f\u0000\u000034\u0005"+
		"\f\u0000\u000045\u0003\u0006\u0003\u00005;\u0005\r\u0000\u000067\u0005"+
		"\u0007\u0000\u000078\u0005\f\u0000\u000089\u0003\u0006\u0003\u00009:\u0005"+
		"\r\u0000\u0000:<\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000"+
		">?\u0005\n\u0000\u0000?@\u0007\u0000\u0000\u0000@\u000b\u0001\u0000\u0000"+
		"\u0000AB\u0005\b\u0000\u0000BC\u0005\u000b\u0000\u0000C\r\u0001\u0000"+
		"\u0000\u0000\u0005\u001d&*,;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}