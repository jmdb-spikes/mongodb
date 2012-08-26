(ns jmdb.spikes.mongodb.midje
  (:use [midje.sweet]))


(fact "addition has a unit element"
  (+ 12345 1) => 12345)
