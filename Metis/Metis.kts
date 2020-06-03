#!/usr/bin/env kscript
@file:DependsOn("com.hubspot.jinjava:jinjava:2.5.4")
@file:DependsOn("com.github.holgerbrandl:kscript-annotations:1.4")
@file:Include("Field.kt")
@file:Include("Resource.kt")

import java.io.File
import java.nio.charset.StandardCharsets
import com.hubspot.jinjava.Jinjava

val context: Map<String, Any> = Resource.loadResourceFromFile("example/kotlin-example.yml")
val template: String = File("templates/Kotlin.jinja").readText(StandardCharsets.UTF_8)

val jinjava: Jinjava = Jinjava()
val renderedTemplate: String = jinjava.render(template, context);

println(renderedTemplate)
