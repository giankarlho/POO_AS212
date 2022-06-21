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
)