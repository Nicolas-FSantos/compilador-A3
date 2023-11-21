// Generated from c:/Users/Nicolas Ferreira/Documents/Compilador aula/variaveis_2 (1).g4 by ANTLR 4.13.1

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
public class variaveis_2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, NUM=9, OPREL=10, 
		PV=11, AC=12, FC=13, AP=14, FP=15, Op_atrib=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "NUM", 
			"OPREL", "PV", "AC", "FC", "AP", "FP", "Op_atrib", "WS"
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


		Variavel novaVariavel = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		String codigoJava = "";
		int escopo;
		int tipo;
		String nome;


	public variaveis_2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "variaveis_2 (1).g4"; }

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
		"\u0004\u0000\u0011u\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007O\b"+
		"\u0007\u000b\u0007\f\u0007P\u0001\b\u0004\bT\b\b\u000b\b\f\bU\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\ta\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010p\b\u0010\u000b\u0010\f\u0010q\u0001\u0010\u0001\u0010\u0000"+
		"\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0004\u0002\u0000AZ"+
		"az\u0001\u000009\u0002\u0000<<>>\u0003\u0000\t\n\r\r  {\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0001#\u0001\u0000\u0000\u0000\u0003*\u0001\u0000\u0000\u0000\u0005."+
		"\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000\u0000\t<\u0001\u0000"+
		"\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000"+
		"\u000fN\u0001\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013`"+
		"\u0001\u0000\u0000\u0000\u0015b\u0001\u0000\u0000\u0000\u0017d\u0001\u0000"+
		"\u0000\u0000\u0019f\u0001\u0000\u0000\u0000\u001bh\u0001\u0000\u0000\u0000"+
		"\u001dj\u0001\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000!o\u0001"+
		"\u0000\u0000\u0000#$\u0005i\u0000\u0000$%\u0005n\u0000\u0000%&\u0005i"+
		"\u0000\u0000&\'\u0005c\u0000\u0000\'(\u0005i\u0000\u0000()\u0005o\u0000"+
		"\u0000)\u0002\u0001\u0000\u0000\u0000*+\u0005f\u0000\u0000+,\u0005i\u0000"+
		"\u0000,-\u0005m\u0000\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005n\u0000"+
		"\u0000/0\u0005a\u0000\u000001\u0005t\u0000\u000012\u0005u\u0000\u0000"+
		"23\u0005r\u0000\u000034\u0005a\u0000\u000045\u0005l\u0000\u00005\u0006"+
		"\u0001\u0000\u0000\u000067\u0005t\u0000\u000078\u0005e\u0000\u000089\u0005"+
		"x\u0000\u00009:\u0005t\u0000\u0000:;\u0005o\u0000\u0000;\b\u0001\u0000"+
		"\u0000\u0000<=\u0005d\u0000\u0000=>\u0005e\u0000\u0000>?\u0005c\u0000"+
		"\u0000?@\u0005i\u0000\u0000@A\u0005m\u0000\u0000AB\u0005a\u0000\u0000"+
		"BC\u0005l\u0000\u0000C\n\u0001\u0000\u0000\u0000DE\u0005s\u0000\u0000"+
		"EF\u0005e\u0000\u0000F\f\u0001\u0000\u0000\u0000GH\u0005s\u0000\u0000"+
		"HI\u0005e\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005a\u0000\u0000KL\u0005"+
		"o\u0000\u0000L\u000e\u0001\u0000\u0000\u0000MO\u0007\u0000\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000RT\u0007"+
		"\u0001\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0012\u0001\u0000"+
		"\u0000\u0000Wa\u0007\u0002\u0000\u0000XY\u0005>\u0000\u0000Ya\u0005=\u0000"+
		"\u0000Z[\u0005<\u0000\u0000[a\u0005=\u0000\u0000\\]\u0005=\u0000\u0000"+
		"]a\u0005=\u0000\u0000^_\u0005!\u0000\u0000_a\u0005=\u0000\u0000`W\u0001"+
		"\u0000\u0000\u0000`X\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000"+
		"`\\\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000a\u0014\u0001\u0000"+
		"\u0000\u0000bc\u0005;\u0000\u0000c\u0016\u0001\u0000\u0000\u0000de\u0005"+
		"{\u0000\u0000e\u0018\u0001\u0000\u0000\u0000fg\u0005}\u0000\u0000g\u001a"+
		"\u0001\u0000\u0000\u0000hi\u0005(\u0000\u0000i\u001c\u0001\u0000\u0000"+
		"\u0000jk\u0005)\u0000\u0000k\u001e\u0001\u0000\u0000\u0000lm\u0005=\u0000"+
		"\u0000m \u0001\u0000\u0000\u0000np\u0007\u0003\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0006\u0010\u0000\u0000"+
		"t\"\u0001\u0000\u0000\u0000\u0005\u0000PU`q\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}