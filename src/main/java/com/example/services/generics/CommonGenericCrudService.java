package com.example.services.generics;

import com.example.model.MainEntity;

import java.util.List;
import java.util.Optional;

/**
 * Projet :  Aurore
 * Package :  com.nfl.smartschool.service.inter
 * File :  CommonGenericCrudService
 * Author : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 * Created on : 2021, Monday 05 of July
 */
public interface CommonGenericCrudService <T extends MainEntity> {

    /**
     * Checks if a records having a given Id exists in database .
     *
     * @param id the entity's Id.
     * @return True if exists and false otherwise.
     */
    boolean existsById(Long id);

    /**
     * @param listeIds liste des identifiant de l'objet
     * @return true s'il en existe et false le cas echeant
     * @apiNote verifie s'il existe en BD des enregistrement avec ces id
     */
    boolean existsAllById(List<Long> listeIds);

    /**
     * Save a obj of a given Type .
     *
     * @param obj the entity to save.
     * @return the persisted entity.
     */
    T save(T obj);

    /**
     * Get all the records of this entity.
     *
     *
     * @return the list of entities.
     */
    List<T> findAll();

    /**
     * Get the a record from DB using it's ID
     *
     * @param id the id (Long) of the entity.
     * @return the entity.
     */
    Optional<T> findById(Long id);

    /**
     * Get the a record from DB using it's ID
     *
     * @param id the id (Long) of the entity.
     * @return the entity.
     */
     T getOne(Long id);

    /**
     * Delete the a record from DB using its ID.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
