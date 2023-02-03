package com.soumya.blog.services;

import com.soumya.blog.payloads.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);

}
