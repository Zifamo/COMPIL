
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
    "\000\013\000\002\002\007\000\002\002\004\000\002\002" +
    "\002\000\002\003\006\000\002\003\005\000\002\004\024" +
    "\000\002\004\023\000\002\006\002\000\002\005\006\000" +
    "\002\005\003\000\002\005\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\006\002\uffff\010\004\001\002\000\004\014" +
    "\007\001\002\000\004\002\006\001\002\000\004\002\000" +
    "\001\002\000\004\007\010\001\002\000\004\015\065\001" +
    "\002\000\006\007\012\013\013\001\002\000\004\015\015" +
    "\001\002\000\004\016\014\001\002\000\004\002\001\001" +
    "\002\000\004\006\016\001\002\000\004\020\045\001\002" +
    "\000\010\006\020\007\ufffe\013\ufffe\001\002\000\004\020" +
    "\021\001\002\000\004\005\022\001\002\000\004\017\023" +
    "\001\002\000\004\004\024\001\002\000\004\005\025\001" +
    "\002\000\004\017\026\001\002\000\004\011\027\001\002" +
    "\000\004\020\030\001\002\000\004\021\031\001\002\000" +
    "\004\017\032\001\002\000\004\012\033\001\002\000\004" +
    "\020\034\001\002\000\004\022\035\001\002\000\006\021" +
    "\037\023\ufff7\001\002\000\004\023\043\001\002\000\006" +
    "\017\040\023\ufff8\001\002\000\006\021\ufffa\023\ufffa\001" +
    "\002\000\006\021\037\023\ufff7\001\002\000\004\023\ufff9" +
    "\001\002\000\004\024\044\001\002\000\010\006\ufffc\007" +
    "\ufffc\013\ufffc\001\002\000\004\005\046\001\002\000\004" +
    "\017\047\001\002\000\004\004\050\001\002\000\004\005" +
    "\051\001\002\000\004\017\052\001\002\000\004\011\053" +
    "\001\002\000\004\020\054\001\002\000\004\021\055\001" +
    "\002\000\004\017\056\001\002\000\004\012\057\001\002" +
    "\000\004\020\060\001\002\000\004\022\061\001\002\000" +
    "\006\021\037\023\ufff7\001\002\000\004\023\063\001\002" +
    "\000\004\024\064\001\002\000\010\006\ufffb\007\ufffb\013" +
    "\ufffb\001\002\000\004\006\016\001\002\000\010\006\020" +
    "\007\ufffd\013\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\010\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\016\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\005\035\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\040" +
    "\001\001\000\004\005\041\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\005\061\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\065\001" +
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


      int nbActivites = 0;
      int nbExt = 0;
      int nbInt = 0;
      int nbParticipants = 0;
      int participants = 0;
      int maximal = -1;
      String heure;
      String activi;
      String jour = " ";


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
		 System.out.println("format du planning correct. ");
                                                     nbActivites = nbInt + nbExt;
                                                     System.out.println(nbActivites+" activites ,");
                                                     System.out.println("dont "+nbExt+" ?? l'exterieur");
                                                     System.out.println("l'activite "+activi+" du "+jour+" "+heure+" rassemble "+maximal+" participants");
                                                  
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
		int jleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int jright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String j = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                                                      
              CUP$parser$result = parser.getSymbolFactory().newSymbol("listeJour",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // listeJour ::= JOUR DEUXPOINT listeCreneau 
            {
              Object RESULT =null;
		int jleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int jright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String j = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		jour=j;
                                             
              CUP$parser$result = parser.getSymbolFactory().newSymbol("listeJour",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // listeCreneau ::= listeCreneau HORAIRE EGALE CHAINE VIRG ASPECTLIEU CHAINE VIRG ANIMATEUR EGALE PRENOM VIRG PARTICIPANTS EGALE ACCOVT listePrenom ACCFMT POINTVIRG 
            {
              Object RESULT =null;
		int hleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)).left;
		int hright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)).right;
		String h = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-16)).value;
		int nomleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)).left;
		int nomright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)).right;
		String nom = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-14)).value;
		int aspectleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).left;
		int aspectright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).right;
		String aspect = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-12)).value;
		 if(aspect.equals("salle")){
                                                                                                    nbInt++;
                                                                                                } else {
                                                                                                    nbExt++;
                                                                                                }
                                                                                                if(maximal < participants) {
                                                                                                    maximal = participants;
                                                                                                    heure = h;
                                                                                                    activi = nom;
                                                                                                }
                                                                                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("listeCreneau",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-17)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // listeCreneau ::= HORAIRE EGALE CHAINE VIRG ASPECTLIEU CHAINE VIRG ANIMATEUR EGALE PRENOM VIRG PARTICIPANTS EGALE ACCOVT listePrenom ACCFMT POINTVIRG 
            {
              Object RESULT =null;
		int hleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)).left;
		int hright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)).right;
		String h = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-16)).value;
		int nomleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)).left;
		int nomright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)).right;
		String nom = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-14)).value;
		int aspectleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).left;
		int aspectright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).right;
		String aspect = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-12)).value;
		 if(aspect.equals("salle")){
                                                                                                    nbInt++;
                                                                                                } else {
                                                                                                    nbExt++;
                                                                                                }
                                                                                                if(maximal < participants) {
                                                                                                    maximal = participants;
                                                                                                    heure = h;
                                                                                                    activi = nom;
                                                                                                }
                                                                                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("listeCreneau",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$0 ::= 
            {
              Object RESULT =null;
nbParticipants++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // listePrenom ::= PRENOM VIRG NT$0 listePrenom 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listePrenom",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // listePrenom ::= PRENOM 
            {
              Object RESULT =null;
		nbParticipants++;participants=nbParticipants;nbParticipants = 0;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("listePrenom",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // listePrenom ::= 
            {
              Object RESULT =null;
		nbParticipants = 0;participants=nbParticipants;
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
