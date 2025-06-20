package TestMongo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import Clases.Cliente;
import Clases.Detalle;
import Clases.Domicilio;
import Clases.Empleado;
import Clases.FormaDePago;
import Clases.Laboratorio;
import Clases.ObraSocial;
import Clases.Producto;
import Clases.Sucursal;
import Clases.Venta;
import Clases.ConexionMongo;

public class CargaDeDatos {

    public static void main(String[] args) {

        // Laboratorios
        Laboratorio lab1 = new Laboratorio(1, "Pfizer");
        Laboratorio lab2 = new Laboratorio(2, "Moderna");
        Laboratorio lab3 = new Laboratorio(3, "AstraZeneca");
        Laboratorio lab4 = new Laboratorio(4, "Johnson & Johnson");
        Laboratorio lab5 = new Laboratorio(5, "Roche");

        // Productos
        Producto producto1 = new Producto(1, 13000, "Medicamento", "Antibiotico cura la gripe fuerte", lab1);
        Producto producto2 = new Producto(2, 8500, "Medicamento", "Vacuna COVID vacuna contra COVID-19", lab2);
        Producto producto3 = new Producto(3, 4500, "Medicamento", "Ibuprofeno analgésico y antiinflamatorio", lab3);
        Producto producto4 = new Producto(4, 20000, "Medicamento", "Antidepresivo mejora el estado de ánimo", lab1);
        Producto producto5 = new Producto(5, 12000, "Medicamento", "Antiinflamatorio reduce inflamación y dolor", lab4);
        Producto producto6 = new Producto(6, 9000, "Medicamento", "Vitamina C refuerza el sistema inmunológico", lab5);
        Producto producto7 = new Producto(7, 18000, "Medicamento", "Analgésico fuerte alivia dolores intensos", lab3);
        
        Producto producto8 = new Producto(8, 7500, "Perfumeria", "Shampoo para uso diario", lab1);
        Producto producto9 = new Producto(9, 6500, "Perfumeria", "Perfume fragancia fresca unisex", lab2);
        Producto producto10 = new Producto(10, 4000, "Perfumeria", "Crema hidratante Crema para piel seca", lab4);

        
        
        // Obras sociales
        ObraSocial obraSocial1 = new ObraSocial(1, "Osde");
        ObraSocial obraSocial2 = new ObraSocial(2, "Ioma");
        ObraSocial obraSocial3 = new ObraSocial(3, "Swiss Medical");
        ObraSocial obraSocial4 = new ObraSocial(4, "Galeno");
        ObraSocial obraSocial5 = new ObraSocial(5, "Pami");
        ObraSocial obraSocial6 = new ObraSocial(6, "Medifé");

        // Domicilios
        Domicilio domicilio1 = new Domicilio(1, "Buenos Aires", "Lomas de Zamora", "España", 20);
        Domicilio domicilio2 = new Domicilio(2, "Buenos Aires", "caballito", "Alemania", 103);
        Domicilio domicilio3 = new Domicilio(3, "Buenos Aires", "Remedios de Escalada", "Marraspin", 230);
        Domicilio domicilio4 = new Domicilio(4, "Buenos Aires", "Temperley", "Calle Falsa", 123);
        Domicilio domicilio5 = new Domicilio(5, "Buenos Aires", "rafael calzada", "Monte Cuidado", 2023);
        Domicilio domicilio6 = new Domicilio(6, "Buenos Aires", "Palermo", "Avenida Libertador", 500);
        Domicilio domicilio7 = new Domicilio(7, "Buenos Aires", "Recoleta", "Calle Las Heras", 1234);
        Domicilio domicilio8 = new Domicilio(8, "Buenos Aires", "San Telmo", "Defensa", 256);
        Domicilio domicilio9 = new Domicilio(9, "Buenos Aires", "Belgrano", "Juramento", 789);
        Domicilio domicilio10 = new Domicilio(10, "Buenos Aires", "Villa Urquiza", "Olazábal", 300);
        Domicilio domicilio11 = new Domicilio(11, "Buenos Aires", "Villa Crespo", "Araoz", 456);
        Domicilio domicilio12 = new Domicilio(12, "Buenos Aires", "Almagro", "Corrientes", 789);
        Domicilio domicilio13 = new Domicilio(13, "Buenos Aires", "Flores", "Carabobo", 101);
        Domicilio domicilio14 = new Domicilio(14, "Buenos Aires", "Boedo", "San Juan", 202);
        Domicilio domicilio15 = new Domicilio(15, "Buenos Aires", "Nueva Pompeya", "Sáenz", 303);

        // Clientes
        Cliente cliente1 = new Cliente(1, "alfredo", "ivanovich", 45303968, "A0001", obraSocial1, domicilio1);
        Cliente cliente2 = new Cliente(2, "María", "López", 40123765, "A0002", obraSocial3, domicilio6);
        Cliente cliente3 = new Cliente(3, "Carlos", "Fernández", 38901234, "A0003", obraSocial4, domicilio7);
        Cliente cliente4 = new Cliente(4, "Sofía", "Ramírez", 42786543, "A0004", obraSocial5, domicilio11);
        Cliente cliente5 = new Cliente(5, "Diego", "Sánchez", 45567890, "A0005", obraSocial6, domicilio12);

        // Sucursales sin gerente aún
        Sucursal sucursal1 = new Sucursal(1, "Capital Federal", null, domicilio2);
        Sucursal sucursal2 = new Sucursal(2, "Zona Norte", null, domicilio8);
        Sucursal sucursal3 = new Sucursal(3, "Zona Sur", null, domicilio9);


        // Empleados
        Empleado empleado1 = new Empleado(1, "manuel", "Guerrero", 45123536, 1, obraSocial2, domicilio3, sucursal1);
        Empleado empleado2 = new Empleado(2, "pipa", "pipon", 45463576, 2, obraSocial2, domicilio4, sucursal1);
        Empleado empleado3 = new Empleado(3, "german", "garcia", 32464576, 3, obraSocial1, domicilio5, sucursal1);
        Empleado empleado4 = new Empleado(4, "Lucía", "Martínez", 46234567, 4, obraSocial3, domicilio10, sucursal2);
        Empleado empleado5 = new Empleado(5, "Jorge", "Ramírez", 47890123, 5, obraSocial4, domicilio7, sucursal2);
        Empleado empleado6 = new Empleado(6, "Ana", "González", 39988765, 6, obraSocial1, domicilio6, sucursal3);
        Empleado empleado7 = new Empleado(7, "Valentina", "Pérez", 41234567, 7, obraSocial5, domicilio15, sucursal2);
        Empleado empleado8 = new Empleado(8, "Martín", "Gómez", 43456789, 8, obraSocial6, domicilio11, sucursal3);

        Empleado empleado9 = new Empleado(9, "Laura", "Torres", 43890222, 9, obraSocial3, domicilio13, sucursal3);

        
        // Gerentes
        sucursal1.setGerente(empleado3);
        sucursal2.setGerente(empleado4);
        sucursal3.setGerente(empleado6);


        // Formas de pago
        FormaDePago formaDePago1 = new FormaDePago(1, "efectivo");
        FormaDePago formaDePago2 = new FormaDePago(2, "transferencia");
        FormaDePago formaDePago3 = new FormaDePago(3, "credito");
        FormaDePago formaDePago4 = new FormaDePago(4, "tarjeta de débito");
        FormaDePago formaDePago5 = new FormaDePago(5, "mercado pago");
        FormaDePago formaDePago6 = new FormaDePago(6, "cheque");
        FormaDePago formaDePago7 = new FormaDePago(7, "débito automático");

        // Detalles 
        Detalle detalle1 = new Detalle(1, 2, 13000, producto1);
        Detalle detalle2 = new Detalle(2, 1, 8500,  producto2);
        Detalle detalle3 = new Detalle(3, 3, 4500, producto3);
        Detalle detalle4 = new Detalle(4, 5, 12000,  producto5);
        Detalle detalle5 = new Detalle(5, 2, 9000,  producto6);
        
        Detalle detalle6 = new Detalle(6, 2, 8500, producto2);
        Detalle detalle7 = new Detalle(7, 3, 20000, producto4);
        Detalle detalle8 = new Detalle(8, 2, 4500, producto3);
        Detalle detalle9 = new Detalle(9, 3, 7500, producto8);
        Detalle detalle10 = new Detalle(10, 1, 6500, producto9);
        Detalle detalle11 = new Detalle(11, 2, 5000, producto10);
        Detalle detalle12 = new Detalle(12, 2, 13000, producto1);
        Detalle detalle13 = new Detalle(13, 1, 8500, producto2);
        Detalle detalle14 = new Detalle(14, 1, 20000, producto4);
        Detalle detalle15 = new Detalle(15, 1, 4500, producto3);
        Detalle detalle16 = new Detalle(16, 2, 7500, producto8);
        Detalle detalle17 = new Detalle(17, 1, 12000, producto5);
        Detalle detalle18 = new Detalle(18, 1, 6500, producto9);
        Detalle detalle19 = new Detalle(19, 1, 9000, producto6);
        Detalle detalle20 = new Detalle(20, 2, 5000, producto10);
        
        Detalle detalle61 = new Detalle(61, 3, 7500, producto10);
        Detalle detalle62 = new Detalle(62, 1, 9000, producto6);
        Detalle detalle63 = new Detalle(63, 2, 13500, producto9);
        Detalle detalle64 = new Detalle(64, 2, 13500, producto9);
        Detalle detalle65 = new Detalle(65, 3, 13000, producto1);
        Detalle detalle66 = new Detalle(66, 3, 9000, producto6);
        Detalle detalle67 = new Detalle(67, 1, 11000, producto8);
        Detalle detalle68 = new Detalle(68, 2, 8500, producto2);
        Detalle detalle69 = new Detalle(69, 3, 11000, producto8);
        Detalle detalle70 = new Detalle(70, 1, 13000, producto1);
        Detalle detalle71 = new Detalle(71, 2, 8500, producto2);
        Detalle detalle72 = new Detalle(72, 2, 8500, producto2);
        Detalle detalle73 = new Detalle(73, 3, 9000, producto6);
        Detalle detalle74 = new Detalle(74, 3, 13500, producto9);
        Detalle detalle75 = new Detalle(75, 3, 7500, producto10);
        Detalle detalle76 = new Detalle(76, 1, 13500, producto9);
        Detalle detalle77 = new Detalle(77, 3, 11000, producto8);
        Detalle detalle78 = new Detalle(78, 3, 20000, producto4);
        Detalle detalle79 = new Detalle(79, 3, 4500, producto3);
        Detalle detalle80 = new Detalle(80, 2, 13500, producto9);
        Detalle detalle81 = new Detalle(81, 1, 9000, producto6);
        Detalle detalle82 = new Detalle(82, 2, 20000, producto4);
        Detalle detalle83 = new Detalle(83, 2, 11000, producto8);
        Detalle detalle84 = new Detalle(84, 2, 13000, producto1);
        Detalle detalle85 = new Detalle(85, 3, 12000, producto5);
        Detalle detalle86 = new Detalle(86, 3, 13000, producto1);
        Detalle detalle87 = new Detalle(87, 3, 12000, producto5);
        Detalle detalle88 = new Detalle(88, 1, 8500, producto2);
        Detalle detalle89 = new Detalle(89, 1, 13000, producto1);
        Detalle detalle90 = new Detalle(90, 1, 12000, producto5);
        Detalle detalle91 = new Detalle(91, 1, 20000, producto4);
        Detalle detalle92 = new Detalle(92, 3, 18000, producto7);
        Detalle detalle93 = new Detalle(93, 3, 8500, producto2);
        Detalle detalle94 = new Detalle(94, 1, 20000, producto4);
        Detalle detalle95 = new Detalle(95, 3, 18000, producto7);
        Detalle detalle96 = new Detalle(96, 3, 7500, producto10);
        Detalle detalle97 = new Detalle(97, 3, 8500, producto2);
        Detalle detalle98 = new Detalle(98, 2, 13000, producto1);
        Detalle detalle99 = new Detalle(99, 2, 13000, producto1);
        Detalle detalle100 = new Detalle(100, 3, 13500, producto9);
        Detalle detalle101 = new Detalle(101, 1, 13500, producto9);
        Detalle detalle102 = new Detalle(102, 3, 7500, producto10);
        Detalle detalle103 = new Detalle(103, 1, 12000, producto5);
        Detalle detalle104 = new Detalle(104, 1, 13000, producto1);
        Detalle detalle105 = new Detalle(105, 2, 11000, producto8);
        Detalle detalle106 = new Detalle(106, 1, 20000, producto4);
        Detalle detalle107 = new Detalle(107, 2, 4500, producto3);
        Detalle detalle108 = new Detalle(108, 3, 12000, producto5);
        Detalle detalle109 = new Detalle(109, 1, 11000, producto8);
        Detalle detalle110 = new Detalle(110, 2, 13000, producto1);
        Detalle detalle111 = new Detalle(111, 1, 13000, producto1);
        Detalle detalle112 = new Detalle(112, 1, 11000, producto8);
        Detalle detalle113 = new Detalle(113, 1, 9000, producto6);
        Detalle detalle114 = new Detalle(114, 2, 13500, producto9);
        Detalle detalle115 = new Detalle(115, 2, 9000, producto6);
        Detalle detalle116 = new Detalle(116, 1, 20000, producto4);
        Detalle detalle117 = new Detalle(117, 2, 12000, producto5);
        Detalle detalle118 = new Detalle(118, 3, 12000, producto5);
        Detalle detalle119 = new Detalle(119, 3, 9000, producto6);
        Detalle detalle120 = new Detalle(120, 1, 8500, producto2);
        Detalle detalle121 = new Detalle(121, 1, 12000, producto5);


        // Ventas 
        Venta venta1 = new Venta(1, List.of(detalle1), LocalDate.of(2024, 5, 28), formaDePago1, empleado1, empleado2, cliente1);
        Venta venta2 = new Venta(2, List.of(detalle2), LocalDate.of(2024, 6, 15), formaDePago4, empleado4, empleado5, cliente2);
        Venta venta3 = new Venta(3, List.of(detalle3), LocalDate.of(2024, 6, 20), formaDePago5, empleado6, empleado1, cliente3);
        Venta venta4 = new Venta(4, List.of(detalle4), LocalDate.of(2024, 7, 1), formaDePago6, empleado7, empleado8, cliente4);
        Venta venta5 = new Venta(5, List.of(detalle5), LocalDate.of(2024, 7, 10), formaDePago7, empleado8, empleado7, cliente5);

        
        Venta venta6 = new Venta(6, List.of(detalle6), LocalDate.of(2024, 5, 18), formaDePago6, empleado2, empleado1, cliente1);
        Venta venta7 = new Venta(7, List.of(detalle7), LocalDate.of(2024, 7, 19), formaDePago4, empleado2, empleado1, cliente4);
        Venta venta8 = new Venta(8, List.of(detalle8, detalle9), LocalDate.of(2024, 6, 29), formaDePago1, empleado2, empleado3, cliente1);
        Venta venta9 = new Venta(9, List.of(detalle10, detalle11), LocalDate.of(2024, 7, 2), formaDePago6, empleado2, empleado3, cliente2);
        Venta venta10 = new Venta(10, List.of(detalle12), LocalDate.of(2024, 6, 25), formaDePago2, empleado1, empleado1, cliente4);
        Venta venta11 = new Venta(11, List.of(detalle13, detalle14), LocalDate.of(2024, 6, 30), formaDePago3, empleado3, empleado2, cliente3);
        Venta venta12 = new Venta(12, List.of(detalle15), LocalDate.of(2024, 6, 22), formaDePago1, empleado4, empleado5, cliente3);
        Venta venta13 = new Venta(13, List.of(detalle16), LocalDate.of(2024, 6, 24), formaDePago7, empleado6, empleado5, cliente4);
        Venta venta14 = new Venta(14, List.of(detalle17, detalle18), LocalDate.of(2024, 7, 5), formaDePago2, empleado4, empleado6, cliente5);
        Venta venta15 = new Venta(15, List.of(detalle19, detalle20), LocalDate.of(2024, 6, 28), formaDePago5, empleado3, empleado2, cliente1);

        
        Venta venta16 = new Venta(16, List.of(detalle61, detalle62, detalle63), LocalDate.of(2024, 7, 8), formaDePago5, empleado7, empleado8, cliente2);
        Venta venta17 = new Venta(17, List.of(detalle64), LocalDate.of(2024, 6, 8), formaDePago1, empleado7, empleado4, cliente1);
        Venta venta18 = new Venta(18, List.of(detalle65, detalle66), LocalDate.of(2024, 5, 12), formaDePago1, empleado2, empleado4, cliente3);
        Venta venta19 = new Venta(19, List.of(detalle67, detalle68), LocalDate.of(2024, 7, 21), formaDePago3, empleado3, empleado2, cliente5);
        Venta venta20 = new Venta(20, List.of(detalle69), LocalDate.of(2024, 7, 8), formaDePago3, empleado5, empleado2, cliente1);
        Venta venta21 = new Venta(21, List.of(detalle70, detalle71), LocalDate.of(2024, 7, 19), formaDePago7, empleado1, empleado2, cliente2);
        Venta venta22 = new Venta(22, List.of(detalle72, detalle73, detalle74), LocalDate.of(2024, 6, 18), formaDePago6, empleado1, empleado3, cliente4);
        Venta venta23 = new Venta(23, List.of(detalle75, detalle76), LocalDate.of(2024, 5, 17), formaDePago4, empleado3, empleado4, cliente1);
        Venta venta24 = new Venta(24, List.of(detalle77, detalle78), LocalDate.of(2024, 5, 16), formaDePago4, empleado1, empleado7, cliente2);
        Venta venta25 = new Venta(25, List.of(detalle79), LocalDate.of(2024, 6, 1), formaDePago4, empleado1, empleado2, cliente2);
        Venta venta26 = new Venta(26, List.of(detalle80, detalle81), LocalDate.of(2024, 6, 20), formaDePago7, empleado4, empleado8, cliente3);
        Venta venta27= new Venta(27, List.of(detalle82), LocalDate.of(2024, 7, 19), formaDePago7, empleado3, empleado1, cliente4);
        Venta venta28 = new Venta(28, List.of(detalle83, detalle84, detalle85), LocalDate.of(2024, 6, 25), formaDePago3, empleado5, empleado7, cliente4);
        Venta venta29 = new Venta(29, List.of(detalle86, detalle87), LocalDate.of(2024, 5, 1), formaDePago7, empleado1, empleado7, cliente1);
        Venta venta30 = new Venta(30, List.of(detalle88), LocalDate.of(2024, 6, 10), formaDePago3, empleado3, empleado6, cliente2);
        Venta venta31 = new Venta(31, List.of(detalle89, detalle90, detalle91), LocalDate.of(2024, 7, 21), formaDePago7, empleado7, empleado3, cliente5);
        Venta venta32 = new Venta(32, List.of(detalle92), LocalDate.of(2024, 6, 2), formaDePago3, empleado8, empleado1, cliente2);
        Venta venta33 = new Venta(33, List.of(detalle93, detalle94), LocalDate.of(2024, 6, 12), formaDePago3, empleado8, empleado3, cliente5);
        Venta venta34 = new Venta(34, List.of(detalle95, detalle96), LocalDate.of(2024, 6, 21), formaDePago4, empleado1, empleado8, cliente3);
        Venta venta35 = new Venta(35, List.of(detalle97, detalle98), LocalDate.of(2024, 6, 5), formaDePago5, empleado6, empleado5, cliente1);
        Venta venta36 = new Venta(36, List.of(detalle99, detalle100), LocalDate.of(2024, 6, 2), formaDePago5, empleado8, empleado1, cliente2);
        Venta venta37 = new Venta(37, List.of(detalle101, detalle102), LocalDate.of(2024, 7, 12), formaDePago2, empleado3, empleado4, cliente1);
        Venta venta38 = new Venta(38, List.of(detalle103, detalle104, detalle105), LocalDate.of(2024, 5, 28), formaDePago1, empleado8, empleado2, cliente4);
        Venta venta39 = new Venta(39, List.of(detalle106, detalle107, detalle108), LocalDate.of(2024, 6, 26), formaDePago4, empleado6, empleado8, cliente1);
        Venta venta40 = new Venta(40, List.of(detalle109, detalle110), LocalDate.of(2024, 5, 8), formaDePago5, empleado1, empleado7, cliente2);
        Venta venta41 = new Venta(41, List.of(detalle111), LocalDate.of(2024, 5, 3), formaDePago1, empleado6, empleado8, cliente3);
        Venta venta42 = new Venta(42, List.of(detalle112, detalle113, detalle114), LocalDate.of(2024, 5, 5), formaDePago3, empleado8, empleado5, cliente2);
        Venta venta43 = new Venta(43, List.of(detalle115, detalle116, detalle117), LocalDate.of(2024, 6, 14), formaDePago2, empleado5, empleado6, cliente1);
        Venta venta44 = new Venta(44, List.of(detalle118, detalle119, detalle120), LocalDate.of(2024, 6, 5), formaDePago7, empleado7, empleado4, cliente4);
        Venta venta45 = new Venta(45, List.of(detalle121), LocalDate.of(2024, 5, 26), formaDePago5, empleado7, empleado5, cliente5);
        // Guardar como JSON (descomentar si querés exportarlos a archivos JSON)
        /*
        JsonSerializer.guardarComoJson(venta1, "venta1.json");
        JsonSerializer.guardarComoJson(venta2, "venta2.json");
        JsonSerializer.guardarComoJson(venta3, "venta3.json");
        JsonSerializer.guardarComoJson(venta4, "venta4.json");
        JsonSerializer.guardarComoJson(venta5, "venta5.json");
        */

        // Guardar en MongoDB
        ConexionMongo.conectar();

        ConexionMongo.guardarObjeto(venta1);
        ConexionMongo.guardarObjeto(venta2);
        ConexionMongo.guardarObjeto(venta3);
        ConexionMongo.guardarObjeto(venta4);
        ConexionMongo.guardarObjeto(venta5);
        ConexionMongo.guardarObjeto(venta6); 
        ConexionMongo.guardarObjeto(venta7);
        ConexionMongo.guardarObjeto(venta8);
        ConexionMongo.guardarObjeto(venta9);
        ConexionMongo.guardarObjeto(venta10);
        ConexionMongo.guardarObjeto(venta11);
        ConexionMongo.guardarObjeto(venta12);
        ConexionMongo.guardarObjeto(venta13);
        ConexionMongo.guardarObjeto(venta14);
        ConexionMongo.guardarObjeto(venta15);
        ConexionMongo.guardarObjeto(venta16);
        ConexionMongo.guardarObjeto(venta17);
        ConexionMongo.guardarObjeto(venta18);
        ConexionMongo.guardarObjeto(venta19);
        ConexionMongo.guardarObjeto(venta20);
        ConexionMongo.guardarObjeto(venta21);
        ConexionMongo.guardarObjeto(venta22);
        ConexionMongo.guardarObjeto(venta23);
        ConexionMongo.guardarObjeto(venta24);
        ConexionMongo.guardarObjeto(venta25);
        ConexionMongo.guardarObjeto(venta26);
        ConexionMongo.guardarObjeto(venta27);
        ConexionMongo.guardarObjeto(venta28);
        ConexionMongo.guardarObjeto(venta29);
        ConexionMongo.guardarObjeto(venta30);
        ConexionMongo.guardarObjeto(venta31);
        ConexionMongo.guardarObjeto(venta32);
        ConexionMongo.guardarObjeto(venta33);
        ConexionMongo.guardarObjeto(venta34);
        ConexionMongo.guardarObjeto(venta35);
        ConexionMongo.guardarObjeto(venta36);
        ConexionMongo.guardarObjeto(venta37);
        ConexionMongo.guardarObjeto(venta38);
        ConexionMongo.guardarObjeto(venta39);
        ConexionMongo.guardarObjeto(venta40);
        ConexionMongo.guardarObjeto(venta41);
        ConexionMongo.guardarObjeto(venta42);
        ConexionMongo.guardarObjeto(venta43);
        ConexionMongo.guardarObjeto(venta44);
        ConexionMongo.guardarObjeto(venta45);

        
        
        ConexionMongo.desconectar();
    }
}
