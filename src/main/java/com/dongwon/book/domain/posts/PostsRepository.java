package com.dongwon.book.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Entity 클래스와 기본 Entity Repository는 함께 위치해야 한다.
// 둘은 아주 밀접한 관계이고 기본 Repository 없이는 제대로 역할을 할 수가 없다.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
