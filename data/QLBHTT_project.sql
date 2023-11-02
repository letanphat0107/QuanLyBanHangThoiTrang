create database QLBHTT_new1
go
use QLBHTT_new1
go

create table NhanVien (
	maNV nvarchar(10) not null, 
	hoTen nvarchar(30) not null,
	chucvu nvarchar(20) not null,
	email nvarchar(30) not null unique,
	sdt nvarchar(12) not null unique,
	diaChi nvarchar(200) not null,
	gioiTinh nvarchar(10) not null,
	trangThai bit --1: con hoat dong --0: da nghi viec

	primary key (maNV)
)
go
create table SanPham (
	maSP nvarchar(10) not null, 
	tenSP nvarchar(30) not null,
	soLuong int not null,
	giaBan float not null,
	giaNhap float not null,
	ngayNhap date not null,
	hinhAnh nvarchar(50) not null,
	maChatLieu nvarchar(10) not null,
	maKichThuoc nvarchar(10) not null,
	maMauSac nvarchar(10) not null,
	maPhanLoai nvarchar(10) not null,
	maNhaCungCap nvarchar(10) not null

	primary key (maSP)

) 
go

create table ChatLieu (
	maChatLieu nvarchar(10) not null,
	tenChatLieu nvarchar(30) not null

	primary key (maChatLieu)
)
go
create table KichThuoc (
	maKichThuoc nvarchar(10) not null,
	tenKichThuoc nvarchar(30) not null

	primary key (maKichThuoc)

)
go
create table MauSac (
	maMauSac nvarchar(10) not null,
	tenMauSac nvarchar(50) not null

	primary key (maMauSac)
)
go
create table PhanLoai (
	maPhanLoai nvarchar(10) not null,
	tenPhanLoai nvarchar(50) not null,

	primary key (maPhanLoai)
)

go
create table NhaCungCap (
	maNCC nvarchar(10) not null,
	tenNCC nvarchar(100) not null,
	diaChi nvarchar(100) not null,
	sdt nvarchar(12) not null unique,
	email nvarchar(40) not null unique,

	primary key (maNCC)
)
go
create table KhachHang (
	maKH nvarchar(10) not null,
	hoTen nvarchar(30) not null,
	sdt nvarchar(12) not null unique,
	email nvarchar(40) not null unique,
	gioiTinh nvarchar(10) not null

	primary key (maKH)
)
go
create table HoaDon (
	maHD nvarchar(10) not null,
	maKH nvarchar(10) not null,
	maNV nvarchar(10) not null,
	ngayLap date not null

	primary key (maHD)
)
go
create table CTHD (
	maHD nvarchar(10) not null,
	maSP nvarchar(10) not null,
	soLuong int not null,
	 
	primary key (maHD, maSP)
)
go
create table TaiKhoan (
	tenTaiKhoan nvarchar(20) not null,
	matKhau nvarchar(20) not null,
	phanQuyen nvarchar(20) not null,
	maNV nvarchar(10) not null,
	trangThai bit --1: con hoat dong --0: da nghi viec

	primary key (tenTaiKhoan)
)
go
create table PhieuDatHang(
	maPhieuDatHang nvarchar(10) not null,
	maKH nvarchar(10) not null,
	maNV nvarchar(10) not null,
	ngayLap date not null

	primary key (maPhieuDatHang)
)
go
create table CTPhieuDatHang (
	maPhieuDatHang nvarchar(10) not null,
	maSP nvarchar(10) not null,
	soLuong int not null,
	 
	primary key (maPhieuDatHang, maSP)
)
go
--Taoj Khoa ngoai--

--Khóa ngoại table SanPham
alter table SanPham add constraint FK_SP_PLoai foreign key (maPhanLoai) references PhanLoai(maPhanLoai)
go
alter table SanPham add constraint FK_SP_KThuoc foreign key (maKichThuoc) references KichThuoc(maKichThuoc)
go
alter table SanPham add constraint FK_SP_MauSac foreign key (maMauSac) references MauSac(maMauSac)
go
alter table SanPham add constraint FK_SP_NCC foreign key (maNhaCungCap) references NhaCungCap(maNCC)
go
alter table SanPham add constraint FK_SP_ChatLieu foreign key (maChatLieu) references ChatLieu(maChatLieu)
go
--Khóa ngoại table HoaDon
alter table HoaDon add constraint FK_HD_KhachHang foreign key (maKH) references KhachHang(maKH)
go
alter table HoaDon add constraint FK_HD_NhanVien foreign key (maNV) references NhanVien(maNV)
 go
 --Khóa ngoại table CTHD

 alter table CTHD add constraint FK_CTHD_HD foreign key (maHD) references HoaDon(maHD)
 go
 alter table CTHD add constraint FK_CTHD_SP foreign key (maSP) references SanPham(maSP)
 go
 --Khóa ngoại table PhieuDatHang
alter table PhieuDatHang add constraint FK_PDT_KhachHang foreign key (maKH) references KhachHang(maKH)
go
alter table PhieuDatHang add constraint FK_PDT_NhanVien foreign key (maNV) references NhanVien(maNV)
go 
 --Khóa ngoại table CTPhieuDatHang

 alter table CTPhieuDatHang add constraint FK_CTPDT_HD foreign key (maPhieuDatHang) references PhieuDatHang(maPhieuDatHang)
 go
 alter table CTPhieuDatHang add constraint FK_CTPDT_SP foreign key (maSP) references SanPham(maSP)
go
 --Khóa ngoại table Nhân viên
 alter table TaiKhoan add constraint FK_TK_NV foreign key (maNV) references NhanVien(maNV)
 go

 --DỮ LIỆU----

 --Phân Loại--
 insert into PhanLoai values ('PL0001', N'Áo');
 insert into PhanLoai values ('PL0002', N'Quần');
 insert into PhanLoai values ('PL0003', N'Nón');
 insert into PhanLoai values ('PL0004', N'Giày');
 insert into PhanLoai values ('PL0005', N'Thắt Lưng');
 go
 --Kích thước--
insert into KichThuoc values ('KT0001',N'S');
insert into KichThuoc values ('KT0002',N'M');
insert into KichThuoc values ('KT0003',N'L');
insert into KichThuoc values ('KT0004',N'XL');
insert into KichThuoc values ('KT0005',N'XXL');
go
--Màu sắc--
insert into MauSac values ('MS0001',N'Trắng');
insert into MauSac values ('MS0002',N'Đen');
insert into MauSac values ('MS0003',N'Xanh');
insert into MauSac values ('MS0004',N'Nâu');
insert into MauSac values ('MS0005',N'Vàng');
insert into MauSac values ('MS0006',N'Bạch kim');
insert into MauSac values ('MS0007',N'Xanh Lam');
insert into MauSac values ('MS0008',N'Hồng');
insert into MauSac values ('MS0009',N'Nâu');
insert into MauSac values ('MS0010',N'Đỏ');
go
--Chất liệu---
insert into ChatLieu values ('CL0001',N'Cotton');
insert into ChatLieu values ('CL0002',N'Vải gió dù');
insert into ChatLieu values ('CL0003',N'Vải Len');
insert into ChatLieu values ('CL0004',N'Vải Viscose');
insert into ChatLieu values ('CL0005',N'Vải Nỉ');
insert into ChatLieu values ('CL0006',N'Da');
go

--Khách hàng--
insert into KhachHang values ('KH0001', N'Nguyễn Văn A', '0367494954', 'vana@gmail.com','Nam');
insert into KhachHang values ('KH0002', N'Bùi Thị C', '0775214548', 'thic123@gmail.com', N'Nữ');
insert into KhachHang values ('KH0003', N'Bùi Văn Tài', '0967494204', 'vantai22@gmail.com','Nam');
insert into KhachHang values ('KH0004', N'Trần Thị Cẩm Sương', '0917458632', 'thicamsuong@gmail.com',N'Nữ');
insert into KhachHang values ('KH0005', N'Bách Ngọc Luân', '0367852142', 'ngocluan@gmail.com','Nam');
go

--Nhà cung cấp
insert into NhaCungCap values ('NCC001',N'Công Ty TNHH PARADOX Việt Nam',N'995 Nguyễn Trãi, Phường 14, Quận 5, TP. Hồ Chí Minh','0344800808','info@paradoxworldwide.com');
insert into NhaCungCap values ('NCC002',N'Công Ty TNHH Tm & May Mặc Thời Trang S.A',N'Hương Giang, Cư xá Bắc Hải, 10, Thành phố Hồ Chí Minh','0783970874','yatuan99@gmail.com');
insert into NhaCungCap values ('NCC003',N'Công ty TNHH May áo khoác Ann',N'68 đường C2, P 13, Q Tân Bình, TP HCM','0918567109','tranyenngoc9x@gmail.com');
insert into NhaCungCap values ('NCC004',N'Công ty TNHH May Thêu Giày An Phước',N'100/11-12 An Dương Vương, P.9, Q.5, Tp.Hồ Chí Minh','0383835005','maydodongphuc@anphuoc.com.vn');
insert into NhaCungCap values ('NCC005',N'Công ty TNHH May Dony',N'142/4 Bàu Cát 2, Phường 12, Quận Tân Bình, TP.HCM','0938842123','TrangphucDony@gmail.com');
insert into NhaCungCap values ('NCC006',N'Công Ty TNHH HADES',N'45 Phan Chu Trinh, P. Bến Thành, Quận 1, TP. Hồ Chí Minh','0367301102','support@hades.vn');
go

--Nhân Viên
insert into NhanVien values ('NV001',N'Lê Tấn Phát',N'Quản Lý','letanphat@gmail.com','0925365999',N'Long An', N'Nam',1);
insert into NhanVien values ('NV002',N'Phan Tiên Sinh',N'Nhân Viên','zatos1232@gmail.com','0367494904',N'Phú Yên', N'Nam',1);
insert into NhanVien values ('NV003',N'Ngô Văn Toàn',N'Nhân Viên','ngovantoan@gmail.com','0364581248',N'Phú Yên', N'Nam',1);
go
-- Tài khoản
insert into TaiKhoan values ('Admin','admin', N'Quản Lý','NV001',1);

insert into TaiKhoan values ('NV002','1111', N'Nhân Viên','NV002',1);
insert into TaiKhoan values ('NV003','1111', N'Nhân Viên','NV003',1);
go
--Sản phẩm
insert into sanPham values ('SP0001',N'Áo Hoodie Unisex',10,650000,700000,'2023-10-01','SP0001.jpg','CL0005','KT0002','MS0001','PL0001','NCC006');
insert into sanPham values ('SP0002',N'Nón xoè teelab', 15, 100000,110000,'2023-9-11','SP0002.jpg','CL0002','KT0005','MS0004','PL0003','NCC001');
insert into sanPham values ('SP0003',N'Giày thời trang nike',17,500000,550000,'2023-10-15','SP0003.jpg','CL0006','KT0004','MS0003','PL0004','NCC004');
insert into sanPham values ('SP0004',N'Áo Thun teelab TS173',10,225000,205000,'2023-10-16','SP0004.jpg','CL0001','KT0002','MS0001','PL0001','NCC006');
insert into sanPham values ('SP0005',N'Thắt lưng nam da cá sấu',12,300000,250000,'2023-9-11','SP0005.jpg','CL0006','KT0004','MS0003','PL0005','NCC001');
insert into sanPham values ('SP0006',N'Quần jean đen rách gối',10,225000,215000,'2023-10-01','SP0006.jpg','CL0006','KT0004','MS0002','PL0002','NCC001');
insert into sanPham values ('SP0007',N'Áo khoác gió chống nước Unisex',20,150000,250000,'2023-10-02','SP0007.jpg','CL0002','KT0004','MS0003','PL0001','NCC002');
insert into sanPham values ('SP0008',N'Giày thể thao vải',16,100000,110000,'2023-10-15','SP0008.jpg','CL0006','KT0005','MS0004','PL0004','NCC001');
insert into sanPham values ('SP0009',N'Áo khoác Kaki Nam ',10,200000,170000,'2023-9-29','SP0009.jpg','CL0001','KT0005','MS0002','PL0001','NCC005');
insert into sanPham values ('SP0010',N'Nón Lưỡi chai nike',10,70000,650000,'2023-10-12','SP0010.jpg','CL0002','KT0004','MS0003','PL0003','NCC002');
insert into sanPham values ('SP0011',N'Thắt lưng vải dù',13,65000,60000,'2023-10-12','SP00011.jpg','CL0003','KT0003','MS0002','PL0005','NCC001');
insert into sanPham values ('SP0012',N'Quần short nam lưng thun',15,95000,93000,'2023-10-01','SP0012.jpg','CL0005','KT0003','MS0007','PL0002','NCC005');
insert into sanPham values ('SP0013',N'Á Thun Cotton K1',17,130000,140000,'2023-10-16','SP0013.jpg','CL0001','KT0003','MS0002','PL0001','NCC006');
insert into sanPham values ('SP0014',N'Quần Jean Nam trơn cá tính',10,220000,210000,'2023-10-10','SP0014.jpg','CL0006','KT0002','MS0004','PL0002','NCC005');
insert into sanPham values ('SP0015',N'Áo sơ mi nam dài tay',10,200000,190000,'2023-10-10','SP0015.jpg','CL0004','KT0002','MS0002','PL0001','NCC001');

----Them gia tri vao table hoa don
insert into HoaDon values ('HD0001','KH0001','NV001','2023-10-12');
insert into HoaDon values ('HD0002','KH0002','NV002','2023-10-22');
insert into HoaDon values ('HD0003','KH0003','NV003','2023-10-05');
insert into HoaDon values ('HD0004','KH0004','NV001','2023-10-11');
insert into HoaDon values ('HD0005','KH0005','NV001','2023-09-02');
insert into HoaDon values ('HD0006','KH0001','NV001','2023-10-06');
insert into HoaDon values ('HD0007','KH0005','NV001','2023-10-10');
insert into HoaDon values ('HD0008','KH0003','NV001','2023-10-25');
insert into HoaDon values ('HD0009','KH0002','NV001','2023-10-07');
insert into HoaDon values ('HD0010','KH0001','NV001','2023-10-30');



----Them gia tri vao table chi tiet hoa don
insert into CTHD values ('HD0001','SP0004',2);
insert into CTHD values ('HD0001','SP0002',1);
insert into CTHD values ('HD0001','SP0003',1);

insert into CTHD values ('HD0002','SP0005',1);
insert into CTHD values ('HD0002','SP0004',1);
insert into CTHD values ('HD0002','SP0008',1);

insert into CTHD values ('HD0003','SP0008',1);
insert into CTHD values ('HD0003','SP0010',1);

insert into CTHD values ('HD0004','SP0007',1);

insert into CTHD values ('HD0005','SP0010',1);
go

select * from SanPham
select * from NhanVien
select * from NhaCungCap
select * from KichThuoc
select * from MauSac
select * from PhanLoai
select * from ChatLieu


Select * from NhanVien where maNV like '%%' and hoTen like '%%' and sdt like '%%' and email like '%%' and chucVu like '%%' and diaChi like '%%' and trangThai = 0

--Lấy sản phẩm theo các tiêu chí
select * from SanPham sp JOIN PhanLoai pl ON sp.maPhanLoai = pl.maPhanLoai 
						 JOIN MauSac ms ON sp.maMauSac = ms.maMauSac
						 JOIN KichThuoc kt ON sp.maKichThuoc = kt.maKichThuoc
where pl.maPhanLoai like '%%' and ms.maMauSac like '%%'	and kt.maKichThuoc like '%KT0005%' and sp.soLuong = 0		 

--Lấy sản phẩm quần áo
select * from SanPham sp JOIN PhanLoai pl ON sp.maPhanLoai = pl.maPhanLoai 
where pl.maPhanLoai like '%PL0001%' or pl.maPhanLoai like '%PL0002%'

--Lấy sản phẩm phụ kiện
select * from SanPham sp JOIN PhanLoai pl ON sp.maPhanLoai = pl.maPhanLoai 
where pl.maPhanLoai like '%PL0003%' or pl.maPhanLoai like '%PL0004%' or pl.maPhanLoai like '%PL0005%'

--Lấy top 5 sản phẩm bán cháyt gửi
select sp.maSP, SUM(cthd.soLuong) as tongSoLuongBan from SanPham sp 
                                     JOIN CTHD cthd ON sp.maSP = cthd.maSP
                                      JOIN HoaDon hd ON cthd.maHD = hd.maHD
where sp.maSP = 'SP0004'
                    group by sp.maSP
                    order by tongSoLuongBan desc
--Lấy hóa đơn theo mã
select * from CTHD cthd  JOIN SanPham sp ON cthd.maSP = sp.maSP
where cthd.maHD = 'HD00001'

--Tính thành tiền của từng sản phẩm ứng với mỗi hóa đơn
select sp.maSP, sp.tenSP, cthd.soLuong, cthd.soLuong*sp.giaBan as thanhTien from CTHD cthd  JOIN SanPham sp ON cthd.maSP = sp.maSP
where cthd.maHD = 'HD00003' and cthd.maSP = 'SP0001'

--Tính tổng tiền của hóa đơn 
select cthd.maSP,sp.tenSP,hd.maHD, SUM( cthd.soLuong*sp.giaBan) as tongTien from HoaDon hd 
				JOIN  CTHD cthd ON hd.maHD = cthd.maHD 
				JOIN SanPham sp ON cthd.maSP = sp.maSP
where hd.maHD = 'HD00001'
group by hd.maHD,cthd.maSP,sp.tenSP

--lấy danh sách hóa đơn từ ngày này đến ngày kia
Select * from HoaDon where ngayLap >='04-04-2023' and ngayLap <= '05-04-2023'

select * from PhanLoai

SELECT COUNT(CASE WHEN pl.tenPhanLoai = N'Áo' THEN 1 END) AS SoLuongAo, 
                    COUNT(CASE WHEN pl.tenPhanLoai = N'Quần' THEN 1 END) AS SoLuongQuan, 
                    COUNT(CASE WHEN pl.tenPhanLoai = N'Nón' THEN 1 END) AS SoLuongNon, 
					COUNT(CASE WHEN pl.tenPhanLoai = N'Giày' THEN 1 END) AS SoLuongGiay, 
					COUNT(CASE WHEN pl.tenPhanLoai = N'Thắt Lưng' THEN 1 END) AS SoLuongThatLung
                    FROM SanPham sp JOIN PhanLoai pl ON sp.maPhanLoai = pl.maPhanLoai 
					group by pl.maPhanLoai

SELECT maPhanLoai, COUNT(*) AS SoLuongSanPham
FROM sanPham
GROUP BY maPhanLoai
ORDER BY maPhanLoai;

select  sum(cthd.soLuong) as soLuongBanDuoc from HoaDon hd join CTHD cthd on hd.maHD=cthd.maHD
					join SanPham sp on cthd.maSP=sp.maSP
						join PhanLoai pl on pl.maPhanLoai=sp.maPhanLoai 
						join KichThuoc kc on kc.maKichThuoc=sp.maKichThuoc
						join MauSac ms on ms.maMauSac=sp.maMauSac
						join ChatLieu cl on cl.maChatLieu=sp.maChatLieu
						join NhaCungCap ncc on ncc.maNCC=sp.maNhaCungCap
	where cthd.maSP= 'SP0004'
	group by cthd.maSP

select sp.maSP from HoaDon hd join CTHD cthd on hd.maHD=cthd.maHD
                   				join SanPham sp on cthd.maSP=sp.maSP                    			
               		group by sp.maSP

select cthd.maSP from HoaDon hd join CTHD cthd on hd.maHD=cthd.maHD
                   						join SanPham sp on cthd.maSP=sp.maSP
                   						join PhanLoai pl on pl.maPhanLoai=sp.maPhanLoai 
                   						join KichThuoc kt on kt.maKichThuoc=sp.maKichThuoc
                    					join MauSac ms on ms.maMauSac=sp.maMauSac
                    					join ChatLieu cl on cl.maChatLieu=sp.maChatLieu
                    					join NhaCungCap ncc on ncc.maNCC=sp.maNhaCungCap
      	where ms.tenMauSac like '%%' and kt.tenKichThuoc like '%%' and pl.tenPhanLoai like '%%' and hd.ngayLap >= '2023-9-10' and  hd.ngayLap <= '2023-10-15'
		group by cthd.maSP;
-- Lấy doanh thu theo tháng
select  MONTH(hd.ngayLap) as thang, sum(sp.giaBan*cthd.soLuong) as doanhThu from HoaDon hd join CTHD cthd on hd.maHD=cthd.maHD
                   						join SanPham sp on cthd.maSP=sp.maSP
		group by MONTH(hd.ngayLap);

--Lấy dữ liệu doanh thu theo tháng
-- Dùng With để tạo ra bảng dữ liệu tạm thời, dùng UNION để lưu dữ liệu tạm thời
WITH AllMonths AS (
    SELECT 1 AS thang
    UNION SELECT 2
    UNION SELECT 3
    UNION SELECT 4
    UNION SELECT 5
    UNION SELECT 6
    UNION SELECT 7
    UNION SELECT 8
    UNION SELECT 9
    UNION SELECT 10
    UNION SELECT 11
    UNION SELECT 12
)
SELECT allM.thang, SUM(sp.giaBan*cthd.soLuong) AS doanhThu
FROM AllMonths allM
LEFT JOIN HoaDon hd ON MONTH(hd.ngayLap) = allM.thang
LEFT JOIN CTHD cthd ON hd.maHD = cthd.maHD
LEFT JOIN SanPham sp ON cthd.maSP = sp.maSP
GROUP BY allM.thang


