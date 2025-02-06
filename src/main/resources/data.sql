-- Check if the table 'pais' exists
--IF EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'pais')
--BEGIN
--    -- Drop the table if it exists
--    DROP TABLE pais;
--END;

INSERT INTO pais (id, nombre, descripcion, poblacion, continente, capital, moneda, esperanza_de_vida, forma_de_gobierno, tamanio)
VALUES(1, 'méxico',
'México es un país vibrante y diverso, conocido por su rica historia, cultura y tradiciones. Ubicado en América del Norte, limita al norte con Estados Unidos, al sur con Guatemala y Belice, al este con el Golfo de México y el Mar Caribe, y al oeste con el Océano Pacífico. México es el hogar de antiguas civilizaciones como los mayas y los aztecas, cuyos legados aún se pueden ver en sitios arqueológicos como Chichén Itzá y Teotihuacán. \nLa gastronomía mexicana, reconocida como Patrimonio Inmaterial de la Humanidad por la UNESCO, es famosa por sus sabores únicos y variados, desde tacos y tamales hasta mole y pozole. \nAdemás, el país cuenta con una impresionante biodiversidad, con paisajes que van desde desiertos y selvas tropicales hasta playas paradisíacas y montañas nevadas.',
127050000, 'america', 'Ciudad de méxico', 'peso mexicano (MXN)', '78.6 años', 'Federal', '2,000,000 km cuadrados');

INSERT INTO estado (id, nombre, descripcion, poblacion, abreviatura, tamanio, pais_id)
VALUES(27, 'tabasco',
'Tabasco es un estado ubicado en el sureste de México, conocido por su exuberante vegetación y su rica biodiversidad. Su capital es Villahermosa, una ciudad moderna que combina áreas urbanas con vastas zonas verdes. Tabasco es famoso por sus ríos, lagunas y pantanos, que forman parte de la región de la cuenca del río Grijalva. Este estado es también un importante productor de petróleo y gas natural, lo que impulsa gran parte de su economía. Además, Tabasco tiene una rica herencia cultural, con influencias de las civilizaciones olmeca y maya, visibles en sitios arqueológicos como La Venta. \nCon su clima cálido y húmedo, Tabasco ofrece un entorno natural impresionante y una cultura vibrante que atrae a visitantes de todo el mundo.',
2400000, 'tab', '24,578 km cuadrados', 1);

INSERT INTO ciudad (id, nombre, descripcion, tamanio, estado_id)
VALUES(1, 'villahermosa',
'Es el centro económico y cultural de la región. La ciudad está rodeada por los ríos Grijalva y Carrizal, lo que le confiere un paisaje natural impresionante y una abundancia de recursos hídricos1. Villahermosa es conocida por su clima cálido y húmedo, con temperaturas que pueden superar los 40°C en primavera. La ciudad combina modernidad y tradición, con una infraestructura urbana desarrollada y una rica herencia cultural. Entre sus principales atractivos se encuentran el Parque-Museo La Venta, que alberga esculturas olmecas, y el Museo Regional de Antropología Carlos Pellicer Cámara1. Además, Villahermosa es un importante centro de negocios debido a su proximidad a las zonas petroleras del estado.',
'80 km cuadrados', 27);
