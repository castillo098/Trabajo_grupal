package com.example.aplicationlist.bda;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.room.Room;

import java.util.List;

public class PersonaLab {
    @SuppressLint("StaticFieldLeak")
    private static PersonaLab sPersonaLab;

    private PersonaDao mPersonaDao;

    public PersonaLab(Context context) {
        Context appContext = context.getApplicationContext();
        PersonaDatabase database = Room.databaseBuilder(appContext, PersonaDatabase.class, "persona")
                .allowMainThreadQueries().build();
        mPersonaDao = database.getPersonaDao();
    }

    public static PersonaLab get(Context context) {
        if (sPersonaLab == null) {
            sPersonaLab = new PersonaLab(context);
        }
        return sPersonaLab;
    }

    public Persona getPersonas(String nombre1) {
        return mPersonaDao.getPersona(nombre1);
    }

    public void addPersona(Persona persona) {
        mPersonaDao.addPersona(persona);
    }

    public void updatePersona(Persona persona) {
        mPersonaDao.updatePersona(persona);
    }

    public void deletePersona(Persona persona) {
        mPersonaDao.deletePersona(persona);
    }
    public void deleteAllPersona() {
        mPersonaDao.deleteAllPersona();
    }
}
