package elasticsearch.controller;

import elasticsearch.model.Barang;
import elasticsearch.service.BarangService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/barang")
@RequiredArgsConstructor
public class BarangController {

  @Autowired
  BarangService BarangService;

  @PostMapping
  public Barang createBarang(@RequestBody Barang barang) {
    return BarangService.createBarang(barang);
  }

  @GetMapping("/{id}")
  public Optional<Barang> getById(@PathVariable String id) {
    return BarangService.getBarang(id);
  }

  @DeleteMapping("/{id}")
  public boolean deleteById(@PathVariable String id) {
    BarangService.deleteBarang(id);
    return true;
  }

  @PostMapping("/_bulk")
  public List<Barang> insertBulk(@RequestBody List<Barang> barangs) {
    return (List<Barang>) BarangService.insertBulk(barangs);
  }

  @GetMapping("/name/{name}")
  public List<Barang> findAllByName(@PathVariable String name) {
    return BarangService.getBarangsByName(name);
  }

  @GetMapping("/name/{name}/annotations")
  public List<Barang> findAllByNameAnnotations(@PathVariable String name) {
    return BarangService.getBarangsByNameUsingAnnotation(name);
  }
}
