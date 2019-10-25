package gdscript.typing

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import gdscript.file.ScriptType
import uitlities.addCode

class ScriptQuoteHandlerTest : BasePlatformTestCase() {

    fun `test add double-quotes on new string and move caret inside`() {
        myFixture.addCode("x = <caret>")
        myFixture.type('"')
        myFixture.checkResult("x = \"<caret>\"")
    }

    fun `test remove double-quotes on BACKSPACE`() {
        myFixture.addCode("x = \"<caret>\"")
        myFixture.type('\b') // backslash
        myFixture.checkResult("x = <caret>")
    }

}