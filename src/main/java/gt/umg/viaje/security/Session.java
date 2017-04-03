package gt.umg.viaje.security;

import gt.umg.viaje.entities.User;
import gt.umg.viaje.entities.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import gt.umg.viaje.repo.UserSessionRepo;


public class Session {
    
    @Autowired()
    private UserSessionRepo userSessionRepo;
    
    public boolean isSessionValid(String token, Integer userId) throws Exception {
        
        UserSession usuarioSesion = userSessionRepo.findByTokenAndUsuario(token, new User());
        
        if(usuarioSesion == null){
            return false;
        }
        
        return usuarioSesion.getEndDate().getTime() == usuarioSesion.getStartDate().getTime();
        
    }
    
}