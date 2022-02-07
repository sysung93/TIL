package com.example.restaurant.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

abstract public class MemoryDbRepositoryAbstract<T extends MemoryDbEntity> implements MemoryDbRepositoryIfs<T> {

    private final List<T> db = new ArrayList<>();
    private int index = 0;

    @Override
    public Optional<T> findById(int index) {
        //filter : db.stream에 들어있는 Type에 대한것
        //getindex : memoryDbEntity에 정의된 index를 의미
        //memoryDbEntity를 상속받은 객체는 getIndex를 통해 db에서 해당 index를 찾아 첫번째걸 옵셔널하게 리턴
        return db.stream().filter(it -> it.getIndex() == index).findFirst();
    }

    @Override
    public T save(T entity) {
        var optionalEntity = db.stream().filter(it -> it.getIndex() == entity.getIndex()).findFirst();

        if (optionalEntity.isEmpty()) {
            //db에 이미 데이터가 있는 경우 데이터 추가
            index++;
            entity.setIndex(index);
            db.add(entity);
            return entity;
        } else {
            //db에 데이터가 없는 경우 데이터를 삭제하고 추가
            var preIndex = optionalEntity.get().getIndex();
            entity.setIndex(preIndex);

            deleteById(preIndex);
            db.add(entity);
            return entity;
        }
    }

    @Override
    public void deleteById(int index) {
        var optionalEntity = db.stream().filter(it -> it.getIndex() == index).findFirst();
        if(optionalEntity.isPresent()){
            db.remove(optionalEntity.get());
        }
    }

    @Override
    public List<T> findAll() {
        return db;
    }
}
