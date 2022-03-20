package com.mountain.mountain.domain.comment.dao;


import com.mountain.mountain.domain.comment.model.Comment;
import com.mountain.mountain.domain.community.model.Community;
import com.mountain.mountain.domain.mountain.model.Mountain;
import com.mountain.mountain.domain.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRespository extends JpaRepository<Comment, Long> {


    Page<Comment> findByCommuNo(Community community, Pageable pageable); // Entity에서 Community = CommuNo

    Page<Comment> findByMountainNo(Mountain mountain, Pageable pageable);

    Page<Comment> findByUid(User user, Pageable pageable);

}
