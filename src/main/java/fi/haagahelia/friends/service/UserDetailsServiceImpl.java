package fi.haagahelia.friends.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fi.haagahelia.friends.domain.User;
import fi.haagahelia.friends.domain.UserRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	
	@Autowired 
	private UserRepository userrepository; 
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    { 
      User currentUser = userrepository.findByUsername(username);
      UserDetails user = new org.springframework.security.core
              .userdetails.User(username, currentUser.getPassword()
              , true, true, true, true, 
              AuthorityUtils.createAuthorityList(currentUser.getRole()));
          return user;
      }
}