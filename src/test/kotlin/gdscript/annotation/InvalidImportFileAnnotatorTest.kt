package gdscript.annotation

import BaseTest
import utils.addFile
import utils.addProjectFile
import utils.highlights
import utils.openScript

class InvalidImportFileAnnotatorTest : BaseTest() {

    fun `test warning when file doesn't exist`() {
        environment.openScript("""x = preload("res://missing.gd")""")
        environment.addProjectFile()
        val warning = environment.doHighlighting().first()
        assertEquals(warning.text, "\"res://missing.gd\"")
        assertEquals(warning.description, "Cannot resolve resource 'missing.gd'")
    }

    fun `test no warning when file doesn't exist but project file is missing`() {
        environment.openScript("""x = preload("res://missing.gd")""")
        assertEmpty(environment.highlights())
    }

    fun `test no warning when file exist`() {
        environment.openScript("""x = preload("res://util.gd")""")
        environment.addFile("util.gd")
        environment.addProjectFile()
        assertEmpty(environment.highlights())
    }

    fun `test no warning on user resource`() {
        environment.openScript("""x = "user://save.txt"""")
        environment.addProjectFile()
        assertEmpty(environment.highlights())
    }

}