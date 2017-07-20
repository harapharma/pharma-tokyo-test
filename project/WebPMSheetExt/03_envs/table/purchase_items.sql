CREATE TABLE `purchase_items` (
    `seq_id` int NOT NULL  AUTO_INCREMENT, -- �V�[�P���XID
    `id_date` char(8) NOT NULL  , -- ID���t
    `id_no` char(3) NOT NULL  , -- ID�ԍ�
    `purchaser` varchar(64)   , -- �w����
    `purchase_date` date   , -- �w����
    `items` varchar(256)   , -- �w���i
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- �X�V����

    PRIMARY KEY (
      `seq_id`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
