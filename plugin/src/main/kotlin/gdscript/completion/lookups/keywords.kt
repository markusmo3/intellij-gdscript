package gdscript.completion.lookups

import com.intellij.codeInsight.lookup.LookupElementBuilder.create

val REMOTE = create("remote").bold().withSpaceInsertHandler()
val SYNC = create("sync").bold().withSpaceInsertHandler()
val VAR = create("var").bold().withSpaceInsertHandler()
val CONST = create("const").bold().withSpaceInsertHandler()
val FUNC = create("func").bold().withSpaceInsertHandler()
val FOR = create("for").bold().withSpaceInsertHandler()
val WHILE = create("while").bold().withSpaceInsertHandler()
val CLASS = create("class").bold().withSpaceInsertHandler()
val EXTENDS = create("extends").bold().withSpaceInsertHandler()
val CLASS_NAME = create("class_name").bold().withSpaceInsertHandler()
val ENUM = create("enum").bold().withSpaceInsertHandler()
val IF = create("if").bold().withSpaceInsertHandler()
val ELIF = create("elif").bold().withSpaceInsertHandler()
val ELSE = create("else").bold().withSpaceInsertHandler()
val RETURN = create("return").bold().withSpaceInsertHandler()
val SIGNAL = create("signal").bold().withSpaceInsertHandler()
val EXPORT = create("export").bold().withSpaceInsertHandler()
val STATIC = create("static").bold().withSpaceInsertHandler()
val PUPPET = create("puppet").bold().withSpaceInsertHandler()
val MASTER = create("master").bold().withSpaceInsertHandler()
val MATCH = create("match").bold().withSpaceInsertHandler()
val TOOL = create("tool").bold()!!
val PASS = create("pass").bold()!!
val BREAK = create("break").bold()!!
val CONTINUE = create("continue").bold()!!
val SELF = create("self").bold()!!
val TRUE = create("true").bold()!!
val FALSE = create("false").bold()!!
val NULL = create("null").bold()!!
