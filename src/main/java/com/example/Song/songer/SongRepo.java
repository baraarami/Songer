package com.example.Song.songer;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SongRepo extends JpaRepository<Song, Integer> {

}
//    @Override
//    public List<Song> findAll() {
//        return null;
//    }
//
//    @Override
//    public List<Song> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Song> findAll(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public List<Song> findAllById(Iterable<Integer> integers) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Integer integer) {
//
//    }
//
//    @Override
//    public void delete(Song entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Integer> integers) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Song> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public <S extends Song> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Song> findById(Integer integer) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Song> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Song> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public Song getOne(Integer integer) {
//        return null;
//    }
//
//    @Override
//    public Song getById(Integer integer) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Song> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Song> boolean exists(Example<S> example) {
//        return false;
//    }
//}
