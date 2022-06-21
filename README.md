create database BDHospital;
use BDHospital;

-- drop table paciente	ok
CREATE TABLE PACIENTE(
	NUMPAC		int AUTO_INCREMENT PRIMARY KEY NOT NULL ,
	NOMPAC		varchar(30) not NULL ,		-- nombre
	APEPAC		varchar(70) not null,		-- apellido
	SEXPAC		char(1) not null,		-- sexo	M o F
	DNIPAC		char(8) not null,		-- dni	
	FNPAC		date,				-- fecha de nacimiento
	DIRPAC		varchar(50),  			-- direccion
	NUMUBI		char(6)				-- ubigeo direccion	
)
;
CREATE TABLE USUARIO		-- personal
(
	NUMUSU			int AUTO_INCREMENT PRIMARY KEY NOT NULL ,
	NOMUSU			varchar(50),
	USUUSU			char(5),
	PWDUSU			varchar(50),
	DNIUSU			char(8),	
	TELFUSU			VARCHAR(30),
	FNACUSU			date,
	CARGUSU			varchar(30) ,
	UBIUSU			CHAR(6),
	LEVUSU			CHAR(1)		-- niveles de acceso: 1 ADMIN , 2 OPERARIO
)
;
CREATE TABLE PROVEEDOR
(
	NUMPROV		int AUTO_INCREMENT primary key NOT NULL ,
	NOMPROV		varchar(80) not null,
	RUCPROV		char(11) not null,
	DIRPROV		varchar(100),
	TIPPROV		varchar(18),		-- laboratorio o distribuidor
	TELFPROV	varchar(50),
	COMPROV		varchar(80),		-- nombre comercial
	ABRPROV		varchar(8),		-- abreviatura del proveedor
	NUMUBI		char(6)
)
;

CREATE TABLE MEDICINA
(
	NUMMED		int AUTO_INCREMENT primary key  NOT NULL ,
	NOMGENMED	varchar(100),		-- nombre genérico del medicamento
	NOMCOMMED	varchar(80),		-- nombre comercial del medicamento
	COSMED		decimal(10,2),		-- costo
	PRECMED		decimal(10,2),		-- precio 
	PREMED		varchar(40),		-- presentación: frasco, tableta, tarro, etc
	CANTMED		int,			-- cantidad
	OBSMED		varchar(80),		-- observacion		
	FCHMED		datetime,		-- fecha de vencimiento 
	LOTMED		varchar(8),		-- lote
	NUMPROV		bigint			-- proveedor
)
;
CREATE TABLE DOC_VENTA
(
	NCOD_DOC	bigint AUTO_INCREMENT primary key,			-- codigo correlativo de la venta
	NUM_DOC		varchar(14) NOT NULL ,			-- 0002-123456
	TIP_DOC		char(10),				-- si es boleta , factura o ticket
	FCHING_DOC	datetime,		-- default getdate(),	-- fecha de la venta
	MONT_DOC	decimal(10,2),				-- monto total de la venta
	OBS_DOC		varchar(50),				-- observación
	NUMPAC		bigint					-- código del paciente
)
;
CREATE TABLE DETVENTA
(
	NUMMED		bigint  NOT NULL ,
	NCOD_DOC	bigint  NOT NULL ,
	CANTV_MED	int,					-- cantidad de medicina vendida
	STOTV_DOC	decimal(10,2),				-- subtotal de medicina vendida
	CONSTRAINT  XPKDETVENTA PRIMARY KEY (NUMMED  ASC,NCOD_DOC  ASC)
);

CREATE TABLE UBIGEO(
	NUMUBI		char(6) not null primary key,
	DPTOUBI		varchar(50),
	PROVUBI		varchar(50),
	DISTUBI		varchar(50)
);

INSERT INTO bdhospital.paciente (NOMPAC,APEPAC,SEXPAC,DNIPAC,FNPAC,	DIRPAC,NUMUBI) VALUES
('GERHARD JHON','DELGADO HUIVIN','M','46568659','1990/09/05','JR. ADOLFO VIERA 1035','150133'),
('NORMA KIMIE','HATA DE FARFAN','F','15419737','1947/12/22','JR. AUGUSTO B LEGUIA 228','150507'),
('ISABEL','CARHUAS BENDEZU','F','41298816','2015/06/18','CHILCAL NUEVO SAN JUAN MZ B LT. 10','150501'),
('MARTHA','CASTILLON DE LA CRUZ','F','15349147','1966/10/20','PRIMAVERA MZ. F','150102'),
('EDSSON','MORALES SAMBRANDO','M','47585802','1991/11/29','AV. MARISCAL BENAVIDES 1296','150501'),
('GERARDO','FLORIAN VILLAR','M','21886920','1972/10/18','AV. LIMA 101','150512'),
('MILY','ORE GARIBAY','F','41694224','1982/05/23','CENTRO POBLADO LAURA CALER','150514'),
('NIEVES','GOMEZ DE NARVAEZ','F','15343789','1958/11/01','URB. SAN AGUSTIN MZ.E LT.10','150501'),
('MARI YSABEL','NACO OSIRO','F','15429912','1965/07/04','FUNDO CANTA GALLO S/N','150507'),
('JUAN CARLOS','REYES SANCHEZ','M','42504651','1982/03/08','JOSEFINA RAMOS MZ. F1 LT. 01','150507'),
('AMELIA','GUERRERO HUARI','F','07080714','1966/08/01','JR. SALABERRY 521','150514');
insert into ubigeo (NUMUBI,DPTOUBI,PROVUBI,DISTUBI) values 
('150501','LIMA','CAÑETE','SAN VICENTE DE CAÑETE'),
('150502','LIMA','CAÑETE','ASIA'),
('150503','LIMA','CAÑETE','CALANGO'),
('150504','LIMA','CAÑETE','CERRO AZUL'),
('150505','LIMA','CAÑETE','CHILCA'),
('150506','LIMA','CAÑETE','COAYLLO'),
('150507','LIMA','CAÑETE','IMPERIAL'),
('150508','LIMA','CAÑETE','LUNAHUANA'),
('150509','LIMA','CAÑETE','MALA'),
('150510','LIMA','CAÑETE','NUEVO IMPERIAL'),
('150511','LIMA','CAÑETE','PACARAN'),
('150512','LIMA','CAÑETE','QUILMANA'),
('150513','LIMA','CAÑETE','SAN ANTONIO'),
('150514','LIMA','CAÑETE','SAN LUIS'),
('150515','LIMA','CAÑETE','SANTA CRUZ DE FLORES'),
('150516','LIMA','CAÑETE','ZUÑIGA'),
('151001','LIMA','YAUYOS','YAUYOS'),
('151002','LIMA','YAUYOS','ALIS'),
('151003','LIMA','YAUYOS','AYAUCA'),
('151004','LIMA','YAUYOS','AYAVIRI'),
('151005','LIMA','YAUYOS','AZANGARO'),
('151006','LIMA','YAUYOS','CACRA'),
('151007','LIMA','YAUYOS','CARANIA'),
('151008','LIMA','YAUYOS','CATAHUASI'),
('151009','LIMA','YAUYOS','CHOCOS'),
('151010','LIMA','YAUYOS','COCHAS'),
('151011','LIMA','YAUYOS','COLONIA'),
('151012','LIMA','YAUYOS','HONGOS'),
('151013','LIMA','YAUYOS','HUAMPARA'),
('151014','LIMA','YAUYOS','HUANCAYA'),
('151015','LIMA','YAUYOS','HUANGASCAR'),
('151016','LIMA','YAUYOS','HUANTAN'),
('151017','LIMA','YAUYOS','HUAÑEC'),
('151018','LIMA','YAUYOS','LARAOS'),
('151019','LIMA','YAUYOS','LINCHA'),
('151020','LIMA','YAUYOS','MADEAN'),
('151021','LIMA','YAUYOS','MIRAFLORES'),
('151022','LIMA','YAUYOS','OMAS'),
('151023','LIMA','YAUYOS','PUTINZA'),
('151024','LIMA','YAUYOS','QUINCHES'),
('151025','LIMA','YAUYOS','QUINOCAY'),
('151026','LIMA','YAUYOS','SAN JOAQUIN'),
('151027','LIMA','YAUYOS','SAN PEDRO DE PILAS'),
('151028','LIMA','YAUYOS','TANTA'),
('151029','LIMA','YAUYOS','TAURIPAMPA'),
('151030','LIMA','YAUYOS','TOMAS'),
('151031','LIMA','YAUYOS','TUPE'),
('151032','LIMA','YAUYOS','VIÑAC'),
('151033','LIMA','YAUYOS','VITIS')


