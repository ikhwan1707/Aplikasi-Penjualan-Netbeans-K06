/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author iLumniX
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Date;
import java.text.SimpleDateFormat;

import koneksi.koneksi;

public class PenjualanController {

    private final Connection cn = koneksi.getKoneksi();

    public String Tanggal() {
        SimpleDateFormat formatTanggal = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggalSekarang = new Date();
        String tanggal = formatTanggal.format(tanggalSekarang);
        return tanggal;
    }
    
    public List<String[]> mencariNoFaktur(String noFaktur) {
        List<String[]> dataPenjualan = new ArrayList<>();
        try {
            String query = "SELECT a.NoFaktur, a.TglPenjualan, a.IDPetugas, b.NamaPetugas "+
                           "FROM tblpenjualan AS a "+
                           "JOIN tblpetugas AS b ON b.IDPetugas = a.IDPetugas "+
                           "WHERE a.NoFaktur = ?";
            
            try (PreparedStatement ps = cn.prepareStatement(query)) {
                ps.setString(1, noFaktur);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        String NoFaktur = rs.getString("NoFaktur");
                        String TglPenjualan = rs.getString("TglPenjualan");
                        String IdPetugas = rs.getString("IDPetugas");
                        String NamaPetugas = rs.getString("NamaPetugas");
                        String[] data = {NoFaktur, TglPenjualan, IdPetugas, NamaPetugas};
                        dataPenjualan.add(data);
                    }
                    rs.close();
                }
                ps.close();
            }
            
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return dataPenjualan;
    }
    
    public List<String[]> IndexPenjualanBarang() {
        List<String[]> dataPenjualan = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        
//      Eksekusi kode
        try {
            List<String> detail = new ArrayList<>();
            String query = "SELECT * FROM tblpetugas";
            String queryDetail = "SELECT a.NoFaktur AS noFaktur, b.NamaBarang AS namaBarang FROM tbldetailbarang AS a JOIN tblbarang AS b ON b.KodeBarang = a.KodeBarang WHERE a.NoFaktur = ?";
            try (PreparedStatement ps = cn.prepareStatement(query)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        String noFaktur = rs.getString("NoFaktur");
                        
//                      Mengabil data barang pada tbl detail penjualan
                        try (PreparedStatement psd = cn.prepareStatement(queryDetail)) {
                            psd.setString(1, noFaktur);
                            try (ResultSet rsd = ps.executeQuery()) {
                                if (rsd.next()) {
                                    String namaBarang = rs.getString("namaBarang");
                                    detail.add(namaBarang);
                                }
                            }
                        }
                        
//                      Mengubah array menjadi String gabungan
                        for (String dataNamaBarang : detail) {
                            result.append(dataNamaBarang).append(", ");
                        }
                        
//                      Menghapus extra nya
                        if (result.length() > 0) {
                            result.setLength(result.length() - 2);
                        }
                        
                        String namaBarang = result.toString();
                        String tglPenjualan = rs.getString("TglPenjualan");
                        String idPetugas = rs.getString("IDPetugas");
                        String bayar = rs.getString("Bayar");
                        String sisa = rs.getString("Sisa");
                        String total = rs.getString("Total");
                        String[] data = {noFaktur, namaBarang, tglPenjualan, idPetugas, bayar, sisa, total};
                        dataPenjualan.add(data);
                    }
                    rs.close();
                }
                ps.close();
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return dataPenjualan;
    }

    public void Store() {
        
    }

    public void Delete() {
    }
}
