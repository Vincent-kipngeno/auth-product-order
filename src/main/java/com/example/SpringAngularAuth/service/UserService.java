package com.example.SpringAngularAuth.service;

import com.example.SpringAngularAuth.dto.LocalUser;
import com.example.SpringAngularAuth.dto.SignUpRequest;
import com.example.SpringAngularAuth.exception.OAuth2AuthenticationProcessingException;
import com.example.SpringAngularAuth.exception.UserAlreadyExistAuthenticationException;
import com.example.SpringAngularAuth.model.User;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import java.util.Optional;

import java.util.Map;

public interface UserService {
    public User registerNewUser(SignUpRequest SignUpRequest) throws UserAlreadyExistAuthenticationException;
    User findUserByEmail(String email);
    Optional<User> findUserById(Long id);
    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo) throws OAuth2AuthenticationProcessingException;
}
