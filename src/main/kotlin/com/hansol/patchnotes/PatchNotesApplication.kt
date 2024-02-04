package com.hansol.patchnotes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PatchNotesApplication

fun main(args: Array<String>) {
	runApplication<PatchNotesApplication>(*args)
}
