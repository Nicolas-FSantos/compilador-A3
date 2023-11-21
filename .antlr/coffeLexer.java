// Generated from c:/Users/Nicolas Ferreira/Documents/antlr/Trabalho/coffe.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class coffeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, NUM=9, DEC=10, 
		STRING=11, OPREL=12, SOMA=13, SUB=14, MULT=15, DIV=16, PV=17, AC=18, FC=19, 
		AP=20, FP=21, Op_atrib=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "NUM", 
			"DEC", "STRING", "OPREL", "SOMA", "SUB", "MULT", "DIV", "PV", "AC", "FC", 
			"AP", "FP", "Op_atrib", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'natural'", "'texto'", "'decimal'", "'se'", 
			"'senao'", null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"';'", "'{'", "'}'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "NUM", "DEC", "STRING", 
			"OPREL", "SOMA", "SUB", "MULT", "DIV", "PV", "AC", "FC", "AP", "FP", 
			"Op_atrib", "WS"
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


		Variavel novaVariavel = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		String codigoJava = "";
		int escopo;
		int tipo;
		String nome;


	public coffeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "coffe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u009d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007"+
		"[\b\u0007\u000b\u0007\f\u0007\\\u0001\b\u0004\b`\b\b\u000b\b\f\ba\u0001"+
		"\t\u0004\te\b\t\u000b\t\f\tf\u0001\t\u0001\t\u0004\tk\b\t\u000b\t\f\t"+
		"l\u0001\n\u0001\n\u0005\nq\b\n\n\n\f\nt\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0081\b\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0004\u0016\u0098\b\u0016\u000b\u0016\f\u0016\u0099\u0001\u0016\u0001"+
		"\u0016\u0001r\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u0000"+
		"09\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u00a6\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u0003"+
		"6\u0001\u0000\u0000\u0000\u0005:\u0001\u0000\u0000\u0000\u0007B\u0001"+
		"\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000\u000bP\u0001\u0000\u0000"+
		"\u0000\rS\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000\u0011"+
		"_\u0001\u0000\u0000\u0000\u0013d\u0001\u0000\u0000\u0000\u0015n\u0001"+
		"\u0000\u0000\u0000\u0017\u0080\u0001\u0000\u0000\u0000\u0019\u0082\u0001"+
		"\u0000\u0000\u0000\u001b\u0084\u0001\u0000\u0000\u0000\u001d\u0086\u0001"+
		"\u0000\u0000\u0000\u001f\u0088\u0001\u0000\u0000\u0000!\u008a\u0001\u0000"+
		"\u0000\u0000#\u008c\u0001\u0000\u0000\u0000%\u008e\u0001\u0000\u0000\u0000"+
		"\'\u0090\u0001\u0000\u0000\u0000)\u0092\u0001\u0000\u0000\u0000+\u0094"+
		"\u0001\u0000\u0000\u0000-\u0097\u0001\u0000\u0000\u0000/0\u0005i\u0000"+
		"\u000001\u0005n\u0000\u000012\u0005i\u0000\u000023\u0005c\u0000\u0000"+
		"34\u0005i\u0000\u000045\u0005o\u0000\u00005\u0002\u0001\u0000\u0000\u0000"+
		"67\u0005f\u0000\u000078\u0005i\u0000\u000089\u0005m\u0000\u00009\u0004"+
		"\u0001\u0000\u0000\u0000:;\u0005n\u0000\u0000;<\u0005a\u0000\u0000<=\u0005"+
		"t\u0000\u0000=>\u0005u\u0000\u0000>?\u0005r\u0000\u0000?@\u0005a\u0000"+
		"\u0000@A\u0005l\u0000\u0000A\u0006\u0001\u0000\u0000\u0000BC\u0005t\u0000"+
		"\u0000CD\u0005e\u0000\u0000DE\u0005x\u0000\u0000EF\u0005t\u0000\u0000"+
		"FG\u0005o\u0000\u0000G\b\u0001\u0000\u0000\u0000HI\u0005d\u0000\u0000"+
		"IJ\u0005e\u0000\u0000JK\u0005c\u0000\u0000KL\u0005i\u0000\u0000LM\u0005"+
		"m\u0000\u0000MN\u0005a\u0000\u0000NO\u0005l\u0000\u0000O\n\u0001\u0000"+
		"\u0000\u0000PQ\u0005s\u0000\u0000QR\u0005e\u0000\u0000R\f\u0001\u0000"+
		"\u0000\u0000ST\u0005s\u0000\u0000TU\u0005e\u0000\u0000UV\u0005n\u0000"+
		"\u0000VW\u0005a\u0000\u0000WX\u0005o\u0000\u0000X\u000e\u0001\u0000\u0000"+
		"\u0000Y[\u0007\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0010"+
		"\u0001\u0000\u0000\u0000^`\u0007\u0001\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u0012\u0001\u0000\u0000\u0000ce\u0007\u0001\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0005.\u0000"+
		"\u0000ik\u0007\u0001\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0014"+
		"\u0001\u0000\u0000\u0000nr\u0005\"\u0000\u0000oq\t\u0000\u0000\u0000p"+
		"o\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000uv\u0005\"\u0000\u0000v\u0016\u0001\u0000\u0000\u0000w\u0081"+
		"\u0007\u0002\u0000\u0000xy\u0005>\u0000\u0000y\u0081\u0005=\u0000\u0000"+
		"z{\u0005<\u0000\u0000{\u0081\u0005=\u0000\u0000|}\u0005=\u0000\u0000}"+
		"\u0081\u0005=\u0000\u0000~\u007f\u0005!\u0000\u0000\u007f\u0081\u0005"+
		"=\u0000\u0000\u0080w\u0001\u0000\u0000\u0000\u0080x\u0001\u0000\u0000"+
		"\u0000\u0080z\u0001\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0081\u0018\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005+\u0000\u0000\u0083\u001a\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"-\u0000\u0000\u0085\u001c\u0001\u0000\u0000\u0000\u0086\u0087\u0005*\u0000"+
		"\u0000\u0087\u001e\u0001\u0000\u0000\u0000\u0088\u0089\u0005/\u0000\u0000"+
		"\u0089 \u0001\u0000\u0000\u0000\u008a\u008b\u0005;\u0000\u0000\u008b\""+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005{\u0000\u0000\u008d$\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005}\u0000\u0000\u008f&\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0005(\u0000\u0000\u0091(\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005)\u0000\u0000\u0093*\u0001\u0000\u0000\u0000\u0094\u0095\u0005="+
		"\u0000\u0000\u0095,\u0001\u0000\u0000\u0000\u0096\u0098\u0007\u0003\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0006\u0016\u0000"+
		"\u0000\u009c.\u0001\u0000\u0000\u0000\b\u0000\\aflr\u0080\u0099\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}