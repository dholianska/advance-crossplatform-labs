package com.holianska.labnetwork.data.posts

import com.holianska.labnetwork.data.common.Result
import com.holianska.labnetwork.data.common.map
import com.holianska.labnetwork.data.posts.model.requests.NewPost
import com.holianska.labnetwork.data.posts.model.responses.Post
import com.holianska.labnetwork.data.posts.model.responses.Posts
import com.holianska.labnetwork.data.posts.service.PostApiService
import com.holianska.labnetwork.domain.posts.PostRepository

internal class AppPostRepository(
    private val postApiService: PostApiService
) : PostRepository {

    override suspend fun getAllPosts(): Result<Posts> {
        return postApiService.getAllPosts()
    }

    override suspend fun addPost(post: NewPost): Result<String> {
        return postApiService.addPost(post).map {
            it.toString()
        }
    }

    override suspend fun updatePost(post: Post): Result<String> {
        return postApiService.updatePost(post).map {
            it.toString()
        }
    }

    override suspend fun deletePost(postId: Int): Result<String> {
        return postApiService.deletePost(postId).map {
            it.toString()
        }
    }
}