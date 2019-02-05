package com.bloom.crudTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloom.crudTest.models.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
