package random.algorithms

import java.util.*

data class InsertRequest(val value: String, val dependencies: List<String>)

private fun List<String>.filterNotEmpty(): List<String> {
  return this.filter { it.isNotEmpty() }
}

class DependencyGraph(reqs: List<InsertRequest>) {

  private val roots = mutableListOf<Node>()
  private val addQueue : Queue<InsertRequest> = ArrayDeque<InsertRequest>()

  init {
    reqs.forEach { addQueue += it }
    processAdds()
  }

  private fun find(value: String): Node? {
    roots.forEach { it.find(value)?.let { return it } }
    return null
  }

  data class Node(private val value: String) {
    private val provisions = mutableListOf<Node>()
    private val dependencies = mutableListOf<Node>()

    fun find(value: String): Node? {
      if (value == this.value) return this
      provisions.forEach {
        it.find(value)?.let { return it }
      }
      return null
    }

    fun provisionsFor(node: Node) {
      this.provisions += node
      node.dependencies += this
    }

    fun getAncestors(): List<Node> {
      val list = mutableListOf<Node>()
      list.addAll(dependencies)
      dependencies.forEach { list.addAll(it.getAncestors()) }
      return list
    }

    override fun toString(): String {
      val provisionsString = provisions.map { it.toString() }.filterNotEmpty().joinToString()
      return listOf(value, provisionsString).filterNotEmpty().joinToString()
    }
  }

  private fun processAdds() {
    while (addQueue.isNotEmpty()) {
      val next : InsertRequest = addQueue.remove()
      val deps = next.dependencies
                  .map { find(it) }
      if (deps.any { it == null }) {
        addQueue += next
        continue
      }
      val directDeps = deps.filterDirectDependencies()
      val newNode = Node(next.value)
      if (directDeps.isEmpty()) {
        roots += newNode
      } else {
        directDeps.forEach { it.provisionsFor(newNode) }
      }
    }
  }

  private fun List<Node?>.filterDirectDependencies(): List<Node> {
    val dependencies = this.filterNotNull()
    return dependencies.filter { dep ->
      dependencies.none { each -> each.getAncestors().contains(dep) }
    }
  }

  override fun toString(): String {
    return roots.joinToString { it.toString() }
  }

}