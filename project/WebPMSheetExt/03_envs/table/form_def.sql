CREATE TABLE `form_def` (
    `table_name` varchar(64) NOT NULL  , -- テーブル名
    `item_name` varchar(64) NOT NULL  , -- 項目名
    `item_label` varchar(64) NOT NULL  , -- 項目ラベル
    `type` varchar(16) NOT NULL  , -- 種類
    `row` int NOT NULL  , -- 行
    `col` int NOT NULL  , -- 列
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 更新日時

    PRIMARY KEY (
      `table_name`
    , `item_name`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
