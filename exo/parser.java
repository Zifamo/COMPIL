
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\007\000\002\002\004\000\002\002" +
    "\002\000\002\003\006\000\002\003\005\000\002\004\030" +
    "\000\002\004\027\000\002\005\005\000\002\005\003\000" +
    "\002\005\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\006\002\uffff\005\004\001\002\000\004\011" +
    "\007\001\002\000\004\002\006\001\002\000\004\002\000" +
    "\001\002\000\004\012\010\001\002\000\004\013\074\001" +
    "\002\000\006\010\013\012\012\001\002\000\004\013\015" +
    "\001\002\000\004\014\014\001\002\000\004\002\001\001" +
    "\002\000\004\016\016\001\002\000\004\017\050\001\002" +
    "\000\010\010\ufffe\012\ufffe\016\020\001\002\000\004\017" +
    "\021\001\002\000\004\020\022\001\002\000\004\021\023" +
    "\001\002\000\004\020\024\001\002\000\004\015\025\001" +
    "\002\000\004\004\026\001\002\000\004\020\027\001\002" +
    "\000\004\022\030\001\002\000\004\020\031\001\002\000" +
    "\004\015\032\001\002\000\004\006\033\001\002\000\004" +
    "\017\034\001\002\000\004\023\035\001\002\000\004\015" +
    "\036\001\002\000\004\007\037\001\002\000\004\017\040" +
    "\001\002\000\004\024\041\001\002\000\006\023\043\025" +
    "\ufff8\001\002\000\004\025\046\001\002\000\006\015\044" +
    "\025\ufff9\001\002\000\006\023\043\025\ufff8\001\002\000" +
    "\004\025\ufffa\001\002\000\004\026\047\001\002\000\010" +
    "\010\ufffc\012\ufffc\016\ufffc\001\002\000\004\020\051\001" +
    "\002\000\004\021\052\001\002\000\004\020\053\001\002" +
    "\000\004\015\054\001\002\000\004\004\055\001\002\000" +
    "\004\020\056\001\002\000\004\022\057\001\002\000\004" +
    "\020\060\001\002\000\004\015\061\001\002\000\004\006" +
    "\062\001\002\000\004\017\063\001\002\000\004\023\064" +
    "\001\002\000\004\015\065\001\002\000\004\007\066\001" +
    "\002\000\004\017\067\001\002\000\004\024\070\001\002" +
    "\000\006\023\043\025\ufff8\001\002\000\004\025\072\001" +
    "\002\000\004\026\073\001\002\000\010\010\ufffb\012\ufffb" +
    "\016\ufffb\001\002\000\004\016\016\001\002\000\010\010" +
    "\ufffd\012\ufffd\016\020\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\010\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\016\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\041\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\044\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\005\070\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\074\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        public static void main(String args[]) throws Exception {
            new parser(new Yylex(new InputStreamReader(System.in))).parse();
        }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


      int prixTotal = 0;

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // planning ::= ACTIVITES CENTRE listeJour FIN POINT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("planning",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= planning EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // planning ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("planning",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // listeJour ::= listeJour JOUR DEUXPOINT listeCreneau 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listeJour",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // listeJour ::= JOUR DEUXPOINT listeCreneau 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listeJour",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // listeCreneau ::= listeCreneau HORAIRE EGALE GUILL CHAINE GUILL VIRG ASPECTLIEU GUILL NOMLIEU GUILL VIRG ANIMATEUR EGALE PRENOM VIRG PARTICIPANTS EGALE ACCOVT listePrenom ACCFMT POINTVIRG 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listeCreneau",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-21)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // listeCreneau ::= HORAIRE EGALE GUILL CHAINE GUILL VIRG ASPECTLIEU GUILL NOMLIEU GUILL VIRG ANIMATEUR EGALE PRENOM VIRG PARTICIPANTS EGALE ACCOVT listePrenom ACCFMT POINTVIRG 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listeCreneau",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-20)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // listePrenom ::= PRENOM VIRG listePrenom 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listePrenom",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // listePrenom ::= PRENOM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listePrenom",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // listePrenom ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listePrenom",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
