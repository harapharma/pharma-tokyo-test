CREATE TABLE `form_select` (
    `table_name` varchar(64) NOT NULL  , -- �e�[�u����
    `item_name` varchar(64) NOT NULL  , -- ���ږ�
    `value` smallint   , -- �l
    `label` varchar(64)   , -- ���x��
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- �X�V����

    PRIMARY KEY (
      `table_name`
    , `item_name`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
