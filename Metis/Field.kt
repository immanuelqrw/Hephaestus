data class Field(
  val name: String,
  val type: String,
  val default: Any? = null,
  val mutable: Boolean = false,
  val lastField: Boolean = false
)
