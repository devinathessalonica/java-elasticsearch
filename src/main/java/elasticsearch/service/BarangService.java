package elasticsearch.service;

import elasticsearch.model.Barang;
import java.util.List;
import java.util.Optional;

public interface BarangService {

  Barang createBarang(Barang barang);

  Optional<Barang> getBarang(String id);

  void deleteBarang(String id);

  Iterable<Barang> insertBulk(List<Barang> barangs);

  List<Barang> getBarangsByName(String name);

  List<Barang> getBarangsByNameUsingAnnotation(String name);
}