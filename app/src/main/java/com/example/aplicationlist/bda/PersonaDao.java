package com.example.aplicationlist.bda;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PersonaDao {



    @Query("SELECT * FROM persona WHERE nombre = :nombre1")
    Persona getPersona(String nombre1);

    @Insert
    void addPersona(Persona p);

    @Delete
    void deletePersona(Persona p);

    @Update
    void updatePersona(Persona p);

    @Query("DELETE FROM persona")
    void deleteAllPersona();



}
