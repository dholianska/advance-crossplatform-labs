package com.holianska.labnetwork.domain.posts

import com.holianska.labnetwork.data.common.NetworkResult
import com.holianska.labnetwork.data.posts.PostApiService
import com.holianska.labnetwork.data.posts.model.requests.NewPost
import com.holianska.labnetwork.data.posts.model.responses.DeletedPost
import com.holianska.labnetwork.data.posts.model.responses.Post
import com.holianska.labnetwork.data.posts.model.responses.Posts

internal class AppPostRepository(
    private val postApiService: PostApiService
) : PostRepository {

    override suspend fun getAllPosts(): NetworkResult<Posts> {
        return postApiService.getAllPosts()
    }

    override suspend fun addPost(post: NewPost): NetworkResult<Post> {
        return postApiService.addPost(post)
    }

    override suspend fun updatePost(post: Post): NetworkResult<Post> {
        return postApiService.updatePost(post)
    }

    override suspend fun deletePost(postId: Int): NetworkResult<DeletedPost> {
        return postApiService.deletePost(postId)
    }
}