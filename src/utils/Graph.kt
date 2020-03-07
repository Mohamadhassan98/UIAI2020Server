package utils

// remove except for implementation
// interface not used to show that final implementation is not interface
expect class Graph<T>() {
    val nodeCount: Int
    val adjacencyList: MutableMap<T, MutableList<T>>
    val blockedList: MutableList<T>
    fun updateAdjacent(t: T, adjacent: List<T>)

    fun addToBlocked(t: T)

    fun removeFromBlocked(t: T)

    fun bfs(t: T, maxDepth: Int, action: (T) -> Unit = {})
}