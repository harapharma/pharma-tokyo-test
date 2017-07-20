CREATE TABLE `customer` (
    `seq_id` int NOT NULL  AUTO_INCREMENT, -- シーケンスID
    `customer_name` varchar(64) NOT NULL  , -- 顧客名
    `xml_data` text   , -- XMLデータ
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 更新日時

    PRIMARY KEY (
      `seq_id`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
