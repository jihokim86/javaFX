create table  component_stock (
    component_code VARCHAR2(30),
    classify varchar2(20),
    com_count NUMBER(20),
    com_place varchar2(20),
    CONSTRAINT pk_component PRIMARY KEY (component_code)
);

INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('BT-01','배터리',5,'B17');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('BT-02','배터리',4,'B17');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('BT-03','배터리',4,'B17');

INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('CS-01','코일스프링',6,'C6');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('CS-02','코일스프링',3,'C6');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('CS-03','코일스프링',7,'C7');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('CS-04','코일스프링',7,'C7');

INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('EP-01','배기관',5,'E3');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('EP-02','배기관',4,'E3');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('EP-03','배기관',4,'E3');

INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('NS-01','나사',85,'N21');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('NS-02','나사',1100,'N21');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('NS-03','나사',135,'N22');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('NS-04','나사',273,'N22');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('NS-05','나사',285,'N22');

INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('SW-01','소음기',6,'S11');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('SW-02','소음기',7,'S11');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('SW-03','소음기',5,'S11');

INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('TI-01','타이어',7,'T7');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('TI-02','타이어',8,'T7');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('TI-03','타이어',12,'T8');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('TI-04','타이어',10,'T8');

INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('WH-01','휠',3,'W13');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('WH-02','휠',7,'W13');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('WH-03','휠',2,'W14');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('WH-04','휠',5,'W14');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('WH-05','휠',6,'W15');

INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('WP-01','와이퍼',35,'W19');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('WP-02','와이퍼',8,'W19');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('WP-03','와이퍼',15,'W19');
INSERT INTO component_stock(component_code,classify,com_count,com_place) VALUES ('WP-04','와이퍼',20,'W19');

commit;

select * from component_stock;