CREATE TABLE `form_def` (
    `table_name` varchar(64) NOT NULL  , -- �e�[�u����
    `item_name` varchar(64) NOT NULL  , -- ���ږ�
    `item_label` varchar(64) NOT NULL  , -- ���ڃ��x��
    `type` varchar(16) NOT NULL  , -- ���
    `row` int NOT NULL  , -- �s
    `col` int NOT NULL  , -- ��
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- �X�V����

    PRIMARY KEY (
      `table_name`
    , `item_name`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
