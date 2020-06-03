#!/usr/bin/env kscript
@file:DependsOn("com.hubspot.jinjava:jinjava:2.5.4")
@file:DependsOn("com.github.holgerbrandl:kscript-annotations:1.4")
@file:Include("DataClass.kt")
@file:Include("Resource.kt")

import java.io.File
import java.nio.charset.StandardCharsets
import com.hubspot.jinjava.Jinjava

val dataclasses: List<DataClass> = Resource.loadResourceFromFile("example/kotlin-example.yml")
val template: String = File("templates/Kotlin.jinja").readText(StandardCharsets.UTF_8)

val jinjava: Jinjava = Jinjava()
dataclasses.forEach { dataclass ->
  val context: Map<String, Any> = Resource.OBJECT_MAPPER.readValue(Resource.OBJECT_MAPPER.writeValueAsString(dataclass))
  val renderedTemplate: String = jinjava.render(template, context);

  println(renderedTemplate)
}
