package com.holianska.labnetwork.domain.posts

import com.holianska.labnetwork.data.common.Result
import com.holianska.labnetwork.data.posts.model.requests.NewPost
import com.holianska.labnetwork.data.posts.model.responses.Post
import com.holianska.labnetwork.data.posts.model.responses.Posts

internal interface PostRepository {
    suspend fun getAllPosts(): Result<Posts>
    suspend fun addPost(post: NewPost): Result<String>
    suspend fun updatePost(post: Post): Result<String>
    suspend fun deletePost(postId: Int): Result<String>
}