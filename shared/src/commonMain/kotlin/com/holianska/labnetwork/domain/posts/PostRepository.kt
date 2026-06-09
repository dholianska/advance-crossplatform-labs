package com.holianska.labnetwork.domain.posts

import com.holianska.labnetwork.data.common.NetworkResult
import com.holianska.labnetwork.data.posts.model.requests.NewPost
import com.holianska.labnetwork.data.posts.model.responses.DeletedPost
import com.holianska.labnetwork.data.posts.model.responses.Post
import com.holianska.labnetwork.data.posts.model.responses.Posts

internal interface PostRepository {
    suspend fun getAllPosts(): NetworkResult<Posts>
    suspend fun addPost(post: NewPost): NetworkResult<Post>
    suspend fun updatePost(post: Post): NetworkResult<Post>
    suspend fun deletePost(postId: Int): NetworkResult<DeletedPost>
}