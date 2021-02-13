package elasticsearch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import elasticsearch.model.Barang;
import elasticsearch.repository.BarangRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BarangServiceImpl implements BarangService {

    @Autowired
    BarangRepository barangRepository;

    public Barang createBarang(Barang barang) {
        return barangRepository.save(barang);
    }

    public Optional<Barang> getBarang(String id) {
        return barangRepository.findById(id);
    }

    public void deleteBarang(String id) {
        barangRepository.deleteById(id);
    }

    public Iterable<Barang> insertBulk(List<Barang> barangs) {
        return barangRepository.saveAll(barangs);
    }

    public List<Barang> getBarangsByName(String name) {
        return barangRepository.findAllByNama(name);
    }

    public List<Barang> getBarangsByNameUsingAnnotation(String name) {
        return barangRepository.findAllByNameUsingAnnotations(name);
    }

}