create table if not exists user_account
(
	id_user integer not null
		constraint user_account_pkey
			primary key,
	email varchar(255),
	hidden boolean,
	last_name varchar(255),
	first_name varchar(255),
	password varchar(255)
);

alter table user_account owner to usr_gotham;

create table if not exists role
(
	id_role integer not null
		constraint role_pkey
			primary key,
	role varchar(255)
);

alter table role owner to usr_gotham;

create table if not exists team
(
	id_team integer not null
		constraint team_pkey
			primary key,
	id_manager integer not null
		constraint id_manager
			references user_account,
	id_teamate integer
		constraint id_teamate
			references user_account,
	team_name varchar(255)
);

alter table team owner to usr_gotham;

create table if not exists user_role
(
	id_user integer not null
		constraint fkmsj2itk680u3kf123ap4u35ew
			references user_account,
	id_role integer not null
		constraint fk2aam9nt2tv8vcfymi3jo9c314
			references role,
	constraint user_role_pkey
		primary key (id_user, id_role)
);

alter table user_role owner to usr_gotham;

create table if not exists clock
(
	id_clock serial not null
		constraint clock_pk
			primary key,
	id_employee integer not null
		constraint id_empoyee
			references user_account,
	date_clock_in timestamp not null,
	date_clock_out timestamp
);

alter table clock owner to usr_gotham;

