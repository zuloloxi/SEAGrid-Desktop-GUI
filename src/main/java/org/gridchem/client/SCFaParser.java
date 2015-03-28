/*Copyright (c) 2004,University of Illinois at Urbana-Champaign.  All rights reserved.

Developed by:
Chemistry and Computational Biology Group

NCSA, University of Illinois at Urbana-Champaign

http://ncsa.uiuc.edu/GridChem

Permission is hereby granted, free of charge, to any person 
obtaining a copy of this software and associated documentation
files (the "Software") to deal with the Software without
restriction, including without limitation the rights to use, 
copy, modify, merge, publish, distribute, sublicense, and/or 
sell copies of the Software, and to permit persons to whom 
the Software is furnished to do so, subject to the following 
conditions:
1. Redistributions of source code must retain the above copyright notice, 
   this list of conditions and the following disclaimers.
2. Redistributions in binary form must reproduce the above copyright notice, 
   this list of conditions and the following disclaimers in the documentation
   and/or other materials provided with the distribution.
3. Neither the names of Chemistry and Computational Biology Group , NCSA, 
   University of Illinois at Urbana-Champaign, nor the names of its contributors 
   may be used to endorse or promote products derived from this Software without 
   specific prior written permission.
    
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF 
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  
IN NO EVENT SHALL THE CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, 
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
DEALINGS WITH THE SOFTWARE.

*/

//----------------------------------------------------
// The following code was generated by CUP v0.10j
// Thu Oct 03 13:06:48 CDT 2002
//----------------------------------------------------

package org.gridchem.client;

import java_cup.runtime.*;
import javax.swing.*;

import org.gridchem.client.*;
import org.gridchem.client.common.Settings;
import org.gridchem.client.gui.panels.myccg.job.JobPanel;
import org.gridchem.client.util.Env;

import java.util.*;
import java.io.*;

/** CUP v0.10j generated parser.
  * @version Thu Oct 03 13:06:48 CDT 2002
  */
public class SCFaParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public SCFaParser() {super();}

  /** Constructor which sets the default scanner. */
  public SCFaParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\003\005\000\002\002\004\000\002\004" +
    "\003\000\002\005\004\000\002\005\003\000\002\012\002" +
    "\000\002\006\006\000\002\007\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\017\000\004\004\005\001\002\000\004\006\011\001" +
    "\002\000\004\006\uffff\001\002\000\004\002\007\001\002" +
    "\000\004\002\000\001\002\000\006\005\020\006\011\001" +
    "\002\000\004\012\013\001\002\000\006\005\ufffd\006\ufffd" +
    "\001\002\000\004\007\ufffc\001\002\000\004\007\015\001" +
    "\002\000\004\013\017\001\002\000\006\005\ufffb\006\ufffb" +
    "\001\002\000\006\005\ufffa\006\ufffa\001\002\000\004\002" +
    "\001\001\002\000\006\005\ufffe\006\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\017\000\006\003\005\004\003\001\001\000\006\005" +
    "\007\006\011\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\020\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\013\001\001\000\004" +
    "\007\015\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SCFaParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions() throws IOException
    {
      action_obj = new CUP$SCFaParser$actions(this);
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
    return action_obj.CUP$SCFaParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$SCFaParser$actions {

 
  //__________________________________
  public static boolean DEBUG = true;
  public ParseGSCF2 temp;  
  private static JTable table;               
  private static final String tableLabel = "SCF Intermediate Results:";
// private static String cycle = "0";
 
  
  public static JTable getTable() {
    return table;
  }

  public static String getTableLabel() {
    return tableLabel;
  }

//   }

  private final SCFaParser parser;

  /** Constructor */
  CUP$SCFaParser$actions(SCFaParser parser) throws IOException {
    this.parser = parser;
    //temp = new ParseGSCF2(Settings.defaultDirStr + 
    temp = new ParseGSCF2(Env.getApplicationDataDir() +
	       		Settings.fileSeparator + "temporary4");
    temp.putField("TitleText: Energy versus Iteration"+" - "+JobPanel.jobName+"\n");
    temp.putField("XLabel: Iteration\n YLabel: Energy\n");
    temp.putField("DataSet: Energy\n");
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$SCFaParser$do_action(
    int                        CUP$SCFaParser$act_num,
    java_cup.runtime.lr_parser CUP$SCFaParser$parser,
    java.util.Stack            CUP$SCFaParser$stack,
    int                        CUP$SCFaParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SCFaParser$result;

      /* select the action based on the action number */
      switch (CUP$SCFaParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // cycle ::= Energ ENERGY 
            {
              Object RESULT = null;
		int enerleft = ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).left;
		int enerright = ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right;
		Float ener = (Float)((java_cup.runtime.Symbol) CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).value;
		 //___________________________________________________________________
   if (DEBUG) System.out.println("CUP:scfa:  ENERGY "+ener); 
                          float energ = ener.floatValue();
               energ = 100*energ;
            temp.putField(energ);
              CUP$SCFaParser$result = new java_cup.runtime.Symbol(5/*cycle*/, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right, RESULT);
            }
          return CUP$SCFaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // scfcycle ::= NSearch ITERATION NT$0 cycle 
            {
              Object RESULT = null;
              // propagate RESULT from NT$0
              if ( ((java_cup.runtime.Symbol) CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-1)).value != null )
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-1)).value;
		int iterleft = ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-2)).left;
		int iterright = ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-2)).right;
		Integer iter = (Integer)((java_cup.runtime.Symbol) CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-2)).value;

              CUP$SCFaParser$result = new java_cup.runtime.Symbol(4/*scfcycle*/, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right, RESULT);
            }
          return CUP$SCFaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$0 ::= 
            {
              Object RESULT = null;
		int iterleft = ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).left;
		int iterright = ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right;
		Integer iter = (Integer)((java_cup.runtime.Symbol) CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).value;
 //___________________________________________________________________
   if (DEBUG) System.out.println("CUP:scfa: ITERATION  "+iter);
           int cycl = iter.intValue();
            temp.putField(cycl);
            temp.putField(", ");
              CUP$SCFaParser$result = new java_cup.runtime.Symbol(8/*NT$0*/, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right, RESULT);
            }
          return CUP$SCFaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // scfpat ::= scfcycle 
            {
              Object RESULT = null;

              CUP$SCFaParser$result = new java_cup.runtime.Symbol(3/*scfpat*/, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right, RESULT);
            }
          return CUP$SCFaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // scfpat ::= scfpat scfcycle 
            {
              Object RESULT = null;
		 if (DEBUG) System.out.println("CUP:scfa: in scfpat"); 
              CUP$SCFaParser$result = new java_cup.runtime.Symbol(3/*scfpat*/, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right, RESULT);
            }
          return CUP$SCFaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // scfintro ::= FOUNDITER 
            {
              Object RESULT = null;
		 if (DEBUG) System.out.println("CUP:scfa:  found the start of Iteration"); 
              CUP$SCFaParser$result = new java_cup.runtime.Symbol(2/*scfintro*/, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right, RESULT);
            }
          return CUP$SCFaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= startpt EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-1)).value;
		RESULT = start_val;
              CUP$SCFaParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$SCFaParser$parser.done_parsing();
          return CUP$SCFaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // startpt ::= scfintro scfpat SCFDONE 
            {
              Object RESULT = null;
		 if (DEBUG) System.out.println("CUP:gopt:  end of parse tree "); 
 	       table = new JTable();
	
//       table = parseSCF.getTable();
 	     
              CUP$SCFaParser$result = new java_cup.runtime.Symbol(1/*startpt*/, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$SCFaParser$stack.elementAt(CUP$SCFaParser$top-0)).right, RESULT);
            }
          return CUP$SCFaParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
