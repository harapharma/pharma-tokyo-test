CREATE TABLE `purchase_items` (
    `seq_id` int NOT NULL  AUTO_INCREMENT, -- シーケンスID
    `id_date` char(8) NOT NULL  , -- ID日付
    `id_no` char(3) NOT NULL  , -- ID番号
    `purchaser` varchar(64)   , -- 購入者
    `purchase_date` date   , -- 購入日
    `items` varchar(256)   , -- 購入品
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 更新日時

    PRIMARY KEY (
      `seq_id`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
