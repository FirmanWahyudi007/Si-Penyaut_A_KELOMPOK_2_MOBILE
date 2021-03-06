package com.example.temanautis.Model;

public class DonateModel {
    private int id,donasi,users,nominal,konfirmasi;
    private String keterangan,tanggal,metode_pembayaran,bukti_transfer;

    public DonateModel(int id, int donasi, int users, int nominal, int konfirmasi, String keterangan, String tanggal, String metode_pembayaran, String bukti_transfer) {
        this.id = id;
        this.donasi = donasi;
        this.users = users;
        this.nominal = nominal;
        this.konfirmasi = konfirmasi;
        this.keterangan = keterangan;
        this.tanggal = tanggal;
        this.metode_pembayaran = metode_pembayaran;
        this.bukti_transfer = bukti_transfer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDonasi() {
        return donasi;
    }

    public void setDonasi(int donasi) {
        this.donasi = donasi;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getKonfirmasi() {
        return konfirmasi;
    }

    public void setKonfirmasi(int konfirmasi) {
        this.konfirmasi = konfirmasi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getMetode_pembayaran() {
        return metode_pembayaran;
    }

    public void setMetode_pembayaran(String metode_pembayaran) {
        this.metode_pembayaran = metode_pembayaran;
    }

    public String getBukti_transfer() {
        return bukti_transfer;
    }

    public void setBukti_transfer(String bukti_transfer) {
        this.bukti_transfer = bukti_transfer;
    }
}
