package com.ruoyi.common.core.utils;

import static java.lang.String.format;

public class UniqueUtils {

    private final static SnowFlakeIdGenerator idGenerator = new SnowFlakeIdGenerator(1);

    /**
     * 获取唯一主键
     * @return
     */
    public static Long getKey() {
        return idGenerator.generateLongId();
    }

    private static class SnowFlakeIdGenerator {
        private static final long workerIdBits = 4L;
        public static final long maxWorkerId = -1L ^ (-1L << workerIdBits);
        private static final long sequenceBits = 10L;
        private static final long workerIdShift = sequenceBits;
        private static final long timestampLeftShift = sequenceBits + workerIdBits;
        public static final long sequenceMask = -1L ^ (-1L << sequenceBits);

        // private static final long twepoch = 1361753741828L;
        // (2016 - 1970) * 365 * 24 * 60 * 60 * 1000
        // private long twepoch = 1450656000000L;
        // 2016-2-14 11:08
        private long twepoch = 1455419300740L;
        private final long workerId;
        private long sequence = 0L;
        private long lastTimestamp = -1L;

        public SnowFlakeIdGenerator(final long workerId) {
            super();

            if ((workerId > this.maxWorkerId) || (workerId < 0)) {
                throw new IllegalArgumentException(format(
                        "worker Id can't be greater than %d or less than 0",
                        this.maxWorkerId));
            }

            this.workerId = workerId;
        }

        public long generateLongId() {
            return this.nextId();
        }

        public String generateStringId() {
            return Long.toString(this.nextId());
        }


        public synchronized long nextId() {
            long timestamp = this.timeGen();

            if (this.lastTimestamp == timestamp) {
                this.sequence = (this.sequence + 1) & this.sequenceMask;

                if (this.sequence == 0) {
                    //System.out.println("###########" + sequenceMask);

                    timestamp = this.tilNextMillis(this.lastTimestamp);
                }
            } else {
                this.sequence = 0;
            }

            if (timestamp < this.lastTimestamp) {
                try {
                    throw new Exception(
                            format(
                                    "Clock moved backwards.  Refusing to generate id for %d milliseconds",
                                    this.lastTimestamp - timestamp));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            this.lastTimestamp = timestamp;

            long nextId = ((timestamp - twepoch) << timestampLeftShift)
                    | (this.workerId << this.workerIdShift) | (this.sequence);

            // //System.out.println("timestamp:" + timestamp + ",timestampLeftShift:"

            // + timestampLeftShift + ",nextId:" + nextId + ",workerId:"

            // + workerId + ",sequence:" + sequence);
            return nextId;
        }

        private long tilNextMillis(final long lastTimestamp) {
            long timestamp = this.timeGen();

            while (timestamp <= lastTimestamp) {
                timestamp = this.timeGen();
            }

            return timestamp;
        }

        private long timeGen() {
            return System.currentTimeMillis();
        }

        public void setTwepoch(long twepoch) {
            this.twepoch = twepoch;
        }

    }

}
