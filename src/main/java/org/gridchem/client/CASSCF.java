package org.gridchem.client;
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

/* The following code was generated by JFlex 1.4.1 on 1/26/05 10:10 PM */

/* CASSCF Keyword 
   Last Update: 6/26/2001 
   http://www.gaussian.com/00000419.htm
*/


 

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 1/26/05 10:10 PM from the specification file
 * <tt>D:/CCG/CCG_CUP_FLEX/casscf.flex</tt>
 */
import org.gridchem.client.*;
import org.gridchem.client.common.Settings;

public class CASSCF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int FLOATVAL = 6;
  public static final int GETCOMMA = 2;
  public static final int ITN = 4;
  public static final int ITNFLOAT = 5;
  public static final int INTVAL = 7;
  public static final int IGNOREALL = 8;
  public static final int YYINITIAL = 0;
  public static final int GETN = 1;
  public static final int GETM = 3;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    35,  0,  0,  0,  0,  0,  0,  0,  8,  0,  0,  3,  9,  3,  4,  0, 
     1,  2, 26,  2,  2,  2, 33,  2,  2, 32,  0,  0,  0, 17,  0,  0, 
     0, 11, 28, 10,  5, 16, 13, 14, 29, 27,  0,  0, 18, 25, 21, 20, 
    23, 31, 19, 12,  7, 15, 24, 30, 34, 22,  0,  0,  0,  0,  0,  0, 
     0, 11, 28, 10,  5, 16, 13, 14, 29, 27,  0,  0, 18, 25, 21, 20, 
    23, 31, 19, 12,  7, 15, 24, 30, 34, 22,  0,  0,  6,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\11\0\21\1\1\2\1\1\1\3\1\4\4\1\1\5"+
    "\5\1\1\6\1\1\31\0\1\7\2\0\1\10\3\0"+
    "\1\11\1\0\1\6\14\0\1\12\11\0\1\7\1\13"+
    "\10\0\1\14\14\0\1\15\10\0\1\11\42\0\1\16"+
    "\10\0\1\17\11\0\1\20\14\0\1\7\13\0\1\21"+
    "\10\0\1\7\4\0\1\22\16\0\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[240];
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
    "\0\0\0\44\0\110\0\154\0\220\0\264\0\330\0\374"+
    "\0\u0120\0\u0144\0\u0168\0\u018c\0\u01b0\0\u01d4\0\u01f8\0\u021c"+
    "\0\u0240\0\u0264\0\u0288\0\u02ac\0\u02d0\0\u02f4\0\u0318\0\u033c"+
    "\0\u0360\0\u0384\0\u03a8\0\u03a8\0\u0144\0\u03cc\0\u03cc\0\u03f0"+
    "\0\u0414\0\u0438\0\u0144\0\u045c\0\u0480\0\u04a4\0\u04c8\0\u04ec"+
    "\0\u0510\0\u0510\0\u0534\0\u0558\0\u057c\0\u05a0\0\u05c4\0\u05e8"+
    "\0\u060c\0\u0630\0\u0654\0\u0678\0\u069c\0\u06c0\0\u06e4\0\u0708"+
    "\0\u072c\0\u0750\0\u0774\0\u0798\0\u07bc\0\u07e0\0\u0804\0\u0828"+
    "\0\u084c\0\u0870\0\u0894\0\u0144\0\u0438\0\u08b8\0\u0144\0\u08dc"+
    "\0\u0900\0\u0480\0\u0924\0\u04c8\0\u0948\0\u096c\0\u0990\0\u09b4"+
    "\0\u09d8\0\u09fc\0\u0a20\0\u0a44\0\u0a68\0\u0a8c\0\u0ab0\0\u0ad4"+
    "\0\u0af8\0\u0144\0\u0b1c\0\u0b40\0\u0b64\0\u0b88\0\u0bac\0\u01f8"+
    "\0\u0bd0\0\u0bf4\0\u0c18\0\u0c3c\0\u0144\0\u0c60\0\u0c84\0\u0ca8"+
    "\0\u0ccc\0\u0cf0\0\u0d14\0\u0d38\0\u0d5c\0\u0144\0\u0d80\0\u0da4"+
    "\0\u0dc8\0\u0dec\0\u0e10\0\u0e34\0\u0e58\0\u0e7c\0\u0ea0\0\u0ec4"+
    "\0\u0ee8\0\u0f0c\0\u0144\0\u0f30\0\u0f54\0\u0f78\0\u0f9c\0\u0fc0"+
    "\0\u0fe4\0\u1008\0\u102c\0\u1050\0\u1050\0\u0510\0\u1074\0\u1098"+
    "\0\u10bc\0\u10e0\0\u1104\0\u1128\0\u114c\0\u1170\0\u1194\0\u11b8"+
    "\0\u11dc\0\u1200\0\u1224\0\u1248\0\u126c\0\u1290\0\u12b4\0\u12d8"+
    "\0\u12fc\0\u1320\0\u1344\0\u1368\0\u138c\0\u13b0\0\u13d4\0\u13f8"+
    "\0\u141c\0\u1440\0\u1464\0\u1488\0\u14ac\0\u14d0\0\u0144\0\u14f4"+
    "\0\u1518\0\u153c\0\u1560\0\u1584\0\u15a8\0\u15cc\0\u15f0\0\u0144"+
    "\0\u1614\0\u1638\0\u165c\0\u1680\0\u16a4\0\u16c8\0\u16ec\0\u1710"+
    "\0\u1734\0\u0144\0\u1758\0\u177c\0\u17a0\0\u17c4\0\u17e8\0\u180c"+
    "\0\u1830\0\u1854\0\u1878\0\u189c\0\u18c0\0\u18e4\0\u1908\0\u192c"+
    "\0\u1950\0\u1974\0\u1998\0\u19bc\0\u19e0\0\u1a04\0\u1a28\0\u1a4c"+
    "\0\u1a70\0\u1a94\0\u0144\0\u1ab8\0\u1adc\0\u1b00\0\u1b24\0\u1b48"+
    "\0\u1b6c\0\u1b90\0\u1bb4\0\u1bd8\0\u1bfc\0\u1c20\0\u1c44\0\u1c68"+
    "\0\u1c8c\0\u1cb0\0\u1cd4\0\u1cf8\0\u1d1c\0\u1d40\0\u1d64\0\u1d88"+
    "\0\u1dac\0\u1dd0\0\u1df4\0\u1e18\0\u1e3c\0\u1e60\0\u1e84\0\u0144";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[240];
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
    "\5\12\1\13\1\12\1\14\2\12\1\15\1\12\1\16"+
    "\1\17\1\20\1\21\1\22\2\12\1\23\1\24\1\25"+
    "\1\12\1\26\1\12\1\27\1\12\1\30\1\12\1\31"+
    "\1\12\1\32\5\12\2\33\1\34\2\12\1\34\23\12"+
    "\1\33\5\12\2\33\13\12\1\35\33\12\2\36\1\37"+
    "\2\12\1\37\23\12\1\36\5\12\2\36\7\12\1\40"+
    "\5\12\1\41\4\12\1\42\1\43\7\12\1\44\13\12"+
    "\2\45\1\46\2\12\1\46\23\12\1\45\5\12\2\45"+
    "\3\12\2\47\1\50\2\12\1\50\23\12\1\47\5\12"+
    "\2\47\3\12\2\51\1\52\2\12\1\52\23\12\1\51"+
    "\5\12\2\51\46\12\57\0\1\53\10\0\1\54\54\0"+
    "\1\55\21\0\1\56\37\0\1\57\2\0\1\60\7\0"+
    "\1\61\4\0\1\62\33\0\1\63\43\0\1\64\40\0"+
    "\1\65\10\0\1\66\35\0\1\67\12\0\1\70\26\0"+
    "\1\66\2\0\1\71\46\0\1\72\3\0\1\73\31\0"+
    "\1\74\5\0\1\75\1\76\2\0\1\77\40\0\1\100"+
    "\46\0\1\101\23\0\1\102\72\0\1\103\17\0\1\104"+
    "\32\0\2\33\27\0\1\33\5\0\2\33\3\0\2\36"+
    "\27\0\1\36\5\0\2\36\22\0\1\105\35\0\1\106"+
    "\52\0\1\107\34\0\1\110\1\111\31\0\2\112\1\0"+
    "\1\113\25\0\1\112\5\0\2\112\3\0\2\112\27\0"+
    "\1\112\5\0\2\112\3\0\2\114\1\0\1\115\25\0"+
    "\1\114\5\0\2\114\3\0\2\114\27\0\1\114\5\0"+
    "\2\114\3\0\2\51\27\0\1\51\5\0\2\51\32\0"+
    "\1\116\37\0\1\117\42\0\1\120\34\0\1\121\42\0"+
    "\1\122\45\0\1\123\41\0\1\124\63\0\1\125\32\0"+
    "\1\126\41\0\1\127\43\0\1\130\47\0\1\104\50\0"+
    "\1\131\33\0\1\132\36\0\1\133\63\0\1\134\16\0"+
    "\1\135\46\0\1\136\15\0\1\136\37\0\1\137\34\0"+
    "\1\140\41\0\1\141\52\0\1\142\4\0\1\143\46\0"+
    "\1\144\36\0\1\145\23\0\1\146\50\0\1\105\45\0"+
    "\1\147\71\0\1\150\2\0\2\113\2\0\2\151\11\0"+
    "\1\151\11\0\1\113\5\0\2\113\3\0\2\115\2\0"+
    "\2\152\11\0\1\152\11\0\1\115\5\0\2\115\35\0"+
    "\1\153\25\0\1\154\46\0\1\155\33\0\1\156\3\0"+
    "\1\157\36\0\1\160\55\0\1\161\31\0\1\162\61\0"+
    "\1\104\40\0\1\163\35\0\1\164\51\0\1\165\50\0"+
    "\1\166\23\0\1\167\56\0\1\170\1\171\41\0\1\172"+
    "\43\0\1\173\46\0\1\174\52\0\1\175\23\0\1\176"+
    "\51\0\1\177\36\0\1\200\47\0\1\201\35\0\1\202"+
    "\64\0\1\203\11\0\2\204\1\205\2\0\1\205\23\0"+
    "\1\204\5\0\2\204\3\0\2\51\1\206\2\0\1\206"+
    "\23\0\1\51\5\0\2\51\7\0\1\207\53\0\1\104"+
    "\42\0\1\210\41\0\1\211\51\0\1\212\35\0\1\213"+
    "\51\0\1\214\30\0\1\215\52\0\1\216\67\0\1\217"+
    "\35\0\1\70\24\0\1\220\54\0\1\221\43\0\1\222"+
    "\31\0\1\223\40\0\1\224\57\0\1\225\43\0\1\226"+
    "\35\0\1\227\5\0\1\230\1\0\1\231\25\0\1\232"+
    "\43\0\1\104\51\0\1\233\35\0\1\105\35\0\2\204"+
    "\27\0\1\204\5\0\2\204\16\0\1\234\64\0\1\235"+
    "\23\0\1\236\41\0\1\237\2\0\1\240\51\0\1\241"+
    "\42\0\1\103\53\0\1\242\31\0\1\243\23\0\1\244"+
    "\65\0\1\201\32\0\1\245\55\0\1\201\43\0\1\246"+
    "\40\0\1\247\36\0\1\250\50\0\1\251\41\0\1\252"+
    "\44\0\1\253\36\0\1\254\43\0\1\255\73\0\1\256"+
    "\24\0\1\257\40\0\1\260\32\0\1\156\63\0\1\261"+
    "\32\0\1\262\51\0\1\263\31\0\1\264\43\0\1\265"+
    "\7\0\1\266\1\267\60\0\1\104\15\0\1\270\55\0"+
    "\1\271\37\0\1\272\47\0\1\273\40\0\1\274\37\0"+
    "\1\275\34\0\1\276\43\0\1\277\46\0\1\300\56\0"+
    "\1\163\36\0\1\301\43\0\1\302\53\0\1\303\31\0"+
    "\1\104\47\0\1\304\41\0\1\305\50\0\1\306\40\0"+
    "\1\307\54\0\1\310\27\0\1\311\46\0\1\104\40\0"+
    "\1\312\43\0\1\313\44\0\1\314\47\0\1\315\42\0"+
    "\1\316\34\0\1\317\47\0\1\125\32\0\1\320\47\0"+
    "\1\321\52\0\1\322\42\0\1\323\34\0\1\324\62\0"+
    "\1\320\34\0\1\325\44\0\1\326\34\0\1\327\54\0"+
    "\1\330\31\0\1\331\44\0\1\332\47\0\1\333\30\0"+
    "\1\334\64\0\1\104\30\0\1\274\43\0\1\335\43\0"+
    "\1\336\51\0\1\104\52\0\1\337\31\0\1\340\46\0"+
    "\1\341\45\0\1\104\31\0\1\342\55\0\1\327\42\0"+
    "\1\343\41\0\1\344\43\0\1\104\46\0\1\345\33\0"+
    "\1\265\54\0\1\346\42\0\1\347\40\0\1\350\46\0"+
    "\1\351\36\0\1\352\40\0\1\353\64\0\1\354\27\0"+
    "\1\355\30\0\1\104\71\0\1\356\15\0\1\357\45\0"+
    "\1\324\40\0\1\360\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7848];
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
    "\11\0\1\11\22\1\1\11\5\1\1\11\7\1\31\0"+
    "\1\11\2\0\1\11\3\0\1\1\1\0\1\1\14\0"+
    "\1\11\11\0\1\1\1\11\10\0\1\11\14\0\1\11"+
    "\10\0\1\1\42\0\1\11\10\0\1\11\11\0\1\11"+
    "\14\0\1\1\13\0\1\11\10\0\1\1\4\0\1\1"+
    "\16\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[240];
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

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public static boolean DEBUG = false;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public CASSCF(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public CASSCF(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { if (Settings.DEBUG) System.out.println(yytext());
		  yybegin(INTVAL);
          }
        case 20: break;
        case 2: 
          { if (Settings.DEBUG) System.out.println(yytext());
	 yybegin(GETCOMMA);
          }
        case 21: break;
        case 4: 
          { if (Settings.DEBUG) System.out.println(yytext());
	 yybegin(YYINITIAL);
          }
        case 22: break;
        case 9: 
          { if (Settings.DEBUG) System.out.println(yytext());
	   yybegin(ITN);
          }
        case 23: break;
        case 14: 
          { if (Settings.DEBUG) System.out.println(yytext());
	    yybegin(INTVAL);
          }
        case 24: break;
        case 3: 
          { if (Settings.DEBUG) System.out.println(yytext());
	 yybegin(GETM);
          }
        case 25: break;
        case 13: 
          { if (Settings.DEBUG) System.out.println(yytext());
	  yybegin(INTVAL);
          }
        case 26: break;
        case 15: 
          { if (Settings.DEBUG) System.out.println(yytext());
	     yybegin(INTVAL);
          }
        case 27: break;
        case 5: 
          { if (Settings.DEBUG) System.out.println(yytext());	  
       yybegin(ITNFLOAT);
          }
        case 28: break;
        case 12: 
          { if (Settings.DEBUG) System.out.println(yytext());
	     yybegin(GETN);
          }
        case 29: break;
        case 18: 
          { if (Settings.DEBUG) System.out.println(yytext());
		 yybegin(INTVAL);
          }
        case 30: break;
        case 19: 
          { if (Settings.DEBUG) System.out.println(yytext());
		      yybegin(YYINITIAL);
          }
        case 31: break;
        case 8: 
          { if (Settings.DEBUG) System.out.println(yytext());
	  yybegin(ITNFLOAT);
          }
        case 32: break;
        case 17: 
          { if (Settings.DEBUG) System.out.println(yytext());
	       yybegin(INTVAL);
          }
        case 33: break;
        case 7: 
          { if (Settings.DEBUG) System.out.println(yytext());
          }
        case 34: break;
        case 6: 
          { if (Settings.DEBUG) System.out.println(yytext());
	   yybegin(YYINITIAL);
          }
        case 35: break;
        case 10: 
          { if (Settings.DEBUG) System.out.println(yytext());
		 yybegin(FLOATVAL);
          }
        case 36: break;
        case 11: 
          { if (Settings.DEBUG) System.out.println(yytext());
	 yybegin(ITN);
          }
        case 37: break;
        case 1: 
          { 
          }
        case 38: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java CASSCF <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        CASSCF scanner = null;
        try {
          scanner = new CASSCF( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
