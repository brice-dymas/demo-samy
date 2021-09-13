package com.example.services.generics;

import com.example.model.MainEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Projet :  smartschoolweb
 * Package :  com.nfl.smartschool.service.impl.finance
 * File :  CommonGenericCrudServiceImpl
 * Author : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 * Created on : 2021, Tuesday 27 of July
 */
//@Service
@RequiredArgsConstructor
public class CommonGenericCrudServiceImpl<R extends JpaRepository<M, Long>, M extends MainEntity>
    implements CommonGenericCrudService<M> {

    protected final R repository;

    /**
     * Checks if a records having a given Id exists in database .
     *
     * @param id the entity's Id.
     * @return True if exists and false otherwise.
     */
    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    /**
     * @param listeIds liste des identifiant de l'objet
     * @return true s'il en existe et false le cas echeant
     * @apiNote verifie s'il existe en BD des enregistrement avec ces id
     */
    @Override
    public boolean existsAllById(List<Long> listeIds) {
        boolean existAll = true;
        int i = 0;
        while (existAll && i < listeIds.size()) {
            existAll = repository.existsById(listeIds.get(i));
            i++;
        }
        return existAll;
    }

    /**
     * Save a obj of a given Type .
     *
     * @param obj the entity to save.
     * @return the persisted entity.
     */
    @Override
    @Transactional
    public M save(M obj) {
        return repository.save(obj);
    }

    /**
     * Get all the records of this entity.
     *
     * @return the list of entities.
     */
    @Override
    public List<M> findAll() {
        return repository.findAll();
    }

    /**
     * Get the a record from DB using it's ID
     *
     * @param id the id (Long) of the entity.
     * @return the entity.
     */
    @Override
    public Optional<M> findById(Long id) {
        return repository.findById(id);
    }

    /**
     * Get the a record from DB using it's ID
     *
     * @param id the id (Long) of the entity.
     * @return the entity.
     */
    @Override
    public M getOne(Long id) {
        return repository.findById(id).get();
    }

    /**
     * Delete the a record from DB using its ID.
     *
     * @param id the id of the entity.
     */
    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
