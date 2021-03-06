/**
 * 
 */
package org.ednovo.gooru.cassandra.core.dao;

import java.util.Collection;
import java.util.Map;

import com.netflix.astyanax.model.ColumnList;
import com.netflix.astyanax.model.Rows;

/**
 * @author Search Team
 * 
 */
public interface RawCassandraDao extends CassandraDao {

	void save(String key, Map<String, Object> entity);
	
	void save(String rowKey, String column, String value);
	
	void save(String key,
			Map<String, Object> entity,
			String prefix,
			boolean reset);
	
	ColumnList<String> read(String rowKey);
	
	Rows<String,String> getAll();
	
	Rows<String,String> read(Collection<String> keys);
	
	void delete(String... ids);
	
	void delete(String rowKey, String column);
	
}
