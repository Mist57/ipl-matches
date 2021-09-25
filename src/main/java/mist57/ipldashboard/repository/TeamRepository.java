package mist57.ipldashboard.repository;

import mist57.ipldashboard.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long>{

    Team findByTeamName(String teamName);

}