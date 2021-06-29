package gomes.forum.service;

import gomes.forum.dto.PostDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

class PostServiceTest {

    PostService postService = Mockito.mock(PostService.class);

    @BeforeEach
    void setUp() {
        PostDTO dto = new PostDTO();
        dto.setCreatedDate(new Date());
        dto.setContent("test");
        Mockito.when(postService.list()).thenReturn(Collections.singletonList(dto));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createPost() {
    }

    @Test
    void list() {
        //given
        PostDTO post = new PostDTO();
        post.setCreatedDate(new Date());
        post.setContent("test");

        //when
        List<PostDTO> list = postService.list();

        //then
        assertEquals("Content must be the same", list.get(0).getContent(), post.getContent());
    }
}