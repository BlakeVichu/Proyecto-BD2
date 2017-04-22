create table usuario(id_usuario integer, nombre varchar2(30), apellido varchar2(40), constraint pk_id_usuario primary key (id_usuario));
create sequence sec_malostart with 1 increment by 1 nomaxvalue; /
create or replace procedure guardar_malo(my_id_usuario out integer, my_nombre in varchar2, my_apellido in varchar2)asbegin select sec_malo.nextval into my_id_usuario from dual; insert into usuario values(my_id_usuario, my_nombre, my_apellido);end; /

select * from usuario; 
