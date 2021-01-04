package com.topology.TIETO.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.topology.TIETO.entity.Router;

@Repository
public class RouterDaoImp implements RouterDao {
		
		public Router[] parseFile(File file) throws Exception {
			ObjectMapper mapper = new ObjectMapper();
			Router[] router=mapper.readValue(file, Router[].class);
			for(int i=0;i<router.length;i++) {
				List<String> arrayOfIpForConnected = new ArrayList<String>();
				for(int j=0;j<router[i].getLinks();j++) {
					String ip = router[i].getIpAddress().substring(0,router[i].getIpAddress().lastIndexOf('.'));
					ip = ip+"."+String.valueOf(j);
					arrayOfIpForConnected.add(ip);
				}
				router[i].setLocalPc(arrayOfIpForConnected);
				System.out.println(arrayOfIpForConnected);	
			}
			return router;
		}
	}

