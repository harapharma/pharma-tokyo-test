CREATE TABLE `data_element` (
    `seq_id` int NOT NULL  AUTO_INCREMENT, -- �V�[�P���XID
    `element` varchar(64) NOT NULL  , -- �v�f
    `value` varchar(128)   , -- �l
    `upto_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- �X�V����

    PRIMARY KEY (
      `seq_id`
    )
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
