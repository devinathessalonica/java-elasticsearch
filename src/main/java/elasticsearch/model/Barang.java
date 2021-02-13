package elasticsearch.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "barang", shards = 1, replicas = 0, refreshInterval = "5s", createIndex = true)
public class Barang{

    @Id
	private String id;

    @Field(type = FieldType.Text)
	private String nama;

    @Field(type = FieldType.Integer)
	private int status;


	public Barang() {

	}

	public Barang(String id, String nama, int status) {
		this.id = id;
		this.nama = nama;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Barang [id=" + id + ", nama=" + nama + ", status=" + status + "]";
	}
}