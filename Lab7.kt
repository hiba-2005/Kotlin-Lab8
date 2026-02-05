// Step 1: Class to store a single comment (author + message)
class Comment(
    val userId: Int,
    val message: String
)

fun main() {

    // Step 2: List of comments (ordered, can contain many items)
    val comments: List<Comment> = listOf(
        Comment(524, "Nice code"),
        Comment(662, "Like it"),
        Comment(522, "What’s going on?"),
        Comment(900, "Check out my website"),
        Comment(881, "Hello everyone :)")
    )

    // Step 3: Set of blocked users (unique ids, fast membership test)
    val blockedUserIds: Set<Int> = setOf(522, 900)

    // Step 4: Map of relationships (key = userId, value = relation)
    val userIdToRelation: Map<Int, String> = mapOf(
        524 to "Friend",
        662 to "Work Colleague"
    )

    // Step 5 + Step 6 + Step 7: Filter, find relation, then print
    for (comment in comments) {

        // If the author is NOT blocked, show the comment
        if (comment.userId !in blockedUserIds) {

            // Step 6: find relation by userId; if absent -> "unknown"
            val relation: String = userIdToRelation[comment.userId] ?: "unknown"

            // Step 7: print in required format
            println("Comment ${comment.message} from $relation")
        }
    }
}