CREATE TABLE `form_select` (
    `table_name` varchar(64) NOT NULL  , -- テーブル名
    `item_name` varchar(64) NOT NULL  , -- 項目名
    `value` smallint   , -- 値
    `label` varchar(64)   , -- ラベル
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 更新日時

    PRIMARY KEY (
      `table_name`
    , `item_name`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
