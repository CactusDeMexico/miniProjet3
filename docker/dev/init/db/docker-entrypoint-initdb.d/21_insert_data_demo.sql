INSERT INTO public.role (id_role, role) VALUES (1, 'Employee');
INSERT INTO public.role (id_role, role) VALUES (2, 'Manager');
INSERT INTO public.role (id_role, role) VALUES (3, 'GeneraManager');
INSERT INTO public.user_account (id_user, email, hidden, last_name, first_name, password) VALUES (1, 'employee', true, 'Jean', 'Test', '123');
INSERT INTO public.user_account (id_user, email, hidden, last_name, first_name, password) VALUES (2, 'employee', true, 'Jean', 'Test', '123');
INSERT INTO public.user_account (id_user, email, hidden, last_name, first_name, password) VALUES (3, 'jt@gmail.com', true, 'Val', 'Lucie', '123');
INSERT INTO public.user_account (id_user, email, hidden, last_name, first_name, password) VALUES (4, 'dft@gmail.com', true, 'Danne', 'Marc', '123');
INSERT INTO public.user_role (id_user, id_role) VALUES (1, 1);
INSERT INTO public.user_role (id_user, id_role) VALUES (2, 1);
INSERT INTO public.user_role (id_user, id_role) VALUES (3, 1);
INSERT INTO public.user_role (id_user, id_role) VALUES (4, 1);