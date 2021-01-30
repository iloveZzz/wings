// Generated from C:/Users/Administrator/Documents/wings/wings-framework/wings-antlr4-sql/src/main/resources\SearchLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SearchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_ESSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, MINUS=5, 
		STAR=6, COLON=7, EQ=8, NE=9, BOOLOR=10, BOOLAND=11, DOT=12, LBRACKET=13, 
		RBRACKET=14, LPAREN=15, RPAREN=16, COMMA=17, SEMI=18, GT=19, AFTER=20, 
		SINGLE_QUOTE=21, DOUBLE_QUOTE=22, REVERSE_QUOTE=23, UNDERLINE=24, CHINESE=25, 
		ID=26, INT=27, FLOAT=28, DOTINTEGER=29, DOTID=30;
	public static final int
		ESQLCOMMENT=2, ERRORCHANNEL=3;
	public static final int
		AFTER_DOT=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "ESQLCOMMENT", "ERRORCHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "AFTER_DOT"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "SPEC_ESSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", "MINUS", 
			"STAR", "COLON", "EQ", "NE", "BOOLOR", "BOOLAND", "DOT", "LBRACKET", 
			"RBRACKET", "LPAREN", "RPAREN", "COMMA", "SEMI", "GT", "AFTER", "SINGLE_QUOTE", 
			"DOUBLE_QUOTE", "REVERSE_QUOTE", "UNDERLINE", "CHINESE", "ID", "INT", 
			"FLOAT", "DEC_DIGIT", "ID_LETTER", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z", "DOTINTEGER", "DOTID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'-'", "'*'", null, "'='", "'!='", null, 
			null, "'.'", "'['", "']'", "'('", "')'", null, "';'", "'>'", null, "'''", 
			"'\"'", "'`'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_ESSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"MINUS", "STAR", "COLON", "EQ", "NE", "BOOLOR", "BOOLAND", "DOT", "LBRACKET", 
			"RBRACKET", "LPAREN", "RPAREN", "COMMA", "SEMI", "GT", "AFTER", "SINGLE_QUOTE", 
			"DOUBLE_QUOTE", "REVERSE_QUOTE", "UNDERLINE", "CHINESE", "ID", "INT", 
			"FLOAT", "DOTINTEGER", "DOTID"
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


	public SearchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SearchLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0172\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\6\2z\n"+
		"\2\r\2\16\2{\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3\u0085\n\3\r\3\16\3\u0086"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0092\n\4\f\4\16\4\u0095\13\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00a0\n\5\3\5\7\5\u00a3\n\5\f"+
		"\5\16\5\u00a6\13\5\3\5\5\5\u00a9\n\5\3\5\3\5\5\5\u00ad\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00b3\n\5\3\5\3\5\5\5\u00b7\n\5\5\5\u00b9\n\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u00cb\n\13\3"+
		"\f\3\f\3\f\3\f\5\f\u00d1\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u00ff\n\33\r\33\16\33\u0100\3"+
		"\34\5\34\u0104\n\34\3\34\6\34\u0107\n\34\r\34\16\34\u0108\3\35\5\35\u010c"+
		"\n\35\3\35\6\35\u010f\n\35\r\35\16\35\u0110\3\35\3\35\6\35\u0115\n\35"+
		"\r\35\16\35\u0116\3\35\5\35\u011a\n\35\3\35\3\35\6\35\u011e\n\35\r\35"+
		"\16\35\u011f\5\35\u0122\n\35\3\36\3\36\3\37\3\37\5\37\u0128\n\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\7:\u0161\n:\f"+
		":\16:\u0164\13:\5:\u0166\n:\3:\3:\3;\3;\7;\u016c\n;\f;\16;\u016f\13;\3"+
		";\3;\4\u0086\u0093\2<\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30"+
		"\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33"+
		"\66\348\35:\36<\2>\2@\2B\2D\2F\2H\2J\2L\2N\2P\2R\2T\2V\2X\2Z\2\\\2^\2"+
		"`\2b\2d\2f\2h\2j\2l\2n\2p\2r\2t\37v \4\2\3%\5\2\13\f\17\17\"\"\4\2\f\f"+
		"\17\17\4\2<<\uff1c\uff1c\4\2..\uff0e\uff0e\3\2\62;\4\2C\\c|\4\2CCcc\4"+
		"\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLl"+
		"l\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2"+
		"UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\63"+
		";\5\2C\\aac|\6\2\62;C\\aac|\2\u0177\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2"+
		"\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2"+
		"\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2"+
		"\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3"+
		"\2\2\2\28\3\2\2\2\2:\3\2\2\2\3t\3\2\2\2\3v\3\2\2\2\4y\3\2\2\2\6\177\3"+
		"\2\2\2\b\u008d\3\2\2\2\n\u00b8\3\2\2\2\f\u00bc\3\2\2\2\16\u00be\3\2\2"+
		"\2\20\u00c0\3\2\2\2\22\u00c2\3\2\2\2\24\u00c4\3\2\2\2\26\u00ca\3\2\2\2"+
		"\30\u00d0\3\2\2\2\32\u00d2\3\2\2\2\34\u00d6\3\2\2\2\36\u00d8\3\2\2\2 "+
		"\u00da\3\2\2\2\"\u00dc\3\2\2\2$\u00de\3\2\2\2&\u00e0\3\2\2\2(\u00e2\3"+
		"\2\2\2*\u00e4\3\2\2\2,\u00ea\3\2\2\2.\u00ec\3\2\2\2\60\u00ee\3\2\2\2\62"+
		"\u00f0\3\2\2\2\64\u00f2\3\2\2\2\66\u00fe\3\2\2\28\u0103\3\2\2\2:\u0121"+
		"\3\2\2\2<\u0123\3\2\2\2>\u0127\3\2\2\2@\u0129\3\2\2\2B\u012b\3\2\2\2D"+
		"\u012d\3\2\2\2F\u012f\3\2\2\2H\u0131\3\2\2\2J\u0133\3\2\2\2L\u0135\3\2"+
		"\2\2N\u0137\3\2\2\2P\u0139\3\2\2\2R\u013b\3\2\2\2T\u013d\3\2\2\2V\u013f"+
		"\3\2\2\2X\u0141\3\2\2\2Z\u0143\3\2\2\2\\\u0145\3\2\2\2^\u0147\3\2\2\2"+
		"`\u0149\3\2\2\2b\u014b\3\2\2\2d\u014d\3\2\2\2f\u014f\3\2\2\2h\u0151\3"+
		"\2\2\2j\u0153\3\2\2\2l\u0155\3\2\2\2n\u0157\3\2\2\2p\u0159\3\2\2\2r\u015b"+
		"\3\2\2\2t\u0165\3\2\2\2v\u0169\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{"+
		"y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\2\2\2~\5\3\2\2\2\177\u0080\7\61\2\2"+
		"\u0080\u0081\7,\2\2\u0081\u0082\7#\2\2\u0082\u0084\3\2\2\2\u0083\u0085"+
		"\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7,\2\2\u0089\u008a"+
		"\7\61\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\3\3\2\u008c\7\3\2\2\2\u008d"+
		"\u008e\7\61\2\2\u008e\u008f\7,\2\2\u008f\u0093\3\2\2\2\u0090\u0092\13"+
		"\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7,"+
		"\2\2\u0097\u0098\7\61\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\4\2\2\u009a"+
		"\t\3\2\2\2\u009b\u009c\7/\2\2\u009c\u009d\7/\2\2\u009d\u00a0\7\"\2\2\u009e"+
		"\u00a0\7%\2\2\u009f\u009b\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a4\3\2"+
		"\2\2\u00a1\u00a3\n\3\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ac\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a9\7\17\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ad\7\f\2\2\u00ab\u00ad\7\2\2\3\u00ac\u00a8\3\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b9\3\2\2\2\u00ae\u00af\7/\2\2\u00af"+
		"\u00b0\7/\2\2\u00b0\u00b6\3\2\2\2\u00b1\u00b3\7\17\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\7\f\2\2\u00b5"+
		"\u00b7\7\2\2\3\u00b6\u00b2\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u009f\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\b\5\2\2\u00bb\13\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd\r\3\2\2\2\u00be"+
		"\u00bf\7,\2\2\u00bf\17\3\2\2\2\u00c0\u00c1\t\4\2\2\u00c1\21\3\2\2\2\u00c2"+
		"\u00c3\7?\2\2\u00c3\23\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\7?\2\2\u00c6"+
		"\25\3\2\2\2\u00c7\u00c8\7~\2\2\u00c8\u00cb\7~\2\2\u00c9\u00cb\7~\2\2\u00ca"+
		"\u00c7\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\7(\2\2"+
		"\u00cd\u00d1\7(\2\2\u00ce\u00d1\5$\22\2\u00cf\u00d1\7(\2\2\u00d0\u00cc"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\31\3\2\2\2\u00d2"+
		"\u00d3\7\60\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\r\4\2\u00d5\33\3\2\2"+
		"\2\u00d6\u00d7\7]\2\2\u00d7\35\3\2\2\2\u00d8\u00d9\7_\2\2\u00d9\37\3\2"+
		"\2\2\u00da\u00db\7*\2\2\u00db!\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd#\3\2\2"+
		"\2\u00de\u00df\t\5\2\2\u00df%\3\2\2\2\u00e0\u00e1\7=\2\2\u00e1\'\3\2\2"+
		"\2\u00e2\u00e3\7@\2\2\u00e3)\3\2\2\2\u00e4\u00e5\5@ \2\u00e5\u00e6\5J"+
		"%\2\u00e6\u00e7\5f\63\2\u00e7\u00e8\5H$\2\u00e8\u00e9\5b\61\2\u00e9+\3"+
		"\2\2\2\u00ea\u00eb\7)\2\2\u00eb-\3\2\2\2\u00ec\u00ed\7$\2\2\u00ed/\3\2"+
		"\2\2\u00ee\u00ef\7b\2\2\u00ef\61\3\2\2\2\u00f0\u00f1\7a\2\2\u00f1\63\3"+
		"\2\2\2\u00f2\u00f3\4\u4e02\u9fa7\2\u00f3\65\3\2\2\2\u00f4\u00ff\5\64\32"+
		"\2\u00f5\u00ff\5>\37\2\u00f6\u00ff\5\32\r\2\u00f7\u00ff\5\f\6\2\u00f8"+
		"\u00ff\5\62\31\2\u00f9\u00ff\58\34\2\u00fa\u00ff\5:\35\2\u00fb\u00ff\5"+
		"\60\30\2\u00fc\u00ff\5.\27\2\u00fd\u00ff\5,\26\2\u00fe\u00f4\3\2\2\2\u00fe"+
		"\u00f5\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00f8\3\2"+
		"\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\67\3\2\2\2\u0102\u0104\5\f\6\2\u0103\u0102"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\5<\36\2\u0106"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u01099\3\2\2\2\u010a\u010c\5\f\6\2\u010b\u010a\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\5<\36\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\5\32\r\2\u0113\u0115\5<\36\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0122\3\2"+
		"\2\2\u0118\u011a\5\f\6\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\5\32\r\2\u011c\u011e\5<\36\2\u011d\u011c\3"+
		"\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u010b\3\2\2\2\u0121\u0119\3\2\2\2\u0122;\3\2\2\2"+
		"\u0123\u0124\t\6\2\2\u0124=\3\2\2\2\u0125\u0128\t\7\2\2\u0126\u0128\5"+
		"\62\31\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128?\3\2\2\2\u0129"+
		"\u012a\t\b\2\2\u012aA\3\2\2\2\u012b\u012c\t\t\2\2\u012cC\3\2\2\2\u012d"+
		"\u012e\t\n\2\2\u012eE\3\2\2\2\u012f\u0130\t\13\2\2\u0130G\3\2\2\2\u0131"+
		"\u0132\t\f\2\2\u0132I\3\2\2\2\u0133\u0134\t\r\2\2\u0134K\3\2\2\2\u0135"+
		"\u0136\t\16\2\2\u0136M\3\2\2\2\u0137\u0138\t\17\2\2\u0138O\3\2\2\2\u0139"+
		"\u013a\t\20\2\2\u013aQ\3\2\2\2\u013b\u013c\t\21\2\2\u013cS\3\2\2\2\u013d"+
		"\u013e\t\22\2\2\u013eU\3\2\2\2\u013f\u0140\t\23\2\2\u0140W\3\2\2\2\u0141"+
		"\u0142\t\24\2\2\u0142Y\3\2\2\2\u0143\u0144\t\25\2\2\u0144[\3\2\2\2\u0145"+
		"\u0146\t\26\2\2\u0146]\3\2\2\2\u0147\u0148\t\27\2\2\u0148_\3\2\2\2\u0149"+
		"\u014a\t\30\2\2\u014aa\3\2\2\2\u014b\u014c\t\31\2\2\u014cc\3\2\2\2\u014d"+
		"\u014e\t\32\2\2\u014ee\3\2\2\2\u014f\u0150\t\33\2\2\u0150g\3\2\2\2\u0151"+
		"\u0152\t\34\2\2\u0152i\3\2\2\2\u0153\u0154\t\35\2\2\u0154k\3\2\2\2\u0155"+
		"\u0156\t\36\2\2\u0156m\3\2\2\2\u0157\u0158\t\37\2\2\u0158o\3\2\2\2\u0159"+
		"\u015a\t \2\2\u015aq\3\2\2\2\u015b\u015c\t!\2\2\u015cs\3\2\2\2\u015d\u0166"+
		"\7\62\2\2\u015e\u0162\t\"\2\2\u015f\u0161\t\6\2\2\u0160\u015f\3\2\2\2"+
		"\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0166"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u015d\3\2\2\2\u0165\u015e\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\b:\5\2\u0168u\3\2\2\2\u0169\u016d\t#\2\2\u016a"+
		"\u016c\t$\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0171\b;\5\2\u0171w\3\2\2\2\36\2\3{\u0086\u0093\u009f\u00a4\u00a8\u00ac"+
		"\u00b2\u00b6\u00b8\u00ca\u00d0\u00fe\u0100\u0103\u0108\u010b\u0110\u0116"+
		"\u0119\u011f\u0121\u0127\u0162\u0165\u016d\6\2\3\2\2\4\2\4\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}