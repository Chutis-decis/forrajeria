package com.miguelito.forrajeria.service.login;

import com.miguelito.forrajeria.entity.login.Usuario;
import com.miguelito.forrajeria.repository.login.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDatailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //Carga un usuario
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = this.usuarioRepository.findByUserName(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("usuario" + username + " not found");
        }
        return usuario;
    }
}
