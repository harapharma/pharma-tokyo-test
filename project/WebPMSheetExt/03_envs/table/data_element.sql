CREATE TABLE `data_element` (
    `seq_id` int NOT NULL  AUTO_INCREMENT, -- シーケンスID
    `element` varchar(64) NOT NULL  , -- 要素
    `value` varchar(128)   , -- 値
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 更新日時

    PRIMARY KEY (
      `seq_id`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
