package com.billing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.query.Param;

import com.billing.entity.Aws;

@EnableMongoRepositories
public interface AwsRepository extends MongoRepository<Aws, String>{

//	List<Aws> findByusageDateBetween(LocalDate startDate, LocalDate endDate);
	
	List<Aws> findByStartDate(String startDate);
	
	List<Aws> findByService(String service);
	
//	@Query("{ 'service': ?0, 'startDate': { $gte: ?1, $lte: ?2 } }")
//    List<Aws> findByServiceAndStartDateBetween(String service, String startDate, String endDate);

	@Query("{ 'service': :service, 'startDate': { $gte: :startDate, $lte: :endDate } }")
	List<Aws> findByServiceAndStartDateAndEndDateBetween(@Param("service") String service,
	                                           @Param("startDate") String startDate,
	                                           @Param("endDate") String endDate);

	
//	@Query(value = "{ 'StartDate': { $gte: ?0, $lte: ?1 }, 'EndDate': { $gte: ?0, $lte: ?1 } }")
//	List<Aws> findByStartDateAndEndDateBetween(String startDate, String endDate);

	@Query("{ 'startDate': { $gte: :startDate, $lte: :endDate }, 'endDate': { $gte: :startDate, $lte: :endDate } }")
    List<Aws> findByStartDateAndEndDateBetween(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
