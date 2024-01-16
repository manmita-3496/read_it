package com.example.reddit.Repository;

import com.example.reddit.model.AccountVerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<AccountVerificationToken,Long> {
    Optional<AccountVerificationToken> findByToken(String token);
}
