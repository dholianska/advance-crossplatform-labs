package com.holianska.labnetwork.domain.posts.create

import com.holianska.labnetwork.data.common.Result
import com.holianska.labnetwork.data.posts.model.requests.NewPost
import com.holianska.labnetwork.domain.posts.PostRepository

internal class CreatePostUseCase (
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(post: NewPost): Result<String> {
        return postRepository.addPost(post)
    }
}