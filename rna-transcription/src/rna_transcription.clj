(ns rna-transcription
  (:require [clojure.string :as str]))

(defn compl-nucleotide [argument]
  (cond
    (=  (str argument) "G") "C"
    (=  (str argument) "C") "G"
    (=  (str argument) "T") "A"
    (=  (str argument) "A") "U"
    :else (assert false)))
        

(defn to-rna [arg]
  (->> (seq arg)(remove nil? ,,,)(map compl-nucleotide ,,,)(str/join "" ,,,)))

