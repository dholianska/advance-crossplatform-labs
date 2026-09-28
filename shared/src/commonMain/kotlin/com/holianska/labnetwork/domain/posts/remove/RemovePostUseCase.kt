package com.holianska.labnetwork.domain.posts.remove

import com.holianska.labnetwork.data.common.Result
import com.holianska.labnetwork.domain.posts.PostRepository

internal class RemovePostUseCase(
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(postId: Int): Result<String> {
        return postRepository.deletePost(postId)
    }
}