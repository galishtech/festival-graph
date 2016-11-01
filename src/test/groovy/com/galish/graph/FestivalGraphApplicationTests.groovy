package com.galish.graph

import com.galish.graph.model.Festival
import com.galish.graph.repositories.graph.FestivalGraphRepository
import com.galish.graph.services.FestivalService
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.neo4j.ogm.annotation.GraphId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class FestivalGraphApplicationTests {

	private static final String FESTIVAL_NAME = "electric picnic"

	@Autowired
	FestivalService festivalService
	@Autowired
	FestivalGraphRepository festivalGraphRepository

	@Before
	void setup(){
		festivalGraphRepository.deleteAll()
	}

	@After
	void cleanup(){
		festivalGraphRepository.deleteAll()
	}

	@Test
	void contextLoads() {
	}

	@Test
	void createFestivalTest(){
		Festival f = festivalService.createFestival(new Festival(name:FESTIVAL_NAME))
		assert  f != null
		assert f.name == FESTIVAL_NAME


	}

}
