/* Generated By:JavaCC: Do not edit this line. ContentLanguageParserConstants.java */
/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/
package org.apache.james.mime4j.field.language.parser;

public interface ContentLanguageParserConstants {

  int EOF = 0;
  int WS = 3;
  int COMMENT = 5;
  int QUOTEDSTRING = 16;
  int DIGITS = 17;
  int ALPHA = 18;
  int ALPHANUM = 19;
  int DOT = 20;
  int QUOTEDPAIR = 21;
  int ANY = 22;

  int DEFAULT = 0;
  int INCOMMENT = 1;
  int NESTED_COMMENT = 2;
  int INQUOTEDSTRING = 3;

  String[] tokenImage = {
    "<EOF>",
    "\",\"",
    "\"-\"",
    "<WS>",
    "\"(\"",
    "\")\"",
    "<token of kind 6>",
    "\"(\"",
    "<token of kind 8>",
    "<token of kind 9>",
    "\"(\"",
    "\")\"",
    "<token of kind 12>",
    "\"\\\"\"",
    "<token of kind 14>",
    "<token of kind 15>",
    "\"\\\"\"",
    "<DIGITS>",
    "<ALPHA>",
    "<ALPHANUM>",
    "\".\"",
    "<QUOTEDPAIR>",
    "<ANY>",
  };

}
