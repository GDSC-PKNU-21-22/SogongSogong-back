package sogong.sogongSpring.dto.board

import java.io.Serializable

data class EntirePostDto(
    val userId: Long,
    var subject: String,
    var content: String,
    var picture: String? = null
) : Serializable
