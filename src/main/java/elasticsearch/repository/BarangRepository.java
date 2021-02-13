package elasticsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import elasticsearch.model.Barang;

public interface BarangRepository extends ElasticsearchRepository<Barang, String> {
    List<Barang> findAllByNama(String name);

    @Query("{\"match\":{\"name\":\"?0\"}}")
    List<Barang> findAllByNameUsingAnnotations(String name);
}