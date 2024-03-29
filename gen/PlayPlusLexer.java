// Generated from C:/Users/guill/IdeaProjects/2122_IHDCB332_G10/src/main/antlr4/tmp\PlayPlus.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTAIRES=1, NEWLINE=2, WS=3, AS=4, AMPERSTAND=5, AND=6, BAREL=7, BOOLEAN=8, 
		BRIDGE=9, BUSH=10, CHAR=11, CONST=12, DIG=13, DO=14, DOWN=15, ELSE=16, 
		EMPTY=17, END=18, ENUM=19, FALSE=20, FIGHT=21, FOR=22, FUNCTION=23, GRASS=24, 
		IF=25, IMPORT=26, INTEGER=27, JUMP=28, LEFT=29, MAIN=30, MAP=31, NOT=32, 
		OR=33, PALM=34, RECORD=35, REPEAT=36, RIGHT=37, ROBOT=38, SKULL=39, THEN=40, 
		TREASURE=41, TO=42, TRUE=43, UP=44, UNTIL=45, VOID=46, WELL=47, WHILE=48, 
		ASSIGN=49, SMALEQ=50, BIGGEQ=51, DIFFERENT=52, BIGGER=53, SMALLER=54, 
		BY=55, TIME=56, PERCENT=57, MINUS=58, PLUS=59, EQUAL=60, LBRACKET=61, 
		RBRACKET=62, LPAR=63, RPAR=64, BACKSLASH=65, DQUOTE=66, QUOTE=67, COLON=68, 
		COMMA=69, DOT=70, SEMICOLON=71, ID=72, ENTIER=73, STRING=74;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENTAIRES", "NEWLINE", "WS", "AS", "AMPERSTAND", "AND", "BAREL", 
			"BOOLEAN", "BRIDGE", "BUSH", "CHAR", "CONST", "DIG", "DO", "DOWN", "ELSE", 
			"EMPTY", "END", "ENUM", "FALSE", "FIGHT", "FOR", "FUNCTION", "GRASS", 
			"IF", "IMPORT", "INTEGER", "JUMP", "LEFT", "MAIN", "MAP", "NOT", "OR", 
			"PALM", "RECORD", "REPEAT", "RIGHT", "ROBOT", "SKULL", "THEN", "TREASURE", 
			"TO", "TRUE", "UP", "UNTIL", "VOID", "WELL", "WHILE", "ASSIGN", "SMALEQ", 
			"BIGGEQ", "DIFFERENT", "BIGGER", "SMALLER", "BY", "TIME", "PERCENT", 
			"MINUS", "PLUS", "EQUAL", "LBRACKET", "RBRACKET", "LPAR", "RPAR", "BACKSLASH", 
			"DQUOTE", "QUOTE", "COLON", "COMMA", "DOT", "SEMICOLON", "ID", "ENTIER", 
			"LETTER", "CHIFFRE", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'as'", "'&'", "'and'", "'T'", "'boolean'", "'A'", 
			"'B'", "'char'", "'const'", "'dig'", "'do'", "'down'", "'else'", "'_'", 
			"'end'", "'enum'", "'false'", "'fight'", "'for'", "'function'", "'G'", 
			"'if'", "'#import'", "'integer'", "'jump'", "'left'", "'main'", "'map:'", 
			"'not'", "'or'", "'P'", "'record'", "'repeat'", "'right'", "'@'", "'Q'", 
			"'then'", "'X'", "'to'", "'true'", "'up'", "'until'", "'void'", "'S'", 
			"'while'", null, "'<='", "'>='", "'<>'", "'>'", "'<'", "'/'", "'*'", 
			"'%'", "'-'", "'+'", "'='", "'['", "']'", "'('", "')'", "'\\'", "'\"'", 
			"'''", "':'", "','", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENTAIRES", "NEWLINE", "WS", "AS", "AMPERSTAND", "AND", "BAREL", 
			"BOOLEAN", "BRIDGE", "BUSH", "CHAR", "CONST", "DIG", "DO", "DOWN", "ELSE", 
			"EMPTY", "END", "ENUM", "FALSE", "FIGHT", "FOR", "FUNCTION", "GRASS", 
			"IF", "IMPORT", "INTEGER", "JUMP", "LEFT", "MAIN", "MAP", "NOT", "OR", 
			"PALM", "RECORD", "REPEAT", "RIGHT", "ROBOT", "SKULL", "THEN", "TREASURE", 
			"TO", "TRUE", "UP", "UNTIL", "VOID", "WELL", "WHILE", "ASSIGN", "SMALEQ", 
			"BIGGEQ", "DIFFERENT", "BIGGER", "SMALLER", "BY", "TIME", "PERCENT", 
			"MINUS", "PLUS", "EQUAL", "LBRACKET", "RBRACKET", "LPAR", "RPAR", "BACKSLASH", 
			"DQUOTE", "QUOTE", "COLON", "COMMA", "DOT", "SEMICOLON", "ID", "ENTIER", 
			"STRING"
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


	public PlayPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u01da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\7\2\u00a0\n\2\f\2\16\2\u00a3"+
		"\13\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00ab\n\2\f\2\16\2\u00ae\13\2\3\2\5"+
		"\2\u00b1\n\2\3\2\5\2\u00b4\n\2\3\2\3\2\3\3\5\3\u00b9\n\3\3\3\3\3\3\3\3"+
		"\3\3\4\6\4\u00c0\n\4\r\4\16\4\u00c1\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3*"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G"+
		"\3G\3H\3H\3I\3I\3I\7I\u01c1\nI\fI\16I\u01c4\13I\3J\5J\u01c7\nJ\3J\6J\u01ca"+
		"\nJ\rJ\16J\u01cb\3K\3K\3L\3L\3M\3M\7M\u01d4\nM\fM\16M\u01d7\13M\3M\3M"+
		"\4\u00a1\u00ac\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095\2\u0097\2\u0099L\3\2\5\4\2"+
		"\13\13\"\"\4\2C\\c|\6\2\f\f\17\17..^^\2\u01e2\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0099\3\2\2\2\3\u00b3\3\2\2\2\5\u00b8\3\2\2"+
		"\2\7\u00bf\3\2\2\2\t\u00c5\3\2\2\2\13\u00c8\3\2\2\2\r\u00ca\3\2\2\2\17"+
		"\u00ce\3\2\2\2\21\u00d0\3\2\2\2\23\u00d8\3\2\2\2\25\u00da\3\2\2\2\27\u00dc"+
		"\3\2\2\2\31\u00e1\3\2\2\2\33\u00e7\3\2\2\2\35\u00eb\3\2\2\2\37\u00ee\3"+
		"\2\2\2!\u00f3\3\2\2\2#\u00f8\3\2\2\2%\u00fa\3\2\2\2\'\u00fe\3\2\2\2)\u0103"+
		"\3\2\2\2+\u0109\3\2\2\2-\u010f\3\2\2\2/\u0113\3\2\2\2\61\u011c\3\2\2\2"+
		"\63\u011e\3\2\2\2\65\u0121\3\2\2\2\67\u0129\3\2\2\29\u0131\3\2\2\2;\u0136"+
		"\3\2\2\2=\u013b\3\2\2\2?\u0140\3\2\2\2A\u0145\3\2\2\2C\u0149\3\2\2\2E"+
		"\u014c\3\2\2\2G\u014e\3\2\2\2I\u0155\3\2\2\2K\u015c\3\2\2\2M\u0162\3\2"+
		"\2\2O\u0164\3\2\2\2Q\u0166\3\2\2\2S\u016b\3\2\2\2U\u016d\3\2\2\2W\u0170"+
		"\3\2\2\2Y\u0175\3\2\2\2[\u0178\3\2\2\2]\u017e\3\2\2\2_\u0183\3\2\2\2a"+
		"\u0185\3\2\2\2c\u018b\3\2\2\2e\u018e\3\2\2\2g\u0191\3\2\2\2i\u0194\3\2"+
		"\2\2k\u0197\3\2\2\2m\u0199\3\2\2\2o\u019b\3\2\2\2q\u019d\3\2\2\2s\u019f"+
		"\3\2\2\2u\u01a1\3\2\2\2w\u01a3\3\2\2\2y\u01a5\3\2\2\2{\u01a7\3\2\2\2}"+
		"\u01a9\3\2\2\2\177\u01ab\3\2\2\2\u0081\u01ad\3\2\2\2\u0083\u01af\3\2\2"+
		"\2\u0085\u01b1\3\2\2\2\u0087\u01b3\3\2\2\2\u0089\u01b5\3\2\2\2\u008b\u01b7"+
		"\3\2\2\2\u008d\u01b9\3\2\2\2\u008f\u01bb\3\2\2\2\u0091\u01bd\3\2\2\2\u0093"+
		"\u01c6\3\2\2\2\u0095\u01cd\3\2\2\2\u0097\u01cf\3\2\2\2\u0099\u01d1\3\2"+
		"\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7,\2\2\u009d\u00a1\3\2\2\2\u009e"+
		"\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7,\2\2\u00a5\u00b4\7\61\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\7"+
		"\61\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\13\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\7\17\2\2\u00b0\u00af\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\f\2\2\u00b3\u009b\3\2"+
		"\2\2\u00b3\u00a6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\2\2\2\u00b6"+
		"\4\3\2\2\2\u00b7\u00b9\7\17\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2"+
		"\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\b\3\2\2\u00bd\6\3\2\2\2\u00be\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\b\4\2\2\u00c4\b\3\2\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\n\3\2\2\2\u00c8\u00c9\7(\2\2\u00c9\f\3\2\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2\u00cd\16\3\2\2\2\u00ce\u00cf"+
		"\7V\2\2\u00cf\20\3\2\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7p\2\2\u00d7\22\3\2\2\2\u00d8\u00d9\7C\2\2\u00d9\24\3\2\2\2\u00da"+
		"\u00db\7D\2\2\u00db\26\3\2\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7j\2\2\u00de"+
		"\u00df\7c\2\2\u00df\u00e0\7t\2\2\u00e0\30\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2"+
		"\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7v\2\2"+
		"\u00e6\32\3\2\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7"+
		"i\2\2\u00ea\34\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7q\2\2\u00ed\36"+
		"\3\2\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7y\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2 \3\2\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7n\2\2\u00f5"+
		"\u00f6\7u\2\2\u00f6\u00f7\7g\2\2\u00f7\"\3\2\2\2\u00f8\u00f9\7a\2\2\u00f9"+
		"$\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7f\2\2\u00fd"+
		"&\3\2\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7w\2\2\u0101"+
		"\u0102\7o\2\2\u0102(\3\2\2\2\u0103\u0104\7h\2\2\u0104\u0105\7c\2\2\u0105"+
		"\u0106\7n\2\2\u0106\u0107\7u\2\2\u0107\u0108\7g\2\2\u0108*\3\2\2\2\u0109"+
		"\u010a\7h\2\2\u010a\u010b\7k\2\2\u010b\u010c\7i\2\2\u010c\u010d\7j\2\2"+
		"\u010d\u010e\7v\2\2\u010e,\3\2\2\2\u010f\u0110\7h\2\2\u0110\u0111\7q\2"+
		"\2\u0111\u0112\7t\2\2\u0112.\3\2\2\2\u0113\u0114\7h\2\2\u0114\u0115\7"+
		"w\2\2\u0115\u0116\7p\2\2\u0116\u0117\7e\2\2\u0117\u0118\7v\2\2\u0118\u0119"+
		"\7k\2\2\u0119\u011a\7q\2\2\u011a\u011b\7p\2\2\u011b\60\3\2\2\2\u011c\u011d"+
		"\7I\2\2\u011d\62\3\2\2\2\u011e\u011f\7k\2\2\u011f\u0120\7h\2\2\u0120\64"+
		"\3\2\2\2\u0121\u0122\7%\2\2\u0122\u0123\7k\2\2\u0123\u0124\7o\2\2\u0124"+
		"\u0125\7r\2\2\u0125\u0126\7q\2\2\u0126\u0127\7t\2\2\u0127\u0128\7v\2\2"+
		"\u0128\66\3\2\2\2\u0129\u012a\7k\2\2\u012a\u012b\7p\2\2\u012b\u012c\7"+
		"v\2\2\u012c\u012d\7g\2\2\u012d\u012e\7i\2\2\u012e\u012f\7g\2\2\u012f\u0130"+
		"\7t\2\2\u01308\3\2\2\2\u0131\u0132\7l\2\2\u0132\u0133\7w\2\2\u0133\u0134"+
		"\7o\2\2\u0134\u0135\7r\2\2\u0135:\3\2\2\2\u0136\u0137\7n\2\2\u0137\u0138"+
		"\7g\2\2\u0138\u0139\7h\2\2\u0139\u013a\7v\2\2\u013a<\3\2\2\2\u013b\u013c"+
		"\7o\2\2\u013c\u013d\7c\2\2\u013d\u013e\7k\2\2\u013e\u013f\7p\2\2\u013f"+
		">\3\2\2\2\u0140\u0141\7o\2\2\u0141\u0142\7c\2\2\u0142\u0143\7r\2\2\u0143"+
		"\u0144\7<\2\2\u0144@\3\2\2\2\u0145\u0146\7p\2\2\u0146\u0147\7q\2\2\u0147"+
		"\u0148\7v\2\2\u0148B\3\2\2\2\u0149\u014a\7q\2\2\u014a\u014b\7t\2\2\u014b"+
		"D\3\2\2\2\u014c\u014d\7R\2\2\u014dF\3\2\2\2\u014e\u014f\7t\2\2\u014f\u0150"+
		"\7g\2\2\u0150\u0151\7e\2\2\u0151\u0152\7q\2\2\u0152\u0153\7t\2\2\u0153"+
		"\u0154\7f\2\2\u0154H\3\2\2\2\u0155\u0156\7t\2\2\u0156\u0157\7g\2\2\u0157"+
		"\u0158\7r\2\2\u0158\u0159\7g\2\2\u0159\u015a\7c\2\2\u015a\u015b\7v\2\2"+
		"\u015bJ\3\2\2\2\u015c\u015d\7t\2\2\u015d\u015e\7k\2\2\u015e\u015f\7i\2"+
		"\2\u015f\u0160\7j\2\2\u0160\u0161\7v\2\2\u0161L\3\2\2\2\u0162\u0163\7"+
		"B\2\2\u0163N\3\2\2\2\u0164\u0165\7S\2\2\u0165P\3\2\2\2\u0166\u0167\7v"+
		"\2\2\u0167\u0168\7j\2\2\u0168\u0169\7g\2\2\u0169\u016a\7p\2\2\u016aR\3"+
		"\2\2\2\u016b\u016c\7Z\2\2\u016cT\3\2\2\2\u016d\u016e\7v\2\2\u016e\u016f"+
		"\7q\2\2\u016fV\3\2\2\2\u0170\u0171\7v\2\2\u0171\u0172\7t\2\2\u0172\u0173"+
		"\7w\2\2\u0173\u0174\7g\2\2\u0174X\3\2\2\2\u0175\u0176\7w\2\2\u0176\u0177"+
		"\7r\2\2\u0177Z\3\2\2\2\u0178\u0179\7w\2\2\u0179\u017a\7p\2\2\u017a\u017b"+
		"\7v\2\2\u017b\u017c\7k\2\2\u017c\u017d\7n\2\2\u017d\\\3\2\2\2\u017e\u017f"+
		"\7x\2\2\u017f\u0180\7q\2\2\u0180\u0181\7k\2\2\u0181\u0182\7f\2\2\u0182"+
		"^\3\2\2\2\u0183\u0184\7U\2\2\u0184`\3\2\2\2\u0185\u0186\7y\2\2\u0186\u0187"+
		"\7j\2\2\u0187\u0188\7k\2\2\u0188\u0189\7n\2\2\u0189\u018a\7g\2\2\u018a"+
		"b\3\2\2\2\u018b\u018c\7<\2\2\u018c\u018d\7?\2\2\u018dd\3\2\2\2\u018e\u018f"+
		"\7>\2\2\u018f\u0190\7?\2\2\u0190f\3\2\2\2\u0191\u0192\7@\2\2\u0192\u0193"+
		"\7?\2\2\u0193h\3\2\2\2\u0194\u0195\7>\2\2\u0195\u0196\7@\2\2\u0196j\3"+
		"\2\2\2\u0197\u0198\7@\2\2\u0198l\3\2\2\2\u0199\u019a\7>\2\2\u019an\3\2"+
		"\2\2\u019b\u019c\7\61\2\2\u019cp\3\2\2\2\u019d\u019e\7,\2\2\u019er\3\2"+
		"\2\2\u019f\u01a0\7\'\2\2\u01a0t\3\2\2\2\u01a1\u01a2\7/\2\2\u01a2v\3\2"+
		"\2\2\u01a3\u01a4\7-\2\2\u01a4x\3\2\2\2\u01a5\u01a6\7?\2\2\u01a6z\3\2\2"+
		"\2\u01a7\u01a8\7]\2\2\u01a8|\3\2\2\2\u01a9\u01aa\7_\2\2\u01aa~\3\2\2\2"+
		"\u01ab\u01ac\7*\2\2\u01ac\u0080\3\2\2\2\u01ad\u01ae\7+\2\2\u01ae\u0082"+
		"\3\2\2\2\u01af\u01b0\7^\2\2\u01b0\u0084\3\2\2\2\u01b1\u01b2\7$\2\2\u01b2"+
		"\u0086\3\2\2\2\u01b3\u01b4\7)\2\2\u01b4\u0088\3\2\2\2\u01b5\u01b6\7<\2"+
		"\2\u01b6\u008a\3\2\2\2\u01b7\u01b8\7.\2\2\u01b8\u008c\3\2\2\2\u01b9\u01ba"+
		"\7\60\2\2\u01ba\u008e\3\2\2\2\u01bb\u01bc\7=\2\2\u01bc\u0090\3\2\2\2\u01bd"+
		"\u01c2\5\u0095K\2\u01be\u01c1\5\u0095K\2\u01bf\u01c1\5\u0097L\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c2\u01c3\3\2\2\2\u01c3\u0092\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01c7\5u;\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2"+
		"\2\u01c8\u01ca\5\u0097L\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u0094\3\2\2\2\u01cd\u01ce\t\3"+
		"\2\2\u01ce\u0096\3\2\2\2\u01cf\u01d0\4\62;\2\u01d0\u0098\3\2\2\2\u01d1"+
		"\u01d5\7$\2\2\u01d2\u01d4\n\4\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2"+
		"\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01d9\7$\2\2\u01d9\u009a\3\2\2\2\16\2\u00a1\u00ac"+
		"\u00b0\u00b3\u00b8\u00c1\u01c0\u01c2\u01c6\u01cb\u01d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}