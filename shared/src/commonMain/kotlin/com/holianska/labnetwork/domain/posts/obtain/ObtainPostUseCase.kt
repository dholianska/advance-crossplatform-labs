package com.holianska.labnetwork.domain.posts.obtain

import com.holianska.labnetwork.data.common.Result
import com.holianska.labnetwork.data.posts.model.responses.Posts
import com.holianska.labnetwork.domain.posts.PostRepository

internal class ObtainPostsUseCase(
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(): Result<Posts> {
        return postRepository.getAllPosts()
    }
}