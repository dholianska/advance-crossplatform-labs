package com.holianska.labnetwork.data.posts.service

import com.holianska.labnetwork.data.common.Result
import com.holianska.labnetwork.data.posts.model.requests.NewPost
import com.holianska.labnetwork.data.posts.model.responses.DeletedPost
import com.holianska.labnetwork.data.posts.model.responses.Post
import com.holianska.labnetwork.data.posts.model.responses.Posts

internal const val BASE_URL = "https://dummyjson.com/"
internal const val POSTS_API = "posts"

internal const val ADD_POST = "add"

internal interface PostApiService {
    suspend fun getAllPosts(): Result<Posts>
    suspend fun addPost(post: NewPost): Result<Post>
    suspend fun updatePost(post: Post): Result<Post>
    suspend fun deletePost(postId: Int): Result<DeletedPost>
}