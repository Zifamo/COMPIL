/* The following code was generated by JFlex 1.7.0 */

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>exo.lex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\62\1\62\1\63\1\63\1\62\22\0\1\57\1\0\1\7"+
    "\11\0\1\3\1\53\1\1\1\0\2\51\1\54\1\55\2\52\4\13"+
    "\1\2\2\0\1\6\3\0\1\45\1\14\1\10\1\41\1\47\1\61"+
    "\1\14\1\50\1\44\1\37\1\14\1\17\1\36\1\43\1\14\1\16"+
    "\1\14\1\46\1\11\1\14\1\42\1\40\4\14\4\0\1\12\1\0"+
    "\1\26\1\15\1\31\1\23\1\30\2\15\1\35\1\24\1\32\1\15"+
    "\1\20\1\25\1\22\1\15\1\60\1\15\1\27\1\34\1\56\1\21"+
    "\1\33\4\15\1\4\1\0\1\5\7\0\1\63\u1fa2\0\1\63\1\63"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\2\11\1\1\1\11\1\12\2\11\7\12\5\11"+
    "\2\1\1\12\1\13\1\12\1\11\3\0\1\11\2\0"+
    "\1\11\1\0\10\12\2\11\2\0\1\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\2\0\2\12\1\11\1\0"+
    "\1\14\2\11\4\0\1\11\1\0\7\12\1\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\11\1\0\2\12\1\15"+
    "\4\0\1\11\1\0\5\12\1\11\1\0\1\11\1\0"+
    "\1\11\3\0\2\12\1\0\1\16\3\17\2\12\1\20"+
    "\1\11\1\0\1\11\2\12\1\0\2\16\2\12\1\11"+
    "\1\0\1\11\2\12\1\0\2\12\1\11\1\0\1\11"+
    "\1\12\1\0\1\12\1\11\1\12\1\0\1\21\1\22"+
    "\1\12\1\23\2\12\1\24";

  private static int [] zzUnpackAction() {
    int [] result = new int[157];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\64\0\64\0\64\0\64\0\64\0\64"+
    "\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c\0\u01a0"+
    "\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c\0\u0340"+
    "\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac\0\64"+
    "\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4\0\u0618\0\u064c"+
    "\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0750\0\u0784\0\u07b8\0\u07ec"+
    "\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c"+
    "\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\320\0\u0ac4\0\u0af8"+
    "\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98"+
    "\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38"+
    "\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8"+
    "\0\u100c\0\u1040\0\u1074\0\u10a8\0\u10dc\0\u0104\0\u1110\0\u1144"+
    "\0\u1178\0\u11ac\0\u11e0\0\u1214\0\u1248\0\u127c\0\u12b0\0\u12e4"+
    "\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8\0\u141c\0\u1450\0\u1484"+
    "\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588\0\u0104\0\64\0\u0138"+
    "\0\u15bc\0\u15f0\0\u0138\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4"+
    "\0\u1728\0\64\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c\0\u1860"+
    "\0\u1894\0\u18c8\0\u18fc\0\u1930\0\u1964\0\u1998\0\u19cc\0\u1a00"+
    "\0\u1a34\0\u1a68\0\u1a9c\0\u1ad0\0\u1b04\0\u1b38\0\u0138\0\u0104"+
    "\0\u1b6c\0\u1ba0\0\u1bd4\0\u1c08\0\u0138";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[157];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\2\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\2\16\1\22\1\16\1\23\1\24\3\16\1\25"+
    "\1\26\1\27\1\16\1\30\1\31\1\32\1\33\3\15"+
    "\1\34\3\15\1\35\1\14\1\2\1\36\1\14\1\37"+
    "\1\40\1\41\1\42\1\40\76\0\1\43\3\0\1\15"+
    "\2\0\16\15\15\0\1\44\2\0\1\15\1\45\1\15"+
    "\20\0\1\15\2\0\6\15\1\46\7\15\7\0\1\47"+
    "\5\0\1\44\2\0\1\15\1\45\1\15\40\0\1\50"+
    "\43\0\1\15\2\0\16\15\15\0\1\44\2\0\1\15"+
    "\1\45\1\15\20\0\1\16\2\0\16\16\15\0\1\44"+
    "\2\0\1\16\1\45\1\16\20\0\1\15\1\0\1\43"+
    "\16\15\15\0\1\44\2\0\1\15\1\45\1\15\20\0"+
    "\1\15\2\0\1\15\1\51\14\15\4\0\1\52\10\0"+
    "\1\44\2\0\1\15\1\45\1\15\20\0\1\16\2\0"+
    "\1\16\1\53\14\16\15\0\1\44\2\0\1\16\1\45"+
    "\1\16\20\0\1\16\2\0\4\16\1\54\11\16\15\0"+
    "\1\44\2\0\1\16\1\45\1\16\20\0\1\16\2\0"+
    "\6\16\1\55\1\16\1\56\5\16\15\0\1\44\2\0"+
    "\1\16\1\45\1\16\20\0\1\16\2\0\2\16\1\57"+
    "\13\16\15\0\1\44\2\0\1\16\1\45\1\16\20\0"+
    "\1\16\2\0\10\16\1\60\5\16\15\0\1\44\2\0"+
    "\1\16\1\45\1\16\20\0\1\16\2\0\10\16\1\61"+
    "\5\16\15\0\1\44\2\0\1\16\1\45\1\16\20\0"+
    "\1\16\2\0\6\16\1\62\7\16\15\0\1\44\2\0"+
    "\1\16\1\45\1\16\20\0\1\15\2\0\6\15\1\63"+
    "\1\15\1\64\5\15\7\0\1\65\1\0\1\66\3\0"+
    "\1\44\2\0\1\15\1\45\1\15\20\0\1\15\2\0"+
    "\10\15\1\67\5\15\11\0\1\70\3\0\1\44\2\0"+
    "\1\15\1\45\1\15\20\0\1\15\2\0\10\15\1\71"+
    "\5\15\11\0\1\72\3\0\1\44\2\0\1\15\1\45"+
    "\1\15\20\0\1\15\2\0\4\15\1\73\11\15\6\0"+
    "\1\74\6\0\1\44\2\0\1\15\1\45\1\15\20\0"+
    "\1\15\2\0\11\15\1\75\4\15\15\0\1\44\2\0"+
    "\1\15\1\45\1\15\16\0\1\76\21\0\1\50\13\0"+
    "\2\76\1\0\2\76\43\0\1\50\13\0\1\77\2\0"+
    "\2\77\23\0\1\16\2\0\10\16\1\100\5\16\15\0"+
    "\1\44\2\0\1\16\1\45\1\16\20\0\1\16\2\0"+
    "\6\16\1\101\7\16\15\0\1\44\2\0\1\16\1\45"+
    "\1\16\20\0\1\15\2\0\4\15\1\102\11\15\15\0"+
    "\1\44\2\0\1\15\1\45\1\15\15\0\1\103\61\0"+
    "\2\104\2\0\35\104\5\0\1\104\1\0\2\104\12\0"+
    "\2\105\2\0\35\105\5\0\1\105\1\0\2\105\17\0"+
    "\1\15\2\0\5\15\1\106\10\15\15\0\1\44\2\0"+
    "\1\15\1\45\1\15\41\0\1\107\40\0\1\110\35\0"+
    "\2\111\1\112\2\111\23\0\1\15\2\0\2\15\1\113"+
    "\13\15\15\0\1\44\2\0\1\15\1\45\1\15\46\0"+
    "\1\114\35\0\1\16\2\0\2\16\1\115\13\16\15\0"+
    "\1\44\2\0\1\16\1\45\1\16\20\0\1\16\2\0"+
    "\5\16\1\116\10\16\15\0\1\44\2\0\1\16\1\45"+
    "\1\16\20\0\1\16\2\0\7\16\1\115\6\16\15\0"+
    "\1\44\2\0\1\16\1\45\1\16\20\0\1\16\2\0"+
    "\7\16\1\117\6\16\15\0\1\44\2\0\1\16\1\45"+
    "\1\16\20\0\1\16\2\0\4\16\1\120\11\16\15\0"+
    "\1\44\2\0\1\16\1\45\1\16\20\0\1\16\2\0"+
    "\1\16\1\115\14\16\15\0\1\44\2\0\1\16\1\45"+
    "\1\16\20\0\1\16\2\0\2\16\1\121\13\16\15\0"+
    "\1\44\2\0\1\16\1\45\1\16\20\0\1\16\2\0"+
    "\1\122\4\16\1\123\10\16\15\0\1\44\2\0\1\16"+
    "\1\45\1\16\20\0\1\15\2\0\7\15\1\113\6\15"+
    "\15\0\1\44\2\0\1\15\1\45\1\15\20\0\1\15"+
    "\2\0\7\15\1\124\6\15\15\0\1\44\2\0\1\15"+
    "\1\45\1\15\51\0\1\114\63\0\1\125\32\0\1\15"+
    "\2\0\1\15\1\113\14\15\15\0\1\44\2\0\1\15"+
    "\1\45\1\15\45\0\1\114\36\0\1\15\2\0\2\15"+
    "\1\126\13\15\15\0\1\44\2\0\1\15\1\45\1\15"+
    "\46\0\1\127\35\0\1\15\2\0\5\15\1\130\10\15"+
    "\15\0\1\44\2\0\1\15\1\45\1\15\41\0\1\131"+
    "\42\0\1\15\2\0\16\15\15\0\1\44\2\0\1\132"+
    "\1\45\1\15\40\0\1\133\43\0\1\16\2\0\7\16"+
    "\1\134\6\16\15\0\1\44\2\0\1\16\1\45\1\16"+
    "\20\0\1\16\2\0\7\16\1\135\6\16\15\0\1\44"+
    "\2\0\1\16\1\45\1\16\20\0\1\15\2\0\2\15"+
    "\1\136\13\15\15\0\1\44\2\0\1\15\1\45\1\15"+
    "\16\0\1\137\35\0\2\137\1\0\2\137\23\0\1\104"+
    "\2\0\16\104\20\0\1\104\1\45\1\104\20\0\1\105"+
    "\2\0\16\105\20\0\1\105\1\0\1\105\20\0\1\15"+
    "\2\0\10\15\1\113\5\15\15\0\1\44\2\0\1\15"+
    "\1\45\1\15\52\0\1\114\67\0\1\112\23\0\1\110"+
    "\35\0\2\110\1\112\2\110\21\0\1\140\35\0\1\141"+
    "\1\140\1\0\1\142\1\140\23\0\1\15\2\0\3\15"+
    "\1\143\12\15\15\0\1\44\2\0\1\15\1\45\1\15"+
    "\44\0\1\144\37\0\1\16\2\0\3\16\1\145\12\16"+
    "\15\0\1\44\2\0\1\16\1\45\1\16\20\0\1\16"+
    "\2\0\6\16\1\146\7\16\15\0\1\44\2\0\1\16"+
    "\1\45\1\16\20\0\1\16\2\0\11\16\1\147\4\16"+
    "\15\0\1\44\2\0\1\16\1\45\1\16\20\0\1\16"+
    "\2\0\5\16\1\150\10\16\15\0\1\44\2\0\1\16"+
    "\1\45\1\16\20\0\1\16\2\0\3\16\1\147\12\16"+
    "\15\0\1\44\2\0\1\16\1\45\1\16\20\0\1\16"+
    "\2\0\1\151\15\16\15\0\1\44\2\0\1\16\1\45"+
    "\1\16\20\0\1\16\2\0\10\16\1\115\5\16\15\0"+
    "\1\44\2\0\1\16\1\45\1\16\20\0\1\15\2\0"+
    "\11\15\1\152\4\15\15\0\1\44\2\0\1\15\1\45"+
    "\1\15\13\0\1\153\70\0\1\15\2\0\3\15\1\152"+
    "\12\15\15\0\1\44\2\0\1\15\1\45\1\15\44\0"+
    "\1\153\37\0\1\15\2\0\6\15\1\154\7\15\15\0"+
    "\1\44\2\0\1\15\1\45\1\15\50\0\1\155\33\0"+
    "\1\15\2\0\4\15\1\156\11\15\15\0\1\44\2\0"+
    "\1\15\1\45\1\15\16\0\1\157\35\0\2\160\1\161"+
    "\2\160\23\0\1\16\2\0\7\16\1\162\6\16\15\0"+
    "\1\44\2\0\1\16\1\45\1\16\20\0\1\16\2\0"+
    "\16\16\15\0\1\44\2\0\1\163\1\45\1\16\16\0"+
    "\1\164\35\0\2\164\1\0\2\164\43\0\1\165\41\0"+
    "\1\140\21\0\1\165\13\0\2\140\1\0\2\140\43\0"+
    "\1\165\13\0\1\140\2\0\2\140\23\0\1\15\2\0"+
    "\4\15\1\166\11\15\15\0\1\44\2\0\1\15\1\45"+
    "\1\15\47\0\1\167\34\0\1\16\2\0\4\16\1\170"+
    "\11\16\15\0\1\44\2\0\1\16\1\45\1\16\20\0"+
    "\1\16\2\0\2\16\1\171\13\16\15\0\1\44\2\0"+
    "\1\16\1\45\1\16\20\0\1\16\2\0\7\16\1\123"+
    "\6\16\15\0\1\44\2\0\1\16\1\45\1\16\20\0"+
    "\1\16\2\0\6\16\1\172\7\16\15\0\1\44\2\0"+
    "\1\16\1\45\1\16\20\0\1\16\2\0\10\16\1\173"+
    "\5\16\15\0\1\44\2\0\1\16\1\45\1\16\20\0"+
    "\1\15\2\0\7\15\1\106\6\15\15\0\1\44\2\0"+
    "\1\15\1\45\1\15\51\0\1\107\32\0\1\15\2\0"+
    "\2\15\1\174\13\15\15\0\1\44\2\0\1\15\1\45"+
    "\1\15\46\0\1\175\35\0\1\15\2\0\13\15\1\176"+
    "\2\15\15\0\1\44\2\0\1\15\1\45\1\15\56\0"+
    "\1\161\23\0\1\157\35\0\2\157\1\161\2\157\57\0"+
    "\1\140\2\0\1\142\1\140\23\0\1\16\2\0\6\16"+
    "\1\177\7\16\15\0\1\44\2\0\1\16\1\45\1\16"+
    "\20\0\1\16\2\0\4\16\1\200\11\16\15\0\1\44"+
    "\2\0\1\16\1\45\1\16\16\0\1\201\35\0\2\201"+
    "\1\0\2\201\21\0\1\202\35\0\2\203\1\0\2\203"+
    "\23\0\1\16\2\0\11\16\1\204\4\16\15\0\1\44"+
    "\2\0\1\16\1\45\1\16\20\0\1\16\2\0\16\16"+
    "\15\0\1\44\2\0\1\205\1\45\1\16\20\0\1\15"+
    "\2\0\11\15\1\206\4\15\15\0\1\44\2\0\1\15"+
    "\1\45\1\15\13\0\1\207\70\0\1\15\2\0\4\15"+
    "\1\210\11\15\15\0\1\44\2\0\1\15\1\45\1\15"+
    "\20\0\1\16\2\0\4\16\1\211\11\16\15\0\1\44"+
    "\2\0\1\16\1\45\1\16\20\0\1\16\2\0\11\16"+
    "\1\212\4\16\15\0\1\44\2\0\1\16\1\45\1\16"+
    "\16\0\1\213\35\0\2\213\1\0\2\213\21\0\1\202"+
    "\35\0\2\202\1\0\2\202\23\0\1\16\2\0\15\16"+
    "\1\214\15\0\1\44\2\0\1\16\1\45\1\16\20\0"+
    "\1\16\2\0\10\16\1\215\5\16\15\0\1\44\2\0"+
    "\1\16\1\45\1\16\20\0\1\15\2\0\15\15\1\216"+
    "\15\0\1\44\2\0\1\15\1\45\1\15\53\0\1\217"+
    "\30\0\1\15\2\0\16\15\15\0\1\44\2\0\1\220"+
    "\1\45\1\15\20\0\1\16\2\0\2\16\1\173\13\16"+
    "\15\0\1\44\2\0\1\16\1\45\1\16\20\0\1\16"+
    "\2\0\4\16\1\221\11\16\15\0\1\44\2\0\1\16"+
    "\1\45\1\16\16\0\1\222\35\0\2\222\1\0\2\222"+
    "\23\0\1\16\2\0\10\16\1\170\5\16\15\0\1\44"+
    "\2\0\1\16\1\45\1\16\20\0\1\16\2\0\1\16"+
    "\1\223\14\16\15\0\1\44\2\0\1\16\1\45\1\16"+
    "\20\0\1\15\2\0\10\15\1\166\5\15\15\0\1\44"+
    "\2\0\1\15\1\45\1\15\52\0\1\167\31\0\1\15"+
    "\2\0\10\15\1\224\5\15\15\0\1\44\2\0\1\15"+
    "\1\45\1\15\20\0\1\16\2\0\16\16\15\0\1\44"+
    "\2\0\1\16\1\45\1\225\15\0\1\226\66\0\1\16"+
    "\2\0\7\16\1\227\6\16\15\0\1\44\2\0\1\16"+
    "\1\45\1\16\20\0\1\15\2\0\14\15\1\230\1\15"+
    "\15\0\1\44\2\0\1\15\1\45\1\15\20\0\1\16"+
    "\2\0\6\16\1\231\7\16\15\0\1\44\2\0\1\16"+
    "\1\45\1\16\13\0\2\232\2\0\35\232\5\0\1\232"+
    "\1\0\2\232\17\0\1\16\2\0\2\16\1\233\13\16"+
    "\15\0\1\44\2\0\1\16\1\45\1\16\20\0\1\232"+
    "\2\0\16\232\20\0\1\232\1\0\1\232\20\0\1\16"+
    "\2\0\16\16\15\0\1\44\2\0\1\234\1\45\1\16"+
    "\20\0\1\16\2\0\14\16\1\235\1\16\15\0\1\44"+
    "\2\0\1\16\1\45\1\16\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7228];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\10\11\26\1\1\11\2\1\3\0\1\1\2\0"+
    "\1\1\1\0\12\1\2\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\2\0\3\1\1\0\3\1\4\0"+
    "\1\1\1\0\10\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\3\1\4\0\1\1\1\0\6\1\1\0"+
    "\1\1\1\0\1\1\3\0\2\1\1\0\2\1\1\11"+
    "\5\1\1\0\3\1\1\0\1\11\4\1\1\0\3\1"+
    "\1\0\3\1\1\0\2\1\1\0\3\1\1\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[157];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Caractère non reconnue "+yytext());
            } 
            // fall through
          case 21: break;
          case 2: 
            { return new Symbol(sym.POINT);
            } 
            // fall through
          case 22: break;
          case 3: 
            { return new Symbol(sym.DEUXPOINT);
            } 
            // fall through
          case 23: break;
          case 4: 
            { return new Symbol(sym.VIRG);
            } 
            // fall through
          case 24: break;
          case 5: 
            { return new Symbol(sym.ACCOVT);
            } 
            // fall through
          case 25: break;
          case 6: 
            { return new Symbol(sym.ACCFMT);
            } 
            // fall through
          case 26: break;
          case 7: 
            { return new Symbol(sym.EGALE);
            } 
            // fall through
          case 27: break;
          case 8: 
            { return new Symbol(sym.GUILL);
            } 
            // fall through
          case 28: break;
          case 9: 
            { return new Symbol(sym.NOMLIEU);
            } 
            // fall through
          case 29: break;
          case 10: 
            { return new Symbol(sym.CHAINE);
            } 
            // fall through
          case 30: break;
          case 11: 
            { 
            } 
            // fall through
          case 31: break;
          case 12: 
            { return new Symbol(sym.PRENOM);
            } 
            // fall through
          case 32: break;
          case 13: 
            { return new Symbol(sym.FIN);
            } 
            // fall through
          case 33: break;
          case 14: 
            { return new Symbol(sym.HORAIRE);
            } 
            // fall through
          case 34: break;
          case 15: 
            { return new Symbol(sym.JOUR);
            } 
            // fall through
          case 35: break;
          case 16: 
            { return new Symbol(sym.ASPECTLIEU, new String(yytext()));
            } 
            // fall through
          case 36: break;
          case 17: 
            { return new Symbol(sym.ANIMATEUR);
            } 
            // fall through
          case 37: break;
          case 18: 
            { return new Symbol(sym.ACTIVITES);
            } 
            // fall through
          case 38: break;
          case 19: 
            { return new Symbol(sym.CENTRE);
            } 
            // fall through
          case 39: break;
          case 20: 
            { return new Symbol(sym.PARTICIPANTS);
            } 
            // fall through
          case 40: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
