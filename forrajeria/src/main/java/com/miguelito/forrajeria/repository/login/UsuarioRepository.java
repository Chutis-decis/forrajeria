package com.miguelito.forrajeria.repository.login;

import com.miguelito.forrajeria.entity.login.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findByUserName(String userName);
}
