package in.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Genders;

public interface GendersRepository extends JpaRepository<Genders, Serializable> {

}
