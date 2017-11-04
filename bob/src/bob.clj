(ns bob
   (:require [clojure.string :as str]))

(defn response-for [tell-me]
      (str/ends-with? (str tell-me) "?")) 

