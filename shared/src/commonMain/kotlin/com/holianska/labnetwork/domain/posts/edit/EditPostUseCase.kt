package com.holianska.labnetwork.domain.posts.edit

import com.holianska.labnetwork.data.common.Result
import com.holianska.labnetwork.data.posts.model.responses.Post
import com.holianska.labnetwork.domain.posts.PostRepository

internal class EditPostUseCase(
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(post: Post): Result<String> {
        return postRepository.updatePost(post)
    }
}