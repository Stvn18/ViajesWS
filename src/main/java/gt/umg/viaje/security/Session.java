package gt.umg.viaje.security;

import gt.umg.viaje.entities.User;
import gt.umg.viaje.entities.UserSession;
import gt.umg.viaje.repo.UsuarioSesionRepo;
import org.springframework.beans.factory.annotation.Autowired;


public class Session {
    
    @Autowired()
    private UsuarioSesionRepo usuarioSesionRepo;
    
    public boolean isSessionValid(String token, Integer userId) throws Exception {
        
        UserSession usuarioSesion = usuarioSesionRepo.findByTokenAndUsuario(token, new User());
        
        if(usuarioSesion == null){
            return false;
        }
        
        return usuarioSesion.getFechaFin().getTime() == usuarioSesion.getFechaInicio().getTime();
        
    }
    
    
}