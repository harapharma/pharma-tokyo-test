CREATE TABLE `customer` (
    `seq_id` int NOT NULL  AUTO_INCREMENT, -- �V�[�P���XID
    `customer_name` varchar(64) NOT NULL  , -- �ڋq��
    `xml_data` text   , -- XML�f�[�^
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- �X�V����

    PRIMARY KEY (
      `seq_id`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
